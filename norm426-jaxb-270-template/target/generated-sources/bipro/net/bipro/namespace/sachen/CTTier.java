
package net.bipro.namespace.sachen;

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
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STTierGeschlecht;
import net.bipro.namespace.datentypen.STTierNutzungsart;
import net.bipro.namespace.datentypen.STTierart;
import net.bipro.namespace.datentypen.STTiersteuer;
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
 * <p>Java class for CT_Tier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Tier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Tierart" minOccurs="0"/&gt;
 *         &lt;element name="Rasse" type="{http://www.bipro.net/namespace/datentypen}ST_Text080" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Hunderasse" type="{http://www.bipro.net/namespace/datentypen}ST_Hunderasse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Registriernummer" type="{http://www.bipro.net/namespace/datentypen}ST_TierRegistriernummer" minOccurs="0"/&gt;
 *         &lt;element name="Geburtsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Geschlecht" type="{http://www.bipro.net/namespace/datentypen}ST_TierGeschlecht" minOccurs="0"/&gt;
 *         &lt;element name="Farbe" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Nutzungsart" type="{http://www.bipro.net/namespace/datentypen}ST_TierNutzungsart" minOccurs="0"/&gt;
 *         &lt;element name="Steuerpflicht" type="{http://www.bipro.net/namespace/datentypen}ST_Tiersteuer" minOccurs="0"/&gt;
 *         &lt;element name="Kampfhund" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Tier", propOrder = {
    "artID",
    "rasse", //race
    "hunderasse", //dog breed
    "name",
    "registriernummer",
    "geburtsdatum", //date of birth
    "geschlecht", //gender
    "farbe", //color
    "nutzungsart", //type of use
    "steuerpflicht", //Tax liability
    "kampfhund"  //FightBreed
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTTier
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STTierart artID;
    @XmlElement(name = "Rasse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<String> rasse;
    @XmlElementRef(name = "Hunderasse", namespace = "http://www.bipro.net/namespace/sachen", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<JAXBElement<List<String>>> hunderasse;
    @XmlElement(name = "Name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String name;
    @XmlElement(name = "Registriernummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String registriernummer;
    @XmlElement(name = "Geburtsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String geburtsdatum;
    @XmlElement(name = "Geschlecht")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STTierGeschlecht geschlecht; //AnimalGender
    @XmlElement(name = "Farbe") 
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String farbe;
    @XmlElement(name = "Nutzungsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STTierNutzungsart nutzungsart;
    @XmlElement(name = "Steuerpflicht")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STTiersteuer steuerpflicht;
    @XmlElement(name = "Kampfhund")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean kampfhund;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STTierart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STTierart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTierart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STTierart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the rasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRasse().add(newItem);
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
    public List<String> getRasse() {
        if (rasse == null) {
            rasse = new ArrayList<String>();
        }
        return this.rasse;
    }

    /**
     * Gets the value of the hunderasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hunderasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHunderasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<JAXBElement<List<String>>> getHunderasse() {
        if (hunderasse == null) {
            hunderasse = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.hunderasse;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the registriernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getRegistriernummer() {
        return registriernummer;
    }

    /**
     * Sets the value of the registriernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setRegistriernummer(String value) {
        this.registriernummer = value;
    }

    /**
     * Gets the value of the geburtsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     * Sets the value of the geburtsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeburtsdatum(String value) {
        this.geburtsdatum = value;
    }

    /**
     * Gets the value of the geschlecht property.
     * 
     * @return
     *     possible object is
     *     {@link STTierGeschlecht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STTierGeschlecht getGeschlecht() {
        return geschlecht;
    }

    /**
     * Sets the value of the geschlecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTierGeschlecht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeschlecht(STTierGeschlecht value) {
        this.geschlecht = value;
    }

    /**
     * Gets the value of the farbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFarbe() {
        return farbe;
    }

    /**
     * Sets the value of the farbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFarbe(String value) {
        this.farbe = value;
    }

    /**
     * Gets the value of the nutzungsart property.
     * 
     * @return
     *     possible object is
     *     {@link STTierNutzungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STTierNutzungsart getNutzungsart() {
        return nutzungsart;
    }

    /**
     * Sets the value of the nutzungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTierNutzungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNutzungsart(STTierNutzungsart value) {
        this.nutzungsart = value;
    }

    /**
     * Gets the value of the steuerpflicht property.
     * 
     * @return
     *     possible object is
     *     {@link STTiersteuer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STTiersteuer getSteuerpflicht() {
        return steuerpflicht;
    }

    /**
     * Sets the value of the steuerpflicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTiersteuer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSteuerpflicht(STTiersteuer value) {
        this.steuerpflicht = value;
    }

    /**
     * Gets the value of the kampfhund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isKampfhund() {
        return kampfhund;
    }

    /**
     * Sets the value of the kampfhund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKampfhund(Boolean value) {
        this.kampfhund = value;
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
        final CTTier that = ((CTTier) object);
        {
            STTierart lhsArtID;
            lhsArtID = this.getArtID();
            STTierart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            List<String> lhsRasse;
            lhsRasse = (((this.rasse!= null)&&(!this.rasse.isEmpty()))?this.getRasse():null);
            List<String> rhsRasse;
            rhsRasse = (((that.rasse!= null)&&(!that.rasse.isEmpty()))?that.getRasse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rasse", lhsRasse), LocatorUtils.property(thatLocator, "rasse", rhsRasse), lhsRasse, rhsRasse, ((this.rasse!= null)&&(!this.rasse.isEmpty())), ((that.rasse!= null)&&(!that.rasse.isEmpty())))) {
                return false;
            }
        }
        {
            List<JAXBElement<List<String>>> lhsHunderasse;
            lhsHunderasse = (((this.hunderasse!= null)&&(!this.hunderasse.isEmpty()))?this.getHunderasse():null);
            List<JAXBElement<List<String>>> rhsHunderasse;
            rhsHunderasse = (((that.hunderasse!= null)&&(!that.hunderasse.isEmpty()))?that.getHunderasse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hunderasse", lhsHunderasse), LocatorUtils.property(thatLocator, "hunderasse", rhsHunderasse), lhsHunderasse, rhsHunderasse, ((this.hunderasse!= null)&&(!this.hunderasse.isEmpty())), ((that.hunderasse!= null)&&(!that.hunderasse.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsRegistriernummer;
            lhsRegistriernummer = this.getRegistriernummer();
            String rhsRegistriernummer;
            rhsRegistriernummer = that.getRegistriernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registriernummer", lhsRegistriernummer), LocatorUtils.property(thatLocator, "registriernummer", rhsRegistriernummer), lhsRegistriernummer, rhsRegistriernummer, (this.registriernummer!= null), (that.registriernummer!= null))) {
                return false;
            }
        }
        {
            String lhsGeburtsdatum;
            lhsGeburtsdatum = this.getGeburtsdatum();
            String rhsGeburtsdatum;
            rhsGeburtsdatum = that.getGeburtsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geburtsdatum", lhsGeburtsdatum), LocatorUtils.property(thatLocator, "geburtsdatum", rhsGeburtsdatum), lhsGeburtsdatum, rhsGeburtsdatum, (this.geburtsdatum!= null), (that.geburtsdatum!= null))) {
                return false;
            }
        }
        {
            STTierGeschlecht lhsGeschlecht;
            lhsGeschlecht = this.getGeschlecht();
            STTierGeschlecht rhsGeschlecht;
            rhsGeschlecht = that.getGeschlecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschlecht", lhsGeschlecht), LocatorUtils.property(thatLocator, "geschlecht", rhsGeschlecht), lhsGeschlecht, rhsGeschlecht, (this.geschlecht!= null), (that.geschlecht!= null))) {
                return false;
            }
        }
        {
            String lhsFarbe;
            lhsFarbe = this.getFarbe();
            String rhsFarbe;
            rhsFarbe = that.getFarbe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "farbe", lhsFarbe), LocatorUtils.property(thatLocator, "farbe", rhsFarbe), lhsFarbe, rhsFarbe, (this.farbe!= null), (that.farbe!= null))) {
                return false;
            }
        }
        {
            STTierNutzungsart lhsNutzungsart;
            lhsNutzungsart = this.getNutzungsart();
            STTierNutzungsart rhsNutzungsart;
            rhsNutzungsart = that.getNutzungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nutzungsart", lhsNutzungsart), LocatorUtils.property(thatLocator, "nutzungsart", rhsNutzungsart), lhsNutzungsart, rhsNutzungsart, (this.nutzungsart!= null), (that.nutzungsart!= null))) {
                return false;
            }
        }
        {
            STTiersteuer lhsSteuerpflicht;
            lhsSteuerpflicht = this.getSteuerpflicht();
            STTiersteuer rhsSteuerpflicht;
            rhsSteuerpflicht = that.getSteuerpflicht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steuerpflicht", lhsSteuerpflicht), LocatorUtils.property(thatLocator, "steuerpflicht", rhsSteuerpflicht), lhsSteuerpflicht, rhsSteuerpflicht, (this.steuerpflicht!= null), (that.steuerpflicht!= null))) {
                return false;
            }
        }
        {
            Boolean lhsKampfhund;
            lhsKampfhund = this.isKampfhund();
            Boolean rhsKampfhund;
            rhsKampfhund = that.isKampfhund();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kampfhund", lhsKampfhund), LocatorUtils.property(thatLocator, "kampfhund", rhsKampfhund), lhsKampfhund, rhsKampfhund, (this.kampfhund!= null), (that.kampfhund!= null))) {
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
            STTierart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            List<String> theRasse;
            theRasse = (((this.rasse!= null)&&(!this.rasse.isEmpty()))?this.getRasse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rasse", theRasse), currentHashCode, theRasse, ((this.rasse!= null)&&(!this.rasse.isEmpty())));
        }
        {
            List<JAXBElement<List<String>>> theHunderasse;
            theHunderasse = (((this.hunderasse!= null)&&(!this.hunderasse.isEmpty()))?this.getHunderasse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hunderasse", theHunderasse), currentHashCode, theHunderasse, ((this.hunderasse!= null)&&(!this.hunderasse.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theRegistriernummer;
            theRegistriernummer = this.getRegistriernummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registriernummer", theRegistriernummer), currentHashCode, theRegistriernummer, (this.registriernummer!= null));
        }
        {
            String theGeburtsdatum;
            theGeburtsdatum = this.getGeburtsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geburtsdatum", theGeburtsdatum), currentHashCode, theGeburtsdatum, (this.geburtsdatum!= null));
        }
        {
            STTierGeschlecht theGeschlecht;
            theGeschlecht = this.getGeschlecht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geschlecht", theGeschlecht), currentHashCode, theGeschlecht, (this.geschlecht!= null));
        }
        {
            String theFarbe;
            theFarbe = this.getFarbe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "farbe", theFarbe), currentHashCode, theFarbe, (this.farbe!= null));
        }
        {
            STTierNutzungsart theNutzungsart;
            theNutzungsart = this.getNutzungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nutzungsart", theNutzungsart), currentHashCode, theNutzungsart, (this.nutzungsart!= null));
        }
        {
            STTiersteuer theSteuerpflicht;
            theSteuerpflicht = this.getSteuerpflicht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "steuerpflicht", theSteuerpflicht), currentHashCode, theSteuerpflicht, (this.steuerpflicht!= null));
        }
        {
            Boolean theKampfhund;
            theKampfhund = this.isKampfhund();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kampfhund", theKampfhund), currentHashCode, theKampfhund, (this.kampfhund!= null));
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
        if (draftCopy instanceof CTTier) {
            final CTTier copy = ((CTTier) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STTierart sourceArtID;
                    sourceArtID = this.getArtID();
                    STTierart copyArtID = ((STTierart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean rasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.rasse!= null)&&(!this.rasse.isEmpty())));
                if (rasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceRasse;
                    sourceRasse = (((this.rasse!= null)&&(!this.rasse.isEmpty()))?this.getRasse():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyRasse = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "rasse", sourceRasse), sourceRasse, ((this.rasse!= null)&&(!this.rasse.isEmpty()))));
                    copy.rasse = null;
                    if (copyRasse!= null) {
                        List<String> uniqueRassel = copy.getRasse();
                        uniqueRassel.addAll(copyRasse);
                    }
                } else {
                    if (rasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rasse = null;
                    }
                }
            }
            {
                Boolean hunderasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.hunderasse!= null)&&(!this.hunderasse.isEmpty())));
                if (hunderasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<JAXBElement<List<String>>> sourceHunderasse;
                    sourceHunderasse = (((this.hunderasse!= null)&&(!this.hunderasse.isEmpty()))?this.getHunderasse():null);
                    @SuppressWarnings("unchecked")
                    List<JAXBElement<List<String>>> copyHunderasse = ((List<JAXBElement<List<String>>> ) strategy.copy(LocatorUtils.property(locator, "hunderasse", sourceHunderasse), sourceHunderasse, ((this.hunderasse!= null)&&(!this.hunderasse.isEmpty()))));
                    copy.hunderasse = null;
                    if (copyHunderasse!= null) {
                        List<JAXBElement<List<String>>> uniqueHunderassel = copy.getHunderasse();
                        uniqueHunderassel.addAll(copyHunderasse);
                    }
                } else {
                    if (hunderasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hunderasse = null;
                    }
                }
            }
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean registriernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.registriernummer!= null));
                if (registriernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRegistriernummer;
                    sourceRegistriernummer = this.getRegistriernummer();
                    String copyRegistriernummer = ((String) strategy.copy(LocatorUtils.property(locator, "registriernummer", sourceRegistriernummer), sourceRegistriernummer, (this.registriernummer!= null)));
                    copy.setRegistriernummer(copyRegistriernummer);
                } else {
                    if (registriernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.registriernummer = null;
                    }
                }
            }
            {
                Boolean geburtsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geburtsdatum!= null));
                if (geburtsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeburtsdatum;
                    sourceGeburtsdatum = this.getGeburtsdatum();
                    String copyGeburtsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "geburtsdatum", sourceGeburtsdatum), sourceGeburtsdatum, (this.geburtsdatum!= null)));
                    copy.setGeburtsdatum(copyGeburtsdatum);
                } else {
                    if (geburtsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geburtsdatum = null;
                    }
                }
            }
            {
                Boolean geschlechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschlecht!= null));
                if (geschlechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    STTierGeschlecht sourceGeschlecht;
                    sourceGeschlecht = this.getGeschlecht();
                    STTierGeschlecht copyGeschlecht = ((STTierGeschlecht) strategy.copy(LocatorUtils.property(locator, "geschlecht", sourceGeschlecht), sourceGeschlecht, (this.geschlecht!= null)));
                    copy.setGeschlecht(copyGeschlecht);
                } else {
                    if (geschlechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschlecht = null;
                    }
                }
            }
            {
                Boolean farbeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.farbe!= null));
                if (farbeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFarbe;
                    sourceFarbe = this.getFarbe();
                    String copyFarbe = ((String) strategy.copy(LocatorUtils.property(locator, "farbe", sourceFarbe), sourceFarbe, (this.farbe!= null)));
                    copy.setFarbe(copyFarbe);
                } else {
                    if (farbeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.farbe = null;
                    }
                }
            }
            {
                Boolean nutzungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nutzungsart!= null));
                if (nutzungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STTierNutzungsart sourceNutzungsart;
                    sourceNutzungsart = this.getNutzungsart();
                    STTierNutzungsart copyNutzungsart = ((STTierNutzungsart) strategy.copy(LocatorUtils.property(locator, "nutzungsart", sourceNutzungsart), sourceNutzungsart, (this.nutzungsart!= null)));
                    copy.setNutzungsart(copyNutzungsart);
                } else {
                    if (nutzungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nutzungsart = null;
                    }
                }
            }
            {
                Boolean steuerpflichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.steuerpflicht!= null));
                if (steuerpflichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    STTiersteuer sourceSteuerpflicht;
                    sourceSteuerpflicht = this.getSteuerpflicht();
                    STTiersteuer copySteuerpflicht = ((STTiersteuer) strategy.copy(LocatorUtils.property(locator, "steuerpflicht", sourceSteuerpflicht), sourceSteuerpflicht, (this.steuerpflicht!= null)));
                    copy.setSteuerpflicht(copySteuerpflicht);
                } else {
                    if (steuerpflichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.steuerpflicht = null;
                    }
                }
            }
            {
                Boolean kampfhundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kampfhund!= null));
                if (kampfhundShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKampfhund;
                    sourceKampfhund = this.isKampfhund();
                    Boolean copyKampfhund = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kampfhund", sourceKampfhund), sourceKampfhund, (this.kampfhund!= null)));
                    copy.setKampfhund(copyKampfhund);
                } else {
                    if (kampfhundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kampfhund = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTTier();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withArtID(STTierart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withRasse(String... values) {
        if (values!= null) {
            for (String value: values) {
                getRasse().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withRasse(Collection<String> values) {
        if (values!= null) {
            getRasse().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withHunderasse(JAXBElement<List<String>> ... values) {
        if (values!= null) {
            for (JAXBElement<List<String>> value: values) {
                getHunderasse().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withHunderasse(Collection<JAXBElement<List<String>>> values) {
        if (values!= null) {
            getHunderasse().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withName(String value) {
        setName(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withRegistriernummer(String value) {
        setRegistriernummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withGeburtsdatum(String value) {
        setGeburtsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withGeschlecht(STTierGeschlecht value) {
        setGeschlecht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withFarbe(String value) {
        setFarbe(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withNutzungsart(STTierNutzungsart value) {
        setNutzungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withSteuerpflicht(STTiersteuer value) {
        setSteuerpflicht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withKampfhund(Boolean value) {
        setKampfhund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTTier withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
