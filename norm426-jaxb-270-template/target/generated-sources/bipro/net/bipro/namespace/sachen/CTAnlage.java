
package net.bipro.namespace.sachen;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTKaufpreis;
import net.bipro.namespace.allgemein.CTNeuwert;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STEObjektkennziffer;
import net.bipro.namespace.datentypen.STWerteinheit;
import net.bipro.namespace.partner.CTSicherungsglaeubiger;
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
 * Anlage wie z.B.  eine EDV-Anlage, eine Dreh-Maschine oder ein Drucker.
 * 
 * <p>Java class for CT_Anlage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Anlage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Objektkennziffer" type="{http://www.bipro.net/namespace/datentypen}STE_Objektkennziffer" minOccurs="0"/&gt;
 *         &lt;element name="Hersteller" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Typ" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Nummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Zubehoer" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="Baujahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Leistung" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="LeistungWerteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Inventarnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Kaufpreis" type="{http://www.bipro.net/namespace/allgemein}CT_Kaufpreis" minOccurs="0"/&gt;
 *         &lt;element name="Neuwert" type="{http://www.bipro.net/namespace/allgemein}CT_Neuwert" minOccurs="0"/&gt;
 *         &lt;element name="Betriebsstunden" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Sicherungsglaeubiger" type="{http://www.bipro.net/namespace/partner}CT_Sicherungsglaeubiger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Anlage", propOrder = {
    "objektkennziffer",
    "hersteller",
    "typ",
    "nummer",
    "zubehoer",
    "baujahr",
    "leistung",
    "leistungWerteinheit",
    "inventarnummer",
    "kaufpreis",
    "neuwert",
    "betriebsstunden",
    "sicherungsglaeubiger"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAnlage
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Objektkennziffer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEObjektkennziffer objektkennziffer;
    @XmlElement(name = "Hersteller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String hersteller;
    @XmlElement(name = "Typ")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String typ;
    @XmlElement(name = "Nummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String nummer;
    @XmlElement(name = "Zubehoer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String zubehoer;
    @XmlElement(name = "Baujahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer baujahr;
    @XmlElement(name = "Leistung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal leistung;
    @XmlElement(name = "LeistungWerteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit leistungWerteinheit;
    @XmlElement(name = "Inventarnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String inventarnummer;
    @XmlElement(name = "Kaufpreis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTKaufpreis kaufpreis;
    @XmlElement(name = "Neuwert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTNeuwert neuwert;
    @XmlElement(name = "Betriebsstunden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal betriebsstunden;
    @XmlElement(name = "Sicherungsglaeubiger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTSicherungsglaeubiger sicherungsglaeubiger;

    /**
     * Gets the value of the objektkennziffer property.
     * 
     * @return
     *     possible object is
     *     {@link STEObjektkennziffer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEObjektkennziffer getObjektkennziffer() {
        return objektkennziffer;
    }

    /**
     * Sets the value of the objektkennziffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEObjektkennziffer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setObjektkennziffer(STEObjektkennziffer value) {
        this.objektkennziffer = value;
    }

    /**
     * Gets the value of the hersteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getHersteller() {
        return hersteller;
    }

    /**
     * Sets the value of the hersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHersteller(String value) {
        this.hersteller = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the zubehoer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getZubehoer() {
        return zubehoer;
    }

    /**
     * Sets the value of the zubehoer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZubehoer(String value) {
        this.zubehoer = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getBaujahr() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBaujahr(Integer value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the leistung property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getLeistung() {
        return leistung;
    }

    /**
     * Sets the value of the leistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLeistung(BigDecimal value) {
        this.leistung = value;
    }

    /**
     * Gets the value of the leistungWerteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getLeistungWerteinheit() {
        return leistungWerteinheit;
    }

    /**
     * Sets the value of the leistungWerteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLeistungWerteinheit(STWerteinheit value) {
        this.leistungWerteinheit = value;
    }

    /**
     * Gets the value of the inventarnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getInventarnummer() {
        return inventarnummer;
    }

    /**
     * Sets the value of the inventarnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setInventarnummer(String value) {
        this.inventarnummer = value;
    }

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link CTKaufpreis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKaufpreis getKaufpreis() {
        return kaufpreis;
    }

    /**
     * Sets the value of the kaufpreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTKaufpreis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKaufpreis(CTKaufpreis value) {
        this.kaufpreis = value;
    }

    /**
     * Gets the value of the neuwert property.
     * 
     * @return
     *     possible object is
     *     {@link CTNeuwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTNeuwert getNeuwert() {
        return neuwert;
    }

    /**
     * Sets the value of the neuwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTNeuwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setNeuwert(CTNeuwert value) {
        this.neuwert = value;
    }

    /**
     * Gets the value of the betriebsstunden property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBetriebsstunden() {
        return betriebsstunden;
    }

    /**
     * Sets the value of the betriebsstunden property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBetriebsstunden(BigDecimal value) {
        this.betriebsstunden = value;
    }

    /**
     * Gets the value of the sicherungsglaeubiger property.
     * 
     * @return
     *     possible object is
     *     {@link CTSicherungsglaeubiger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTSicherungsglaeubiger getSicherungsglaeubiger() {
        return sicherungsglaeubiger;
    }

    /**
     * Sets the value of the sicherungsglaeubiger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSicherungsglaeubiger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSicherungsglaeubiger(CTSicherungsglaeubiger value) {
        this.sicherungsglaeubiger = value;
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
        final CTAnlage that = ((CTAnlage) object);
        {
            STEObjektkennziffer lhsObjektkennziffer;
            lhsObjektkennziffer = this.getObjektkennziffer();
            STEObjektkennziffer rhsObjektkennziffer;
            rhsObjektkennziffer = that.getObjektkennziffer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektkennziffer", lhsObjektkennziffer), LocatorUtils.property(thatLocator, "objektkennziffer", rhsObjektkennziffer), lhsObjektkennziffer, rhsObjektkennziffer, (this.objektkennziffer!= null), (that.objektkennziffer!= null))) {
                return false;
            }
        }
        {
            String lhsHersteller;
            lhsHersteller = this.getHersteller();
            String rhsHersteller;
            rhsHersteller = that.getHersteller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hersteller", lhsHersteller), LocatorUtils.property(thatLocator, "hersteller", rhsHersteller), lhsHersteller, rhsHersteller, (this.hersteller!= null), (that.hersteller!= null))) {
                return false;
            }
        }
        {
            String lhsTyp;
            lhsTyp = this.getTyp();
            String rhsTyp;
            rhsTyp = that.getTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typ", lhsTyp), LocatorUtils.property(thatLocator, "typ", rhsTyp), lhsTyp, rhsTyp, (this.typ!= null), (that.typ!= null))) {
                return false;
            }
        }
        {
            String lhsNummer;
            lhsNummer = this.getNummer();
            String rhsNummer;
            rhsNummer = that.getNummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nummer", lhsNummer), LocatorUtils.property(thatLocator, "nummer", rhsNummer), lhsNummer, rhsNummer, (this.nummer!= null), (that.nummer!= null))) {
                return false;
            }
        }
        {
            String lhsZubehoer;
            lhsZubehoer = this.getZubehoer();
            String rhsZubehoer;
            rhsZubehoer = that.getZubehoer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zubehoer", lhsZubehoer), LocatorUtils.property(thatLocator, "zubehoer", rhsZubehoer), lhsZubehoer, rhsZubehoer, (this.zubehoer!= null), (that.zubehoer!= null))) {
                return false;
            }
        }
        {
            Integer lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            Integer rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLeistung;
            lhsLeistung = this.getLeistung();
            BigDecimal rhsLeistung;
            rhsLeistung = that.getLeistung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leistung", lhsLeistung), LocatorUtils.property(thatLocator, "leistung", rhsLeistung), lhsLeistung, rhsLeistung, (this.leistung!= null), (that.leistung!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsLeistungWerteinheit;
            lhsLeistungWerteinheit = this.getLeistungWerteinheit();
            STWerteinheit rhsLeistungWerteinheit;
            rhsLeistungWerteinheit = that.getLeistungWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leistungWerteinheit", lhsLeistungWerteinheit), LocatorUtils.property(thatLocator, "leistungWerteinheit", rhsLeistungWerteinheit), lhsLeistungWerteinheit, rhsLeistungWerteinheit, (this.leistungWerteinheit!= null), (that.leistungWerteinheit!= null))) {
                return false;
            }
        }
        {
            String lhsInventarnummer;
            lhsInventarnummer = this.getInventarnummer();
            String rhsInventarnummer;
            rhsInventarnummer = that.getInventarnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventarnummer", lhsInventarnummer), LocatorUtils.property(thatLocator, "inventarnummer", rhsInventarnummer), lhsInventarnummer, rhsInventarnummer, (this.inventarnummer!= null), (that.inventarnummer!= null))) {
                return false;
            }
        }
        {
            CTKaufpreis lhsKaufpreis;
            lhsKaufpreis = this.getKaufpreis();
            CTKaufpreis rhsKaufpreis;
            rhsKaufpreis = that.getKaufpreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kaufpreis", lhsKaufpreis), LocatorUtils.property(thatLocator, "kaufpreis", rhsKaufpreis), lhsKaufpreis, rhsKaufpreis, (this.kaufpreis!= null), (that.kaufpreis!= null))) {
                return false;
            }
        }
        {
            CTNeuwert lhsNeuwert;
            lhsNeuwert = this.getNeuwert();
            CTNeuwert rhsNeuwert;
            rhsNeuwert = that.getNeuwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neuwert", lhsNeuwert), LocatorUtils.property(thatLocator, "neuwert", rhsNeuwert), lhsNeuwert, rhsNeuwert, (this.neuwert!= null), (that.neuwert!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBetriebsstunden;
            lhsBetriebsstunden = this.getBetriebsstunden();
            BigDecimal rhsBetriebsstunden;
            rhsBetriebsstunden = that.getBetriebsstunden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebsstunden", lhsBetriebsstunden), LocatorUtils.property(thatLocator, "betriebsstunden", rhsBetriebsstunden), lhsBetriebsstunden, rhsBetriebsstunden, (this.betriebsstunden!= null), (that.betriebsstunden!= null))) {
                return false;
            }
        }
        {
            CTSicherungsglaeubiger lhsSicherungsglaeubiger;
            lhsSicherungsglaeubiger = this.getSicherungsglaeubiger();
            CTSicherungsglaeubiger rhsSicherungsglaeubiger;
            rhsSicherungsglaeubiger = that.getSicherungsglaeubiger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherungsglaeubiger", lhsSicherungsglaeubiger), LocatorUtils.property(thatLocator, "sicherungsglaeubiger", rhsSicherungsglaeubiger), lhsSicherungsglaeubiger, rhsSicherungsglaeubiger, (this.sicherungsglaeubiger!= null), (that.sicherungsglaeubiger!= null))) {
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
            STEObjektkennziffer theObjektkennziffer;
            theObjektkennziffer = this.getObjektkennziffer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objektkennziffer", theObjektkennziffer), currentHashCode, theObjektkennziffer, (this.objektkennziffer!= null));
        }
        {
            String theHersteller;
            theHersteller = this.getHersteller();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hersteller", theHersteller), currentHashCode, theHersteller, (this.hersteller!= null));
        }
        {
            String theTyp;
            theTyp = this.getTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typ", theTyp), currentHashCode, theTyp, (this.typ!= null));
        }
        {
            String theNummer;
            theNummer = this.getNummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nummer", theNummer), currentHashCode, theNummer, (this.nummer!= null));
        }
        {
            String theZubehoer;
            theZubehoer = this.getZubehoer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zubehoer", theZubehoer), currentHashCode, theZubehoer, (this.zubehoer!= null));
        }
        {
            Integer theBaujahr;
            theBaujahr = this.getBaujahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baujahr", theBaujahr), currentHashCode, theBaujahr, (this.baujahr!= null));
        }
        {
            BigDecimal theLeistung;
            theLeistung = this.getLeistung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leistung", theLeistung), currentHashCode, theLeistung, (this.leistung!= null));
        }
        {
            STWerteinheit theLeistungWerteinheit;
            theLeistungWerteinheit = this.getLeistungWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leistungWerteinheit", theLeistungWerteinheit), currentHashCode, theLeistungWerteinheit, (this.leistungWerteinheit!= null));
        }
        {
            String theInventarnummer;
            theInventarnummer = this.getInventarnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventarnummer", theInventarnummer), currentHashCode, theInventarnummer, (this.inventarnummer!= null));
        }
        {
            CTKaufpreis theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kaufpreis", theKaufpreis), currentHashCode, theKaufpreis, (this.kaufpreis!= null));
        }
        {
            CTNeuwert theNeuwert;
            theNeuwert = this.getNeuwert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "neuwert", theNeuwert), currentHashCode, theNeuwert, (this.neuwert!= null));
        }
        {
            BigDecimal theBetriebsstunden;
            theBetriebsstunden = this.getBetriebsstunden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betriebsstunden", theBetriebsstunden), currentHashCode, theBetriebsstunden, (this.betriebsstunden!= null));
        }
        {
            CTSicherungsglaeubiger theSicherungsglaeubiger;
            theSicherungsglaeubiger = this.getSicherungsglaeubiger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherungsglaeubiger", theSicherungsglaeubiger), currentHashCode, theSicherungsglaeubiger, (this.sicherungsglaeubiger!= null));
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
        if (draftCopy instanceof CTAnlage) {
            final CTAnlage copy = ((CTAnlage) draftCopy);
            {
                Boolean objektkennzifferShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektkennziffer!= null));
                if (objektkennzifferShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEObjektkennziffer sourceObjektkennziffer;
                    sourceObjektkennziffer = this.getObjektkennziffer();
                    STEObjektkennziffer copyObjektkennziffer = ((STEObjektkennziffer) strategy.copy(LocatorUtils.property(locator, "objektkennziffer", sourceObjektkennziffer), sourceObjektkennziffer, (this.objektkennziffer!= null)));
                    copy.setObjektkennziffer(copyObjektkennziffer);
                } else {
                    if (objektkennzifferShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektkennziffer = null;
                    }
                }
            }
            {
                Boolean herstellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hersteller!= null));
                if (herstellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHersteller;
                    sourceHersteller = this.getHersteller();
                    String copyHersteller = ((String) strategy.copy(LocatorUtils.property(locator, "hersteller", sourceHersteller), sourceHersteller, (this.hersteller!= null)));
                    copy.setHersteller(copyHersteller);
                } else {
                    if (herstellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hersteller = null;
                    }
                }
            }
            {
                Boolean typShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.typ!= null));
                if (typShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTyp;
                    sourceTyp = this.getTyp();
                    String copyTyp = ((String) strategy.copy(LocatorUtils.property(locator, "typ", sourceTyp), sourceTyp, (this.typ!= null)));
                    copy.setTyp(copyTyp);
                } else {
                    if (typShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.typ = null;
                    }
                }
            }
            {
                Boolean nummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nummer!= null));
                if (nummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNummer;
                    sourceNummer = this.getNummer();
                    String copyNummer = ((String) strategy.copy(LocatorUtils.property(locator, "nummer", sourceNummer), sourceNummer, (this.nummer!= null)));
                    copy.setNummer(copyNummer);
                } else {
                    if (nummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nummer = null;
                    }
                }
            }
            {
                Boolean zubehoerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zubehoer!= null));
                if (zubehoerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZubehoer;
                    sourceZubehoer = this.getZubehoer();
                    String copyZubehoer = ((String) strategy.copy(LocatorUtils.property(locator, "zubehoer", sourceZubehoer), sourceZubehoer, (this.zubehoer!= null)));
                    copy.setZubehoer(copyZubehoer);
                } else {
                    if (zubehoerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zubehoer = null;
                    }
                }
            }
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceBaujahr;
                    sourceBaujahr = this.getBaujahr();
                    Integer copyBaujahr = ((Integer) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr, (this.baujahr!= null)));
                    copy.setBaujahr(copyBaujahr);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean leistungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leistung!= null));
                if (leistungShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLeistung;
                    sourceLeistung = this.getLeistung();
                    BigDecimal copyLeistung = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "leistung", sourceLeistung), sourceLeistung, (this.leistung!= null)));
                    copy.setLeistung(copyLeistung);
                } else {
                    if (leistungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leistung = null;
                    }
                }
            }
            {
                Boolean leistungWerteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leistungWerteinheit!= null));
                if (leistungWerteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceLeistungWerteinheit;
                    sourceLeistungWerteinheit = this.getLeistungWerteinheit();
                    STWerteinheit copyLeistungWerteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "leistungWerteinheit", sourceLeistungWerteinheit), sourceLeistungWerteinheit, (this.leistungWerteinheit!= null)));
                    copy.setLeistungWerteinheit(copyLeistungWerteinheit);
                } else {
                    if (leistungWerteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leistungWerteinheit = null;
                    }
                }
            }
            {
                Boolean inventarnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inventarnummer!= null));
                if (inventarnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInventarnummer;
                    sourceInventarnummer = this.getInventarnummer();
                    String copyInventarnummer = ((String) strategy.copy(LocatorUtils.property(locator, "inventarnummer", sourceInventarnummer), sourceInventarnummer, (this.inventarnummer!= null)));
                    copy.setInventarnummer(copyInventarnummer);
                } else {
                    if (inventarnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inventarnummer = null;
                    }
                }
            }
            {
                Boolean kaufpreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kaufpreis!= null));
                if (kaufpreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTKaufpreis sourceKaufpreis;
                    sourceKaufpreis = this.getKaufpreis();
                    CTKaufpreis copyKaufpreis = ((CTKaufpreis) strategy.copy(LocatorUtils.property(locator, "kaufpreis", sourceKaufpreis), sourceKaufpreis, (this.kaufpreis!= null)));
                    copy.setKaufpreis(copyKaufpreis);
                } else {
                    if (kaufpreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kaufpreis = null;
                    }
                }
            }
            {
                Boolean neuwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.neuwert!= null));
                if (neuwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTNeuwert sourceNeuwert;
                    sourceNeuwert = this.getNeuwert();
                    CTNeuwert copyNeuwert = ((CTNeuwert) strategy.copy(LocatorUtils.property(locator, "neuwert", sourceNeuwert), sourceNeuwert, (this.neuwert!= null)));
                    copy.setNeuwert(copyNeuwert);
                } else {
                    if (neuwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.neuwert = null;
                    }
                }
            }
            {
                Boolean betriebsstundenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betriebsstunden!= null));
                if (betriebsstundenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBetriebsstunden;
                    sourceBetriebsstunden = this.getBetriebsstunden();
                    BigDecimal copyBetriebsstunden = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "betriebsstunden", sourceBetriebsstunden), sourceBetriebsstunden, (this.betriebsstunden!= null)));
                    copy.setBetriebsstunden(copyBetriebsstunden);
                } else {
                    if (betriebsstundenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betriebsstunden = null;
                    }
                }
            }
            {
                Boolean sicherungsglaeubigerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sicherungsglaeubiger!= null));
                if (sicherungsglaeubigerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTSicherungsglaeubiger sourceSicherungsglaeubiger;
                    sourceSicherungsglaeubiger = this.getSicherungsglaeubiger();
                    CTSicherungsglaeubiger copySicherungsglaeubiger = ((CTSicherungsglaeubiger) strategy.copy(LocatorUtils.property(locator, "sicherungsglaeubiger", sourceSicherungsglaeubiger), sourceSicherungsglaeubiger, (this.sicherungsglaeubiger!= null)));
                    copy.setSicherungsglaeubiger(copySicherungsglaeubiger);
                } else {
                    if (sicherungsglaeubigerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherungsglaeubiger = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAnlage();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withObjektkennziffer(STEObjektkennziffer value) {
        setObjektkennziffer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withHersteller(String value) {
        setHersteller(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withTyp(String value) {
        setTyp(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withNummer(String value) {
        setNummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withZubehoer(String value) {
        setZubehoer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withBaujahr(Integer value) {
        setBaujahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withLeistung(BigDecimal value) {
        setLeistung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withLeistungWerteinheit(STWerteinheit value) {
        setLeistungWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withInventarnummer(String value) {
        setInventarnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withKaufpreis(CTKaufpreis value) {
        setKaufpreis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withNeuwert(CTNeuwert value) {
        setNeuwert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withBetriebsstunden(BigDecimal value) {
        setBetriebsstunden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withSicherungsglaeubiger(CTSicherungsglaeubiger value) {
        setSicherungsglaeubiger(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnlage withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
