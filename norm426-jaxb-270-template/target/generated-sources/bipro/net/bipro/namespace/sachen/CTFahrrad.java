
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
 * Ein Fahrrad ist ein zumeist zweirädriges (einspuriges) Landfahrzeug, das mit Muskelkraft durch das Treten von Pedalen angetrieben wird.
 * 
 * <p>Java class for CT_Fahrrad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Fahrrad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rahmennummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Fahrradcodierung" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
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
@XmlType(name = "CT_Fahrrad", propOrder = {
    "rahmennummer",
    "fahrradcodierung",
    "eigentuemer"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTFahrrad
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Rahmennummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String rahmennummer;
    @XmlElement(name = "Fahrradcodierung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String fahrradcodierung;
    @XmlElement(name = "Eigentuemer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTEigentuemer> eigentuemer;

    /**
     * Gets the value of the rahmennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getRahmennummer() {
        return rahmennummer;
    }

    /**
     * Sets the value of the rahmennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setRahmennummer(String value) {
        this.rahmennummer = value;
    }

    /**
     * Gets the value of the fahrradcodierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getFahrradcodierung() {
        return fahrradcodierung;
    }

    /**
     * Sets the value of the fahrradcodierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFahrradcodierung(String value) {
        this.fahrradcodierung = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
        final CTFahrrad that = ((CTFahrrad) object);
        {
            String lhsRahmennummer;
            lhsRahmennummer = this.getRahmennummer();
            String rhsRahmennummer;
            rhsRahmennummer = that.getRahmennummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rahmennummer", lhsRahmennummer), LocatorUtils.property(thatLocator, "rahmennummer", rhsRahmennummer), lhsRahmennummer, rhsRahmennummer, (this.rahmennummer!= null), (that.rahmennummer!= null))) {
                return false;
            }
        }
        {
            String lhsFahrradcodierung;
            lhsFahrradcodierung = this.getFahrradcodierung();
            String rhsFahrradcodierung;
            rhsFahrradcodierung = that.getFahrradcodierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fahrradcodierung", lhsFahrradcodierung), LocatorUtils.property(thatLocator, "fahrradcodierung", rhsFahrradcodierung), lhsFahrradcodierung, rhsFahrradcodierung, (this.fahrradcodierung!= null), (that.fahrradcodierung!= null))) {
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theRahmennummer;
            theRahmennummer = this.getRahmennummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rahmennummer", theRahmennummer), currentHashCode, theRahmennummer, (this.rahmennummer!= null));
        }
        {
            String theFahrradcodierung;
            theFahrradcodierung = this.getFahrradcodierung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fahrradcodierung", theFahrradcodierung), currentHashCode, theFahrradcodierung, (this.fahrradcodierung!= null));
        }
        {
            List<CTEigentuemer> theEigentuemer;
            theEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eigentuemer", theEigentuemer), currentHashCode, theEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())));
        }
        return currentHashCode;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof CTFahrrad) {
            final CTFahrrad copy = ((CTFahrrad) draftCopy);
            {
                Boolean rahmennummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rahmennummer!= null));
                if (rahmennummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRahmennummer;
                    sourceRahmennummer = this.getRahmennummer();
                    String copyRahmennummer = ((String) strategy.copy(LocatorUtils.property(locator, "rahmennummer", sourceRahmennummer), sourceRahmennummer, (this.rahmennummer!= null)));
                    copy.setRahmennummer(copyRahmennummer);
                } else {
                    if (rahmennummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rahmennummer = null;
                    }
                }
            }
            {
                Boolean fahrradcodierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fahrradcodierung!= null));
                if (fahrradcodierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFahrradcodierung;
                    sourceFahrradcodierung = this.getFahrradcodierung();
                    String copyFahrradcodierung = ((String) strategy.copy(LocatorUtils.property(locator, "fahrradcodierung", sourceFahrradcodierung), sourceFahrradcodierung, (this.fahrradcodierung!= null)));
                    copy.setFahrradcodierung(copyFahrradcodierung);
                } else {
                    if (fahrradcodierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fahrradcodierung = null;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFahrrad();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withRahmennummer(String value) {
        setRahmennummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withFahrradcodierung(String value) {
        setFahrradcodierung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withEigentuemer(CTEigentuemer... values) {
        if (values!= null) {
            for (CTEigentuemer value: values) {
                getEigentuemer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withEigentuemer(Collection<CTEigentuemer> values) {
        if (values!= null) {
            getEigentuemer().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFahrrad withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
