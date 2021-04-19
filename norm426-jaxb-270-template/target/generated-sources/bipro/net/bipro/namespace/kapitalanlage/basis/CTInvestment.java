
package net.bipro.namespace.kapitalanlage.basis;

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
import net.bipro.namespace.allgemein.CTDevisenkurs;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.versicherung.produktmodell.CTFondsAnteil;
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
 * Informationen zu einem Investment (z.B. Aktie, Fonds, Anleihe).
 * 
 * <p>Java class for CT_Investment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Investment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISIN" type="{http://www.bipro.net/namespace/datentypen}ST_ISIN" minOccurs="0"/&gt;
 *         &lt;element name="Wertpapierkennnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Wertpapierkennnummer" minOccurs="0"/&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Wertpapierklassifikation" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Anteile" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Waehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel" minOccurs="0"/&gt;
 *         &lt;element name="ZusaetzlicheInvestmentDaten" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_ZusaetzlicheInvestmentDaten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Devisenkurs" type="{http://www.bipro.net/namespace/allgemein}CT_Devisenkurs" minOccurs="0"/&gt;
 *         &lt;element name="Investmentkurs" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Investmentkurs" minOccurs="0"/&gt;
 *         &lt;element name="BestandInInvestmentwaehrung" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Bestand" minOccurs="0"/&gt;
 *         &lt;element name="BestandInDepotwaehrung" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Bestand" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Investment", propOrder = {
    "isin",
    "wertpapierkennnummer",
    "bezeichnung",
    "wertpapierklassifikation",
    "anteile",
    "waehrung",
    "zusaetzlicheInvestmentDaten",
    "devisenkurs",
    "investmentkurs",
    "bestandInInvestmentwaehrung",
    "bestandInDepotwaehrung"
})
@XmlSeeAlso({
    CTFondsAnteil.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTInvestment
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ISIN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String isin;
    @XmlElement(name = "Wertpapierkennnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String wertpapierkennnummer;
    @XmlElement(name = "Bezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "Wertpapierklassifikation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String wertpapierklassifikation;
    @XmlElement(name = "Anteile")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anteile;
    @XmlElement(name = "Waehrung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel waehrung;
    @XmlElement(name = "ZusaetzlicheInvestmentDaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTZusaetzlicheInvestmentDaten> zusaetzlicheInvestmentDaten;
    @XmlElement(name = "Devisenkurs")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTDevisenkurs devisenkurs;
    @XmlElement(name = "Investmentkurs")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTInvestmentkurs investmentkurs;
    @XmlElement(name = "BestandInInvestmentwaehrung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBestand bestandInInvestmentwaehrung;
    @XmlElement(name = "BestandInDepotwaehrung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBestand bestandInDepotwaehrung;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the wertpapierkennnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getWertpapierkennnummer() {
        return wertpapierkennnummer;
    }

    /**
     * Sets the value of the wertpapierkennnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWertpapierkennnummer(String value) {
        this.wertpapierkennnummer = value;
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
     * Gets the value of the wertpapierklassifikation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getWertpapierklassifikation() {
        return wertpapierklassifikation;
    }

    /**
     * Sets the value of the wertpapierklassifikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWertpapierklassifikation(String value) {
        this.wertpapierklassifikation = value;
    }

    /**
     * Gets the value of the anteile property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getAnteile() {
        return anteile;
    }

    /**
     * Sets the value of the anteile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnteile(BigDecimal value) {
        this.anteile = value;
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
     * Gets the value of the zusaetzlicheInvestmentDaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zusaetzlicheInvestmentDaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZusaetzlicheInvestmentDaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTZusaetzlicheInvestmentDaten }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTZusaetzlicheInvestmentDaten> getZusaetzlicheInvestmentDaten() {
        if (zusaetzlicheInvestmentDaten == null) {
            zusaetzlicheInvestmentDaten = new ArrayList<CTZusaetzlicheInvestmentDaten>();
        }
        return this.zusaetzlicheInvestmentDaten;
    }

    /**
     * Gets the value of the devisenkurs property.
     * 
     * @return
     *     possible object is
     *     {@link CTDevisenkurs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDevisenkurs getDevisenkurs() {
        return devisenkurs;
    }

    /**
     * Sets the value of the devisenkurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTDevisenkurs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDevisenkurs(CTDevisenkurs value) {
        this.devisenkurs = value;
    }

    /**
     * Gets the value of the investmentkurs property.
     * 
     * @return
     *     possible object is
     *     {@link CTInvestmentkurs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestmentkurs getInvestmentkurs() {
        return investmentkurs;
    }

    /**
     * Sets the value of the investmentkurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTInvestmentkurs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setInvestmentkurs(CTInvestmentkurs value) {
        this.investmentkurs = value;
    }

    /**
     * Gets the value of the bestandInInvestmentwaehrung property.
     * 
     * @return
     *     possible object is
     *     {@link CTBestand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBestand getBestandInInvestmentwaehrung() {
        return bestandInInvestmentwaehrung;
    }

    /**
     * Sets the value of the bestandInInvestmentwaehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBestand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBestandInInvestmentwaehrung(CTBestand value) {
        this.bestandInInvestmentwaehrung = value;
    }

    /**
     * Gets the value of the bestandInDepotwaehrung property.
     * 
     * @return
     *     possible object is
     *     {@link CTBestand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBestand getBestandInDepotwaehrung() {
        return bestandInDepotwaehrung;
    }

    /**
     * Sets the value of the bestandInDepotwaehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBestand }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBestandInDepotwaehrung(CTBestand value) {
        this.bestandInDepotwaehrung = value;
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
        final CTInvestment that = ((CTInvestment) object);
        {
            String lhsISIN;
            lhsISIN = this.getISIN();
            String rhsISIN;
            rhsISIN = that.getISIN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isin", lhsISIN), LocatorUtils.property(thatLocator, "isin", rhsISIN), lhsISIN, rhsISIN, (this.isin!= null), (that.isin!= null))) {
                return false;
            }
        }
        {
            String lhsWertpapierkennnummer;
            lhsWertpapierkennnummer = this.getWertpapierkennnummer();
            String rhsWertpapierkennnummer;
            rhsWertpapierkennnummer = that.getWertpapierkennnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wertpapierkennnummer", lhsWertpapierkennnummer), LocatorUtils.property(thatLocator, "wertpapierkennnummer", rhsWertpapierkennnummer), lhsWertpapierkennnummer, rhsWertpapierkennnummer, (this.wertpapierkennnummer!= null), (that.wertpapierkennnummer!= null))) {
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
            String lhsWertpapierklassifikation;
            lhsWertpapierklassifikation = this.getWertpapierklassifikation();
            String rhsWertpapierklassifikation;
            rhsWertpapierklassifikation = that.getWertpapierklassifikation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wertpapierklassifikation", lhsWertpapierklassifikation), LocatorUtils.property(thatLocator, "wertpapierklassifikation", rhsWertpapierklassifikation), lhsWertpapierklassifikation, rhsWertpapierklassifikation, (this.wertpapierklassifikation!= null), (that.wertpapierklassifikation!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnteile;
            lhsAnteile = this.getAnteile();
            BigDecimal rhsAnteile;
            rhsAnteile = that.getAnteile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteile", lhsAnteile), LocatorUtils.property(thatLocator, "anteile", rhsAnteile), lhsAnteile, rhsAnteile, (this.anteile!= null), (that.anteile!= null))) {
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
            List<CTZusaetzlicheInvestmentDaten> lhsZusaetzlicheInvestmentDaten;
            lhsZusaetzlicheInvestmentDaten = (((this.zusaetzlicheInvestmentDaten!= null)&&(!this.zusaetzlicheInvestmentDaten.isEmpty()))?this.getZusaetzlicheInvestmentDaten():null);
            List<CTZusaetzlicheInvestmentDaten> rhsZusaetzlicheInvestmentDaten;
            rhsZusaetzlicheInvestmentDaten = (((that.zusaetzlicheInvestmentDaten!= null)&&(!that.zusaetzlicheInvestmentDaten.isEmpty()))?that.getZusaetzlicheInvestmentDaten():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusaetzlicheInvestmentDaten", lhsZusaetzlicheInvestmentDaten), LocatorUtils.property(thatLocator, "zusaetzlicheInvestmentDaten", rhsZusaetzlicheInvestmentDaten), lhsZusaetzlicheInvestmentDaten, rhsZusaetzlicheInvestmentDaten, ((this.zusaetzlicheInvestmentDaten!= null)&&(!this.zusaetzlicheInvestmentDaten.isEmpty())), ((that.zusaetzlicheInvestmentDaten!= null)&&(!that.zusaetzlicheInvestmentDaten.isEmpty())))) {
                return false;
            }
        }
        {
            CTDevisenkurs lhsDevisenkurs;
            lhsDevisenkurs = this.getDevisenkurs();
            CTDevisenkurs rhsDevisenkurs;
            rhsDevisenkurs = that.getDevisenkurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "devisenkurs", lhsDevisenkurs), LocatorUtils.property(thatLocator, "devisenkurs", rhsDevisenkurs), lhsDevisenkurs, rhsDevisenkurs, (this.devisenkurs!= null), (that.devisenkurs!= null))) {
                return false;
            }
        }
        {
            CTInvestmentkurs lhsInvestmentkurs;
            lhsInvestmentkurs = this.getInvestmentkurs();
            CTInvestmentkurs rhsInvestmentkurs;
            rhsInvestmentkurs = that.getInvestmentkurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "investmentkurs", lhsInvestmentkurs), LocatorUtils.property(thatLocator, "investmentkurs", rhsInvestmentkurs), lhsInvestmentkurs, rhsInvestmentkurs, (this.investmentkurs!= null), (that.investmentkurs!= null))) {
                return false;
            }
        }
        {
            CTBestand lhsBestandInInvestmentwaehrung;
            lhsBestandInInvestmentwaehrung = this.getBestandInInvestmentwaehrung();
            CTBestand rhsBestandInInvestmentwaehrung;
            rhsBestandInInvestmentwaehrung = that.getBestandInInvestmentwaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestandInInvestmentwaehrung", lhsBestandInInvestmentwaehrung), LocatorUtils.property(thatLocator, "bestandInInvestmentwaehrung", rhsBestandInInvestmentwaehrung), lhsBestandInInvestmentwaehrung, rhsBestandInInvestmentwaehrung, (this.bestandInInvestmentwaehrung!= null), (that.bestandInInvestmentwaehrung!= null))) {
                return false;
            }
        }
        {
            CTBestand lhsBestandInDepotwaehrung;
            lhsBestandInDepotwaehrung = this.getBestandInDepotwaehrung();
            CTBestand rhsBestandInDepotwaehrung;
            rhsBestandInDepotwaehrung = that.getBestandInDepotwaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestandInDepotwaehrung", lhsBestandInDepotwaehrung), LocatorUtils.property(thatLocator, "bestandInDepotwaehrung", rhsBestandInDepotwaehrung), lhsBestandInDepotwaehrung, rhsBestandInDepotwaehrung, (this.bestandInDepotwaehrung!= null), (that.bestandInDepotwaehrung!= null))) {
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
            String theISIN;
            theISIN = this.getISIN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isin", theISIN), currentHashCode, theISIN, (this.isin!= null));
        }
        {
            String theWertpapierkennnummer;
            theWertpapierkennnummer = this.getWertpapierkennnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wertpapierkennnummer", theWertpapierkennnummer), currentHashCode, theWertpapierkennnummer, (this.wertpapierkennnummer!= null));
        }
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            String theWertpapierklassifikation;
            theWertpapierklassifikation = this.getWertpapierklassifikation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wertpapierklassifikation", theWertpapierklassifikation), currentHashCode, theWertpapierklassifikation, (this.wertpapierklassifikation!= null));
        }
        {
            BigDecimal theAnteile;
            theAnteile = this.getAnteile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anteile", theAnteile), currentHashCode, theAnteile, (this.anteile!= null));
        }
        {
            STWaehrungsschluessel theWaehrung;
            theWaehrung = this.getWaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waehrung", theWaehrung), currentHashCode, theWaehrung, (this.waehrung!= null));
        }
        {
            List<CTZusaetzlicheInvestmentDaten> theZusaetzlicheInvestmentDaten;
            theZusaetzlicheInvestmentDaten = (((this.zusaetzlicheInvestmentDaten!= null)&&(!this.zusaetzlicheInvestmentDaten.isEmpty()))?this.getZusaetzlicheInvestmentDaten():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zusaetzlicheInvestmentDaten", theZusaetzlicheInvestmentDaten), currentHashCode, theZusaetzlicheInvestmentDaten, ((this.zusaetzlicheInvestmentDaten!= null)&&(!this.zusaetzlicheInvestmentDaten.isEmpty())));
        }
        {
            CTDevisenkurs theDevisenkurs;
            theDevisenkurs = this.getDevisenkurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "devisenkurs", theDevisenkurs), currentHashCode, theDevisenkurs, (this.devisenkurs!= null));
        }
        {
            CTInvestmentkurs theInvestmentkurs;
            theInvestmentkurs = this.getInvestmentkurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "investmentkurs", theInvestmentkurs), currentHashCode, theInvestmentkurs, (this.investmentkurs!= null));
        }
        {
            CTBestand theBestandInInvestmentwaehrung;
            theBestandInInvestmentwaehrung = this.getBestandInInvestmentwaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestandInInvestmentwaehrung", theBestandInInvestmentwaehrung), currentHashCode, theBestandInInvestmentwaehrung, (this.bestandInInvestmentwaehrung!= null));
        }
        {
            CTBestand theBestandInDepotwaehrung;
            theBestandInDepotwaehrung = this.getBestandInDepotwaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestandInDepotwaehrung", theBestandInDepotwaehrung), currentHashCode, theBestandInDepotwaehrung, (this.bestandInDepotwaehrung!= null));
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
        if (draftCopy instanceof CTInvestment) {
            final CTInvestment copy = ((CTInvestment) draftCopy);
            {
                Boolean isinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.isin!= null));
                if (isinShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceISIN;
                    sourceISIN = this.getISIN();
                    String copyISIN = ((String) strategy.copy(LocatorUtils.property(locator, "isin", sourceISIN), sourceISIN, (this.isin!= null)));
                    copy.setISIN(copyISIN);
                } else {
                    if (isinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.isin = null;
                    }
                }
            }
            {
                Boolean wertpapierkennnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wertpapierkennnummer!= null));
                if (wertpapierkennnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWertpapierkennnummer;
                    sourceWertpapierkennnummer = this.getWertpapierkennnummer();
                    String copyWertpapierkennnummer = ((String) strategy.copy(LocatorUtils.property(locator, "wertpapierkennnummer", sourceWertpapierkennnummer), sourceWertpapierkennnummer, (this.wertpapierkennnummer!= null)));
                    copy.setWertpapierkennnummer(copyWertpapierkennnummer);
                } else {
                    if (wertpapierkennnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wertpapierkennnummer = null;
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
                Boolean wertpapierklassifikationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wertpapierklassifikation!= null));
                if (wertpapierklassifikationShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWertpapierklassifikation;
                    sourceWertpapierklassifikation = this.getWertpapierklassifikation();
                    String copyWertpapierklassifikation = ((String) strategy.copy(LocatorUtils.property(locator, "wertpapierklassifikation", sourceWertpapierklassifikation), sourceWertpapierklassifikation, (this.wertpapierklassifikation!= null)));
                    copy.setWertpapierklassifikation(copyWertpapierklassifikation);
                } else {
                    if (wertpapierklassifikationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wertpapierklassifikation = null;
                    }
                }
            }
            {
                Boolean anteileShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anteile!= null));
                if (anteileShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnteile;
                    sourceAnteile = this.getAnteile();
                    BigDecimal copyAnteile = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anteile", sourceAnteile), sourceAnteile, (this.anteile!= null)));
                    copy.setAnteile(copyAnteile);
                } else {
                    if (anteileShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anteile = null;
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
                Boolean zusaetzlicheInvestmentDatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zusaetzlicheInvestmentDaten!= null)&&(!this.zusaetzlicheInvestmentDaten.isEmpty())));
                if (zusaetzlicheInvestmentDatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTZusaetzlicheInvestmentDaten> sourceZusaetzlicheInvestmentDaten;
                    sourceZusaetzlicheInvestmentDaten = (((this.zusaetzlicheInvestmentDaten!= null)&&(!this.zusaetzlicheInvestmentDaten.isEmpty()))?this.getZusaetzlicheInvestmentDaten():null);
                    @SuppressWarnings("unchecked")
                    List<CTZusaetzlicheInvestmentDaten> copyZusaetzlicheInvestmentDaten = ((List<CTZusaetzlicheInvestmentDaten> ) strategy.copy(LocatorUtils.property(locator, "zusaetzlicheInvestmentDaten", sourceZusaetzlicheInvestmentDaten), sourceZusaetzlicheInvestmentDaten, ((this.zusaetzlicheInvestmentDaten!= null)&&(!this.zusaetzlicheInvestmentDaten.isEmpty()))));
                    copy.zusaetzlicheInvestmentDaten = null;
                    if (copyZusaetzlicheInvestmentDaten!= null) {
                        List<CTZusaetzlicheInvestmentDaten> uniqueZusaetzlicheInvestmentDatenl = copy.getZusaetzlicheInvestmentDaten();
                        uniqueZusaetzlicheInvestmentDatenl.addAll(copyZusaetzlicheInvestmentDaten);
                    }
                } else {
                    if (zusaetzlicheInvestmentDatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusaetzlicheInvestmentDaten = null;
                    }
                }
            }
            {
                Boolean devisenkursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.devisenkurs!= null));
                if (devisenkursShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTDevisenkurs sourceDevisenkurs;
                    sourceDevisenkurs = this.getDevisenkurs();
                    CTDevisenkurs copyDevisenkurs = ((CTDevisenkurs) strategy.copy(LocatorUtils.property(locator, "devisenkurs", sourceDevisenkurs), sourceDevisenkurs, (this.devisenkurs!= null)));
                    copy.setDevisenkurs(copyDevisenkurs);
                } else {
                    if (devisenkursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.devisenkurs = null;
                    }
                }
            }
            {
                Boolean investmentkursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.investmentkurs!= null));
                if (investmentkursShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTInvestmentkurs sourceInvestmentkurs;
                    sourceInvestmentkurs = this.getInvestmentkurs();
                    CTInvestmentkurs copyInvestmentkurs = ((CTInvestmentkurs) strategy.copy(LocatorUtils.property(locator, "investmentkurs", sourceInvestmentkurs), sourceInvestmentkurs, (this.investmentkurs!= null)));
                    copy.setInvestmentkurs(copyInvestmentkurs);
                } else {
                    if (investmentkursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.investmentkurs = null;
                    }
                }
            }
            {
                Boolean bestandInInvestmentwaehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestandInInvestmentwaehrung!= null));
                if (bestandInInvestmentwaehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBestand sourceBestandInInvestmentwaehrung;
                    sourceBestandInInvestmentwaehrung = this.getBestandInInvestmentwaehrung();
                    CTBestand copyBestandInInvestmentwaehrung = ((CTBestand) strategy.copy(LocatorUtils.property(locator, "bestandInInvestmentwaehrung", sourceBestandInInvestmentwaehrung), sourceBestandInInvestmentwaehrung, (this.bestandInInvestmentwaehrung!= null)));
                    copy.setBestandInInvestmentwaehrung(copyBestandInInvestmentwaehrung);
                } else {
                    if (bestandInInvestmentwaehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestandInInvestmentwaehrung = null;
                    }
                }
            }
            {
                Boolean bestandInDepotwaehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestandInDepotwaehrung!= null));
                if (bestandInDepotwaehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBestand sourceBestandInDepotwaehrung;
                    sourceBestandInDepotwaehrung = this.getBestandInDepotwaehrung();
                    CTBestand copyBestandInDepotwaehrung = ((CTBestand) strategy.copy(LocatorUtils.property(locator, "bestandInDepotwaehrung", sourceBestandInDepotwaehrung), sourceBestandInDepotwaehrung, (this.bestandInDepotwaehrung!= null)));
                    copy.setBestandInDepotwaehrung(copyBestandInDepotwaehrung);
                } else {
                    if (bestandInDepotwaehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestandInDepotwaehrung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTInvestment();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withISIN(String value) {
        setISIN(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withWertpapierkennnummer(String value) {
        setWertpapierkennnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withWertpapierklassifikation(String value) {
        setWertpapierklassifikation(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withAnteile(BigDecimal value) {
        setAnteile(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withZusaetzlicheInvestmentDaten(CTZusaetzlicheInvestmentDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheInvestmentDaten value: values) {
                getZusaetzlicheInvestmentDaten().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withZusaetzlicheInvestmentDaten(Collection<CTZusaetzlicheInvestmentDaten> values) {
        if (values!= null) {
            getZusaetzlicheInvestmentDaten().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withDevisenkurs(CTDevisenkurs value) {
        setDevisenkurs(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withInvestmentkurs(CTInvestmentkurs value) {
        setInvestmentkurs(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withBestandInInvestmentwaehrung(CTBestand value) {
        setBestandInInvestmentwaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withBestandInDepotwaehrung(CTBestand value) {
        setBestandInDepotwaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTInvestment withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
