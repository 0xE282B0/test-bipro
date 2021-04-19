package net.bipro.namespace;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2021-03-19T16:27:27.585+01:00
 * Generated source version: 3.3.2
 *
 */
@WebService(targetNamespace = "http://www.bipro.net/namespace", name = "GewerbeServicePortType")
@XmlSeeAlso({net.bipro.namespace.nachrichten.ObjectFactory.class, net.bipro.namespace.kapitalanlage.basis.ObjectFactory.class, net.bipro.namespace.versicherung.produktmodell.ObjectFactory.class, net.bipro.namespace.sachen.ObjectFactory.class, net.bipro.namespace.produktmodell.ObjectFactory.class, net.bipro.namespace.versicherung.produktmodell.komposit.ObjectFactory.class, net.bipro.namespace.datentypen.ObjectFactory.class, net.bipro.namespace.versicherung.sach.ObjectFactory.class, net.bipro.namespace.partner.ObjectFactory.class, net.bipro.namespace.sepa.ObjectFactory.class, net.bipro.namespace.gevo.ObjectFactory.class, net.bipro.namespace.basis.ObjectFactory.class, net.bipro.namespace.versicherung.haftpflicht.ObjectFactory.class, net.bipro.namespace.fragen.ObjectFactory.class, net.bipro.namespace.versicherung.tarifierung.ObjectFactory.class, net.bipro.namespace.allgemein.ObjectFactory.class, net.bipro.namespace.vertrag.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00", comments = "Apache CXF 3.3.2")
public interface GewerbeServicePortType {

    /**
     * Ermittlung / Beantwortung von Risikofragen für die Antragsanforderung
     */
    @WebMethod(action = "urn:getOrderQuestions")
    @RequestWrapper(localName = "getOrderQuestions", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOrderQuestions")
    @ResponseWrapper(localName = "getOrderQuestionsResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOrderQuestionsResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTOrderResponse getOrderQuestions(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTOrderRequest request
    ) throws BiproException;

    /**
     * Einreichen eines Versicherungsantrages bzw. einer Angebotsanforderung (Invitatiomodell) mit unvollständigen Daten
     */
    @WebMethod(action = "urn:setOrder")
    @RequestWrapper(localName = "setOrder", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.SetOrder")
    @ResponseWrapper(localName = "setOrderResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.SetOrderResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTOrderResponse setOrder(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTOrderRequest request
    ) throws BiproException;

    /**
     * Ermittlung / Beantwortung von Risikofragen für die Vorschlagsanforderung
     */
    @WebMethod(action = "urn:getOfferQuestions")
    @RequestWrapper(localName = "getOfferQuestions", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOfferQuestions")
    @ResponseWrapper(localName = "getOfferQuestionsResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOfferQuestionsResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTOfferResponse getOfferQuestions(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTOfferRequest request
    ) throws BiproException;

    /**
     * Einreichen eines Versicherungsantrages bzw. einer Angebotsanforderung (Invitatiomodell) mit vollständigen Daten
     */
    @WebMethod(action = "urn:setOrderQualified")
    @RequestWrapper(localName = "setOrderQualified", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.SetOrderQualified")
    @ResponseWrapper(localName = "setOrderQualifiedResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.SetOrderQualifiedResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTOrderResponse setOrderQualified(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTOrderRequest request
    ) throws BiproException;

    /**
     * Antragsanforderung eines Versicherungsantrages bzw. einer Angebotsanforderung (Invitatiomodell) mit unvollständigen Daten
     */
    @WebMethod(action = "urn:getOrder")
    @RequestWrapper(localName = "getOrder", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOrder")
    @ResponseWrapper(localName = "getOrderResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOrderResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTOrderResponse getOrder(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTOrderRequest request
    ) throws BiproException;

    /**
     * Ermittlung eines Tarifierungsergebnisses
     */
    @WebMethod(action = "urn:getQuote")
    @RequestWrapper(localName = "getQuote", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetQuote")
    @ResponseWrapper(localName = "getQuoteResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetQuoteResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTQuoteResponse getQuote(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTQuoteRequest request
    ) throws BiproException;

    /**
     * Anforderung eines Versicherungsantrages bzw. einer Angebotsanforderung (Invitatiomodell) mit vollständigen Daten
     */
    @WebMethod(action = "urn:getOrderQualified")
    @RequestWrapper(localName = "getOrderQualified", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOrderQualified")
    @ResponseWrapper(localName = "getOrderQualifiedResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOrderQualifiedResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTOrderResponse getOrderQualified(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTOrderRequest request
    ) throws BiproException;

    /**
     * Download bereitgestellter PDF-Dokumente nach dem Einreichen eines Versicherungsantrages bzw. einer Angebotsanforderung
     */
    @WebMethod(action = "urn:getFile")
    @RequestWrapper(localName = "getFile", targetNamespace = "http://www.bipro.net/namespace/allgemein", className = "net.bipro.namespace.allgemein.GetFile")
    @ResponseWrapper(localName = "getFileResponse", targetNamespace = "http://www.bipro.net/namespace/allgemein", className = "net.bipro.namespace.allgemein.GetFileResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/allgemein")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.allgemein.CTFileResponse getFile(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/allgemein")
        net.bipro.namespace.allgemein.CTFileRequest request
    ) throws BiproException;

    /**
     * Anforderung eines Versicherungsvorschlages
     */
    @WebMethod(action = "urn:getOffer")
    @RequestWrapper(localName = "getOffer", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOffer")
    @ResponseWrapper(localName = "getOfferResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetOfferResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTOfferResponse getOffer(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTOfferRequest request
    ) throws BiproException;

    /**
     * Ermittlung / Beantwortung von Risikofragen für die Tarifierung
     */
    @WebMethod(action = "urn:getQuoteQuestions")
    @RequestWrapper(localName = "getQuoteQuestions", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetQuoteQuestions")
    @ResponseWrapper(localName = "getQuoteQuestionsResponse", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung", className = "net.bipro.namespace.versicherung.tarifierung.GetQuoteQuestionsResponse")
    @WebResult(name = "Response", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2021-03-19T16:27:27.585+01:00")
    public net.bipro.namespace.versicherung.tarifierung.CTQuoteResponse getQuoteQuestions(

        @WebParam(name = "Request", targetNamespace = "http://www.bipro.net/namespace/versicherung/tarifierung")
        net.bipro.namespace.versicherung.tarifierung.CTQuoteRequest request
    ) throws BiproException;
}