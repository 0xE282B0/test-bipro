
package net.bipro.namespace.sachen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
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
 * Ein Gegenstand, der im BiPRO-Datenmodell nicht durch eine eigenständige Klasse spezifiziert ist.
 * 
 * <p>Java class for CT_SonstigerGegenstand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_SonstigerGegenstand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifikationsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Eigentuemer" type="{http://www.bipro.net/namespace/sachen}CT_Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_SonstigerGegenstand", propOrder = {
    "identifikationsnummer",
    "eigentuemer"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTSonstigerGegenstand
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Identifikationsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String identifikationsnummer;
    @XmlElement(name = "Eigentuemer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTEigentuemer> eigentuemer;

    /**
     * Gets the value of the identifikationsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getIdentifikationsnummer() {
        return identifikationsnummer;
    }

    /**
     * Sets the value of the identifikationsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setIdentifikationsnummer(String value) {
        this.identifikationsnummer = value;
    }

    /**
     * Gets the value of the eigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTEigentuemer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTEigentuemer> getEigentuemer() {
        if (eigentuemer == null) {
            eigentuemer = new ArrayList<CTEigentuemer>();
        }
        return this.eigentuemer;
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
        final CTSonstigerGegenstand that = ((CTSonstigerGegenstand) object);
        {
            String lhsIdentifikationsnummer;
            lhsIdentifikationsnummer = this.getIdentifikationsnummer();
            String rhsIdentifikationsnummer;
            rhsIdentifikationsnummer = that.getIdentifikationsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifikationsnummer", lhsIdentifikationsnummer), LocatorUtils.property(thatLocator, "identifikationsnummer", rhsIdentifikationsnummer), lhsIdentifikationsnummer, rhsIdentifikationsnummer, (this.identifikationsnummer!= null), (that.identifikationsnummer!= null))) {
                return false;
            }
        }
        {
            List<CTEigentuemer> lhsEigentuemer;
            lhsEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
            List<CTEigentuemer> rhsEigentuemer;
            rhsEigentuemer = (((that.eigentuemer!= null)&&(!that.eigentuemer.isEmpty()))?that.getEigentuemer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eigentuemer", lhsEigentuemer), LocatorUtils.property(thatLocator, "eigentuemer", rhsEigentuemer), lhsEigentuemer, rhsEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())), ((that.eigentuemer!= null)&&(!that.eigentuemer.isEmpty())))) {
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
            String theIdentifikationsnummer;
            theIdentifikationsnummer = this.getIdentifikationsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifikationsnummer", theIdentifikationsnummer), currentHashCode, theIdentifikationsnummer, (this.identifikationsnummer!= null));
        }
        {
            List<CTEigentuemer> theEigentuemer;
            theEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eigentuemer", theEigentuemer), currentHashCode, theEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())));
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
        if (draftCopy instanceof CTSonstigerGegenstand) {
            final CTSonstigerGegenstand copy = ((CTSonstigerGegenstand) draftCopy);
            {
                Boolean identifikationsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identifikationsnummer!= null));
                if (identifikationsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIdentifikationsnummer;
                    sourceIdentifikationsnummer = this.getIdentifikationsnummer();
                    String copyIdentifikationsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "identifikationsnummer", sourceIdentifikationsnummer), sourceIdentifikationsnummer, (this.identifikationsnummer!= null)));
                    copy.setIdentifikationsnummer(copyIdentifikationsnummer);
                } else {
                    if (identifikationsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identifikationsnummer = null;
                    }
                }
            }
            {
                Boolean eigentuemerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())));
                if (eigentuemerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTEigentuemer> sourceEigentuemer;
                    sourceEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
                    @SuppressWarnings("unchecked")
                    List<CTEigentuemer> copyEigentuemer = ((List<CTEigentuemer> ) strategy.copy(LocatorUtils.property(locator, "eigentuemer", sourceEigentuemer), sourceEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))));
                    copy.eigentuemer = null;
                    if (copyEigentuemer!= null) {
                        List<CTEigentuemer> uniqueEigentuemerl = copy.getEigentuemer();
                        uniqueEigentuemerl.addAll(copyEigentuemer);
                    }
                } else {
                    if (eigentuemerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eigentuemer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTSonstigerGegenstand();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withIdentifikationsnummer(String value) {
        setIdentifikationsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withEigentuemer(CTEigentuemer... values) {
        if (values!= null) {
            for (CTEigentuemer value: values) {
                getEigentuemer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withEigentuemer(Collection<CTEigentuemer> values) {
        if (values!= null) {
            getEigentuemer().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSonstigerGegenstand withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
