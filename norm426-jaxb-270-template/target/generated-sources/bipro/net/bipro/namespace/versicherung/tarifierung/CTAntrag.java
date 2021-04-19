
package net.bipro.namespace.versicherung.tarifierung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTAktivitaet;
import net.bipro.namespace.allgemein.CTDatei;
import net.bipro.namespace.allgemein.CTDienstleister;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTVermittler;
import net.bipro.namespace.allgemein.CTVertragsnummer;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAbrechnungsart;
import net.bipro.namespace.datentypen.STAbschlussmodell;
import net.bipro.namespace.datentypen.STAntragsart;
import net.bipro.namespace.datentypen.STArtDerBeratung;
import net.bipro.namespace.datentypen.STBedingungUebergabeform;
import net.bipro.namespace.datentypen.STDatenschutzerklaerungKenntnisnahme;
import net.bipro.namespace.datentypen.STInkassoart;
import net.bipro.namespace.datentypen.STUnterschriftsverfahren;
import net.bipro.namespace.datentypen.STZahlungsart;
import net.bipro.namespace.gevo.CTDokumentanforderung;
import net.bipro.namespace.gevo.CTDokumentinformation;
import net.bipro.namespace.gevo.CTDokumentversand;
import net.bipro.namespace.partner.CTBeitragszahler;
import net.bipro.namespace.partner.CTPartner;
import net.bipro.namespace.partner.CTPersonengruppe;
import net.bipro.namespace.partner.CTVertragspartner;
import net.bipro.namespace.produktmodell.CTVerkaufsprodukt;
import net.bipro.namespace.vertrag.CTVorNebenVertrag;
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
 * Geschaeftsvorgang Antrag. Darf nicht spartenspezifisch abgeleitet werden, da sonst die spartenuebergreifende Buendelung von Produkten nicht mehr moeglich waere.
 * 
 * Die Attribute Modell (ST_Antragsmodell), ArtDerBeratung (ST_ArtDerBeratung) und BedingungenUebergabeForm (ST_BedingungenUebergabeForm) fehlen, da die entsprechenden einfachen Datentypen nicht definiert sind.
 * 
 * <p>Java class for CT_Antrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Antrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/versicherung/tarifierung}CT_TAA"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hauptfaelligkeit" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Aktionskennzeichen" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Antragsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="BedingungenZurKenntnisGenommen" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="BesondereVereinbarungen" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="AktenzeichenVM" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="AktenzeichenVN" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="EinwilligungInformationsanfrage" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="VVGBeratungsverzicht" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="AntragUnterschrieben" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="ZustimmungFinanzdienstleister" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="DatenschutzerklaerungUnterschrieben" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Abschlussmodell" type="{http://www.bipro.net/namespace/datentypen}ST_Abschlussmodell" minOccurs="0"/&gt;
 *         &lt;element name="ArtDerBeratung" type="{http://www.bipro.net/namespace/datentypen}ST_ArtDerBeratung" minOccurs="0"/&gt;
 *         &lt;element name="BedingungUebergabeform" type="{http://www.bipro.net/namespace/datentypen}ST_BedingungUebergabeform" minOccurs="0"/&gt;
 *         &lt;element name="Unterschriftsverfahren" type="{http://www.bipro.net/namespace/datentypen}ST_Unterschriftsverfahren" minOccurs="0"/&gt;
 *         &lt;element name="DatenschutzerklaerungKenntnisnahme" type="{http://www.bipro.net/namespace/datentypen}ST_DatenschutzerklaerungKenntnisnahme" minOccurs="0"/&gt;
 *         &lt;element name="Antragsart" type="{http://www.bipro.net/namespace/datentypen}ST_Antragsart" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsnummer" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer" minOccurs="0"/&gt;
 *         &lt;element name="ZusaetzlicheAntragsdaten" type="{http://www.bipro.net/namespace/versicherung/tarifierung}CT_ZusaetzlicheAntragsdaten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Beitragszahler" type="{http://www.bipro.net/namespace/partner}CT_Beitragszahler" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Antrag", propOrder = {
    "hauptfaelligkeit",
    "aktionskennzeichen",
    "antragsdatum",
    "bedingungenZurKenntnisGenommen",
    "besondereVereinbarungen",
    "aktenzeichenVM",
    "aktenzeichenVN",
    "einwilligungInformationsanfrage",
    "vvgBeratungsverzicht",
    "antragUnterschrieben",
    "zustimmungFinanzdienstleister",
    "datenschutzerklaerungUnterschrieben",
    "abschlussmodell",
    "artDerBeratung",
    "bedingungUebergabeform",
    "unterschriftsverfahren",
    "datenschutzerklaerungKenntnisnahme",
    "antragsart",
    "vertragsnummer",
    "zusaetzlicheAntragsdaten",
    "beitragszahler"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTAntrag
    extends CTTAA
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Hauptfaelligkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String hauptfaelligkeit;
    @XmlElement(name = "Aktionskennzeichen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aktionskennzeichen;
    @XmlElement(name = "Antragsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String antragsdatum;
    @XmlElement(name = "BedingungenZurKenntnisGenommen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean bedingungenZurKenntnisGenommen;
    @XmlElement(name = "BesondereVereinbarungen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String besondereVereinbarungen;
    @XmlElement(name = "AktenzeichenVM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aktenzeichenVM;
    @XmlElement(name = "AktenzeichenVN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aktenzeichenVN;
    @XmlElement(name = "EinwilligungInformationsanfrage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean einwilligungInformationsanfrage;
    @XmlElement(name = "VVGBeratungsverzicht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean vvgBeratungsverzicht;
    @XmlElement(name = "AntragUnterschrieben")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean antragUnterschrieben;
    @XmlElement(name = "ZustimmungFinanzdienstleister")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean zustimmungFinanzdienstleister;
    @XmlElement(name = "DatenschutzerklaerungUnterschrieben")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean datenschutzerklaerungUnterschrieben;
    @XmlElement(name = "Abschlussmodell")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAbschlussmodell abschlussmodell;
    @XmlElement(name = "ArtDerBeratung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STArtDerBeratung artDerBeratung;
    @XmlElement(name = "BedingungUebergabeform")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STBedingungUebergabeform bedingungUebergabeform;
    @XmlElement(name = "Unterschriftsverfahren")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STUnterschriftsverfahren unterschriftsverfahren;
    @XmlElement(name = "DatenschutzerklaerungKenntnisnahme")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STDatenschutzerklaerungKenntnisnahme datenschutzerklaerungKenntnisnahme;
    @XmlElement(name = "Antragsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAntragsart antragsart;
    @XmlElement(name = "Vertragsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertragsnummer vertragsnummer;
    @XmlElement(name = "ZusaetzlicheAntragsdaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTZusaetzlicheAntragsdaten> zusaetzlicheAntragsdaten;
    @XmlElement(name = "Beitragszahler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBeitragszahler beitragszahler;

    /**
     * Gets the value of the hauptfaelligkeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getHauptfaelligkeit() {
        return hauptfaelligkeit;
    }

    /**
     * Sets the value of the hauptfaelligkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setHauptfaelligkeit(String value) {
        this.hauptfaelligkeit = value;
    }

    /**
     * Gets the value of the aktionskennzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAktionskennzeichen() {
        return aktionskennzeichen;
    }

    /**
     * Sets the value of the aktionskennzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAktionskennzeichen(String value) {
        this.aktionskennzeichen = value;
    }

    /**
     * Gets the value of the antragsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAntragsdatum() {
        return antragsdatum;
    }

    /**
     * Sets the value of the antragsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAntragsdatum(String value) {
        this.antragsdatum = value;
    }

    /**
     * Gets the value of the bedingungenZurKenntnisGenommen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isBedingungenZurKenntnisGenommen() {
        return bedingungenZurKenntnisGenommen;
    }

    /**
     * Sets the value of the bedingungenZurKenntnisGenommen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBedingungenZurKenntnisGenommen(Boolean value) {
        this.bedingungenZurKenntnisGenommen = value;
    }

    /**
     * Gets the value of the besondereVereinbarungen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBesondereVereinbarungen() {
        return besondereVereinbarungen;
    }

    /**
     * Sets the value of the besondereVereinbarungen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBesondereVereinbarungen(String value) {
        this.besondereVereinbarungen = value;
    }

    /**
     * Gets the value of the aktenzeichenVM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAktenzeichenVM() {
        return aktenzeichenVM;
    }

    /**
     * Sets the value of the aktenzeichenVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAktenzeichenVM(String value) {
        this.aktenzeichenVM = value;
    }

    /**
     * Gets the value of the aktenzeichenVN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAktenzeichenVN() {
        return aktenzeichenVN;
    }

    /**
     * Sets the value of the aktenzeichenVN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAktenzeichenVN(String value) {
        this.aktenzeichenVN = value;
    }

    /**
     * Gets the value of the einwilligungInformationsanfrage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isEinwilligungInformationsanfrage() {
        return einwilligungInformationsanfrage;
    }

    /**
     * Sets the value of the einwilligungInformationsanfrage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinwilligungInformationsanfrage(Boolean value) {
        this.einwilligungInformationsanfrage = value;
    }

    /**
     * Gets the value of the vvgBeratungsverzicht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isVVGBeratungsverzicht() {
        return vvgBeratungsverzicht;
    }

    /**
     * Sets the value of the vvgBeratungsverzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVVGBeratungsverzicht(Boolean value) {
        this.vvgBeratungsverzicht = value;
    }

    /**
     * Gets the value of the antragUnterschrieben property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isAntragUnterschrieben() {
        return antragUnterschrieben;
    }

    /**
     * Sets the value of the antragUnterschrieben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAntragUnterschrieben(Boolean value) {
        this.antragUnterschrieben = value;
    }

    /**
     * Gets the value of the zustimmungFinanzdienstleister property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isZustimmungFinanzdienstleister() {
        return zustimmungFinanzdienstleister;
    }

    /**
     * Sets the value of the zustimmungFinanzdienstleister property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZustimmungFinanzdienstleister(Boolean value) {
        this.zustimmungFinanzdienstleister = value;
    }

    /**
     * Gets the value of the datenschutzerklaerungUnterschrieben property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isDatenschutzerklaerungUnterschrieben() {
        return datenschutzerklaerungUnterschrieben;
    }

    /**
     * Sets the value of the datenschutzerklaerungUnterschrieben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDatenschutzerklaerungUnterschrieben(Boolean value) {
        this.datenschutzerklaerungUnterschrieben = value;
    }

    /**
     * Gets the value of the abschlussmodell property.
     * 
     * @return
     *     possible object is
     *     {@link STAbschlussmodell }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAbschlussmodell getAbschlussmodell() {
        return abschlussmodell;
    }

    /**
     * Sets the value of the abschlussmodell property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAbschlussmodell }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbschlussmodell(STAbschlussmodell value) {
        this.abschlussmodell = value;
    }

    /**
     * Gets the value of the artDerBeratung property.
     * 
     * @return
     *     possible object is
     *     {@link STArtDerBeratung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STArtDerBeratung getArtDerBeratung() {
        return artDerBeratung;
    }

    /**
     * Sets the value of the artDerBeratung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STArtDerBeratung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtDerBeratung(STArtDerBeratung value) {
        this.artDerBeratung = value;
    }

    /**
     * Gets the value of the bedingungUebergabeform property.
     * 
     * @return
     *     possible object is
     *     {@link STBedingungUebergabeform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STBedingungUebergabeform getBedingungUebergabeform() {
        return bedingungUebergabeform;
    }

    /**
     * Sets the value of the bedingungUebergabeform property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBedingungUebergabeform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBedingungUebergabeform(STBedingungUebergabeform value) {
        this.bedingungUebergabeform = value;
    }

    /**
     * Gets the value of the unterschriftsverfahren property.
     * 
     * @return
     *     possible object is
     *     {@link STUnterschriftsverfahren }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STUnterschriftsverfahren getUnterschriftsverfahren() {
        return unterschriftsverfahren;
    }

    /**
     * Sets the value of the unterschriftsverfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link STUnterschriftsverfahren }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUnterschriftsverfahren(STUnterschriftsverfahren value) {
        this.unterschriftsverfahren = value;
    }

    /**
     * Gets the value of the datenschutzerklaerungKenntnisnahme property.
     * 
     * @return
     *     possible object is
     *     {@link STDatenschutzerklaerungKenntnisnahme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STDatenschutzerklaerungKenntnisnahme getDatenschutzerklaerungKenntnisnahme() {
        return datenschutzerklaerungKenntnisnahme;
    }

    /**
     * Sets the value of the datenschutzerklaerungKenntnisnahme property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDatenschutzerklaerungKenntnisnahme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDatenschutzerklaerungKenntnisnahme(STDatenschutzerklaerungKenntnisnahme value) {
        this.datenschutzerklaerungKenntnisnahme = value;
    }

    /**
     * Gets the value of the antragsart property.
     * 
     * @return
     *     possible object is
     *     {@link STAntragsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAntragsart getAntragsart() {
        return antragsart;
    }

    /**
     * Sets the value of the antragsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAntragsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAntragsart(STAntragsart value) {
        this.antragsart = value;
    }

    /**
     * Gets the value of the vertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link CTVertragsnummer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer getVertragsnummer() {
        return vertragsnummer;
    }

    /**
     * Sets the value of the vertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVertragsnummer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertragsnummer(CTVertragsnummer value) {
        this.vertragsnummer = value;
    }

    /**
     * Gets the value of the zusaetzlicheAntragsdaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zusaetzlicheAntragsdaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZusaetzlicheAntragsdaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTZusaetzlicheAntragsdaten }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTZusaetzlicheAntragsdaten> getZusaetzlicheAntragsdaten() {
        if (zusaetzlicheAntragsdaten == null) {
            zusaetzlicheAntragsdaten = new ArrayList<CTZusaetzlicheAntragsdaten>();
        }
        return this.zusaetzlicheAntragsdaten;
    }

    /**
     * Gets the value of the beitragszahler property.
     * 
     * @return
     *     possible object is
     *     {@link CTBeitragszahler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBeitragszahler getBeitragszahler() {
        return beitragszahler;
    }

    /**
     * Sets the value of the beitragszahler property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBeitragszahler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBeitragszahler(CTBeitragszahler value) {
        this.beitragszahler = value;
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
        final CTAntrag that = ((CTAntrag) object);
        {
            String lhsHauptfaelligkeit;
            lhsHauptfaelligkeit = this.getHauptfaelligkeit();
            String rhsHauptfaelligkeit;
            rhsHauptfaelligkeit = that.getHauptfaelligkeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hauptfaelligkeit", lhsHauptfaelligkeit), LocatorUtils.property(thatLocator, "hauptfaelligkeit", rhsHauptfaelligkeit), lhsHauptfaelligkeit, rhsHauptfaelligkeit, (this.hauptfaelligkeit!= null), (that.hauptfaelligkeit!= null))) {
                return false;
            }
        }
        {
            String lhsAktionskennzeichen;
            lhsAktionskennzeichen = this.getAktionskennzeichen();
            String rhsAktionskennzeichen;
            rhsAktionskennzeichen = that.getAktionskennzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktionskennzeichen", lhsAktionskennzeichen), LocatorUtils.property(thatLocator, "aktionskennzeichen", rhsAktionskennzeichen), lhsAktionskennzeichen, rhsAktionskennzeichen, (this.aktionskennzeichen!= null), (that.aktionskennzeichen!= null))) {
                return false;
            }
        }
        {
            String lhsAntragsdatum;
            lhsAntragsdatum = this.getAntragsdatum();
            String rhsAntragsdatum;
            rhsAntragsdatum = that.getAntragsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragsdatum", lhsAntragsdatum), LocatorUtils.property(thatLocator, "antragsdatum", rhsAntragsdatum), lhsAntragsdatum, rhsAntragsdatum, (this.antragsdatum!= null), (that.antragsdatum!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBedingungenZurKenntnisGenommen;
            lhsBedingungenZurKenntnisGenommen = this.isBedingungenZurKenntnisGenommen();
            Boolean rhsBedingungenZurKenntnisGenommen;
            rhsBedingungenZurKenntnisGenommen = that.isBedingungenZurKenntnisGenommen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedingungenZurKenntnisGenommen", lhsBedingungenZurKenntnisGenommen), LocatorUtils.property(thatLocator, "bedingungenZurKenntnisGenommen", rhsBedingungenZurKenntnisGenommen), lhsBedingungenZurKenntnisGenommen, rhsBedingungenZurKenntnisGenommen, (this.bedingungenZurKenntnisGenommen!= null), (that.bedingungenZurKenntnisGenommen!= null))) {
                return false;
            }
        }
        {
            String lhsBesondereVereinbarungen;
            lhsBesondereVereinbarungen = this.getBesondereVereinbarungen();
            String rhsBesondereVereinbarungen;
            rhsBesondereVereinbarungen = that.getBesondereVereinbarungen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besondereVereinbarungen", lhsBesondereVereinbarungen), LocatorUtils.property(thatLocator, "besondereVereinbarungen", rhsBesondereVereinbarungen), lhsBesondereVereinbarungen, rhsBesondereVereinbarungen, (this.besondereVereinbarungen!= null), (that.besondereVereinbarungen!= null))) {
                return false;
            }
        }
        {
            String lhsAktenzeichenVM;
            lhsAktenzeichenVM = this.getAktenzeichenVM();
            String rhsAktenzeichenVM;
            rhsAktenzeichenVM = that.getAktenzeichenVM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichenVM", lhsAktenzeichenVM), LocatorUtils.property(thatLocator, "aktenzeichenVM", rhsAktenzeichenVM), lhsAktenzeichenVM, rhsAktenzeichenVM, (this.aktenzeichenVM!= null), (that.aktenzeichenVM!= null))) {
                return false;
            }
        }
        {
            String lhsAktenzeichenVN;
            lhsAktenzeichenVN = this.getAktenzeichenVN();
            String rhsAktenzeichenVN;
            rhsAktenzeichenVN = that.getAktenzeichenVN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichenVN", lhsAktenzeichenVN), LocatorUtils.property(thatLocator, "aktenzeichenVN", rhsAktenzeichenVN), lhsAktenzeichenVN, rhsAktenzeichenVN, (this.aktenzeichenVN!= null), (that.aktenzeichenVN!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEinwilligungInformationsanfrage;
            lhsEinwilligungInformationsanfrage = this.isEinwilligungInformationsanfrage();
            Boolean rhsEinwilligungInformationsanfrage;
            rhsEinwilligungInformationsanfrage = that.isEinwilligungInformationsanfrage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einwilligungInformationsanfrage", lhsEinwilligungInformationsanfrage), LocatorUtils.property(thatLocator, "einwilligungInformationsanfrage", rhsEinwilligungInformationsanfrage), lhsEinwilligungInformationsanfrage, rhsEinwilligungInformationsanfrage, (this.einwilligungInformationsanfrage!= null), (that.einwilligungInformationsanfrage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVVGBeratungsverzicht;
            lhsVVGBeratungsverzicht = this.isVVGBeratungsverzicht();
            Boolean rhsVVGBeratungsverzicht;
            rhsVVGBeratungsverzicht = that.isVVGBeratungsverzicht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vvgBeratungsverzicht", lhsVVGBeratungsverzicht), LocatorUtils.property(thatLocator, "vvgBeratungsverzicht", rhsVVGBeratungsverzicht), lhsVVGBeratungsverzicht, rhsVVGBeratungsverzicht, (this.vvgBeratungsverzicht!= null), (that.vvgBeratungsverzicht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAntragUnterschrieben;
            lhsAntragUnterschrieben = this.isAntragUnterschrieben();
            Boolean rhsAntragUnterschrieben;
            rhsAntragUnterschrieben = that.isAntragUnterschrieben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragUnterschrieben", lhsAntragUnterschrieben), LocatorUtils.property(thatLocator, "antragUnterschrieben", rhsAntragUnterschrieben), lhsAntragUnterschrieben, rhsAntragUnterschrieben, (this.antragUnterschrieben!= null), (that.antragUnterschrieben!= null))) {
                return false;
            }
        }
        {
            Boolean lhsZustimmungFinanzdienstleister;
            lhsZustimmungFinanzdienstleister = this.isZustimmungFinanzdienstleister();
            Boolean rhsZustimmungFinanzdienstleister;
            rhsZustimmungFinanzdienstleister = that.isZustimmungFinanzdienstleister();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zustimmungFinanzdienstleister", lhsZustimmungFinanzdienstleister), LocatorUtils.property(thatLocator, "zustimmungFinanzdienstleister", rhsZustimmungFinanzdienstleister), lhsZustimmungFinanzdienstleister, rhsZustimmungFinanzdienstleister, (this.zustimmungFinanzdienstleister!= null), (that.zustimmungFinanzdienstleister!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDatenschutzerklaerungUnterschrieben;
            lhsDatenschutzerklaerungUnterschrieben = this.isDatenschutzerklaerungUnterschrieben();
            Boolean rhsDatenschutzerklaerungUnterschrieben;
            rhsDatenschutzerklaerungUnterschrieben = that.isDatenschutzerklaerungUnterschrieben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datenschutzerklaerungUnterschrieben", lhsDatenschutzerklaerungUnterschrieben), LocatorUtils.property(thatLocator, "datenschutzerklaerungUnterschrieben", rhsDatenschutzerklaerungUnterschrieben), lhsDatenschutzerklaerungUnterschrieben, rhsDatenschutzerklaerungUnterschrieben, (this.datenschutzerklaerungUnterschrieben!= null), (that.datenschutzerklaerungUnterschrieben!= null))) {
                return false;
            }
        }
        {
            STAbschlussmodell lhsAbschlussmodell;
            lhsAbschlussmodell = this.getAbschlussmodell();
            STAbschlussmodell rhsAbschlussmodell;
            rhsAbschlussmodell = that.getAbschlussmodell();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abschlussmodell", lhsAbschlussmodell), LocatorUtils.property(thatLocator, "abschlussmodell", rhsAbschlussmodell), lhsAbschlussmodell, rhsAbschlussmodell, (this.abschlussmodell!= null), (that.abschlussmodell!= null))) {
                return false;
            }
        }
        {
            STArtDerBeratung lhsArtDerBeratung;
            lhsArtDerBeratung = this.getArtDerBeratung();
            STArtDerBeratung rhsArtDerBeratung;
            rhsArtDerBeratung = that.getArtDerBeratung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artDerBeratung", lhsArtDerBeratung), LocatorUtils.property(thatLocator, "artDerBeratung", rhsArtDerBeratung), lhsArtDerBeratung, rhsArtDerBeratung, (this.artDerBeratung!= null), (that.artDerBeratung!= null))) {
                return false;
            }
        }
        {
            STBedingungUebergabeform lhsBedingungUebergabeform;
            lhsBedingungUebergabeform = this.getBedingungUebergabeform();
            STBedingungUebergabeform rhsBedingungUebergabeform;
            rhsBedingungUebergabeform = that.getBedingungUebergabeform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedingungUebergabeform", lhsBedingungUebergabeform), LocatorUtils.property(thatLocator, "bedingungUebergabeform", rhsBedingungUebergabeform), lhsBedingungUebergabeform, rhsBedingungUebergabeform, (this.bedingungUebergabeform!= null), (that.bedingungUebergabeform!= null))) {
                return false;
            }
        }
        {
            STUnterschriftsverfahren lhsUnterschriftsverfahren;
            lhsUnterschriftsverfahren = this.getUnterschriftsverfahren();
            STUnterschriftsverfahren rhsUnterschriftsverfahren;
            rhsUnterschriftsverfahren = that.getUnterschriftsverfahren();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterschriftsverfahren", lhsUnterschriftsverfahren), LocatorUtils.property(thatLocator, "unterschriftsverfahren", rhsUnterschriftsverfahren), lhsUnterschriftsverfahren, rhsUnterschriftsverfahren, (this.unterschriftsverfahren!= null), (that.unterschriftsverfahren!= null))) {
                return false;
            }
        }
        {
            STDatenschutzerklaerungKenntnisnahme lhsDatenschutzerklaerungKenntnisnahme;
            lhsDatenschutzerklaerungKenntnisnahme = this.getDatenschutzerklaerungKenntnisnahme();
            STDatenschutzerklaerungKenntnisnahme rhsDatenschutzerklaerungKenntnisnahme;
            rhsDatenschutzerklaerungKenntnisnahme = that.getDatenschutzerklaerungKenntnisnahme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datenschutzerklaerungKenntnisnahme", lhsDatenschutzerklaerungKenntnisnahme), LocatorUtils.property(thatLocator, "datenschutzerklaerungKenntnisnahme", rhsDatenschutzerklaerungKenntnisnahme), lhsDatenschutzerklaerungKenntnisnahme, rhsDatenschutzerklaerungKenntnisnahme, (this.datenschutzerklaerungKenntnisnahme!= null), (that.datenschutzerklaerungKenntnisnahme!= null))) {
                return false;
            }
        }
        {
            STAntragsart lhsAntragsart;
            lhsAntragsart = this.getAntragsart();
            STAntragsart rhsAntragsart;
            rhsAntragsart = that.getAntragsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragsart", lhsAntragsart), LocatorUtils.property(thatLocator, "antragsart", rhsAntragsart), lhsAntragsart, rhsAntragsart, (this.antragsart!= null), (that.antragsart!= null))) {
                return false;
            }
        }
        {
            CTVertragsnummer lhsVertragsnummer;
            lhsVertragsnummer = this.getVertragsnummer();
            CTVertragsnummer rhsVertragsnummer;
            rhsVertragsnummer = that.getVertragsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsnummer", lhsVertragsnummer), LocatorUtils.property(thatLocator, "vertragsnummer", rhsVertragsnummer), lhsVertragsnummer, rhsVertragsnummer, (this.vertragsnummer!= null), (that.vertragsnummer!= null))) {
                return false;
            }
        }
        {
            List<CTZusaetzlicheAntragsdaten> lhsZusaetzlicheAntragsdaten;
            lhsZusaetzlicheAntragsdaten = (((this.zusaetzlicheAntragsdaten!= null)&&(!this.zusaetzlicheAntragsdaten.isEmpty()))?this.getZusaetzlicheAntragsdaten():null);
            List<CTZusaetzlicheAntragsdaten> rhsZusaetzlicheAntragsdaten;
            rhsZusaetzlicheAntragsdaten = (((that.zusaetzlicheAntragsdaten!= null)&&(!that.zusaetzlicheAntragsdaten.isEmpty()))?that.getZusaetzlicheAntragsdaten():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusaetzlicheAntragsdaten", lhsZusaetzlicheAntragsdaten), LocatorUtils.property(thatLocator, "zusaetzlicheAntragsdaten", rhsZusaetzlicheAntragsdaten), lhsZusaetzlicheAntragsdaten, rhsZusaetzlicheAntragsdaten, ((this.zusaetzlicheAntragsdaten!= null)&&(!this.zusaetzlicheAntragsdaten.isEmpty())), ((that.zusaetzlicheAntragsdaten!= null)&&(!that.zusaetzlicheAntragsdaten.isEmpty())))) {
                return false;
            }
        }
        {
            CTBeitragszahler lhsBeitragszahler;
            lhsBeitragszahler = this.getBeitragszahler();
            CTBeitragszahler rhsBeitragszahler;
            rhsBeitragszahler = that.getBeitragszahler();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragszahler", lhsBeitragszahler), LocatorUtils.property(thatLocator, "beitragszahler", rhsBeitragszahler), lhsBeitragszahler, rhsBeitragszahler, (this.beitragszahler!= null), (that.beitragszahler!= null))) {
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
            String theHauptfaelligkeit;
            theHauptfaelligkeit = this.getHauptfaelligkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hauptfaelligkeit", theHauptfaelligkeit), currentHashCode, theHauptfaelligkeit, (this.hauptfaelligkeit!= null));
        }
        {
            String theAktionskennzeichen;
            theAktionskennzeichen = this.getAktionskennzeichen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktionskennzeichen", theAktionskennzeichen), currentHashCode, theAktionskennzeichen, (this.aktionskennzeichen!= null));
        }
        {
            String theAntragsdatum;
            theAntragsdatum = this.getAntragsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragsdatum", theAntragsdatum), currentHashCode, theAntragsdatum, (this.antragsdatum!= null));
        }
        {
            Boolean theBedingungenZurKenntnisGenommen;
            theBedingungenZurKenntnisGenommen = this.isBedingungenZurKenntnisGenommen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bedingungenZurKenntnisGenommen", theBedingungenZurKenntnisGenommen), currentHashCode, theBedingungenZurKenntnisGenommen, (this.bedingungenZurKenntnisGenommen!= null));
        }
        {
            String theBesondereVereinbarungen;
            theBesondereVereinbarungen = this.getBesondereVereinbarungen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "besondereVereinbarungen", theBesondereVereinbarungen), currentHashCode, theBesondereVereinbarungen, (this.besondereVereinbarungen!= null));
        }
        {
            String theAktenzeichenVM;
            theAktenzeichenVM = this.getAktenzeichenVM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktenzeichenVM", theAktenzeichenVM), currentHashCode, theAktenzeichenVM, (this.aktenzeichenVM!= null));
        }
        {
            String theAktenzeichenVN;
            theAktenzeichenVN = this.getAktenzeichenVN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktenzeichenVN", theAktenzeichenVN), currentHashCode, theAktenzeichenVN, (this.aktenzeichenVN!= null));
        }
        {
            Boolean theEinwilligungInformationsanfrage;
            theEinwilligungInformationsanfrage = this.isEinwilligungInformationsanfrage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einwilligungInformationsanfrage", theEinwilligungInformationsanfrage), currentHashCode, theEinwilligungInformationsanfrage, (this.einwilligungInformationsanfrage!= null));
        }
        {
            Boolean theVVGBeratungsverzicht;
            theVVGBeratungsverzicht = this.isVVGBeratungsverzicht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vvgBeratungsverzicht", theVVGBeratungsverzicht), currentHashCode, theVVGBeratungsverzicht, (this.vvgBeratungsverzicht!= null));
        }
        {
            Boolean theAntragUnterschrieben;
            theAntragUnterschrieben = this.isAntragUnterschrieben();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragUnterschrieben", theAntragUnterschrieben), currentHashCode, theAntragUnterschrieben, (this.antragUnterschrieben!= null));
        }
        {
            Boolean theZustimmungFinanzdienstleister;
            theZustimmungFinanzdienstleister = this.isZustimmungFinanzdienstleister();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zustimmungFinanzdienstleister", theZustimmungFinanzdienstleister), currentHashCode, theZustimmungFinanzdienstleister, (this.zustimmungFinanzdienstleister!= null));
        }
        {
            Boolean theDatenschutzerklaerungUnterschrieben;
            theDatenschutzerklaerungUnterschrieben = this.isDatenschutzerklaerungUnterschrieben();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datenschutzerklaerungUnterschrieben", theDatenschutzerklaerungUnterschrieben), currentHashCode, theDatenschutzerklaerungUnterschrieben, (this.datenschutzerklaerungUnterschrieben!= null));
        }
        {
            STAbschlussmodell theAbschlussmodell;
            theAbschlussmodell = this.getAbschlussmodell();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abschlussmodell", theAbschlussmodell), currentHashCode, theAbschlussmodell, (this.abschlussmodell!= null));
        }
        {
            STArtDerBeratung theArtDerBeratung;
            theArtDerBeratung = this.getArtDerBeratung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artDerBeratung", theArtDerBeratung), currentHashCode, theArtDerBeratung, (this.artDerBeratung!= null));
        }
        {
            STBedingungUebergabeform theBedingungUebergabeform;
            theBedingungUebergabeform = this.getBedingungUebergabeform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bedingungUebergabeform", theBedingungUebergabeform), currentHashCode, theBedingungUebergabeform, (this.bedingungUebergabeform!= null));
        }
        {
            STUnterschriftsverfahren theUnterschriftsverfahren;
            theUnterschriftsverfahren = this.getUnterschriftsverfahren();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unterschriftsverfahren", theUnterschriftsverfahren), currentHashCode, theUnterschriftsverfahren, (this.unterschriftsverfahren!= null));
        }
        {
            STDatenschutzerklaerungKenntnisnahme theDatenschutzerklaerungKenntnisnahme;
            theDatenschutzerklaerungKenntnisnahme = this.getDatenschutzerklaerungKenntnisnahme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datenschutzerklaerungKenntnisnahme", theDatenschutzerklaerungKenntnisnahme), currentHashCode, theDatenschutzerklaerungKenntnisnahme, (this.datenschutzerklaerungKenntnisnahme!= null));
        }
        {
            STAntragsart theAntragsart;
            theAntragsart = this.getAntragsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragsart", theAntragsart), currentHashCode, theAntragsart, (this.antragsart!= null));
        }
        {
            CTVertragsnummer theVertragsnummer;
            theVertragsnummer = this.getVertragsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsnummer", theVertragsnummer), currentHashCode, theVertragsnummer, (this.vertragsnummer!= null));
        }
        {
            List<CTZusaetzlicheAntragsdaten> theZusaetzlicheAntragsdaten;
            theZusaetzlicheAntragsdaten = (((this.zusaetzlicheAntragsdaten!= null)&&(!this.zusaetzlicheAntragsdaten.isEmpty()))?this.getZusaetzlicheAntragsdaten():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zusaetzlicheAntragsdaten", theZusaetzlicheAntragsdaten), currentHashCode, theZusaetzlicheAntragsdaten, ((this.zusaetzlicheAntragsdaten!= null)&&(!this.zusaetzlicheAntragsdaten.isEmpty())));
        }
        {
            CTBeitragszahler theBeitragszahler;
            theBeitragszahler = this.getBeitragszahler();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragszahler", theBeitragszahler), currentHashCode, theBeitragszahler, (this.beitragszahler!= null));
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
        if (draftCopy instanceof CTAntrag) {
            final CTAntrag copy = ((CTAntrag) draftCopy);
            {
                Boolean hauptfaelligkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hauptfaelligkeit!= null));
                if (hauptfaelligkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHauptfaelligkeit;
                    sourceHauptfaelligkeit = this.getHauptfaelligkeit();
                    String copyHauptfaelligkeit = ((String) strategy.copy(LocatorUtils.property(locator, "hauptfaelligkeit", sourceHauptfaelligkeit), sourceHauptfaelligkeit, (this.hauptfaelligkeit!= null)));
                    copy.setHauptfaelligkeit(copyHauptfaelligkeit);
                } else {
                    if (hauptfaelligkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hauptfaelligkeit = null;
                    }
                }
            }
            {
                Boolean aktionskennzeichenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktionskennzeichen!= null));
                if (aktionskennzeichenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktionskennzeichen;
                    sourceAktionskennzeichen = this.getAktionskennzeichen();
                    String copyAktionskennzeichen = ((String) strategy.copy(LocatorUtils.property(locator, "aktionskennzeichen", sourceAktionskennzeichen), sourceAktionskennzeichen, (this.aktionskennzeichen!= null)));
                    copy.setAktionskennzeichen(copyAktionskennzeichen);
                } else {
                    if (aktionskennzeichenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktionskennzeichen = null;
                    }
                }
            }
            {
                Boolean antragsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antragsdatum!= null));
                if (antragsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAntragsdatum;
                    sourceAntragsdatum = this.getAntragsdatum();
                    String copyAntragsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "antragsdatum", sourceAntragsdatum), sourceAntragsdatum, (this.antragsdatum!= null)));
                    copy.setAntragsdatum(copyAntragsdatum);
                } else {
                    if (antragsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antragsdatum = null;
                    }
                }
            }
            {
                Boolean bedingungenZurKenntnisGenommenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bedingungenZurKenntnisGenommen!= null));
                if (bedingungenZurKenntnisGenommenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBedingungenZurKenntnisGenommen;
                    sourceBedingungenZurKenntnisGenommen = this.isBedingungenZurKenntnisGenommen();
                    Boolean copyBedingungenZurKenntnisGenommen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bedingungenZurKenntnisGenommen", sourceBedingungenZurKenntnisGenommen), sourceBedingungenZurKenntnisGenommen, (this.bedingungenZurKenntnisGenommen!= null)));
                    copy.setBedingungenZurKenntnisGenommen(copyBedingungenZurKenntnisGenommen);
                } else {
                    if (bedingungenZurKenntnisGenommenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bedingungenZurKenntnisGenommen = null;
                    }
                }
            }
            {
                Boolean besondereVereinbarungenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.besondereVereinbarungen!= null));
                if (besondereVereinbarungenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBesondereVereinbarungen;
                    sourceBesondereVereinbarungen = this.getBesondereVereinbarungen();
                    String copyBesondereVereinbarungen = ((String) strategy.copy(LocatorUtils.property(locator, "besondereVereinbarungen", sourceBesondereVereinbarungen), sourceBesondereVereinbarungen, (this.besondereVereinbarungen!= null)));
                    copy.setBesondereVereinbarungen(copyBesondereVereinbarungen);
                } else {
                    if (besondereVereinbarungenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.besondereVereinbarungen = null;
                    }
                }
            }
            {
                Boolean aktenzeichenVMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktenzeichenVM!= null));
                if (aktenzeichenVMShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktenzeichenVM;
                    sourceAktenzeichenVM = this.getAktenzeichenVM();
                    String copyAktenzeichenVM = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichenVM", sourceAktenzeichenVM), sourceAktenzeichenVM, (this.aktenzeichenVM!= null)));
                    copy.setAktenzeichenVM(copyAktenzeichenVM);
                } else {
                    if (aktenzeichenVMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktenzeichenVM = null;
                    }
                }
            }
            {
                Boolean aktenzeichenVNShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktenzeichenVN!= null));
                if (aktenzeichenVNShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktenzeichenVN;
                    sourceAktenzeichenVN = this.getAktenzeichenVN();
                    String copyAktenzeichenVN = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichenVN", sourceAktenzeichenVN), sourceAktenzeichenVN, (this.aktenzeichenVN!= null)));
                    copy.setAktenzeichenVN(copyAktenzeichenVN);
                } else {
                    if (aktenzeichenVNShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktenzeichenVN = null;
                    }
                }
            }
            {
                Boolean einwilligungInformationsanfrageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einwilligungInformationsanfrage!= null));
                if (einwilligungInformationsanfrageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEinwilligungInformationsanfrage;
                    sourceEinwilligungInformationsanfrage = this.isEinwilligungInformationsanfrage();
                    Boolean copyEinwilligungInformationsanfrage = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einwilligungInformationsanfrage", sourceEinwilligungInformationsanfrage), sourceEinwilligungInformationsanfrage, (this.einwilligungInformationsanfrage!= null)));
                    copy.setEinwilligungInformationsanfrage(copyEinwilligungInformationsanfrage);
                } else {
                    if (einwilligungInformationsanfrageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einwilligungInformationsanfrage = null;
                    }
                }
            }
            {
                Boolean vvgBeratungsverzichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vvgBeratungsverzicht!= null));
                if (vvgBeratungsverzichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVVGBeratungsverzicht;
                    sourceVVGBeratungsverzicht = this.isVVGBeratungsverzicht();
                    Boolean copyVVGBeratungsverzicht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vvgBeratungsverzicht", sourceVVGBeratungsverzicht), sourceVVGBeratungsverzicht, (this.vvgBeratungsverzicht!= null)));
                    copy.setVVGBeratungsverzicht(copyVVGBeratungsverzicht);
                } else {
                    if (vvgBeratungsverzichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vvgBeratungsverzicht = null;
                    }
                }
            }
            {
                Boolean antragUnterschriebenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antragUnterschrieben!= null));
                if (antragUnterschriebenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAntragUnterschrieben;
                    sourceAntragUnterschrieben = this.isAntragUnterschrieben();
                    Boolean copyAntragUnterschrieben = ((Boolean) strategy.copy(LocatorUtils.property(locator, "antragUnterschrieben", sourceAntragUnterschrieben), sourceAntragUnterschrieben, (this.antragUnterschrieben!= null)));
                    copy.setAntragUnterschrieben(copyAntragUnterschrieben);
                } else {
                    if (antragUnterschriebenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antragUnterschrieben = null;
                    }
                }
            }
            {
                Boolean zustimmungFinanzdienstleisterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zustimmungFinanzdienstleister!= null));
                if (zustimmungFinanzdienstleisterShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZustimmungFinanzdienstleister;
                    sourceZustimmungFinanzdienstleister = this.isZustimmungFinanzdienstleister();
                    Boolean copyZustimmungFinanzdienstleister = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zustimmungFinanzdienstleister", sourceZustimmungFinanzdienstleister), sourceZustimmungFinanzdienstleister, (this.zustimmungFinanzdienstleister!= null)));
                    copy.setZustimmungFinanzdienstleister(copyZustimmungFinanzdienstleister);
                } else {
                    if (zustimmungFinanzdienstleisterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zustimmungFinanzdienstleister = null;
                    }
                }
            }
            {
                Boolean datenschutzerklaerungUnterschriebenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datenschutzerklaerungUnterschrieben!= null));
                if (datenschutzerklaerungUnterschriebenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDatenschutzerklaerungUnterschrieben;
                    sourceDatenschutzerklaerungUnterschrieben = this.isDatenschutzerklaerungUnterschrieben();
                    Boolean copyDatenschutzerklaerungUnterschrieben = ((Boolean) strategy.copy(LocatorUtils.property(locator, "datenschutzerklaerungUnterschrieben", sourceDatenschutzerklaerungUnterschrieben), sourceDatenschutzerklaerungUnterschrieben, (this.datenschutzerklaerungUnterschrieben!= null)));
                    copy.setDatenschutzerklaerungUnterschrieben(copyDatenschutzerklaerungUnterschrieben);
                } else {
                    if (datenschutzerklaerungUnterschriebenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datenschutzerklaerungUnterschrieben = null;
                    }
                }
            }
            {
                Boolean abschlussmodellShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abschlussmodell!= null));
                if (abschlussmodellShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAbschlussmodell sourceAbschlussmodell;
                    sourceAbschlussmodell = this.getAbschlussmodell();
                    STAbschlussmodell copyAbschlussmodell = ((STAbschlussmodell) strategy.copy(LocatorUtils.property(locator, "abschlussmodell", sourceAbschlussmodell), sourceAbschlussmodell, (this.abschlussmodell!= null)));
                    copy.setAbschlussmodell(copyAbschlussmodell);
                } else {
                    if (abschlussmodellShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abschlussmodell = null;
                    }
                }
            }
            {
                Boolean artDerBeratungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artDerBeratung!= null));
                if (artDerBeratungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STArtDerBeratung sourceArtDerBeratung;
                    sourceArtDerBeratung = this.getArtDerBeratung();
                    STArtDerBeratung copyArtDerBeratung = ((STArtDerBeratung) strategy.copy(LocatorUtils.property(locator, "artDerBeratung", sourceArtDerBeratung), sourceArtDerBeratung, (this.artDerBeratung!= null)));
                    copy.setArtDerBeratung(copyArtDerBeratung);
                } else {
                    if (artDerBeratungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artDerBeratung = null;
                    }
                }
            }
            {
                Boolean bedingungUebergabeformShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bedingungUebergabeform!= null));
                if (bedingungUebergabeformShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBedingungUebergabeform sourceBedingungUebergabeform;
                    sourceBedingungUebergabeform = this.getBedingungUebergabeform();
                    STBedingungUebergabeform copyBedingungUebergabeform = ((STBedingungUebergabeform) strategy.copy(LocatorUtils.property(locator, "bedingungUebergabeform", sourceBedingungUebergabeform), sourceBedingungUebergabeform, (this.bedingungUebergabeform!= null)));
                    copy.setBedingungUebergabeform(copyBedingungUebergabeform);
                } else {
                    if (bedingungUebergabeformShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bedingungUebergabeform = null;
                    }
                }
            }
            {
                Boolean unterschriftsverfahrenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unterschriftsverfahren!= null));
                if (unterschriftsverfahrenShouldBeCopiedAndSet == Boolean.TRUE) {
                    STUnterschriftsverfahren sourceUnterschriftsverfahren;
                    sourceUnterschriftsverfahren = this.getUnterschriftsverfahren();
                    STUnterschriftsverfahren copyUnterschriftsverfahren = ((STUnterschriftsverfahren) strategy.copy(LocatorUtils.property(locator, "unterschriftsverfahren", sourceUnterschriftsverfahren), sourceUnterschriftsverfahren, (this.unterschriftsverfahren!= null)));
                    copy.setUnterschriftsverfahren(copyUnterschriftsverfahren);
                } else {
                    if (unterschriftsverfahrenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unterschriftsverfahren = null;
                    }
                }
            }
            {
                Boolean datenschutzerklaerungKenntnisnahmeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datenschutzerklaerungKenntnisnahme!= null));
                if (datenschutzerklaerungKenntnisnahmeShouldBeCopiedAndSet == Boolean.TRUE) {
                    STDatenschutzerklaerungKenntnisnahme sourceDatenschutzerklaerungKenntnisnahme;
                    sourceDatenschutzerklaerungKenntnisnahme = this.getDatenschutzerklaerungKenntnisnahme();
                    STDatenschutzerklaerungKenntnisnahme copyDatenschutzerklaerungKenntnisnahme = ((STDatenschutzerklaerungKenntnisnahme) strategy.copy(LocatorUtils.property(locator, "datenschutzerklaerungKenntnisnahme", sourceDatenschutzerklaerungKenntnisnahme), sourceDatenschutzerklaerungKenntnisnahme, (this.datenschutzerklaerungKenntnisnahme!= null)));
                    copy.setDatenschutzerklaerungKenntnisnahme(copyDatenschutzerklaerungKenntnisnahme);
                } else {
                    if (datenschutzerklaerungKenntnisnahmeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datenschutzerklaerungKenntnisnahme = null;
                    }
                }
            }
            {
                Boolean antragsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antragsart!= null));
                if (antragsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAntragsart sourceAntragsart;
                    sourceAntragsart = this.getAntragsart();
                    STAntragsart copyAntragsart = ((STAntragsart) strategy.copy(LocatorUtils.property(locator, "antragsart", sourceAntragsart), sourceAntragsart, (this.antragsart!= null)));
                    copy.setAntragsart(copyAntragsart);
                } else {
                    if (antragsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antragsart = null;
                    }
                }
            }
            {
                Boolean vertragsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertragsnummer!= null));
                if (vertragsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVertragsnummer sourceVertragsnummer;
                    sourceVertragsnummer = this.getVertragsnummer();
                    CTVertragsnummer copyVertragsnummer = ((CTVertragsnummer) strategy.copy(LocatorUtils.property(locator, "vertragsnummer", sourceVertragsnummer), sourceVertragsnummer, (this.vertragsnummer!= null)));
                    copy.setVertragsnummer(copyVertragsnummer);
                } else {
                    if (vertragsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsnummer = null;
                    }
                }
            }
            {
                Boolean zusaetzlicheAntragsdatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zusaetzlicheAntragsdaten!= null)&&(!this.zusaetzlicheAntragsdaten.isEmpty())));
                if (zusaetzlicheAntragsdatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTZusaetzlicheAntragsdaten> sourceZusaetzlicheAntragsdaten;
                    sourceZusaetzlicheAntragsdaten = (((this.zusaetzlicheAntragsdaten!= null)&&(!this.zusaetzlicheAntragsdaten.isEmpty()))?this.getZusaetzlicheAntragsdaten():null);
                    @SuppressWarnings("unchecked")
                    List<CTZusaetzlicheAntragsdaten> copyZusaetzlicheAntragsdaten = ((List<CTZusaetzlicheAntragsdaten> ) strategy.copy(LocatorUtils.property(locator, "zusaetzlicheAntragsdaten", sourceZusaetzlicheAntragsdaten), sourceZusaetzlicheAntragsdaten, ((this.zusaetzlicheAntragsdaten!= null)&&(!this.zusaetzlicheAntragsdaten.isEmpty()))));
                    copy.zusaetzlicheAntragsdaten = null;
                    if (copyZusaetzlicheAntragsdaten!= null) {
                        List<CTZusaetzlicheAntragsdaten> uniqueZusaetzlicheAntragsdatenl = copy.getZusaetzlicheAntragsdaten();
                        uniqueZusaetzlicheAntragsdatenl.addAll(copyZusaetzlicheAntragsdaten);
                    }
                } else {
                    if (zusaetzlicheAntragsdatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusaetzlicheAntragsdaten = null;
                    }
                }
            }
            {
                Boolean beitragszahlerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragszahler!= null));
                if (beitragszahlerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBeitragszahler sourceBeitragszahler;
                    sourceBeitragszahler = this.getBeitragszahler();
                    CTBeitragszahler copyBeitragszahler = ((CTBeitragszahler) strategy.copy(LocatorUtils.property(locator, "beitragszahler", sourceBeitragszahler), sourceBeitragszahler, (this.beitragszahler!= null)));
                    copy.setBeitragszahler(copyBeitragszahler);
                } else {
                    if (beitragszahlerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragszahler = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAntrag();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withHauptfaelligkeit(String value) {
        setHauptfaelligkeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAktionskennzeichen(String value) {
        setAktionskennzeichen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAntragsdatum(String value) {
        setAntragsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withBedingungenZurKenntnisGenommen(Boolean value) {
        setBedingungenZurKenntnisGenommen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withBesondereVereinbarungen(String value) {
        setBesondereVereinbarungen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAktenzeichenVM(String value) {
        setAktenzeichenVM(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAktenzeichenVN(String value) {
        setAktenzeichenVN(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withEinwilligungInformationsanfrage(Boolean value) {
        setEinwilligungInformationsanfrage(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVVGBeratungsverzicht(Boolean value) {
        setVVGBeratungsverzicht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAntragUnterschrieben(Boolean value) {
        setAntragUnterschrieben(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withZustimmungFinanzdienstleister(Boolean value) {
        setZustimmungFinanzdienstleister(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDatenschutzerklaerungUnterschrieben(Boolean value) {
        setDatenschutzerklaerungUnterschrieben(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAbschlussmodell(STAbschlussmodell value) {
        setAbschlussmodell(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withArtDerBeratung(STArtDerBeratung value) {
        setArtDerBeratung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withBedingungUebergabeform(STBedingungUebergabeform value) {
        setBedingungUebergabeform(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withUnterschriftsverfahren(STUnterschriftsverfahren value) {
        setUnterschriftsverfahren(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDatenschutzerklaerungKenntnisnahme(STDatenschutzerklaerungKenntnisnahme value) {
        setDatenschutzerklaerungKenntnisnahme(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAntragsart(STAntragsart value) {
        setAntragsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVertragsnummer(CTVertragsnummer value) {
        setVertragsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withZusaetzlicheAntragsdaten(CTZusaetzlicheAntragsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheAntragsdaten value: values) {
                getZusaetzlicheAntragsdaten().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withZusaetzlicheAntragsdaten(Collection<CTZusaetzlicheAntragsdaten> values) {
        if (values!= null) {
            getZusaetzlicheAntragsdaten().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withZahlungsart(STZahlungsart value) {
        setZahlungsart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withInkassoart(STInkassoart value) {
        setInkassoart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAbrechnungsart(STAbrechnungsart value) {
        setAbrechnungsart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withPartner(CTPartner... values) {
        if (values!= null) {
            for (CTPartner value: values) {
                getPartner().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withPartner(Collection<CTPartner> values) {
        if (values!= null) {
            getPartner().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVersicherungsnehmer(CTVertragspartner value) {
        setVersicherungsnehmer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVerkaufsprodukt(CTVerkaufsprodukt... values) {
        if (values!= null) {
            for (CTVerkaufsprodukt value: values) {
                getVerkaufsprodukt().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVerkaufsprodukt(Collection<CTVerkaufsprodukt> values) {
        if (values!= null) {
            getVerkaufsprodukt().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAktivitaet(CTAktivitaet... values) {
        if (values!= null) {
            for (CTAktivitaet value: values) {
                getAktivitaet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withAktivitaet(Collection<CTAktivitaet> values) {
        if (values!= null) {
            getAktivitaet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withGegenstand(CTGegenstand... values) {
        if (values!= null) {
            for (CTGegenstand value: values) {
                getGegenstand().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withGegenstand(Collection<CTGegenstand> values) {
        if (values!= null) {
            getGegenstand().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVorNebenVersicherung(CTVorNebenVertrag... values) {
        if (values!= null) {
            for (CTVorNebenVertrag value: values) {
                getVorNebenVersicherung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVorNebenVersicherung(Collection<CTVorNebenVertrag> values) {
        if (values!= null) {
            getVorNebenVersicherung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withPersonengruppe(CTPersonengruppe... values) {
        if (values!= null) {
            for (CTPersonengruppe value: values) {
                getPersonengruppe().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withPersonengruppe(Collection<CTPersonengruppe> values) {
        if (values!= null) {
            getPersonengruppe().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVertragsverbindungsnummer(CTVertragsnummer... values) {
        if (values!= null) {
            for (CTVertragsnummer value: values) {
                getVertragsverbindungsnummer().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVertragsverbindungsnummer(Collection<CTVertragsnummer> values) {
        if (values!= null) {
            getVertragsverbindungsnummer().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVorgangsnummer(String value) {
        setVorgangsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVorgangsnummerVM(String value) {
        setVorgangsnummerVM(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withErstelldatum(String value) {
        setErstelldatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withFreitext(String value) {
        setFreitext(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withArtID(String value) {
        setArtID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVermittler(CTVermittler... values) {
        if (values!= null) {
            for (CTVermittler value: values) {
                getVermittler().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withVermittler(Collection<CTVermittler> values) {
        if (values!= null) {
            getVermittler().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDokumentanforderung(CTDokumentanforderung... values) {
        if (values!= null) {
            for (CTDokumentanforderung value: values) {
                getDokumentanforderung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDokumentanforderung(Collection<CTDokumentanforderung> values) {
        if (values!= null) {
            getDokumentanforderung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDatei(CTDatei... values) {
        if (values!= null) {
            for (CTDatei value: values) {
                getDatei().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDatei(Collection<CTDatei> values) {
        if (values!= null) {
            getDatei().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDokumentinformation(CTDokumentinformation... values) {
        if (values!= null) {
            for (CTDokumentinformation value: values) {
                getDokumentinformation().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDokumentinformation(Collection<CTDokumentinformation> values) {
        if (values!= null) {
            getDokumentinformation().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDienstleister(CTDienstleister... values) {
        if (values!= null) {
            for (CTDienstleister value: values) {
                getDienstleister().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDienstleister(Collection<CTDienstleister> values) {
        if (values!= null) {
            getDienstleister().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDokumentversand(CTDokumentversand... values) {
        if (values!= null) {
            for (CTDokumentversand value: values) {
                getDokumentversand().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withDokumentversand(Collection<CTDokumentversand> values) {
        if (values!= null) {
            getDokumentversand().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAntrag withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
