
package net.bipro.namespace.versicherung.produktmodell.komposit;

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
import net.bipro.namespace.allgemein.CTStichtagsbetrag;
import net.bipro.namespace.allgemein.CTUnternehmen;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAbgangsgrund;
import net.bipro.namespace.datentypen.STBerechnungseinheit;
import net.bipro.namespace.datentypen.STEBedingungen;
import net.bipro.namespace.datentypen.STEDeckung;
import net.bipro.namespace.datentypen.STVertragsform;
import net.bipro.namespace.datentypen.STVertragsstatus;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTBeitragszahler;
import net.bipro.namespace.produktmodell.CTBeitrag;
import net.bipro.namespace.produktmodell.CTDynamik;
import net.bipro.namespace.produktmodell.CTKondition;
import net.bipro.namespace.produktmodell.CTZertifizierungsdaten;
import net.bipro.namespace.produktmodell.CTZusaetzlicheProduktbausteinDaten;
import net.bipro.namespace.versicherung.produktmodell.CTBezugsrecht;
import net.bipro.namespace.versicherung.produktmodell.CTElementarprodukt;
import net.bipro.namespace.versicherung.produktmodell.CTFondsPortfolio;
import net.bipro.namespace.versicherung.produktmodell.CTKlausel;
import net.bipro.namespace.versicherung.produktmodell.CTLeistungsausschluss;
import net.bipro.namespace.versicherung.produktmodell.CTSelbstbeteiligung;
import net.bipro.namespace.versicherung.produktmodell.CTVersicherungssummeOderLeistung;
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
 * <p>Java class for CT_Deckung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Deckung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Elementarprodukt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_Deckung"/&gt;
 *         &lt;element name="Unterversicherungsverzicht" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Beitragssatz" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Beitragssatzeinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Berechnungseinheit" minOccurs="0"/&gt;
 *         &lt;element name="Gefahr" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_Gefahr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VersichertesObjekt" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_VersichertesObjekt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VersichertePerson" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_VersichertePerson" minOccurs="0"/&gt;
 *         &lt;element name="VersichertesWagnis" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_VersichertesWagnis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Gefahrenzone" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_Gefahrenzone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Geltungsbereich" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="VersichertePersonengruppe" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_VersichertePersonengruppe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Deckung", propOrder = {
    "artID",
    "unterversicherungsverzicht",
    "beitragssatz",
    "beitragssatzeinheit",
    "gefahr",
    "versichertesObjekt",
    "versichertePerson",
    "versichertesWagnis",
    "gefahrenzone",
    "geltungsbereich",
    "versichertePersonengruppe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTDeckung
    extends CTElementarprodukt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEDeckung artID;
    @XmlElement(name = "Unterversicherungsverzicht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean unterversicherungsverzicht;
    @XmlElement(name = "Beitragssatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal beitragssatz;
    @XmlElement(name = "Beitragssatzeinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STBerechnungseinheit beitragssatzeinheit;
    @XmlElement(name = "Gefahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTGefahr> gefahr;
    @XmlElement(name = "VersichertesObjekt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVersichertesObjekt> versichertesObjekt;
    @XmlElement(name = "VersichertePerson")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVersichertePerson versichertePerson;
    @XmlElement(name = "VersichertesWagnis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVersichertesWagnis> versichertesWagnis;
    @XmlElement(name = "Gefahrenzone")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTGefahrenzone> gefahrenzone;
    @XmlElement(name = "Geltungsbereich")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String geltungsbereich;
    @XmlElement(name = "VersichertePersonengruppe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVersichertePersonengruppe versichertePersonengruppe;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STEDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEDeckung getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STEDeckung value) {
        this.artID = value;
    }

    /**
     * Gets the value of the unterversicherungsverzicht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isUnterversicherungsverzicht() {
        return unterversicherungsverzicht;
    }

    /**
     * Sets the value of the unterversicherungsverzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUnterversicherungsverzicht(Boolean value) {
        this.unterversicherungsverzicht = value;
    }

    /**
     * Gets the value of the beitragssatz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBeitragssatz() {
        return beitragssatz;
    }

    /**
     * Sets the value of the beitragssatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBeitragssatz(BigDecimal value) {
        this.beitragssatz = value;
    }

    /**
     * Gets the value of the beitragssatzeinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STBerechnungseinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STBerechnungseinheit getBeitragssatzeinheit() {
        return beitragssatzeinheit;
    }

    /**
     * Sets the value of the beitragssatzeinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBerechnungseinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBeitragssatzeinheit(STBerechnungseinheit value) {
        this.beitragssatzeinheit = value;
    }

    /**
     * Gets the value of the gefahr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gefahr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGefahr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTGefahr }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTGefahr> getGefahr() {
        if (gefahr == null) {
            gefahr = new ArrayList<CTGefahr>();
        }
        return this.gefahr;
    }

    /**
     * Gets the value of the versichertesObjekt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versichertesObjekt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersichertesObjekt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVersichertesObjekt }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVersichertesObjekt> getVersichertesObjekt() {
        if (versichertesObjekt == null) {
            versichertesObjekt = new ArrayList<CTVersichertesObjekt>();
        }
        return this.versichertesObjekt;
    }

    /**
     * Gets the value of the versichertePerson property.
     * 
     * @return
     *     possible object is
     *     {@link CTVersichertePerson }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePerson getVersichertePerson() {
        return versichertePerson;
    }

    /**
     * Sets the value of the versichertePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVersichertePerson }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersichertePerson(CTVersichertePerson value) {
        this.versichertePerson = value;
    }

    /**
     * Gets the value of the versichertesWagnis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versichertesWagnis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersichertesWagnis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVersichertesWagnis }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVersichertesWagnis> getVersichertesWagnis() {
        if (versichertesWagnis == null) {
            versichertesWagnis = new ArrayList<CTVersichertesWagnis>();
        }
        return this.versichertesWagnis;
    }

    /**
     * Gets the value of the gefahrenzone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gefahrenzone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGefahrenzone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTGefahrenzone }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTGefahrenzone> getGefahrenzone() {
        if (gefahrenzone == null) {
            gefahrenzone = new ArrayList<CTGefahrenzone>();
        }
        return this.gefahrenzone;
    }

    /**
     * Gets the value of the geltungsbereich property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGeltungsbereich() {
        return geltungsbereich;
    }

    /**
     * Sets the value of the geltungsbereich property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeltungsbereich(String value) {
        this.geltungsbereich = value;
    }

    /**
     * Gets the value of the versichertePersonengruppe property.
     * 
     * @return
     *     possible object is
     *     {@link CTVersichertePersonengruppe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePersonengruppe getVersichertePersonengruppe() {
        return versichertePersonengruppe;
    }

    /**
     * Sets the value of the versichertePersonengruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVersichertePersonengruppe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersichertePersonengruppe(CTVersichertePersonengruppe value) {
        this.versichertePersonengruppe = value;
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
        final CTDeckung that = ((CTDeckung) object);
        {
            STEDeckung lhsArtID;
            lhsArtID = this.getArtID();
            STEDeckung rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUnterversicherungsverzicht;
            lhsUnterversicherungsverzicht = this.isUnterversicherungsverzicht();
            Boolean rhsUnterversicherungsverzicht;
            rhsUnterversicherungsverzicht = that.isUnterversicherungsverzicht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterversicherungsverzicht", lhsUnterversicherungsverzicht), LocatorUtils.property(thatLocator, "unterversicherungsverzicht", rhsUnterversicherungsverzicht), lhsUnterversicherungsverzicht, rhsUnterversicherungsverzicht, (this.unterversicherungsverzicht!= null), (that.unterversicherungsverzicht!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBeitragssatz;
            lhsBeitragssatz = this.getBeitragssatz();
            BigDecimal rhsBeitragssatz;
            rhsBeitragssatz = that.getBeitragssatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragssatz", lhsBeitragssatz), LocatorUtils.property(thatLocator, "beitragssatz", rhsBeitragssatz), lhsBeitragssatz, rhsBeitragssatz, (this.beitragssatz!= null), (that.beitragssatz!= null))) {
                return false;
            }
        }
        {
            STBerechnungseinheit lhsBeitragssatzeinheit;
            lhsBeitragssatzeinheit = this.getBeitragssatzeinheit();
            STBerechnungseinheit rhsBeitragssatzeinheit;
            rhsBeitragssatzeinheit = that.getBeitragssatzeinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragssatzeinheit", lhsBeitragssatzeinheit), LocatorUtils.property(thatLocator, "beitragssatzeinheit", rhsBeitragssatzeinheit), lhsBeitragssatzeinheit, rhsBeitragssatzeinheit, (this.beitragssatzeinheit!= null), (that.beitragssatzeinheit!= null))) {
                return false;
            }
        }
        {
            List<CTGefahr> lhsGefahr;
            lhsGefahr = (((this.gefahr!= null)&&(!this.gefahr.isEmpty()))?this.getGefahr():null);
            List<CTGefahr> rhsGefahr;
            rhsGefahr = (((that.gefahr!= null)&&(!that.gefahr.isEmpty()))?that.getGefahr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahr", lhsGefahr), LocatorUtils.property(thatLocator, "gefahr", rhsGefahr), lhsGefahr, rhsGefahr, ((this.gefahr!= null)&&(!this.gefahr.isEmpty())), ((that.gefahr!= null)&&(!that.gefahr.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTVersichertesObjekt> lhsVersichertesObjekt;
            lhsVersichertesObjekt = (((this.versichertesObjekt!= null)&&(!this.versichertesObjekt.isEmpty()))?this.getVersichertesObjekt():null);
            List<CTVersichertesObjekt> rhsVersichertesObjekt;
            rhsVersichertesObjekt = (((that.versichertesObjekt!= null)&&(!that.versichertesObjekt.isEmpty()))?that.getVersichertesObjekt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertesObjekt", lhsVersichertesObjekt), LocatorUtils.property(thatLocator, "versichertesObjekt", rhsVersichertesObjekt), lhsVersichertesObjekt, rhsVersichertesObjekt, ((this.versichertesObjekt!= null)&&(!this.versichertesObjekt.isEmpty())), ((that.versichertesObjekt!= null)&&(!that.versichertesObjekt.isEmpty())))) {
                return false;
            }
        }
        {
            CTVersichertePerson lhsVersichertePerson;
            lhsVersichertePerson = this.getVersichertePerson();
            CTVersichertePerson rhsVersichertePerson;
            rhsVersichertePerson = that.getVersichertePerson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertePerson", lhsVersichertePerson), LocatorUtils.property(thatLocator, "versichertePerson", rhsVersichertePerson), lhsVersichertePerson, rhsVersichertePerson, (this.versichertePerson!= null), (that.versichertePerson!= null))) {
                return false;
            }
        }
        {
            List<CTVersichertesWagnis> lhsVersichertesWagnis;
            lhsVersichertesWagnis = (((this.versichertesWagnis!= null)&&(!this.versichertesWagnis.isEmpty()))?this.getVersichertesWagnis():null);
            List<CTVersichertesWagnis> rhsVersichertesWagnis;
            rhsVersichertesWagnis = (((that.versichertesWagnis!= null)&&(!that.versichertesWagnis.isEmpty()))?that.getVersichertesWagnis():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertesWagnis", lhsVersichertesWagnis), LocatorUtils.property(thatLocator, "versichertesWagnis", rhsVersichertesWagnis), lhsVersichertesWagnis, rhsVersichertesWagnis, ((this.versichertesWagnis!= null)&&(!this.versichertesWagnis.isEmpty())), ((that.versichertesWagnis!= null)&&(!that.versichertesWagnis.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTGefahrenzone> lhsGefahrenzone;
            lhsGefahrenzone = (((this.gefahrenzone!= null)&&(!this.gefahrenzone.isEmpty()))?this.getGefahrenzone():null);
            List<CTGefahrenzone> rhsGefahrenzone;
            rhsGefahrenzone = (((that.gefahrenzone!= null)&&(!that.gefahrenzone.isEmpty()))?that.getGefahrenzone():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahrenzone", lhsGefahrenzone), LocatorUtils.property(thatLocator, "gefahrenzone", rhsGefahrenzone), lhsGefahrenzone, rhsGefahrenzone, ((this.gefahrenzone!= null)&&(!this.gefahrenzone.isEmpty())), ((that.gefahrenzone!= null)&&(!that.gefahrenzone.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsGeltungsbereich;
            lhsGeltungsbereich = this.getGeltungsbereich();
            String rhsGeltungsbereich;
            rhsGeltungsbereich = that.getGeltungsbereich();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geltungsbereich", lhsGeltungsbereich), LocatorUtils.property(thatLocator, "geltungsbereich", rhsGeltungsbereich), lhsGeltungsbereich, rhsGeltungsbereich, (this.geltungsbereich!= null), (that.geltungsbereich!= null))) {
                return false;
            }
        }
        {
            CTVersichertePersonengruppe lhsVersichertePersonengruppe;
            lhsVersichertePersonengruppe = this.getVersichertePersonengruppe();
            CTVersichertePersonengruppe rhsVersichertePersonengruppe;
            rhsVersichertePersonengruppe = that.getVersichertePersonengruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertePersonengruppe", lhsVersichertePersonengruppe), LocatorUtils.property(thatLocator, "versichertePersonengruppe", rhsVersichertePersonengruppe), lhsVersichertePersonengruppe, rhsVersichertePersonengruppe, (this.versichertePersonengruppe!= null), (that.versichertePersonengruppe!= null))) {
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
            STEDeckung theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            Boolean theUnterversicherungsverzicht;
            theUnterversicherungsverzicht = this.isUnterversicherungsverzicht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unterversicherungsverzicht", theUnterversicherungsverzicht), currentHashCode, theUnterversicherungsverzicht, (this.unterversicherungsverzicht!= null));
        }
        {
            BigDecimal theBeitragssatz;
            theBeitragssatz = this.getBeitragssatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragssatz", theBeitragssatz), currentHashCode, theBeitragssatz, (this.beitragssatz!= null));
        }
        {
            STBerechnungseinheit theBeitragssatzeinheit;
            theBeitragssatzeinheit = this.getBeitragssatzeinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragssatzeinheit", theBeitragssatzeinheit), currentHashCode, theBeitragssatzeinheit, (this.beitragssatzeinheit!= null));
        }
        {
            List<CTGefahr> theGefahr;
            theGefahr = (((this.gefahr!= null)&&(!this.gefahr.isEmpty()))?this.getGefahr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahr", theGefahr), currentHashCode, theGefahr, ((this.gefahr!= null)&&(!this.gefahr.isEmpty())));
        }
        {
            List<CTVersichertesObjekt> theVersichertesObjekt;
            theVersichertesObjekt = (((this.versichertesObjekt!= null)&&(!this.versichertesObjekt.isEmpty()))?this.getVersichertesObjekt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertesObjekt", theVersichertesObjekt), currentHashCode, theVersichertesObjekt, ((this.versichertesObjekt!= null)&&(!this.versichertesObjekt.isEmpty())));
        }
        {
            CTVersichertePerson theVersichertePerson;
            theVersichertePerson = this.getVersichertePerson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertePerson", theVersichertePerson), currentHashCode, theVersichertePerson, (this.versichertePerson!= null));
        }
        {
            List<CTVersichertesWagnis> theVersichertesWagnis;
            theVersichertesWagnis = (((this.versichertesWagnis!= null)&&(!this.versichertesWagnis.isEmpty()))?this.getVersichertesWagnis():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertesWagnis", theVersichertesWagnis), currentHashCode, theVersichertesWagnis, ((this.versichertesWagnis!= null)&&(!this.versichertesWagnis.isEmpty())));
        }
        {
            List<CTGefahrenzone> theGefahrenzone;
            theGefahrenzone = (((this.gefahrenzone!= null)&&(!this.gefahrenzone.isEmpty()))?this.getGefahrenzone():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahrenzone", theGefahrenzone), currentHashCode, theGefahrenzone, ((this.gefahrenzone!= null)&&(!this.gefahrenzone.isEmpty())));
        }
        {
            String theGeltungsbereich;
            theGeltungsbereich = this.getGeltungsbereich();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geltungsbereich", theGeltungsbereich), currentHashCode, theGeltungsbereich, (this.geltungsbereich!= null));
        }
        {
            CTVersichertePersonengruppe theVersichertePersonengruppe;
            theVersichertePersonengruppe = this.getVersichertePersonengruppe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertePersonengruppe", theVersichertePersonengruppe), currentHashCode, theVersichertePersonengruppe, (this.versichertePersonengruppe!= null));
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
        if (draftCopy instanceof CTDeckung) {
            final CTDeckung copy = ((CTDeckung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEDeckung sourceArtID;
                    sourceArtID = this.getArtID();
                    STEDeckung copyArtID = ((STEDeckung) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean unterversicherungsverzichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unterversicherungsverzicht!= null));
                if (unterversicherungsverzichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceUnterversicherungsverzicht;
                    sourceUnterversicherungsverzicht = this.isUnterversicherungsverzicht();
                    Boolean copyUnterversicherungsverzicht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "unterversicherungsverzicht", sourceUnterversicherungsverzicht), sourceUnterversicherungsverzicht, (this.unterversicherungsverzicht!= null)));
                    copy.setUnterversicherungsverzicht(copyUnterversicherungsverzicht);
                } else {
                    if (unterversicherungsverzichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unterversicherungsverzicht = null;
                    }
                }
            }
            {
                Boolean beitragssatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragssatz!= null));
                if (beitragssatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBeitragssatz;
                    sourceBeitragssatz = this.getBeitragssatz();
                    BigDecimal copyBeitragssatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "beitragssatz", sourceBeitragssatz), sourceBeitragssatz, (this.beitragssatz!= null)));
                    copy.setBeitragssatz(copyBeitragssatz);
                } else {
                    if (beitragssatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragssatz = null;
                    }
                }
            }
            {
                Boolean beitragssatzeinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragssatzeinheit!= null));
                if (beitragssatzeinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBerechnungseinheit sourceBeitragssatzeinheit;
                    sourceBeitragssatzeinheit = this.getBeitragssatzeinheit();
                    STBerechnungseinheit copyBeitragssatzeinheit = ((STBerechnungseinheit) strategy.copy(LocatorUtils.property(locator, "beitragssatzeinheit", sourceBeitragssatzeinheit), sourceBeitragssatzeinheit, (this.beitragssatzeinheit!= null)));
                    copy.setBeitragssatzeinheit(copyBeitragssatzeinheit);
                } else {
                    if (beitragssatzeinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragssatzeinheit = null;
                    }
                }
            }
            {
                Boolean gefahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gefahr!= null)&&(!this.gefahr.isEmpty())));
                if (gefahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTGefahr> sourceGefahr;
                    sourceGefahr = (((this.gefahr!= null)&&(!this.gefahr.isEmpty()))?this.getGefahr():null);
                    @SuppressWarnings("unchecked")
                    List<CTGefahr> copyGefahr = ((List<CTGefahr> ) strategy.copy(LocatorUtils.property(locator, "gefahr", sourceGefahr), sourceGefahr, ((this.gefahr!= null)&&(!this.gefahr.isEmpty()))));
                    copy.gefahr = null;
                    if (copyGefahr!= null) {
                        List<CTGefahr> uniqueGefahrl = copy.getGefahr();
                        uniqueGefahrl.addAll(copyGefahr);
                    }
                } else {
                    if (gefahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahr = null;
                    }
                }
            }
            {
                Boolean versichertesObjektShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.versichertesObjekt!= null)&&(!this.versichertesObjekt.isEmpty())));
                if (versichertesObjektShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVersichertesObjekt> sourceVersichertesObjekt;
                    sourceVersichertesObjekt = (((this.versichertesObjekt!= null)&&(!this.versichertesObjekt.isEmpty()))?this.getVersichertesObjekt():null);
                    @SuppressWarnings("unchecked")
                    List<CTVersichertesObjekt> copyVersichertesObjekt = ((List<CTVersichertesObjekt> ) strategy.copy(LocatorUtils.property(locator, "versichertesObjekt", sourceVersichertesObjekt), sourceVersichertesObjekt, ((this.versichertesObjekt!= null)&&(!this.versichertesObjekt.isEmpty()))));
                    copy.versichertesObjekt = null;
                    if (copyVersichertesObjekt!= null) {
                        List<CTVersichertesObjekt> uniqueVersichertesObjektl = copy.getVersichertesObjekt();
                        uniqueVersichertesObjektl.addAll(copyVersichertesObjekt);
                    }
                } else {
                    if (versichertesObjektShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertesObjekt = null;
                    }
                }
            }
            {
                Boolean versichertePersonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versichertePerson!= null));
                if (versichertePersonShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVersichertePerson sourceVersichertePerson;
                    sourceVersichertePerson = this.getVersichertePerson();
                    CTVersichertePerson copyVersichertePerson = ((CTVersichertePerson) strategy.copy(LocatorUtils.property(locator, "versichertePerson", sourceVersichertePerson), sourceVersichertePerson, (this.versichertePerson!= null)));
                    copy.setVersichertePerson(copyVersichertePerson);
                } else {
                    if (versichertePersonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertePerson = null;
                    }
                }
            }
            {
                Boolean versichertesWagnisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.versichertesWagnis!= null)&&(!this.versichertesWagnis.isEmpty())));
                if (versichertesWagnisShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVersichertesWagnis> sourceVersichertesWagnis;
                    sourceVersichertesWagnis = (((this.versichertesWagnis!= null)&&(!this.versichertesWagnis.isEmpty()))?this.getVersichertesWagnis():null);
                    @SuppressWarnings("unchecked")
                    List<CTVersichertesWagnis> copyVersichertesWagnis = ((List<CTVersichertesWagnis> ) strategy.copy(LocatorUtils.property(locator, "versichertesWagnis", sourceVersichertesWagnis), sourceVersichertesWagnis, ((this.versichertesWagnis!= null)&&(!this.versichertesWagnis.isEmpty()))));
                    copy.versichertesWagnis = null;
                    if (copyVersichertesWagnis!= null) {
                        List<CTVersichertesWagnis> uniqueVersichertesWagnisl = copy.getVersichertesWagnis();
                        uniqueVersichertesWagnisl.addAll(copyVersichertesWagnis);
                    }
                } else {
                    if (versichertesWagnisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertesWagnis = null;
                    }
                }
            }
            {
                Boolean gefahrenzoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gefahrenzone!= null)&&(!this.gefahrenzone.isEmpty())));
                if (gefahrenzoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTGefahrenzone> sourceGefahrenzone;
                    sourceGefahrenzone = (((this.gefahrenzone!= null)&&(!this.gefahrenzone.isEmpty()))?this.getGefahrenzone():null);
                    @SuppressWarnings("unchecked")
                    List<CTGefahrenzone> copyGefahrenzone = ((List<CTGefahrenzone> ) strategy.copy(LocatorUtils.property(locator, "gefahrenzone", sourceGefahrenzone), sourceGefahrenzone, ((this.gefahrenzone!= null)&&(!this.gefahrenzone.isEmpty()))));
                    copy.gefahrenzone = null;
                    if (copyGefahrenzone!= null) {
                        List<CTGefahrenzone> uniqueGefahrenzonel = copy.getGefahrenzone();
                        uniqueGefahrenzonel.addAll(copyGefahrenzone);
                    }
                } else {
                    if (gefahrenzoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahrenzone = null;
                    }
                }
            }
            {
                Boolean geltungsbereichShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geltungsbereich!= null));
                if (geltungsbereichShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeltungsbereich;
                    sourceGeltungsbereich = this.getGeltungsbereich();
                    String copyGeltungsbereich = ((String) strategy.copy(LocatorUtils.property(locator, "geltungsbereich", sourceGeltungsbereich), sourceGeltungsbereich, (this.geltungsbereich!= null)));
                    copy.setGeltungsbereich(copyGeltungsbereich);
                } else {
                    if (geltungsbereichShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geltungsbereich = null;
                    }
                }
            }
            {
                Boolean versichertePersonengruppeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versichertePersonengruppe!= null));
                if (versichertePersonengruppeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVersichertePersonengruppe sourceVersichertePersonengruppe;
                    sourceVersichertePersonengruppe = this.getVersichertePersonengruppe();
                    CTVersichertePersonengruppe copyVersichertePersonengruppe = ((CTVersichertePersonengruppe) strategy.copy(LocatorUtils.property(locator, "versichertePersonengruppe", sourceVersichertePersonengruppe), sourceVersichertePersonengruppe, (this.versichertePersonengruppe!= null)));
                    copy.setVersichertePersonengruppe(copyVersichertePersonengruppe);
                } else {
                    if (versichertePersonengruppeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertePersonengruppe = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDeckung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withArtID(STEDeckung value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withUnterversicherungsverzicht(Boolean value) {
        setUnterversicherungsverzicht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBeitragssatz(BigDecimal value) {
        setBeitragssatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBeitragssatzeinheit(STBerechnungseinheit value) {
        setBeitragssatzeinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withGefahr(CTGefahr... values) {
        if (values!= null) {
            for (CTGefahr value: values) {
                getGefahr().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withGefahr(Collection<CTGefahr> values) {
        if (values!= null) {
            getGefahr().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersichertesObjekt(CTVersichertesObjekt... values) {
        if (values!= null) {
            for (CTVersichertesObjekt value: values) {
                getVersichertesObjekt().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersichertesObjekt(Collection<CTVersichertesObjekt> values) {
        if (values!= null) {
            getVersichertesObjekt().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersichertePerson(CTVersichertePerson value) {
        setVersichertePerson(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersichertesWagnis(CTVersichertesWagnis... values) {
        if (values!= null) {
            for (CTVersichertesWagnis value: values) {
                getVersichertesWagnis().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersichertesWagnis(Collection<CTVersichertesWagnis> values) {
        if (values!= null) {
            getVersichertesWagnis().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withGefahrenzone(CTGefahrenzone... values) {
        if (values!= null) {
            for (CTGefahrenzone value: values) {
                getGefahrenzone().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withGefahrenzone(Collection<CTGefahrenzone> values) {
        if (values!= null) {
            getGefahrenzone().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withGeltungsbereich(String value) {
        setGeltungsbereich(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersichertePersonengruppe(CTVersichertePersonengruppe value) {
        setVersichertePersonengruppe(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersicherungssummeOderLeistung(CTVersicherungssummeOderLeistung... values) {
        if (values!= null) {
            for (CTVersicherungssummeOderLeistung value: values) {
                getVersicherungssummeOderLeistung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersicherungssummeOderLeistung(Collection<CTVersicherungssummeOderLeistung> values) {
        if (values!= null) {
            getVersicherungssummeOderLeistung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withSelbstbeteiligung(CTSelbstbeteiligung... values) {
        if (values!= null) {
            for (CTSelbstbeteiligung value: values) {
                getSelbstbeteiligung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withSelbstbeteiligung(Collection<CTSelbstbeteiligung> values) {
        if (values!= null) {
            getSelbstbeteiligung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withKlausel(CTKlausel... values) {
        if (values!= null) {
            for (CTKlausel value: values) {
                getKlausel().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withKlausel(Collection<CTKlausel> values) {
        if (values!= null) {
            getKlausel().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBezugsrecht(CTBezugsrecht... values) {
        if (values!= null) {
            for (CTBezugsrecht value: values) {
                getBezugsrecht().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBezugsrecht(Collection<CTBezugsrecht> values) {
        if (values!= null) {
            getBezugsrecht().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withLeistungsausschluss(CTLeistungsausschluss... values) {
        if (values!= null) {
            for (CTLeistungsausschluss value: values) {
                getLeistungsausschluss().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withLeistungsausschluss(Collection<CTLeistungsausschluss> values) {
        if (values!= null) {
            getLeistungsausschluss().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withFondsPortfolio(CTFondsPortfolio... values) {
        if (values!= null) {
            for (CTFondsPortfolio value: values) {
                getFondsPortfolio().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withFondsPortfolio(Collection<CTFondsPortfolio> values) {
        if (values!= null) {
            getFondsPortfolio().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withKennung(String value) {
        setKennung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withDynamik(CTDynamik... values) {
        if (values!= null) {
            for (CTDynamik value: values) {
                getDynamik().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withDynamik(Collection<CTDynamik> values) {
        if (values!= null) {
            getDynamik().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDeckung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
