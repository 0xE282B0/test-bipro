
package net.bipro.namespace.kapitalanlage.basis;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STVereinbarung;
import net.bipro.namespace.datentypen.STVereinbarungKategorieID;
import net.bipro.namespace.datentypen.STVereinbarungsbedingung;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.datentypen.STWerteinheit;
import net.bipro.namespace.datentypen.STZahlungsweise;
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
 * Vereinbarung der Vertragspartner über Erträge und Kosten einer Kapitalanlage (z. B. Zins, Gebühr, Bonus).
 * 
 * <p>Java class for CT_Vereinbarung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Vereinbarung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KategorieID" type="{http://www.bipro.net/namespace/datentypen}ST_VereinbarungKategorieID"/&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Vereinbarung" minOccurs="0"/&gt;
 *         &lt;element name="Wert" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl"/&gt;
 *         &lt;element name="Werteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit"/&gt;
 *         &lt;element name="Waehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel" minOccurs="0"/&gt;
 *         &lt;element name="Zahlungsweise" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsweise"/&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Bedingung" type="{http://www.bipro.net/namespace/datentypen}ST_Vereinbarungsbedingung" minOccurs="0"/&gt;
 *         &lt;element name="UntererGrenzwert" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Grenzwert" minOccurs="0"/&gt;
 *         &lt;element name="Zeitraum" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="ObererGrenzwert" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Grenzwert" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Vereinbarung", propOrder = {
    "kategorieID",
    "artID",
    "wert",
    "werteinheit",
    "waehrung",
    "zahlungsweise",
    "bezeichnung",
    "bedingung",
    "untererGrenzwert",
    "zeitraum",
    "obererGrenzwert"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVereinbarung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "KategorieID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVereinbarungKategorieID kategorieID;
    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVereinbarung artID;
    @XmlElement(name = "Wert", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal wert;
    @XmlElement(name = "Werteinheit", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit werteinheit;
    @XmlElement(name = "Waehrung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel waehrung;
    @XmlElement(name = "Zahlungsweise", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsweise zahlungsweise;
    @XmlElement(name = "Bezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "Bedingung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVereinbarungsbedingung bedingung;
    @XmlElement(name = "UntererGrenzwert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTGrenzwert untererGrenzwert;
    @XmlElement(name = "Zeitraum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum zeitraum;
    @XmlElement(name = "ObererGrenzwert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTGrenzwert obererGrenzwert;

    /**
     * Gets the value of the kategorieID property.
     * 
     * @return
     *     possible object is
     *     {@link STVereinbarungKategorieID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVereinbarungKategorieID getKategorieID() {
        return kategorieID;
    }

    /**
     * Sets the value of the kategorieID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVereinbarungKategorieID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKategorieID(STVereinbarungKategorieID value) {
        this.kategorieID = value;
    }

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STVereinbarung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVereinbarung getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVereinbarung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STVereinbarung value) {
        this.artID = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWert(BigDecimal value) {
        this.wert = value;
    }

    /**
     * Gets the value of the werteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getWerteinheit() {
        return werteinheit;
    }

    /**
     * Sets the value of the werteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWerteinheit(STWerteinheit value) {
        this.werteinheit = value;
    }

    /**
     * Gets the value of the waehrung property.
     * 
     * @return
     *     possible object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWaehrungsschluessel getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWaehrung(STWaehrungsschluessel value) {
        this.waehrung = value;
    }

    /**
     * Gets the value of the zahlungsweise property.
     * 
     * @return
     *     possible object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STZahlungsweise getZahlungsweise() {
        return zahlungsweise;
    }

    /**
     * Sets the value of the zahlungsweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZahlungsweise(STZahlungsweise value) {
        this.zahlungsweise = value;
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
     * Gets the value of the bedingung property.
     * 
     * @return
     *     possible object is
     *     {@link STVereinbarungsbedingung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVereinbarungsbedingung getBedingung() {
        return bedingung;
    }

    /**
     * Sets the value of the bedingung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVereinbarungsbedingung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBedingung(STVereinbarungsbedingung value) {
        this.bedingung = value;
    }

    /**
     * Gets the value of the untererGrenzwert property.
     * 
     * @return
     *     possible object is
     *     {@link CTGrenzwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrenzwert getUntererGrenzwert() {
        return untererGrenzwert;
    }

    /**
     * Sets the value of the untererGrenzwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGrenzwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUntererGrenzwert(CTGrenzwert value) {
        this.untererGrenzwert = value;
    }

    /**
     * Gets the value of the zeitraum property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getZeitraum() {
        return zeitraum;
    }

    /**
     * Sets the value of the zeitraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZeitraum(CTZeitraum value) {
        this.zeitraum = value;
    }

    /**
     * Gets the value of the obererGrenzwert property.
     * 
     * @return
     *     possible object is
     *     {@link CTGrenzwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrenzwert getObererGrenzwert() {
        return obererGrenzwert;
    }

    /**
     * Sets the value of the obererGrenzwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGrenzwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setObererGrenzwert(CTGrenzwert value) {
        this.obererGrenzwert = value;
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
        final CTVereinbarung that = ((CTVereinbarung) object);
        {
            STVereinbarungKategorieID lhsKategorieID;
            lhsKategorieID = this.getKategorieID();
            STVereinbarungKategorieID rhsKategorieID;
            rhsKategorieID = that.getKategorieID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kategorieID", lhsKategorieID), LocatorUtils.property(thatLocator, "kategorieID", rhsKategorieID), lhsKategorieID, rhsKategorieID, (this.kategorieID!= null), (that.kategorieID!= null))) {
                return false;
            }
        }
        {
            STVereinbarung lhsArtID;
            lhsArtID = this.getArtID();
            STVereinbarung rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWert;
            lhsWert = this.getWert();
            BigDecimal rhsWert;
            rhsWert = that.getWert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wert", lhsWert), LocatorUtils.property(thatLocator, "wert", rhsWert), lhsWert, rhsWert, (this.wert!= null), (that.wert!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsWerteinheit;
            lhsWerteinheit = this.getWerteinheit();
            STWerteinheit rhsWerteinheit;
            rhsWerteinheit = that.getWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "werteinheit", lhsWerteinheit), LocatorUtils.property(thatLocator, "werteinheit", rhsWerteinheit), lhsWerteinheit, rhsWerteinheit, (this.werteinheit!= null), (that.werteinheit!= null))) {
                return false;
            }
        }
        {
            STWaehrungsschluessel lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            STWaehrungsschluessel rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung, (this.waehrung!= null), (that.waehrung!= null))) {
                return false;
            }
        }
        {
            STZahlungsweise lhsZahlungsweise;
            lhsZahlungsweise = this.getZahlungsweise();
            STZahlungsweise rhsZahlungsweise;
            rhsZahlungsweise = that.getZahlungsweise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zahlungsweise", lhsZahlungsweise), LocatorUtils.property(thatLocator, "zahlungsweise", rhsZahlungsweise), lhsZahlungsweise, rhsZahlungsweise, (this.zahlungsweise!= null), (that.zahlungsweise!= null))) {
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
            STVereinbarungsbedingung lhsBedingung;
            lhsBedingung = this.getBedingung();
            STVereinbarungsbedingung rhsBedingung;
            rhsBedingung = that.getBedingung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedingung", lhsBedingung), LocatorUtils.property(thatLocator, "bedingung", rhsBedingung), lhsBedingung, rhsBedingung, (this.bedingung!= null), (that.bedingung!= null))) {
                return false;
            }
        }
        {
            CTGrenzwert lhsUntererGrenzwert;
            lhsUntererGrenzwert = this.getUntererGrenzwert();
            CTGrenzwert rhsUntererGrenzwert;
            rhsUntererGrenzwert = that.getUntererGrenzwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "untererGrenzwert", lhsUntererGrenzwert), LocatorUtils.property(thatLocator, "untererGrenzwert", rhsUntererGrenzwert), lhsUntererGrenzwert, rhsUntererGrenzwert, (this.untererGrenzwert!= null), (that.untererGrenzwert!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsZeitraum;
            lhsZeitraum = this.getZeitraum();
            CTZeitraum rhsZeitraum;
            rhsZeitraum = that.getZeitraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeitraum", lhsZeitraum), LocatorUtils.property(thatLocator, "zeitraum", rhsZeitraum), lhsZeitraum, rhsZeitraum, (this.zeitraum!= null), (that.zeitraum!= null))) {
                return false;
            }
        }
        {
            CTGrenzwert lhsObererGrenzwert;
            lhsObererGrenzwert = this.getObererGrenzwert();
            CTGrenzwert rhsObererGrenzwert;
            rhsObererGrenzwert = that.getObererGrenzwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "obererGrenzwert", lhsObererGrenzwert), LocatorUtils.property(thatLocator, "obererGrenzwert", rhsObererGrenzwert), lhsObererGrenzwert, rhsObererGrenzwert, (this.obererGrenzwert!= null), (that.obererGrenzwert!= null))) {
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
            STVereinbarungKategorieID theKategorieID;
            theKategorieID = this.getKategorieID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kategorieID", theKategorieID), currentHashCode, theKategorieID, (this.kategorieID!= null));
        }
        {
            STVereinbarung theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            BigDecimal theWert;
            theWert = this.getWert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wert", theWert), currentHashCode, theWert, (this.wert!= null));
        }
        {
            STWerteinheit theWerteinheit;
            theWerteinheit = this.getWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "werteinheit", theWerteinheit), currentHashCode, theWerteinheit, (this.werteinheit!= null));
        }
        {
            STWaehrungsschluessel theWaehrung;
            theWaehrung = this.getWaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waehrung", theWaehrung), currentHashCode, theWaehrung, (this.waehrung!= null));
        }
        {
            STZahlungsweise theZahlungsweise;
            theZahlungsweise = this.getZahlungsweise();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahlungsweise", theZahlungsweise), currentHashCode, theZahlungsweise, (this.zahlungsweise!= null));
        }
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            STVereinbarungsbedingung theBedingung;
            theBedingung = this.getBedingung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bedingung", theBedingung), currentHashCode, theBedingung, (this.bedingung!= null));
        }
        {
            CTGrenzwert theUntererGrenzwert;
            theUntererGrenzwert = this.getUntererGrenzwert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "untererGrenzwert", theUntererGrenzwert), currentHashCode, theUntererGrenzwert, (this.untererGrenzwert!= null));
        }
        {
            CTZeitraum theZeitraum;
            theZeitraum = this.getZeitraum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitraum", theZeitraum), currentHashCode, theZeitraum, (this.zeitraum!= null));
        }
        {
            CTGrenzwert theObererGrenzwert;
            theObererGrenzwert = this.getObererGrenzwert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "obererGrenzwert", theObererGrenzwert), currentHashCode, theObererGrenzwert, (this.obererGrenzwert!= null));
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
        if (draftCopy instanceof CTVereinbarung) {
            final CTVereinbarung copy = ((CTVereinbarung) draftCopy);
            {
                Boolean kategorieIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kategorieID!= null));
                if (kategorieIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVereinbarungKategorieID sourceKategorieID;
                    sourceKategorieID = this.getKategorieID();
                    STVereinbarungKategorieID copyKategorieID = ((STVereinbarungKategorieID) strategy.copy(LocatorUtils.property(locator, "kategorieID", sourceKategorieID), sourceKategorieID, (this.kategorieID!= null)));
                    copy.setKategorieID(copyKategorieID);
                } else {
                    if (kategorieIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kategorieID = null;
                    }
                }
            }
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVereinbarung sourceArtID;
                    sourceArtID = this.getArtID();
                    STVereinbarung copyArtID = ((STVereinbarung) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean wertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wert!= null));
                if (wertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWert;
                    sourceWert = this.getWert();
                    BigDecimal copyWert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wert", sourceWert), sourceWert, (this.wert!= null)));
                    copy.setWert(copyWert);
                } else {
                    if (wertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wert = null;
                    }
                }
            }
            {
                Boolean werteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.werteinheit!= null));
                if (werteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceWerteinheit;
                    sourceWerteinheit = this.getWerteinheit();
                    STWerteinheit copyWerteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "werteinheit", sourceWerteinheit), sourceWerteinheit, (this.werteinheit!= null)));
                    copy.setWerteinheit(copyWerteinheit);
                } else {
                    if (werteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.werteinheit = null;
                    }
                }
            }
            {
                Boolean waehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waehrung!= null));
                if (waehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWaehrungsschluessel sourceWaehrung;
                    sourceWaehrung = this.getWaehrung();
                    STWaehrungsschluessel copyWaehrung = ((STWaehrungsschluessel) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung, (this.waehrung!= null)));
                    copy.setWaehrung(copyWaehrung);
                } else {
                    if (waehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waehrung = null;
                    }
                }
            }
            {
                Boolean zahlungsweiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zahlungsweise!= null));
                if (zahlungsweiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    STZahlungsweise sourceZahlungsweise;
                    sourceZahlungsweise = this.getZahlungsweise();
                    STZahlungsweise copyZahlungsweise = ((STZahlungsweise) strategy.copy(LocatorUtils.property(locator, "zahlungsweise", sourceZahlungsweise), sourceZahlungsweise, (this.zahlungsweise!= null)));
                    copy.setZahlungsweise(copyZahlungsweise);
                } else {
                    if (zahlungsweiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zahlungsweise = null;
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
                Boolean bedingungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bedingung!= null));
                if (bedingungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVereinbarungsbedingung sourceBedingung;
                    sourceBedingung = this.getBedingung();
                    STVereinbarungsbedingung copyBedingung = ((STVereinbarungsbedingung) strategy.copy(LocatorUtils.property(locator, "bedingung", sourceBedingung), sourceBedingung, (this.bedingung!= null)));
                    copy.setBedingung(copyBedingung);
                } else {
                    if (bedingungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bedingung = null;
                    }
                }
            }
            {
                Boolean untererGrenzwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.untererGrenzwert!= null));
                if (untererGrenzwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGrenzwert sourceUntererGrenzwert;
                    sourceUntererGrenzwert = this.getUntererGrenzwert();
                    CTGrenzwert copyUntererGrenzwert = ((CTGrenzwert) strategy.copy(LocatorUtils.property(locator, "untererGrenzwert", sourceUntererGrenzwert), sourceUntererGrenzwert, (this.untererGrenzwert!= null)));
                    copy.setUntererGrenzwert(copyUntererGrenzwert);
                } else {
                    if (untererGrenzwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.untererGrenzwert = null;
                    }
                }
            }
            {
                Boolean zeitraumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeitraum!= null));
                if (zeitraumShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceZeitraum;
                    sourceZeitraum = this.getZeitraum();
                    CTZeitraum copyZeitraum = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "zeitraum", sourceZeitraum), sourceZeitraum, (this.zeitraum!= null)));
                    copy.setZeitraum(copyZeitraum);
                } else {
                    if (zeitraumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeitraum = null;
                    }
                }
            }
            {
                Boolean obererGrenzwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.obererGrenzwert!= null));
                if (obererGrenzwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGrenzwert sourceObererGrenzwert;
                    sourceObererGrenzwert = this.getObererGrenzwert();
                    CTGrenzwert copyObererGrenzwert = ((CTGrenzwert) strategy.copy(LocatorUtils.property(locator, "obererGrenzwert", sourceObererGrenzwert), sourceObererGrenzwert, (this.obererGrenzwert!= null)));
                    copy.setObererGrenzwert(copyObererGrenzwert);
                } else {
                    if (obererGrenzwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.obererGrenzwert = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVereinbarung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withKategorieID(STVereinbarungKategorieID value) {
        setKategorieID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withArtID(STVereinbarung value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withWert(BigDecimal value) {
        setWert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withWerteinheit(STWerteinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withZahlungsweise(STZahlungsweise value) {
        setZahlungsweise(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withBedingung(STVereinbarungsbedingung value) {
        setBedingung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withUntererGrenzwert(CTGrenzwert value) {
        setUntererGrenzwert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withZeitraum(CTZeitraum value) {
        setZeitraum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withObererGrenzwert(CTGrenzwert value) {
        setObererGrenzwert(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVereinbarung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
