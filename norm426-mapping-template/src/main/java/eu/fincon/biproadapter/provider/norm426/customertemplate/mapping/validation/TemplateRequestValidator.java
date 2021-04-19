package eu.fincon.biproadapter.provider.norm426.customertemplate.mapping.validation;

import eu.fincon.biproadapter.provider.common.genericapi.BiproVersion;
import eu.fincon.biproadapter.provider.common.genericapi.exception.RequestValidationException;
import eu.fincon.biproadapter.provider.common.genericapi.util.CommonBiproObjectFactory;
import eu.fincon.biproadapter.provider.norm420common.api.enumerations.Norm420CommonBiproStatusMessages;
import eu.fincon.biproadapter.provider.norm420common.api.example.validation.ValidationUtils;
import eu.fincon.biproadapter.provider.norm420common.api.validation.RequestValidation;
import net.bipro.namespace.allgemein.CTFileRequest;
import net.bipro.namespace.allgemein.CTFileResponse;
import net.bipro.namespace.versicherung.tarifierung.CTOfferRequest;
import net.bipro.namespace.versicherung.tarifierung.CTOrderRequest;
import net.bipro.namespace.versicherung.tarifierung.CTQuoteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TemplateRequestValidator implements RequestValidation {

    private ValidationUtils validationUtils; // Do not use this in production

    @Autowired
    public TemplateRequestValidator(BiproVersion biproVersion, CommonBiproObjectFactory biproObjectFactory) {
        this.validationUtils = new ValidationUtils(biproVersion, biproObjectFactory);
    }

    @Override
    public void validateGetQuote(CTQuoteRequest request) throws RequestValidationException {

        validationUtils.partialValidationOfGetQuote(request.getTarifierung().getVerkaufsprodukt(),
                ValidationUtils.PossibleResponsesForPartialValidationOfGetQuote.CT_QUOTE_RESPONSE);
    }

    @Override
    public void validateGetOffer(CTOfferRequest request) throws RequestValidationException {

        validationUtils.partialValidationOfGetQuote(request.getAngebot().getVerkaufsprodukt(),
                ValidationUtils.PossibleResponsesForPartialValidationOfGetQuote.CT_OFFER_RESPONSE);

        // Creation and delivery of all documents possible?
    }

    @Override
    public void validateGetOrder(CTOrderRequest request) throws RequestValidationException {
        validationUtils.partialValidationOfGetQuote(request.getAntrag().getVerkaufsprodukt(),
                ValidationUtils.PossibleResponsesForPartialValidationOfGetQuote.CT_ORDER_RESPONSE);

        // Creation and delivery of all documents possible?
    }

    @Override
    public void validateGetOrderQualified(CTOrderRequest request) throws RequestValidationException {
        validationUtils.partialValidationOfGetQuote(request.getAntrag().getVerkaufsprodukt(),
                ValidationUtils.PossibleResponsesForPartialValidationOfGetQuote.CT_ORDER_RESPONSE);

        // Validation of setOrderQualified done?
        // Creation and delivery of all documents possible?
    }

    @Override
    public void validateSetOrder(CTOrderRequest request) throws RequestValidationException {

        validationUtils.validateVorgangsnummerAvailability(request);
        // Have all the signatures been set?

        // Decide if the submission of electronic documents should be allowed.
        /*
         * If the Service Consumer transmit XML data which should have been
         * previously filled out in PDF documents in TP42004, the process must
         * be aborted.
         */
        /*
         * If "Vorgangsnummer" was transmitted, consistency with the data from
         * TP42004 must be ensured. Otherwise validation of TP42001 has to be
         * done.
         */
        /*
         * Responsibility must be taken to ensure that Xml-data and
         * PDF-documents are consistent.
         */
        // Execute tariffing and check whether "Beitrag" matches.
        // Creation and delivery of all documents possible?

    }

    @Override
    public void validateSetOrderQualified(CTOrderRequest request) throws RequestValidationException {
        validateSetOrder(request);
        // Have all the signatures been set?

        // Data complete and correct?
        // Decide if the submission of electronic documents should be allowed.
        /*
         * If "Vorgangsnummer" was transmitted, consistency with the data from
         * TP42004 must be ensured. Otherwise validation of TP42001 has to be
         * done.
         */
        /*
         * If "Vorgangsnummer" was transmitted, consistency with the data from
         * TP42005 must be ensured. Otherwise validation of TP42001 has to be
         * done.
         */
        /*
         * Responsibility must be taken to ensure that Xml-data and
         * PDF-documents are consistent.
         */
        /*
         * The documents must not contain any form fields that can be filled in
         * in the documents.
         */
        // Execute tariffing and check whether "Beitrag" matches.
        // Creation and delivery of all documents possible?
    }

    @Override
    public void validateGetQuoteQuestions(CTQuoteRequest request) throws RequestValidationException {
        // All relevant data transmitted?
    }

    @Override
    public void validateGetOfferQuestions(CTOfferRequest request) throws RequestValidationException {
        // All relevant data transmitted?
    }

    @Override
    public void validateGetOrderQuestions(CTOrderRequest request) throws RequestValidationException {
        // All relevant data transmitted?
    }

    @Override
    public void validateGetFile(CTFileRequest request) throws RequestValidationException {
        /*
         * Validate if the transmitted identification sign can find a file and
         * is still available.
         */
        if (!request.getDatei().get(0).getDateiID().equals(ValidationUtils.getTestingId())) {
            validationUtils.buildResponseAndThrowException(new CTFileResponse(),
                    Norm420CommonBiproStatusMessages.DOCUMENT_NOT_AVAILABLE);
        }
    }
}
