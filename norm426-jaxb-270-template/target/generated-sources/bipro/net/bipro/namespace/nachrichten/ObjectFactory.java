
package net.bipro.namespace.nachrichten;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.bipro.namespace.nachrichten package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.bipro.namespace.nachrichten
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BiproException }
     * 
     */
    public BiproException createBiproException() {
        return new BiproException();
    }

    /**
     * Create an instance of {@link CTProzessFehler }
     * 
     */
    public CTProzessFehler createCTProzessFehler() {
        return new CTProzessFehler();
    }

    /**
     * Create an instance of {@link CTStatus }
     * 
     */
    public CTStatus createCTStatus() {
        return new CTStatus();
    }

    /**
     * Create an instance of {@link CTMeldung }
     * 
     */
    public CTMeldung createCTMeldung() {
        return new CTMeldung();
    }

}
