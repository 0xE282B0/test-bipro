
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STAusweistyp;
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
 * Legitimationsdaten (Ausweis, Reisepass, etc.)
 * 
 * <p>Java class for CT_Ausweis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Ausweis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ausweistyp" type="{http://www.bipro.net/namespace/datentypen}ST_Ausweistyp"/&gt;
 *         &lt;element name="AusstellendeBehoerde" type="{http://www.bipro.net/namespace/datentypen}ST_Text080" minOccurs="0"/&gt;
 *         &lt;element name="Ausweisnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="GueltigBis" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Ausstellungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Ausweis", propOrder = {
    "ausweistyp",
    "ausstellendeBehoerde",
    "ausweisnummer",
    "gueltigBis",
    "ausstellungsdatum"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAusweis
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Ausweistyp", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STAusweistyp ausweistyp;
    @XmlElement(name = "AusstellendeBehoerde")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String ausstellendeBehoerde;
    @XmlElement(name = "Ausweisnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String ausweisnummer;
    @XmlElement(name = "GueltigBis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String gueltigBis;
    @XmlElement(name = "Ausstellungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String ausstellungsdatum;

    /**
     * Gets the value of the ausweistyp property.
     * 
     * @return
     *     possible object is
     *     {@link STAusweistyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STAusweistyp getAusweistyp() {
        return ausweistyp;
    }

    /**
     * Sets the value of the ausweistyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAusweistyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAusweistyp(STAusweistyp value) {
        this.ausweistyp = value;
    }

    /**
     * Gets the value of the ausstellendeBehoerde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getAusstellendeBehoerde() {
        return ausstellendeBehoerde;
    }

    /**
     * Sets the value of the ausstellendeBehoerde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAusstellendeBehoerde(String value) {
        this.ausstellendeBehoerde = value;
    }

    /**
     * Gets the value of the ausweisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getAusweisnummer() {
        return ausweisnummer;
    }

    /**
     * Sets the value of the ausweisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAusweisnummer(String value) {
        this.ausweisnummer = value;
    }

    /**
     * Gets the value of the gueltigBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Sets the value of the gueltigBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGueltigBis(String value) {
        this.gueltigBis = value;
    }

    /**
     * Gets the value of the ausstellungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getAusstellungsdatum() {
        return ausstellungsdatum;
    }

    /**
     * Sets the value of the ausstellungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAusstellungsdatum(String value) {
        this.ausstellungsdatum = value;
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
        final CTAusweis that = ((CTAusweis) object);
        {
            STAusweistyp lhsAusweistyp;
            lhsAusweistyp = this.getAusweistyp();
            STAusweistyp rhsAusweistyp;
            rhsAusweistyp = that.getAusweistyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausweistyp", lhsAusweistyp), LocatorUtils.property(thatLocator, "ausweistyp", rhsAusweistyp), lhsAusweistyp, rhsAusweistyp, (this.ausweistyp!= null), (that.ausweistyp!= null))) {
                return false;
            }
        }
        {
            String lhsAusstellendeBehoerde;
            lhsAusstellendeBehoerde = this.getAusstellendeBehoerde();
            String rhsAusstellendeBehoerde;
            rhsAusstellendeBehoerde = that.getAusstellendeBehoerde();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstellendeBehoerde", lhsAusstellendeBehoerde), LocatorUtils.property(thatLocator, "ausstellendeBehoerde", rhsAusstellendeBehoerde), lhsAusstellendeBehoerde, rhsAusstellendeBehoerde, (this.ausstellendeBehoerde!= null), (that.ausstellendeBehoerde!= null))) {
                return false;
            }
        }
        {
            String lhsAusweisnummer;
            lhsAusweisnummer = this.getAusweisnummer();
            String rhsAusweisnummer;
            rhsAusweisnummer = that.getAusweisnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausweisnummer", lhsAusweisnummer), LocatorUtils.property(thatLocator, "ausweisnummer", rhsAusweisnummer), lhsAusweisnummer, rhsAusweisnummer, (this.ausweisnummer!= null), (that.ausweisnummer!= null))) {
                return false;
            }
        }
        {
            String lhsGueltigBis;
            lhsGueltigBis = this.getGueltigBis();
            String rhsGueltigBis;
            rhsGueltigBis = that.getGueltigBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigBis", lhsGueltigBis), LocatorUtils.property(thatLocator, "gueltigBis", rhsGueltigBis), lhsGueltigBis, rhsGueltigBis, (this.gueltigBis!= null), (that.gueltigBis!= null))) {
                return false;
            }
        }
        {
            String lhsAusstellungsdatum;
            lhsAusstellungsdatum = this.getAusstellungsdatum();
            String rhsAusstellungsdatum;
            rhsAusstellungsdatum = that.getAusstellungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausstellungsdatum", lhsAusstellungsdatum), LocatorUtils.property(thatLocator, "ausstellungsdatum", rhsAusstellungsdatum), lhsAusstellungsdatum, rhsAusstellungsdatum, (this.ausstellungsdatum!= null), (that.ausstellungsdatum!= null))) {
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
            STAusweistyp theAusweistyp;
            theAusweistyp = this.getAusweistyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausweistyp", theAusweistyp), currentHashCode, theAusweistyp, (this.ausweistyp!= null));
        }
        {
            String theAusstellendeBehoerde;
            theAusstellendeBehoerde = this.getAusstellendeBehoerde();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausstellendeBehoerde", theAusstellendeBehoerde), currentHashCode, theAusstellendeBehoerde, (this.ausstellendeBehoerde!= null));
        }
        {
            String theAusweisnummer;
            theAusweisnummer = this.getAusweisnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausweisnummer", theAusweisnummer), currentHashCode, theAusweisnummer, (this.ausweisnummer!= null));
        }
        {
            String theGueltigBis;
            theGueltigBis = this.getGueltigBis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigBis", theGueltigBis), currentHashCode, theGueltigBis, (this.gueltigBis!= null));
        }
        {
            String theAusstellungsdatum;
            theAusstellungsdatum = this.getAusstellungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausstellungsdatum", theAusstellungsdatum), currentHashCode, theAusstellungsdatum, (this.ausstellungsdatum!= null));
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
        if (draftCopy instanceof CTAusweis) {
            final CTAusweis copy = ((CTAusweis) draftCopy);
            {
                Boolean ausweistypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausweistyp!= null));
                if (ausweistypShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAusweistyp sourceAusweistyp;
                    sourceAusweistyp = this.getAusweistyp();
                    STAusweistyp copyAusweistyp = ((STAusweistyp) strategy.copy(LocatorUtils.property(locator, "ausweistyp", sourceAusweistyp), sourceAusweistyp, (this.ausweistyp!= null)));
                    copy.setAusweistyp(copyAusweistyp);
                } else {
                    if (ausweistypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausweistyp = null;
                    }
                }
            }
            {
                Boolean ausstellendeBehoerdeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstellendeBehoerde!= null));
                if (ausstellendeBehoerdeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAusstellendeBehoerde;
                    sourceAusstellendeBehoerde = this.getAusstellendeBehoerde();
                    String copyAusstellendeBehoerde = ((String) strategy.copy(LocatorUtils.property(locator, "ausstellendeBehoerde", sourceAusstellendeBehoerde), sourceAusstellendeBehoerde, (this.ausstellendeBehoerde!= null)));
                    copy.setAusstellendeBehoerde(copyAusstellendeBehoerde);
                } else {
                    if (ausstellendeBehoerdeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstellendeBehoerde = null;
                    }
                }
            }
            {
                Boolean ausweisnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausweisnummer!= null));
                if (ausweisnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAusweisnummer;
                    sourceAusweisnummer = this.getAusweisnummer();
                    String copyAusweisnummer = ((String) strategy.copy(LocatorUtils.property(locator, "ausweisnummer", sourceAusweisnummer), sourceAusweisnummer, (this.ausweisnummer!= null)));
                    copy.setAusweisnummer(copyAusweisnummer);
                } else {
                    if (ausweisnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausweisnummer = null;
                    }
                }
            }
            {
                Boolean gueltigBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigBis!= null));
                if (gueltigBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGueltigBis;
                    sourceGueltigBis = this.getGueltigBis();
                    String copyGueltigBis = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigBis", sourceGueltigBis), sourceGueltigBis, (this.gueltigBis!= null)));
                    copy.setGueltigBis(copyGueltigBis);
                } else {
                    if (gueltigBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigBis = null;
                    }
                }
            }
            {
                Boolean ausstellungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausstellungsdatum!= null));
                if (ausstellungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAusstellungsdatum;
                    sourceAusstellungsdatum = this.getAusstellungsdatum();
                    String copyAusstellungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "ausstellungsdatum", sourceAusstellungsdatum), sourceAusstellungsdatum, (this.ausstellungsdatum!= null)));
                    copy.setAusstellungsdatum(copyAusstellungsdatum);
                } else {
                    if (ausstellungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausstellungsdatum = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAusweis();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusweis withAusweistyp(STAusweistyp value) {
        setAusweistyp(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusweis withAusstellendeBehoerde(String value) {
        setAusstellendeBehoerde(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusweis withAusweisnummer(String value) {
        setAusweisnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusweis withGueltigBis(String value) {
        setGueltigBis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusweis withAusstellungsdatum(String value) {
        setAusstellungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusweis withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusweis withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
