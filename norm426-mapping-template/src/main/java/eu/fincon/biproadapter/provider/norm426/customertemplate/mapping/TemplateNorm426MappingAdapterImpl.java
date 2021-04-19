package eu.fincon.biproadapter.provider.norm426.customertemplate.mapping;

import static eu.fincon.biproadapter.provider.norm420common.api.enumerations.Norm420CommonBiproStatusMessages.ACKNOWLEDGEMENT;
import static eu.fincon.biproadapter.provider.norm420common.api.enumerations.Norm420CommonBiproStatusMessages.SUCCESSFUL_FILE_RESPONSE;
import static eu.fincon.biproadapter.provider.norm420common.api.enumerations.Norm420CommonBiproStatusMessages.SUCCESSFUL_TARIFFING;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.NotImplementedException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eu.fincon.biproadapter.provider.common.genericapi.BiproVersion;
import eu.fincon.biproadapter.provider.common.genericapi.util.CommonBiproObjectFactory;
import eu.fincon.biproadapter.provider.norm420common.api.Norm420CommonMappingAdapter;
import eu.fincon.biproadapter.provider.norm420common.api.example.mappingadapter.MappingAdapterUtils;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.BrokerData;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.Coverage;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.Data;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.Main;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.Pet;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.Product;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.RequestData;
import eu.fincon.biproadapter.provider.norm426.customertemplate.dataModel.RiskParameter;
import net.bipro.namespace.allgemein.CTBetrag;
import net.bipro.namespace.allgemein.CTDatei;
import net.bipro.namespace.allgemein.CTFileRequest;
import net.bipro.namespace.allgemein.CTFileResponse;
import net.bipro.namespace.gevo.CTDokumentanforderung;
import net.bipro.namespace.produktmodell.CTVerkaufsprodukt;
import net.bipro.namespace.sachen.CTTier;
import net.bipro.namespace.versicherung.tarifierung.CTAngebot;
import net.bipro.namespace.versicherung.tarifierung.CTOfferRequest;
import net.bipro.namespace.versicherung.tarifierung.CTOfferResponse;
import net.bipro.namespace.versicherung.tarifierung.CTOrderRequest;
import net.bipro.namespace.versicherung.tarifierung.CTOrderResponse;
import net.bipro.namespace.versicherung.tarifierung.CTQuoteRequest;
import net.bipro.namespace.versicherung.tarifierung.CTQuoteResponse;
import net.bipro.namespace.versicherung.tarifierung.CTTarifierung;

/**
 * This class is a template implementation for the
 * {@link Norm420CommonMappingAdapter}
 */
@Component
public class TemplateNorm426MappingAdapterImpl implements Norm420CommonMappingAdapter {

    private BiproVersion biproVersion;
    private CommonBiproObjectFactory biproObjectFactory;
    private MappingAdapterUtils mappingAdapterUtils;

    @Autowired
    public TemplateNorm426MappingAdapterImpl(BiproVersion biproVersion, CommonBiproObjectFactory biproObjectFactory) {
        this.biproVersion = biproVersion;
        this.biproObjectFactory = biproObjectFactory;
        this.mappingAdapterUtils = new MappingAdapterUtils();
    }

    @Override
    public CTQuoteResponse getQuote(CTQuoteRequest request) {
        CTQuoteResponse response = new CTQuoteResponse();
        response.setBiPROVersion(biproVersion.getBiproVersionAsString());
        response.setStatus(biproObjectFactory.createStatusWithMessage(SUCCESSFUL_TARIFFING));
       
        
        RequestData rq=(RequestData) setAaasData(request);
        Main main=new Main();
        String reponseJson=main.requestJson(rq);
        JSONObject jsonObject = new JSONObject(reponseJson);
        String total = jsonObject.getString("price");
       
        System.out.println("Total Amount for Insurance: "+total);

        // Create CTTarifierung and add CTVerkaufsprodukt
        CTTarifierung tarifierung = new CTTarifierung();
        tarifierung.getVerkaufsprodukt().add(mappingAdapterUtils.createStandardSalesProduct());
        CTBetrag betrag=new CTBetrag();
        betrag.withBetrag(new BigDecimal(total));
        tarifierung.getVerkaufsprodukt().get(0).getProdukt().get(0).getBeitrag().get(0).setBetrag(betrag);
        response.setTarifierung(tarifierung);
  
        return response;
    }

    @Override
    public CTOfferResponse getOffer(CTOfferRequest request) {
        CTOfferResponse response = new CTOfferResponse();
        response.setBiPROVersion(biproVersion.getBiproVersionAsString());
        response.setStatus(biproObjectFactory.createStatusWithMessage(SUCCESSFUL_TARIFFING));

        // Create CTAngebot with CTDatei
        CTAngebot angebot = new CTAngebot();
        angebot.getVerkaufsprodukt().add(mappingAdapterUtils.createStandardSalesProduct());
        // Reference between CTDokumentanforderung & CTDatei
        for (CTDokumentanforderung dokumentanforderung : request.getAngebot().getDokumentanforderung()) {
            String referenceId = UUID.randomUUID().toString();
            dokumentanforderung.setDateiID(referenceId);
            CTDatei datei = mappingAdapterUtils.createDateiByTestPDF();
            datei.setDateiID(referenceId);
            angebot.getDatei().add(datei);
        }
        response.setAngebot(angebot);

        return response;
    }

