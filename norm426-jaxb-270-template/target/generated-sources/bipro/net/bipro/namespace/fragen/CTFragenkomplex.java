
package net.bipro.namespace.fragen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEFragenkomplexArt;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Inhaltlich zusammenhängende Menge von Fragen und Gliederungselementen, z.B. &bdquo;Fragen zum Beruf&ldquo; oder &bdquo;Gesundheitsfragen&ldquo;. Welche Fragen wie zu Fragenkomplexen zusammengefasst werden, entscheidet der Provider in seiner Fragenmodellierung. Z.B. kann  ein Provider &bdquo;Fragen zum Beruf&ldquo; und &bdquo;Fragen zur Gesundheit&ldquo; in getrennten Fragenkomplexen liefern. Ein anderer Provider kann diese Fragen in einem Fragenkomplex &bdquo;Fragen zum Antrag&ldquo; liefern.
 * Ein Fragenkomplex enthält immer alle für den jeweiligen Context relevanten Fragen. D.h. auch, wenn ein Provider sukzessive Folgefragen abhängig von den gegebenen Antworten nachliefert ("Ping Pong"), enthält der Fragenkomplex immer alle zu diesem Zeitpunkt als relevant erkannten Fragen, d.h. es erfolgt immer eine Volllieferung der Fragen, keine Delta-Lieferung zusätzlicher Fragen.
 * 
 * <p>Java class for CT_Fragenkomplex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Fragenkomplex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_FragenkomplexArt"/&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text060"/&gt;
 *         &lt;element name="Element" type="{http://www.bipro.net/namespace/fragen}CT_Element" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Fragenkomplex", propOrder = {
    "artID",
    "bezeichnung",
    "element"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTFragenkomplex
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEFragenkomplexArt artID;
    @XmlElement(name = "Bezeichnung", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "Element", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTElement> element;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STEFragenkomplexArt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEFragenkomplexArt getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEFragenkomplexArt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STEFragenkomplexArt value) {
        this.artID = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTElement }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTElement> getElement() {
        if (element == null) {
            element = new ArrayList<CTElement>();
        }
        return this.element;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CTFragenkomplex that = ((CTFragenkomplex) object);
        {
            STEFragenkomplexArt lhsArtID;
            lhsArtID = this.getArtID();
            STEFragenkomplexArt rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsBezeichnung;
            lhsBezeichnung = this.getBezeichnung();
            String rhsBezeichnung;
            rhsBezeichnung = that.getBezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezeichnung", lhsBezeichnung), LocatorUtils.property(thatLocator, "bezeichnung", rhsBezeichnung), lhsBezeichnung, rhsBezeichnung, (this.bezeichnung!= null), (that.bezeichnung!= null))) {
                return false;
            }
        }
        {
            List<CTElement> lhsElement;
            lhsElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
            List<CTElement> rhsElement;
            rhsElement = (((that.element!= null)&&(!that.element.isEmpty()))?that.getElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "element", lhsElement), LocatorUtils.property(thatLocator, "element", rhsElement), lhsElement, rhsElement, ((this.element!= null)&&(!this.element.isEmpty())), ((that.element!= null)&&(!that.element.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            STEFragenkomplexArt theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            List<CTElement> theElement;
            theElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "element", theElement), currentHashCode, theElement, ((this.element!= null)&&(!this.element.isEmpty())));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof CTFragenkomplex) {
            final CTFragenkomplex copy = ((CTFragenkomplex) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEFragenkomplexArt sourceArtID;
                    sourceArtID = this.getArtID();
                    STEFragenkomplexArt copyArtID = ((STEFragenkomplexArt) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean bezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bezeichnung!= null));
                if (bezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBezeichnung;
                    sourceBezeichnung = this.getBezeichnung();
                    String copyBezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "bezeichnung", sourceBezeichnung), sourceBezeichnung, (this.bezeichnung!= null)));
                    copy.setBezeichnung(copyBezeichnung);
                } else {
                    if (bezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezeichnung = null;
                    }
                }
            }
            {
                Boolean elementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.element!= null)&&(!this.element.isEmpty())));
                if (elementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTElement> sourceElement;
                    sourceElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
                    @SuppressWarnings("unchecked")
                    List<CTElement> copyElement = ((List<CTElement> ) strategy.copy(LocatorUtils.property(locator, "element", sourceElement), sourceElement, ((this.element!= null)&&(!this.element.isEmpty()))));
                    copy.element = null;
                    if (copyElement!= null) {
                        List<CTElement> uniqueElementl = copy.getElement();
                        uniqueElementl.addAll(copyElement);
                    }
                } else {
                    if (elementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.element = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFragenkomplex();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFragenkomplex withArtID(STEFragenkomplexArt value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFragenkomplex withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFragenkomplex withElement(CTElement... values) {
        if (values!= null) {
            for (CTElement value: values) {
                getElement().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFragenkomplex withElement(Collection<CTElement> values) {
        if (values!= null) {
            getElement().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFragenkomplex withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFragenkomplex withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
