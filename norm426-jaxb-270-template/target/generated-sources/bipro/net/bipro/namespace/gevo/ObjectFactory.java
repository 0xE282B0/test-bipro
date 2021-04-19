
package net.bipro.namespace.gevo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.bipro.namespace.gevo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.bipro.namespace.gevo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CTDokumentanforderung }
     * 
     */
    public CTDokumentanforderung createCTDokumentanforderung() {
        return new CTDokumentanforderung();
    }

    /**
     * Create an instance of {@link CTDokumentinformation }
     * 
     */
    public CTDokumentinformation createCTDokumentinformation() {
        return new CTDokumentinformation();
    }

    /**
     * Create an instance of {@link CTDokumentversand }
     * 
     */
    public CTDokumentversand createCTDokumentversand() {
        return new CTDokumentversand();
    }

}
