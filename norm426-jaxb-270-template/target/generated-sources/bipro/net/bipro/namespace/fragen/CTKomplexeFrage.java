
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
 * Eine komplexe Frage ist eine inhaltliche Klammer um mehrere einfache Fragen. Z.B. kann ein Provider zwei einfache Fragen &bdquo;Art der Vorerkrankung&ldquo; und &bdquo;Behandelnder Arzt&ldquo; in einer komplexen Frage zusammenfassen. Komplexe Fragen werden deshalb nicht direkt, sondern indirekt über die enthaltenen einfachen Fragen beantwortet.
 * 
 * <p>Java class for CT_KomplexeFrage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_KomplexeFrage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_Frage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FachlicheID" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="EinfacheFrage" type="{http://www.bipro.net/namespace/fragen}CT_EinfacheFrage" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_KomplexeFrage", propOrder = {
    "fachlicheID",
    "text",
    "einfacheFrage"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTKomplexeFrage
    extends CTFrage
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "FachlicheID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String fachlicheID;
    @XmlElement(name = "Text")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String text;
    @XmlElement(name = "EinfacheFrage", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTEinfacheFrage> einfacheFrage;

    /**
     * Gets the value of the fachlicheID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFachlicheID() {
        return fachlicheID;
    }

    /**
     * Sets the value of the fachlicheID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFachlicheID(String value) {
        this.fachlicheID = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the einfacheFrage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the einfacheFrage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEinfacheFrage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTEinfacheFrage }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTEinfacheFrage> getEinfacheFrage() {
        if (einfacheFrage == null) {
            einfacheFrage = new ArrayList<CTEinfacheFrage>();
        }
        return this.einfacheFrage;
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
        final CTKomplexeFrage that = ((CTKomplexeFrage) object);
        {
            String lhsFachlicheID;
            lhsFachlicheID = this.getFachlicheID();
            String rhsFachlicheID;
            rhsFachlicheID = that.getFachlicheID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fachlicheID", lhsFachlicheID), LocatorUtils.property(thatLocator, "fachlicheID", rhsFachlicheID), lhsFachlicheID, rhsFachlicheID, (this.fachlicheID!= null), (that.fachlicheID!= null))) {
                return false;
            }
        }
        {
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText, (this.text!= null), (that.text!= null))) {
                return false;
            }
        }
        {
            List<CTEinfacheFrage> lhsEinfacheFrage;
            lhsEinfacheFrage = (((this.einfacheFrage!= null)&&(!this.einfacheFrage.isEmpty()))?this.getEinfacheFrage():null);
            List<CTEinfacheFrage> rhsEinfacheFrage;
            rhsEinfacheFrage = (((that.einfacheFrage!= null)&&(!that.einfacheFrage.isEmpty()))?that.getEinfacheFrage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einfacheFrage", lhsEinfacheFrage), LocatorUtils.property(thatLocator, "einfacheFrage", rhsEinfacheFrage), lhsEinfacheFrage, rhsEinfacheFrage, ((this.einfacheFrage!= null)&&(!this.einfacheFrage.isEmpty())), ((that.einfacheFrage!= null)&&(!that.einfacheFrage.isEmpty())))) {
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
            String theFachlicheID;
            theFachlicheID = this.getFachlicheID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fachlicheID", theFachlicheID), currentHashCode, theFachlicheID, (this.fachlicheID!= null));
        }
        {
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText, (this.text!= null));
        }
        {
            List<CTEinfacheFrage> theEinfacheFrage;
            theEinfacheFrage = (((this.einfacheFrage!= null)&&(!this.einfacheFrage.isEmpty()))?this.getEinfacheFrage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einfacheFrage", theEinfacheFrage), currentHashCode, theEinfacheFrage, ((this.einfacheFrage!= null)&&(!this.einfacheFrage.isEmpty())));
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
        if (draftCopy instanceof CTKomplexeFrage) {
            final CTKomplexeFrage copy = ((CTKomplexeFrage) draftCopy);
            {
                Boolean fachlicheIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fachlicheID!= null));
                if (fachlicheIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFachlicheID;
                    sourceFachlicheID = this.getFachlicheID();
                    String copyFachlicheID = ((String) strategy.copy(LocatorUtils.property(locator, "fachlicheID", sourceFachlicheID), sourceFachlicheID, (this.fachlicheID!= null)));
                    copy.setFachlicheID(copyFachlicheID);
                } else {
                    if (fachlicheIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fachlicheID = null;
                    }
                }
            }
            {
                Boolean textShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.text!= null));
                if (textShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceText;
                    sourceText = this.getText();
                    String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText, (this.text!= null)));
                    copy.setText(copyText);
                } else {
                    if (textShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.text = null;
                    }
                }
            }
            {
                Boolean einfacheFrageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.einfacheFrage!= null)&&(!this.einfacheFrage.isEmpty())));
                if (einfacheFrageShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTEinfacheFrage> sourceEinfacheFrage;
                    sourceEinfacheFrage = (((this.einfacheFrage!= null)&&(!this.einfacheFrage.isEmpty()))?this.getEinfacheFrage():null);
                    @SuppressWarnings("unchecked")
                    List<CTEinfacheFrage> copyEinfacheFrage = ((List<CTEinfacheFrage> ) strategy.copy(LocatorUtils.property(locator, "einfacheFrage", sourceEinfacheFrage), sourceEinfacheFrage, ((this.einfacheFrage!= null)&&(!this.einfacheFrage.isEmpty()))));
                    copy.einfacheFrage = null;
                    if (copyEinfacheFrage!= null) {
                        List<CTEinfacheFrage> uniqueEinfacheFragel = copy.getEinfacheFrage();
                        uniqueEinfacheFragel.addAll(copyEinfacheFrage);
                    }
                } else {
                    if (einfacheFrageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einfacheFrage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKomplexeFrage();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withFachlicheID(String value) {
        setFachlicheID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withText(String value) {
        setText(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withEinfacheFrage(CTEinfacheFrage... values) {
        if (values!= null) {
            for (CTEinfacheFrage value: values) {
                getEinfacheFrage().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withEinfacheFrage(Collection<CTEinfacheFrage> values) {
        if (values!= null) {
            getEinfacheFrage().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withErlaeuterung(String value) {
        setErlaeuterung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withOptional(Boolean value) {
        setOptional(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withBedingung(CTBedingung value) {
        setBedingung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withWiederholbar(Boolean value) {
        setWiederholbar(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withMaxAntworten(Integer value) {
        setMaxAntworten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withOrdnungsnummer(Integer value) {
        setOrdnungsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withAnzeigenummer(String value) {
        setAnzeigenummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKomplexeFrage withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
