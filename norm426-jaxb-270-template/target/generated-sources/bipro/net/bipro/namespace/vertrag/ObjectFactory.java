
package net.bipro.namespace.vertrag;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.bipro.namespace.vertrag package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.bipro.namespace.vertrag
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CTBearbeitendeStelle }
     * 
     */
    public CTBearbeitendeStelle createCTBearbeitendeStelle() {
        return new CTBearbeitendeStelle();
    }

    /**
     * Create an instance of {@link CTVertrag }
     * 
     */
    public CTVertrag createCTVertrag() {
        return new CTVertrag();
    }

    /**
     * Create an instance of {@link CTVorNebenVertrag }
     * 
     */
    public CTVorNebenVertrag createCTVorNebenVertrag() {
        return new CTVorNebenVertrag();
    }

    /**
     * Create an instance of {@link CTZusaetzlicheVertragsdaten }
     * 
     */
    public CTZusaetzlicheVertragsdaten createCTZusaetzlicheVertragsdaten() {
        return new CTZusaetzlicheVertragsdaten();
    }

}
