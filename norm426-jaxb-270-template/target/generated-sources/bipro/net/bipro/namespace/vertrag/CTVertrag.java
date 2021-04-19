
package net.bipro.namespace.vertrag;

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
import net.bipro.namespace.allgemein.CTAktivitaet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTVermittler;
import net.bipro.namespace.allgemein.CTVertragsnummer;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STAbgangsgrund;
import net.bipro.namespace.datentypen.STAntragsstatus;
import net.bipro.namespace.datentypen.STArtDerBeratung;
import net.bipro.namespace.datentypen.STInkassoart;
import net.bipro.namespace.datentypen.STVertragsentstehung;
import net.bipro.namespace.datentypen.STVertragsstatus;
import net.bipro.namespace.datentypen.STZahlungsart;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTBeitragszahler;
import net.bipro.namespace.partner.CTPartner;
import net.bipro.namespace.partner.CTPersonengruppe;
import net.bipro.namespace.partner.CTVertragspartner;
import net.bipro.namespace.produktmodell.CTVerkaufsprodukt;
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
 * <p>Java class for CT_Vertrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Vertrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Abgangsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Abgangsgrund" type="{http://www.bipro.net/namespace/datentypen}ST_Abgangsgrund" minOccurs="0"/&gt;
 *         &lt;element name="AktenzeichenVM" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Antragsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Antragsstatus" type="{http://www.bipro.net/namespace/datentypen}ST_Antragsstatus" minOccurs="0"/&gt;
 *         &lt;element name="GueltigAbDatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="GueltigBisDatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Hauptfaelligkeit" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Inkassoart" type="{http://www.bipro.net/namespace/datentypen}ST_Inkassoart" minOccurs="0"/&gt;
 *         &lt;element name="Kuendigungsklausel" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsbeginn" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsstatus" type="{http://www.bipro.net/namespace/datentypen}ST_Vertragsstatus" minOccurs="0"/&gt;
 *         &lt;element name="Zahlungsart" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsart" minOccurs="0"/&gt;
 *         &lt;element name="Zahlungsweise" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsweise" minOccurs="0"/&gt;
 *         &lt;element name="Verkaufsprodukt" type="{http://www.bipro.net/namespace/produktmodell}CT_Verkaufsprodukt" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Vermittler" type="{http://www.bipro.net/namespace/allgemein}CT_Vermittler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Partner" type="{http://www.bipro.net/namespace/partner}CT_Partner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Gegenstand" type="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Beitragszahler" type="{http://www.bipro.net/namespace/partner}CT_Beitragszahler" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsnummer" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer"/&gt;
 *         &lt;element name="Aktivitaet" type="{http://www.bipro.net/namespace/allgemein}CT_Aktivitaet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AktenzeichenVertragspartner" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Aenderungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Aenderungsgrund" type="{http://www.bipro.net/namespace/datentypen}ST_GeVoArt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AntragsnummerVM" type="{http://www.bipro.net/namespace/datentypen}ST_Vorgangsnummer" minOccurs="0"/&gt;
 *         &lt;element name="Antragseingangsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Policierungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsentstehung" type="{http://www.bipro.net/namespace/datentypen}ST_Vertragsentstehung" minOccurs="0"/&gt;
 *         &lt;element name="ArtDerBeratung" type="{http://www.bipro.net/namespace/datentypen}ST_ArtDerBeratung" minOccurs="0"/&gt;
 *         &lt;element name="Antragsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Vorgangsnummer" minOccurs="0"/&gt;
 *         &lt;element name="AlteVertragsnummer" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer" minOccurs="0"/&gt;
 *         &lt;element name="Personengruppe" type="{http://www.bipro.net/namespace/partner}CT_Personengruppe" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BearbeitendeStelle" type="{http://www.bipro.net/namespace/vertrag}CT_BearbeitendeStelle" minOccurs="0"/&gt;
 *         &lt;element name="VertragsnummerVM" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsverbindungsnummer" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vertragspartner" type="{http://www.bipro.net/namespace/partner}CT_Vertragspartner" minOccurs="0"/&gt;
 *         &lt;element name="Leistungsstoerung" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Zahltermin" type="{http://www.bipro.net/namespace/datentypen}ST_Kalendertag" minOccurs="0"/&gt;
 *         &lt;element name="ZusaetzlicheVertragsdaten" type="{http://www.bipro.net/namespace/vertrag}CT_ZusaetzlicheVertragsdaten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Vertrag", propOrder = {
    "abgangsdatum",
    "abgangsgrund",
    "aktenzeichenVM",
    "antragsdatum",
    "antragsstatus",
    "gueltigAbDatum",
    "gueltigBisDatum",
    "hauptfaelligkeit",
    "inkassoart",
    "kuendigungsklausel",
    "vertragsbeginn",
    "vertragsstatus",
    "zahlungsart",
    "zahlungsweise",
    "verkaufsprodukt",
    "vermittler",
    "partner",
    "gegenstand",
    "beitragszahler",
    "vertragsnummer",
    "aktivitaet",
    "aktenzeichenVertragspartner",
    "aenderungsdatum",
    "aenderungsgrund",
    "antragsnummerVM",
    "antragseingangsdatum",
    "policierungsdatum",
    "vertragsentstehung",
    "artDerBeratung",
    "antragsnummer",
    "alteVertragsnummer",
    "personengruppe",
    "bearbeitendeStelle",
    "vertragsnummerVM",
    "vertragsverbindungsnummer",
    "vertragspartner",
    "leistungsstoerung",
    "zahltermin",
    "zusaetzlicheVertragsdaten"
})
@XmlSeeAlso({
    CTVorNebenVertrag.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVertrag
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Abgangsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String abgangsdatum;
    @XmlElement(name = "Abgangsgrund")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAbgangsgrund abgangsgrund;
    @XmlElement(name = "AktenzeichenVM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aktenzeichenVM;
    @XmlElement(name = "Antragsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String antragsdatum;
    @XmlElement(name = "Antragsstatus")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAntragsstatus antragsstatus;
    @XmlElement(name = "GueltigAbDatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String gueltigAbDatum;
    @XmlElement(name = "GueltigBisDatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String gueltigBisDatum;
    @XmlElement(name = "Hauptfaelligkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String hauptfaelligkeit;
    @XmlElement(name = "Inkassoart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STInkassoart inkassoart;
    @XmlElement(name = "Kuendigungsklausel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean kuendigungsklausel;
    @XmlElement(name = "Vertragsbeginn")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String vertragsbeginn;
    @XmlElement(name = "Vertragsstatus")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVertragsstatus vertragsstatus;
    @XmlElement(name = "Zahlungsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsart zahlungsart;
    @XmlElement(name = "Zahlungsweise")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsweise zahlungsweise;
    @XmlElement(name = "Verkaufsprodukt", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVerkaufsprodukt> verkaufsprodukt;
    @XmlElement(name = "Vermittler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVermittler> vermittler;
    @XmlElement(name = "Partner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPartner> partner;
    @XmlElement(name = "Gegenstand")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTGegenstand> gegenstand;
    @XmlElement(name = "Beitragszahler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBeitragszahler beitragszahler;
    @XmlElement(name = "Vertragsnummer", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertragsnummer vertragsnummer;
    @XmlElement(name = "Aktivitaet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTAktivitaet> aktivitaet;
    @XmlElement(name = "AktenzeichenVertragspartner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aktenzeichenVertragspartner;
    @XmlElement(name = "Aenderungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aenderungsdatum;
    @XmlElement(name = "Aenderungsgrund")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<String> aenderungsgrund;
    @XmlElement(name = "AntragsnummerVM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String antragsnummerVM;
    @XmlElement(name = "Antragseingangsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String antragseingangsdatum;
    @XmlElement(name = "Policierungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String policierungsdatum;
    @XmlElement(name = "Vertragsentstehung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVertragsentstehung vertragsentstehung;
    @XmlElement(name = "ArtDerBeratung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STArtDerBeratung artDerBeratung;
    @XmlElement(name = "Antragsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String antragsnummer;
    @XmlElement(name = "AlteVertragsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertragsnummer alteVertragsnummer;
    @XmlElement(name = "Personengruppe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPersonengruppe> personengruppe;
    @XmlElement(name = "BearbeitendeStelle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBearbeitendeStelle bearbeitendeStelle;
    @XmlElement(name = "VertragsnummerVM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertragsnummer vertragsnummerVM;
    @XmlElement(name = "Vertragsverbindungsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVertragsnummer> vertragsverbindungsnummer;
    @XmlElement(name = "Vertragspartner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertragspartner vertragspartner;
    @XmlElement(name = "Leistungsstoerung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean leistungsstoerung;
    @XmlElement(name = "Zahltermin")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String zahltermin;
    @XmlElement(name = "ZusaetzlicheVertragsdaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTZusaetzlicheVertragsdaten> zusaetzlicheVertragsdaten;

    /**
     * Gets the value of the abgangsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAbgangsdatum() {
        return abgangsdatum;
    }

    /**
     * Sets the value of the abgangsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbgangsdatum(String value) {
        this.abgangsdatum = value;
    }

    /**
     * Gets the value of the abgangsgrund property.
     * 
     * @return
     *     possible object is
     *     {@link STAbgangsgrund }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAbgangsgrund getAbgangsgrund() {
        return abgangsgrund;
    }

    /**
     * Sets the value of the abgangsgrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAbgangsgrund }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbgangsgrund(STAbgangsgrund value) {
        this.abgangsgrund = value;
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
     * Gets the value of the antragsstatus property.
     * 
     * @return
     *     possible object is
     *     {@link STAntragsstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAntragsstatus getAntragsstatus() {
        return antragsstatus;
    }

    /**
     * Sets the value of the antragsstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAntragsstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAntragsstatus(STAntragsstatus value) {
        this.antragsstatus = value;
    }

    /**
     * Gets the value of the gueltigAbDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGueltigAbDatum() {
        return gueltigAbDatum;
    }

    /**
     * Sets the value of the gueltigAbDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGueltigAbDatum(String value) {
        this.gueltigAbDatum = value;
    }

    /**
     * Gets the value of the gueltigBisDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGueltigBisDatum() {
        return gueltigBisDatum;
    }

    /**
     * Sets the value of the gueltigBisDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGueltigBisDatum(String value) {
        this.gueltigBisDatum = value;
    }

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
     * Gets the value of the inkassoart property.
     * 
     * @return
     *     possible object is
     *     {@link STInkassoart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STInkassoart getInkassoart() {
        return inkassoart;
    }

    /**
     * Sets the value of the inkassoart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STInkassoart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setInkassoart(STInkassoart value) {
        this.inkassoart = value;
    }

    /**
     * Gets the value of the kuendigungsklausel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isKuendigungsklausel() {
        return kuendigungsklausel;
    }

    /**
     * Sets the value of the kuendigungsklausel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKuendigungsklausel(Boolean value) {
        this.kuendigungsklausel = value;
    }

    /**
     * Gets the value of the vertragsbeginn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getVertragsbeginn() {
        return vertragsbeginn;
    }

    /**
     * Sets the value of the vertragsbeginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertragsbeginn(String value) {
        this.vertragsbeginn = value;
    }

    /**
     * Gets the value of the vertragsstatus property.
     * 
     * @return
     *     possible object is
     *     {@link STVertragsstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVertragsstatus getVertragsstatus() {
        return vertragsstatus;
    }

    /**
     * Sets the value of the vertragsstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVertragsstatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertragsstatus(STVertragsstatus value) {
        this.vertragsstatus = value;
    }

    /**
     * Gets the value of the zahlungsart property.
     * 
     * @return
     *     possible object is
     *     {@link STZahlungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STZahlungsart getZahlungsart() {
        return zahlungsart;
    }

    /**
     * Sets the value of the zahlungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STZahlungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZahlungsart(STZahlungsart value) {
        this.zahlungsart = value;
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
     * Gets the value of the verkaufsprodukt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verkaufsprodukt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerkaufsprodukt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVerkaufsprodukt }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVerkaufsprodukt> getVerkaufsprodukt() {
        if (verkaufsprodukt == null) {
            verkaufsprodukt = new ArrayList<CTVerkaufsprodukt>();
        }
        return this.verkaufsprodukt;
    }

    /**
     * Gets the value of the vermittler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vermittler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVermittler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVermittler }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVermittler> getVermittler() {
        if (vermittler == null) {
            vermittler = new ArrayList<CTVermittler>();
        }
        return this.vermittler;
    }

    /**
     * Gets the value of the partner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPartner }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTPartner> getPartner() {
        if (partner == null) {
            partner = new ArrayList<CTPartner>();
        }
        return this.partner;
    }

    /**
     * Gets the value of the gegenstand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gegenstand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGegenstand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTGegenstand }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTGegenstand> getGegenstand() {
        if (gegenstand == null) {
            gegenstand = new ArrayList<CTGegenstand>();
        }
        return this.gegenstand;
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
     * Gets the value of the aktivitaet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aktivitaet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAktivitaet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAktivitaet }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTAktivitaet> getAktivitaet() {
        if (aktivitaet == null) {
            aktivitaet = new ArrayList<CTAktivitaet>();
        }
        return this.aktivitaet;
    }

    /**
     * Gets the value of the aktenzeichenVertragspartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAktenzeichenVertragspartner() {
        return aktenzeichenVertragspartner;
    }

    /**
     * Sets the value of the aktenzeichenVertragspartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAktenzeichenVertragspartner(String value) {
        this.aktenzeichenVertragspartner = value;
    }

    /**
     * Gets the value of the aenderungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAenderungsdatum() {
        return aenderungsdatum;
    }

    /**
     * Sets the value of the aenderungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAenderungsdatum(String value) {
        this.aenderungsdatum = value;
    }

    /**
     * Gets the value of the aenderungsgrund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aenderungsgrund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAenderungsgrund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<String> getAenderungsgrund() {
        if (aenderungsgrund == null) {
            aenderungsgrund = new ArrayList<String>();
        }
        return this.aenderungsgrund;
    }

    /**
     * Gets the value of the antragsnummerVM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAntragsnummerVM() {
        return antragsnummerVM;
    }

    /**
     * Sets the value of the antragsnummerVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAntragsnummerVM(String value) {
        this.antragsnummerVM = value;
    }

    /**
     * Gets the value of the antragseingangsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAntragseingangsdatum() {
        return antragseingangsdatum;
    }

    /**
     * Sets the value of the antragseingangsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAntragseingangsdatum(String value) {
        this.antragseingangsdatum = value;
    }

    /**
     * Gets the value of the policierungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPolicierungsdatum() {
        return policierungsdatum;
    }

    /**
     * Sets the value of the policierungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPolicierungsdatum(String value) {
        this.policierungsdatum = value;
    }

    /**
     * Gets the value of the vertragsentstehung property.
     * 
     * @return
     *     possible object is
     *     {@link STVertragsentstehung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVertragsentstehung getVertragsentstehung() {
        return vertragsentstehung;
    }

    /**
     * Sets the value of the vertragsentstehung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVertragsentstehung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertragsentstehung(STVertragsentstehung value) {
        this.vertragsentstehung = value;
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
     * Gets the value of the antragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAntragsnummer() {
        return antragsnummer;
    }

    /**
     * Sets the value of the antragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAntragsnummer(String value) {
        this.antragsnummer = value;
    }

    /**
     * Gets the value of the alteVertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link CTVertragsnummer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer getAlteVertragsnummer() {
        return alteVertragsnummer;
    }

    /**
     * Sets the value of the alteVertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVertragsnummer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAlteVertragsnummer(CTVertragsnummer value) {
        this.alteVertragsnummer = value;
    }

    /**
     * Gets the value of the personengruppe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personengruppe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonengruppe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPersonengruppe }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTPersonengruppe> getPersonengruppe() {
        if (personengruppe == null) {
            personengruppe = new ArrayList<CTPersonengruppe>();
        }
        return this.personengruppe;
    }

    /**
     * Gets the value of the bearbeitendeStelle property.
     * 
     * @return
     *     possible object is
     *     {@link CTBearbeitendeStelle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBearbeitendeStelle getBearbeitendeStelle() {
        return bearbeitendeStelle;
    }

    /**
     * Sets the value of the bearbeitendeStelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBearbeitendeStelle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBearbeitendeStelle(CTBearbeitendeStelle value) {
        this.bearbeitendeStelle = value;
    }

    /**
     * Gets the value of the vertragsnummerVM property.
     * 
     * @return
     *     possible object is
     *     {@link CTVertragsnummer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer getVertragsnummerVM() {
        return vertragsnummerVM;
    }

    /**
     * Sets the value of the vertragsnummerVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVertragsnummer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertragsnummerVM(CTVertragsnummer value) {
        this.vertragsnummerVM = value;
    }

    /**
     * Gets the value of the vertragsverbindungsnummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vertragsverbindungsnummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVertragsverbindungsnummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVertragsnummer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVertragsnummer> getVertragsverbindungsnummer() {
        if (vertragsverbindungsnummer == null) {
            vertragsverbindungsnummer = new ArrayList<CTVertragsnummer>();
        }
        return this.vertragsverbindungsnummer;
    }

    /**
     * Gets the value of the vertragspartner property.
     * 
     * @return
     *     possible object is
     *     {@link CTVertragspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertragspartner getVertragspartner() {
        return vertragspartner;
    }

    /**
     * Sets the value of the vertragspartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVertragspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertragspartner(CTVertragspartner value) {
        this.vertragspartner = value;
    }

    /**
     * Gets the value of the leistungsstoerung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isLeistungsstoerung() {
        return leistungsstoerung;
    }

    /**
     * Sets the value of the leistungsstoerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLeistungsstoerung(Boolean value) {
        this.leistungsstoerung = value;
    }

    /**
     * Gets the value of the zahltermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getZahltermin() {
        return zahltermin;
    }

    /**
     * Sets the value of the zahltermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZahltermin(String value) {
        this.zahltermin = value;
    }

    /**
     * Gets the value of the zusaetzlicheVertragsdaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zusaetzlicheVertragsdaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZusaetzlicheVertragsdaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTZusaetzlicheVertragsdaten }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTZusaetzlicheVertragsdaten> getZusaetzlicheVertragsdaten() {
        if (zusaetzlicheVertragsdaten == null) {
            zusaetzlicheVertragsdaten = new ArrayList<CTZusaetzlicheVertragsdaten>();
        }
        return this.zusaetzlicheVertragsdaten;
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
        final CTVertrag that = ((CTVertrag) object);
        {
            String lhsAbgangsdatum;
            lhsAbgangsdatum = this.getAbgangsdatum();
            String rhsAbgangsdatum;
            rhsAbgangsdatum = that.getAbgangsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abgangsdatum", lhsAbgangsdatum), LocatorUtils.property(thatLocator, "abgangsdatum", rhsAbgangsdatum), lhsAbgangsdatum, rhsAbgangsdatum, (this.abgangsdatum!= null), (that.abgangsdatum!= null))) {
                return false;
            }
        }
        {
            STAbgangsgrund lhsAbgangsgrund;
            lhsAbgangsgrund = this.getAbgangsgrund();
            STAbgangsgrund rhsAbgangsgrund;
            rhsAbgangsgrund = that.getAbgangsgrund();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abgangsgrund", lhsAbgangsgrund), LocatorUtils.property(thatLocator, "abgangsgrund", rhsAbgangsgrund), lhsAbgangsgrund, rhsAbgangsgrund, (this.abgangsgrund!= null), (that.abgangsgrund!= null))) {
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
            String lhsAntragsdatum;
            lhsAntragsdatum = this.getAntragsdatum();
            String rhsAntragsdatum;
            rhsAntragsdatum = that.getAntragsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragsdatum", lhsAntragsdatum), LocatorUtils.property(thatLocator, "antragsdatum", rhsAntragsdatum), lhsAntragsdatum, rhsAntragsdatum, (this.antragsdatum!= null), (that.antragsdatum!= null))) {
                return false;
            }
        }
        {
            STAntragsstatus lhsAntragsstatus;
            lhsAntragsstatus = this.getAntragsstatus();
            STAntragsstatus rhsAntragsstatus;
            rhsAntragsstatus = that.getAntragsstatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragsstatus", lhsAntragsstatus), LocatorUtils.property(thatLocator, "antragsstatus", rhsAntragsstatus), lhsAntragsstatus, rhsAntragsstatus, (this.antragsstatus!= null), (that.antragsstatus!= null))) {
                return false;
            }
        }
        {
            String lhsGueltigAbDatum;
            lhsGueltigAbDatum = this.getGueltigAbDatum();
            String rhsGueltigAbDatum;
            rhsGueltigAbDatum = that.getGueltigAbDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigAbDatum", lhsGueltigAbDatum), LocatorUtils.property(thatLocator, "gueltigAbDatum", rhsGueltigAbDatum), lhsGueltigAbDatum, rhsGueltigAbDatum, (this.gueltigAbDatum!= null), (that.gueltigAbDatum!= null))) {
                return false;
            }
        }
        {
            String lhsGueltigBisDatum;
            lhsGueltigBisDatum = this.getGueltigBisDatum();
            String rhsGueltigBisDatum;
            rhsGueltigBisDatum = that.getGueltigBisDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigBisDatum", lhsGueltigBisDatum), LocatorUtils.property(thatLocator, "gueltigBisDatum", rhsGueltigBisDatum), lhsGueltigBisDatum, rhsGueltigBisDatum, (this.gueltigBisDatum!= null), (that.gueltigBisDatum!= null))) {
                return false;
            }
        }
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
            STInkassoart lhsInkassoart;
            lhsInkassoart = this.getInkassoart();
            STInkassoart rhsInkassoart;
            rhsInkassoart = that.getInkassoart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inkassoart", lhsInkassoart), LocatorUtils.property(thatLocator, "inkassoart", rhsInkassoart), lhsInkassoart, rhsInkassoart, (this.inkassoart!= null), (that.inkassoart!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKuendigungsklausel;
            lhsKuendigungsklausel = this.isKuendigungsklausel();
            Boolean rhsKuendigungsklausel;
            rhsKuendigungsklausel = that.isKuendigungsklausel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kuendigungsklausel", lhsKuendigungsklausel), LocatorUtils.property(thatLocator, "kuendigungsklausel", rhsKuendigungsklausel), lhsKuendigungsklausel, rhsKuendigungsklausel, (this.kuendigungsklausel!= null), (that.kuendigungsklausel!= null))) {
                return false;
            }
        }
        {
            String lhsVertragsbeginn;
            lhsVertragsbeginn = this.getVertragsbeginn();
            String rhsVertragsbeginn;
            rhsVertragsbeginn = that.getVertragsbeginn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsbeginn", lhsVertragsbeginn), LocatorUtils.property(thatLocator, "vertragsbeginn", rhsVertragsbeginn), lhsVertragsbeginn, rhsVertragsbeginn, (this.vertragsbeginn!= null), (that.vertragsbeginn!= null))) {
                return false;
            }
        }
        {
            STVertragsstatus lhsVertragsstatus;
            lhsVertragsstatus = this.getVertragsstatus();
            STVertragsstatus rhsVertragsstatus;
            rhsVertragsstatus = that.getVertragsstatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsstatus", lhsVertragsstatus), LocatorUtils.property(thatLocator, "vertragsstatus", rhsVertragsstatus), lhsVertragsstatus, rhsVertragsstatus, (this.vertragsstatus!= null), (that.vertragsstatus!= null))) {
                return false;
            }
        }
        {
            STZahlungsart lhsZahlungsart;
            lhsZahlungsart = this.getZahlungsart();
            STZahlungsart rhsZahlungsart;
            rhsZahlungsart = that.getZahlungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zahlungsart", lhsZahlungsart), LocatorUtils.property(thatLocator, "zahlungsart", rhsZahlungsart), lhsZahlungsart, rhsZahlungsart, (this.zahlungsart!= null), (that.zahlungsart!= null))) {
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
            List<CTVerkaufsprodukt> lhsVerkaufsprodukt;
            lhsVerkaufsprodukt = (((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty()))?this.getVerkaufsprodukt():null);
            List<CTVerkaufsprodukt> rhsVerkaufsprodukt;
            rhsVerkaufsprodukt = (((that.verkaufsprodukt!= null)&&(!that.verkaufsprodukt.isEmpty()))?that.getVerkaufsprodukt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verkaufsprodukt", lhsVerkaufsprodukt), LocatorUtils.property(thatLocator, "verkaufsprodukt", rhsVerkaufsprodukt), lhsVerkaufsprodukt, rhsVerkaufsprodukt, ((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty())), ((that.verkaufsprodukt!= null)&&(!that.verkaufsprodukt.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTVermittler> lhsVermittler;
            lhsVermittler = (((this.vermittler!= null)&&(!this.vermittler.isEmpty()))?this.getVermittler():null);
            List<CTVermittler> rhsVermittler;
            rhsVermittler = (((that.vermittler!= null)&&(!that.vermittler.isEmpty()))?that.getVermittler():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittler", lhsVermittler), LocatorUtils.property(thatLocator, "vermittler", rhsVermittler), lhsVermittler, rhsVermittler, ((this.vermittler!= null)&&(!this.vermittler.isEmpty())), ((that.vermittler!= null)&&(!that.vermittler.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTPartner> lhsPartner;
            lhsPartner = (((this.partner!= null)&&(!this.partner.isEmpty()))?this.getPartner():null);
            List<CTPartner> rhsPartner;
            rhsPartner = (((that.partner!= null)&&(!that.partner.isEmpty()))?that.getPartner():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partner", lhsPartner), LocatorUtils.property(thatLocator, "partner", rhsPartner), lhsPartner, rhsPartner, ((this.partner!= null)&&(!this.partner.isEmpty())), ((that.partner!= null)&&(!that.partner.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTGegenstand> lhsGegenstand;
            lhsGegenstand = (((this.gegenstand!= null)&&(!this.gegenstand.isEmpty()))?this.getGegenstand():null);
            List<CTGegenstand> rhsGegenstand;
            rhsGegenstand = (((that.gegenstand!= null)&&(!that.gegenstand.isEmpty()))?that.getGegenstand():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gegenstand", lhsGegenstand), LocatorUtils.property(thatLocator, "gegenstand", rhsGegenstand), lhsGegenstand, rhsGegenstand, ((this.gegenstand!= null)&&(!this.gegenstand.isEmpty())), ((that.gegenstand!= null)&&(!that.gegenstand.isEmpty())))) {
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
            List<CTAktivitaet> lhsAktivitaet;
            lhsAktivitaet = (((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty()))?this.getAktivitaet():null);
            List<CTAktivitaet> rhsAktivitaet;
            rhsAktivitaet = (((that.aktivitaet!= null)&&(!that.aktivitaet.isEmpty()))?that.getAktivitaet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktivitaet", lhsAktivitaet), LocatorUtils.property(thatLocator, "aktivitaet", rhsAktivitaet), lhsAktivitaet, rhsAktivitaet, ((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty())), ((that.aktivitaet!= null)&&(!that.aktivitaet.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsAktenzeichenVertragspartner;
            lhsAktenzeichenVertragspartner = this.getAktenzeichenVertragspartner();
            String rhsAktenzeichenVertragspartner;
            rhsAktenzeichenVertragspartner = that.getAktenzeichenVertragspartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichenVertragspartner", lhsAktenzeichenVertragspartner), LocatorUtils.property(thatLocator, "aktenzeichenVertragspartner", rhsAktenzeichenVertragspartner), lhsAktenzeichenVertragspartner, rhsAktenzeichenVertragspartner, (this.aktenzeichenVertragspartner!= null), (that.aktenzeichenVertragspartner!= null))) {
                return false;
            }
        }
        {
            String lhsAenderungsdatum;
            lhsAenderungsdatum = this.getAenderungsdatum();
            String rhsAenderungsdatum;
            rhsAenderungsdatum = that.getAenderungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aenderungsdatum", lhsAenderungsdatum), LocatorUtils.property(thatLocator, "aenderungsdatum", rhsAenderungsdatum), lhsAenderungsdatum, rhsAenderungsdatum, (this.aenderungsdatum!= null), (that.aenderungsdatum!= null))) {
                return false;
            }
        }
        {
            List<String> lhsAenderungsgrund;
            lhsAenderungsgrund = (((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))?this.getAenderungsgrund():null);
            List<String> rhsAenderungsgrund;
            rhsAenderungsgrund = (((that.aenderungsgrund!= null)&&(!that.aenderungsgrund.isEmpty()))?that.getAenderungsgrund():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aenderungsgrund", lhsAenderungsgrund), LocatorUtils.property(thatLocator, "aenderungsgrund", rhsAenderungsgrund), lhsAenderungsgrund, rhsAenderungsgrund, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty())), ((that.aenderungsgrund!= null)&&(!that.aenderungsgrund.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsAntragsnummerVM;
            lhsAntragsnummerVM = this.getAntragsnummerVM();
            String rhsAntragsnummerVM;
            rhsAntragsnummerVM = that.getAntragsnummerVM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragsnummerVM", lhsAntragsnummerVM), LocatorUtils.property(thatLocator, "antragsnummerVM", rhsAntragsnummerVM), lhsAntragsnummerVM, rhsAntragsnummerVM, (this.antragsnummerVM!= null), (that.antragsnummerVM!= null))) {
                return false;
            }
        }
        {
            String lhsAntragseingangsdatum;
            lhsAntragseingangsdatum = this.getAntragseingangsdatum();
            String rhsAntragseingangsdatum;
            rhsAntragseingangsdatum = that.getAntragseingangsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragseingangsdatum", lhsAntragseingangsdatum), LocatorUtils.property(thatLocator, "antragseingangsdatum", rhsAntragseingangsdatum), lhsAntragseingangsdatum, rhsAntragseingangsdatum, (this.antragseingangsdatum!= null), (that.antragseingangsdatum!= null))) {
                return false;
            }
        }
        {
            String lhsPolicierungsdatum;
            lhsPolicierungsdatum = this.getPolicierungsdatum();
            String rhsPolicierungsdatum;
            rhsPolicierungsdatum = that.getPolicierungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "policierungsdatum", lhsPolicierungsdatum), LocatorUtils.property(thatLocator, "policierungsdatum", rhsPolicierungsdatum), lhsPolicierungsdatum, rhsPolicierungsdatum, (this.policierungsdatum!= null), (that.policierungsdatum!= null))) {
                return false;
            }
        }
        {
            STVertragsentstehung lhsVertragsentstehung;
            lhsVertragsentstehung = this.getVertragsentstehung();
            STVertragsentstehung rhsVertragsentstehung;
            rhsVertragsentstehung = that.getVertragsentstehung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsentstehung", lhsVertragsentstehung), LocatorUtils.property(thatLocator, "vertragsentstehung", rhsVertragsentstehung), lhsVertragsentstehung, rhsVertragsentstehung, (this.vertragsentstehung!= null), (that.vertragsentstehung!= null))) {
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
            String lhsAntragsnummer;
            lhsAntragsnummer = this.getAntragsnummer();
            String rhsAntragsnummer;
            rhsAntragsnummer = that.getAntragsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antragsnummer", lhsAntragsnummer), LocatorUtils.property(thatLocator, "antragsnummer", rhsAntragsnummer), lhsAntragsnummer, rhsAntragsnummer, (this.antragsnummer!= null), (that.antragsnummer!= null))) {
                return false;
            }
        }
        {
            CTVertragsnummer lhsAlteVertragsnummer;
            lhsAlteVertragsnummer = this.getAlteVertragsnummer();
            CTVertragsnummer rhsAlteVertragsnummer;
            rhsAlteVertragsnummer = that.getAlteVertragsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alteVertragsnummer", lhsAlteVertragsnummer), LocatorUtils.property(thatLocator, "alteVertragsnummer", rhsAlteVertragsnummer), lhsAlteVertragsnummer, rhsAlteVertragsnummer, (this.alteVertragsnummer!= null), (that.alteVertragsnummer!= null))) {
                return false;
            }
        }
        {
            List<CTPersonengruppe> lhsPersonengruppe;
            lhsPersonengruppe = (((this.personengruppe!= null)&&(!this.personengruppe.isEmpty()))?this.getPersonengruppe():null);
            List<CTPersonengruppe> rhsPersonengruppe;
            rhsPersonengruppe = (((that.personengruppe!= null)&&(!that.personengruppe.isEmpty()))?that.getPersonengruppe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personengruppe", lhsPersonengruppe), LocatorUtils.property(thatLocator, "personengruppe", rhsPersonengruppe), lhsPersonengruppe, rhsPersonengruppe, ((this.personengruppe!= null)&&(!this.personengruppe.isEmpty())), ((that.personengruppe!= null)&&(!that.personengruppe.isEmpty())))) {
                return false;
            }
        }
        {
            CTBearbeitendeStelle lhsBearbeitendeStelle;
            lhsBearbeitendeStelle = this.getBearbeitendeStelle();
            CTBearbeitendeStelle rhsBearbeitendeStelle;
            rhsBearbeitendeStelle = that.getBearbeitendeStelle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bearbeitendeStelle", lhsBearbeitendeStelle), LocatorUtils.property(thatLocator, "bearbeitendeStelle", rhsBearbeitendeStelle), lhsBearbeitendeStelle, rhsBearbeitendeStelle, (this.bearbeitendeStelle!= null), (that.bearbeitendeStelle!= null))) {
                return false;
            }
        }
        {
            CTVertragsnummer lhsVertragsnummerVM;
            lhsVertragsnummerVM = this.getVertragsnummerVM();
            CTVertragsnummer rhsVertragsnummerVM;
            rhsVertragsnummerVM = that.getVertragsnummerVM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsnummerVM", lhsVertragsnummerVM), LocatorUtils.property(thatLocator, "vertragsnummerVM", rhsVertragsnummerVM), lhsVertragsnummerVM, rhsVertragsnummerVM, (this.vertragsnummerVM!= null), (that.vertragsnummerVM!= null))) {
                return false;
            }
        }
        {
            List<CTVertragsnummer> lhsVertragsverbindungsnummer;
            lhsVertragsverbindungsnummer = (((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty()))?this.getVertragsverbindungsnummer():null);
            List<CTVertragsnummer> rhsVertragsverbindungsnummer;
            rhsVertragsverbindungsnummer = (((that.vertragsverbindungsnummer!= null)&&(!that.vertragsverbindungsnummer.isEmpty()))?that.getVertragsverbindungsnummer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsverbindungsnummer", lhsVertragsverbindungsnummer), LocatorUtils.property(thatLocator, "vertragsverbindungsnummer", rhsVertragsverbindungsnummer), lhsVertragsverbindungsnummer, rhsVertragsverbindungsnummer, ((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty())), ((that.vertragsverbindungsnummer!= null)&&(!that.vertragsverbindungsnummer.isEmpty())))) {
                return false;
            }
        }
        {
            CTVertragspartner lhsVertragspartner;
            lhsVertragspartner = this.getVertragspartner();
            CTVertragspartner rhsVertragspartner;
            rhsVertragspartner = that.getVertragspartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragspartner", lhsVertragspartner), LocatorUtils.property(thatLocator, "vertragspartner", rhsVertragspartner), lhsVertragspartner, rhsVertragspartner, (this.vertragspartner!= null), (that.vertragspartner!= null))) {
                return false;
            }
        }
        {
            Boolean lhsLeistungsstoerung;
            lhsLeistungsstoerung = this.isLeistungsstoerung();
            Boolean rhsLeistungsstoerung;
            rhsLeistungsstoerung = that.isLeistungsstoerung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leistungsstoerung", lhsLeistungsstoerung), LocatorUtils.property(thatLocator, "leistungsstoerung", rhsLeistungsstoerung), lhsLeistungsstoerung, rhsLeistungsstoerung, (this.leistungsstoerung!= null), (that.leistungsstoerung!= null))) {
                return false;
            }
        }
        {
            String lhsZahltermin;
            lhsZahltermin = this.getZahltermin();
            String rhsZahltermin;
            rhsZahltermin = that.getZahltermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zahltermin", lhsZahltermin), LocatorUtils.property(thatLocator, "zahltermin", rhsZahltermin), lhsZahltermin, rhsZahltermin, (this.zahltermin!= null), (that.zahltermin!= null))) {
                return false;
            }
        }
        {
            List<CTZusaetzlicheVertragsdaten> lhsZusaetzlicheVertragsdaten;
            lhsZusaetzlicheVertragsdaten = (((this.zusaetzlicheVertragsdaten!= null)&&(!this.zusaetzlicheVertragsdaten.isEmpty()))?this.getZusaetzlicheVertragsdaten():null);
            List<CTZusaetzlicheVertragsdaten> rhsZusaetzlicheVertragsdaten;
            rhsZusaetzlicheVertragsdaten = (((that.zusaetzlicheVertragsdaten!= null)&&(!that.zusaetzlicheVertragsdaten.isEmpty()))?that.getZusaetzlicheVertragsdaten():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusaetzlicheVertragsdaten", lhsZusaetzlicheVertragsdaten), LocatorUtils.property(thatLocator, "zusaetzlicheVertragsdaten", rhsZusaetzlicheVertragsdaten), lhsZusaetzlicheVertragsdaten, rhsZusaetzlicheVertragsdaten, ((this.zusaetzlicheVertragsdaten!= null)&&(!this.zusaetzlicheVertragsdaten.isEmpty())), ((that.zusaetzlicheVertragsdaten!= null)&&(!that.zusaetzlicheVertragsdaten.isEmpty())))) {
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
            String theAbgangsdatum;
            theAbgangsdatum = this.getAbgangsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abgangsdatum", theAbgangsdatum), currentHashCode, theAbgangsdatum, (this.abgangsdatum!= null));
        }
        {
            STAbgangsgrund theAbgangsgrund;
            theAbgangsgrund = this.getAbgangsgrund();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abgangsgrund", theAbgangsgrund), currentHashCode, theAbgangsgrund, (this.abgangsgrund!= null));
        }
        {
            String theAktenzeichenVM;
            theAktenzeichenVM = this.getAktenzeichenVM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktenzeichenVM", theAktenzeichenVM), currentHashCode, theAktenzeichenVM, (this.aktenzeichenVM!= null));
        }
        {
            String theAntragsdatum;
            theAntragsdatum = this.getAntragsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragsdatum", theAntragsdatum), currentHashCode, theAntragsdatum, (this.antragsdatum!= null));
        }
        {
            STAntragsstatus theAntragsstatus;
            theAntragsstatus = this.getAntragsstatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragsstatus", theAntragsstatus), currentHashCode, theAntragsstatus, (this.antragsstatus!= null));
        }
        {
            String theGueltigAbDatum;
            theGueltigAbDatum = this.getGueltigAbDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigAbDatum", theGueltigAbDatum), currentHashCode, theGueltigAbDatum, (this.gueltigAbDatum!= null));
        }
        {
            String theGueltigBisDatum;
            theGueltigBisDatum = this.getGueltigBisDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigBisDatum", theGueltigBisDatum), currentHashCode, theGueltigBisDatum, (this.gueltigBisDatum!= null));
        }
        {
            String theHauptfaelligkeit;
            theHauptfaelligkeit = this.getHauptfaelligkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hauptfaelligkeit", theHauptfaelligkeit), currentHashCode, theHauptfaelligkeit, (this.hauptfaelligkeit!= null));
        }
        {
            STInkassoart theInkassoart;
            theInkassoart = this.getInkassoart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inkassoart", theInkassoart), currentHashCode, theInkassoart, (this.inkassoart!= null));
        }
        {
            Boolean theKuendigungsklausel;
            theKuendigungsklausel = this.isKuendigungsklausel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kuendigungsklausel", theKuendigungsklausel), currentHashCode, theKuendigungsklausel, (this.kuendigungsklausel!= null));
        }
        {
            String theVertragsbeginn;
            theVertragsbeginn = this.getVertragsbeginn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsbeginn", theVertragsbeginn), currentHashCode, theVertragsbeginn, (this.vertragsbeginn!= null));
        }
        {
            STVertragsstatus theVertragsstatus;
            theVertragsstatus = this.getVertragsstatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsstatus", theVertragsstatus), currentHashCode, theVertragsstatus, (this.vertragsstatus!= null));
        }
        {
            STZahlungsart theZahlungsart;
            theZahlungsart = this.getZahlungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahlungsart", theZahlungsart), currentHashCode, theZahlungsart, (this.zahlungsart!= null));
        }
        {
            STZahlungsweise theZahlungsweise;
            theZahlungsweise = this.getZahlungsweise();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahlungsweise", theZahlungsweise), currentHashCode, theZahlungsweise, (this.zahlungsweise!= null));
        }
        {
            List<CTVerkaufsprodukt> theVerkaufsprodukt;
            theVerkaufsprodukt = (((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty()))?this.getVerkaufsprodukt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verkaufsprodukt", theVerkaufsprodukt), currentHashCode, theVerkaufsprodukt, ((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty())));
        }
        {
            List<CTVermittler> theVermittler;
            theVermittler = (((this.vermittler!= null)&&(!this.vermittler.isEmpty()))?this.getVermittler():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittler", theVermittler), currentHashCode, theVermittler, ((this.vermittler!= null)&&(!this.vermittler.isEmpty())));
        }
        {
            List<CTPartner> thePartner;
            thePartner = (((this.partner!= null)&&(!this.partner.isEmpty()))?this.getPartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partner", thePartner), currentHashCode, thePartner, ((this.partner!= null)&&(!this.partner.isEmpty())));
        }
        {
            List<CTGegenstand> theGegenstand;
            theGegenstand = (((this.gegenstand!= null)&&(!this.gegenstand.isEmpty()))?this.getGegenstand():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gegenstand", theGegenstand), currentHashCode, theGegenstand, ((this.gegenstand!= null)&&(!this.gegenstand.isEmpty())));
        }
        {
            CTBeitragszahler theBeitragszahler;
            theBeitragszahler = this.getBeitragszahler();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragszahler", theBeitragszahler), currentHashCode, theBeitragszahler, (this.beitragszahler!= null));
        }
        {
            CTVertragsnummer theVertragsnummer;
            theVertragsnummer = this.getVertragsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsnummer", theVertragsnummer), currentHashCode, theVertragsnummer, (this.vertragsnummer!= null));
        }
        {
            List<CTAktivitaet> theAktivitaet;
            theAktivitaet = (((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty()))?this.getAktivitaet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktivitaet", theAktivitaet), currentHashCode, theAktivitaet, ((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty())));
        }
        {
            String theAktenzeichenVertragspartner;
            theAktenzeichenVertragspartner = this.getAktenzeichenVertragspartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktenzeichenVertragspartner", theAktenzeichenVertragspartner), currentHashCode, theAktenzeichenVertragspartner, (this.aktenzeichenVertragspartner!= null));
        }
        {
            String theAenderungsdatum;
            theAenderungsdatum = this.getAenderungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aenderungsdatum", theAenderungsdatum), currentHashCode, theAenderungsdatum, (this.aenderungsdatum!= null));
        }
        {
            List<String> theAenderungsgrund;
            theAenderungsgrund = (((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))?this.getAenderungsgrund():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aenderungsgrund", theAenderungsgrund), currentHashCode, theAenderungsgrund, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty())));
        }
        {
            String theAntragsnummerVM;
            theAntragsnummerVM = this.getAntragsnummerVM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragsnummerVM", theAntragsnummerVM), currentHashCode, theAntragsnummerVM, (this.antragsnummerVM!= null));
        }
        {
            String theAntragseingangsdatum;
            theAntragseingangsdatum = this.getAntragseingangsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragseingangsdatum", theAntragseingangsdatum), currentHashCode, theAntragseingangsdatum, (this.antragseingangsdatum!= null));
        }
        {
            String thePolicierungsdatum;
            thePolicierungsdatum = this.getPolicierungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "policierungsdatum", thePolicierungsdatum), currentHashCode, thePolicierungsdatum, (this.policierungsdatum!= null));
        }
        {
            STVertragsentstehung theVertragsentstehung;
            theVertragsentstehung = this.getVertragsentstehung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsentstehung", theVertragsentstehung), currentHashCode, theVertragsentstehung, (this.vertragsentstehung!= null));
        }
        {
            STArtDerBeratung theArtDerBeratung;
            theArtDerBeratung = this.getArtDerBeratung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artDerBeratung", theArtDerBeratung), currentHashCode, theArtDerBeratung, (this.artDerBeratung!= null));
        }
        {
            String theAntragsnummer;
            theAntragsnummer = this.getAntragsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antragsnummer", theAntragsnummer), currentHashCode, theAntragsnummer, (this.antragsnummer!= null));
        }
        {
            CTVertragsnummer theAlteVertragsnummer;
            theAlteVertragsnummer = this.getAlteVertragsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alteVertragsnummer", theAlteVertragsnummer), currentHashCode, theAlteVertragsnummer, (this.alteVertragsnummer!= null));
        }
        {
            List<CTPersonengruppe> thePersonengruppe;
            thePersonengruppe = (((this.personengruppe!= null)&&(!this.personengruppe.isEmpty()))?this.getPersonengruppe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personengruppe", thePersonengruppe), currentHashCode, thePersonengruppe, ((this.personengruppe!= null)&&(!this.personengruppe.isEmpty())));
        }
        {
            CTBearbeitendeStelle theBearbeitendeStelle;
            theBearbeitendeStelle = this.getBearbeitendeStelle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bearbeitendeStelle", theBearbeitendeStelle), currentHashCode, theBearbeitendeStelle, (this.bearbeitendeStelle!= null));
        }
        {
            CTVertragsnummer theVertragsnummerVM;
            theVertragsnummerVM = this.getVertragsnummerVM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsnummerVM", theVertragsnummerVM), currentHashCode, theVertragsnummerVM, (this.vertragsnummerVM!= null));
        }
        {
            List<CTVertragsnummer> theVertragsverbindungsnummer;
            theVertragsverbindungsnummer = (((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty()))?this.getVertragsverbindungsnummer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsverbindungsnummer", theVertragsverbindungsnummer), currentHashCode, theVertragsverbindungsnummer, ((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty())));
        }
        {
            CTVertragspartner theVertragspartner;
            theVertragspartner = this.getVertragspartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragspartner", theVertragspartner), currentHashCode, theVertragspartner, (this.vertragspartner!= null));
        }
        {
            Boolean theLeistungsstoerung;
            theLeistungsstoerung = this.isLeistungsstoerung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leistungsstoerung", theLeistungsstoerung), currentHashCode, theLeistungsstoerung, (this.leistungsstoerung!= null));
        }
        {
            String theZahltermin;
            theZahltermin = this.getZahltermin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahltermin", theZahltermin), currentHashCode, theZahltermin, (this.zahltermin!= null));
        }
        {
            List<CTZusaetzlicheVertragsdaten> theZusaetzlicheVertragsdaten;
            theZusaetzlicheVertragsdaten = (((this.zusaetzlicheVertragsdaten!= null)&&(!this.zusaetzlicheVertragsdaten.isEmpty()))?this.getZusaetzlicheVertragsdaten():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zusaetzlicheVertragsdaten", theZusaetzlicheVertragsdaten), currentHashCode, theZusaetzlicheVertragsdaten, ((this.zusaetzlicheVertragsdaten!= null)&&(!this.zusaetzlicheVertragsdaten.isEmpty())));
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
        if (draftCopy instanceof CTVertrag) {
            final CTVertrag copy = ((CTVertrag) draftCopy);
            {
                Boolean abgangsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abgangsdatum!= null));
                if (abgangsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAbgangsdatum;
                    sourceAbgangsdatum = this.getAbgangsdatum();
                    String copyAbgangsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "abgangsdatum", sourceAbgangsdatum), sourceAbgangsdatum, (this.abgangsdatum!= null)));
                    copy.setAbgangsdatum(copyAbgangsdatum);
                } else {
                    if (abgangsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abgangsdatum = null;
                    }
                }
            }
            {
                Boolean abgangsgrundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abgangsgrund!= null));
                if (abgangsgrundShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAbgangsgrund sourceAbgangsgrund;
                    sourceAbgangsgrund = this.getAbgangsgrund();
                    STAbgangsgrund copyAbgangsgrund = ((STAbgangsgrund) strategy.copy(LocatorUtils.property(locator, "abgangsgrund", sourceAbgangsgrund), sourceAbgangsgrund, (this.abgangsgrund!= null)));
                    copy.setAbgangsgrund(copyAbgangsgrund);
                } else {
                    if (abgangsgrundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abgangsgrund = null;
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
                Boolean antragsstatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antragsstatus!= null));
                if (antragsstatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAntragsstatus sourceAntragsstatus;
                    sourceAntragsstatus = this.getAntragsstatus();
                    STAntragsstatus copyAntragsstatus = ((STAntragsstatus) strategy.copy(LocatorUtils.property(locator, "antragsstatus", sourceAntragsstatus), sourceAntragsstatus, (this.antragsstatus!= null)));
                    copy.setAntragsstatus(copyAntragsstatus);
                } else {
                    if (antragsstatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antragsstatus = null;
                    }
                }
            }
            {
                Boolean gueltigAbDatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigAbDatum!= null));
                if (gueltigAbDatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGueltigAbDatum;
                    sourceGueltigAbDatum = this.getGueltigAbDatum();
                    String copyGueltigAbDatum = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigAbDatum", sourceGueltigAbDatum), sourceGueltigAbDatum, (this.gueltigAbDatum!= null)));
                    copy.setGueltigAbDatum(copyGueltigAbDatum);
                } else {
                    if (gueltigAbDatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigAbDatum = null;
                    }
                }
            }
            {
                Boolean gueltigBisDatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigBisDatum!= null));
                if (gueltigBisDatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGueltigBisDatum;
                    sourceGueltigBisDatum = this.getGueltigBisDatum();
                    String copyGueltigBisDatum = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigBisDatum", sourceGueltigBisDatum), sourceGueltigBisDatum, (this.gueltigBisDatum!= null)));
                    copy.setGueltigBisDatum(copyGueltigBisDatum);
                } else {
                    if (gueltigBisDatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigBisDatum = null;
                    }
                }
            }
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
                Boolean inkassoartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inkassoart!= null));
                if (inkassoartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STInkassoart sourceInkassoart;
                    sourceInkassoart = this.getInkassoart();
                    STInkassoart copyInkassoart = ((STInkassoart) strategy.copy(LocatorUtils.property(locator, "inkassoart", sourceInkassoart), sourceInkassoart, (this.inkassoart!= null)));
                    copy.setInkassoart(copyInkassoart);
                } else {
                    if (inkassoartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inkassoart = null;
                    }
                }
            }
            {
                Boolean kuendigungsklauselShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kuendigungsklausel!= null));
                if (kuendigungsklauselShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKuendigungsklausel;
                    sourceKuendigungsklausel = this.isKuendigungsklausel();
                    Boolean copyKuendigungsklausel = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kuendigungsklausel", sourceKuendigungsklausel), sourceKuendigungsklausel, (this.kuendigungsklausel!= null)));
                    copy.setKuendigungsklausel(copyKuendigungsklausel);
                } else {
                    if (kuendigungsklauselShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kuendigungsklausel = null;
                    }
                }
            }
            {
                Boolean vertragsbeginnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertragsbeginn!= null));
                if (vertragsbeginnShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVertragsbeginn;
                    sourceVertragsbeginn = this.getVertragsbeginn();
                    String copyVertragsbeginn = ((String) strategy.copy(LocatorUtils.property(locator, "vertragsbeginn", sourceVertragsbeginn), sourceVertragsbeginn, (this.vertragsbeginn!= null)));
                    copy.setVertragsbeginn(copyVertragsbeginn);
                } else {
                    if (vertragsbeginnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsbeginn = null;
                    }
                }
            }
            {
                Boolean vertragsstatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertragsstatus!= null));
                if (vertragsstatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVertragsstatus sourceVertragsstatus;
                    sourceVertragsstatus = this.getVertragsstatus();
                    STVertragsstatus copyVertragsstatus = ((STVertragsstatus) strategy.copy(LocatorUtils.property(locator, "vertragsstatus", sourceVertragsstatus), sourceVertragsstatus, (this.vertragsstatus!= null)));
                    copy.setVertragsstatus(copyVertragsstatus);
                } else {
                    if (vertragsstatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsstatus = null;
                    }
                }
            }
            {
                Boolean zahlungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zahlungsart!= null));
                if (zahlungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STZahlungsart sourceZahlungsart;
                    sourceZahlungsart = this.getZahlungsart();
                    STZahlungsart copyZahlungsart = ((STZahlungsart) strategy.copy(LocatorUtils.property(locator, "zahlungsart", sourceZahlungsart), sourceZahlungsart, (this.zahlungsart!= null)));
                    copy.setZahlungsart(copyZahlungsart);
                } else {
                    if (zahlungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zahlungsart = null;
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
                Boolean verkaufsproduktShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty())));
                if (verkaufsproduktShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVerkaufsprodukt> sourceVerkaufsprodukt;
                    sourceVerkaufsprodukt = (((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty()))?this.getVerkaufsprodukt():null);
                    @SuppressWarnings("unchecked")
                    List<CTVerkaufsprodukt> copyVerkaufsprodukt = ((List<CTVerkaufsprodukt> ) strategy.copy(LocatorUtils.property(locator, "verkaufsprodukt", sourceVerkaufsprodukt), sourceVerkaufsprodukt, ((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty()))));
                    copy.verkaufsprodukt = null;
                    if (copyVerkaufsprodukt!= null) {
                        List<CTVerkaufsprodukt> uniqueVerkaufsproduktl = copy.getVerkaufsprodukt();
                        uniqueVerkaufsproduktl.addAll(copyVerkaufsprodukt);
                    }
                } else {
                    if (verkaufsproduktShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verkaufsprodukt = null;
                    }
                }
            }
            {
                Boolean vermittlerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vermittler!= null)&&(!this.vermittler.isEmpty())));
                if (vermittlerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVermittler> sourceVermittler;
                    sourceVermittler = (((this.vermittler!= null)&&(!this.vermittler.isEmpty()))?this.getVermittler():null);
                    @SuppressWarnings("unchecked")
                    List<CTVermittler> copyVermittler = ((List<CTVermittler> ) strategy.copy(LocatorUtils.property(locator, "vermittler", sourceVermittler), sourceVermittler, ((this.vermittler!= null)&&(!this.vermittler.isEmpty()))));
                    copy.vermittler = null;
                    if (copyVermittler!= null) {
                        List<CTVermittler> uniqueVermittlerl = copy.getVermittler();
                        uniqueVermittlerl.addAll(copyVermittler);
                    }
                } else {
                    if (vermittlerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittler = null;
                    }
                }
            }
            {
                Boolean partnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.partner!= null)&&(!this.partner.isEmpty())));
                if (partnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTPartner> sourcePartner;
                    sourcePartner = (((this.partner!= null)&&(!this.partner.isEmpty()))?this.getPartner():null);
                    @SuppressWarnings("unchecked")
                    List<CTPartner> copyPartner = ((List<CTPartner> ) strategy.copy(LocatorUtils.property(locator, "partner", sourcePartner), sourcePartner, ((this.partner!= null)&&(!this.partner.isEmpty()))));
                    copy.partner = null;
                    if (copyPartner!= null) {
                        List<CTPartner> uniquePartnerl = copy.getPartner();
                        uniquePartnerl.addAll(copyPartner);
                    }
                } else {
                    if (partnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partner = null;
                    }
                }
            }
            {
                Boolean gegenstandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gegenstand!= null)&&(!this.gegenstand.isEmpty())));
                if (gegenstandShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTGegenstand> sourceGegenstand;
                    sourceGegenstand = (((this.gegenstand!= null)&&(!this.gegenstand.isEmpty()))?this.getGegenstand():null);
                    @SuppressWarnings("unchecked")
                    List<CTGegenstand> copyGegenstand = ((List<CTGegenstand> ) strategy.copy(LocatorUtils.property(locator, "gegenstand", sourceGegenstand), sourceGegenstand, ((this.gegenstand!= null)&&(!this.gegenstand.isEmpty()))));
                    copy.gegenstand = null;
                    if (copyGegenstand!= null) {
                        List<CTGegenstand> uniqueGegenstandl = copy.getGegenstand();
                        uniqueGegenstandl.addAll(copyGegenstand);
                    }
                } else {
                    if (gegenstandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gegenstand = null;
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
                Boolean aktivitaetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty())));
                if (aktivitaetShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTAktivitaet> sourceAktivitaet;
                    sourceAktivitaet = (((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty()))?this.getAktivitaet():null);
                    @SuppressWarnings("unchecked")
                    List<CTAktivitaet> copyAktivitaet = ((List<CTAktivitaet> ) strategy.copy(LocatorUtils.property(locator, "aktivitaet", sourceAktivitaet), sourceAktivitaet, ((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty()))));
                    copy.aktivitaet = null;
                    if (copyAktivitaet!= null) {
                        List<CTAktivitaet> uniqueAktivitaetl = copy.getAktivitaet();
                        uniqueAktivitaetl.addAll(copyAktivitaet);
                    }
                } else {
                    if (aktivitaetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktivitaet = null;
                    }
                }
            }
            {
                Boolean aktenzeichenVertragspartnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktenzeichenVertragspartner!= null));
                if (aktenzeichenVertragspartnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktenzeichenVertragspartner;
                    sourceAktenzeichenVertragspartner = this.getAktenzeichenVertragspartner();
                    String copyAktenzeichenVertragspartner = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichenVertragspartner", sourceAktenzeichenVertragspartner), sourceAktenzeichenVertragspartner, (this.aktenzeichenVertragspartner!= null)));
                    copy.setAktenzeichenVertragspartner(copyAktenzeichenVertragspartner);
                } else {
                    if (aktenzeichenVertragspartnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktenzeichenVertragspartner = null;
                    }
                }
            }
            {
                Boolean aenderungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aenderungsdatum!= null));
                if (aenderungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAenderungsdatum;
                    sourceAenderungsdatum = this.getAenderungsdatum();
                    String copyAenderungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "aenderungsdatum", sourceAenderungsdatum), sourceAenderungsdatum, (this.aenderungsdatum!= null)));
                    copy.setAenderungsdatum(copyAenderungsdatum);
                } else {
                    if (aenderungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aenderungsdatum = null;
                    }
                }
            }
            {
                Boolean aenderungsgrundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty())));
                if (aenderungsgrundShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceAenderungsgrund;
                    sourceAenderungsgrund = (((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))?this.getAenderungsgrund():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyAenderungsgrund = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "aenderungsgrund", sourceAenderungsgrund), sourceAenderungsgrund, ((this.aenderungsgrund!= null)&&(!this.aenderungsgrund.isEmpty()))));
                    copy.aenderungsgrund = null;
                    if (copyAenderungsgrund!= null) {
                        List<String> uniqueAenderungsgrundl = copy.getAenderungsgrund();
                        uniqueAenderungsgrundl.addAll(copyAenderungsgrund);
                    }
                } else {
                    if (aenderungsgrundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aenderungsgrund = null;
                    }
                }
            }
            {
                Boolean antragsnummerVMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antragsnummerVM!= null));
                if (antragsnummerVMShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAntragsnummerVM;
                    sourceAntragsnummerVM = this.getAntragsnummerVM();
                    String copyAntragsnummerVM = ((String) strategy.copy(LocatorUtils.property(locator, "antragsnummerVM", sourceAntragsnummerVM), sourceAntragsnummerVM, (this.antragsnummerVM!= null)));
                    copy.setAntragsnummerVM(copyAntragsnummerVM);
                } else {
                    if (antragsnummerVMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antragsnummerVM = null;
                    }
                }
            }
            {
                Boolean antragseingangsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antragseingangsdatum!= null));
                if (antragseingangsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAntragseingangsdatum;
                    sourceAntragseingangsdatum = this.getAntragseingangsdatum();
                    String copyAntragseingangsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "antragseingangsdatum", sourceAntragseingangsdatum), sourceAntragseingangsdatum, (this.antragseingangsdatum!= null)));
                    copy.setAntragseingangsdatum(copyAntragseingangsdatum);
                } else {
                    if (antragseingangsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antragseingangsdatum = null;
                    }
                }
            }
            {
                Boolean policierungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.policierungsdatum!= null));
                if (policierungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePolicierungsdatum;
                    sourcePolicierungsdatum = this.getPolicierungsdatum();
                    String copyPolicierungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "policierungsdatum", sourcePolicierungsdatum), sourcePolicierungsdatum, (this.policierungsdatum!= null)));
                    copy.setPolicierungsdatum(copyPolicierungsdatum);
                } else {
                    if (policierungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.policierungsdatum = null;
                    }
                }
            }
            {
                Boolean vertragsentstehungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertragsentstehung!= null));
                if (vertragsentstehungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVertragsentstehung sourceVertragsentstehung;
                    sourceVertragsentstehung = this.getVertragsentstehung();
                    STVertragsentstehung copyVertragsentstehung = ((STVertragsentstehung) strategy.copy(LocatorUtils.property(locator, "vertragsentstehung", sourceVertragsentstehung), sourceVertragsentstehung, (this.vertragsentstehung!= null)));
                    copy.setVertragsentstehung(copyVertragsentstehung);
                } else {
                    if (vertragsentstehungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsentstehung = null;
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
                Boolean antragsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antragsnummer!= null));
                if (antragsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAntragsnummer;
                    sourceAntragsnummer = this.getAntragsnummer();
                    String copyAntragsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "antragsnummer", sourceAntragsnummer), sourceAntragsnummer, (this.antragsnummer!= null)));
                    copy.setAntragsnummer(copyAntragsnummer);
                } else {
                    if (antragsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antragsnummer = null;
                    }
                }
            }
            {
                Boolean alteVertragsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alteVertragsnummer!= null));
                if (alteVertragsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVertragsnummer sourceAlteVertragsnummer;
                    sourceAlteVertragsnummer = this.getAlteVertragsnummer();
                    CTVertragsnummer copyAlteVertragsnummer = ((CTVertragsnummer) strategy.copy(LocatorUtils.property(locator, "alteVertragsnummer", sourceAlteVertragsnummer), sourceAlteVertragsnummer, (this.alteVertragsnummer!= null)));
                    copy.setAlteVertragsnummer(copyAlteVertragsnummer);
                } else {
                    if (alteVertragsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alteVertragsnummer = null;
                    }
                }
            }
            {
                Boolean personengruppeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.personengruppe!= null)&&(!this.personengruppe.isEmpty())));
                if (personengruppeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTPersonengruppe> sourcePersonengruppe;
                    sourcePersonengruppe = (((this.personengruppe!= null)&&(!this.personengruppe.isEmpty()))?this.getPersonengruppe():null);
                    @SuppressWarnings("unchecked")
                    List<CTPersonengruppe> copyPersonengruppe = ((List<CTPersonengruppe> ) strategy.copy(LocatorUtils.property(locator, "personengruppe", sourcePersonengruppe), sourcePersonengruppe, ((this.personengruppe!= null)&&(!this.personengruppe.isEmpty()))));
                    copy.personengruppe = null;
                    if (copyPersonengruppe!= null) {
                        List<CTPersonengruppe> uniquePersonengruppel = copy.getPersonengruppe();
                        uniquePersonengruppel.addAll(copyPersonengruppe);
                    }
                } else {
                    if (personengruppeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.personengruppe = null;
                    }
                }
            }
            {
                Boolean bearbeitendeStelleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bearbeitendeStelle!= null));
                if (bearbeitendeStelleShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBearbeitendeStelle sourceBearbeitendeStelle;
                    sourceBearbeitendeStelle = this.getBearbeitendeStelle();
                    CTBearbeitendeStelle copyBearbeitendeStelle = ((CTBearbeitendeStelle) strategy.copy(LocatorUtils.property(locator, "bearbeitendeStelle", sourceBearbeitendeStelle), sourceBearbeitendeStelle, (this.bearbeitendeStelle!= null)));
                    copy.setBearbeitendeStelle(copyBearbeitendeStelle);
                } else {
                    if (bearbeitendeStelleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bearbeitendeStelle = null;
                    }
                }
            }
            {
                Boolean vertragsnummerVMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertragsnummerVM!= null));
                if (vertragsnummerVMShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVertragsnummer sourceVertragsnummerVM;
                    sourceVertragsnummerVM = this.getVertragsnummerVM();
                    CTVertragsnummer copyVertragsnummerVM = ((CTVertragsnummer) strategy.copy(LocatorUtils.property(locator, "vertragsnummerVM", sourceVertragsnummerVM), sourceVertragsnummerVM, (this.vertragsnummerVM!= null)));
                    copy.setVertragsnummerVM(copyVertragsnummerVM);
                } else {
                    if (vertragsnummerVMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsnummerVM = null;
                    }
                }
            }
            {
                Boolean vertragsverbindungsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty())));
                if (vertragsverbindungsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVertragsnummer> sourceVertragsverbindungsnummer;
                    sourceVertragsverbindungsnummer = (((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty()))?this.getVertragsverbindungsnummer():null);
                    @SuppressWarnings("unchecked")
                    List<CTVertragsnummer> copyVertragsverbindungsnummer = ((List<CTVertragsnummer> ) strategy.copy(LocatorUtils.property(locator, "vertragsverbindungsnummer", sourceVertragsverbindungsnummer), sourceVertragsverbindungsnummer, ((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty()))));
                    copy.vertragsverbindungsnummer = null;
                    if (copyVertragsverbindungsnummer!= null) {
                        List<CTVertragsnummer> uniqueVertragsverbindungsnummerl = copy.getVertragsverbindungsnummer();
                        uniqueVertragsverbindungsnummerl.addAll(copyVertragsverbindungsnummer);
                    }
                } else {
                    if (vertragsverbindungsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsverbindungsnummer = null;
                    }
                }
            }
            {
                Boolean vertragspartnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertragspartner!= null));
                if (vertragspartnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVertragspartner sourceVertragspartner;
                    sourceVertragspartner = this.getVertragspartner();
                    CTVertragspartner copyVertragspartner = ((CTVertragspartner) strategy.copy(LocatorUtils.property(locator, "vertragspartner", sourceVertragspartner), sourceVertragspartner, (this.vertragspartner!= null)));
                    copy.setVertragspartner(copyVertragspartner);
                } else {
                    if (vertragspartnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragspartner = null;
                    }
                }
            }
            {
                Boolean leistungsstoerungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leistungsstoerung!= null));
                if (leistungsstoerungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceLeistungsstoerung;
                    sourceLeistungsstoerung = this.isLeistungsstoerung();
                    Boolean copyLeistungsstoerung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "leistungsstoerung", sourceLeistungsstoerung), sourceLeistungsstoerung, (this.leistungsstoerung!= null)));
                    copy.setLeistungsstoerung(copyLeistungsstoerung);
                } else {
                    if (leistungsstoerungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leistungsstoerung = null;
                    }
                }
            }
            {
                Boolean zahlterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zahltermin!= null));
                if (zahlterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZahltermin;
                    sourceZahltermin = this.getZahltermin();
                    String copyZahltermin = ((String) strategy.copy(LocatorUtils.property(locator, "zahltermin", sourceZahltermin), sourceZahltermin, (this.zahltermin!= null)));
                    copy.setZahltermin(copyZahltermin);
                } else {
                    if (zahlterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zahltermin = null;
                    }
                }
            }
            {
                Boolean zusaetzlicheVertragsdatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zusaetzlicheVertragsdaten!= null)&&(!this.zusaetzlicheVertragsdaten.isEmpty())));
                if (zusaetzlicheVertragsdatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTZusaetzlicheVertragsdaten> sourceZusaetzlicheVertragsdaten;
                    sourceZusaetzlicheVertragsdaten = (((this.zusaetzlicheVertragsdaten!= null)&&(!this.zusaetzlicheVertragsdaten.isEmpty()))?this.getZusaetzlicheVertragsdaten():null);
                    @SuppressWarnings("unchecked")
                    List<CTZusaetzlicheVertragsdaten> copyZusaetzlicheVertragsdaten = ((List<CTZusaetzlicheVertragsdaten> ) strategy.copy(LocatorUtils.property(locator, "zusaetzlicheVertragsdaten", sourceZusaetzlicheVertragsdaten), sourceZusaetzlicheVertragsdaten, ((this.zusaetzlicheVertragsdaten!= null)&&(!this.zusaetzlicheVertragsdaten.isEmpty()))));
                    copy.zusaetzlicheVertragsdaten = null;
                    if (copyZusaetzlicheVertragsdaten!= null) {
                        List<CTZusaetzlicheVertragsdaten> uniqueZusaetzlicheVertragsdatenl = copy.getZusaetzlicheVertragsdaten();
                        uniqueZusaetzlicheVertragsdatenl.addAll(copyZusaetzlicheVertragsdaten);
                    }
                } else {
                    if (zusaetzlicheVertragsdatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusaetzlicheVertragsdaten = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVertrag();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAbgangsdatum(String value) {
        setAbgangsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAktenzeichenVM(String value) {
        setAktenzeichenVM(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAntragsdatum(String value) {
        setAntragsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAntragsstatus(STAntragsstatus value) {
        setAntragsstatus(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withGueltigAbDatum(String value) {
        setGueltigAbDatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withGueltigBisDatum(String value) {
        setGueltigBisDatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withHauptfaelligkeit(String value) {
        setHauptfaelligkeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withInkassoart(STInkassoart value) {
        setInkassoart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withKuendigungsklausel(Boolean value) {
        setKuendigungsklausel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragsbeginn(String value) {
        setVertragsbeginn(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragsstatus(STVertragsstatus value) {
        setVertragsstatus(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withZahlungsart(STZahlungsart value) {
        setZahlungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withZahlungsweise(STZahlungsweise value) {
        setZahlungsweise(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVerkaufsprodukt(CTVerkaufsprodukt... values) {
        if (values!= null) {
            for (CTVerkaufsprodukt value: values) {
                getVerkaufsprodukt().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVerkaufsprodukt(Collection<CTVerkaufsprodukt> values) {
        if (values!= null) {
            getVerkaufsprodukt().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVermittler(CTVermittler... values) {
        if (values!= null) {
            for (CTVermittler value: values) {
                getVermittler().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVermittler(Collection<CTVermittler> values) {
        if (values!= null) {
            getVermittler().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withPartner(CTPartner... values) {
        if (values!= null) {
            for (CTPartner value: values) {
                getPartner().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withPartner(Collection<CTPartner> values) {
        if (values!= null) {
            getPartner().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withGegenstand(CTGegenstand... values) {
        if (values!= null) {
            for (CTGegenstand value: values) {
                getGegenstand().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withGegenstand(Collection<CTGegenstand> values) {
        if (values!= null) {
            getGegenstand().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragsnummer(CTVertragsnummer value) {
        setVertragsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAktivitaet(CTAktivitaet... values) {
        if (values!= null) {
            for (CTAktivitaet value: values) {
                getAktivitaet().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAktivitaet(Collection<CTAktivitaet> values) {
        if (values!= null) {
            getAktivitaet().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAktenzeichenVertragspartner(String value) {
        setAktenzeichenVertragspartner(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAntragsnummerVM(String value) {
        setAntragsnummerVM(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAntragseingangsdatum(String value) {
        setAntragseingangsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withPolicierungsdatum(String value) {
        setPolicierungsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragsentstehung(STVertragsentstehung value) {
        setVertragsentstehung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withArtDerBeratung(STArtDerBeratung value) {
        setArtDerBeratung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAntragsnummer(String value) {
        setAntragsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withAlteVertragsnummer(CTVertragsnummer value) {
        setAlteVertragsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withPersonengruppe(CTPersonengruppe... values) {
        if (values!= null) {
            for (CTPersonengruppe value: values) {
                getPersonengruppe().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withPersonengruppe(Collection<CTPersonengruppe> values) {
        if (values!= null) {
            getPersonengruppe().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withBearbeitendeStelle(CTBearbeitendeStelle value) {
        setBearbeitendeStelle(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragsnummerVM(CTVertragsnummer value) {
        setVertragsnummerVM(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragsverbindungsnummer(CTVertragsnummer... values) {
        if (values!= null) {
            for (CTVertragsnummer value: values) {
                getVertragsverbindungsnummer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragsverbindungsnummer(Collection<CTVertragsnummer> values) {
        if (values!= null) {
            getVertragsverbindungsnummer().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withVertragspartner(CTVertragspartner value) {
        setVertragspartner(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withLeistungsstoerung(Boolean value) {
        setLeistungsstoerung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withZahltermin(String value) {
        setZahltermin(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withZusaetzlicheVertragsdaten(CTZusaetzlicheVertragsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheVertragsdaten value: values) {
                getZusaetzlicheVertragsdaten().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withZusaetzlicheVertragsdaten(Collection<CTZusaetzlicheVertragsdaten> values) {
        if (values!= null) {
            getZusaetzlicheVertragsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertrag withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
