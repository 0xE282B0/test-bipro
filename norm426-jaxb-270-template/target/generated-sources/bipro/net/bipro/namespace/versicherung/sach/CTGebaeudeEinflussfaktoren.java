
package net.bipro.namespace.versicherung.sach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitwert;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STGebaeudeeigentum;
import net.bipro.namespace.datentypen.STGebaeudewertermittlung;
import net.bipro.namespace.datentypen.STNutzung;
import net.bipro.namespace.datentypen.STRisikokennzifferWohngebaeude;
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
 * Faktoren, die die Risikoeinschätzung eines Gebäudes mittelbar beeinflussen.
 * 
 * <p>Java class for CT_GebaeudeEinflussfaktoren complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_GebaeudeEinflussfaktoren"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_ZusaetzlicheGegenstandsdaten"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hausart" type="{http://www.bipro.net/namespace/datentypen}ST_RisikokennzifferWohngebaeude" minOccurs="0"/&gt;
 *         &lt;element name="Wohnflaeche" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Nutzflaeche" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="WohnflaecheOberirdisch" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="GewerbeflaecheOberirdisch" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="WohnflaecheKeller" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="GewerbeflaecheKeller" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Gebaeudeeigentum" type="{http://www.bipro.net/namespace/datentypen}ST_Gebaeudeeigentum" minOccurs="0"/&gt;
 *         &lt;element name="Nutzung" type="{http://www.bipro.net/namespace/datentypen}ST_Nutzung" minOccurs="0"/&gt;
 *         &lt;element name="Betriebsart" type="{http://www.bipro.net/namespace/datentypen}ST_Betriebsart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AnteilGewerblicheNutzung" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Gebaeudewertermittlung" type="{http://www.bipro.net/namespace/datentypen}ST_Gebaeudewertermittlung" minOccurs="0"/&gt;
 *         &lt;element name="Sicherung" type="{http://www.bipro.net/namespace/versicherung/sach}CT_Sicherung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vorschaden" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Vorschaden" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fragenkomplex" type="{http://www.bipro.net/namespace/fragen}CT_Fragenkomplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Gebaeudewertermittlungsjahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Zeitwert" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitwert" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_GebaeudeEinflussfaktoren", propOrder = {
    "hausart",
    "wohnflaeche",
    "nutzflaeche",
    "wohnflaecheOberirdisch",
    "gewerbeflaecheOberirdisch",
    "wohnflaecheKeller",
    "gewerbeflaecheKeller",
    "gebaeudeeigentum",
    "nutzung",
    "betriebsart",
    "anteilGewerblicheNutzung",
    "gebaeudewertermittlung",
    "sicherung",
    "vorschaden",
    "fragenkomplex",
    "gebaeudewertermittlungsjahr",
    "zeitwert"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGebaeudeEinflussfaktoren
    extends CTZusaetzlicheGegenstandsdaten
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Hausart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STRisikokennzifferWohngebaeude hausart;
    @XmlElement(name = "Wohnflaeche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer wohnflaeche;
    @XmlElement(name = "Nutzflaeche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer nutzflaeche;
    @XmlElement(name = "WohnflaecheOberirdisch")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer wohnflaecheOberirdisch;
    @XmlElement(name = "GewerbeflaecheOberirdisch")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer gewerbeflaecheOberirdisch;
    @XmlElement(name = "WohnflaecheKeller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer wohnflaecheKeller;
    @XmlElement(name = "GewerbeflaecheKeller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer gewerbeflaecheKeller;
    @XmlElement(name = "Gebaeudeeigentum")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STGebaeudeeigentum gebaeudeeigentum;
    @XmlElement(name = "Nutzung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STNutzung nutzung;
    @XmlElementRef(name = "Betriebsart", namespace = "http://www.bipro.net/namespace/versicherung/sach", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<JAXBElement<List<String>>> betriebsart;
    @XmlElement(name = "AnteilGewerblicheNutzung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anteilGewerblicheNutzung;
    @XmlElement(name = "Gebaeudewertermittlung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STGebaeudewertermittlung gebaeudewertermittlung;
    @XmlElement(name = "Sicherung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTSicherung> sicherung;
    @XmlElement(name = "Vorschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTVorschaden> vorschaden;
    @XmlElement(name = "Fragenkomplex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTFragenkomplex> fragenkomplex;
    @XmlElement(name = "Gebaeudewertermittlungsjahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer gebaeudewertermittlungsjahr;
    @XmlElement(name = "Zeitwert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitwert zeitwert;

    /**
     * Gets the value of the hausart property.
     * 
     * @return
     *     possible object is
     *     {@link STRisikokennzifferWohngebaeude }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STRisikokennzifferWohngebaeude getHausart() {
        return hausart;
    }

    /**
     * Sets the value of the hausart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRisikokennzifferWohngebaeude }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHausart(STRisikokennzifferWohngebaeude value) {
        this.hausart = value;
    }

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getWohnflaeche() {
        return wohnflaeche;
    }

    /**
     * Sets the value of the wohnflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWohnflaeche(Integer value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the nutzflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getNutzflaeche() {
        return nutzflaeche;
    }

    /**
     * Sets the value of the nutzflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setNutzflaeche(Integer value) {
        this.nutzflaeche = value;
    }

    /**
     * Gets the value of the wohnflaecheOberirdisch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getWohnflaecheOberirdisch() {
        return wohnflaecheOberirdisch;
    }

    /**
     * Sets the value of the wohnflaecheOberirdisch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWohnflaecheOberirdisch(Integer value) {
        this.wohnflaecheOberirdisch = value;
    }

    /**
     * Gets the value of the gewerbeflaecheOberirdisch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getGewerbeflaecheOberirdisch() {
        return gewerbeflaecheOberirdisch;
    }

    /**
     * Sets the value of the gewerbeflaecheOberirdisch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGewerbeflaecheOberirdisch(Integer value) {
        this.gewerbeflaecheOberirdisch = value;
    }

    /**
     * Gets the value of the wohnflaecheKeller property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getWohnflaecheKeller() {
        return wohnflaecheKeller;
    }

    /**
     * Sets the value of the wohnflaecheKeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWohnflaecheKeller(Integer value) {
        this.wohnflaecheKeller = value;
    }

    /**
     * Gets the value of the gewerbeflaecheKeller property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getGewerbeflaecheKeller() {
        return gewerbeflaecheKeller;
    }

    /**
     * Sets the value of the gewerbeflaecheKeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGewerbeflaecheKeller(Integer value) {
        this.gewerbeflaecheKeller = value;
    }

    /**
     * Gets the value of the gebaeudeeigentum property.
     * 
     * @return
     *     possible object is
     *     {@link STGebaeudeeigentum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STGebaeudeeigentum getGebaeudeeigentum() {
        return gebaeudeeigentum;
    }

    /**
     * Sets the value of the gebaeudeeigentum property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGebaeudeeigentum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGebaeudeeigentum(STGebaeudeeigentum value) {
        this.gebaeudeeigentum = value;
    }

    /**
     * Gets the value of the nutzung property.
     * 
     * @return
     *     possible object is
     *     {@link STNutzung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STNutzung getNutzung() {
        return nutzung;
    }

    /**
     * Sets the value of the nutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STNutzung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setNutzung(STNutzung value) {
        this.nutzung = value;
    }

    /**
     * Gets the value of the betriebsart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betriebsart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetriebsart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<JAXBElement<List<String>>> getBetriebsart() {
        if (betriebsart == null) {
            betriebsart = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.betriebsart;
    }

    /**
     * Gets the value of the anteilGewerblicheNutzung property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getAnteilGewerblicheNutzung() {
        return anteilGewerblicheNutzung;
    }

    /**
     * Sets the value of the anteilGewerblicheNutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnteilGewerblicheNutzung(BigDecimal value) {
        this.anteilGewerblicheNutzung = value;
    }

    /**
     * Gets the value of the gebaeudewertermittlung property.
     * 
     * @return
     *     possible object is
     *     {@link STGebaeudewertermittlung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STGebaeudewertermittlung getGebaeudewertermittlung() {
        return gebaeudewertermittlung;
    }

    /**
     * Sets the value of the gebaeudewertermittlung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGebaeudewertermittlung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGebaeudewertermittlung(STGebaeudewertermittlung value) {
        this.gebaeudewertermittlung = value;
    }

    /**
     * Gets the value of the sicherung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicherung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSicherung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSicherung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTSicherung> getSicherung() {
        if (sicherung == null) {
            sicherung = new ArrayList<CTSicherung>();
        }
        return this.sicherung;
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
     * Gets the value of the gebaeudewertermittlungsjahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getGebaeudewertermittlungsjahr() {
        return gebaeudewertermittlungsjahr;
    }

    /**
     * Sets the value of the gebaeudewertermittlungsjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGebaeudewertermittlungsjahr(Integer value) {
        this.gebaeudewertermittlungsjahr = value;
    }

    /**
     * Gets the value of the zeitwert property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZeitwert getZeitwert() {
        return zeitwert;
    }

    /**
     * Sets the value of the zeitwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZeitwert(CTZeitwert value) {
        this.zeitwert = value;
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
        final CTGebaeudeEinflussfaktoren that = ((CTGebaeudeEinflussfaktoren) object);
        {
            STRisikokennzifferWohngebaeude lhsHausart;
            lhsHausart = this.getHausart();
            STRisikokennzifferWohngebaeude rhsHausart;
            rhsHausart = that.getHausart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausart", lhsHausart), LocatorUtils.property(thatLocator, "hausart", rhsHausart), lhsHausart, rhsHausart, (this.hausart!= null), (that.hausart!= null))) {
                return false;
            }
        }
        {
            Integer lhsWohnflaeche;
            lhsWohnflaeche = this.getWohnflaeche();
            Integer rhsWohnflaeche;
            rhsWohnflaeche = that.getWohnflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaeche", lhsWohnflaeche), LocatorUtils.property(thatLocator, "wohnflaeche", rhsWohnflaeche), lhsWohnflaeche, rhsWohnflaeche, (this.wohnflaeche!= null), (that.wohnflaeche!= null))) {
                return false;
            }
        }
        {
            Integer lhsNutzflaeche;
            lhsNutzflaeche = this.getNutzflaeche();
            Integer rhsNutzflaeche;
            rhsNutzflaeche = that.getNutzflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzflaeche", lhsNutzflaeche), LocatorUtils.property(thatLocator, "nutzflaeche", rhsNutzflaeche), lhsNutzflaeche, rhsNutzflaeche, (this.nutzflaeche!= null), (that.nutzflaeche!= null))) {
                return false;
            }
        }
        {
            Integer lhsWohnflaecheOberirdisch;
            lhsWohnflaecheOberirdisch = this.getWohnflaecheOberirdisch();
            Integer rhsWohnflaecheOberirdisch;
            rhsWohnflaecheOberirdisch = that.getWohnflaecheOberirdisch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaecheOberirdisch", lhsWohnflaecheOberirdisch), LocatorUtils.property(thatLocator, "wohnflaecheOberirdisch", rhsWohnflaecheOberirdisch), lhsWohnflaecheOberirdisch, rhsWohnflaecheOberirdisch, (this.wohnflaecheOberirdisch!= null), (that.wohnflaecheOberirdisch!= null))) {
                return false;
            }
        }
        {
            Integer lhsGewerbeflaecheOberirdisch;
            lhsGewerbeflaecheOberirdisch = this.getGewerbeflaecheOberirdisch();
            Integer rhsGewerbeflaecheOberirdisch;
            rhsGewerbeflaecheOberirdisch = that.getGewerbeflaecheOberirdisch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbeflaecheOberirdisch", lhsGewerbeflaecheOberirdisch), LocatorUtils.property(thatLocator, "gewerbeflaecheOberirdisch", rhsGewerbeflaecheOberirdisch), lhsGewerbeflaecheOberirdisch, rhsGewerbeflaecheOberirdisch, (this.gewerbeflaecheOberirdisch!= null), (that.gewerbeflaecheOberirdisch!= null))) {
                return false;
            }
        }
        {
            Integer lhsWohnflaecheKeller;
            lhsWohnflaecheKeller = this.getWohnflaecheKeller();
            Integer rhsWohnflaecheKeller;
            rhsWohnflaecheKeller = that.getWohnflaecheKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wohnflaecheKeller", lhsWohnflaecheKeller), LocatorUtils.property(thatLocator, "wohnflaecheKeller", rhsWohnflaecheKeller), lhsWohnflaecheKeller, rhsWohnflaecheKeller, (this.wohnflaecheKeller!= null), (that.wohnflaecheKeller!= null))) {
                return false;
            }
        }
        {
            Integer lhsGewerbeflaecheKeller;
            lhsGewerbeflaecheKeller = this.getGewerbeflaecheKeller();
            Integer rhsGewerbeflaecheKeller;
            rhsGewerbeflaecheKeller = that.getGewerbeflaecheKeller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewerbeflaecheKeller", lhsGewerbeflaecheKeller), LocatorUtils.property(thatLocator, "gewerbeflaecheKeller", rhsGewerbeflaecheKeller), lhsGewerbeflaecheKeller, rhsGewerbeflaecheKeller, (this.gewerbeflaecheKeller!= null), (that.gewerbeflaecheKeller!= null))) {
                return false;
            }
        }
        {
            STGebaeudeeigentum lhsGebaeudeeigentum;
            lhsGebaeudeeigentum = this.getGebaeudeeigentum();
            STGebaeudeeigentum rhsGebaeudeeigentum;
            rhsGebaeudeeigentum = that.getGebaeudeeigentum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebaeudeeigentum", lhsGebaeudeeigentum), LocatorUtils.property(thatLocator, "gebaeudeeigentum", rhsGebaeudeeigentum), lhsGebaeudeeigentum, rhsGebaeudeeigentum, (this.gebaeudeeigentum!= null), (that.gebaeudeeigentum!= null))) {
                return false;
            }
        }
        {
            STNutzung lhsNutzung;
            lhsNutzung = this.getNutzung();
            STNutzung rhsNutzung;
            rhsNutzung = that.getNutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzung", lhsNutzung), LocatorUtils.property(thatLocator, "nutzung", rhsNutzung), lhsNutzung, rhsNutzung, (this.nutzung!= null), (that.nutzung!= null))) {
                return false;
            }
        }
        {
            List<JAXBElement<List<String>>> lhsBetriebsart;
            lhsBetriebsart = (((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))?this.getBetriebsart():null);
            List<JAXBElement<List<String>>> rhsBetriebsart;
            rhsBetriebsart = (((that.betriebsart!= null)&&(!that.betriebsart.isEmpty()))?that.getBetriebsart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebsart", lhsBetriebsart), LocatorUtils.property(thatLocator, "betriebsart", rhsBetriebsart), lhsBetriebsart, rhsBetriebsart, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty())), ((that.betriebsart!= null)&&(!that.betriebsart.isEmpty())))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnteilGewerblicheNutzung;
            lhsAnteilGewerblicheNutzung = this.getAnteilGewerblicheNutzung();
            BigDecimal rhsAnteilGewerblicheNutzung;
            rhsAnteilGewerblicheNutzung = that.getAnteilGewerblicheNutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteilGewerblicheNutzung", lhsAnteilGewerblicheNutzung), LocatorUtils.property(thatLocator, "anteilGewerblicheNutzung", rhsAnteilGewerblicheNutzung), lhsAnteilGewerblicheNutzung, rhsAnteilGewerblicheNutzung, (this.anteilGewerblicheNutzung!= null), (that.anteilGewerblicheNutzung!= null))) {
                return false;
            }
        }
        {
            STGebaeudewertermittlung lhsGebaeudewertermittlung;
            lhsGebaeudewertermittlung = this.getGebaeudewertermittlung();
            STGebaeudewertermittlung rhsGebaeudewertermittlung;
            rhsGebaeudewertermittlung = that.getGebaeudewertermittlung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebaeudewertermittlung", lhsGebaeudewertermittlung), LocatorUtils.property(thatLocator, "gebaeudewertermittlung", rhsGebaeudewertermittlung), lhsGebaeudewertermittlung, rhsGebaeudewertermittlung, (this.gebaeudewertermittlung!= null), (that.gebaeudewertermittlung!= null))) {
                return false;
            }
        }
        {
            List<CTSicherung> lhsSicherung;
            lhsSicherung = (((this.sicherung!= null)&&(!this.sicherung.isEmpty()))?this.getSicherung():null);
            List<CTSicherung> rhsSicherung;
            rhsSicherung = (((that.sicherung!= null)&&(!that.sicherung.isEmpty()))?that.getSicherung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherung", lhsSicherung), LocatorUtils.property(thatLocator, "sicherung", rhsSicherung), lhsSicherung, rhsSicherung, ((this.sicherung!= null)&&(!this.sicherung.isEmpty())), ((that.sicherung!= null)&&(!that.sicherung.isEmpty())))) {
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
            List<CTFragenkomplex> lhsFragenkomplex;
            lhsFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            List<CTFragenkomplex> rhsFragenkomplex;
            rhsFragenkomplex = (((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty()))?that.getFragenkomplex():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragenkomplex", lhsFragenkomplex), LocatorUtils.property(thatLocator, "fragenkomplex", rhsFragenkomplex), lhsFragenkomplex, rhsFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())), ((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty())))) {
                return false;
            }
        }
        {
            Integer lhsGebaeudewertermittlungsjahr;
            lhsGebaeudewertermittlungsjahr = this.getGebaeudewertermittlungsjahr();
            Integer rhsGebaeudewertermittlungsjahr;
            rhsGebaeudewertermittlungsjahr = that.getGebaeudewertermittlungsjahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gebaeudewertermittlungsjahr", lhsGebaeudewertermittlungsjahr), LocatorUtils.property(thatLocator, "gebaeudewertermittlungsjahr", rhsGebaeudewertermittlungsjahr), lhsGebaeudewertermittlungsjahr, rhsGebaeudewertermittlungsjahr, (this.gebaeudewertermittlungsjahr!= null), (that.gebaeudewertermittlungsjahr!= null))) {
                return false;
            }
        }
        {
            CTZeitwert lhsZeitwert;
            lhsZeitwert = this.getZeitwert();
            CTZeitwert rhsZeitwert;
            rhsZeitwert = that.getZeitwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeitwert", lhsZeitwert), LocatorUtils.property(thatLocator, "zeitwert", rhsZeitwert), lhsZeitwert, rhsZeitwert, (this.zeitwert!= null), (that.zeitwert!= null))) {
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
            STRisikokennzifferWohngebaeude theHausart;
            theHausart = this.getHausart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hausart", theHausart), currentHashCode, theHausart, (this.hausart!= null));
        }
        {
            Integer theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wohnflaeche", theWohnflaeche), currentHashCode, theWohnflaeche, (this.wohnflaeche!= null));
        }
        {
            Integer theNutzflaeche;
            theNutzflaeche = this.getNutzflaeche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nutzflaeche", theNutzflaeche), currentHashCode, theNutzflaeche, (this.nutzflaeche!= null));
        }
        {
            Integer theWohnflaecheOberirdisch;
            theWohnflaecheOberirdisch = this.getWohnflaecheOberirdisch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wohnflaecheOberirdisch", theWohnflaecheOberirdisch), currentHashCode, theWohnflaecheOberirdisch, (this.wohnflaecheOberirdisch!= null));
        }
        {
            Integer theGewerbeflaecheOberirdisch;
            theGewerbeflaecheOberirdisch = this.getGewerbeflaecheOberirdisch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewerbeflaecheOberirdisch", theGewerbeflaecheOberirdisch), currentHashCode, theGewerbeflaecheOberirdisch, (this.gewerbeflaecheOberirdisch!= null));
        }
        {
            Integer theWohnflaecheKeller;
            theWohnflaecheKeller = this.getWohnflaecheKeller();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wohnflaecheKeller", theWohnflaecheKeller), currentHashCode, theWohnflaecheKeller, (this.wohnflaecheKeller!= null));
        }
        {
            Integer theGewerbeflaecheKeller;
            theGewerbeflaecheKeller = this.getGewerbeflaecheKeller();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewerbeflaecheKeller", theGewerbeflaecheKeller), currentHashCode, theGewerbeflaecheKeller, (this.gewerbeflaecheKeller!= null));
        }
        {
            STGebaeudeeigentum theGebaeudeeigentum;
            theGebaeudeeigentum = this.getGebaeudeeigentum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gebaeudeeigentum", theGebaeudeeigentum), currentHashCode, theGebaeudeeigentum, (this.gebaeudeeigentum!= null));
        }
        {
            STNutzung theNutzung;
            theNutzung = this.getNutzung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nutzung", theNutzung), currentHashCode, theNutzung, (this.nutzung!= null));
        }
        {
            List<JAXBElement<List<String>>> theBetriebsart;
            theBetriebsart = (((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))?this.getBetriebsart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betriebsart", theBetriebsart), currentHashCode, theBetriebsart, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty())));
        }
        {
            BigDecimal theAnteilGewerblicheNutzung;
            theAnteilGewerblicheNutzung = this.getAnteilGewerblicheNutzung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anteilGewerblicheNutzung", theAnteilGewerblicheNutzung), currentHashCode, theAnteilGewerblicheNutzung, (this.anteilGewerblicheNutzung!= null));
        }
        {
            STGebaeudewertermittlung theGebaeudewertermittlung;
            theGebaeudewertermittlung = this.getGebaeudewertermittlung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gebaeudewertermittlung", theGebaeudewertermittlung), currentHashCode, theGebaeudewertermittlung, (this.gebaeudewertermittlung!= null));
        }
        {
            List<CTSicherung> theSicherung;
            theSicherung = (((this.sicherung!= null)&&(!this.sicherung.isEmpty()))?this.getSicherung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherung", theSicherung), currentHashCode, theSicherung, ((this.sicherung!= null)&&(!this.sicherung.isEmpty())));
        }
        {
            List<CTVorschaden> theVorschaden;
            theVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorschaden", theVorschaden), currentHashCode, theVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())));
        }
        {
            List<CTFragenkomplex> theFragenkomplex;
            theFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragenkomplex", theFragenkomplex), currentHashCode, theFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())));
        }
        {
            Integer theGebaeudewertermittlungsjahr;
            theGebaeudewertermittlungsjahr = this.getGebaeudewertermittlungsjahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gebaeudewertermittlungsjahr", theGebaeudewertermittlungsjahr), currentHashCode, theGebaeudewertermittlungsjahr, (this.gebaeudewertermittlungsjahr!= null));
        }
        {
            CTZeitwert theZeitwert;
            theZeitwert = this.getZeitwert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitwert", theZeitwert), currentHashCode, theZeitwert, (this.zeitwert!= null));
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
        if (draftCopy instanceof CTGebaeudeEinflussfaktoren) {
            final CTGebaeudeEinflussfaktoren copy = ((CTGebaeudeEinflussfaktoren) draftCopy);
            {
                Boolean hausartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hausart!= null));
                if (hausartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STRisikokennzifferWohngebaeude sourceHausart;
                    sourceHausart = this.getHausart();
                    STRisikokennzifferWohngebaeude copyHausart = ((STRisikokennzifferWohngebaeude) strategy.copy(LocatorUtils.property(locator, "hausart", sourceHausart), sourceHausart, (this.hausart!= null)));
                    copy.setHausart(copyHausart);
                } else {
                    if (hausartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hausart = null;
                    }
                }
            }
            {
                Boolean wohnflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnflaeche!= null));
                if (wohnflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceWohnflaeche;
                    sourceWohnflaeche = this.getWohnflaeche();
                    Integer copyWohnflaeche = ((Integer) strategy.copy(LocatorUtils.property(locator, "wohnflaeche", sourceWohnflaeche), sourceWohnflaeche, (this.wohnflaeche!= null)));
                    copy.setWohnflaeche(copyWohnflaeche);
                } else {
                    if (wohnflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnflaeche = null;
                    }
                }
            }
            {
                Boolean nutzflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nutzflaeche!= null));
                if (nutzflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceNutzflaeche;
                    sourceNutzflaeche = this.getNutzflaeche();
                    Integer copyNutzflaeche = ((Integer) strategy.copy(LocatorUtils.property(locator, "nutzflaeche", sourceNutzflaeche), sourceNutzflaeche, (this.nutzflaeche!= null)));
                    copy.setNutzflaeche(copyNutzflaeche);
                } else {
                    if (nutzflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nutzflaeche = null;
                    }
                }
            }
            {
                Boolean wohnflaecheOberirdischShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnflaecheOberirdisch!= null));
                if (wohnflaecheOberirdischShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceWohnflaecheOberirdisch;
                    sourceWohnflaecheOberirdisch = this.getWohnflaecheOberirdisch();
                    Integer copyWohnflaecheOberirdisch = ((Integer) strategy.copy(LocatorUtils.property(locator, "wohnflaecheOberirdisch", sourceWohnflaecheOberirdisch), sourceWohnflaecheOberirdisch, (this.wohnflaecheOberirdisch!= null)));
                    copy.setWohnflaecheOberirdisch(copyWohnflaecheOberirdisch);
                } else {
                    if (wohnflaecheOberirdischShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnflaecheOberirdisch = null;
                    }
                }
            }
            {
                Boolean gewerbeflaecheOberirdischShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerbeflaecheOberirdisch!= null));
                if (gewerbeflaecheOberirdischShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceGewerbeflaecheOberirdisch;
                    sourceGewerbeflaecheOberirdisch = this.getGewerbeflaecheOberirdisch();
                    Integer copyGewerbeflaecheOberirdisch = ((Integer) strategy.copy(LocatorUtils.property(locator, "gewerbeflaecheOberirdisch", sourceGewerbeflaecheOberirdisch), sourceGewerbeflaecheOberirdisch, (this.gewerbeflaecheOberirdisch!= null)));
                    copy.setGewerbeflaecheOberirdisch(copyGewerbeflaecheOberirdisch);
                } else {
                    if (gewerbeflaecheOberirdischShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerbeflaecheOberirdisch = null;
                    }
                }
            }
            {
                Boolean wohnflaecheKellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wohnflaecheKeller!= null));
                if (wohnflaecheKellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceWohnflaecheKeller;
                    sourceWohnflaecheKeller = this.getWohnflaecheKeller();
                    Integer copyWohnflaecheKeller = ((Integer) strategy.copy(LocatorUtils.property(locator, "wohnflaecheKeller", sourceWohnflaecheKeller), sourceWohnflaecheKeller, (this.wohnflaecheKeller!= null)));
                    copy.setWohnflaecheKeller(copyWohnflaecheKeller);
                } else {
                    if (wohnflaecheKellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wohnflaecheKeller = null;
                    }
                }
            }
            {
                Boolean gewerbeflaecheKellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewerbeflaecheKeller!= null));
                if (gewerbeflaecheKellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceGewerbeflaecheKeller;
                    sourceGewerbeflaecheKeller = this.getGewerbeflaecheKeller();
                    Integer copyGewerbeflaecheKeller = ((Integer) strategy.copy(LocatorUtils.property(locator, "gewerbeflaecheKeller", sourceGewerbeflaecheKeller), sourceGewerbeflaecheKeller, (this.gewerbeflaecheKeller!= null)));
                    copy.setGewerbeflaecheKeller(copyGewerbeflaecheKeller);
                } else {
                    if (gewerbeflaecheKellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewerbeflaecheKeller = null;
                    }
                }
            }
            {
                Boolean gebaeudeeigentumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gebaeudeeigentum!= null));
                if (gebaeudeeigentumShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGebaeudeeigentum sourceGebaeudeeigentum;
                    sourceGebaeudeeigentum = this.getGebaeudeeigentum();
                    STGebaeudeeigentum copyGebaeudeeigentum = ((STGebaeudeeigentum) strategy.copy(LocatorUtils.property(locator, "gebaeudeeigentum", sourceGebaeudeeigentum), sourceGebaeudeeigentum, (this.gebaeudeeigentum!= null)));
                    copy.setGebaeudeeigentum(copyGebaeudeeigentum);
                } else {
                    if (gebaeudeeigentumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gebaeudeeigentum = null;
                    }
                }
            }
            {
                Boolean nutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nutzung!= null));
                if (nutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STNutzung sourceNutzung;
                    sourceNutzung = this.getNutzung();
                    STNutzung copyNutzung = ((STNutzung) strategy.copy(LocatorUtils.property(locator, "nutzung", sourceNutzung), sourceNutzung, (this.nutzung!= null)));
                    copy.setNutzung(copyNutzung);
                } else {
                    if (nutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nutzung = null;
                    }
                }
            }
            {
                Boolean betriebsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty())));
                if (betriebsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<JAXBElement<List<String>>> sourceBetriebsart;
                    sourceBetriebsart = (((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))?this.getBetriebsart():null);
                    @SuppressWarnings("unchecked")
                    List<JAXBElement<List<String>>> copyBetriebsart = ((List<JAXBElement<List<String>>> ) strategy.copy(LocatorUtils.property(locator, "betriebsart", sourceBetriebsart), sourceBetriebsart, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))));
                    copy.betriebsart = null;
                    if (copyBetriebsart!= null) {
                        List<JAXBElement<List<String>>> uniqueBetriebsartl = copy.getBetriebsart();
                        uniqueBetriebsartl.addAll(copyBetriebsart);
                    }
                } else {
                    if (betriebsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betriebsart = null;
                    }
                }
            }
            {
                Boolean anteilGewerblicheNutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anteilGewerblicheNutzung!= null));
                if (anteilGewerblicheNutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnteilGewerblicheNutzung;
                    sourceAnteilGewerblicheNutzung = this.getAnteilGewerblicheNutzung();
                    BigDecimal copyAnteilGewerblicheNutzung = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anteilGewerblicheNutzung", sourceAnteilGewerblicheNutzung), sourceAnteilGewerblicheNutzung, (this.anteilGewerblicheNutzung!= null)));
                    copy.setAnteilGewerblicheNutzung(copyAnteilGewerblicheNutzung);
                } else {
                    if (anteilGewerblicheNutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anteilGewerblicheNutzung = null;
                    }
                }
            }
            {
                Boolean gebaeudewertermittlungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gebaeudewertermittlung!= null));
                if (gebaeudewertermittlungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGebaeudewertermittlung sourceGebaeudewertermittlung;
                    sourceGebaeudewertermittlung = this.getGebaeudewertermittlung();
                    STGebaeudewertermittlung copyGebaeudewertermittlung = ((STGebaeudewertermittlung) strategy.copy(LocatorUtils.property(locator, "gebaeudewertermittlung", sourceGebaeudewertermittlung), sourceGebaeudewertermittlung, (this.gebaeudewertermittlung!= null)));
                    copy.setGebaeudewertermittlung(copyGebaeudewertermittlung);
                } else {
                    if (gebaeudewertermittlungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gebaeudewertermittlung = null;
                    }
                }
            }
            {
                Boolean sicherungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sicherung!= null)&&(!this.sicherung.isEmpty())));
                if (sicherungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSicherung> sourceSicherung;
                    sourceSicherung = (((this.sicherung!= null)&&(!this.sicherung.isEmpty()))?this.getSicherung():null);
                    @SuppressWarnings("unchecked")
                    List<CTSicherung> copySicherung = ((List<CTSicherung> ) strategy.copy(LocatorUtils.property(locator, "sicherung", sourceSicherung), sourceSicherung, ((this.sicherung!= null)&&(!this.sicherung.isEmpty()))));
                    copy.sicherung = null;
                    if (copySicherung!= null) {
                        List<CTSicherung> uniqueSicherungl = copy.getSicherung();
                        uniqueSicherungl.addAll(copySicherung);
                    }
                } else {
                    if (sicherungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherung = null;
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
                Boolean gebaeudewertermittlungsjahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gebaeudewertermittlungsjahr!= null));
                if (gebaeudewertermittlungsjahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceGebaeudewertermittlungsjahr;
                    sourceGebaeudewertermittlungsjahr = this.getGebaeudewertermittlungsjahr();
                    Integer copyGebaeudewertermittlungsjahr = ((Integer) strategy.copy(LocatorUtils.property(locator, "gebaeudewertermittlungsjahr", sourceGebaeudewertermittlungsjahr), sourceGebaeudewertermittlungsjahr, (this.gebaeudewertermittlungsjahr!= null)));
                    copy.setGebaeudewertermittlungsjahr(copyGebaeudewertermittlungsjahr);
                } else {
                    if (gebaeudewertermittlungsjahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gebaeudewertermittlungsjahr = null;
                    }
                }
            }
            {
                Boolean zeitwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeitwert!= null));
                if (zeitwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitwert sourceZeitwert;
                    sourceZeitwert = this.getZeitwert();
                    CTZeitwert copyZeitwert = ((CTZeitwert) strategy.copy(LocatorUtils.property(locator, "zeitwert", sourceZeitwert), sourceZeitwert, (this.zeitwert!= null)));
                    copy.setZeitwert(copyZeitwert);
                } else {
                    if (zeitwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeitwert = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGebaeudeEinflussfaktoren();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withHausart(STRisikokennzifferWohngebaeude value) {
        setHausart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withWohnflaeche(Integer value) {
        setWohnflaeche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withNutzflaeche(Integer value) {
        setNutzflaeche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withWohnflaecheOberirdisch(Integer value) {
        setWohnflaecheOberirdisch(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withGewerbeflaecheOberirdisch(Integer value) {
        setGewerbeflaecheOberirdisch(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withWohnflaecheKeller(Integer value) {
        setWohnflaecheKeller(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withGewerbeflaecheKeller(Integer value) {
        setGewerbeflaecheKeller(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withGebaeudeeigentum(STGebaeudeeigentum value) {
        setGebaeudeeigentum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withNutzung(STNutzung value) {
        setNutzung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withBetriebsart(JAXBElement<List<String>> ... values) {
        if (values!= null) {
            for (JAXBElement<List<String>> value: values) {
                getBetriebsart().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withBetriebsart(Collection<JAXBElement<List<String>>> values) {
        if (values!= null) {
            getBetriebsart().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withAnteilGewerblicheNutzung(BigDecimal value) {
        setAnteilGewerblicheNutzung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withGebaeudewertermittlung(STGebaeudewertermittlung value) {
        setGebaeudewertermittlung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withSicherung(CTSicherung... values) {
        if (values!= null) {
            for (CTSicherung value: values) {
                getSicherung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withSicherung(Collection<CTSicherung> values) {
        if (values!= null) {
            getSicherung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withVorschaden(CTVorschaden... values) {
        if (values!= null) {
            for (CTVorschaden value: values) {
                getVorschaden().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withVorschaden(Collection<CTVorschaden> values) {
        if (values!= null) {
            getVorschaden().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withFragenkomplex(CTFragenkomplex... values) {
        if (values!= null) {
            for (CTFragenkomplex value: values) {
                getFragenkomplex().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withFragenkomplex(Collection<CTFragenkomplex> values) {
        if (values!= null) {
            getFragenkomplex().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withGebaeudewertermittlungsjahr(Integer value) {
        setGebaeudewertermittlungsjahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withZeitwert(CTZeitwert value) {
        setZeitwert(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeEinflussfaktoren withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
