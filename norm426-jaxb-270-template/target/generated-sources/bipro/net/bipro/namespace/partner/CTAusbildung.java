
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEAusbildungsart;
import net.bipro.namespace.datentypen.STEBildungsabschluss;
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
 * Das Objekt kann nur einmal geliefert werden. Abgebildet wird hier deshalb der höchste erzielte Abschluss.
 * 
 * <p>Java class for CT_Ausbildung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Ausbildung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_Ausbildungsart"/&gt;
 *         &lt;element name="Fachrichtung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Abschlussdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Firmeneintritt" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="HoechsterAbschluss" type="{http://www.bipro.net/namespace/datentypen}STE_Bildungsabschluss" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Ausbildung", propOrder = {
    "artID",
    "fachrichtung",
    "abschlussdatum",
    "firmeneintritt",
    "hoechsterAbschluss"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAusbildung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEAusbildungsart artID;
    @XmlElement(name = "Fachrichtung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String fachrichtung;
    @XmlElement(name = "Abschlussdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String abschlussdatum;
    @XmlElement(name = "Firmeneintritt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String firmeneintritt;
    @XmlElement(name = "HoechsterAbschluss")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEBildungsabschluss hoechsterAbschluss;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STEAusbildungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEAusbildungsart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEAusbildungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STEAusbildungsart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the fachrichtung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getFachrichtung() {
        return fachrichtung;
    }

    /**
     * Sets the value of the fachrichtung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFachrichtung(String value) {
        this.fachrichtung = value;
    }

    /**
     * Gets the value of the abschlussdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getAbschlussdatum() {
        return abschlussdatum;
    }

    /**
     * Sets the value of the abschlussdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAbschlussdatum(String value) {
        this.abschlussdatum = value;
    }

    /**
     * Gets the value of the firmeneintritt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getFirmeneintritt() {
        return firmeneintritt;
    }

    /**
     * Sets the value of the firmeneintritt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFirmeneintritt(String value) {
        this.firmeneintritt = value;
    }

    /**
     * Gets the value of the hoechsterAbschluss property.
     * 
     * @return
     *     possible object is
     *     {@link STEBildungsabschluss }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEBildungsabschluss getHoechsterAbschluss() {
        return hoechsterAbschluss;
    }

    /**
     * Sets the value of the hoechsterAbschluss property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEBildungsabschluss }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHoechsterAbschluss(STEBildungsabschluss value) {
        this.hoechsterAbschluss = value;
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
        final CTAusbildung that = ((CTAusbildung) object);
        {
            STEAusbildungsart lhsArtID;
            lhsArtID = this.getArtID();
            STEAusbildungsart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsFachrichtung;
            lhsFachrichtung = this.getFachrichtung();
            String rhsFachrichtung;
            rhsFachrichtung = that.getFachrichtung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fachrichtung", lhsFachrichtung), LocatorUtils.property(thatLocator, "fachrichtung", rhsFachrichtung), lhsFachrichtung, rhsFachrichtung, (this.fachrichtung!= null), (that.fachrichtung!= null))) {
                return false;
            }
        }
        {
            String lhsAbschlussdatum;
            lhsAbschlussdatum = this.getAbschlussdatum();
            String rhsAbschlussdatum;
            rhsAbschlussdatum = that.getAbschlussdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abschlussdatum", lhsAbschlussdatum), LocatorUtils.property(thatLocator, "abschlussdatum", rhsAbschlussdatum), lhsAbschlussdatum, rhsAbschlussdatum, (this.abschlussdatum!= null), (that.abschlussdatum!= null))) {
                return false;
            }
        }
        {
            String lhsFirmeneintritt;
            lhsFirmeneintritt = this.getFirmeneintritt();
            String rhsFirmeneintritt;
            rhsFirmeneintritt = that.getFirmeneintritt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firmeneintritt", lhsFirmeneintritt), LocatorUtils.property(thatLocator, "firmeneintritt", rhsFirmeneintritt), lhsFirmeneintritt, rhsFirmeneintritt, (this.firmeneintritt!= null), (that.firmeneintritt!= null))) {
                return false;
            }
        }
        {
            STEBildungsabschluss lhsHoechsterAbschluss;
            lhsHoechsterAbschluss = this.getHoechsterAbschluss();
            STEBildungsabschluss rhsHoechsterAbschluss;
            rhsHoechsterAbschluss = that.getHoechsterAbschluss();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hoechsterAbschluss", lhsHoechsterAbschluss), LocatorUtils.property(thatLocator, "hoechsterAbschluss", rhsHoechsterAbschluss), lhsHoechsterAbschluss, rhsHoechsterAbschluss, (this.hoechsterAbschluss!= null), (that.hoechsterAbschluss!= null))) {
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
            STEAusbildungsart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theFachrichtung;
            theFachrichtung = this.getFachrichtung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fachrichtung", theFachrichtung), currentHashCode, theFachrichtung, (this.fachrichtung!= null));
        }
        {
            String theAbschlussdatum;
            theAbschlussdatum = this.getAbschlussdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abschlussdatum", theAbschlussdatum), currentHashCode, theAbschlussdatum, (this.abschlussdatum!= null));
        }
        {
            String theFirmeneintritt;
            theFirmeneintritt = this.getFirmeneintritt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firmeneintritt", theFirmeneintritt), currentHashCode, theFirmeneintritt, (this.firmeneintritt!= null));
        }
        {
            STEBildungsabschluss theHoechsterAbschluss;
            theHoechsterAbschluss = this.getHoechsterAbschluss();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hoechsterAbschluss", theHoechsterAbschluss), currentHashCode, theHoechsterAbschluss, (this.hoechsterAbschluss!= null));
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
        if (draftCopy instanceof CTAusbildung) {
            final CTAusbildung copy = ((CTAusbildung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEAusbildungsart sourceArtID;
                    sourceArtID = this.getArtID();
                    STEAusbildungsart copyArtID = ((STEAusbildungsart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean fachrichtungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fachrichtung!= null));
                if (fachrichtungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFachrichtung;
                    sourceFachrichtung = this.getFachrichtung();
                    String copyFachrichtung = ((String) strategy.copy(LocatorUtils.property(locator, "fachrichtung", sourceFachrichtung), sourceFachrichtung, (this.fachrichtung!= null)));
                    copy.setFachrichtung(copyFachrichtung);
                } else {
                    if (fachrichtungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fachrichtung = null;
                    }
                }
            }
            {
                Boolean abschlussdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abschlussdatum!= null));
                if (abschlussdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAbschlussdatum;
                    sourceAbschlussdatum = this.getAbschlussdatum();
                    String copyAbschlussdatum = ((String) strategy.copy(LocatorUtils.property(locator, "abschlussdatum", sourceAbschlussdatum), sourceAbschlussdatum, (this.abschlussdatum!= null)));
                    copy.setAbschlussdatum(copyAbschlussdatum);
                } else {
                    if (abschlussdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abschlussdatum = null;
                    }
                }
            }
            {
                Boolean firmeneintrittShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firmeneintritt!= null));
                if (firmeneintrittShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFirmeneintritt;
                    sourceFirmeneintritt = this.getFirmeneintritt();
                    String copyFirmeneintritt = ((String) strategy.copy(LocatorUtils.property(locator, "firmeneintritt", sourceFirmeneintritt), sourceFirmeneintritt, (this.firmeneintritt!= null)));
                    copy.setFirmeneintritt(copyFirmeneintritt);
                } else {
                    if (firmeneintrittShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firmeneintritt = null;
                    }
                }
            }
            {
                Boolean hoechsterAbschlussShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hoechsterAbschluss!= null));
                if (hoechsterAbschlussShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEBildungsabschluss sourceHoechsterAbschluss;
                    sourceHoechsterAbschluss = this.getHoechsterAbschluss();
                    STEBildungsabschluss copyHoechsterAbschluss = ((STEBildungsabschluss) strategy.copy(LocatorUtils.property(locator, "hoechsterAbschluss", sourceHoechsterAbschluss), sourceHoechsterAbschluss, (this.hoechsterAbschluss!= null)));
                    copy.setHoechsterAbschluss(copyHoechsterAbschluss);
                } else {
                    if (hoechsterAbschlussShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hoechsterAbschluss = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAusbildung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung withArtID(STEAusbildungsart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung withFachrichtung(String value) {
        setFachrichtung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung withAbschlussdatum(String value) {
        setAbschlussdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung withFirmeneintritt(String value) {
        setFirmeneintritt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung withHoechsterAbschluss(STEBildungsabschluss value) {
        setHoechsterAbschluss(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAusbildung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
