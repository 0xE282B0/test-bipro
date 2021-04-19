
package net.bipro.namespace.versicherung.sach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STLageDerWohnung;
import net.bipro.namespace.datentypen.STNutzung;
import net.bipro.namespace.datentypen.STRisikokennzifferHausrat;
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
 * Faktoren, die die Risikoeinschätzung für eine Hausratversicherung mittelbar beeinflussen.
 * 
 * <p>Java class for CT_HausratEinflussfaktoren complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_HausratEinflussfaktoren"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_ZusaetzlicheGegenstandsdaten"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Risikokennziffer" type="{http://www.bipro.net/namespace/datentypen}ST_RisikokennzifferHausrat" minOccurs="0"/&gt;
 *         &lt;element name="Wohnflaeche" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="LageDerWohnung" type="{http://www.bipro.net/namespace/datentypen}ST_LageDerWohnung" minOccurs="0"/&gt;
 *         &lt;element name="AbgeschlosseneWohnung" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Nutzung" type="{http://www.bipro.net/namespace/datentypen}ST_Nutzung" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlTageUnbewohnt" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="BesondereGefaehrdungNachbarschaft" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Vorschaden" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Vorschaden" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Safe" type="{http://www.bipro.net/namespace/versicherung/sach}CT_Aufbewahrungsart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sicherung" type="{http://www.bipro.net/namespace/versicherung/sach}CT_Sicherung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Fragenkomplex" type="{http://www.bipro.net/namespace/fragen}CT_Fragenkomplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UnterStrassenNiveau" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Etage" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_HausratEinflussfaktoren", propOrder = {
    "risikokennziffer",
    "wohnflaeche",
    "lageDerWohnung",
    "abgeschlosseneWohnung",
    "nutzung",
    "anzahlTageUnbewohnt",
    "besondereGefaehrdungNachbarschaft",
    "vorschaden",
    "safe",
    "sicherung",
    "fragenkomplex",
    "unterStrassenNiveau",
    "etage"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTHausratEinflussfaktoren
    extends CTZusaetzlicheGegenstandsdaten
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Risikokennziffer")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STRisikokennzifferHausrat risikokennziffer;
    @XmlElement(name = "Wohnflaeche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer wohnflaeche;
    @XmlElement(name = "LageDerWohnung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLageDerWohnung lageDerWohnung;
    @XmlElement(name = "AbgeschlosseneWohnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean abgeschlosseneWohnung;
    @XmlElement(name = "Nutzung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STNutzung nutzung;
    @XmlElement(name = "AnzahlTageUnbewohnt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlTageUnbewohnt;
    @XmlElement(name = "BesondereGefaehrdungNachbarschaft")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean besondereGefaehrdungNachbarschaft;
    @XmlElement(name = "Vorschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVorschaden> vorschaden;
    @XmlElement(name = "Safe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTAufbewahrungsart> safe;
    @XmlElement(name = "Sicherung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTSicherung> sicherung;
    @XmlElement(name = "Fragenkomplex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTFragenkomplex> fragenkomplex;
    @XmlElement(name = "UnterStrassenNiveau")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean unterStrassenNiveau;
    @XmlElement(name = "Etage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer etage;

    /**
     * Gets the value of the risikokennziffer property.
     * 
     * @return
     *     possible object is
     *     {@link STRisikokennzifferHausrat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STRisikokennzifferHausrat getRisikokennziffer() {
        return risikokennziffer;
    }

    /**
     * Sets the value of the risikokennziffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRisikokennzifferHausrat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setRisikokennziffer(STRisikokennzifferHausrat value) {
        this.risikokennziffer = value;
    }

    /**
     * Gets the value of the wohnflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWohnflaeche(Integer value) {
        this.wohnflaeche = value;
    }

    /**
     * Gets the value of the lageDerWohnung property.
     * 
     * @return
     *     possible object is
     *     {@link STLageDerWohnung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLageDerWohnung getLageDerWohnung() {
        return lageDerWohnung;
    }

    /**
     * Sets the value of the lageDerWohnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLageDerWohnung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLageDerWohnung(STLageDerWohnung value) {
        this.lageDerWohnung = value;
    }

    /**
     * Gets the value of the abgeschlosseneWohnung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isAbgeschlosseneWohnung() {
        return abgeschlosseneWohnung;
    }

    /**
     * Sets the value of the abgeschlosseneWohnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbgeschlosseneWohnung(Boolean value) {
        this.abgeschlosseneWohnung = value;
    }

    /**
     * Gets the value of the nutzung property.
     * 
     * @return
     *     possible object is
     *     {@link STNutzung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNutzung(STNutzung value) {
        this.nutzung = value;
    }

    /**
     * Gets the value of the anzahlTageUnbewohnt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlTageUnbewohnt() {
        return anzahlTageUnbewohnt;
    }

    /**
     * Sets the value of the anzahlTageUnbewohnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlTageUnbewohnt(Integer value) {
        this.anzahlTageUnbewohnt = value;
    }

    /**
     * Gets the value of the besondereGefaehrdungNachbarschaft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isBesondereGefaehrdungNachbarschaft() {
        return besondereGefaehrdungNachbarschaft;
    }

    /**
     * Sets the value of the besondereGefaehrdungNachbarschaft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBesondereGefaehrdungNachbarschaft(Boolean value) {
        this.besondereGefaehrdungNachbarschaft = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVorschaden> getVorschaden() {
        if (vorschaden == null) {
            vorschaden = new ArrayList<CTVorschaden>();
        }
        return this.vorschaden;
    }

    /**
     * Gets the value of the safe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAufbewahrungsart }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTAufbewahrungsart> getSafe() {
        if (safe == null) {
            safe = new ArrayList<CTAufbewahrungsart>();
        }
        return this.safe;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTSicherung> getSicherung() {
        if (sicherung == null) {
            sicherung = new ArrayList<CTSicherung>();
        }
        return this.sicherung;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTFragenkomplex> getFragenkomplex() {
        if (fragenkomplex == null) {
            fragenkomplex = new ArrayList<CTFragenkomplex>();
        }
        return this.fragenkomplex;
    }

    /**
     * Gets the value of the unterStrassenNiveau property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isUnterStrassenNiveau() {
        return unterStrassenNiveau;
    }

    /**
     * Sets the value of the unterStrassenNiveau property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUnterStrassenNiveau(Boolean value) {
        this.unterStrassenNiveau = value;
    }

    /**
     * Gets the value of the etage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getEtage() {
        return etage;
    }

    /**
     * Sets the value of the etage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEtage(Integer value) {
        this.etage = value;
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
        final CTHausratEinflussfaktoren that = ((CTHausratEinflussfaktoren) object);
        {
            STRisikokennzifferHausrat lhsRisikokennziffer;
            lhsRisikokennziffer = this.getRisikokennziffer();
            STRisikokennzifferHausrat rhsRisikokennziffer;
            rhsRisikokennziffer = that.getRisikokennziffer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "risikokennziffer", lhsRisikokennziffer), LocatorUtils.property(thatLocator, "risikokennziffer", rhsRisikokennziffer), lhsRisikokennziffer, rhsRisikokennziffer, (this.risikokennziffer!= null), (that.risikokennziffer!= null))) {
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
            STLageDerWohnung lhsLageDerWohnung;
            lhsLageDerWohnung = this.getLageDerWohnung();
            STLageDerWohnung rhsLageDerWohnung;
            rhsLageDerWohnung = that.getLageDerWohnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lageDerWohnung", lhsLageDerWohnung), LocatorUtils.property(thatLocator, "lageDerWohnung", rhsLageDerWohnung), lhsLageDerWohnung, rhsLageDerWohnung, (this.lageDerWohnung!= null), (that.lageDerWohnung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAbgeschlosseneWohnung;
            lhsAbgeschlosseneWohnung = this.isAbgeschlosseneWohnung();
            Boolean rhsAbgeschlosseneWohnung;
            rhsAbgeschlosseneWohnung = that.isAbgeschlosseneWohnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abgeschlosseneWohnung", lhsAbgeschlosseneWohnung), LocatorUtils.property(thatLocator, "abgeschlosseneWohnung", rhsAbgeschlosseneWohnung), lhsAbgeschlosseneWohnung, rhsAbgeschlosseneWohnung, (this.abgeschlosseneWohnung!= null), (that.abgeschlosseneWohnung!= null))) {
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
            Integer lhsAnzahlTageUnbewohnt;
            lhsAnzahlTageUnbewohnt = this.getAnzahlTageUnbewohnt();
            Integer rhsAnzahlTageUnbewohnt;
            rhsAnzahlTageUnbewohnt = that.getAnzahlTageUnbewohnt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlTageUnbewohnt", lhsAnzahlTageUnbewohnt), LocatorUtils.property(thatLocator, "anzahlTageUnbewohnt", rhsAnzahlTageUnbewohnt), lhsAnzahlTageUnbewohnt, rhsAnzahlTageUnbewohnt, (this.anzahlTageUnbewohnt!= null), (that.anzahlTageUnbewohnt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBesondereGefaehrdungNachbarschaft;
            lhsBesondereGefaehrdungNachbarschaft = this.isBesondereGefaehrdungNachbarschaft();
            Boolean rhsBesondereGefaehrdungNachbarschaft;
            rhsBesondereGefaehrdungNachbarschaft = that.isBesondereGefaehrdungNachbarschaft();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besondereGefaehrdungNachbarschaft", lhsBesondereGefaehrdungNachbarschaft), LocatorUtils.property(thatLocator, "besondereGefaehrdungNachbarschaft", rhsBesondereGefaehrdungNachbarschaft), lhsBesondereGefaehrdungNachbarschaft, rhsBesondereGefaehrdungNachbarschaft, (this.besondereGefaehrdungNachbarschaft!= null), (that.besondereGefaehrdungNachbarschaft!= null))) {
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
            List<CTAufbewahrungsart> lhsSafe;
            lhsSafe = (((this.safe!= null)&&(!this.safe.isEmpty()))?this.getSafe():null);
            List<CTAufbewahrungsart> rhsSafe;
            rhsSafe = (((that.safe!= null)&&(!that.safe.isEmpty()))?that.getSafe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "safe", lhsSafe), LocatorUtils.property(thatLocator, "safe", rhsSafe), lhsSafe, rhsSafe, ((this.safe!= null)&&(!this.safe.isEmpty())), ((that.safe!= null)&&(!that.safe.isEmpty())))) {
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
            List<CTFragenkomplex> lhsFragenkomplex;
            lhsFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            List<CTFragenkomplex> rhsFragenkomplex;
            rhsFragenkomplex = (((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty()))?that.getFragenkomplex():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fragenkomplex", lhsFragenkomplex), LocatorUtils.property(thatLocator, "fragenkomplex", rhsFragenkomplex), lhsFragenkomplex, rhsFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())), ((that.fragenkomplex!= null)&&(!that.fragenkomplex.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsUnterStrassenNiveau;
            lhsUnterStrassenNiveau = this.isUnterStrassenNiveau();
            Boolean rhsUnterStrassenNiveau;
            rhsUnterStrassenNiveau = that.isUnterStrassenNiveau();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterStrassenNiveau", lhsUnterStrassenNiveau), LocatorUtils.property(thatLocator, "unterStrassenNiveau", rhsUnterStrassenNiveau), lhsUnterStrassenNiveau, rhsUnterStrassenNiveau, (this.unterStrassenNiveau!= null), (that.unterStrassenNiveau!= null))) {
                return false;
            }
        }
        {
            Integer lhsEtage;
            lhsEtage = this.getEtage();
            Integer rhsEtage;
            rhsEtage = that.getEtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "etage", lhsEtage), LocatorUtils.property(thatLocator, "etage", rhsEtage), lhsEtage, rhsEtage, (this.etage!= null), (that.etage!= null))) {
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
            STRisikokennzifferHausrat theRisikokennziffer;
            theRisikokennziffer = this.getRisikokennziffer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "risikokennziffer", theRisikokennziffer), currentHashCode, theRisikokennziffer, (this.risikokennziffer!= null));
        }
        {
            Integer theWohnflaeche;
            theWohnflaeche = this.getWohnflaeche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wohnflaeche", theWohnflaeche), currentHashCode, theWohnflaeche, (this.wohnflaeche!= null));
        }
        {
            STLageDerWohnung theLageDerWohnung;
            theLageDerWohnung = this.getLageDerWohnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lageDerWohnung", theLageDerWohnung), currentHashCode, theLageDerWohnung, (this.lageDerWohnung!= null));
        }
        {
            Boolean theAbgeschlosseneWohnung;
            theAbgeschlosseneWohnung = this.isAbgeschlosseneWohnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abgeschlosseneWohnung", theAbgeschlosseneWohnung), currentHashCode, theAbgeschlosseneWohnung, (this.abgeschlosseneWohnung!= null));
        }
        {
            STNutzung theNutzung;
            theNutzung = this.getNutzung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nutzung", theNutzung), currentHashCode, theNutzung, (this.nutzung!= null));
        }
        {
            Integer theAnzahlTageUnbewohnt;
            theAnzahlTageUnbewohnt = this.getAnzahlTageUnbewohnt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlTageUnbewohnt", theAnzahlTageUnbewohnt), currentHashCode, theAnzahlTageUnbewohnt, (this.anzahlTageUnbewohnt!= null));
        }
        {
            Boolean theBesondereGefaehrdungNachbarschaft;
            theBesondereGefaehrdungNachbarschaft = this.isBesondereGefaehrdungNachbarschaft();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "besondereGefaehrdungNachbarschaft", theBesondereGefaehrdungNachbarschaft), currentHashCode, theBesondereGefaehrdungNachbarschaft, (this.besondereGefaehrdungNachbarschaft!= null));
        }
        {
            List<CTVorschaden> theVorschaden;
            theVorschaden = (((this.vorschaden!= null)&&(!this.vorschaden.isEmpty()))?this.getVorschaden():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorschaden", theVorschaden), currentHashCode, theVorschaden, ((this.vorschaden!= null)&&(!this.vorschaden.isEmpty())));
        }
        {
            List<CTAufbewahrungsart> theSafe;
            theSafe = (((this.safe!= null)&&(!this.safe.isEmpty()))?this.getSafe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "safe", theSafe), currentHashCode, theSafe, ((this.safe!= null)&&(!this.safe.isEmpty())));
        }
        {
            List<CTSicherung> theSicherung;
            theSicherung = (((this.sicherung!= null)&&(!this.sicherung.isEmpty()))?this.getSicherung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherung", theSicherung), currentHashCode, theSicherung, ((this.sicherung!= null)&&(!this.sicherung.isEmpty())));
        }
        {
            List<CTFragenkomplex> theFragenkomplex;
            theFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragenkomplex", theFragenkomplex), currentHashCode, theFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())));
        }
        {
            Boolean theUnterStrassenNiveau;
            theUnterStrassenNiveau = this.isUnterStrassenNiveau();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unterStrassenNiveau", theUnterStrassenNiveau), currentHashCode, theUnterStrassenNiveau, (this.unterStrassenNiveau!= null));
        }
        {
            Integer theEtage;
            theEtage = this.getEtage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "etage", theEtage), currentHashCode, theEtage, (this.etage!= null));
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
        if (draftCopy instanceof CTHausratEinflussfaktoren) {
            final CTHausratEinflussfaktoren copy = ((CTHausratEinflussfaktoren) draftCopy);
            {
                Boolean risikokennzifferShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.risikokennziffer!= null));
                if (risikokennzifferShouldBeCopiedAndSet == Boolean.TRUE) {
                    STRisikokennzifferHausrat sourceRisikokennziffer;
                    sourceRisikokennziffer = this.getRisikokennziffer();
                    STRisikokennzifferHausrat copyRisikokennziffer = ((STRisikokennzifferHausrat) strategy.copy(LocatorUtils.property(locator, "risikokennziffer", sourceRisikokennziffer), sourceRisikokennziffer, (this.risikokennziffer!= null)));
                    copy.setRisikokennziffer(copyRisikokennziffer);
                } else {
                    if (risikokennzifferShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.risikokennziffer = null;
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
                Boolean lageDerWohnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lageDerWohnung!= null));
                if (lageDerWohnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLageDerWohnung sourceLageDerWohnung;
                    sourceLageDerWohnung = this.getLageDerWohnung();
                    STLageDerWohnung copyLageDerWohnung = ((STLageDerWohnung) strategy.copy(LocatorUtils.property(locator, "lageDerWohnung", sourceLageDerWohnung), sourceLageDerWohnung, (this.lageDerWohnung!= null)));
                    copy.setLageDerWohnung(copyLageDerWohnung);
                } else {
                    if (lageDerWohnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lageDerWohnung = null;
                    }
                }
            }
            {
                Boolean abgeschlosseneWohnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abgeschlosseneWohnung!= null));
                if (abgeschlosseneWohnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAbgeschlosseneWohnung;
                    sourceAbgeschlosseneWohnung = this.isAbgeschlosseneWohnung();
                    Boolean copyAbgeschlosseneWohnung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "abgeschlosseneWohnung", sourceAbgeschlosseneWohnung), sourceAbgeschlosseneWohnung, (this.abgeschlosseneWohnung!= null)));
                    copy.setAbgeschlosseneWohnung(copyAbgeschlosseneWohnung);
                } else {
                    if (abgeschlosseneWohnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abgeschlosseneWohnung = null;
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
                Boolean anzahlTageUnbewohntShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlTageUnbewohnt!= null));
                if (anzahlTageUnbewohntShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlTageUnbewohnt;
                    sourceAnzahlTageUnbewohnt = this.getAnzahlTageUnbewohnt();
                    Integer copyAnzahlTageUnbewohnt = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlTageUnbewohnt", sourceAnzahlTageUnbewohnt), sourceAnzahlTageUnbewohnt, (this.anzahlTageUnbewohnt!= null)));
                    copy.setAnzahlTageUnbewohnt(copyAnzahlTageUnbewohnt);
                } else {
                    if (anzahlTageUnbewohntShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlTageUnbewohnt = null;
                    }
                }
            }
            {
                Boolean besondereGefaehrdungNachbarschaftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.besondereGefaehrdungNachbarschaft!= null));
                if (besondereGefaehrdungNachbarschaftShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBesondereGefaehrdungNachbarschaft;
                    sourceBesondereGefaehrdungNachbarschaft = this.isBesondereGefaehrdungNachbarschaft();
                    Boolean copyBesondereGefaehrdungNachbarschaft = ((Boolean) strategy.copy(LocatorUtils.property(locator, "besondereGefaehrdungNachbarschaft", sourceBesondereGefaehrdungNachbarschaft), sourceBesondereGefaehrdungNachbarschaft, (this.besondereGefaehrdungNachbarschaft!= null)));
                    copy.setBesondereGefaehrdungNachbarschaft(copyBesondereGefaehrdungNachbarschaft);
                } else {
                    if (besondereGefaehrdungNachbarschaftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.besondereGefaehrdungNachbarschaft = null;
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
                Boolean safeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.safe!= null)&&(!this.safe.isEmpty())));
                if (safeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTAufbewahrungsart> sourceSafe;
                    sourceSafe = (((this.safe!= null)&&(!this.safe.isEmpty()))?this.getSafe():null);
                    @SuppressWarnings("unchecked")
                    List<CTAufbewahrungsart> copySafe = ((List<CTAufbewahrungsart> ) strategy.copy(LocatorUtils.property(locator, "safe", sourceSafe), sourceSafe, ((this.safe!= null)&&(!this.safe.isEmpty()))));
                    copy.safe = null;
                    if (copySafe!= null) {
                        List<CTAufbewahrungsart> uniqueSafel = copy.getSafe();
                        uniqueSafel.addAll(copySafe);
                    }
                } else {
                    if (safeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.safe = null;
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
                Boolean unterStrassenNiveauShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unterStrassenNiveau!= null));
                if (unterStrassenNiveauShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceUnterStrassenNiveau;
                    sourceUnterStrassenNiveau = this.isUnterStrassenNiveau();
                    Boolean copyUnterStrassenNiveau = ((Boolean) strategy.copy(LocatorUtils.property(locator, "unterStrassenNiveau", sourceUnterStrassenNiveau), sourceUnterStrassenNiveau, (this.unterStrassenNiveau!= null)));
                    copy.setUnterStrassenNiveau(copyUnterStrassenNiveau);
                } else {
                    if (unterStrassenNiveauShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unterStrassenNiveau = null;
                    }
                }
            }
            {
                Boolean etageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.etage!= null));
                if (etageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceEtage;
                    sourceEtage = this.getEtage();
                    Integer copyEtage = ((Integer) strategy.copy(LocatorUtils.property(locator, "etage", sourceEtage), sourceEtage, (this.etage!= null)));
                    copy.setEtage(copyEtage);
                } else {
                    if (etageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.etage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTHausratEinflussfaktoren();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withRisikokennziffer(STRisikokennzifferHausrat value) {
        setRisikokennziffer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withWohnflaeche(Integer value) {
        setWohnflaeche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withLageDerWohnung(STLageDerWohnung value) {
        setLageDerWohnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withAbgeschlosseneWohnung(Boolean value) {
        setAbgeschlosseneWohnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withNutzung(STNutzung value) {
        setNutzung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withAnzahlTageUnbewohnt(Integer value) {
        setAnzahlTageUnbewohnt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withBesondereGefaehrdungNachbarschaft(Boolean value) {
        setBesondereGefaehrdungNachbarschaft(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withVorschaden(CTVorschaden... values) {
        if (values!= null) {
            for (CTVorschaden value: values) {
                getVorschaden().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withVorschaden(Collection<CTVorschaden> values) {
        if (values!= null) {
            getVorschaden().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withSafe(CTAufbewahrungsart... values) {
        if (values!= null) {
            for (CTAufbewahrungsart value: values) {
                getSafe().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withSafe(Collection<CTAufbewahrungsart> values) {
        if (values!= null) {
            getSafe().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withSicherung(CTSicherung... values) {
        if (values!= null) {
            for (CTSicherung value: values) {
                getSicherung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withSicherung(Collection<CTSicherung> values) {
        if (values!= null) {
            getSicherung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withFragenkomplex(CTFragenkomplex... values) {
        if (values!= null) {
            for (CTFragenkomplex value: values) {
                getFragenkomplex().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withFragenkomplex(Collection<CTFragenkomplex> values) {
        if (values!= null) {
            getFragenkomplex().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withUnterStrassenNiveau(Boolean value) {
        setUnterStrassenNiveau(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withEtage(Integer value) {
        setEtage(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausratEinflussfaktoren withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
