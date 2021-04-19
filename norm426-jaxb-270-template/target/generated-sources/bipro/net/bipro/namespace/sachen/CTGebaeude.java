
package net.bipro.namespace.sachen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STBauartklasse;
import net.bipro.namespace.datentypen.STDachart;
import net.bipro.namespace.datentypen.STDenkmalschutzUmfang;
import net.bipro.namespace.datentypen.STEBauausfuehrung;
import net.bipro.namespace.datentypen.STGebaeudeart;
import net.bipro.namespace.datentypen.STMaterialLeitungswassernetz;
import net.bipro.namespace.datentypen.STUnterkellerung;
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
 * Beschreibung aller unmittelbaren Eigenschaften eines Gebäudes.
 * 
 * <p>Java class for CT_Gebaeude complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gebaeude"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Gebaeudeart" minOccurs="0"/&gt;
 *         &lt;element name="Bauartklasse" type="{http://www.bipro.net/namespace/datentypen}ST_Bauartklasse" minOccurs="0"/&gt;
 *         &lt;element name="Baujahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Kernsanierungsjahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Denkmalschutz" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlStockwerke" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlWohneinheiten" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Unterkellert" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Dachart" type="{http://www.bipro.net/namespace/datentypen}ST_Dachart" minOccurs="0"/&gt;
 *         &lt;element name="AusgebautesDach" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Bauausfuehrung" type="{http://www.bipro.net/namespace/datentypen}STE_Bauausfuehrung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlStellplaetzeImGebaeude" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="EinliegerwohnungVorhanden" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="RohbauBeginnDatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="RohbauEndeDatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="GebaeudeSonderausstattung" type="{http://www.bipro.net/namespace/sachen}CT_GebaeudeSonderausstattung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Objektanschrift" type="{http://www.bipro.net/namespace/sachen}CT_Objektanschrift" minOccurs="0"/&gt;
 *         &lt;element name="MaterialLeitungswassernetz" type="{http://www.bipro.net/namespace/datentypen}ST_MaterialLeitungswassernetz" minOccurs="0"/&gt;
 *         &lt;element name="Fertighaushersteller" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlGewerbeeinheiten" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Sanierung" type="{http://www.bipro.net/namespace/sachen}CT_Sanierung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Eigentuemer" type="{http://www.bipro.net/namespace/sachen}CT_Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vermieter" type="{http://www.bipro.net/namespace/sachen}CT_Vermieter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mieter" type="{http://www.bipro.net/namespace/sachen}CT_Mieter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UmbauterRaum" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Sicherungsglaeubiger" type="{http://www.bipro.net/namespace/partner}CT_Sicherungsglaeubiger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Kaufpreis" type="{http://www.bipro.net/namespace/allgemein}CT_Kaufpreis" minOccurs="0"/&gt;
 *         &lt;element name="DenkmalschutzUmfang" type="{http://www.bipro.net/namespace/datentypen}ST_DenkmalschutzUmfang" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ArtDerUnterkellerung" type="{http://www.bipro.net/namespace/datentypen}ST_Unterkellerung" minOccurs="0"/&gt;
 *         &lt;element name="Konstruktion" type="{http://www.bipro.net/namespace/sachen}CT_Konstruktion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gebaeude", propOrder = {
    "artID",
    "bauartklasse",
    "baujahr",
    "kernsanierungsjahr",
    "denkmalschutz",
    "anzahlStockwerke",
    "anzahlWohneinheiten",
    "unterkellert",
    "dachart",
    "ausgebautesDach",
    "bauausfuehrung",
    "anzahlStellplaetzeImGebaeude",
    "einliegerwohnungVorhanden",
    "rohbauBeginnDatum",
    "rohbauEndeDatum",
    "gebaeudeSonderausstattung",
    "objektanschrift",
    "materialLeitungswassernetz",
    "fertighaushersteller",
    "anzahlGewerbeeinheiten",
    "sanierung",
    "eigentuemer",
    "vermieter",
    "mieter",
    "umbauterRaum",
    "sicherungsglaeubiger",
    "kaufpreis",
    "denkmalschutzUmfang",
    "artDerUnterkellerung",
    "konstruktion"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGebaeude
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STGebaeudeart artID;
    @XmlElement(name = "Bauartklasse")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STBauartklasse bauartklasse;
    @XmlElement(name = "Baujahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer baujahr;
    @XmlElement(name = "Kernsanierungsjahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer kernsanierungsjahr;
    @XmlElement(name = "Denkmalschutz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean denkmalschutz;
    @XmlElement(name = "AnzahlStockwerke")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlStockwerke;
    @XmlElement(name = "AnzahlWohneinheiten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlWohneinheiten;
    @XmlElement(name = "Unterkellert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean unterkellert;
    @XmlElement(name = "Dachart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STDachart dachart;
    @XmlElement(name = "AusgebautesDach")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean ausgebautesDach;
    @XmlElement(name = "Bauausfuehrung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<STEBauausfuehrung> bauausfuehrung;
    @XmlElement(name = "AnzahlStellplaetzeImGebaeude")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlStellplaetzeImGebaeude;
    @XmlElement(name = "EinliegerwohnungVorhanden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean einliegerwohnungVorhanden;
    @XmlElement(name = "RohbauBeginnDatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String rohbauBeginnDatum;
    @XmlElement(name = "RohbauEndeDatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String rohbauEndeDatum;
    @XmlElement(name = "GebaeudeSonderausstattung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTGebaeudeSonderausstattung> gebaeudeSonderausstattung;
    @XmlElement(name = "Objektanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTObjektanschrift objektanschrift;
    @XmlElement(name = "MaterialLeitungswassernetz")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STMaterialLeitungswassernetz materialLeitungswassernetz;
    @XmlElement(name = "Fertighaushersteller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String fertighaushersteller;
    @XmlElement(name = "AnzahlGewerbeeinheiten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlGewerbeeinheiten;
    @XmlElement(name = "Sanierung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTSanierung> sanierung;
    @XmlElement(name = "Eigentuemer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTEigentuemer> eigentuemer;
    @XmlElement(name = "Vermieter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVermieter> vermieter;
    @XmlElement(name = "Mieter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTMieter> mieter;
    @XmlElement(name = "UmbauterRaum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer umbauterRaum;
    @XmlElement(name = "Sicherungsglaeubiger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTSicherungsglaeubiger> sicherungsglaeubiger;
    @XmlElement(name = "Kaufpreis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTKaufpreis kaufpreis;
    @XmlElement(name = "DenkmalschutzUmfang")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<STDenkmalschutzUmfang> denkmalschutzUmfang;
    @XmlElement(name = "ArtDerUnterkellerung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STUnterkellerung artDerUnterkellerung;
    @XmlElement(name = "Konstruktion")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTKonstruktion> konstruktion;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STGebaeudeart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STGebaeudeart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGebaeudeart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STGebaeudeart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the bauartklasse property.
     * 
     * @return
     *     possible object is
     *     {@link STBauartklasse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STBauartklasse getBauartklasse() {
        return bauartklasse;
    }

    /**
     * Sets the value of the bauartklasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBauartklasse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBauartklasse(STBauartklasse value) {
        this.bauartklasse = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBaujahr(Integer value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the kernsanierungsjahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getKernsanierungsjahr() {
        return kernsanierungsjahr;
    }

    /**
     * Sets the value of the kernsanierungsjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKernsanierungsjahr(Integer value) {
        this.kernsanierungsjahr = value;
    }

    /**
     * Gets the value of the denkmalschutz property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isDenkmalschutz() {
        return denkmalschutz;
    }

    /**
     * Sets the value of the denkmalschutz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDenkmalschutz(Boolean value) {
        this.denkmalschutz = value;
    }

    /**
     * Gets the value of the anzahlStockwerke property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlStockwerke() {
        return anzahlStockwerke;
    }

    /**
     * Sets the value of the anzahlStockwerke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlStockwerke(Integer value) {
        this.anzahlStockwerke = value;
    }

    /**
     * Gets the value of the anzahlWohneinheiten property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlWohneinheiten() {
        return anzahlWohneinheiten;
    }

    /**
     * Sets the value of the anzahlWohneinheiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlWohneinheiten(Integer value) {
        this.anzahlWohneinheiten = value;
    }

    /**
     * Gets the value of the unterkellert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isUnterkellert() {
        return unterkellert;
    }

    /**
     * Sets the value of the unterkellert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUnterkellert(Boolean value) {
        this.unterkellert = value;
    }

    /**
     * Gets the value of the dachart property.
     * 
     * @return
     *     possible object is
     *     {@link STDachart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STDachart getDachart() {
        return dachart;
    }

    /**
     * Sets the value of the dachart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDachart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDachart(STDachart value) {
        this.dachart = value;
    }

    /**
     * Gets the value of the ausgebautesDach property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isAusgebautesDach() {
        return ausgebautesDach;
    }

    /**
     * Sets the value of the ausgebautesDach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAusgebautesDach(Boolean value) {
        this.ausgebautesDach = value;
    }

    /**
     * Gets the value of the bauausfuehrung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bauausfuehrung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBauausfuehrung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STEBauausfuehrung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<STEBauausfuehrung> getBauausfuehrung() {
        if (bauausfuehrung == null) {
            bauausfuehrung = new ArrayList<STEBauausfuehrung>();
        }
        return this.bauausfuehrung;
    }

    /**
     * Gets the value of the anzahlStellplaetzeImGebaeude property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlStellplaetzeImGebaeude() {
        return anzahlStellplaetzeImGebaeude;
    }

    /**
     * Sets the value of the anzahlStellplaetzeImGebaeude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlStellplaetzeImGebaeude(Integer value) {
        this.anzahlStellplaetzeImGebaeude = value;
    }

    /**
     * Gets the value of the einliegerwohnungVorhanden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isEinliegerwohnungVorhanden() {
        return einliegerwohnungVorhanden;
    }

    /**
     * Sets the value of the einliegerwohnungVorhanden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinliegerwohnungVorhanden(Boolean value) {
        this.einliegerwohnungVorhanden = value;
    }

    /**
     * Gets the value of the rohbauBeginnDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getRohbauBeginnDatum() {
        return rohbauBeginnDatum;
    }

    /**
     * Sets the value of the rohbauBeginnDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setRohbauBeginnDatum(String value) {
        this.rohbauBeginnDatum = value;
    }

    /**
     * Gets the value of the rohbauEndeDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getRohbauEndeDatum() {
        return rohbauEndeDatum;
    }

    /**
     * Sets the value of the rohbauEndeDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setRohbauEndeDatum(String value) {
        this.rohbauEndeDatum = value;
    }

    /**
     * Gets the value of the gebaeudeSonderausstattung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebaeudeSonderausstattung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebaeudeSonderausstattung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTGebaeudeSonderausstattung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTGebaeudeSonderausstattung> getGebaeudeSonderausstattung() {
        if (gebaeudeSonderausstattung == null) {
            gebaeudeSonderausstattung = new ArrayList<CTGebaeudeSonderausstattung>();
        }
        return this.gebaeudeSonderausstattung;
    }

    /**
     * Gets the value of the objektanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link CTObjektanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift getObjektanschrift() {
        return objektanschrift;
    }

    /**
     * Sets the value of the objektanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTObjektanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setObjektanschrift(CTObjektanschrift value) {
        this.objektanschrift = value;
    }

    /**
     * Gets the value of the materialLeitungswassernetz property.
     * 
     * @return
     *     possible object is
     *     {@link STMaterialLeitungswassernetz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STMaterialLeitungswassernetz getMaterialLeitungswassernetz() {
        return materialLeitungswassernetz;
    }

    /**
     * Sets the value of the materialLeitungswassernetz property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMaterialLeitungswassernetz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMaterialLeitungswassernetz(STMaterialLeitungswassernetz value) {
        this.materialLeitungswassernetz = value;
    }

    /**
     * Gets the value of the fertighaushersteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFertighaushersteller() {
        return fertighaushersteller;
    }

    /**
     * Sets the value of the fertighaushersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFertighaushersteller(String value) {
        this.fertighaushersteller = value;
    }

    /**
     * Gets the value of the anzahlGewerbeeinheiten property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlGewerbeeinheiten() {
        return anzahlGewerbeeinheiten;
    }

    /**
     * Sets the value of the anzahlGewerbeeinheiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlGewerbeeinheiten(Integer value) {
        this.anzahlGewerbeeinheiten = value;
    }

    /**
     * Gets the value of the sanierung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanierung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanierung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSanierung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTSanierung> getSanierung() {
        if (sanierung == null) {
            sanierung = new ArrayList<CTSanierung>();
        }
        return this.sanierung;
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
     * Gets the value of the vermieter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vermieter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVermieter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVermieter }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVermieter> getVermieter() {
        if (vermieter == null) {
            vermieter = new ArrayList<CTVermieter>();
        }
        return this.vermieter;
    }

    /**
     * Gets the value of the mieter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mieter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMieter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMieter }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTMieter> getMieter() {
        if (mieter == null) {
            mieter = new ArrayList<CTMieter>();
        }
        return this.mieter;
    }

    /**
     * Gets the value of the umbauterRaum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getUmbauterRaum() {
        return umbauterRaum;
    }

    /**
     * Sets the value of the umbauterRaum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUmbauterRaum(Integer value) {
        this.umbauterRaum = value;
    }

    /**
     * Gets the value of the sicherungsglaeubiger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicherungsglaeubiger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSicherungsglaeubiger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSicherungsglaeubiger }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTSicherungsglaeubiger> getSicherungsglaeubiger() {
        if (sicherungsglaeubiger == null) {
            sicherungsglaeubiger = new ArrayList<CTSicherungsglaeubiger>();
        }
        return this.sicherungsglaeubiger;
    }

    /**
     * Gets the value of the kaufpreis property.
     * 
     * @return
     *     possible object is
     *     {@link CTKaufpreis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKaufpreis(CTKaufpreis value) {
        this.kaufpreis = value;
    }

    /**
     * Gets the value of the denkmalschutzUmfang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denkmalschutzUmfang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenkmalschutzUmfang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STDenkmalschutzUmfang }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<STDenkmalschutzUmfang> getDenkmalschutzUmfang() {
        if (denkmalschutzUmfang == null) {
            denkmalschutzUmfang = new ArrayList<STDenkmalschutzUmfang>();
        }
        return this.denkmalschutzUmfang;
    }

    /**
     * Gets the value of the artDerUnterkellerung property.
     * 
     * @return
     *     possible object is
     *     {@link STUnterkellerung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STUnterkellerung getArtDerUnterkellerung() {
        return artDerUnterkellerung;
    }

    /**
     * Sets the value of the artDerUnterkellerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STUnterkellerung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtDerUnterkellerung(STUnterkellerung value) {
        this.artDerUnterkellerung = value;
    }

    /**
     * Gets the value of the konstruktion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the konstruktion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKonstruktion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKonstruktion }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTKonstruktion> getKonstruktion() {
        if (konstruktion == null) {
            konstruktion = new ArrayList<CTKonstruktion>();
        }
        return this.konstruktion;
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
        final CTGebaeude that = ((CTGebaeude) object);
        {
            STGebaeudeart lhsArtID;
            lhsArtID = this.getArtID();
            STGebaeudeart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            STBauartklasse lhsBauartklasse;
            lhsBauartklasse = this.getBauartklasse();
            STBauartklasse rhsBauartklasse;
            rhsBauartklasse = that.getBauartklasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauartklasse", lhsBauartklasse), LocatorUtils.property(thatLocator, "bauartklasse", rhsBauartklasse), lhsBauartklasse, rhsBauartklasse, (this.bauartklasse!= null), (that.bauartklasse!= null))) {
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
            Integer lhsKernsanierungsjahr;
            lhsKernsanierungsjahr = this.getKernsanierungsjahr();
            Integer rhsKernsanierungsjahr;
            rhsKernsanierungsjahr = that.getKernsanierungsjahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kernsanierungsjahr", lhsKernsanierungsjahr), LocatorUtils.property(thatLocator, "kernsanierungsjahr", rhsKernsanierungsjahr), lhsKernsanierungsjahr, rhsKernsanierungsjahr, (this.kernsanierungsjahr!= null), (that.kernsanierungsjahr!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDenkmalschutz;
            lhsDenkmalschutz = this.isDenkmalschutz();
            Boolean rhsDenkmalschutz;
            rhsDenkmalschutz = that.isDenkmalschutz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutz", lhsDenkmalschutz), LocatorUtils.property(thatLocator, "denkmalschutz", rhsDenkmalschutz), lhsDenkmalschutz, rhsDenkmalschutz, (this.denkmalschutz!= null), (that.denkmalschutz!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlStockwerke;
            lhsAnzahlStockwerke = this.getAnzahlStockwerke();
            Integer rhsAnzahlStockwerke;
            rhsAnzahlStockwerke = that.getAnzahlStockwerke();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlStockwerke", lhsAnzahlStockwerke), LocatorUtils.property(thatLocator, "anzahlStockwerke", rhsAnzahlStockwerke), lhsAnzahlStockwerke, rhsAnzahlStockwerke, (this.anzahlStockwerke!= null), (that.anzahlStockwerke!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlWohneinheiten;
            lhsAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            Integer rhsAnzahlWohneinheiten;
            rhsAnzahlWohneinheiten = that.getAnzahlWohneinheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlWohneinheiten", lhsAnzahlWohneinheiten), LocatorUtils.property(thatLocator, "anzahlWohneinheiten", rhsAnzahlWohneinheiten), lhsAnzahlWohneinheiten, rhsAnzahlWohneinheiten, (this.anzahlWohneinheiten!= null), (that.anzahlWohneinheiten!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUnterkellert;
            lhsUnterkellert = this.isUnterkellert();
            Boolean rhsUnterkellert;
            rhsUnterkellert = that.isUnterkellert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterkellert", lhsUnterkellert), LocatorUtils.property(thatLocator, "unterkellert", rhsUnterkellert), lhsUnterkellert, rhsUnterkellert, (this.unterkellert!= null), (that.unterkellert!= null))) {
                return false;
            }
        }
        {
            STDachart lhsDachart;
            lhsDachart = this.getDachart();
            STDachart rhsDachart;
            rhsDachart = that.getDachart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dachart", lhsDachart), LocatorUtils.property(thatLocator, "dachart", rhsDachart), lhsDachart, rhsDachart, (this.dachart!= null), (that.dachart!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAusgebautesDach;
            lhsAusgebautesDach = this.isAusgebautesDach();
            Boolean rhsAusgebautesDach;
            rhsAusgebautesDach = that.isAusgebautesDach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausgebautesDach", lhsAusgebautesDach), LocatorUtils.property(thatLocator, "ausgebautesDach", rhsAusgebautesDach), lhsAusgebautesDach, rhsAusgebautesDach, (this.ausgebautesDach!= null), (that.ausgebautesDach!= null))) {
                return false;
            }
        }
        {
            List<STEBauausfuehrung> lhsBauausfuehrung;
            lhsBauausfuehrung = (((this.bauausfuehrung!= null)&&(!this.bauausfuehrung.isEmpty()))?this.getBauausfuehrung():null);
            List<STEBauausfuehrung> rhsBauausfuehrung;
            rhsBauausfuehrung = (((that.bauausfuehrung!= null)&&(!that.bauausfuehrung.isEmpty()))?that.getBauausfuehrung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauausfuehrung", lhsBauausfuehrung), LocatorUtils.property(thatLocator, "bauausfuehrung", rhsBauausfuehrung), lhsBauausfuehrung, rhsBauausfuehrung, ((this.bauausfuehrung!= null)&&(!this.bauausfuehrung.isEmpty())), ((that.bauausfuehrung!= null)&&(!that.bauausfuehrung.isEmpty())))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlStellplaetzeImGebaeude;
            lhsAnzahlStellplaetzeImGebaeude = this.getAnzahlStellplaetzeImGebaeude();
            Integer rhsAnzahlStellplaetzeImGebaeude;
            rhsAnzahlStellplaetzeImGebaeude = that.getAnzahlStellplaetzeImGebaeude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlStellplaetzeImGebaeude", lhsAnzahlStellplaetzeImGebaeude), LocatorUtils.property(thatLocator, "anzahlStellplaetzeImGebaeude", rhsAnzahlStellplaetzeImGebaeude), lhsAnzahlStellplaetzeImGebaeude, rhsAnzahlStellplaetzeImGebaeude, (this.anzahlStellplaetzeImGebaeude!= null), (that.anzahlStellplaetzeImGebaeude!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEinliegerwohnungVorhanden;
            lhsEinliegerwohnungVorhanden = this.isEinliegerwohnungVorhanden();
            Boolean rhsEinliegerwohnungVorhanden;
            rhsEinliegerwohnungVorhanden = that.isEinliegerwohnungVorhanden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einliegerwohnungVorhanden", lhsEinliegerwohnungVorhanden), LocatorUtils.property(thatLocator, "einliegerwohnungVorhanden", rhsEinliegerwohnungVorhanden), lhsEinliegerwohnungVorhanden, rhsEinliegerwohnungVorhanden, (this.einliegerwohnungVorhanden!= null), (that.einliegerwohnungVorhanden!= null))) {
                return false;
            }
        }
        {
            String lhsRohbauBeginnDatum;
            lhsRohbauBeginnDatum = this.getRohbauBeginnDatum();
            String rhsRohbauBeginnDatum;
            rhsRohbauBeginnDatum = that.getRohbauBeginnDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rohbauBeginnDatum", lhsRohbauBeginnDatum), LocatorUtils.property(thatLocator, "rohbauBeginnDatum", rhsRohbauBeginnDatum), lhsRohbauBeginnDatum, rhsRohbauBeginnDatum, (this.rohbauBeginnDatum!= null), (that.rohbauBeginnDatum!= null))) {
                return false;
            }
        }
        {
            String lhsRohbauEndeDatum;
            lhsRohbauEndeDatum = this.getRohbauEndeDatum();
            String rhsRohbauEndeDatum;
            rhsRohbauEndeDatum = that.getRohbauEndeDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rohbauEndeDatum", lhsRohbauEndeDatum), LocatorUtils.property(thatLocator, "rohbauEndeDatum", rhsRohbauEndeDatum), lhsRohbauEndeDatum, rhsRohbauEndeDatum, (this.rohbauEndeDatum!= null), (that.rohbauEndeDatum!= null))) {
                return false;
            }
        }
        {
            List<CTGebaeudeSonderausstattung> lhsGebaeudeSonderausstattung;
            lhsGebaeudeSonderausstattung = (((this.gebaeudeSonderausstattung!= null)&&(!this.gebaeudeSonderausstattung.isEmpty()))?this.getGebaeudeSonderausstattung():null);
            List<CTGebaeudeSonderausstattung> rhsGebaeudeSonderausstattung;
            rhsGebaeudeSonderausstattung = (((that.gebaeudeSonderausstattung!= null)&&(!that.gebaeudeSonderausstattung.isEmpty()))?that.getGebaeudeSonderausstattung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebaeudeSonderausstattung", lhsGebaeudeSonderausstattung), LocatorUtils.property(thatLocator, "gebaeudeSonderausstattung", rhsGebaeudeSonderausstattung), lhsGebaeudeSonderausstattung, rhsGebaeudeSonderausstattung, ((this.gebaeudeSonderausstattung!= null)&&(!this.gebaeudeSonderausstattung.isEmpty())), ((that.gebaeudeSonderausstattung!= null)&&(!that.gebaeudeSonderausstattung.isEmpty())))) {
                return false;
            }
        }
        {
            CTObjektanschrift lhsObjektanschrift;
            lhsObjektanschrift = this.getObjektanschrift();
            CTObjektanschrift rhsObjektanschrift;
            rhsObjektanschrift = that.getObjektanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektanschrift", lhsObjektanschrift), LocatorUtils.property(thatLocator, "objektanschrift", rhsObjektanschrift), lhsObjektanschrift, rhsObjektanschrift, (this.objektanschrift!= null), (that.objektanschrift!= null))) {
                return false;
            }
        }
        {
            STMaterialLeitungswassernetz lhsMaterialLeitungswassernetz;
            lhsMaterialLeitungswassernetz = this.getMaterialLeitungswassernetz();
            STMaterialLeitungswassernetz rhsMaterialLeitungswassernetz;
            rhsMaterialLeitungswassernetz = that.getMaterialLeitungswassernetz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "materialLeitungswassernetz", lhsMaterialLeitungswassernetz), LocatorUtils.property(thatLocator, "materialLeitungswassernetz", rhsMaterialLeitungswassernetz), lhsMaterialLeitungswassernetz, rhsMaterialLeitungswassernetz, (this.materialLeitungswassernetz!= null), (that.materialLeitungswassernetz!= null))) {
                return false;
            }
        }
        {
            String lhsFertighaushersteller;
            lhsFertighaushersteller = this.getFertighaushersteller();
            String rhsFertighaushersteller;
            rhsFertighaushersteller = that.getFertighaushersteller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fertighaushersteller", lhsFertighaushersteller), LocatorUtils.property(thatLocator, "fertighaushersteller", rhsFertighaushersteller), lhsFertighaushersteller, rhsFertighaushersteller, (this.fertighaushersteller!= null), (that.fertighaushersteller!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlGewerbeeinheiten;
            lhsAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
            Integer rhsAnzahlGewerbeeinheiten;
            rhsAnzahlGewerbeeinheiten = that.getAnzahlGewerbeeinheiten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGewerbeeinheiten", lhsAnzahlGewerbeeinheiten), LocatorUtils.property(thatLocator, "anzahlGewerbeeinheiten", rhsAnzahlGewerbeeinheiten), lhsAnzahlGewerbeeinheiten, rhsAnzahlGewerbeeinheiten, (this.anzahlGewerbeeinheiten!= null), (that.anzahlGewerbeeinheiten!= null))) {
                return false;
            }
        }
        {
            List<CTSanierung> lhsSanierung;
            lhsSanierung = (((this.sanierung!= null)&&(!this.sanierung.isEmpty()))?this.getSanierung():null);
            List<CTSanierung> rhsSanierung;
            rhsSanierung = (((that.sanierung!= null)&&(!that.sanierung.isEmpty()))?that.getSanierung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sanierung", lhsSanierung), LocatorUtils.property(thatLocator, "sanierung", rhsSanierung), lhsSanierung, rhsSanierung, ((this.sanierung!= null)&&(!this.sanierung.isEmpty())), ((that.sanierung!= null)&&(!that.sanierung.isEmpty())))) {
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
        {
            List<CTVermieter> lhsVermieter;
            lhsVermieter = (((this.vermieter!= null)&&(!this.vermieter.isEmpty()))?this.getVermieter():null);
            List<CTVermieter> rhsVermieter;
            rhsVermieter = (((that.vermieter!= null)&&(!that.vermieter.isEmpty()))?that.getVermieter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermieter", lhsVermieter), LocatorUtils.property(thatLocator, "vermieter", rhsVermieter), lhsVermieter, rhsVermieter, ((this.vermieter!= null)&&(!this.vermieter.isEmpty())), ((that.vermieter!= null)&&(!that.vermieter.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTMieter> lhsMieter;
            lhsMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
            List<CTMieter> rhsMieter;
            rhsMieter = (((that.mieter!= null)&&(!that.mieter.isEmpty()))?that.getMieter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieter", lhsMieter), LocatorUtils.property(thatLocator, "mieter", rhsMieter), lhsMieter, rhsMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty())), ((that.mieter!= null)&&(!that.mieter.isEmpty())))) {
                return false;
            }
        }
        {
            Integer lhsUmbauterRaum;
            lhsUmbauterRaum = this.getUmbauterRaum();
            Integer rhsUmbauterRaum;
            rhsUmbauterRaum = that.getUmbauterRaum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umbauterRaum", lhsUmbauterRaum), LocatorUtils.property(thatLocator, "umbauterRaum", rhsUmbauterRaum), lhsUmbauterRaum, rhsUmbauterRaum, (this.umbauterRaum!= null), (that.umbauterRaum!= null))) {
                return false;
            }
        }
        {
            List<CTSicherungsglaeubiger> lhsSicherungsglaeubiger;
            lhsSicherungsglaeubiger = (((this.sicherungsglaeubiger!= null)&&(!this.sicherungsglaeubiger.isEmpty()))?this.getSicherungsglaeubiger():null);
            List<CTSicherungsglaeubiger> rhsSicherungsglaeubiger;
            rhsSicherungsglaeubiger = (((that.sicherungsglaeubiger!= null)&&(!that.sicherungsglaeubiger.isEmpty()))?that.getSicherungsglaeubiger():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherungsglaeubiger", lhsSicherungsglaeubiger), LocatorUtils.property(thatLocator, "sicherungsglaeubiger", rhsSicherungsglaeubiger), lhsSicherungsglaeubiger, rhsSicherungsglaeubiger, ((this.sicherungsglaeubiger!= null)&&(!this.sicherungsglaeubiger.isEmpty())), ((that.sicherungsglaeubiger!= null)&&(!that.sicherungsglaeubiger.isEmpty())))) {
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
            List<STDenkmalschutzUmfang> lhsDenkmalschutzUmfang;
            lhsDenkmalschutzUmfang = (((this.denkmalschutzUmfang!= null)&&(!this.denkmalschutzUmfang.isEmpty()))?this.getDenkmalschutzUmfang():null);
            List<STDenkmalschutzUmfang> rhsDenkmalschutzUmfang;
            rhsDenkmalschutzUmfang = (((that.denkmalschutzUmfang!= null)&&(!that.denkmalschutzUmfang.isEmpty()))?that.getDenkmalschutzUmfang():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denkmalschutzUmfang", lhsDenkmalschutzUmfang), LocatorUtils.property(thatLocator, "denkmalschutzUmfang", rhsDenkmalschutzUmfang), lhsDenkmalschutzUmfang, rhsDenkmalschutzUmfang, ((this.denkmalschutzUmfang!= null)&&(!this.denkmalschutzUmfang.isEmpty())), ((that.denkmalschutzUmfang!= null)&&(!that.denkmalschutzUmfang.isEmpty())))) {
                return false;
            }
        }
        {
            STUnterkellerung lhsArtDerUnterkellerung;
            lhsArtDerUnterkellerung = this.getArtDerUnterkellerung();
            STUnterkellerung rhsArtDerUnterkellerung;
            rhsArtDerUnterkellerung = that.getArtDerUnterkellerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artDerUnterkellerung", lhsArtDerUnterkellerung), LocatorUtils.property(thatLocator, "artDerUnterkellerung", rhsArtDerUnterkellerung), lhsArtDerUnterkellerung, rhsArtDerUnterkellerung, (this.artDerUnterkellerung!= null), (that.artDerUnterkellerung!= null))) {
                return false;
            }
        }
        {
            List<CTKonstruktion> lhsKonstruktion;
            lhsKonstruktion = (((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))?this.getKonstruktion():null);
            List<CTKonstruktion> rhsKonstruktion;
            rhsKonstruktion = (((that.konstruktion!= null)&&(!that.konstruktion.isEmpty()))?that.getKonstruktion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "konstruktion", lhsKonstruktion), LocatorUtils.property(thatLocator, "konstruktion", rhsKonstruktion), lhsKonstruktion, rhsKonstruktion, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty())), ((that.konstruktion!= null)&&(!that.konstruktion.isEmpty())))) {
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
            STGebaeudeart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            STBauartklasse theBauartklasse;
            theBauartklasse = this.getBauartklasse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bauartklasse", theBauartklasse), currentHashCode, theBauartklasse, (this.bauartklasse!= null));
        }
        {
            Integer theBaujahr;
            theBaujahr = this.getBaujahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baujahr", theBaujahr), currentHashCode, theBaujahr, (this.baujahr!= null));
        }
        {
            Integer theKernsanierungsjahr;
            theKernsanierungsjahr = this.getKernsanierungsjahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kernsanierungsjahr", theKernsanierungsjahr), currentHashCode, theKernsanierungsjahr, (this.kernsanierungsjahr!= null));
        }
        {
            Boolean theDenkmalschutz;
            theDenkmalschutz = this.isDenkmalschutz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "denkmalschutz", theDenkmalschutz), currentHashCode, theDenkmalschutz, (this.denkmalschutz!= null));
        }
        {
            Integer theAnzahlStockwerke;
            theAnzahlStockwerke = this.getAnzahlStockwerke();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlStockwerke", theAnzahlStockwerke), currentHashCode, theAnzahlStockwerke, (this.anzahlStockwerke!= null));
        }
        {
            Integer theAnzahlWohneinheiten;
            theAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlWohneinheiten", theAnzahlWohneinheiten), currentHashCode, theAnzahlWohneinheiten, (this.anzahlWohneinheiten!= null));
        }
        {
            Boolean theUnterkellert;
            theUnterkellert = this.isUnterkellert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unterkellert", theUnterkellert), currentHashCode, theUnterkellert, (this.unterkellert!= null));
        }
        {
            STDachart theDachart;
            theDachart = this.getDachart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dachart", theDachart), currentHashCode, theDachart, (this.dachart!= null));
        }
        {
            Boolean theAusgebautesDach;
            theAusgebautesDach = this.isAusgebautesDach();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausgebautesDach", theAusgebautesDach), currentHashCode, theAusgebautesDach, (this.ausgebautesDach!= null));
        }
        {
            List<STEBauausfuehrung> theBauausfuehrung;
            theBauausfuehrung = (((this.bauausfuehrung!= null)&&(!this.bauausfuehrung.isEmpty()))?this.getBauausfuehrung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bauausfuehrung", theBauausfuehrung), currentHashCode, theBauausfuehrung, ((this.bauausfuehrung!= null)&&(!this.bauausfuehrung.isEmpty())));
        }
        {
            Integer theAnzahlStellplaetzeImGebaeude;
            theAnzahlStellplaetzeImGebaeude = this.getAnzahlStellplaetzeImGebaeude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlStellplaetzeImGebaeude", theAnzahlStellplaetzeImGebaeude), currentHashCode, theAnzahlStellplaetzeImGebaeude, (this.anzahlStellplaetzeImGebaeude!= null));
        }
        {
            Boolean theEinliegerwohnungVorhanden;
            theEinliegerwohnungVorhanden = this.isEinliegerwohnungVorhanden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einliegerwohnungVorhanden", theEinliegerwohnungVorhanden), currentHashCode, theEinliegerwohnungVorhanden, (this.einliegerwohnungVorhanden!= null));
        }
        {
            String theRohbauBeginnDatum;
            theRohbauBeginnDatum = this.getRohbauBeginnDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rohbauBeginnDatum", theRohbauBeginnDatum), currentHashCode, theRohbauBeginnDatum, (this.rohbauBeginnDatum!= null));
        }
        {
            String theRohbauEndeDatum;
            theRohbauEndeDatum = this.getRohbauEndeDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rohbauEndeDatum", theRohbauEndeDatum), currentHashCode, theRohbauEndeDatum, (this.rohbauEndeDatum!= null));
        }
        {
            List<CTGebaeudeSonderausstattung> theGebaeudeSonderausstattung;
            theGebaeudeSonderausstattung = (((this.gebaeudeSonderausstattung!= null)&&(!this.gebaeudeSonderausstattung.isEmpty()))?this.getGebaeudeSonderausstattung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gebaeudeSonderausstattung", theGebaeudeSonderausstattung), currentHashCode, theGebaeudeSonderausstattung, ((this.gebaeudeSonderausstattung!= null)&&(!this.gebaeudeSonderausstattung.isEmpty())));
        }
        {
            CTObjektanschrift theObjektanschrift;
            theObjektanschrift = this.getObjektanschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objektanschrift", theObjektanschrift), currentHashCode, theObjektanschrift, (this.objektanschrift!= null));
        }
        {
            STMaterialLeitungswassernetz theMaterialLeitungswassernetz;
            theMaterialLeitungswassernetz = this.getMaterialLeitungswassernetz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "materialLeitungswassernetz", theMaterialLeitungswassernetz), currentHashCode, theMaterialLeitungswassernetz, (this.materialLeitungswassernetz!= null));
        }
        {
            String theFertighaushersteller;
            theFertighaushersteller = this.getFertighaushersteller();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fertighaushersteller", theFertighaushersteller), currentHashCode, theFertighaushersteller, (this.fertighaushersteller!= null));
        }
        {
            Integer theAnzahlGewerbeeinheiten;
            theAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlGewerbeeinheiten", theAnzahlGewerbeeinheiten), currentHashCode, theAnzahlGewerbeeinheiten, (this.anzahlGewerbeeinheiten!= null));
        }
        {
            List<CTSanierung> theSanierung;
            theSanierung = (((this.sanierung!= null)&&(!this.sanierung.isEmpty()))?this.getSanierung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sanierung", theSanierung), currentHashCode, theSanierung, ((this.sanierung!= null)&&(!this.sanierung.isEmpty())));
        }
        {
            List<CTEigentuemer> theEigentuemer;
            theEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eigentuemer", theEigentuemer), currentHashCode, theEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())));
        }
        {
            List<CTVermieter> theVermieter;
            theVermieter = (((this.vermieter!= null)&&(!this.vermieter.isEmpty()))?this.getVermieter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermieter", theVermieter), currentHashCode, theVermieter, ((this.vermieter!= null)&&(!this.vermieter.isEmpty())));
        }
        {
            List<CTMieter> theMieter;
            theMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mieter", theMieter), currentHashCode, theMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty())));
        }
        {
            Integer theUmbauterRaum;
            theUmbauterRaum = this.getUmbauterRaum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "umbauterRaum", theUmbauterRaum), currentHashCode, theUmbauterRaum, (this.umbauterRaum!= null));
        }
        {
            List<CTSicherungsglaeubiger> theSicherungsglaeubiger;
            theSicherungsglaeubiger = (((this.sicherungsglaeubiger!= null)&&(!this.sicherungsglaeubiger.isEmpty()))?this.getSicherungsglaeubiger():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherungsglaeubiger", theSicherungsglaeubiger), currentHashCode, theSicherungsglaeubiger, ((this.sicherungsglaeubiger!= null)&&(!this.sicherungsglaeubiger.isEmpty())));
        }
        {
            CTKaufpreis theKaufpreis;
            theKaufpreis = this.getKaufpreis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kaufpreis", theKaufpreis), currentHashCode, theKaufpreis, (this.kaufpreis!= null));
        }
        {
            List<STDenkmalschutzUmfang> theDenkmalschutzUmfang;
            theDenkmalschutzUmfang = (((this.denkmalschutzUmfang!= null)&&(!this.denkmalschutzUmfang.isEmpty()))?this.getDenkmalschutzUmfang():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "denkmalschutzUmfang", theDenkmalschutzUmfang), currentHashCode, theDenkmalschutzUmfang, ((this.denkmalschutzUmfang!= null)&&(!this.denkmalschutzUmfang.isEmpty())));
        }
        {
            STUnterkellerung theArtDerUnterkellerung;
            theArtDerUnterkellerung = this.getArtDerUnterkellerung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artDerUnterkellerung", theArtDerUnterkellerung), currentHashCode, theArtDerUnterkellerung, (this.artDerUnterkellerung!= null));
        }
        {
            List<CTKonstruktion> theKonstruktion;
            theKonstruktion = (((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))?this.getKonstruktion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "konstruktion", theKonstruktion), currentHashCode, theKonstruktion, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty())));
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
        if (draftCopy instanceof CTGebaeude) {
            final CTGebaeude copy = ((CTGebaeude) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGebaeudeart sourceArtID;
                    sourceArtID = this.getArtID();
                    STGebaeudeart copyArtID = ((STGebaeudeart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean bauartklasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bauartklasse!= null));
                if (bauartklasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBauartklasse sourceBauartklasse;
                    sourceBauartklasse = this.getBauartklasse();
                    STBauartklasse copyBauartklasse = ((STBauartklasse) strategy.copy(LocatorUtils.property(locator, "bauartklasse", sourceBauartklasse), sourceBauartklasse, (this.bauartklasse!= null)));
                    copy.setBauartklasse(copyBauartklasse);
                } else {
                    if (bauartklasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bauartklasse = null;
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
                Boolean kernsanierungsjahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kernsanierungsjahr!= null));
                if (kernsanierungsjahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceKernsanierungsjahr;
                    sourceKernsanierungsjahr = this.getKernsanierungsjahr();
                    Integer copyKernsanierungsjahr = ((Integer) strategy.copy(LocatorUtils.property(locator, "kernsanierungsjahr", sourceKernsanierungsjahr), sourceKernsanierungsjahr, (this.kernsanierungsjahr!= null)));
                    copy.setKernsanierungsjahr(copyKernsanierungsjahr);
                } else {
                    if (kernsanierungsjahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kernsanierungsjahr = null;
                    }
                }
            }
            {
                Boolean denkmalschutzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.denkmalschutz!= null));
                if (denkmalschutzShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDenkmalschutz;
                    sourceDenkmalschutz = this.isDenkmalschutz();
                    Boolean copyDenkmalschutz = ((Boolean) strategy.copy(LocatorUtils.property(locator, "denkmalschutz", sourceDenkmalschutz), sourceDenkmalschutz, (this.denkmalschutz!= null)));
                    copy.setDenkmalschutz(copyDenkmalschutz);
                } else {
                    if (denkmalschutzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.denkmalschutz = null;
                    }
                }
            }
            {
                Boolean anzahlStockwerkeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlStockwerke!= null));
                if (anzahlStockwerkeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlStockwerke;
                    sourceAnzahlStockwerke = this.getAnzahlStockwerke();
                    Integer copyAnzahlStockwerke = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlStockwerke", sourceAnzahlStockwerke), sourceAnzahlStockwerke, (this.anzahlStockwerke!= null)));
                    copy.setAnzahlStockwerke(copyAnzahlStockwerke);
                } else {
                    if (anzahlStockwerkeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlStockwerke = null;
                    }
                }
            }
            {
                Boolean anzahlWohneinheitenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlWohneinheiten!= null));
                if (anzahlWohneinheitenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlWohneinheiten;
                    sourceAnzahlWohneinheiten = this.getAnzahlWohneinheiten();
                    Integer copyAnzahlWohneinheiten = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlWohneinheiten", sourceAnzahlWohneinheiten), sourceAnzahlWohneinheiten, (this.anzahlWohneinheiten!= null)));
                    copy.setAnzahlWohneinheiten(copyAnzahlWohneinheiten);
                } else {
                    if (anzahlWohneinheitenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlWohneinheiten = null;
                    }
                }
            }
            {
                Boolean unterkellertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unterkellert!= null));
                if (unterkellertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceUnterkellert;
                    sourceUnterkellert = this.isUnterkellert();
                    Boolean copyUnterkellert = ((Boolean) strategy.copy(LocatorUtils.property(locator, "unterkellert", sourceUnterkellert), sourceUnterkellert, (this.unterkellert!= null)));
                    copy.setUnterkellert(copyUnterkellert);
                } else {
                    if (unterkellertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unterkellert = null;
                    }
                }
            }
            {
                Boolean dachartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dachart!= null));
                if (dachartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STDachart sourceDachart;
                    sourceDachart = this.getDachart();
                    STDachart copyDachart = ((STDachart) strategy.copy(LocatorUtils.property(locator, "dachart", sourceDachart), sourceDachart, (this.dachart!= null)));
                    copy.setDachart(copyDachart);
                } else {
                    if (dachartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dachart = null;
                    }
                }
            }
            {
                Boolean ausgebautesDachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausgebautesDach!= null));
                if (ausgebautesDachShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAusgebautesDach;
                    sourceAusgebautesDach = this.isAusgebautesDach();
                    Boolean copyAusgebautesDach = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ausgebautesDach", sourceAusgebautesDach), sourceAusgebautesDach, (this.ausgebautesDach!= null)));
                    copy.setAusgebautesDach(copyAusgebautesDach);
                } else {
                    if (ausgebautesDachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausgebautesDach = null;
                    }
                }
            }
            {
                Boolean bauausfuehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bauausfuehrung!= null)&&(!this.bauausfuehrung.isEmpty())));
                if (bauausfuehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STEBauausfuehrung> sourceBauausfuehrung;
                    sourceBauausfuehrung = (((this.bauausfuehrung!= null)&&(!this.bauausfuehrung.isEmpty()))?this.getBauausfuehrung():null);
                    @SuppressWarnings("unchecked")
                    List<STEBauausfuehrung> copyBauausfuehrung = ((List<STEBauausfuehrung> ) strategy.copy(LocatorUtils.property(locator, "bauausfuehrung", sourceBauausfuehrung), sourceBauausfuehrung, ((this.bauausfuehrung!= null)&&(!this.bauausfuehrung.isEmpty()))));
                    copy.bauausfuehrung = null;
                    if (copyBauausfuehrung!= null) {
                        List<STEBauausfuehrung> uniqueBauausfuehrungl = copy.getBauausfuehrung();
                        uniqueBauausfuehrungl.addAll(copyBauausfuehrung);
                    }
                } else {
                    if (bauausfuehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bauausfuehrung = null;
                    }
                }
            }
            {
                Boolean anzahlStellplaetzeImGebaeudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlStellplaetzeImGebaeude!= null));
                if (anzahlStellplaetzeImGebaeudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlStellplaetzeImGebaeude;
                    sourceAnzahlStellplaetzeImGebaeude = this.getAnzahlStellplaetzeImGebaeude();
                    Integer copyAnzahlStellplaetzeImGebaeude = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlStellplaetzeImGebaeude", sourceAnzahlStellplaetzeImGebaeude), sourceAnzahlStellplaetzeImGebaeude, (this.anzahlStellplaetzeImGebaeude!= null)));
                    copy.setAnzahlStellplaetzeImGebaeude(copyAnzahlStellplaetzeImGebaeude);
                } else {
                    if (anzahlStellplaetzeImGebaeudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlStellplaetzeImGebaeude = null;
                    }
                }
            }
            {
                Boolean einliegerwohnungVorhandenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einliegerwohnungVorhanden!= null));
                if (einliegerwohnungVorhandenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEinliegerwohnungVorhanden;
                    sourceEinliegerwohnungVorhanden = this.isEinliegerwohnungVorhanden();
                    Boolean copyEinliegerwohnungVorhanden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einliegerwohnungVorhanden", sourceEinliegerwohnungVorhanden), sourceEinliegerwohnungVorhanden, (this.einliegerwohnungVorhanden!= null)));
                    copy.setEinliegerwohnungVorhanden(copyEinliegerwohnungVorhanden);
                } else {
                    if (einliegerwohnungVorhandenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einliegerwohnungVorhanden = null;
                    }
                }
            }
            {
                Boolean rohbauBeginnDatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rohbauBeginnDatum!= null));
                if (rohbauBeginnDatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRohbauBeginnDatum;
                    sourceRohbauBeginnDatum = this.getRohbauBeginnDatum();
                    String copyRohbauBeginnDatum = ((String) strategy.copy(LocatorUtils.property(locator, "rohbauBeginnDatum", sourceRohbauBeginnDatum), sourceRohbauBeginnDatum, (this.rohbauBeginnDatum!= null)));
                    copy.setRohbauBeginnDatum(copyRohbauBeginnDatum);
                } else {
                    if (rohbauBeginnDatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rohbauBeginnDatum = null;
                    }
                }
            }
            {
                Boolean rohbauEndeDatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rohbauEndeDatum!= null));
                if (rohbauEndeDatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRohbauEndeDatum;
                    sourceRohbauEndeDatum = this.getRohbauEndeDatum();
                    String copyRohbauEndeDatum = ((String) strategy.copy(LocatorUtils.property(locator, "rohbauEndeDatum", sourceRohbauEndeDatum), sourceRohbauEndeDatum, (this.rohbauEndeDatum!= null)));
                    copy.setRohbauEndeDatum(copyRohbauEndeDatum);
                } else {
                    if (rohbauEndeDatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rohbauEndeDatum = null;
                    }
                }
            }
            {
                Boolean gebaeudeSonderausstattungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gebaeudeSonderausstattung!= null)&&(!this.gebaeudeSonderausstattung.isEmpty())));
                if (gebaeudeSonderausstattungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTGebaeudeSonderausstattung> sourceGebaeudeSonderausstattung;
                    sourceGebaeudeSonderausstattung = (((this.gebaeudeSonderausstattung!= null)&&(!this.gebaeudeSonderausstattung.isEmpty()))?this.getGebaeudeSonderausstattung():null);
                    @SuppressWarnings("unchecked")
                    List<CTGebaeudeSonderausstattung> copyGebaeudeSonderausstattung = ((List<CTGebaeudeSonderausstattung> ) strategy.copy(LocatorUtils.property(locator, "gebaeudeSonderausstattung", sourceGebaeudeSonderausstattung), sourceGebaeudeSonderausstattung, ((this.gebaeudeSonderausstattung!= null)&&(!this.gebaeudeSonderausstattung.isEmpty()))));
                    copy.gebaeudeSonderausstattung = null;
                    if (copyGebaeudeSonderausstattung!= null) {
                        List<CTGebaeudeSonderausstattung> uniqueGebaeudeSonderausstattungl = copy.getGebaeudeSonderausstattung();
                        uniqueGebaeudeSonderausstattungl.addAll(copyGebaeudeSonderausstattung);
                    }
                } else {
                    if (gebaeudeSonderausstattungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gebaeudeSonderausstattung = null;
                    }
                }
            }
            {
                Boolean objektanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektanschrift!= null));
                if (objektanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTObjektanschrift sourceObjektanschrift;
                    sourceObjektanschrift = this.getObjektanschrift();
                    CTObjektanschrift copyObjektanschrift = ((CTObjektanschrift) strategy.copy(LocatorUtils.property(locator, "objektanschrift", sourceObjektanschrift), sourceObjektanschrift, (this.objektanschrift!= null)));
                    copy.setObjektanschrift(copyObjektanschrift);
                } else {
                    if (objektanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektanschrift = null;
                    }
                }
            }
            {
                Boolean materialLeitungswassernetzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.materialLeitungswassernetz!= null));
                if (materialLeitungswassernetzShouldBeCopiedAndSet == Boolean.TRUE) {
                    STMaterialLeitungswassernetz sourceMaterialLeitungswassernetz;
                    sourceMaterialLeitungswassernetz = this.getMaterialLeitungswassernetz();
                    STMaterialLeitungswassernetz copyMaterialLeitungswassernetz = ((STMaterialLeitungswassernetz) strategy.copy(LocatorUtils.property(locator, "materialLeitungswassernetz", sourceMaterialLeitungswassernetz), sourceMaterialLeitungswassernetz, (this.materialLeitungswassernetz!= null)));
                    copy.setMaterialLeitungswassernetz(copyMaterialLeitungswassernetz);
                } else {
                    if (materialLeitungswassernetzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.materialLeitungswassernetz = null;
                    }
                }
            }
            {
                Boolean fertighausherstellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fertighaushersteller!= null));
                if (fertighausherstellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFertighaushersteller;
                    sourceFertighaushersteller = this.getFertighaushersteller();
                    String copyFertighaushersteller = ((String) strategy.copy(LocatorUtils.property(locator, "fertighaushersteller", sourceFertighaushersteller), sourceFertighaushersteller, (this.fertighaushersteller!= null)));
                    copy.setFertighaushersteller(copyFertighaushersteller);
                } else {
                    if (fertighausherstellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fertighaushersteller = null;
                    }
                }
            }
            {
                Boolean anzahlGewerbeeinheitenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlGewerbeeinheiten!= null));
                if (anzahlGewerbeeinheitenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlGewerbeeinheiten;
                    sourceAnzahlGewerbeeinheiten = this.getAnzahlGewerbeeinheiten();
                    Integer copyAnzahlGewerbeeinheiten = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlGewerbeeinheiten", sourceAnzahlGewerbeeinheiten), sourceAnzahlGewerbeeinheiten, (this.anzahlGewerbeeinheiten!= null)));
                    copy.setAnzahlGewerbeeinheiten(copyAnzahlGewerbeeinheiten);
                } else {
                    if (anzahlGewerbeeinheitenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlGewerbeeinheiten = null;
                    }
                }
            }
            {
                Boolean sanierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sanierung!= null)&&(!this.sanierung.isEmpty())));
                if (sanierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSanierung> sourceSanierung;
                    sourceSanierung = (((this.sanierung!= null)&&(!this.sanierung.isEmpty()))?this.getSanierung():null);
                    @SuppressWarnings("unchecked")
                    List<CTSanierung> copySanierung = ((List<CTSanierung> ) strategy.copy(LocatorUtils.property(locator, "sanierung", sourceSanierung), sourceSanierung, ((this.sanierung!= null)&&(!this.sanierung.isEmpty()))));
                    copy.sanierung = null;
                    if (copySanierung!= null) {
                        List<CTSanierung> uniqueSanierungl = copy.getSanierung();
                        uniqueSanierungl.addAll(copySanierung);
                    }
                } else {
                    if (sanierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sanierung = null;
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
            {
                Boolean vermieterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vermieter!= null)&&(!this.vermieter.isEmpty())));
                if (vermieterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVermieter> sourceVermieter;
                    sourceVermieter = (((this.vermieter!= null)&&(!this.vermieter.isEmpty()))?this.getVermieter():null);
                    @SuppressWarnings("unchecked")
                    List<CTVermieter> copyVermieter = ((List<CTVermieter> ) strategy.copy(LocatorUtils.property(locator, "vermieter", sourceVermieter), sourceVermieter, ((this.vermieter!= null)&&(!this.vermieter.isEmpty()))));
                    copy.vermieter = null;
                    if (copyVermieter!= null) {
                        List<CTVermieter> uniqueVermieterl = copy.getVermieter();
                        uniqueVermieterl.addAll(copyVermieter);
                    }
                } else {
                    if (vermieterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermieter = null;
                    }
                }
            }
            {
                Boolean mieterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mieter!= null)&&(!this.mieter.isEmpty())));
                if (mieterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTMieter> sourceMieter;
                    sourceMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
                    @SuppressWarnings("unchecked")
                    List<CTMieter> copyMieter = ((List<CTMieter> ) strategy.copy(LocatorUtils.property(locator, "mieter", sourceMieter), sourceMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty()))));
                    copy.mieter = null;
                    if (copyMieter!= null) {
                        List<CTMieter> uniqueMieterl = copy.getMieter();
                        uniqueMieterl.addAll(copyMieter);
                    }
                } else {
                    if (mieterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mieter = null;
                    }
                }
            }
            {
                Boolean umbauterRaumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umbauterRaum!= null));
                if (umbauterRaumShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceUmbauterRaum;
                    sourceUmbauterRaum = this.getUmbauterRaum();
                    Integer copyUmbauterRaum = ((Integer) strategy.copy(LocatorUtils.property(locator, "umbauterRaum", sourceUmbauterRaum), sourceUmbauterRaum, (this.umbauterRaum!= null)));
                    copy.setUmbauterRaum(copyUmbauterRaum);
                } else {
                    if (umbauterRaumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umbauterRaum = null;
                    }
                }
            }
            {
                Boolean sicherungsglaeubigerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sicherungsglaeubiger!= null)&&(!this.sicherungsglaeubiger.isEmpty())));
                if (sicherungsglaeubigerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSicherungsglaeubiger> sourceSicherungsglaeubiger;
                    sourceSicherungsglaeubiger = (((this.sicherungsglaeubiger!= null)&&(!this.sicherungsglaeubiger.isEmpty()))?this.getSicherungsglaeubiger():null);
                    @SuppressWarnings("unchecked")
                    List<CTSicherungsglaeubiger> copySicherungsglaeubiger = ((List<CTSicherungsglaeubiger> ) strategy.copy(LocatorUtils.property(locator, "sicherungsglaeubiger", sourceSicherungsglaeubiger), sourceSicherungsglaeubiger, ((this.sicherungsglaeubiger!= null)&&(!this.sicherungsglaeubiger.isEmpty()))));
                    copy.sicherungsglaeubiger = null;
                    if (copySicherungsglaeubiger!= null) {
                        List<CTSicherungsglaeubiger> uniqueSicherungsglaeubigerl = copy.getSicherungsglaeubiger();
                        uniqueSicherungsglaeubigerl.addAll(copySicherungsglaeubiger);
                    }
                } else {
                    if (sicherungsglaeubigerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherungsglaeubiger = null;
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
                Boolean denkmalschutzUmfangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.denkmalschutzUmfang!= null)&&(!this.denkmalschutzUmfang.isEmpty())));
                if (denkmalschutzUmfangShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STDenkmalschutzUmfang> sourceDenkmalschutzUmfang;
                    sourceDenkmalschutzUmfang = (((this.denkmalschutzUmfang!= null)&&(!this.denkmalschutzUmfang.isEmpty()))?this.getDenkmalschutzUmfang():null);
                    @SuppressWarnings("unchecked")
                    List<STDenkmalschutzUmfang> copyDenkmalschutzUmfang = ((List<STDenkmalschutzUmfang> ) strategy.copy(LocatorUtils.property(locator, "denkmalschutzUmfang", sourceDenkmalschutzUmfang), sourceDenkmalschutzUmfang, ((this.denkmalschutzUmfang!= null)&&(!this.denkmalschutzUmfang.isEmpty()))));
                    copy.denkmalschutzUmfang = null;
                    if (copyDenkmalschutzUmfang!= null) {
                        List<STDenkmalschutzUmfang> uniqueDenkmalschutzUmfangl = copy.getDenkmalschutzUmfang();
                        uniqueDenkmalschutzUmfangl.addAll(copyDenkmalschutzUmfang);
                    }
                } else {
                    if (denkmalschutzUmfangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.denkmalschutzUmfang = null;
                    }
                }
            }
            {
                Boolean artDerUnterkellerungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artDerUnterkellerung!= null));
                if (artDerUnterkellerungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STUnterkellerung sourceArtDerUnterkellerung;
                    sourceArtDerUnterkellerung = this.getArtDerUnterkellerung();
                    STUnterkellerung copyArtDerUnterkellerung = ((STUnterkellerung) strategy.copy(LocatorUtils.property(locator, "artDerUnterkellerung", sourceArtDerUnterkellerung), sourceArtDerUnterkellerung, (this.artDerUnterkellerung!= null)));
                    copy.setArtDerUnterkellerung(copyArtDerUnterkellerung);
                } else {
                    if (artDerUnterkellerungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artDerUnterkellerung = null;
                    }
                }
            }
            {
                Boolean konstruktionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty())));
                if (konstruktionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTKonstruktion> sourceKonstruktion;
                    sourceKonstruktion = (((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))?this.getKonstruktion():null);
                    @SuppressWarnings("unchecked")
                    List<CTKonstruktion> copyKonstruktion = ((List<CTKonstruktion> ) strategy.copy(LocatorUtils.property(locator, "konstruktion", sourceKonstruktion), sourceKonstruktion, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))));
                    copy.konstruktion = null;
                    if (copyKonstruktion!= null) {
                        List<CTKonstruktion> uniqueKonstruktionl = copy.getKonstruktion();
                        uniqueKonstruktionl.addAll(copyKonstruktion);
                    }
                } else {
                    if (konstruktionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.konstruktion = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGebaeude();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withArtID(STGebaeudeart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withBauartklasse(STBauartklasse value) {
        setBauartklasse(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withBaujahr(Integer value) {
        setBaujahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withKernsanierungsjahr(Integer value) {
        setKernsanierungsjahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withDenkmalschutz(Boolean value) {
        setDenkmalschutz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withAnzahlStockwerke(Integer value) {
        setAnzahlStockwerke(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withAnzahlWohneinheiten(Integer value) {
        setAnzahlWohneinheiten(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withUnterkellert(Boolean value) {
        setUnterkellert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withDachart(STDachart value) {
        setDachart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withAusgebautesDach(Boolean value) {
        setAusgebautesDach(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withBauausfuehrung(STEBauausfuehrung... values) {
        if (values!= null) {
            for (STEBauausfuehrung value: values) {
                getBauausfuehrung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withBauausfuehrung(Collection<STEBauausfuehrung> values) {
        if (values!= null) {
            getBauausfuehrung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withAnzahlStellplaetzeImGebaeude(Integer value) {
        setAnzahlStellplaetzeImGebaeude(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withEinliegerwohnungVorhanden(Boolean value) {
        setEinliegerwohnungVorhanden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withRohbauBeginnDatum(String value) {
        setRohbauBeginnDatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withRohbauEndeDatum(String value) {
        setRohbauEndeDatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withGebaeudeSonderausstattung(CTGebaeudeSonderausstattung... values) {
        if (values!= null) {
            for (CTGebaeudeSonderausstattung value: values) {
                getGebaeudeSonderausstattung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withGebaeudeSonderausstattung(Collection<CTGebaeudeSonderausstattung> values) {
        if (values!= null) {
            getGebaeudeSonderausstattung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withObjektanschrift(CTObjektanschrift value) {
        setObjektanschrift(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withMaterialLeitungswassernetz(STMaterialLeitungswassernetz value) {
        setMaterialLeitungswassernetz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withFertighaushersteller(String value) {
        setFertighaushersteller(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withAnzahlGewerbeeinheiten(Integer value) {
        setAnzahlGewerbeeinheiten(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withSanierung(CTSanierung... values) {
        if (values!= null) {
            for (CTSanierung value: values) {
                getSanierung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withSanierung(Collection<CTSanierung> values) {
        if (values!= null) {
            getSanierung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withEigentuemer(CTEigentuemer... values) {
        if (values!= null) {
            for (CTEigentuemer value: values) {
                getEigentuemer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withEigentuemer(Collection<CTEigentuemer> values) {
        if (values!= null) {
            getEigentuemer().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withVermieter(CTVermieter... values) {
        if (values!= null) {
            for (CTVermieter value: values) {
                getVermieter().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withVermieter(Collection<CTVermieter> values) {
        if (values!= null) {
            getVermieter().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withMieter(CTMieter... values) {
        if (values!= null) {
            for (CTMieter value: values) {
                getMieter().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withMieter(Collection<CTMieter> values) {
        if (values!= null) {
            getMieter().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withUmbauterRaum(Integer value) {
        setUmbauterRaum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withSicherungsglaeubiger(CTSicherungsglaeubiger... values) {
        if (values!= null) {
            for (CTSicherungsglaeubiger value: values) {
                getSicherungsglaeubiger().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withSicherungsglaeubiger(Collection<CTSicherungsglaeubiger> values) {
        if (values!= null) {
            getSicherungsglaeubiger().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withKaufpreis(CTKaufpreis value) {
        setKaufpreis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withDenkmalschutzUmfang(STDenkmalschutzUmfang... values) {
        if (values!= null) {
            for (STDenkmalschutzUmfang value: values) {
                getDenkmalschutzUmfang().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withDenkmalschutzUmfang(Collection<STDenkmalschutzUmfang> values) {
        if (values!= null) {
            getDenkmalschutzUmfang().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withArtDerUnterkellerung(STUnterkellerung value) {
        setArtDerUnterkellerung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withKonstruktion(CTKonstruktion... values) {
        if (values!= null) {
            for (CTKonstruktion value: values) {
                getKonstruktion().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withKonstruktion(Collection<CTKonstruktion> values) {
        if (values!= null) {
            getKonstruktion().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGebaeude withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
