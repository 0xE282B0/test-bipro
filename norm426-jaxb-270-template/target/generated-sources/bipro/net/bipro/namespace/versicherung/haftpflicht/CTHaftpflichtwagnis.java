
package net.bipro.namespace.versicherung.haftpflicht;

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
import net.bipro.namespace.allgemein.CTAktivitaet;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STBerechnungsart;
import net.bipro.namespace.datentypen.STBerechnungseinheitHaftpflicht;
import net.bipro.namespace.datentypen.STEKlassifizierungHaftpflicht;
import net.bipro.namespace.datentypen.STEWagnisart;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.datentypen.STWerteinheit;
import net.bipro.namespace.fragen.CTFragenkomplex;
import net.bipro.namespace.versicherung.produktmodell.CTVorschaden;
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
 * <p>Java class for CT_Haftpflichtwagnis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Haftpflichtwagnis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Aktivitaet"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Wagnisart" type="{http://www.bipro.net/namespace/datentypen}STE_Wagnisart"/&gt;
 *         &lt;element name="Berechnungseinheit" type="{http://www.bipro.net/namespace/datentypen}ST_BerechnungseinheitHaftpflicht" minOccurs="0"/&gt;
 *         &lt;element name="Wagnismenge" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Waehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel" minOccurs="0"/&gt;
 *         &lt;element name="Jagd" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Jagd" minOccurs="0"/&gt;
 *         &lt;element name="Privat" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Privat" minOccurs="0"/&gt;
 *         &lt;element name="Wassersport" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Wassersport" minOccurs="0"/&gt;
 *         &lt;element name="Tierhalter" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Tierhalter" minOccurs="0"/&gt;
 *         &lt;element name="Vorschaden" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Vorschaden" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HausUndGrundbesitzer" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_HausUndGrundbesitzer" minOccurs="0"/&gt;
 *         &lt;element name="Gewaesserschaden" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Gewaesserschaden" minOccurs="0"/&gt;
 *         &lt;element name="Bauherren" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Bauherren" minOccurs="0"/&gt;
 *         &lt;element name="Fragenkomplex" type="{http://www.bipro.net/namespace/fragen}CT_Fragenkomplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Wagnistext" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Wagnisbeschreibung" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="Hauptwagnis" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Hauptwagnis" minOccurs="0"/&gt;
 *         &lt;element name="Klassifizierung" type="{http://www.bipro.net/namespace/datentypen}STE_KlassifizierungHaftpflicht" minOccurs="0"/&gt;
 *         &lt;element name="WerteinheitBerechnungseinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="ErlaeuterungBerechnungseinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="Berechnungsart" type="{http://www.bipro.net/namespace/datentypen}ST_Berechnungsart" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Haftpflichtwagnis", propOrder = {
    "wagnisart",
    "berechnungseinheit",
    "wagnismenge",
    "waehrung",
    "jagd",
    "privat",
    "wassersport",
    "tierhalter",
    "vorschaden",
    "hausUndGrundbesitzer",
    "gewaesserschaden",
    "bauherren",
    "fragenkomplex",
    "wagnistext",
    "wagnisbeschreibung",
    "hauptwagnis",
    "klassifizierung",
    "werteinheitBerechnungseinheit",
    "erlaeuterungBerechnungseinheit",
    "berechnungsart"
})
@XmlSeeAlso({
    CTBetriebswagnis.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTHaftpflichtwagnis
    extends CTAktivitaet
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Wagnisart", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEWagnisart wagnisart;
    @XmlElement(name = "Berechnungseinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBerechnungseinheitHaftpflicht berechnungseinheit;
    @XmlElement(name = "Wagnismenge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal wagnismenge;
    @XmlElement(name = "Waehrung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel waehrung;
    @XmlElement(name = "Jagd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTJagd jagd;
    @XmlElement(name = "Privat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTPrivat privat;
    @XmlElement(name = "Wassersport")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTWassersport wassersport;
    @XmlElement(name = "Tierhalter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTTierhalter tierhalter;
    @XmlElement(name = "Vorschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTVorschaden> vorschaden;
    @XmlElement(name = "HausUndGrundbesitzer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTHausUndGrundbesitzer hausUndGrundbesitzer;
    @XmlElement(name = "Gewaesserschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTGewaesserschaden gewaesserschaden;
    @XmlElement(name = "Bauherren")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBauherren bauherren;
    @XmlElement(name = "Fragenkomplex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTFragenkomplex> fragenkomplex;
    @XmlElement(name = "Wagnistext")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String wagnistext;
    @XmlElement(name = "Wagnisbeschreibung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String wagnisbeschreibung;
    @XmlElement(name = "Hauptwagnis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTHauptwagnis hauptwagnis;
    @XmlElement(name = "Klassifizierung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEKlassifizierungHaftpflicht klassifizierung;
    @XmlElement(name = "WerteinheitBerechnungseinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit werteinheitBerechnungseinheit;
    @XmlElement(name = "ErlaeuterungBerechnungseinheit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String erlaeuterungBerechnungseinheit;
    @XmlElement(name = "Berechnungsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBerechnungsart berechnungsart;

    /**
     * Gets the value of the wagnisart property.
     * 
     * @return
     *     possible object is
     *     {@link STEWagnisart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEWagnisart getWagnisart() {
        return wagnisart;
    }

    /**
     * Sets the value of the wagnisart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEWagnisart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWagnisart(STEWagnisart value) {
        this.wagnisart = value;
    }

    /**
     * Gets the value of the berechnungseinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STBerechnungseinheitHaftpflicht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBerechnungseinheitHaftpflicht getBerechnungseinheit() {
        return berechnungseinheit;
    }

    /**
     * Sets the value of the berechnungseinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBerechnungseinheitHaftpflicht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBerechnungseinheit(STBerechnungseinheitHaftpflicht value) {
        this.berechnungseinheit = value;
    }

    /**
     * Gets the value of the wagnismenge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getWagnismenge() {
        return wagnismenge;
    }

    /**
     * Sets the value of the wagnismenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWagnismenge(BigDecimal value) {
        this.wagnismenge = value;
    }

    /**
     * Gets the value of the waehrung property.
     * 
     * @return
     *     possible object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWaehrung(STWaehrungsschluessel value) {
        this.waehrung = value;
    }

    /**
     * Gets the value of the jagd property.
     * 
     * @return
     *     possible object is
     *     {@link CTJagd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTJagd getJagd() {
        return jagd;
    }

    /**
     * Sets the value of the jagd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTJagd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setJagd(CTJagd value) {
        this.jagd = value;
    }

    /**
     * Gets the value of the privat property.
     * 
     * @return
     *     possible object is
     *     {@link CTPrivat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat getPrivat() {
        return privat;
    }

    /**
     * Sets the value of the privat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPrivat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setPrivat(CTPrivat value) {
        this.privat = value;
    }

    /**
     * Gets the value of the wassersport property.
     * 
     * @return
     *     possible object is
     *     {@link CTWassersport }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWassersport getWassersport() {
        return wassersport;
    }

    /**
     * Sets the value of the wassersport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTWassersport }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWassersport(CTWassersport value) {
        this.wassersport = value;
    }

    /**
     * Gets the value of the tierhalter property.
     * 
     * @return
     *     possible object is
     *     {@link CTTierhalter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTierhalter getTierhalter() {
        return tierhalter;
    }

    /**
     * Sets the value of the tierhalter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTierhalter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setTierhalter(CTTierhalter value) {
        this.tierhalter = value;
    }

    /**
     * Gets the value of the vorschaden property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vorschaden property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVorschaden().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVorschaden }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTVorschaden> getVorschaden() {
        if (vorschaden == null) {
            vorschaden = new ArrayList<CTVorschaden>();
        }
        return this.vorschaden;
    }

    /**
     * Gets the value of the hausUndGrundbesitzer property.
     * 
     * @return
     *     possible object is
     *     {@link CTHausUndGrundbesitzer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHausUndGrundbesitzer getHausUndGrundbesitzer() {
        return hausUndGrundbesitzer;
    }

    /**
     * Sets the value of the hausUndGrundbesitzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTHausUndGrundbesitzer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHausUndGrundbesitzer(CTHausUndGrundbesitzer value) {
        this.hausUndGrundbesitzer = value;
    }

    /**
     * Gets the value of the gewaesserschaden property.
     * 
     * @return
     *     possible object is
     *     {@link CTGewaesserschaden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGewaesserschaden getGewaesserschaden() {
        return gewaesserschaden;
    }

    /**
     * Sets the value of the gewaesserschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGewaesserschaden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGewaesserschaden(CTGewaesserschaden value) {
        this.gewaesserschaden = value;
    }

    /**
     * Gets the value of the bauherren property.
     * 
     * @return
     *     possible object is
     *     {@link CTBauherren }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBauherren getBauherren() {
        return bauherren;
    }

    /**
     * Sets the value of the bauherren property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBauherren }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBauherren(CTBauherren value) {
        this.bauherren = value;
    }

    /**
     * Gets the value of the fragenkomplex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fragenkomplex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFragenkomplex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTFragenkomplex }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTFragenkomplex> getFragenkomplex() {
        if (fragenkomplex == null) {
            fragenkomplex = new ArrayList<CTFragenkomplex>();
        }
        return this.fragenkomplex;
    }

    /**
     * Gets the value of the wagnistext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getWagnistext() {
        return wagnistext;
    }

    /**
     * Sets the value of the wagnistext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWagnistext(String value) {
        this.wagnistext = value;
    }

    /**
     * Gets the value of the wagnisbeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getWagnisbeschreibung() {
        return wagnisbeschreibung;
    }

    /**
     * Sets the value of the wagnisbeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWagnisbeschreibung(String value) {
        this.wagnisbeschreibung = value;
    }

    /**
     * Gets the value of the hauptwagnis property.
     * 
     * @return
     *     possible object is
     *     {@link CTHauptwagnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHauptwagnis getHauptwagnis() {
        return hauptwagnis;
    }

    /**
     * Sets the value of the hauptwagnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTHauptwagnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHauptwagnis(CTHauptwagnis value) {
        this.hauptwagnis = value;
    }

    /**
     * Gets the value of the klassifizierung property.
     * 
     * @return
     *     possible object is
     *     {@link STEKlassifizierungHaftpflicht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEKlassifizierungHaftpflicht getKlassifizierung() {
        return klassifizierung;
    }

    /**
     * Sets the value of the klassifizierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEKlassifizierungHaftpflicht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKlassifizierung(STEKlassifizierungHaftpflicht value) {
        this.klassifizierung = value;
    }

    /**
     * Gets the value of the werteinheitBerechnungseinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getWerteinheitBerechnungseinheit() {
        return werteinheitBerechnungseinheit;
    }

    /**
     * Sets the value of the werteinheitBerechnungseinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWerteinheitBerechnungseinheit(STWerteinheit value) {
        this.werteinheitBerechnungseinheit = value;
    }

    /**
     * Gets the value of the erlaeuterungBerechnungseinheit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getErlaeuterungBerechnungseinheit() {
        return erlaeuterungBerechnungseinheit;
    }

    /**
     * Sets the value of the erlaeuterungBerechnungseinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setErlaeuterungBerechnungseinheit(String value) {
        this.erlaeuterungBerechnungseinheit = value;
    }

    /**
     * Gets the value of the berechnungsart property.
     * 
     * @return
     *     possible object is
     *     {@link STBerechnungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBerechnungsart getBerechnungsart() {
        return berechnungsart;
    }

    /**
     * Sets the value of the berechnungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBerechnungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBerechnungsart(STBerechnungsart value) {
        this.berechnungsart = value;
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
        final CTHaftpflichtwagnis that = ((CTHaftpflichtwagnis) object);
        {
            STEWagnisart lhsWagnisart;
            lhsWagnisart = this.getWagnisart();
            STEWagnisart rhsWagnisart;
            rhsWagnisart = that.getWagnisart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wagnisart", lhsWagnisart), LocatorUtils.property(thatLocator, "wagnisart", rhsWagnisart), lhsWagnisart, rhsWagnisart, (this.wagnisart!= null), (that.wagnisart!= null))) {
                return false;
            }
        }
        {
            STBerechnungseinheitHaftpflicht lhsBerechnungseinheit;
            lhsBerechnungseinheit = this.getBerechnungseinheit();
            STBerechnungseinheitHaftpflicht rhsBerechnungseinheit;
            rhsBerechnungseinheit = that.getBerechnungseinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berechnungseinheit", lhsBerechnungseinheit), LocatorUtils.property(thatLocator, "berechnungseinheit", rhsBerechnungseinheit), lhsBerechnungseinheit, rhsBerechnungseinheit, (this.berechnungseinheit!= null), (that.berechnungseinheit!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWagnismenge;
            lhsWagnismenge = this.getWagnismenge();
            BigDecimal rhsWagnismenge;
            rhsWagnismenge = that.getWagnismenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wagnismenge", lhsWagnismenge), LocatorUtils.property(thatLocator, "wagnismenge", rhsWagnismenge), lhsWagnismenge, rhsWagnismenge, (this.wagnismenge!= null), (that.wagnismenge!= null))) {
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
            CTJagd lhsJagd;
            lhsJagd = this.getJagd();
            CTJagd rhsJagd;
            rhsJagd = that.getJagd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jagd", lhsJagd), LocatorUtils.property(thatLocator, "jagd", rhsJagd), lhsJagd, rhsJagd, (this.jagd!= null), (that.jagd!= null))) {
                return false;
            }
        }
        {
            CTPrivat lhsPrivat;
            lhsPrivat = this.getPrivat();
            CTPrivat rhsPrivat;
            rhsPrivat = that.getPrivat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "privat", lhsPrivat), LocatorUtils.property(thatLocator, "privat", rhsPrivat), lhsPrivat, rhsPrivat, (this.privat!= null), (that.privat!= null))) {
                return false;
            }
        }
        {
            CTWassersport lhsWassersport;
            lhsWassersport = this.getWassersport();
            CTWassersport rhsWassersport;
            rhsWassersport = that.getWassersport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wassersport", lhsWassersport), LocatorUtils.property(thatLocator, "wassersport", rhsWassersport), lhsWassersport, rhsWassersport, (this.wassersport!= null), (that.wassersport!= null))) {
                return false;
            }
        }
        {
            CTTierhalter lhsTierhalter;
            lhsTierhalter = this.getTierhalter();
            CTTierhalter rhsTierhalter;
            rhsTierhalter = that.getTierhalter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tierhalter", lhsTierhalter), LocatorUtils.property(thatLocator, "tierhalter", rhsTierhalter), lhsTierhalter, rhsTierhalter, (this.tierhalter!= null), (that.tierhalter!= null))) {
                return false;
            }
        }
        {
            List<CTVorschaden> lhsVorschaden;
            lhsVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
            List<CTVorschaden> rhsVorschaden;
            rhsVorschaden = (((that.vorschaden!= null)&&(!that.vorschaden.isEmpty()))?that.getVorschaden():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorschaden", lhsVorschaden), LocatorUtils.property(thatLocator, "vorschaden", rhsVorschaden), lhsVorschaden, rhsVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())), ((that.vorschaden!= null)&&(!that.vorschaden.isEmpty())))) {
                return false;
            }
        }
        {
            CTHausUndGrundbesitzer lhsHausUndGrundbesitzer;
            lhsHausUndGrundbesitzer = this.getHausUndGrundbesitzer();
            CTHausUndGrundbesitzer rhsHausUndGrundbesitzer;
            rhsHausUndGrundbesitzer = that.getHausUndGrundbesitzer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausUndGrundbesitzer", lhsHausUndGrundbesitzer), LocatorUtils.property(thatLocator, "hausUndGrundbesitzer", rhsHausUndGrundbesitzer), lhsHausUndGrundbesitzer, rhsHausUndGrundbesitzer, (this.hausUndGrundbesitzer!= null), (that.hausUndGrundbesitzer!= null))) {
                return false;
            }
        }
        {
            CTGewaesserschaden lhsGewaesserschaden;
            lhsGewaesserschaden = this.getGewaesserschaden();
            CTGewaesserschaden rhsGewaesserschaden;
            rhsGewaesserschaden = that.getGewaesserschaden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewaesserschaden", lhsGewaesserschaden), LocatorUtils.property(thatLocator, "gewaesserschaden", rhsGewaesserschaden), lhsGewaesserschaden, rhsGewaesserschaden, (this.gewaesserschaden!= null), (that.gewaesserschaden!= null))) {
                return false;
            }
        }
        {
            CTBauherren lhsBauherren;
            lhsBauherren = this.getBauherren();
            CTBauherren rhsBauherren;
            rhsBauherren = that.getBauherren();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bauherren", lhsBauherren), LocatorUtils.property(thatLocator, "bauherren", rhsBauherren), lhsBauherren, rhsBauherren, (this.bauherren!= null), (that.bauherren!= null))) {
                return false;
            }
        }
        {
            List<CTFragenkomplex> lhsFragenkomplex;
            lhsFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            List<CTFragenkomplex> rhsFragenkomplex;
            rhsFragenkomplex = (((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty()))?that.getFragenkomplex():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragenkomplex", lhsFragenkomplex), LocatorUtils.property(thatLocator, "fragenkomplex", rhsFragenkomplex), lhsFragenkomplex, rhsFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())), ((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsWagnistext;
            lhsWagnistext = this.getWagnistext();
            String rhsWagnistext;
            rhsWagnistext = that.getWagnistext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wagnistext", lhsWagnistext), LocatorUtils.property(thatLocator, "wagnistext", rhsWagnistext), lhsWagnistext, rhsWagnistext, (this.wagnistext!= null), (that.wagnistext!= null))) {
                return false;
            }
        }
        {
            String lhsWagnisbeschreibung;
            lhsWagnisbeschreibung = this.getWagnisbeschreibung();
            String rhsWagnisbeschreibung;
            rhsWagnisbeschreibung = that.getWagnisbeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wagnisbeschreibung", lhsWagnisbeschreibung), LocatorUtils.property(thatLocator, "wagnisbeschreibung", rhsWagnisbeschreibung), lhsWagnisbeschreibung, rhsWagnisbeschreibung, (this.wagnisbeschreibung!= null), (that.wagnisbeschreibung!= null))) {
                return false;
            }
        }
        {
            CTHauptwagnis lhsHauptwagnis;
            lhsHauptwagnis = this.getHauptwagnis();
            CTHauptwagnis rhsHauptwagnis;
            rhsHauptwagnis = that.getHauptwagnis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hauptwagnis", lhsHauptwagnis), LocatorUtils.property(thatLocator, "hauptwagnis", rhsHauptwagnis), lhsHauptwagnis, rhsHauptwagnis, (this.hauptwagnis!= null), (that.hauptwagnis!= null))) {
                return false;
            }
        }
        {
            STEKlassifizierungHaftpflicht lhsKlassifizierung;
            lhsKlassifizierung = this.getKlassifizierung();
            STEKlassifizierungHaftpflicht rhsKlassifizierung;
            rhsKlassifizierung = that.getKlassifizierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klassifizierung", lhsKlassifizierung), LocatorUtils.property(thatLocator, "klassifizierung", rhsKlassifizierung), lhsKlassifizierung, rhsKlassifizierung, (this.klassifizierung!= null), (that.klassifizierung!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsWerteinheitBerechnungseinheit;
            lhsWerteinheitBerechnungseinheit = this.getWerteinheitBerechnungseinheit();
            STWerteinheit rhsWerteinheitBerechnungseinheit;
            rhsWerteinheitBerechnungseinheit = that.getWerteinheitBerechnungseinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "werteinheitBerechnungseinheit", lhsWerteinheitBerechnungseinheit), LocatorUtils.property(thatLocator, "werteinheitBerechnungseinheit", rhsWerteinheitBerechnungseinheit), lhsWerteinheitBerechnungseinheit, rhsWerteinheitBerechnungseinheit, (this.werteinheitBerechnungseinheit!= null), (that.werteinheitBerechnungseinheit!= null))) {
                return false;
            }
        }
        {
            String lhsErlaeuterungBerechnungseinheit;
            lhsErlaeuterungBerechnungseinheit = this.getErlaeuterungBerechnungseinheit();
            String rhsErlaeuterungBerechnungseinheit;
            rhsErlaeuterungBerechnungseinheit = that.getErlaeuterungBerechnungseinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erlaeuterungBerechnungseinheit", lhsErlaeuterungBerechnungseinheit), LocatorUtils.property(thatLocator, "erlaeuterungBerechnungseinheit", rhsErlaeuterungBerechnungseinheit), lhsErlaeuterungBerechnungseinheit, rhsErlaeuterungBerechnungseinheit, (this.erlaeuterungBerechnungseinheit!= null), (that.erlaeuterungBerechnungseinheit!= null))) {
                return false;
            }
        }
        {
            STBerechnungsart lhsBerechnungsart;
            lhsBerechnungsart = this.getBerechnungsart();
            STBerechnungsart rhsBerechnungsart;
            rhsBerechnungsart = that.getBerechnungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berechnungsart", lhsBerechnungsart), LocatorUtils.property(thatLocator, "berechnungsart", rhsBerechnungsart), lhsBerechnungsart, rhsBerechnungsart, (this.berechnungsart!= null), (that.berechnungsart!= null))) {
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
            STEWagnisart theWagnisart;
            theWagnisart = this.getWagnisart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wagnisart", theWagnisart), currentHashCode, theWagnisart, (this.wagnisart!= null));
        }
        {
            STBerechnungseinheitHaftpflicht theBerechnungseinheit;
            theBerechnungseinheit = this.getBerechnungseinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "berechnungseinheit", theBerechnungseinheit), currentHashCode, theBerechnungseinheit, (this.berechnungseinheit!= null));
        }
        {
            BigDecimal theWagnismenge;
            theWagnismenge = this.getWagnismenge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wagnismenge", theWagnismenge), currentHashCode, theWagnismenge, (this.wagnismenge!= null));
        }
        {
            STWaehrungsschluessel theWaehrung;
            theWaehrung = this.getWaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waehrung", theWaehrung), currentHashCode, theWaehrung, (this.waehrung!= null));
        }
        {
            CTJagd theJagd;
            theJagd = this.getJagd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jagd", theJagd), currentHashCode, theJagd, (this.jagd!= null));
        }
        {
            CTPrivat thePrivat;
            thePrivat = this.getPrivat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "privat", thePrivat), currentHashCode, thePrivat, (this.privat!= null));
        }
        {
            CTWassersport theWassersport;
            theWassersport = this.getWassersport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wassersport", theWassersport), currentHashCode, theWassersport, (this.wassersport!= null));
        }
        {
            CTTierhalter theTierhalter;
            theTierhalter = this.getTierhalter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tierhalter", theTierhalter), currentHashCode, theTierhalter, (this.tierhalter!= null));
        }
        {
            List<CTVorschaden> theVorschaden;
            theVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorschaden", theVorschaden), currentHashCode, theVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())));
        }
        {
            CTHausUndGrundbesitzer theHausUndGrundbesitzer;
            theHausUndGrundbesitzer = this.getHausUndGrundbesitzer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hausUndGrundbesitzer", theHausUndGrundbesitzer), currentHashCode, theHausUndGrundbesitzer, (this.hausUndGrundbesitzer!= null));
        }
        {
            CTGewaesserschaden theGewaesserschaden;
            theGewaesserschaden = this.getGewaesserschaden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewaesserschaden", theGewaesserschaden), currentHashCode, theGewaesserschaden, (this.gewaesserschaden!= null));
        }
        {
            CTBauherren theBauherren;
            theBauherren = this.getBauherren();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bauherren", theBauherren), currentHashCode, theBauherren, (this.bauherren!= null));
        }
        {
            List<CTFragenkomplex> theFragenkomplex;
            theFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragenkomplex", theFragenkomplex), currentHashCode, theFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())));
        }
        {
            String theWagnistext;
            theWagnistext = this.getWagnistext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wagnistext", theWagnistext), currentHashCode, theWagnistext, (this.wagnistext!= null));
        }
        {
            String theWagnisbeschreibung;
            theWagnisbeschreibung = this.getWagnisbeschreibung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wagnisbeschreibung", theWagnisbeschreibung), currentHashCode, theWagnisbeschreibung, (this.wagnisbeschreibung!= null));
        }
        {
            CTHauptwagnis theHauptwagnis;
            theHauptwagnis = this.getHauptwagnis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hauptwagnis", theHauptwagnis), currentHashCode, theHauptwagnis, (this.hauptwagnis!= null));
        }
        {
            STEKlassifizierungHaftpflicht theKlassifizierung;
            theKlassifizierung = this.getKlassifizierung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "klassifizierung", theKlassifizierung), currentHashCode, theKlassifizierung, (this.klassifizierung!= null));
        }
        {
            STWerteinheit theWerteinheitBerechnungseinheit;
            theWerteinheitBerechnungseinheit = this.getWerteinheitBerechnungseinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "werteinheitBerechnungseinheit", theWerteinheitBerechnungseinheit), currentHashCode, theWerteinheitBerechnungseinheit, (this.werteinheitBerechnungseinheit!= null));
        }
        {
            String theErlaeuterungBerechnungseinheit;
            theErlaeuterungBerechnungseinheit = this.getErlaeuterungBerechnungseinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erlaeuterungBerechnungseinheit", theErlaeuterungBerechnungseinheit), currentHashCode, theErlaeuterungBerechnungseinheit, (this.erlaeuterungBerechnungseinheit!= null));
        }
        {
            STBerechnungsart theBerechnungsart;
            theBerechnungsart = this.getBerechnungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "berechnungsart", theBerechnungsart), currentHashCode, theBerechnungsart, (this.berechnungsart!= null));
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
        if (draftCopy instanceof CTHaftpflichtwagnis) {
            final CTHaftpflichtwagnis copy = ((CTHaftpflichtwagnis) draftCopy);
            {
                Boolean wagnisartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wagnisart!= null));
                if (wagnisartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEWagnisart sourceWagnisart;
                    sourceWagnisart = this.getWagnisart();
                    STEWagnisart copyWagnisart = ((STEWagnisart) strategy.copy(LocatorUtils.property(locator, "wagnisart", sourceWagnisart), sourceWagnisart, (this.wagnisart!= null)));
                    copy.setWagnisart(copyWagnisart);
                } else {
                    if (wagnisartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wagnisart = null;
                    }
                }
            }
            {
                Boolean berechnungseinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.berechnungseinheit!= null));
                if (berechnungseinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBerechnungseinheitHaftpflicht sourceBerechnungseinheit;
                    sourceBerechnungseinheit = this.getBerechnungseinheit();
                    STBerechnungseinheitHaftpflicht copyBerechnungseinheit = ((STBerechnungseinheitHaftpflicht) strategy.copy(LocatorUtils.property(locator, "berechnungseinheit", sourceBerechnungseinheit), sourceBerechnungseinheit, (this.berechnungseinheit!= null)));
                    copy.setBerechnungseinheit(copyBerechnungseinheit);
                } else {
                    if (berechnungseinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berechnungseinheit = null;
                    }
                }
            }
            {
                Boolean wagnismengeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wagnismenge!= null));
                if (wagnismengeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWagnismenge;
                    sourceWagnismenge = this.getWagnismenge();
                    BigDecimal copyWagnismenge = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wagnismenge", sourceWagnismenge), sourceWagnismenge, (this.wagnismenge!= null)));
                    copy.setWagnismenge(copyWagnismenge);
                } else {
                    if (wagnismengeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wagnismenge = null;
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
                Boolean jagdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jagd!= null));
                if (jagdShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTJagd sourceJagd;
                    sourceJagd = this.getJagd();
                    CTJagd copyJagd = ((CTJagd) strategy.copy(LocatorUtils.property(locator, "jagd", sourceJagd), sourceJagd, (this.jagd!= null)));
                    copy.setJagd(copyJagd);
                } else {
                    if (jagdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jagd = null;
                    }
                }
            }
            {
                Boolean privatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.privat!= null));
                if (privatShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTPrivat sourcePrivat;
                    sourcePrivat = this.getPrivat();
                    CTPrivat copyPrivat = ((CTPrivat) strategy.copy(LocatorUtils.property(locator, "privat", sourcePrivat), sourcePrivat, (this.privat!= null)));
                    copy.setPrivat(copyPrivat);
                } else {
                    if (privatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.privat = null;
                    }
                }
            }
            {
                Boolean wassersportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wassersport!= null));
                if (wassersportShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTWassersport sourceWassersport;
                    sourceWassersport = this.getWassersport();
                    CTWassersport copyWassersport = ((CTWassersport) strategy.copy(LocatorUtils.property(locator, "wassersport", sourceWassersport), sourceWassersport, (this.wassersport!= null)));
                    copy.setWassersport(copyWassersport);
                } else {
                    if (wassersportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wassersport = null;
                    }
                }
            }
            {
                Boolean tierhalterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierhalter!= null));
                if (tierhalterShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTTierhalter sourceTierhalter;
                    sourceTierhalter = this.getTierhalter();
                    CTTierhalter copyTierhalter = ((CTTierhalter) strategy.copy(LocatorUtils.property(locator, "tierhalter", sourceTierhalter), sourceTierhalter, (this.tierhalter!= null)));
                    copy.setTierhalter(copyTierhalter);
                } else {
                    if (tierhalterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tierhalter = null;
                    }
                }
            }
            {
                Boolean vorschadenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())));
                if (vorschadenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVorschaden> sourceVorschaden;
                    sourceVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
                    @SuppressWarnings("unchecked")
                    List<CTVorschaden> copyVorschaden = ((List<CTVorschaden> ) strategy.copy(LocatorUtils.property(locator, "vorschaden", sourceVorschaden), sourceVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))));
                    copy.vorschaden = null;
                    if (copyVorschaden!= null) {
                        List<CTVorschaden> uniqueVorschadenl = copy.getVorschaden();
                        uniqueVorschadenl.addAll(copyVorschaden);
                    }
                } else {
                    if (vorschadenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorschaden = null;
                    }
                }
            }
            {
                Boolean hausUndGrundbesitzerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hausUndGrundbesitzer!= null));
                if (hausUndGrundbesitzerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTHausUndGrundbesitzer sourceHausUndGrundbesitzer;
                    sourceHausUndGrundbesitzer = this.getHausUndGrundbesitzer();
                    CTHausUndGrundbesitzer copyHausUndGrundbesitzer = ((CTHausUndGrundbesitzer) strategy.copy(LocatorUtils.property(locator, "hausUndGrundbesitzer", sourceHausUndGrundbesitzer), sourceHausUndGrundbesitzer, (this.hausUndGrundbesitzer!= null)));
                    copy.setHausUndGrundbesitzer(copyHausUndGrundbesitzer);
                } else {
                    if (hausUndGrundbesitzerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hausUndGrundbesitzer = null;
                    }
                }
            }
            {
                Boolean gewaesserschadenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewaesserschaden!= null));
                if (gewaesserschadenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGewaesserschaden sourceGewaesserschaden;
                    sourceGewaesserschaden = this.getGewaesserschaden();
                    CTGewaesserschaden copyGewaesserschaden = ((CTGewaesserschaden) strategy.copy(LocatorUtils.property(locator, "gewaesserschaden", sourceGewaesserschaden), sourceGewaesserschaden, (this.gewaesserschaden!= null)));
                    copy.setGewaesserschaden(copyGewaesserschaden);
                } else {
                    if (gewaesserschadenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewaesserschaden = null;
                    }
                }
            }
            {
                Boolean bauherrenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bauherren!= null));
                if (bauherrenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBauherren sourceBauherren;
                    sourceBauherren = this.getBauherren();
                    CTBauherren copyBauherren = ((CTBauherren) strategy.copy(LocatorUtils.property(locator, "bauherren", sourceBauherren), sourceBauherren, (this.bauherren!= null)));
                    copy.setBauherren(copyBauherren);
                } else {
                    if (bauherrenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bauherren = null;
                    }
                }
            }
            {
                Boolean fragenkomplexShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())));
                if (fragenkomplexShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTFragenkomplex> sourceFragenkomplex;
                    sourceFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
                    @SuppressWarnings("unchecked")
                    List<CTFragenkomplex> copyFragenkomplex = ((List<CTFragenkomplex> ) strategy.copy(LocatorUtils.property(locator, "fragenkomplex", sourceFragenkomplex), sourceFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))));
                    copy.fragenkomplex = null;
                    if (copyFragenkomplex!= null) {
                        List<CTFragenkomplex> uniqueFragenkomplexl = copy.getFragenkomplex();
                        uniqueFragenkomplexl.addAll(copyFragenkomplex);
                    }
                } else {
                    if (fragenkomplexShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fragenkomplex = null;
                    }
                }
            }
            {
                Boolean wagnistextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wagnistext!= null));
                if (wagnistextShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWagnistext;
                    sourceWagnistext = this.getWagnistext();
                    String copyWagnistext = ((String) strategy.copy(LocatorUtils.property(locator, "wagnistext", sourceWagnistext), sourceWagnistext, (this.wagnistext!= null)));
                    copy.setWagnistext(copyWagnistext);
                } else {
                    if (wagnistextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wagnistext = null;
                    }
                }
            }
            {
                Boolean wagnisbeschreibungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wagnisbeschreibung!= null));
                if (wagnisbeschreibungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWagnisbeschreibung;
                    sourceWagnisbeschreibung = this.getWagnisbeschreibung();
                    String copyWagnisbeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "wagnisbeschreibung", sourceWagnisbeschreibung), sourceWagnisbeschreibung, (this.wagnisbeschreibung!= null)));
                    copy.setWagnisbeschreibung(copyWagnisbeschreibung);
                } else {
                    if (wagnisbeschreibungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wagnisbeschreibung = null;
                    }
                }
            }
            {
                Boolean hauptwagnisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hauptwagnis!= null));
                if (hauptwagnisShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTHauptwagnis sourceHauptwagnis;
                    sourceHauptwagnis = this.getHauptwagnis();
                    CTHauptwagnis copyHauptwagnis = ((CTHauptwagnis) strategy.copy(LocatorUtils.property(locator, "hauptwagnis", sourceHauptwagnis), sourceHauptwagnis, (this.hauptwagnis!= null)));
                    copy.setHauptwagnis(copyHauptwagnis);
                } else {
                    if (hauptwagnisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hauptwagnis = null;
                    }
                }
            }
            {
                Boolean klassifizierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.klassifizierung!= null));
                if (klassifizierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEKlassifizierungHaftpflicht sourceKlassifizierung;
                    sourceKlassifizierung = this.getKlassifizierung();
                    STEKlassifizierungHaftpflicht copyKlassifizierung = ((STEKlassifizierungHaftpflicht) strategy.copy(LocatorUtils.property(locator, "klassifizierung", sourceKlassifizierung), sourceKlassifizierung, (this.klassifizierung!= null)));
                    copy.setKlassifizierung(copyKlassifizierung);
                } else {
                    if (klassifizierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.klassifizierung = null;
                    }
                }
            }
            {
                Boolean werteinheitBerechnungseinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.werteinheitBerechnungseinheit!= null));
                if (werteinheitBerechnungseinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceWerteinheitBerechnungseinheit;
                    sourceWerteinheitBerechnungseinheit = this.getWerteinheitBerechnungseinheit();
                    STWerteinheit copyWerteinheitBerechnungseinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "werteinheitBerechnungseinheit", sourceWerteinheitBerechnungseinheit), sourceWerteinheitBerechnungseinheit, (this.werteinheitBerechnungseinheit!= null)));
                    copy.setWerteinheitBerechnungseinheit(copyWerteinheitBerechnungseinheit);
                } else {
                    if (werteinheitBerechnungseinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.werteinheitBerechnungseinheit = null;
                    }
                }
            }
            {
                Boolean erlaeuterungBerechnungseinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erlaeuterungBerechnungseinheit!= null));
                if (erlaeuterungBerechnungseinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErlaeuterungBerechnungseinheit;
                    sourceErlaeuterungBerechnungseinheit = this.getErlaeuterungBerechnungseinheit();
                    String copyErlaeuterungBerechnungseinheit = ((String) strategy.copy(LocatorUtils.property(locator, "erlaeuterungBerechnungseinheit", sourceErlaeuterungBerechnungseinheit), sourceErlaeuterungBerechnungseinheit, (this.erlaeuterungBerechnungseinheit!= null)));
                    copy.setErlaeuterungBerechnungseinheit(copyErlaeuterungBerechnungseinheit);
                } else {
                    if (erlaeuterungBerechnungseinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erlaeuterungBerechnungseinheit = null;
                    }
                }
            }
            {
                Boolean berechnungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.berechnungsart!= null));
                if (berechnungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBerechnungsart sourceBerechnungsart;
                    sourceBerechnungsart = this.getBerechnungsart();
                    STBerechnungsart copyBerechnungsart = ((STBerechnungsart) strategy.copy(LocatorUtils.property(locator, "berechnungsart", sourceBerechnungsart), sourceBerechnungsart, (this.berechnungsart!= null)));
                    copy.setBerechnungsart(copyBerechnungsart);
                } else {
                    if (berechnungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berechnungsart = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTHaftpflichtwagnis();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withWagnisart(STEWagnisart value) {
        setWagnisart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withBerechnungseinheit(STBerechnungseinheitHaftpflicht value) {
        setBerechnungseinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withWagnismenge(BigDecimal value) {
        setWagnismenge(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withJagd(CTJagd value) {
        setJagd(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withPrivat(CTPrivat value) {
        setPrivat(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withWassersport(CTWassersport value) {
        setWassersport(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withTierhalter(CTTierhalter value) {
        setTierhalter(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withVorschaden(CTVorschaden... values) {
        if (values!= null) {
            for (CTVorschaden value: values) {
                getVorschaden().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withVorschaden(Collection<CTVorschaden> values) {
        if (values!= null) {
            getVorschaden().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withHausUndGrundbesitzer(CTHausUndGrundbesitzer value) {
        setHausUndGrundbesitzer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withGewaesserschaden(CTGewaesserschaden value) {
        setGewaesserschaden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withBauherren(CTBauherren value) {
        setBauherren(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withFragenkomplex(CTFragenkomplex... values) {
        if (values!= null) {
            for (CTFragenkomplex value: values) {
                getFragenkomplex().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withFragenkomplex(Collection<CTFragenkomplex> values) {
        if (values!= null) {
            getFragenkomplex().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withWagnistext(String value) {
        setWagnistext(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withWagnisbeschreibung(String value) {
        setWagnisbeschreibung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withHauptwagnis(CTHauptwagnis value) {
        setHauptwagnis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withKlassifizierung(STEKlassifizierungHaftpflicht value) {
        setKlassifizierung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withWerteinheitBerechnungseinheit(STWerteinheit value) {
        setWerteinheitBerechnungseinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withErlaeuterungBerechnungseinheit(String value) {
        setErlaeuterungBerechnungseinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withBerechnungsart(STBerechnungsart value) {
        setBerechnungsart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withAktivitaetID(String value) {
        setAktivitaetID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaftpflichtwagnis withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
