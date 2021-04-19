
package net.bipro.namespace.versicherung.sach;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.bipro.namespace.versicherung.sach package. 
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

    private final static QName _CTGebaeudeEinflussfaktorenBetriebsart_QNAME = new QName("http://www.bipro.net/namespace/versicherung/sach", "Betriebsart");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.bipro.namespace.versicherung.sach
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CTAufbewahrungsart }
     * 
     */
    public CTAufbewahrungsart createCTAufbewahrungsart() {
        return new CTAufbewahrungsart();
    }

    /**
     * Create an instance of {@link CTGebaeudeEinflussfaktoren }
     * 
     */
    public CTGebaeudeEinflussfaktoren createCTGebaeudeEinflussfaktoren() {
        return new CTGebaeudeEinflussfaktoren();
    }

    /**
     * Create an instance of {@link CTGebaeudezustand }
     * 
     */
    public CTGebaeudezustand createCTGebaeudezustand() {
        return new CTGebaeudezustand();
    }

    /**
     * Create an instance of {@link CTGewerbeEinflussfaktoren }
     * 
     */
    public CTGewerbeEinflussfaktoren createCTGewerbeEinflussfaktoren() {
        return new CTGewerbeEinflussfaktoren();
    }

    /**
     * Create an instance of {@link CTHausratEinflussfaktoren }
     * 
     */
    public CTHausratEinflussfaktoren createCTHausratEinflussfaktoren() {
        return new CTHausratEinflussfaktoren();
    }

    /**
     * Create an instance of {@link CTMangel }
     * 
     */
    public CTMangel createCTMangel() {
        return new CTMangel();
    }

    /**
     * Create an instance of {@link CTSicherung }
     * 
     */
    public CTSicherung createCTSicherung() {
        return new CTSicherung();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.bipro.net/namespace/versicherung/sach", name = "Betriebsart", scope = CTGebaeudeEinflussfaktoren.class)
    public JAXBElement<List<String>> createCTGebaeudeEinflussfaktorenBetriebsart(List<String> value) {
        return new JAXBElement<List<String>>(_CTGebaeudeEinflussfaktorenBetriebsart_QNAME, ((Class) List.class), CTGebaeudeEinflussfaktoren.class, ((List<String> ) value));
    }

}
