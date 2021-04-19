
package net.bipro.namespace.produktmodell;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBetrag;
import net.bipro.namespace.allgemein.CTSteuer;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STDauer;
import net.bipro.namespace.datentypen.STEBeitrag;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTVermoegenswirksameLeistung;
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
 * Zu zahlende, vorgegebene oder berechnete Beiträge.
 * Beiträge werden auf der nächst höheren Ebene aggregiert.
 * 
 * Beispiel für Versicherungen:
 * Tarifbeitrag, Gesamtbeitrag Brutto ohne Überschussverrechnung (Schlüssel 07)
 * 
 * ./. Überschüsse
 * 
 *  = Nettobeitrag inklusive etwaigem Ratenzahlungszuschlag (Schlüssel 02)
 * 
 * + Versicherungssteuer
 * 
 *  = Beitrag inklusive etwaiger Steuer (Schlüssel 01)
 * 
 * Verwendungsbeispiel ArtID=10: An einem Produktbaustein wird ein Objekt Beitrag (ArtID=07, Betrag=100, Waehrung=EUR...) angegeben und ein Objekt Beitrag (ArtID=10, Prozentsatz=40,Erhebung=Zeitraum[2 Jahre]...). Das heißt, der Tarifbeitrag beträgt 40 €/Monat in den ersten zwei Jahren und anschließend 100 €/Monat für den Rest der Aufschubzeit.
 * 
 * <p>Java class for CT_Beitrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Beitrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_Beitrag" minOccurs="0"/&gt;
 *         &lt;element name="Betrag" type="{http://www.bipro.net/namespace/allgemein}CT_Betrag" minOccurs="0"/&gt;
 *         &lt;element name="Zahlungsweise" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsweise" minOccurs="0"/&gt;
 *         &lt;element name="Prozentsatz" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Dauer" type="{http://www.bipro.net/namespace/datentypen}ST_Dauer" minOccurs="0"/&gt;
 *         &lt;element name="Erhebung" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="VermoegenswirksameLeistung" type="{http://www.bipro.net/namespace/partner}CT_VermoegenswirksameLeistung" minOccurs="0"/&gt;
 *         &lt;element name="Steuer" type="{http://www.bipro.net/namespace/allgemein}CT_Steuer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Beitragsfoerderung" type="{http://www.bipro.net/namespace/produktmodell}CT_Beitragsfoerderung" minOccurs="0"/&gt;
 *         &lt;element name="Beitragsschuldner" type="{http://www.bipro.net/namespace/produktmodell}CT_Beitragsschuldner" minOccurs="0"/&gt;
 *         &lt;element name="BeitragImRueckstand" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Beitrag", propOrder = {
    "artID",
    "betrag",
    "zahlungsweise",
    "prozentsatz",
    "dauer",
    "erhebung",
    "vermoegenswirksameLeistung",
    "steuer",
    "beitragsfoerderung",
    "beitragsschuldner",
    "beitragImRueckstand"
})
@XmlSeeAlso({
    CTGeteilterBeitrag.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTBeitrag
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEBeitrag artID;
    @XmlElement(name = "Betrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBetrag betrag;
    @XmlElement(name = "Zahlungsweise")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsweise zahlungsweise;
    @XmlElement(name = "Prozentsatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal prozentsatz;
    @XmlElement(name = "Dauer")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STDauer dauer;
    @XmlElement(name = "Erhebung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum erhebung;
    @XmlElement(name = "VermoegenswirksameLeistung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTVermoegenswirksameLeistung vermoegenswirksameLeistung;
    @XmlElement(name = "Steuer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTSteuer> steuer;
    @XmlElement(name = "Beitragsfoerderung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBeitragsfoerderung beitragsfoerderung;
    @XmlElement(name = "Beitragsschuldner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBeitragsschuldner beitragsschuldner;
    @XmlElement(name = "BeitragImRueckstand")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean beitragImRueckstand;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STEBeitrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEBeitrag getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEBeitrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STEBeitrag value) {
        this.artID = value;
    }

    /**
     * Gets the value of the betrag property.
     * 
     * @return
     *     possible object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrag getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBetrag(CTBetrag value) {
        this.betrag = value;
    }

    /**
     * Gets the value of the zahlungsweise property.
     * 
     * @return
     *     possible object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZahlungsweise(STZahlungsweise value) {
        this.zahlungsweise = value;
    }

    /**
     * Gets the value of the prozentsatz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getProzentsatz() {
        return prozentsatz;
    }

    /**
     * Sets the value of the prozentsatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setProzentsatz(BigDecimal value) {
        this.prozentsatz = value;
    }

    /**
     * Gets the value of the dauer property.
     * 
     * @return
     *     possible object is
     *     {@link STDauer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STDauer getDauer() {
        return dauer;
    }

    /**
     * Sets the value of the dauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDauer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDauer(STDauer value) {
        this.dauer = value;
    }

    /**
     * Gets the value of the erhebung property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getErhebung() {
        return erhebung;
    }

    /**
     * Sets the value of the erhebung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setErhebung(CTZeitraum value) {
        this.erhebung = value;
    }

    /**
     * Gets the value of the vermoegenswirksameLeistung property.
     * 
     * @return
     *     possible object is
     *     {@link CTVermoegenswirksameLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermoegenswirksameLeistung getVermoegenswirksameLeistung() {
        return vermoegenswirksameLeistung;
    }

    /**
     * Sets the value of the vermoegenswirksameLeistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVermoegenswirksameLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVermoegenswirksameLeistung(CTVermoegenswirksameLeistung value) {
        this.vermoegenswirksameLeistung = value;
    }

    /**
     * Gets the value of the steuer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steuer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteuer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSteuer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTSteuer> getSteuer() {
        if (steuer == null) {
            steuer = new ArrayList<CTSteuer>();
        }
        return this.steuer;
    }

    /**
     * Gets the value of the beitragsfoerderung property.
     * 
     * @return
     *     possible object is
     *     {@link CTBeitragsfoerderung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitragsfoerderung getBeitragsfoerderung() {
        return beitragsfoerderung;
    }

    /**
     * Sets the value of the beitragsfoerderung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBeitragsfoerderung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeitragsfoerderung(CTBeitragsfoerderung value) {
        this.beitragsfoerderung = value;
    }

    /**
     * Gets the value of the beitragsschuldner property.
     * 
     * @return
     *     possible object is
     *     {@link CTBeitragsschuldner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitragsschuldner getBeitragsschuldner() {
        return beitragsschuldner;
    }

    /**
     * Sets the value of the beitragsschuldner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBeitragsschuldner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeitragsschuldner(CTBeitragsschuldner value) {
        this.beitragsschuldner = value;
    }

    /**
     * Gets the value of the beitragImRueckstand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isBeitragImRueckstand() {
        return beitragImRueckstand;
    }

    /**
     * Sets the value of the beitragImRueckstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeitragImRueckstand(Boolean value) {
        this.beitragImRueckstand = value;
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
        final CTBeitrag that = ((CTBeitrag) object);
        {
            STEBeitrag lhsArtID;
            lhsArtID = this.getArtID();
            STEBeitrag rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            CTBetrag lhsBetrag;
            lhsBetrag = this.getBetrag();
            CTBetrag rhsBetrag;
            rhsBetrag = that.getBetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betrag", lhsBetrag), LocatorUtils.property(thatLocator, "betrag", rhsBetrag), lhsBetrag, rhsBetrag, (this.betrag!= null), (that.betrag!= null))) {
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
            BigDecimal lhsProzentsatz;
            lhsProzentsatz = this.getProzentsatz();
            BigDecimal rhsProzentsatz;
            rhsProzentsatz = that.getProzentsatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prozentsatz", lhsProzentsatz), LocatorUtils.property(thatLocator, "prozentsatz", rhsProzentsatz), lhsProzentsatz, rhsProzentsatz, (this.prozentsatz!= null), (that.prozentsatz!= null))) {
                return false;
            }
        }
        {
            STDauer lhsDauer;
            lhsDauer = this.getDauer();
            STDauer rhsDauer;
            rhsDauer = that.getDauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dauer", lhsDauer), LocatorUtils.property(thatLocator, "dauer", rhsDauer), lhsDauer, rhsDauer, (this.dauer!= null), (that.dauer!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsErhebung;
            lhsErhebung = this.getErhebung();
            CTZeitraum rhsErhebung;
            rhsErhebung = that.getErhebung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erhebung", lhsErhebung), LocatorUtils.property(thatLocator, "erhebung", rhsErhebung), lhsErhebung, rhsErhebung, (this.erhebung!= null), (that.erhebung!= null))) {
                return false;
            }
        }
        {
            CTVermoegenswirksameLeistung lhsVermoegenswirksameLeistung;
            lhsVermoegenswirksameLeistung = this.getVermoegenswirksameLeistung();
            CTVermoegenswirksameLeistung rhsVermoegenswirksameLeistung;
            rhsVermoegenswirksameLeistung = that.getVermoegenswirksameLeistung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermoegenswirksameLeistung", lhsVermoegenswirksameLeistung), LocatorUtils.property(thatLocator, "vermoegenswirksameLeistung", rhsVermoegenswirksameLeistung), lhsVermoegenswirksameLeistung, rhsVermoegenswirksameLeistung, (this.vermoegenswirksameLeistung!= null), (that.vermoegenswirksameLeistung!= null))) {
                return false;
            }
        }
        {
            List<CTSteuer> lhsSteuer;
            lhsSteuer = (((this.steuer!= null)&&(!this.steuer.isEmpty()))?this.getSteuer():null);
            List<CTSteuer> rhsSteuer;
            rhsSteuer = (((that.steuer!= null)&&(!that.steuer.isEmpty()))?that.getSteuer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steuer", lhsSteuer), LocatorUtils.property(thatLocator, "steuer", rhsSteuer), lhsSteuer, rhsSteuer, ((this.steuer!= null)&&(!this.steuer.isEmpty())), ((that.steuer!= null)&&(!that.steuer.isEmpty())))) {
                return false;
            }
        }
        {
            CTBeitragsfoerderung lhsBeitragsfoerderung;
            lhsBeitragsfoerderung = this.getBeitragsfoerderung();
            CTBeitragsfoerderung rhsBeitragsfoerderung;
            rhsBeitragsfoerderung = that.getBeitragsfoerderung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragsfoerderung", lhsBeitragsfoerderung), LocatorUtils.property(thatLocator, "beitragsfoerderung", rhsBeitragsfoerderung), lhsBeitragsfoerderung, rhsBeitragsfoerderung, (this.beitragsfoerderung!= null), (that.beitragsfoerderung!= null))) {
                return false;
            }
        }
        {
            CTBeitragsschuldner lhsBeitragsschuldner;
            lhsBeitragsschuldner = this.getBeitragsschuldner();
            CTBeitragsschuldner rhsBeitragsschuldner;
            rhsBeitragsschuldner = that.getBeitragsschuldner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragsschuldner", lhsBeitragsschuldner), LocatorUtils.property(thatLocator, "beitragsschuldner", rhsBeitragsschuldner), lhsBeitragsschuldner, rhsBeitragsschuldner, (this.beitragsschuldner!= null), (that.beitragsschuldner!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBeitragImRueckstand;
            lhsBeitragImRueckstand = this.isBeitragImRueckstand();
            Boolean rhsBeitragImRueckstand;
            rhsBeitragImRueckstand = that.isBeitragImRueckstand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragImRueckstand", lhsBeitragImRueckstand), LocatorUtils.property(thatLocator, "beitragImRueckstand", rhsBeitragImRueckstand), lhsBeitragImRueckstand, rhsBeitragImRueckstand, (this.beitragImRueckstand!= null), (that.beitragImRueckstand!= null))) {
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
            STEBeitrag theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            CTBetrag theBetrag;
            theBetrag = this.getBetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betrag", theBetrag), currentHashCode, theBetrag, (this.betrag!= null));
        }
        {
            STZahlungsweise theZahlungsweise;
            theZahlungsweise = this.getZahlungsweise();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahlungsweise", theZahlungsweise), currentHashCode, theZahlungsweise, (this.zahlungsweise!= null));
        }
        {
            BigDecimal theProzentsatz;
            theProzentsatz = this.getProzentsatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prozentsatz", theProzentsatz), currentHashCode, theProzentsatz, (this.prozentsatz!= null));
        }
        {
            STDauer theDauer;
            theDauer = this.getDauer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dauer", theDauer), currentHashCode, theDauer, (this.dauer!= null));
        }
        {
            CTZeitraum theErhebung;
            theErhebung = this.getErhebung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erhebung", theErhebung), currentHashCode, theErhebung, (this.erhebung!= null));
        }
        {
            CTVermoegenswirksameLeistung theVermoegenswirksameLeistung;
            theVermoegenswirksameLeistung = this.getVermoegenswirksameLeistung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermoegenswirksameLeistung", theVermoegenswirksameLeistung), currentHashCode, theVermoegenswirksameLeistung, (this.vermoegenswirksameLeistung!= null));
        }
        {
            List<CTSteuer> theSteuer;
            theSteuer = (((this.steuer!= null)&&(!this.steuer.isEmpty()))?this.getSteuer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "steuer", theSteuer), currentHashCode, theSteuer, ((this.steuer!= null)&&(!this.steuer.isEmpty())));
        }
        {
            CTBeitragsfoerderung theBeitragsfoerderung;
            theBeitragsfoerderung = this.getBeitragsfoerderung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragsfoerderung", theBeitragsfoerderung), currentHashCode, theBeitragsfoerderung, (this.beitragsfoerderung!= null));
        }
        {
            CTBeitragsschuldner theBeitragsschuldner;
            theBeitragsschuldner = this.getBeitragsschuldner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragsschuldner", theBeitragsschuldner), currentHashCode, theBeitragsschuldner, (this.beitragsschuldner!= null));
        }
        {
            Boolean theBeitragImRueckstand;
            theBeitragImRueckstand = this.isBeitragImRueckstand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragImRueckstand", theBeitragImRueckstand), currentHashCode, theBeitragImRueckstand, (this.beitragImRueckstand!= null));
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
        if (draftCopy instanceof CTBeitrag) {
            final CTBeitrag copy = ((CTBeitrag) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEBeitrag sourceArtID;
                    sourceArtID = this.getArtID();
                    STEBeitrag copyArtID = ((STEBeitrag) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean betragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betrag!= null));
                if (betragShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBetrag sourceBetrag;
                    sourceBetrag = this.getBetrag();
                    CTBetrag copyBetrag = ((CTBetrag) strategy.copy(LocatorUtils.property(locator, "betrag", sourceBetrag), sourceBetrag, (this.betrag!= null)));
                    copy.setBetrag(copyBetrag);
                } else {
                    if (betragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betrag = null;
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
                Boolean prozentsatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.prozentsatz!= null));
                if (prozentsatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceProzentsatz;
                    sourceProzentsatz = this.getProzentsatz();
                    BigDecimal copyProzentsatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "prozentsatz", sourceProzentsatz), sourceProzentsatz, (this.prozentsatz!= null)));
                    copy.setProzentsatz(copyProzentsatz);
                } else {
                    if (prozentsatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.prozentsatz = null;
                    }
                }
            }
            {
                Boolean dauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dauer!= null));
                if (dauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    STDauer sourceDauer;
                    sourceDauer = this.getDauer();
                    STDauer copyDauer = ((STDauer) strategy.copy(LocatorUtils.property(locator, "dauer", sourceDauer), sourceDauer, (this.dauer!= null)));
                    copy.setDauer(copyDauer);
                } else {
                    if (dauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dauer = null;
                    }
                }
            }
            {
                Boolean erhebungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erhebung!= null));
                if (erhebungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceErhebung;
                    sourceErhebung = this.getErhebung();
                    CTZeitraum copyErhebung = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "erhebung", sourceErhebung), sourceErhebung, (this.erhebung!= null)));
                    copy.setErhebung(copyErhebung);
                } else {
                    if (erhebungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erhebung = null;
                    }
                }
            }
            {
                Boolean vermoegenswirksameLeistungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermoegenswirksameLeistung!= null));
                if (vermoegenswirksameLeistungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVermoegenswirksameLeistung sourceVermoegenswirksameLeistung;
                    sourceVermoegenswirksameLeistung = this.getVermoegenswirksameLeistung();
                    CTVermoegenswirksameLeistung copyVermoegenswirksameLeistung = ((CTVermoegenswirksameLeistung) strategy.copy(LocatorUtils.property(locator, "vermoegenswirksameLeistung", sourceVermoegenswirksameLeistung), sourceVermoegenswirksameLeistung, (this.vermoegenswirksameLeistung!= null)));
                    copy.setVermoegenswirksameLeistung(copyVermoegenswirksameLeistung);
                } else {
                    if (vermoegenswirksameLeistungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermoegenswirksameLeistung = null;
                    }
                }
            }
            {
                Boolean steuerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.steuer!= null)&&(!this.steuer.isEmpty())));
                if (steuerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSteuer> sourceSteuer;
                    sourceSteuer = (((this.steuer!= null)&&(!this.steuer.isEmpty()))?this.getSteuer():null);
                    @SuppressWarnings("unchecked")
                    List<CTSteuer> copySteuer = ((List<CTSteuer> ) strategy.copy(LocatorUtils.property(locator, "steuer", sourceSteuer), sourceSteuer, ((this.steuer!= null)&&(!this.steuer.isEmpty()))));
                    copy.steuer = null;
                    if (copySteuer!= null) {
                        List<CTSteuer> uniqueSteuerl = copy.getSteuer();
                        uniqueSteuerl.addAll(copySteuer);
                    }
                } else {
                    if (steuerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.steuer = null;
                    }
                }
            }
            {
                Boolean beitragsfoerderungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragsfoerderung!= null));
                if (beitragsfoerderungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBeitragsfoerderung sourceBeitragsfoerderung;
                    sourceBeitragsfoerderung = this.getBeitragsfoerderung();
                    CTBeitragsfoerderung copyBeitragsfoerderung = ((CTBeitragsfoerderung) strategy.copy(LocatorUtils.property(locator, "beitragsfoerderung", sourceBeitragsfoerderung), sourceBeitragsfoerderung, (this.beitragsfoerderung!= null)));
                    copy.setBeitragsfoerderung(copyBeitragsfoerderung);
                } else {
                    if (beitragsfoerderungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragsfoerderung = null;
                    }
                }
            }
            {
                Boolean beitragsschuldnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragsschuldner!= null));
                if (beitragsschuldnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBeitragsschuldner sourceBeitragsschuldner;
                    sourceBeitragsschuldner = this.getBeitragsschuldner();
                    CTBeitragsschuldner copyBeitragsschuldner = ((CTBeitragsschuldner) strategy.copy(LocatorUtils.property(locator, "beitragsschuldner", sourceBeitragsschuldner), sourceBeitragsschuldner, (this.beitragsschuldner!= null)));
                    copy.setBeitragsschuldner(copyBeitragsschuldner);
                } else {
                    if (beitragsschuldnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragsschuldner = null;
                    }
                }
            }
            {
                Boolean beitragImRueckstandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragImRueckstand!= null));
                if (beitragImRueckstandShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBeitragImRueckstand;
                    sourceBeitragImRueckstand = this.isBeitragImRueckstand();
                    Boolean copyBeitragImRueckstand = ((Boolean) strategy.copy(LocatorUtils.property(locator, "beitragImRueckstand", sourceBeitragImRueckstand), sourceBeitragImRueckstand, (this.beitragImRueckstand!= null)));
                    copy.setBeitragImRueckstand(copyBeitragImRueckstand);
                } else {
                    if (beitragImRueckstandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragImRueckstand = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBeitrag();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withArtID(STEBeitrag value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withBetrag(CTBetrag value) {
        setBetrag(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withZahlungsweise(STZahlungsweise value) {
        setZahlungsweise(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withProzentsatz(BigDecimal value) {
        setProzentsatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withDauer(STDauer value) {
        setDauer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withErhebung(CTZeitraum value) {
        setErhebung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withVermoegenswirksameLeistung(CTVermoegenswirksameLeistung value) {
        setVermoegenswirksameLeistung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withSteuer(CTSteuer... values) {
        if (values!= null) {
            for (CTSteuer value: values) {
                getSteuer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withSteuer(Collection<CTSteuer> values) {
        if (values!= null) {
            getSteuer().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withBeitragsfoerderung(CTBeitragsfoerderung value) {
        setBeitragsfoerderung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withBeitragsschuldner(CTBeitragsschuldner value) {
        setBeitragsschuldner(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withBeitragImRueckstand(Boolean value) {
        setBeitragImRueckstand(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitrag withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
