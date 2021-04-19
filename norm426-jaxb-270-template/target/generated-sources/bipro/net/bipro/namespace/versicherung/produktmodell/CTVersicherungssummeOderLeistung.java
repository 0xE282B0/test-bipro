
package net.bipro.namespace.versicherung.produktmodell;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STELeistungSchluessel;
import net.bipro.namespace.datentypen.STEVersicherungssummeOderLeistung;
import net.bipro.namespace.datentypen.STLeistungserbringung;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.datentypen.STWerteinheit;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.produktmodell.CTDynamik;
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
 * Da sich herausgestellt hat, dass es zwischen Versicherungssummen (Komposit) und Leistungen (Leben) abgesehen vom Namen keine modellierungsrelevanten Unterschiede gibt, sind beide synonym durch diesen Datentypen repraesentiert.
 * 
 * <p>Java class for CT_VersicherungssummeOderLeistung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_VersicherungssummeOderLeistung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_VersicherungssummeOderLeistung" minOccurs="0"/&gt;
 *         &lt;element name="Wert" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Wertschluessel" type="{http://www.bipro.net/namespace/datentypen}STE_LeistungSchluessel" minOccurs="0"/&gt;
 *         &lt;element name="Werteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Waehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel" minOccurs="0"/&gt;
 *         &lt;element name="Auszahlungsweise" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsweise" minOccurs="0"/&gt;
 *         &lt;element name="Basisjahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Preisindex" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="InklusiveUmsatzsteuer" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Jahresmaximierung" type="{http://www.bipro.net/namespace/datentypen}ST_Faktor" minOccurs="0"/&gt;
 *         &lt;element name="Leistungserbringung" type="{http://www.bipro.net/namespace/datentypen}ST_Leistungserbringung" minOccurs="0"/&gt;
 *         &lt;element name="Zeitraum" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="GarantierteErhoehung" type="{http://www.bipro.net/namespace/produktmodell}CT_Dynamik" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Selbstbeteiligung" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Selbstbeteiligung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Karenzzeit" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_VersicherungssummeOderLeistung", propOrder = {
    "artID",
    "wert",
    "wertschluessel",
    "werteinheit",
    "waehrung",
    "auszahlungsweise",
    "basisjahr",
    "preisindex",
    "inklusiveUmsatzsteuer",
    "jahresmaximierung",
    "leistungserbringung",
    "zeitraum",
    "garantierteErhoehung",
    "selbstbeteiligung",
    "karenzzeit"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTVersicherungssummeOderLeistung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEVersicherungssummeOderLeistung artID;
    @XmlElement(name = "Wert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal wert;
    @XmlElement(name = "Wertschluessel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STELeistungSchluessel wertschluessel;
    @XmlElement(name = "Werteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit werteinheit;
    @XmlElement(name = "Waehrung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel waehrung;
    @XmlElement(name = "Auszahlungsweise")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsweise auszahlungsweise;
    @XmlElement(name = "Basisjahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer basisjahr;
    @XmlElement(name = "Preisindex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal preisindex;
    @XmlElement(name = "InklusiveUmsatzsteuer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean inklusiveUmsatzsteuer;
    @XmlElement(name = "Jahresmaximierung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal jahresmaximierung;
    @XmlElement(name = "Leistungserbringung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STLeistungserbringung leistungserbringung;
    @XmlElement(name = "Zeitraum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum zeitraum;
    @XmlElement(name = "GarantierteErhoehung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDynamik> garantierteErhoehung;
    @XmlElement(name = "Selbstbeteiligung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTSelbstbeteiligung> selbstbeteiligung;
    @XmlElement(name = "Karenzzeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum karenzzeit;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STEVersicherungssummeOderLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEVersicherungssummeOderLeistung getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEVersicherungssummeOderLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STEVersicherungssummeOderLeistung value) {
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
     * Gets the value of the wertschluessel property.
     * 
     * @return
     *     possible object is
     *     {@link STELeistungSchluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STELeistungSchluessel getWertschluessel() {
        return wertschluessel;
    }

    /**
     * Sets the value of the wertschluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link STELeistungSchluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWertschluessel(STELeistungSchluessel value) {
        this.wertschluessel = value;
    }

    /**
     * Gets the value of the werteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
     * Gets the value of the auszahlungsweise property.
     * 
     * @return
     *     possible object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STZahlungsweise getAuszahlungsweise() {
        return auszahlungsweise;
    }

    /**
     * Sets the value of the auszahlungsweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAuszahlungsweise(STZahlungsweise value) {
        this.auszahlungsweise = value;
    }

    /**
     * Gets the value of the basisjahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getBasisjahr() {
        return basisjahr;
    }

    /**
     * Sets the value of the basisjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBasisjahr(Integer value) {
        this.basisjahr = value;
    }

    /**
     * Gets the value of the preisindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getPreisindex() {
        return preisindex;
    }

    /**
     * Sets the value of the preisindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setPreisindex(BigDecimal value) {
        this.preisindex = value;
    }

    /**
     * Gets the value of the inklusiveUmsatzsteuer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isInklusiveUmsatzsteuer() {
        return inklusiveUmsatzsteuer;
    }

    /**
     * Sets the value of the inklusiveUmsatzsteuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setInklusiveUmsatzsteuer(Boolean value) {
        this.inklusiveUmsatzsteuer = value;
    }

    /**
     * Gets the value of the jahresmaximierung property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getJahresmaximierung() {
        return jahresmaximierung;
    }

    /**
     * Sets the value of the jahresmaximierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setJahresmaximierung(BigDecimal value) {
        this.jahresmaximierung = value;
    }

    /**
     * Gets the value of the leistungserbringung property.
     * 
     * @return
     *     possible object is
     *     {@link STLeistungserbringung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STLeistungserbringung getLeistungserbringung() {
        return leistungserbringung;
    }

    /**
     * Sets the value of the leistungserbringung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLeistungserbringung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLeistungserbringung(STLeistungserbringung value) {
        this.leistungserbringung = value;
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
     * Gets the value of the garantierteErhoehung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the garantierteErhoehung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGarantierteErhoehung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDynamik }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDynamik> getGarantierteErhoehung() {
        if (garantierteErhoehung == null) {
            garantierteErhoehung = new ArrayList<CTDynamik>();
        }
        return this.garantierteErhoehung;
    }

    /**
     * Gets the value of the selbstbeteiligung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selbstbeteiligung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelbstbeteiligung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSelbstbeteiligung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTSelbstbeteiligung> getSelbstbeteiligung() {
        if (selbstbeteiligung == null) {
            selbstbeteiligung = new ArrayList<CTSelbstbeteiligung>();
        }
        return this.selbstbeteiligung;
    }

    /**
     * Gets the value of the karenzzeit property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getKarenzzeit() {
        return karenzzeit;
    }

    /**
     * Sets the value of the karenzzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKarenzzeit(CTZeitraum value) {
        this.karenzzeit = value;
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
        final CTVersicherungssummeOderLeistung that = ((CTVersicherungssummeOderLeistung) object);
        {
            STEVersicherungssummeOderLeistung lhsArtID;
            lhsArtID = this.getArtID();
            STEVersicherungssummeOderLeistung rhsArtID;
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
            STELeistungSchluessel lhsWertschluessel;
            lhsWertschluessel = this.getWertschluessel();
            STELeistungSchluessel rhsWertschluessel;
            rhsWertschluessel = that.getWertschluessel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wertschluessel", lhsWertschluessel), LocatorUtils.property(thatLocator, "wertschluessel", rhsWertschluessel), lhsWertschluessel, rhsWertschluessel, (this.wertschluessel!= null), (that.wertschluessel!= null))) {
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
            STZahlungsweise lhsAuszahlungsweise;
            lhsAuszahlungsweise = this.getAuszahlungsweise();
            STZahlungsweise rhsAuszahlungsweise;
            rhsAuszahlungsweise = that.getAuszahlungsweise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auszahlungsweise", lhsAuszahlungsweise), LocatorUtils.property(thatLocator, "auszahlungsweise", rhsAuszahlungsweise), lhsAuszahlungsweise, rhsAuszahlungsweise, (this.auszahlungsweise!= null), (that.auszahlungsweise!= null))) {
                return false;
            }
        }
        {
            Integer lhsBasisjahr;
            lhsBasisjahr = this.getBasisjahr();
            Integer rhsBasisjahr;
            rhsBasisjahr = that.getBasisjahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "basisjahr", lhsBasisjahr), LocatorUtils.property(thatLocator, "basisjahr", rhsBasisjahr), lhsBasisjahr, rhsBasisjahr, (this.basisjahr!= null), (that.basisjahr!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPreisindex;
            lhsPreisindex = this.getPreisindex();
            BigDecimal rhsPreisindex;
            rhsPreisindex = that.getPreisindex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preisindex", lhsPreisindex), LocatorUtils.property(thatLocator, "preisindex", rhsPreisindex), lhsPreisindex, rhsPreisindex, (this.preisindex!= null), (that.preisindex!= null))) {
                return false;
            }
        }
        {
            Boolean lhsInklusiveUmsatzsteuer;
            lhsInklusiveUmsatzsteuer = this.isInklusiveUmsatzsteuer();
            Boolean rhsInklusiveUmsatzsteuer;
            rhsInklusiveUmsatzsteuer = that.isInklusiveUmsatzsteuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inklusiveUmsatzsteuer", lhsInklusiveUmsatzsteuer), LocatorUtils.property(thatLocator, "inklusiveUmsatzsteuer", rhsInklusiveUmsatzsteuer), lhsInklusiveUmsatzsteuer, rhsInklusiveUmsatzsteuer, (this.inklusiveUmsatzsteuer!= null), (that.inklusiveUmsatzsteuer!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsJahresmaximierung;
            lhsJahresmaximierung = this.getJahresmaximierung();
            BigDecimal rhsJahresmaximierung;
            rhsJahresmaximierung = that.getJahresmaximierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jahresmaximierung", lhsJahresmaximierung), LocatorUtils.property(thatLocator, "jahresmaximierung", rhsJahresmaximierung), lhsJahresmaximierung, rhsJahresmaximierung, (this.jahresmaximierung!= null), (that.jahresmaximierung!= null))) {
                return false;
            }
        }
        {
            STLeistungserbringung lhsLeistungserbringung;
            lhsLeistungserbringung = this.getLeistungserbringung();
            STLeistungserbringung rhsLeistungserbringung;
            rhsLeistungserbringung = that.getLeistungserbringung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leistungserbringung", lhsLeistungserbringung), LocatorUtils.property(thatLocator, "leistungserbringung", rhsLeistungserbringung), lhsLeistungserbringung, rhsLeistungserbringung, (this.leistungserbringung!= null), (that.leistungserbringung!= null))) {
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
            List<CTDynamik> lhsGarantierteErhoehung;
            lhsGarantierteErhoehung = (((this.garantierteErhoehung!= null)&&(!this.garantierteErhoehung.isEmpty()))?this.getGarantierteErhoehung():null);
            List<CTDynamik> rhsGarantierteErhoehung;
            rhsGarantierteErhoehung = (((that.garantierteErhoehung!= null)&&(!that.garantierteErhoehung.isEmpty()))?that.getGarantierteErhoehung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garantierteErhoehung", lhsGarantierteErhoehung), LocatorUtils.property(thatLocator, "garantierteErhoehung", rhsGarantierteErhoehung), lhsGarantierteErhoehung, rhsGarantierteErhoehung, ((this.garantierteErhoehung!= null)&&(!this.garantierteErhoehung.isEmpty())), ((that.garantierteErhoehung!= null)&&(!that.garantierteErhoehung.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTSelbstbeteiligung> lhsSelbstbeteiligung;
            lhsSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
            List<CTSelbstbeteiligung> rhsSelbstbeteiligung;
            rhsSelbstbeteiligung = (((that.selbstbeteiligung!= null)&&(!that.selbstbeteiligung.isEmpty()))?that.getSelbstbeteiligung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selbstbeteiligung", lhsSelbstbeteiligung), LocatorUtils.property(thatLocator, "selbstbeteiligung", rhsSelbstbeteiligung), lhsSelbstbeteiligung, rhsSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())), ((that.selbstbeteiligung!= null)&&(!that.selbstbeteiligung.isEmpty())))) {
                return false;
            }
        }
        {
            CTZeitraum lhsKarenzzeit;
            lhsKarenzzeit = this.getKarenzzeit();
            CTZeitraum rhsKarenzzeit;
            rhsKarenzzeit = that.getKarenzzeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "karenzzeit", lhsKarenzzeit), LocatorUtils.property(thatLocator, "karenzzeit", rhsKarenzzeit), lhsKarenzzeit, rhsKarenzzeit, (this.karenzzeit!= null), (that.karenzzeit!= null))) {
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
            STEVersicherungssummeOderLeistung theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            BigDecimal theWert;
            theWert = this.getWert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wert", theWert), currentHashCode, theWert, (this.wert!= null));
        }
        {
            STELeistungSchluessel theWertschluessel;
            theWertschluessel = this.getWertschluessel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wertschluessel", theWertschluessel), currentHashCode, theWertschluessel, (this.wertschluessel!= null));
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
            STZahlungsweise theAuszahlungsweise;
            theAuszahlungsweise = this.getAuszahlungsweise();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auszahlungsweise", theAuszahlungsweise), currentHashCode, theAuszahlungsweise, (this.auszahlungsweise!= null));
        }
        {
            Integer theBasisjahr;
            theBasisjahr = this.getBasisjahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "basisjahr", theBasisjahr), currentHashCode, theBasisjahr, (this.basisjahr!= null));
        }
        {
            BigDecimal thePreisindex;
            thePreisindex = this.getPreisindex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preisindex", thePreisindex), currentHashCode, thePreisindex, (this.preisindex!= null));
        }
        {
            Boolean theInklusiveUmsatzsteuer;
            theInklusiveUmsatzsteuer = this.isInklusiveUmsatzsteuer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inklusiveUmsatzsteuer", theInklusiveUmsatzsteuer), currentHashCode, theInklusiveUmsatzsteuer, (this.inklusiveUmsatzsteuer!= null));
        }
        {
            BigDecimal theJahresmaximierung;
            theJahresmaximierung = this.getJahresmaximierung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jahresmaximierung", theJahresmaximierung), currentHashCode, theJahresmaximierung, (this.jahresmaximierung!= null));
        }
        {
            STLeistungserbringung theLeistungserbringung;
            theLeistungserbringung = this.getLeistungserbringung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leistungserbringung", theLeistungserbringung), currentHashCode, theLeistungserbringung, (this.leistungserbringung!= null));
        }
        {
            CTZeitraum theZeitraum;
            theZeitraum = this.getZeitraum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitraum", theZeitraum), currentHashCode, theZeitraum, (this.zeitraum!= null));
        }
        {
            List<CTDynamik> theGarantierteErhoehung;
            theGarantierteErhoehung = (((this.garantierteErhoehung!= null)&&(!this.garantierteErhoehung.isEmpty()))?this.getGarantierteErhoehung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "garantierteErhoehung", theGarantierteErhoehung), currentHashCode, theGarantierteErhoehung, ((this.garantierteErhoehung!= null)&&(!this.garantierteErhoehung.isEmpty())));
        }
        {
            List<CTSelbstbeteiligung> theSelbstbeteiligung;
            theSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selbstbeteiligung", theSelbstbeteiligung), currentHashCode, theSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())));
        }
        {
            CTZeitraum theKarenzzeit;
            theKarenzzeit = this.getKarenzzeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "karenzzeit", theKarenzzeit), currentHashCode, theKarenzzeit, (this.karenzzeit!= null));
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
        if (draftCopy instanceof CTVersicherungssummeOderLeistung) {
            final CTVersicherungssummeOderLeistung copy = ((CTVersicherungssummeOderLeistung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEVersicherungssummeOderLeistung sourceArtID;
                    sourceArtID = this.getArtID();
                    STEVersicherungssummeOderLeistung copyArtID = ((STEVersicherungssummeOderLeistung) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
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
                Boolean wertschluesselShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wertschluessel!= null));
                if (wertschluesselShouldBeCopiedAndSet == Boolean.TRUE) {
                    STELeistungSchluessel sourceWertschluessel;
                    sourceWertschluessel = this.getWertschluessel();
                    STELeistungSchluessel copyWertschluessel = ((STELeistungSchluessel) strategy.copy(LocatorUtils.property(locator, "wertschluessel", sourceWertschluessel), sourceWertschluessel, (this.wertschluessel!= null)));
                    copy.setWertschluessel(copyWertschluessel);
                } else {
                    if (wertschluesselShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wertschluessel = null;
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
                Boolean auszahlungsweiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auszahlungsweise!= null));
                if (auszahlungsweiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    STZahlungsweise sourceAuszahlungsweise;
                    sourceAuszahlungsweise = this.getAuszahlungsweise();
                    STZahlungsweise copyAuszahlungsweise = ((STZahlungsweise) strategy.copy(LocatorUtils.property(locator, "auszahlungsweise", sourceAuszahlungsweise), sourceAuszahlungsweise, (this.auszahlungsweise!= null)));
                    copy.setAuszahlungsweise(copyAuszahlungsweise);
                } else {
                    if (auszahlungsweiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auszahlungsweise = null;
                    }
                }
            }
            {
                Boolean basisjahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.basisjahr!= null));
                if (basisjahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceBasisjahr;
                    sourceBasisjahr = this.getBasisjahr();
                    Integer copyBasisjahr = ((Integer) strategy.copy(LocatorUtils.property(locator, "basisjahr", sourceBasisjahr), sourceBasisjahr, (this.basisjahr!= null)));
                    copy.setBasisjahr(copyBasisjahr);
                } else {
                    if (basisjahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.basisjahr = null;
                    }
                }
            }
            {
                Boolean preisindexShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.preisindex!= null));
                if (preisindexShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePreisindex;
                    sourcePreisindex = this.getPreisindex();
                    BigDecimal copyPreisindex = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "preisindex", sourcePreisindex), sourcePreisindex, (this.preisindex!= null)));
                    copy.setPreisindex(copyPreisindex);
                } else {
                    if (preisindexShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.preisindex = null;
                    }
                }
            }
            {
                Boolean inklusiveUmsatzsteuerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inklusiveUmsatzsteuer!= null));
                if (inklusiveUmsatzsteuerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceInklusiveUmsatzsteuer;
                    sourceInklusiveUmsatzsteuer = this.isInklusiveUmsatzsteuer();
                    Boolean copyInklusiveUmsatzsteuer = ((Boolean) strategy.copy(LocatorUtils.property(locator, "inklusiveUmsatzsteuer", sourceInklusiveUmsatzsteuer), sourceInklusiveUmsatzsteuer, (this.inklusiveUmsatzsteuer!= null)));
                    copy.setInklusiveUmsatzsteuer(copyInklusiveUmsatzsteuer);
                } else {
                    if (inklusiveUmsatzsteuerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inklusiveUmsatzsteuer = null;
                    }
                }
            }
            {
                Boolean jahresmaximierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jahresmaximierung!= null));
                if (jahresmaximierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceJahresmaximierung;
                    sourceJahresmaximierung = this.getJahresmaximierung();
                    BigDecimal copyJahresmaximierung = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "jahresmaximierung", sourceJahresmaximierung), sourceJahresmaximierung, (this.jahresmaximierung!= null)));
                    copy.setJahresmaximierung(copyJahresmaximierung);
                } else {
                    if (jahresmaximierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jahresmaximierung = null;
                    }
                }
            }
            {
                Boolean leistungserbringungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leistungserbringung!= null));
                if (leistungserbringungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLeistungserbringung sourceLeistungserbringung;
                    sourceLeistungserbringung = this.getLeistungserbringung();
                    STLeistungserbringung copyLeistungserbringung = ((STLeistungserbringung) strategy.copy(LocatorUtils.property(locator, "leistungserbringung", sourceLeistungserbringung), sourceLeistungserbringung, (this.leistungserbringung!= null)));
                    copy.setLeistungserbringung(copyLeistungserbringung);
                } else {
                    if (leistungserbringungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leistungserbringung = null;
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
                Boolean garantierteErhoehungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.garantierteErhoehung!= null)&&(!this.garantierteErhoehung.isEmpty())));
                if (garantierteErhoehungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDynamik> sourceGarantierteErhoehung;
                    sourceGarantierteErhoehung = (((this.garantierteErhoehung!= null)&&(!this.garantierteErhoehung.isEmpty()))?this.getGarantierteErhoehung():null);
                    @SuppressWarnings("unchecked")
                    List<CTDynamik> copyGarantierteErhoehung = ((List<CTDynamik> ) strategy.copy(LocatorUtils.property(locator, "garantierteErhoehung", sourceGarantierteErhoehung), sourceGarantierteErhoehung, ((this.garantierteErhoehung!= null)&&(!this.garantierteErhoehung.isEmpty()))));
                    copy.garantierteErhoehung = null;
                    if (copyGarantierteErhoehung!= null) {
                        List<CTDynamik> uniqueGarantierteErhoehungl = copy.getGarantierteErhoehung();
                        uniqueGarantierteErhoehungl.addAll(copyGarantierteErhoehung);
                    }
                } else {
                    if (garantierteErhoehungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garantierteErhoehung = null;
                    }
                }
            }
            {
                Boolean selbstbeteiligungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())));
                if (selbstbeteiligungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSelbstbeteiligung> sourceSelbstbeteiligung;
                    sourceSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
                    @SuppressWarnings("unchecked")
                    List<CTSelbstbeteiligung> copySelbstbeteiligung = ((List<CTSelbstbeteiligung> ) strategy.copy(LocatorUtils.property(locator, "selbstbeteiligung", sourceSelbstbeteiligung), sourceSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))));
                    copy.selbstbeteiligung = null;
                    if (copySelbstbeteiligung!= null) {
                        List<CTSelbstbeteiligung> uniqueSelbstbeteiligungl = copy.getSelbstbeteiligung();
                        uniqueSelbstbeteiligungl.addAll(copySelbstbeteiligung);
                    }
                } else {
                    if (selbstbeteiligungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.selbstbeteiligung = null;
                    }
                }
            }
            {
                Boolean karenzzeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.karenzzeit!= null));
                if (karenzzeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceKarenzzeit;
                    sourceKarenzzeit = this.getKarenzzeit();
                    CTZeitraum copyKarenzzeit = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "karenzzeit", sourceKarenzzeit), sourceKarenzzeit, (this.karenzzeit!= null)));
                    copy.setKarenzzeit(copyKarenzzeit);
                } else {
                    if (karenzzeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.karenzzeit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVersicherungssummeOderLeistung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withArtID(STEVersicherungssummeOderLeistung value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withWert(BigDecimal value) {
        setWert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withWertschluessel(STELeistungSchluessel value) {
        setWertschluessel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withWerteinheit(STWerteinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withAuszahlungsweise(STZahlungsweise value) {
        setAuszahlungsweise(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withBasisjahr(Integer value) {
        setBasisjahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withPreisindex(BigDecimal value) {
        setPreisindex(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withInklusiveUmsatzsteuer(Boolean value) {
        setInklusiveUmsatzsteuer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withJahresmaximierung(BigDecimal value) {
        setJahresmaximierung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withLeistungserbringung(STLeistungserbringung value) {
        setLeistungserbringung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withZeitraum(CTZeitraum value) {
        setZeitraum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withGarantierteErhoehung(CTDynamik... values) {
        if (values!= null) {
            for (CTDynamik value: values) {
                getGarantierteErhoehung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withGarantierteErhoehung(Collection<CTDynamik> values) {
        if (values!= null) {
            getGarantierteErhoehung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withSelbstbeteiligung(CTSelbstbeteiligung... values) {
        if (values!= null) {
            for (CTSelbstbeteiligung value: values) {
                getSelbstbeteiligung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withSelbstbeteiligung(Collection<CTSelbstbeteiligung> values) {
        if (values!= null) {
            getSelbstbeteiligung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withKarenzzeit(CTZeitraum value) {
        setKarenzzeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungssummeOderLeistung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
