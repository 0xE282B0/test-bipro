
package net.bipro.namespace.produktmodell;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTGeldwert;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STDynamikKategorieID;
import net.bipro.namespace.datentypen.STEDynamik;
import net.bipro.namespace.datentypen.STEFrequenz;
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
 * Rechtlich vereinbarte Dynamik auf Beitraege oder Leistungen.
 * 
 * <p>Java class for CT_Dynamik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Dynamik"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_Dynamik" minOccurs="0"/&gt;
 *         &lt;element name="Frequenz" type="{http://www.bipro.net/namespace/datentypen}STE_Frequenz" minOccurs="0"/&gt;
 *         &lt;element name="Wert" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="KategorieID" type="{http://www.bipro.net/namespace/datentypen}ST_DynamikKategorieID" minOccurs="0"/&gt;
 *         &lt;element name="Hochrechnung" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="LetzteAnpassung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="DynamikStopp" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="NaechsteAnpassung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="VerbleibendeWidersprueche" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Zeitraum" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="Erhoehungsbetrag" type="{http://www.bipro.net/namespace/allgemein}CT_Geldwert" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Dynamik", propOrder = {
    "artID",
    "frequenz",
    "wert",
    "kategorieID",
    "hochrechnung",
    "letzteAnpassung",
    "dynamikStopp",
    "naechsteAnpassung",
    "verbleibendeWidersprueche",
    "zeitraum",
    "erhoehungsbetrag"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTDynamik
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEDynamik artID;
    @XmlElement(name = "Frequenz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEFrequenz frequenz;
    @XmlElement(name = "Wert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal wert;
    @XmlElement(name = "KategorieID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STDynamikKategorieID kategorieID;
    @XmlElement(name = "Hochrechnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean hochrechnung;
    @XmlElement(name = "LetzteAnpassung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String letzteAnpassung;
    @XmlElement(name = "DynamikStopp")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String dynamikStopp;
    @XmlElement(name = "NaechsteAnpassung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String naechsteAnpassung;
    @XmlElement(name = "VerbleibendeWidersprueche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer verbleibendeWidersprueche;
    @XmlElement(name = "Zeitraum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum zeitraum;
    @XmlElement(name = "Erhoehungsbetrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTGeldwert erhoehungsbetrag;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STEDynamik }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEDynamik getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEDynamik }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STEDynamik value) {
        this.artID = value;
    }

    /**
     * Gets the value of the frequenz property.
     * 
     * @return
     *     possible object is
     *     {@link STEFrequenz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEFrequenz getFrequenz() {
        return frequenz;
    }

    /**
     * Sets the value of the frequenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEFrequenz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFrequenz(STEFrequenz value) {
        this.frequenz = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWert(BigDecimal value) {
        this.wert = value;
    }

    /**
     * Gets the value of the kategorieID property.
     * 
     * @return
     *     possible object is
     *     {@link STDynamikKategorieID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STDynamikKategorieID getKategorieID() {
        return kategorieID;
    }

    /**
     * Sets the value of the kategorieID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDynamikKategorieID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKategorieID(STDynamikKategorieID value) {
        this.kategorieID = value;
    }

    /**
     * Gets the value of the hochrechnung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isHochrechnung() {
        return hochrechnung;
    }

    /**
     * Sets the value of the hochrechnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHochrechnung(Boolean value) {
        this.hochrechnung = value;
    }

    /**
     * Gets the value of the letzteAnpassung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getLetzteAnpassung() {
        return letzteAnpassung;
    }

    /**
     * Sets the value of the letzteAnpassung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLetzteAnpassung(String value) {
        this.letzteAnpassung = value;
    }

    /**
     * Gets the value of the dynamikStopp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDynamikStopp() {
        return dynamikStopp;
    }

    /**
     * Sets the value of the dynamikStopp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDynamikStopp(String value) {
        this.dynamikStopp = value;
    }

    /**
     * Gets the value of the naechsteAnpassung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getNaechsteAnpassung() {
        return naechsteAnpassung;
    }

    /**
     * Sets the value of the naechsteAnpassung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setNaechsteAnpassung(String value) {
        this.naechsteAnpassung = value;
    }

    /**
     * Gets the value of the verbleibendeWidersprueche property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getVerbleibendeWidersprueche() {
        return verbleibendeWidersprueche;
    }

    /**
     * Sets the value of the verbleibendeWidersprueche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVerbleibendeWidersprueche(Integer value) {
        this.verbleibendeWidersprueche = value;
    }

    /**
     * Gets the value of the zeitraum property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZeitraum(CTZeitraum value) {
        this.zeitraum = value;
    }

    /**
     * Gets the value of the erhoehungsbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link CTGeldwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeldwert getErhoehungsbetrag() {
        return erhoehungsbetrag;
    }

    /**
     * Sets the value of the erhoehungsbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGeldwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setErhoehungsbetrag(CTGeldwert value) {
        this.erhoehungsbetrag = value;
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
        final CTDynamik that = ((CTDynamik) object);
        {
            STEDynamik lhsArtID;
            lhsArtID = this.getArtID();
            STEDynamik rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            STEFrequenz lhsFrequenz;
            lhsFrequenz = this.getFrequenz();
            STEFrequenz rhsFrequenz;
            rhsFrequenz = that.getFrequenz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequenz", lhsFrequenz), LocatorUtils.property(thatLocator, "frequenz", rhsFrequenz), lhsFrequenz, rhsFrequenz, (this.frequenz!= null), (that.frequenz!= null))) {
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
            STDynamikKategorieID lhsKategorieID;
            lhsKategorieID = this.getKategorieID();
            STDynamikKategorieID rhsKategorieID;
            rhsKategorieID = that.getKategorieID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kategorieID", lhsKategorieID), LocatorUtils.property(thatLocator, "kategorieID", rhsKategorieID), lhsKategorieID, rhsKategorieID, (this.kategorieID!= null), (that.kategorieID!= null))) {
                return false;
            }
        }
        {
            Boolean lhsHochrechnung;
            lhsHochrechnung = this.isHochrechnung();
            Boolean rhsHochrechnung;
            rhsHochrechnung = that.isHochrechnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hochrechnung", lhsHochrechnung), LocatorUtils.property(thatLocator, "hochrechnung", rhsHochrechnung), lhsHochrechnung, rhsHochrechnung, (this.hochrechnung!= null), (that.hochrechnung!= null))) {
                return false;
            }
        }
        {
            String lhsLetzteAnpassung;
            lhsLetzteAnpassung = this.getLetzteAnpassung();
            String rhsLetzteAnpassung;
            rhsLetzteAnpassung = that.getLetzteAnpassung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "letzteAnpassung", lhsLetzteAnpassung), LocatorUtils.property(thatLocator, "letzteAnpassung", rhsLetzteAnpassung), lhsLetzteAnpassung, rhsLetzteAnpassung, (this.letzteAnpassung!= null), (that.letzteAnpassung!= null))) {
                return false;
            }
        }
        {
            String lhsDynamikStopp;
            lhsDynamikStopp = this.getDynamikStopp();
            String rhsDynamikStopp;
            rhsDynamikStopp = that.getDynamikStopp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dynamikStopp", lhsDynamikStopp), LocatorUtils.property(thatLocator, "dynamikStopp", rhsDynamikStopp), lhsDynamikStopp, rhsDynamikStopp, (this.dynamikStopp!= null), (that.dynamikStopp!= null))) {
                return false;
            }
        }
        {
            String lhsNaechsteAnpassung;
            lhsNaechsteAnpassung = this.getNaechsteAnpassung();
            String rhsNaechsteAnpassung;
            rhsNaechsteAnpassung = that.getNaechsteAnpassung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "naechsteAnpassung", lhsNaechsteAnpassung), LocatorUtils.property(thatLocator, "naechsteAnpassung", rhsNaechsteAnpassung), lhsNaechsteAnpassung, rhsNaechsteAnpassung, (this.naechsteAnpassung!= null), (that.naechsteAnpassung!= null))) {
                return false;
            }
        }
        {
            Integer lhsVerbleibendeWidersprueche;
            lhsVerbleibendeWidersprueche = this.getVerbleibendeWidersprueche();
            Integer rhsVerbleibendeWidersprueche;
            rhsVerbleibendeWidersprueche = that.getVerbleibendeWidersprueche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verbleibendeWidersprueche", lhsVerbleibendeWidersprueche), LocatorUtils.property(thatLocator, "verbleibendeWidersprueche", rhsVerbleibendeWidersprueche), lhsVerbleibendeWidersprueche, rhsVerbleibendeWidersprueche, (this.verbleibendeWidersprueche!= null), (that.verbleibendeWidersprueche!= null))) {
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
            CTGeldwert lhsErhoehungsbetrag;
            lhsErhoehungsbetrag = this.getErhoehungsbetrag();
            CTGeldwert rhsErhoehungsbetrag;
            rhsErhoehungsbetrag = that.getErhoehungsbetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erhoehungsbetrag", lhsErhoehungsbetrag), LocatorUtils.property(thatLocator, "erhoehungsbetrag", rhsErhoehungsbetrag), lhsErhoehungsbetrag, rhsErhoehungsbetrag, (this.erhoehungsbetrag!= null), (that.erhoehungsbetrag!= null))) {
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
            STEDynamik theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            STEFrequenz theFrequenz;
            theFrequenz = this.getFrequenz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequenz", theFrequenz), currentHashCode, theFrequenz, (this.frequenz!= null));
        }
        {
            BigDecimal theWert;
            theWert = this.getWert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wert", theWert), currentHashCode, theWert, (this.wert!= null));
        }
        {
            STDynamikKategorieID theKategorieID;
            theKategorieID = this.getKategorieID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kategorieID", theKategorieID), currentHashCode, theKategorieID, (this.kategorieID!= null));
        }
        {
            Boolean theHochrechnung;
            theHochrechnung = this.isHochrechnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hochrechnung", theHochrechnung), currentHashCode, theHochrechnung, (this.hochrechnung!= null));
        }
        {
            String theLetzteAnpassung;
            theLetzteAnpassung = this.getLetzteAnpassung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "letzteAnpassung", theLetzteAnpassung), currentHashCode, theLetzteAnpassung, (this.letzteAnpassung!= null));
        }
        {
            String theDynamikStopp;
            theDynamikStopp = this.getDynamikStopp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dynamikStopp", theDynamikStopp), currentHashCode, theDynamikStopp, (this.dynamikStopp!= null));
        }
        {
            String theNaechsteAnpassung;
            theNaechsteAnpassung = this.getNaechsteAnpassung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "naechsteAnpassung", theNaechsteAnpassung), currentHashCode, theNaechsteAnpassung, (this.naechsteAnpassung!= null));
        }
        {
            Integer theVerbleibendeWidersprueche;
            theVerbleibendeWidersprueche = this.getVerbleibendeWidersprueche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verbleibendeWidersprueche", theVerbleibendeWidersprueche), currentHashCode, theVerbleibendeWidersprueche, (this.verbleibendeWidersprueche!= null));
        }
        {
            CTZeitraum theZeitraum;
            theZeitraum = this.getZeitraum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitraum", theZeitraum), currentHashCode, theZeitraum, (this.zeitraum!= null));
        }
        {
            CTGeldwert theErhoehungsbetrag;
            theErhoehungsbetrag = this.getErhoehungsbetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erhoehungsbetrag", theErhoehungsbetrag), currentHashCode, theErhoehungsbetrag, (this.erhoehungsbetrag!= null));
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
        if (draftCopy instanceof CTDynamik) {
            final CTDynamik copy = ((CTDynamik) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEDynamik sourceArtID;
                    sourceArtID = this.getArtID();
                    STEDynamik copyArtID = ((STEDynamik) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean frequenzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.frequenz!= null));
                if (frequenzShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEFrequenz sourceFrequenz;
                    sourceFrequenz = this.getFrequenz();
                    STEFrequenz copyFrequenz = ((STEFrequenz) strategy.copy(LocatorUtils.property(locator, "frequenz", sourceFrequenz), sourceFrequenz, (this.frequenz!= null)));
                    copy.setFrequenz(copyFrequenz);
                } else {
                    if (frequenzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.frequenz = null;
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
                Boolean kategorieIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kategorieID!= null));
                if (kategorieIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STDynamikKategorieID sourceKategorieID;
                    sourceKategorieID = this.getKategorieID();
                    STDynamikKategorieID copyKategorieID = ((STDynamikKategorieID) strategy.copy(LocatorUtils.property(locator, "kategorieID", sourceKategorieID), sourceKategorieID, (this.kategorieID!= null)));
                    copy.setKategorieID(copyKategorieID);
                } else {
                    if (kategorieIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kategorieID = null;
                    }
                }
            }
            {
                Boolean hochrechnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hochrechnung!= null));
                if (hochrechnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceHochrechnung;
                    sourceHochrechnung = this.isHochrechnung();
                    Boolean copyHochrechnung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "hochrechnung", sourceHochrechnung), sourceHochrechnung, (this.hochrechnung!= null)));
                    copy.setHochrechnung(copyHochrechnung);
                } else {
                    if (hochrechnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hochrechnung = null;
                    }
                }
            }
            {
                Boolean letzteAnpassungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.letzteAnpassung!= null));
                if (letzteAnpassungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLetzteAnpassung;
                    sourceLetzteAnpassung = this.getLetzteAnpassung();
                    String copyLetzteAnpassung = ((String) strategy.copy(LocatorUtils.property(locator, "letzteAnpassung", sourceLetzteAnpassung), sourceLetzteAnpassung, (this.letzteAnpassung!= null)));
                    copy.setLetzteAnpassung(copyLetzteAnpassung);
                } else {
                    if (letzteAnpassungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.letzteAnpassung = null;
                    }
                }
            }
            {
                Boolean dynamikStoppShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dynamikStopp!= null));
                if (dynamikStoppShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDynamikStopp;
                    sourceDynamikStopp = this.getDynamikStopp();
                    String copyDynamikStopp = ((String) strategy.copy(LocatorUtils.property(locator, "dynamikStopp", sourceDynamikStopp), sourceDynamikStopp, (this.dynamikStopp!= null)));
                    copy.setDynamikStopp(copyDynamikStopp);
                } else {
                    if (dynamikStoppShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dynamikStopp = null;
                    }
                }
            }
            {
                Boolean naechsteAnpassungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.naechsteAnpassung!= null));
                if (naechsteAnpassungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNaechsteAnpassung;
                    sourceNaechsteAnpassung = this.getNaechsteAnpassung();
                    String copyNaechsteAnpassung = ((String) strategy.copy(LocatorUtils.property(locator, "naechsteAnpassung", sourceNaechsteAnpassung), sourceNaechsteAnpassung, (this.naechsteAnpassung!= null)));
                    copy.setNaechsteAnpassung(copyNaechsteAnpassung);
                } else {
                    if (naechsteAnpassungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.naechsteAnpassung = null;
                    }
                }
            }
            {
                Boolean verbleibendeWiderspruecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verbleibendeWidersprueche!= null));
                if (verbleibendeWiderspruecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceVerbleibendeWidersprueche;
                    sourceVerbleibendeWidersprueche = this.getVerbleibendeWidersprueche();
                    Integer copyVerbleibendeWidersprueche = ((Integer) strategy.copy(LocatorUtils.property(locator, "verbleibendeWidersprueche", sourceVerbleibendeWidersprueche), sourceVerbleibendeWidersprueche, (this.verbleibendeWidersprueche!= null)));
                    copy.setVerbleibendeWidersprueche(copyVerbleibendeWidersprueche);
                } else {
                    if (verbleibendeWiderspruecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verbleibendeWidersprueche = null;
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
                Boolean erhoehungsbetragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erhoehungsbetrag!= null));
                if (erhoehungsbetragShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGeldwert sourceErhoehungsbetrag;
                    sourceErhoehungsbetrag = this.getErhoehungsbetrag();
                    CTGeldwert copyErhoehungsbetrag = ((CTGeldwert) strategy.copy(LocatorUtils.property(locator, "erhoehungsbetrag", sourceErhoehungsbetrag), sourceErhoehungsbetrag, (this.erhoehungsbetrag!= null)));
                    copy.setErhoehungsbetrag(copyErhoehungsbetrag);
                } else {
                    if (erhoehungsbetragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erhoehungsbetrag = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDynamik();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withArtID(STEDynamik value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withFrequenz(STEFrequenz value) {
        setFrequenz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withWert(BigDecimal value) {
        setWert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withKategorieID(STDynamikKategorieID value) {
        setKategorieID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withHochrechnung(Boolean value) {
        setHochrechnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withLetzteAnpassung(String value) {
        setLetzteAnpassung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withDynamikStopp(String value) {
        setDynamikStopp(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withNaechsteAnpassung(String value) {
        setNaechsteAnpassung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withVerbleibendeWidersprueche(Integer value) {
        setVerbleibendeWidersprueche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withZeitraum(CTZeitraum value) {
        setZeitraum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withErhoehungsbetrag(CTGeldwert value) {
        setErhoehungsbetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDynamik withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
