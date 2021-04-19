
package net.bipro.namespace.versicherung.tarifierung;

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
import net.bipro.namespace.allgemein.CTDatei;
import net.bipro.namespace.allgemein.CTDienstleister;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTVermittler;
import net.bipro.namespace.allgemein.CTVertragsnummer;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAbrechnungsart;
import net.bipro.namespace.datentypen.STInkassoart;
import net.bipro.namespace.datentypen.STZahlungsart;
import net.bipro.namespace.gevo.CTDokumentanforderung;
import net.bipro.namespace.gevo.CTDokumentinformation;
import net.bipro.namespace.gevo.CTDokumentversand;
import net.bipro.namespace.gevo.CTGeschaeftsvorgang;
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
 * Basisklasse für Tarifierung, Angebot und Antrag
 * 
 * <p>Java class for CT_TAA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_TAA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/gevo}CT_Geschaeftsvorgang"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zahlungsart" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsart" minOccurs="0"/&gt;
 *         &lt;element name="Inkassoart" type="{http://www.bipro.net/namespace/datentypen}ST_Inkassoart" minOccurs="0"/&gt;
 *         &lt;element name="Abrechnungsart" type="{http://www.bipro.net/namespace/datentypen}ST_Abrechnungsart" minOccurs="0"/&gt;
 *         &lt;element name="Partner" type="{http://www.bipro.net/namespace/partner}CT_Partner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Versicherungsnehmer" type="{http://www.bipro.net/namespace/partner}CT_Vertragspartner" minOccurs="0"/&gt;
 *         &lt;element name="Verkaufsprodukt" type="{http://www.bipro.net/namespace/produktmodell}CT_Verkaufsprodukt" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Aktivitaet" type="{http://www.bipro.net/namespace/allgemein}CT_Aktivitaet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Gegenstand" type="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VorNebenVersicherung" type="{http://www.bipro.net/namespace/vertrag}CT_VorNebenVertrag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Personengruppe" type="{http://www.bipro.net/namespace/partner}CT_Personengruppe" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vertragsverbindungsnummer" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_TAA", propOrder = {
    "zahlungsart",
    "inkassoart",
    "abrechnungsart",
    "partner",
    "versicherungsnehmer",
    "verkaufsprodukt",
    "aktivitaet",
    "gegenstand",
    "vorNebenVersicherung",
    "personengruppe",
    "vertragsverbindungsnummer"
})
@XmlSeeAlso({
    CTAngebot.class,
    CTAntrag.class,
    CTTarifierung.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTTAA
    extends CTGeschaeftsvorgang
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Zahlungsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsart zahlungsart;
    @XmlElement(name = "Inkassoart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STInkassoart inkassoart;
    @XmlElement(name = "Abrechnungsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAbrechnungsart abrechnungsart;
    @XmlElement(name = "Partner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPartner> partner;
    @XmlElement(name = "Versicherungsnehmer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertragspartner versicherungsnehmer;
    @XmlElement(name = "Verkaufsprodukt", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVerkaufsprodukt> verkaufsprodukt;
    @XmlElement(name = "Aktivitaet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTAktivitaet> aktivitaet;
    @XmlElement(name = "Gegenstand")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTGegenstand> gegenstand;
    @XmlElement(name = "VorNebenVersicherung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVorNebenVertrag> vorNebenVersicherung;
    @XmlElement(name = "Personengruppe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPersonengruppe> personengruppe;
    @XmlElement(name = "Vertragsverbindungsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVertragsnummer> vertragsverbindungsnummer;

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
     * Gets the value of the abrechnungsart property.
     * 
     * @return
     *     possible object is
     *     {@link STAbrechnungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAbrechnungsart getAbrechnungsart() {
        return abrechnungsart;
    }

    /**
     * Sets the value of the abrechnungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAbrechnungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbrechnungsart(STAbrechnungsart value) {
        this.abrechnungsart = value;
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
     * Gets the value of the versicherungsnehmer property.
     * 
     * @return
     *     possible object is
     *     {@link CTVertragspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertragspartner getVersicherungsnehmer() {
        return versicherungsnehmer;
    }

    /**
     * Sets the value of the versicherungsnehmer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVertragspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersicherungsnehmer(CTVertragspartner value) {
        this.versicherungsnehmer = value;
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
     * Gets the value of the vorNebenVersicherung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vorNebenVersicherung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVorNebenVersicherung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVorNebenVertrag }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVorNebenVertrag> getVorNebenVersicherung() {
        if (vorNebenVersicherung == null) {
            vorNebenVersicherung = new ArrayList<CTVorNebenVertrag>();
        }
        return this.vorNebenVersicherung;
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
        final CTTAA that = ((CTTAA) object);
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
            STInkassoart lhsInkassoart;
            lhsInkassoart = this.getInkassoart();
            STInkassoart rhsInkassoart;
            rhsInkassoart = that.getInkassoart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inkassoart", lhsInkassoart), LocatorUtils.property(thatLocator, "inkassoart", rhsInkassoart), lhsInkassoart, rhsInkassoart, (this.inkassoart!= null), (that.inkassoart!= null))) {
                return false;
            }
        }
        {
            STAbrechnungsart lhsAbrechnungsart;
            lhsAbrechnungsart = this.getAbrechnungsart();
            STAbrechnungsart rhsAbrechnungsart;
            rhsAbrechnungsart = that.getAbrechnungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abrechnungsart", lhsAbrechnungsart), LocatorUtils.property(thatLocator, "abrechnungsart", rhsAbrechnungsart), lhsAbrechnungsart, rhsAbrechnungsart, (this.abrechnungsart!= null), (that.abrechnungsart!= null))) {
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
            CTVertragspartner lhsVersicherungsnehmer;
            lhsVersicherungsnehmer = this.getVersicherungsnehmer();
            CTVertragspartner rhsVersicherungsnehmer;
            rhsVersicherungsnehmer = that.getVersicherungsnehmer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versicherungsnehmer", lhsVersicherungsnehmer), LocatorUtils.property(thatLocator, "versicherungsnehmer", rhsVersicherungsnehmer), lhsVersicherungsnehmer, rhsVersicherungsnehmer, (this.versicherungsnehmer!= null), (that.versicherungsnehmer!= null))) {
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
            List<CTAktivitaet> lhsAktivitaet;
            lhsAktivitaet = (((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty()))?this.getAktivitaet():null);
            List<CTAktivitaet> rhsAktivitaet;
            rhsAktivitaet = (((that.aktivitaet!= null)&&(!that.aktivitaet.isEmpty()))?that.getAktivitaet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktivitaet", lhsAktivitaet), LocatorUtils.property(thatLocator, "aktivitaet", rhsAktivitaet), lhsAktivitaet, rhsAktivitaet, ((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty())), ((that.aktivitaet!= null)&&(!that.aktivitaet.isEmpty())))) {
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
            List<CTVorNebenVertrag> lhsVorNebenVersicherung;
            lhsVorNebenVersicherung = (((this.vorNebenVersicherung!= null)&&(!this.vorNebenVersicherung.isEmpty()))?this.getVorNebenVersicherung():null);
            List<CTVorNebenVertrag> rhsVorNebenVersicherung;
            rhsVorNebenVersicherung = (((that.vorNebenVersicherung!= null)&&(!that.vorNebenVersicherung.isEmpty()))?that.getVorNebenVersicherung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorNebenVersicherung", lhsVorNebenVersicherung), LocatorUtils.property(thatLocator, "vorNebenVersicherung", rhsVorNebenVersicherung), lhsVorNebenVersicherung, rhsVorNebenVersicherung, ((this.vorNebenVersicherung!= null)&&(!this.vorNebenVersicherung.isEmpty())), ((that.vorNebenVersicherung!= null)&&(!that.vorNebenVersicherung.isEmpty())))) {
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
            List<CTVertragsnummer> lhsVertragsverbindungsnummer;
            lhsVertragsverbindungsnummer = (((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty()))?this.getVertragsverbindungsnummer():null);
            List<CTVertragsnummer> rhsVertragsverbindungsnummer;
            rhsVertragsverbindungsnummer = (((that.vertragsverbindungsnummer!= null)&&(!that.vertragsverbindungsnummer.isEmpty()))?that.getVertragsverbindungsnummer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsverbindungsnummer", lhsVertragsverbindungsnummer), LocatorUtils.property(thatLocator, "vertragsverbindungsnummer", rhsVertragsverbindungsnummer), lhsVertragsverbindungsnummer, rhsVertragsverbindungsnummer, ((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty())), ((that.vertragsverbindungsnummer!= null)&&(!that.vertragsverbindungsnummer.isEmpty())))) {
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
            STZahlungsart theZahlungsart;
            theZahlungsart = this.getZahlungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahlungsart", theZahlungsart), currentHashCode, theZahlungsart, (this.zahlungsart!= null));
        }
        {
            STInkassoart theInkassoart;
            theInkassoart = this.getInkassoart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inkassoart", theInkassoart), currentHashCode, theInkassoart, (this.inkassoart!= null));
        }
        {
            STAbrechnungsart theAbrechnungsart;
            theAbrechnungsart = this.getAbrechnungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abrechnungsart", theAbrechnungsart), currentHashCode, theAbrechnungsart, (this.abrechnungsart!= null));
        }
        {
            List<CTPartner> thePartner;
            thePartner = (((this.partner!= null)&&(!this.partner.isEmpty()))?this.getPartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partner", thePartner), currentHashCode, thePartner, ((this.partner!= null)&&(!this.partner.isEmpty())));
        }
        {
            CTVertragspartner theVersicherungsnehmer;
            theVersicherungsnehmer = this.getVersicherungsnehmer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versicherungsnehmer", theVersicherungsnehmer), currentHashCode, theVersicherungsnehmer, (this.versicherungsnehmer!= null));
        }
        {
            List<CTVerkaufsprodukt> theVerkaufsprodukt;
            theVerkaufsprodukt = (((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty()))?this.getVerkaufsprodukt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verkaufsprodukt", theVerkaufsprodukt), currentHashCode, theVerkaufsprodukt, ((this.verkaufsprodukt!= null)&&(!this.verkaufsprodukt.isEmpty())));
        }
        {
            List<CTAktivitaet> theAktivitaet;
            theAktivitaet = (((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty()))?this.getAktivitaet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktivitaet", theAktivitaet), currentHashCode, theAktivitaet, ((this.aktivitaet!= null)&&(!this.aktivitaet.isEmpty())));
        }
        {
            List<CTGegenstand> theGegenstand;
            theGegenstand = (((this.gegenstand!= null)&&(!this.gegenstand.isEmpty()))?this.getGegenstand():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gegenstand", theGegenstand), currentHashCode, theGegenstand, ((this.gegenstand!= null)&&(!this.gegenstand.isEmpty())));
        }
        {
            List<CTVorNebenVertrag> theVorNebenVersicherung;
            theVorNebenVersicherung = (((this.vorNebenVersicherung!= null)&&(!this.vorNebenVersicherung.isEmpty()))?this.getVorNebenVersicherung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorNebenVersicherung", theVorNebenVersicherung), currentHashCode, theVorNebenVersicherung, ((this.vorNebenVersicherung!= null)&&(!this.vorNebenVersicherung.isEmpty())));
        }
        {
            List<CTPersonengruppe> thePersonengruppe;
            thePersonengruppe = (((this.personengruppe!= null)&&(!this.personengruppe.isEmpty()))?this.getPersonengruppe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personengruppe", thePersonengruppe), currentHashCode, thePersonengruppe, ((this.personengruppe!= null)&&(!this.personengruppe.isEmpty())));
        }
        {
            List<CTVertragsnummer> theVertragsverbindungsnummer;
            theVertragsverbindungsnummer = (((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty()))?this.getVertragsverbindungsnummer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsverbindungsnummer", theVertragsverbindungsnummer), currentHashCode, theVertragsverbindungsnummer, ((this.vertragsverbindungsnummer!= null)&&(!this.vertragsverbindungsnummer.isEmpty())));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTTAA) {
            final CTTAA copy = ((CTTAA) target);
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
                Boolean abrechnungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abrechnungsart!= null));
                if (abrechnungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAbrechnungsart sourceAbrechnungsart;
                    sourceAbrechnungsart = this.getAbrechnungsart();
                    STAbrechnungsart copyAbrechnungsart = ((STAbrechnungsart) strategy.copy(LocatorUtils.property(locator, "abrechnungsart", sourceAbrechnungsart), sourceAbrechnungsart, (this.abrechnungsart!= null)));
                    copy.setAbrechnungsart(copyAbrechnungsart);
                } else {
                    if (abrechnungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abrechnungsart = null;
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
                Boolean versicherungsnehmerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versicherungsnehmer!= null));
                if (versicherungsnehmerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVertragspartner sourceVersicherungsnehmer;
                    sourceVersicherungsnehmer = this.getVersicherungsnehmer();
                    CTVertragspartner copyVersicherungsnehmer = ((CTVertragspartner) strategy.copy(LocatorUtils.property(locator, "versicherungsnehmer", sourceVersicherungsnehmer), sourceVersicherungsnehmer, (this.versicherungsnehmer!= null)));
                    copy.setVersicherungsnehmer(copyVersicherungsnehmer);
                } else {
                    if (versicherungsnehmerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versicherungsnehmer = null;
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
                Boolean vorNebenVersicherungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vorNebenVersicherung!= null)&&(!this.vorNebenVersicherung.isEmpty())));
                if (vorNebenVersicherungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVorNebenVertrag> sourceVorNebenVersicherung;
                    sourceVorNebenVersicherung = (((this.vorNebenVersicherung!= null)&&(!this.vorNebenVersicherung.isEmpty()))?this.getVorNebenVersicherung():null);
                    @SuppressWarnings("unchecked")
                    List<CTVorNebenVertrag> copyVorNebenVersicherung = ((List<CTVorNebenVertrag> ) strategy.copy(LocatorUtils.property(locator, "vorNebenVersicherung", sourceVorNebenVersicherung), sourceVorNebenVersicherung, ((this.vorNebenVersicherung!= null)&&(!this.vorNebenVersicherung.isEmpty()))));
                    copy.vorNebenVersicherung = null;
                    if (copyVorNebenVersicherung!= null) {
                        List<CTVorNebenVertrag> uniqueVorNebenVersicherungl = copy.getVorNebenVersicherung();
                        uniqueVorNebenVersicherungl.addAll(copyVorNebenVersicherung);
                    }
                } else {
                    if (vorNebenVersicherungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorNebenVersicherung = null;
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
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withZahlungsart(STZahlungsart value) {
        setZahlungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withInkassoart(STInkassoart value) {
        setInkassoart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withAbrechnungsart(STAbrechnungsart value) {
        setAbrechnungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withPartner(CTPartner... values) {
        if (values!= null) {
            for (CTPartner value: values) {
                getPartner().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withPartner(Collection<CTPartner> values) {
        if (values!= null) {
            getPartner().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVersicherungsnehmer(CTVertragspartner value) {
        setVersicherungsnehmer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVerkaufsprodukt(CTVerkaufsprodukt... values) {
        if (values!= null) {
            for (CTVerkaufsprodukt value: values) {
                getVerkaufsprodukt().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVerkaufsprodukt(Collection<CTVerkaufsprodukt> values) {
        if (values!= null) {
            getVerkaufsprodukt().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withAktivitaet(CTAktivitaet... values) {
        if (values!= null) {
            for (CTAktivitaet value: values) {
                getAktivitaet().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withAktivitaet(Collection<CTAktivitaet> values) {
        if (values!= null) {
            getAktivitaet().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withGegenstand(CTGegenstand... values) {
        if (values!= null) {
            for (CTGegenstand value: values) {
                getGegenstand().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withGegenstand(Collection<CTGegenstand> values) {
        if (values!= null) {
            getGegenstand().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVorNebenVersicherung(CTVorNebenVertrag... values) {
        if (values!= null) {
            for (CTVorNebenVertrag value: values) {
                getVorNebenVersicherung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVorNebenVersicherung(Collection<CTVorNebenVertrag> values) {
        if (values!= null) {
            getVorNebenVersicherung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withPersonengruppe(CTPersonengruppe... values) {
        if (values!= null) {
            for (CTPersonengruppe value: values) {
                getPersonengruppe().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withPersonengruppe(Collection<CTPersonengruppe> values) {
        if (values!= null) {
            getPersonengruppe().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVertragsverbindungsnummer(CTVertragsnummer... values) {
        if (values!= null) {
            for (CTVertragsnummer value: values) {
                getVertragsverbindungsnummer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVertragsverbindungsnummer(Collection<CTVertragsnummer> values) {
        if (values!= null) {
            getVertragsverbindungsnummer().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVorgangsnummer(String value) {
        setVorgangsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVorgangsnummerVM(String value) {
        setVorgangsnummerVM(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withErstelldatum(String value) {
        setErstelldatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withFreitext(String value) {
        setFreitext(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withArtID(String value) {
        setArtID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVermittler(CTVermittler... values) {
        if (values!= null) {
            for (CTVermittler value: values) {
                getVermittler().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withVermittler(Collection<CTVermittler> values) {
        if (values!= null) {
            getVermittler().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDokumentanforderung(CTDokumentanforderung... values) {
        if (values!= null) {
            for (CTDokumentanforderung value: values) {
                getDokumentanforderung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDokumentanforderung(Collection<CTDokumentanforderung> values) {
        if (values!= null) {
            getDokumentanforderung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDatei(CTDatei... values) {
        if (values!= null) {
            for (CTDatei value: values) {
                getDatei().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDatei(Collection<CTDatei> values) {
        if (values!= null) {
            getDatei().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDokumentinformation(CTDokumentinformation... values) {
        if (values!= null) {
            for (CTDokumentinformation value: values) {
                getDokumentinformation().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDokumentinformation(Collection<CTDokumentinformation> values) {
        if (values!= null) {
            getDokumentinformation().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDienstleister(CTDienstleister... values) {
        if (values!= null) {
            for (CTDienstleister value: values) {
                getDienstleister().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDienstleister(Collection<CTDienstleister> values) {
        if (values!= null) {
            getDienstleister().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDokumentversand(CTDokumentversand... values) {
        if (values!= null) {
            for (CTDokumentversand value: values) {
                getDokumentversand().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withDokumentversand(Collection<CTDokumentversand> values) {
        if (values!= null) {
            getDokumentversand().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTAA withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
