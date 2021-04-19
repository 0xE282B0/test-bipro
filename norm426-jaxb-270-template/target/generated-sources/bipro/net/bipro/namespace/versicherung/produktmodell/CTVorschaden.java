
package net.bipro.namespace.versicherung.produktmodell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBetrag;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEDeckung;
import net.bipro.namespace.datentypen.STEGefahr;
import net.bipro.namespace.datentypen.STSparte;
import net.bipro.namespace.fragen.CTFragenkomplex;
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
 * <p>Java class for CT_Vorschaden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Vorschaden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vorschaden" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlVorschaeden" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Sparte" type="{http://www.bipro.net/namespace/datentypen}ST_Sparte" minOccurs="0"/&gt;
 *         &lt;element name="Schadenursache" type="{http://www.bipro.net/namespace/datentypen}ST_Schadenursache" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Schadendatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Beschreibung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="VorschadenNachbarschaft" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="DeckungID" type="{http://www.bipro.net/namespace/datentypen}STE_Deckung" minOccurs="0"/&gt;
 *         &lt;element name="Gefahr" type="{http://www.bipro.net/namespace/datentypen}STE_Gefahr" minOccurs="0"/&gt;
 *         &lt;element name="Fragenkomplex" type="{http://www.bipro.net/namespace/fragen}CT_Fragenkomplex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Schadenhoehe" type="{http://www.bipro.net/namespace/allgemein}CT_Betrag" minOccurs="0"/&gt;
 *         &lt;element name="VersichertDurch" type="{http://www.bipro.net/namespace/vertrag}CT_VorNebenVertrag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Vorschaden", propOrder = {
    "vorschaden",
    "anzahlVorschaeden",
    "sparte",
    "schadenursache",
    "schadendatum",
    "beschreibung",
    "vorschadenNachbarschaft",
    "deckungID",
    "gefahr",
    "fragenkomplex",
    "schadenhoehe",
    "versichertDurch"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVorschaden
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Vorschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean vorschaden;
    @XmlElement(name = "AnzahlVorschaeden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlVorschaeden;
    @XmlElement(name = "Sparte")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STSparte sparte;
    @XmlElement(name = "Schadenursache")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<String> schadenursache;
    @XmlElement(name = "Schadendatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String schadendatum;
    @XmlElement(name = "Beschreibung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String beschreibung;
    @XmlElement(name = "VorschadenNachbarschaft")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean vorschadenNachbarschaft;
    @XmlElement(name = "DeckungID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEDeckung deckungID;
    @XmlElement(name = "Gefahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEGefahr gefahr;
    @XmlElement(name = "Fragenkomplex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTFragenkomplex> fragenkomplex;
    @XmlElement(name = "Schadenhoehe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBetrag schadenhoehe;
    @XmlElement(name = "VersichertDurch")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVorNebenVertrag versichertDurch;

    /**
     * Gets the value of the vorschaden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isVorschaden() {
        return vorschaden;
    }

    /**
     * Sets the value of the vorschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVorschaden(Boolean value) {
        this.vorschaden = value;
    }

    /**
     * Gets the value of the anzahlVorschaeden property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlVorschaeden() {
        return anzahlVorschaeden;
    }

    /**
     * Sets the value of the anzahlVorschaeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlVorschaeden(Integer value) {
        this.anzahlVorschaeden = value;
    }

    /**
     * Gets the value of the sparte property.
     * 
     * @return
     *     possible object is
     *     {@link STSparte }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STSparte getSparte() {
        return sparte;
    }

    /**
     * Sets the value of the sparte property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSparte }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSparte(STSparte value) {
        this.sparte = value;
    }

    /**
     * Gets the value of the schadenursache property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schadenursache property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchadenursache().add(newItem);
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
    public List<String> getSchadenursache() {
        if (schadenursache == null) {
            schadenursache = new ArrayList<String>();
        }
        return this.schadenursache;
    }

    /**
     * Gets the value of the schadendatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSchadendatum() {
        return schadendatum;
    }

    /**
     * Sets the value of the schadendatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSchadendatum(String value) {
        this.schadendatum = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the vorschadenNachbarschaft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isVorschadenNachbarschaft() {
        return vorschadenNachbarschaft;
    }

    /**
     * Sets the value of the vorschadenNachbarschaft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVorschadenNachbarschaft(Boolean value) {
        this.vorschadenNachbarschaft = value;
    }

    /**
     * Gets the value of the deckungID property.
     * 
     * @return
     *     possible object is
     *     {@link STEDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEDeckung getDeckungID() {
        return deckungID;
    }

    /**
     * Sets the value of the deckungID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDeckungID(STEDeckung value) {
        this.deckungID = value;
    }

    /**
     * Gets the value of the gefahr property.
     * 
     * @return
     *     possible object is
     *     {@link STEGefahr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEGefahr getGefahr() {
        return gefahr;
    }

    /**
     * Sets the value of the gefahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGefahr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGefahr(STEGefahr value) {
        this.gefahr = value;
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
     * Gets the value of the schadenhoehe property.
     * 
     * @return
     *     possible object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetrag getSchadenhoehe() {
        return schadenhoehe;
    }

    /**
     * Sets the value of the schadenhoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSchadenhoehe(CTBetrag value) {
        this.schadenhoehe = value;
    }

    /**
     * Gets the value of the versichertDurch property.
     * 
     * @return
     *     possible object is
     *     {@link CTVorNebenVertrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag getVersichertDurch() {
        return versichertDurch;
    }

    /**
     * Sets the value of the versichertDurch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVorNebenVertrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersichertDurch(CTVorNebenVertrag value) {
        this.versichertDurch = value;
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
        final CTVorschaden that = ((CTVorschaden) object);
        {
            Boolean lhsVorschaden;
            lhsVorschaden = this.isVorschaden();
            Boolean rhsVorschaden;
            rhsVorschaden = that.isVorschaden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorschaden", lhsVorschaden), LocatorUtils.property(thatLocator, "vorschaden", rhsVorschaden), lhsVorschaden, rhsVorschaden, (this.vorschaden!= null), (that.vorschaden!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlVorschaeden;
            lhsAnzahlVorschaeden = this.getAnzahlVorschaeden();
            Integer rhsAnzahlVorschaeden;
            rhsAnzahlVorschaeden = that.getAnzahlVorschaeden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlVorschaeden", lhsAnzahlVorschaeden), LocatorUtils.property(thatLocator, "anzahlVorschaeden", rhsAnzahlVorschaeden), lhsAnzahlVorschaeden, rhsAnzahlVorschaeden, (this.anzahlVorschaeden!= null), (that.anzahlVorschaeden!= null))) {
                return false;
            }
        }
        {
            STSparte lhsSparte;
            lhsSparte = this.getSparte();
            STSparte rhsSparte;
            rhsSparte = that.getSparte();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sparte", lhsSparte), LocatorUtils.property(thatLocator, "sparte", rhsSparte), lhsSparte, rhsSparte, (this.sparte!= null), (that.sparte!= null))) {
                return false;
            }
        }
        {
            List<String> lhsSchadenursache;
            lhsSchadenursache = (((this.schadenursache!= null)&&(!this.schadenursache.isEmpty()))?this.getSchadenursache():null);
            List<String> rhsSchadenursache;
            rhsSchadenursache = (((that.schadenursache!= null)&&(!that.schadenursache.isEmpty()))?that.getSchadenursache():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schadenursache", lhsSchadenursache), LocatorUtils.property(thatLocator, "schadenursache", rhsSchadenursache), lhsSchadenursache, rhsSchadenursache, ((this.schadenursache!= null)&&(!this.schadenursache.isEmpty())), ((that.schadenursache!= null)&&(!that.schadenursache.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSchadendatum;
            lhsSchadendatum = this.getSchadendatum();
            String rhsSchadendatum;
            rhsSchadendatum = that.getSchadendatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schadendatum", lhsSchadendatum), LocatorUtils.property(thatLocator, "schadendatum", rhsSchadendatum), lhsSchadendatum, rhsSchadendatum, (this.schadendatum!= null), (that.schadendatum!= null))) {
                return false;
            }
        }
        {
            String lhsBeschreibung;
            lhsBeschreibung = this.getBeschreibung();
            String rhsBeschreibung;
            rhsBeschreibung = that.getBeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beschreibung", lhsBeschreibung), LocatorUtils.property(thatLocator, "beschreibung", rhsBeschreibung), lhsBeschreibung, rhsBeschreibung, (this.beschreibung!= null), (that.beschreibung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVorschadenNachbarschaft;
            lhsVorschadenNachbarschaft = this.isVorschadenNachbarschaft();
            Boolean rhsVorschadenNachbarschaft;
            rhsVorschadenNachbarschaft = that.isVorschadenNachbarschaft();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorschadenNachbarschaft", lhsVorschadenNachbarschaft), LocatorUtils.property(thatLocator, "vorschadenNachbarschaft", rhsVorschadenNachbarschaft), lhsVorschadenNachbarschaft, rhsVorschadenNachbarschaft, (this.vorschadenNachbarschaft!= null), (that.vorschadenNachbarschaft!= null))) {
                return false;
            }
        }
        {
            STEDeckung lhsDeckungID;
            lhsDeckungID = this.getDeckungID();
            STEDeckung rhsDeckungID;
            rhsDeckungID = that.getDeckungID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deckungID", lhsDeckungID), LocatorUtils.property(thatLocator, "deckungID", rhsDeckungID), lhsDeckungID, rhsDeckungID, (this.deckungID!= null), (that.deckungID!= null))) {
                return false;
            }
        }
        {
            STEGefahr lhsGefahr;
            lhsGefahr = this.getGefahr();
            STEGefahr rhsGefahr;
            rhsGefahr = that.getGefahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahr", lhsGefahr), LocatorUtils.property(thatLocator, "gefahr", rhsGefahr), lhsGefahr, rhsGefahr, (this.gefahr!= null), (that.gefahr!= null))) {
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
            CTBetrag lhsSchadenhoehe;
            lhsSchadenhoehe = this.getSchadenhoehe();
            CTBetrag rhsSchadenhoehe;
            rhsSchadenhoehe = that.getSchadenhoehe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schadenhoehe", lhsSchadenhoehe), LocatorUtils.property(thatLocator, "schadenhoehe", rhsSchadenhoehe), lhsSchadenhoehe, rhsSchadenhoehe, (this.schadenhoehe!= null), (that.schadenhoehe!= null))) {
                return false;
            }
        }
        {
            CTVorNebenVertrag lhsVersichertDurch;
            lhsVersichertDurch = this.getVersichertDurch();
            CTVorNebenVertrag rhsVersichertDurch;
            rhsVersichertDurch = that.getVersichertDurch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertDurch", lhsVersichertDurch), LocatorUtils.property(thatLocator, "versichertDurch", rhsVersichertDurch), lhsVersichertDurch, rhsVersichertDurch, (this.versichertDurch!= null), (that.versichertDurch!= null))) {
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
            Boolean theVorschaden;
            theVorschaden = this.isVorschaden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorschaden", theVorschaden), currentHashCode, theVorschaden, (this.vorschaden!= null));
        }
        {
            Integer theAnzahlVorschaeden;
            theAnzahlVorschaeden = this.getAnzahlVorschaeden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlVorschaeden", theAnzahlVorschaeden), currentHashCode, theAnzahlVorschaeden, (this.anzahlVorschaeden!= null));
        }
        {
            STSparte theSparte;
            theSparte = this.getSparte();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sparte", theSparte), currentHashCode, theSparte, (this.sparte!= null));
        }
        {
            List<String> theSchadenursache;
            theSchadenursache = (((this.schadenursache!= null)&&(!this.schadenursache.isEmpty()))?this.getSchadenursache():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schadenursache", theSchadenursache), currentHashCode, theSchadenursache, ((this.schadenursache!= null)&&(!this.schadenursache.isEmpty())));
        }
        {
            String theSchadendatum;
            theSchadendatum = this.getSchadendatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schadendatum", theSchadendatum), currentHashCode, theSchadendatum, (this.schadendatum!= null));
        }
        {
            String theBeschreibung;
            theBeschreibung = this.getBeschreibung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beschreibung", theBeschreibung), currentHashCode, theBeschreibung, (this.beschreibung!= null));
        }
        {
            Boolean theVorschadenNachbarschaft;
            theVorschadenNachbarschaft = this.isVorschadenNachbarschaft();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorschadenNachbarschaft", theVorschadenNachbarschaft), currentHashCode, theVorschadenNachbarschaft, (this.vorschadenNachbarschaft!= null));
        }
        {
            STEDeckung theDeckungID;
            theDeckungID = this.getDeckungID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deckungID", theDeckungID), currentHashCode, theDeckungID, (this.deckungID!= null));
        }
        {
            STEGefahr theGefahr;
            theGefahr = this.getGefahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahr", theGefahr), currentHashCode, theGefahr, (this.gefahr!= null));
        }
        {
            List<CTFragenkomplex> theFragenkomplex;
            theFragenkomplex = (((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty()))?this.getFragenkomplex():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fragenkomplex", theFragenkomplex), currentHashCode, theFragenkomplex, ((this.fragenkomplex!= null)&&(!this.fragenkomplex.isEmpty())));
        }
        {
            CTBetrag theSchadenhoehe;
            theSchadenhoehe = this.getSchadenhoehe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schadenhoehe", theSchadenhoehe), currentHashCode, theSchadenhoehe, (this.schadenhoehe!= null));
        }
        {
            CTVorNebenVertrag theVersichertDurch;
            theVersichertDurch = this.getVersichertDurch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertDurch", theVersichertDurch), currentHashCode, theVersichertDurch, (this.versichertDurch!= null));
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
        if (draftCopy instanceof CTVorschaden) {
            final CTVorschaden copy = ((CTVorschaden) draftCopy);
            {
                Boolean vorschadenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorschaden!= null));
                if (vorschadenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVorschaden;
                    sourceVorschaden = this.isVorschaden();
                    Boolean copyVorschaden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vorschaden", sourceVorschaden), sourceVorschaden, (this.vorschaden!= null)));
                    copy.setVorschaden(copyVorschaden);
                } else {
                    if (vorschadenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorschaden = null;
                    }
                }
            }
            {
                Boolean anzahlVorschaedenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlVorschaeden!= null));
                if (anzahlVorschaedenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlVorschaeden;
                    sourceAnzahlVorschaeden = this.getAnzahlVorschaeden();
                    Integer copyAnzahlVorschaeden = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlVorschaeden", sourceAnzahlVorschaeden), sourceAnzahlVorschaeden, (this.anzahlVorschaeden!= null)));
                    copy.setAnzahlVorschaeden(copyAnzahlVorschaeden);
                } else {
                    if (anzahlVorschaedenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlVorschaeden = null;
                    }
                }
            }
            {
                Boolean sparteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sparte!= null));
                if (sparteShouldBeCopiedAndSet == Boolean.TRUE) {
                    STSparte sourceSparte;
                    sourceSparte = this.getSparte();
                    STSparte copySparte = ((STSparte) strategy.copy(LocatorUtils.property(locator, "sparte", sourceSparte), sourceSparte, (this.sparte!= null)));
                    copy.setSparte(copySparte);
                } else {
                    if (sparteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sparte = null;
                    }
                }
            }
            {
                Boolean schadenursacheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.schadenursache!= null)&&(!this.schadenursache.isEmpty())));
                if (schadenursacheShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceSchadenursache;
                    sourceSchadenursache = (((this.schadenursache!= null)&&(!this.schadenursache.isEmpty()))?this.getSchadenursache():null);
                    @SuppressWarnings("unchecked")
                    List<String> copySchadenursache = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "schadenursache", sourceSchadenursache), sourceSchadenursache, ((this.schadenursache!= null)&&(!this.schadenursache.isEmpty()))));
                    copy.schadenursache = null;
                    if (copySchadenursache!= null) {
                        List<String> uniqueSchadenursachel = copy.getSchadenursache();
                        uniqueSchadenursachel.addAll(copySchadenursache);
                    }
                } else {
                    if (schadenursacheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schadenursache = null;
                    }
                }
            }
            {
                Boolean schadendatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schadendatum!= null));
                if (schadendatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSchadendatum;
                    sourceSchadendatum = this.getSchadendatum();
                    String copySchadendatum = ((String) strategy.copy(LocatorUtils.property(locator, "schadendatum", sourceSchadendatum), sourceSchadendatum, (this.schadendatum!= null)));
                    copy.setSchadendatum(copySchadendatum);
                } else {
                    if (schadendatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schadendatum = null;
                    }
                }
            }
            {
                Boolean beschreibungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beschreibung!= null));
                if (beschreibungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBeschreibung;
                    sourceBeschreibung = this.getBeschreibung();
                    String copyBeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "beschreibung", sourceBeschreibung), sourceBeschreibung, (this.beschreibung!= null)));
                    copy.setBeschreibung(copyBeschreibung);
                } else {
                    if (beschreibungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beschreibung = null;
                    }
                }
            }
            {
                Boolean vorschadenNachbarschaftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorschadenNachbarschaft!= null));
                if (vorschadenNachbarschaftShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVorschadenNachbarschaft;
                    sourceVorschadenNachbarschaft = this.isVorschadenNachbarschaft();
                    Boolean copyVorschadenNachbarschaft = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vorschadenNachbarschaft", sourceVorschadenNachbarschaft), sourceVorschadenNachbarschaft, (this.vorschadenNachbarschaft!= null)));
                    copy.setVorschadenNachbarschaft(copyVorschadenNachbarschaft);
                } else {
                    if (vorschadenNachbarschaftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorschadenNachbarschaft = null;
                    }
                }
            }
            {
                Boolean deckungIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.deckungID!= null));
                if (deckungIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEDeckung sourceDeckungID;
                    sourceDeckungID = this.getDeckungID();
                    STEDeckung copyDeckungID = ((STEDeckung) strategy.copy(LocatorUtils.property(locator, "deckungID", sourceDeckungID), sourceDeckungID, (this.deckungID!= null)));
                    copy.setDeckungID(copyDeckungID);
                } else {
                    if (deckungIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.deckungID = null;
                    }
                }
            }
            {
                Boolean gefahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gefahr!= null));
                if (gefahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGefahr sourceGefahr;
                    sourceGefahr = this.getGefahr();
                    STEGefahr copyGefahr = ((STEGefahr) strategy.copy(LocatorUtils.property(locator, "gefahr", sourceGefahr), sourceGefahr, (this.gefahr!= null)));
                    copy.setGefahr(copyGefahr);
                } else {
                    if (gefahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahr = null;
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
                Boolean schadenhoeheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schadenhoehe!= null));
                if (schadenhoeheShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBetrag sourceSchadenhoehe;
                    sourceSchadenhoehe = this.getSchadenhoehe();
                    CTBetrag copySchadenhoehe = ((CTBetrag) strategy.copy(LocatorUtils.property(locator, "schadenhoehe", sourceSchadenhoehe), sourceSchadenhoehe, (this.schadenhoehe!= null)));
                    copy.setSchadenhoehe(copySchadenhoehe);
                } else {
                    if (schadenhoeheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schadenhoehe = null;
                    }
                }
            }
            {
                Boolean versichertDurchShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versichertDurch!= null));
                if (versichertDurchShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVorNebenVertrag sourceVersichertDurch;
                    sourceVersichertDurch = this.getVersichertDurch();
                    CTVorNebenVertrag copyVersichertDurch = ((CTVorNebenVertrag) strategy.copy(LocatorUtils.property(locator, "versichertDurch", sourceVersichertDurch), sourceVersichertDurch, (this.versichertDurch!= null)));
                    copy.setVersichertDurch(copyVersichertDurch);
                } else {
                    if (versichertDurchShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertDurch = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVorschaden();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withVorschaden(Boolean value) {
        setVorschaden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withAnzahlVorschaeden(Integer value) {
        setAnzahlVorschaeden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withSparte(STSparte value) {
        setSparte(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withSchadenursache(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSchadenursache().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withSchadenursache(Collection<String> values) {
        if (values!= null) {
            getSchadenursache().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withSchadendatum(String value) {
        setSchadendatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withVorschadenNachbarschaft(Boolean value) {
        setVorschadenNachbarschaft(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withDeckungID(STEDeckung value) {
        setDeckungID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withGefahr(STEGefahr value) {
        setGefahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withFragenkomplex(CTFragenkomplex... values) {
        if (values!= null) {
            for (CTFragenkomplex value: values) {
                getFragenkomplex().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withFragenkomplex(Collection<CTFragenkomplex> values) {
        if (values!= null) {
            getFragenkomplex().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withSchadenhoehe(CTBetrag value) {
        setSchadenhoehe(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withVersichertDurch(CTVorNebenVertrag value) {
        setVersichertDurch(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorschaden withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