    @Override
    public CTOrderResponse getOrder(CTOrderRequest request) {
        CTOrderResponse response = new CTOrderResponse();
        response.setBiPROVersion(biproVersion.getBiproVersionAsString());
        response.setStatus(biproObjectFactory.createStatusWithMessage(SUCCESSFUL_TARIFFING));
        response.setAntrag(mappingAdapterUtils.createAntragWithDatei(request));
        return response;
    }

    @Override
    public CTOrderResponse getOrderQualified(CTOrderRequest request) {
        throw new NotImplementedException("getOrderQualified is not implemented.");
    }

    @Override
    public CTOrderResponse setOrder(CTOrderRequest request) {
        CTOrderResponse response = new CTOrderResponse();
        response.setBiPROVersion(biproVersion.getBiproVersionAsString());
        response.setStatus(biproObjectFactory.createStatusWithMessage(ACKNOWLEDGEMENT, true));
        response.setAntrag(mappingAdapterUtils.createAntragWithDatei(request));
        // Save all data at this point
        return response;
    }

    @Override
    public CTOrderResponse setOrderQualified(CTOrderRequest request) {
        throw new NotImplementedException("setOrderQualified is not implemented.");
    }

    @Override
    public CTQuoteResponse getQuoteQuestions(CTQuoteRequest request) {
        throw new NotImplementedException("getQuoteQuestions is not implemented.");
    }

    @Override
    public CTOfferResponse getOfferQuestions(CTOfferRequest request) {
        throw new NotImplementedException("getOfferQuestions is not implemented.");
    }

    @Override
    public CTOrderResponse getOrderQuestions(CTOrderRequest request) {
        throw new NotImplementedException("getOrderQuestions is not implemented.");
    }

    @Override
    public CTFileResponse getFile(CTFileRequest request) {
        CTFileResponse response = new CTFileResponse();
        response.setBiPROVersion(biproVersion.getBiproVersionAsString());
        response.setStatus(biproObjectFactory.createStatusWithMessage(SUCCESSFUL_FILE_RESPONSE));
        response.getDatei().add(mappingAdapterUtils.createDateiByTestPDF());
        return response;
    }
    
    
    
	private  Object setAaasData(CTQuoteRequest request)
	{

		
		 List<CTVerkaufsprodukt> productL= request.getTarifierung().getVerkaufsprodukt();
	      
		System.out.println( productL.get(0).getProdukt().get(0).getBezeichnung());//Designation
		System.out.println(productL.get(0).getProdukt().get(0).getGewuenschteZahlungsweise());//DesiredPaymentMethod
		System.out.println( productL.get(0).getProdukt().get(0).getSparte().toString());//Division
		System.out.println( productL.get(0).getProdukt().get(0).getKennung());//FightBreed

		   
		 
		 CTTier cTier=(CTTier) request.getTarifierung().getGegenstand().get(0);
		 CTTier cTier2=(CTTier) request.getTarifierung().getGegenstand().get(1);
		 
		 System.out.println(request.getTarifierung().getGegenstand().get(0).getGegenstandID());//ItemID
		 System.out.println(cTier.getArtID());
		 System.out.println(cTier.getHunderasse().get(0).getValue().get(0));
		 System.out.println(cTier.isKampfhund());

		Data data = new Data();
		Product product=new Product();
		product.setType(productL.get(0).getProdukt().get(0).getSparte().toString());
		product.setOtherFeature("NotSpecified");


		Pet dogPet=new Pet();
		dogPet.setBreed(cTier.getHunderasse().get(0).getValue().get(0));
		dogPet.setId(Integer.parseInt(cTier.getArtID().value()));

		Pet dogPet2=new Pet();
		dogPet2.setBreed(cTier2.getHunderasse().get(0).getValue().get(0));
		dogPet2.setId(Integer.parseInt(cTier2.getArtID().value()));

		List<Pet> petList=new ArrayList<Pet>();
		petList.add(dogPet);
		petList.add(dogPet2);


		List<RiskParameter> riskParameterList=new ArrayList<RiskParameter>();
		RiskParameter riskParameter=new RiskParameter();
		riskParameter.setNumberOfPets(request.getTarifierung().getGegenstand().size());
		riskParameter.setPet(petList);
		riskParameterList.add(riskParameter);

		List<Product> list=new ArrayList<Product>(); 
		list.add(product);
		data.setAppId("paas");
		data.setCorrelationId("paas_session123");
		BrokerData brokerData=new BrokerData(); 
		brokerData.setProduct(product);

		brokerData.setRiskParameters(riskParameter);


		List<Coverage> coverageList=new ArrayList<Coverage>(); 
		Coverage coverage=new Coverage();
		coverage.setDeductibleMinAmount(200);
		coverage.setDuration("2years");
		coverage.setPaymentFrequency(productL.get(0).getProdukt().get(0).getGewuenschteZahlungsweise().toString());
		coverageList.add(coverage);
		brokerData.setCoverage(coverage);

		data.setBrokerData(null);
		List<BrokerData> brokerDataList=new ArrayList<BrokerData>(); 
		brokerDataList.add(brokerData);
		data.setBrokerData(brokerData);
		ArrayList<Data> dataList=new ArrayList();
		dataList.add(data);
		Object obj=new Object();
		obj=dataList;
		RequestData dataCollection=new RequestData();
		dataCollection.setRequestDataList(dataList);
		
		return dataCollection;
		
	}

}
