
package net.bipro.namespace.partner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTPartnernummer;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAnredeschluessel;
import net.bipro.namespace.datentypen.STEBerufsBranche;
import net.bipro.namespace.datentypen.STRechtsform;
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
 * Juristische Person. Darf nicht Projekt-spezifisch abgeleitet werden (vgl. Kommentar zu Partner). Kann eine natuerliche Person als Vertretungsberechtigten haben.
 * 
 * <p>Java class for CT_JuristischePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_JuristischePerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/partner}CT_Partner"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rechtsform" type="{http://www.bipro.net/namespace/datentypen}ST_Rechtsform" minOccurs="0"/&gt;
 *         &lt;element name="Steuernummer" type="{http://www.bipro.net/namespace/datentypen}ST_Steuernummer" minOccurs="0"/&gt;
 *         &lt;element name="Gruendungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Branche" type="{http://www.bipro.net/namespace/datentypen}STE_BerufsBranche" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlMitglieder" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Vertretungsberechtigter" type="{http://www.bipro.net/namespace/partner}CT_Vertretungsberechtigter" minOccurs="0"/&gt;
 *         &lt;element name="Umsatz" type="{http://www.bipro.net/namespace/partner}CT_Umsatz" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlBeschaeftigte" type="{http://www.bipro.net/namespace/partner}CT_AnzahlBeschaeftigte" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Lohnsumme" type="{http://www.bipro.net/namespace/partner}CT_Lohnsumme" minOccurs="0"/&gt;
 *         &lt;element name="Handelsregistergericht" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Handelsregisteraktenzeichen" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Mitarbeitergruppe" type="{http://www.bipro.net/namespace/partner}CT_Mitarbeitergruppe" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_JuristischePerson", propOrder = {
    "rechtsform",
    "steuernummer",
    "gruendungsdatum",
    "branche",
    "anzahlMitglieder",
    "vertretungsberechtigter",
    "umsatz",
    "anzahlBeschaeftigte",
    "lohnsumme",
    "handelsregistergericht",
    "handelsregisteraktenzeichen",
    "mitarbeitergruppe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTJuristischePerson
    extends CTPartner
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Rechtsform")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STRechtsform rechtsform;
    @XmlElement(name = "Steuernummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String steuernummer;
    @XmlElement(name = "Gruendungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String gruendungsdatum;
    @XmlElement(name = "Branche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEBerufsBranche branche;
    @XmlElement(name = "AnzahlMitglieder")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlMitglieder;
    @XmlElement(name = "Vertretungsberechtigter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVertretungsberechtigter vertretungsberechtigter;
    @XmlElement(name = "Umsatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTUmsatz umsatz;
    @XmlElement(name = "AnzahlBeschaeftigte")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTAnzahlBeschaeftigte> anzahlBeschaeftigte;
    @XmlElement(name = "Lohnsumme")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTLohnsumme lohnsumme;
    @XmlElement(name = "Handelsregistergericht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String handelsregistergericht;
    @XmlElement(name = "Handelsregisteraktenzeichen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String handelsregisteraktenzeichen;
    @XmlElement(name = "Mitarbeitergruppe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTMitarbeitergruppe> mitarbeitergruppe;

    /**
     * Gets the value of the rechtsform property.
     * 
     * @return
     *     possible object is
     *     {@link STRechtsform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STRechtsform getRechtsform() {
        return rechtsform;
    }

    /**
     * Sets the value of the rechtsform property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRechtsform }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setRechtsform(STRechtsform value) {
        this.rechtsform = value;
    }

    /**
     * Gets the value of the steuernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSteuernummer() {
        return steuernummer;
    }

    /**
     * Sets the value of the steuernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSteuernummer(String value) {
        this.steuernummer = value;
    }

    /**
     * Gets the value of the gruendungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGruendungsdatum() {
        return gruendungsdatum;
    }

    /**
     * Sets the value of the gruendungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGruendungsdatum(String value) {
        this.gruendungsdatum = value;
    }

    /**
     * Gets the value of the branche property.
     * 
     * @return
     *     possible object is
     *     {@link STEBerufsBranche }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEBerufsBranche getBranche() {
        return branche;
    }

    /**
     * Sets the value of the branche property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEBerufsBranche }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBranche(STEBerufsBranche value) {
        this.branche = value;
    }

    /**
     * Gets the value of the anzahlMitglieder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlMitglieder() {
        return anzahlMitglieder;
    }

    /**
     * Sets the value of the anzahlMitglieder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlMitglieder(Integer value) {
        this.anzahlMitglieder = value;
    }

    /**
     * Gets the value of the vertretungsberechtigter property.
     * 
     * @return
     *     possible object is
     *     {@link CTVertretungsberechtigter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVertretungsberechtigter getVertretungsberechtigter() {
        return vertretungsberechtigter;
    }

    /**
     * Sets the value of the vertretungsberechtigter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVertretungsberechtigter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVertretungsberechtigter(CTVertretungsberechtigter value) {
        this.vertretungsberechtigter = value;
    }

    /**
     * Gets the value of the umsatz property.
     * 
     * @return
     *     possible object is
     *     {@link CTUmsatz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUmsatz getUmsatz() {
        return umsatz;
    }

    /**
     * Sets the value of the umsatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUmsatz }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUmsatz(CTUmsatz value) {
        this.umsatz = value;
    }

    /**
     * Gets the value of the anzahlBeschaeftigte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anzahlBeschaeftigte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnzahlBeschaeftigte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAnzahlBeschaeftigte }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTAnzahlBeschaeftigte> getAnzahlBeschaeftigte() {
        if (anzahlBeschaeftigte == null) {
            anzahlBeschaeftigte = new ArrayList<CTAnzahlBeschaeftigte>();
        }
        return this.anzahlBeschaeftigte;
    }

    /**
     * Gets the value of the lohnsumme property.
     * 
     * @return
     *     possible object is
     *     {@link CTLohnsumme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLohnsumme getLohnsumme() {
        return lohnsumme;
    }

    /**
     * Sets the value of the lohnsumme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTLohnsumme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLohnsumme(CTLohnsumme value) {
        this.lohnsumme = value;
    }

    /**
     * Gets the value of the handelsregistergericht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getHandelsregistergericht() {
        return handelsregistergericht;
    }

    /**
     * Sets the value of the handelsregistergericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setHandelsregistergericht(String value) {
        this.handelsregistergericht = value;
    }

    /**
     * Gets the value of the handelsregisteraktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getHandelsregisteraktenzeichen() {
        return handelsregisteraktenzeichen;
    }

    /**
     * Sets the value of the handelsregisteraktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setHandelsregisteraktenzeichen(String value) {
        this.handelsregisteraktenzeichen = value;
    }

    /**
     * Gets the value of the mitarbeitergruppe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitarbeitergruppe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMitarbeitergruppe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMitarbeitergruppe }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTMitarbeitergruppe> getMitarbeitergruppe() {
        if (mitarbeitergruppe == null) {
            mitarbeitergruppe = new ArrayList<CTMitarbeitergruppe>();
        }
        return this.mitarbeitergruppe;
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
        final CTJuristischePerson that = ((CTJuristischePerson) object);
        {
            STRechtsform lhsRechtsform;
            lhsRechtsform = this.getRechtsform();
            STRechtsform rhsRechtsform;
            rhsRechtsform = that.getRechtsform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rechtsform", lhsRechtsform), LocatorUtils.property(thatLocator, "rechtsform", rhsRechtsform), lhsRechtsform, rhsRechtsform, (this.rechtsform!= null), (that.rechtsform!= null))) {
                return false;
            }
        }
        {
            String lhsSteuernummer;
            lhsSteuernummer = this.getSteuernummer();
            String rhsSteuernummer;
            rhsSteuernummer = that.getSteuernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steuernummer", lhsSteuernummer), LocatorUtils.property(thatLocator, "steuernummer", rhsSteuernummer), lhsSteuernummer, rhsSteuernummer, (this.steuernummer!= null), (that.steuernummer!= null))) {
                return false;
            }
        }
        {
            String lhsGruendungsdatum;
            lhsGruendungsdatum = this.getGruendungsdatum();
            String rhsGruendungsdatum;
            rhsGruendungsdatum = that.getGruendungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruendungsdatum", lhsGruendungsdatum), LocatorUtils.property(thatLocator, "gruendungsdatum", rhsGruendungsdatum), lhsGruendungsdatum, rhsGruendungsdatum, (this.gruendungsdatum!= null), (that.gruendungsdatum!= null))) {
                return false;
            }
        }
        {
            STEBerufsBranche lhsBranche;
            lhsBranche = this.getBranche();
            STEBerufsBranche rhsBranche;
            rhsBranche = that.getBranche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branche", lhsBranche), LocatorUtils.property(thatLocator, "branche", rhsBranche), lhsBranche, rhsBranche, (this.branche!= null), (that.branche!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlMitglieder;
            lhsAnzahlMitglieder = this.getAnzahlMitglieder();
            Integer rhsAnzahlMitglieder;
            rhsAnzahlMitglieder = that.getAnzahlMitglieder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlMitglieder", lhsAnzahlMitglieder), LocatorUtils.property(thatLocator, "anzahlMitglieder", rhsAnzahlMitglieder), lhsAnzahlMitglieder, rhsAnzahlMitglieder, (this.anzahlMitglieder!= null), (that.anzahlMitglieder!= null))) {
                return false;
            }
        }
        {
            CTVertretungsberechtigter lhsVertretungsberechtigter;
            lhsVertretungsberechtigter = this.getVertretungsberechtigter();
            CTVertretungsberechtigter rhsVertretungsberechtigter;
            rhsVertretungsberechtigter = that.getVertretungsberechtigter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertretungsberechtigter", lhsVertretungsberechtigter), LocatorUtils.property(thatLocator, "vertretungsberechtigter", rhsVertretungsberechtigter), lhsVertretungsberechtigter, rhsVertretungsberechtigter, (this.vertretungsberechtigter!= null), (that.vertretungsberechtigter!= null))) {
                return false;
            }
        }
        {
            CTUmsatz lhsUmsatz;
            lhsUmsatz = this.getUmsatz();
            CTUmsatz rhsUmsatz;
            rhsUmsatz = that.getUmsatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umsatz", lhsUmsatz), LocatorUtils.property(thatLocator, "umsatz", rhsUmsatz), lhsUmsatz, rhsUmsatz, (this.umsatz!= null), (that.umsatz!= null))) {
                return false;
            }
        }
        {
            List<CTAnzahlBeschaeftigte> lhsAnzahlBeschaeftigte;
            lhsAnzahlBeschaeftigte = (((this.anzahlBeschaeftigte!= null)&&(!this.anzahlBeschaeftigte.isEmpty()))?this.getAnzahlBeschaeftigte():null);
            List<CTAnzahlBeschaeftigte> rhsAnzahlBeschaeftigte;
            rhsAnzahlBeschaeftigte = (((that.anzahlBeschaeftigte!= null)&&(!that.anzahlBeschaeftigte.isEmpty()))?that.getAnzahlBeschaeftigte():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlBeschaeftigte", lhsAnzahlBeschaeftigte), LocatorUtils.property(thatLocator, "anzahlBeschaeftigte", rhsAnzahlBeschaeftigte), lhsAnzahlBeschaeftigte, rhsAnzahlBeschaeftigte, ((this.anzahlBeschaeftigte!= null)&&(!this.anzahlBeschaeftigte.isEmpty())), ((that.anzahlBeschaeftigte!= null)&&(!that.anzahlBeschaeftigte.isEmpty())))) {
                return false;
            }
        }
        {
            CTLohnsumme lhsLohnsumme;
            lhsLohnsumme = this.getLohnsumme();
            CTLohnsumme rhsLohnsumme;
            rhsLohnsumme = that.getLohnsumme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lohnsumme", lhsLohnsumme), LocatorUtils.property(thatLocator, "lohnsumme", rhsLohnsumme), lhsLohnsumme, rhsLohnsumme, (this.lohnsumme!= null), (that.lohnsumme!= null))) {
                return false;
            }
        }
        {
            String lhsHandelsregistergericht;
            lhsHandelsregistergericht = this.getHandelsregistergericht();
            String rhsHandelsregistergericht;
            rhsHandelsregistergericht = that.getHandelsregistergericht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelsregistergericht", lhsHandelsregistergericht), LocatorUtils.property(thatLocator, "handelsregistergericht", rhsHandelsregistergericht), lhsHandelsregistergericht, rhsHandelsregistergericht, (this.handelsregistergericht!= null), (that.handelsregistergericht!= null))) {
                return false;
            }
        }
        {
            String lhsHandelsregisteraktenzeichen;
            lhsHandelsregisteraktenzeichen = this.getHandelsregisteraktenzeichen();
            String rhsHandelsregisteraktenzeichen;
            rhsHandelsregisteraktenzeichen = that.getHandelsregisteraktenzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handelsregisteraktenzeichen", lhsHandelsregisteraktenzeichen), LocatorUtils.property(thatLocator, "handelsregisteraktenzeichen", rhsHandelsregisteraktenzeichen), lhsHandelsregisteraktenzeichen, rhsHandelsregisteraktenzeichen, (this.handelsregisteraktenzeichen!= null), (that.handelsregisteraktenzeichen!= null))) {
                return false;
            }
        }
        {
            List<CTMitarbeitergruppe> lhsMitarbeitergruppe;
            lhsMitarbeitergruppe = (((this.mitarbeitergruppe!= null)&&(!this.mitarbeitergruppe.isEmpty()))?this.getMitarbeitergruppe():null);
            List<CTMitarbeitergruppe> rhsMitarbeitergruppe;
            rhsMitarbeitergruppe = (((that.mitarbeitergruppe!= null)&&(!that.mitarbeitergruppe.isEmpty()))?that.getMitarbeitergruppe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitarbeitergruppe", lhsMitarbeitergruppe), LocatorUtils.property(thatLocator, "mitarbeitergruppe", rhsMitarbeitergruppe), lhsMitarbeitergruppe, rhsMitarbeitergruppe, ((this.mitarbeitergruppe!= null)&&(!this.mitarbeitergruppe.isEmpty())), ((that.mitarbeitergruppe!= null)&&(!that.mitarbeitergruppe.isEmpty())))) {
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
            STRechtsform theRechtsform;
            theRechtsform = this.getRechtsform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rechtsform", theRechtsform), currentHashCode, theRechtsform, (this.rechtsform!= null));
        }
        {
            String theSteuernummer;
            theSteuernummer = this.getSteuernummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "steuernummer", theSteuernummer), currentHashCode, theSteuernummer, (this.steuernummer!= null));
        }
        {
            String theGruendungsdatum;
            theGruendungsdatum = this.getGruendungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gruendungsdatum", theGruendungsdatum), currentHashCode, theGruendungsdatum, (this.gruendungsdatum!= null));
        }
        {
            STEBerufsBranche theBranche;
            theBranche = this.getBranche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branche", theBranche), currentHashCode, theBranche, (this.branche!= null));
        }
        {
            Integer theAnzahlMitglieder;
            theAnzahlMitglieder = this.getAnzahlMitglieder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlMitglieder", theAnzahlMitglieder), currentHashCode, theAnzahlMitglieder, (this.anzahlMitglieder!= null));
        }
        {
            CTVertretungsberechtigter theVertretungsberechtigter;
            theVertretungsberechtigter = this.getVertretungsberechtigter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertretungsberechtigter", theVertretungsberechtigter), currentHashCode, theVertretungsberechtigter, (this.vertretungsberechtigter!= null));
        }
        {
            CTUmsatz theUmsatz;
            theUmsatz = this.getUmsatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "umsatz", theUmsatz), currentHashCode, theUmsatz, (this.umsatz!= null));
        }
        {
            List<CTAnzahlBeschaeftigte> theAnzahlBeschaeftigte;
            theAnzahlBeschaeftigte = (((this.anzahlBeschaeftigte!= null)&&(!this.anzahlBeschaeftigte.isEmpty()))?this.getAnzahlBeschaeftigte():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlBeschaeftigte", theAnzahlBeschaeftigte), currentHashCode, theAnzahlBeschaeftigte, ((this.anzahlBeschaeftigte!= null)&&(!this.anzahlBeschaeftigte.isEmpty())));
        }
        {
            CTLohnsumme theLohnsumme;
            theLohnsumme = this.getLohnsumme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lohnsumme", theLohnsumme), currentHashCode, theLohnsumme, (this.lohnsumme!= null));
        }
        {
            String theHandelsregistergericht;
            theHandelsregistergericht = this.getHandelsregistergericht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handelsregistergericht", theHandelsregistergericht), currentHashCode, theHandelsregistergericht, (this.handelsregistergericht!= null));
        }
        {
            String theHandelsregisteraktenzeichen;
            theHandelsregisteraktenzeichen = this.getHandelsregisteraktenzeichen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handelsregisteraktenzeichen", theHandelsregisteraktenzeichen), currentHashCode, theHandelsregisteraktenzeichen, (this.handelsregisteraktenzeichen!= null));
        }
        {
            List<CTMitarbeitergruppe> theMitarbeitergruppe;
            theMitarbeitergruppe = (((this.mitarbeitergruppe!= null)&&(!this.mitarbeitergruppe.isEmpty()))?this.getMitarbeitergruppe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitarbeitergruppe", theMitarbeitergruppe), currentHashCode, theMitarbeitergruppe, ((this.mitarbeitergruppe!= null)&&(!this.mitarbeitergruppe.isEmpty())));
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
        if (draftCopy instanceof CTJuristischePerson) {
            final CTJuristischePerson copy = ((CTJuristischePerson) draftCopy);
            {
                Boolean rechtsformShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rechtsform!= null));
                if (rechtsformShouldBeCopiedAndSet == Boolean.TRUE) {
                    STRechtsform sourceRechtsform;
                    sourceRechtsform = this.getRechtsform();
                    STRechtsform copyRechtsform = ((STRechtsform) strategy.copy(LocatorUtils.property(locator, "rechtsform", sourceRechtsform), sourceRechtsform, (this.rechtsform!= null)));
                    copy.setRechtsform(copyRechtsform);
                } else {
                    if (rechtsformShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rechtsform = null;
                    }
                }
            }
            {
                Boolean steuernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.steuernummer!= null));
                if (steuernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSteuernummer;
                    sourceSteuernummer = this.getSteuernummer();
                    String copySteuernummer = ((String) strategy.copy(LocatorUtils.property(locator, "steuernummer", sourceSteuernummer), sourceSteuernummer, (this.steuernummer!= null)));
                    copy.setSteuernummer(copySteuernummer);
                } else {
                    if (steuernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.steuernummer = null;
                    }
                }
            }
            {
                Boolean gruendungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gruendungsdatum!= null));
                if (gruendungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGruendungsdatum;
                    sourceGruendungsdatum = this.getGruendungsdatum();
                    String copyGruendungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "gruendungsdatum", sourceGruendungsdatum), sourceGruendungsdatum, (this.gruendungsdatum!= null)));
                    copy.setGruendungsdatum(copyGruendungsdatum);
                } else {
                    if (gruendungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruendungsdatum = null;
                    }
                }
            }
            {
                Boolean brancheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.branche!= null));
                if (brancheShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEBerufsBranche sourceBranche;
                    sourceBranche = this.getBranche();
                    STEBerufsBranche copyBranche = ((STEBerufsBranche) strategy.copy(LocatorUtils.property(locator, "branche", sourceBranche), sourceBranche, (this.branche!= null)));
                    copy.setBranche(copyBranche);
                } else {
                    if (brancheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.branche = null;
                    }
                }
            }
            {
                Boolean anzahlMitgliederShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlMitglieder!= null));
                if (anzahlMitgliederShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlMitglieder;
                    sourceAnzahlMitglieder = this.getAnzahlMitglieder();
                    Integer copyAnzahlMitglieder = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlMitglieder", sourceAnzahlMitglieder), sourceAnzahlMitglieder, (this.anzahlMitglieder!= null)));
                    copy.setAnzahlMitglieder(copyAnzahlMitglieder);
                } else {
                    if (anzahlMitgliederShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlMitglieder = null;
                    }
                }
            }
            {
                Boolean vertretungsberechtigterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertretungsberechtigter!= null));
                if (vertretungsberechtigterShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVertretungsberechtigter sourceVertretungsberechtigter;
                    sourceVertretungsberechtigter = this.getVertretungsberechtigter();
                    CTVertretungsberechtigter copyVertretungsberechtigter = ((CTVertretungsberechtigter) strategy.copy(LocatorUtils.property(locator, "vertretungsberechtigter", sourceVertretungsberechtigter), sourceVertretungsberechtigter, (this.vertretungsberechtigter!= null)));
                    copy.setVertretungsberechtigter(copyVertretungsberechtigter);
                } else {
                    if (vertretungsberechtigterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertretungsberechtigter = null;
                    }
                }
            }
            {
                Boolean umsatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umsatz!= null));
                if (umsatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTUmsatz sourceUmsatz;
                    sourceUmsatz = this.getUmsatz();
                    CTUmsatz copyUmsatz = ((CTUmsatz) strategy.copy(LocatorUtils.property(locator, "umsatz", sourceUmsatz), sourceUmsatz, (this.umsatz!= null)));
                    copy.setUmsatz(copyUmsatz);
                } else {
                    if (umsatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umsatz = null;
                    }
                }
            }
            {
                Boolean anzahlBeschaeftigteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.anzahlBeschaeftigte!= null)&&(!this.anzahlBeschaeftigte.isEmpty())));
                if (anzahlBeschaeftigteShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTAnzahlBeschaeftigte> sourceAnzahlBeschaeftigte;
                    sourceAnzahlBeschaeftigte = (((this.anzahlBeschaeftigte!= null)&&(!this.anzahlBeschaeftigte.isEmpty()))?this.getAnzahlBeschaeftigte():null);
                    @SuppressWarnings("unchecked")
                    List<CTAnzahlBeschaeftigte> copyAnzahlBeschaeftigte = ((List<CTAnzahlBeschaeftigte> ) strategy.copy(LocatorUtils.property(locator, "anzahlBeschaeftigte", sourceAnzahlBeschaeftigte), sourceAnzahlBeschaeftigte, ((this.anzahlBeschaeftigte!= null)&&(!this.anzahlBeschaeftigte.isEmpty()))));
                    copy.anzahlBeschaeftigte = null;
                    if (copyAnzahlBeschaeftigte!= null) {
                        List<CTAnzahlBeschaeftigte> uniqueAnzahlBeschaeftigtel = copy.getAnzahlBeschaeftigte();
                        uniqueAnzahlBeschaeftigtel.addAll(copyAnzahlBeschaeftigte);
                    }
                } else {
                    if (anzahlBeschaeftigteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlBeschaeftigte = null;
                    }
                }
            }
            {
                Boolean lohnsummeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lohnsumme!= null));
                if (lohnsummeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTLohnsumme sourceLohnsumme;
                    sourceLohnsumme = this.getLohnsumme();
                    CTLohnsumme copyLohnsumme = ((CTLohnsumme) strategy.copy(LocatorUtils.property(locator, "lohnsumme", sourceLohnsumme), sourceLohnsumme, (this.lohnsumme!= null)));
                    copy.setLohnsumme(copyLohnsumme);
                } else {
                    if (lohnsummeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lohnsumme = null;
                    }
                }
            }
            {
                Boolean handelsregistergerichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handelsregistergericht!= null));
                if (handelsregistergerichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHandelsregistergericht;
                    sourceHandelsregistergericht = this.getHandelsregistergericht();
                    String copyHandelsregistergericht = ((String) strategy.copy(LocatorUtils.property(locator, "handelsregistergericht", sourceHandelsregistergericht), sourceHandelsregistergericht, (this.handelsregistergericht!= null)));
                    copy.setHandelsregistergericht(copyHandelsregistergericht);
                } else {
                    if (handelsregistergerichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handelsregistergericht = null;
                    }
                }
            }
            {
                Boolean handelsregisteraktenzeichenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handelsregisteraktenzeichen!= null));
                if (handelsregisteraktenzeichenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHandelsregisteraktenzeichen;
                    sourceHandelsregisteraktenzeichen = this.getHandelsregisteraktenzeichen();
                    String copyHandelsregisteraktenzeichen = ((String) strategy.copy(LocatorUtils.property(locator, "handelsregisteraktenzeichen", sourceHandelsregisteraktenzeichen), sourceHandelsregisteraktenzeichen, (this.handelsregisteraktenzeichen!= null)));
                    copy.setHandelsregisteraktenzeichen(copyHandelsregisteraktenzeichen);
                } else {
                    if (handelsregisteraktenzeichenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handelsregisteraktenzeichen = null;
                    }
                }
            }
            {
                Boolean mitarbeitergruppeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mitarbeitergruppe!= null)&&(!this.mitarbeitergruppe.isEmpty())));
                if (mitarbeitergruppeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTMitarbeitergruppe> sourceMitarbeitergruppe;
                    sourceMitarbeitergruppe = (((this.mitarbeitergruppe!= null)&&(!this.mitarbeitergruppe.isEmpty()))?this.getMitarbeitergruppe():null);
                    @SuppressWarnings("unchecked")
                    List<CTMitarbeitergruppe> copyMitarbeitergruppe = ((List<CTMitarbeitergruppe> ) strategy.copy(LocatorUtils.property(locator, "mitarbeitergruppe", sourceMitarbeitergruppe), sourceMitarbeitergruppe, ((this.mitarbeitergruppe!= null)&&(!this.mitarbeitergruppe.isEmpty()))));
                    copy.mitarbeitergruppe = null;
                    if (copyMitarbeitergruppe!= null) {
                        List<CTMitarbeitergruppe> uniqueMitarbeitergruppel = copy.getMitarbeitergruppe();
                        uniqueMitarbeitergruppel.addAll(copyMitarbeitergruppe);
                    }
                } else {
                    if (mitarbeitergruppeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitarbeitergruppe = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTJuristischePerson();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withRechtsform(STRechtsform value) {
        setRechtsform(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withSteuernummer(String value) {
        setSteuernummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withGruendungsdatum(String value) {
        setGruendungsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withBranche(STEBerufsBranche value) {
        setBranche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withAnzahlMitglieder(Integer value) {
        setAnzahlMitglieder(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withVertretungsberechtigter(CTVertretungsberechtigter value) {
        setVertretungsberechtigter(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withUmsatz(CTUmsatz value) {
        setUmsatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withAnzahlBeschaeftigte(CTAnzahlBeschaeftigte... values) {
        if (values!= null) {
            for (CTAnzahlBeschaeftigte value: values) {
                getAnzahlBeschaeftigte().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withAnzahlBeschaeftigte(Collection<CTAnzahlBeschaeftigte> values) {
        if (values!= null) {
            getAnzahlBeschaeftigte().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withLohnsumme(CTLohnsumme value) {
        setLohnsumme(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withHandelsregistergericht(String value) {
        setHandelsregistergericht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withHandelsregisteraktenzeichen(String value) {
        setHandelsregisteraktenzeichen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withMitarbeitergruppe(CTMitarbeitergruppe... values) {
        if (values!= null) {
            for (CTMitarbeitergruppe value: values) {
                getMitarbeitergruppe().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withMitarbeitergruppe(Collection<CTMitarbeitergruppe> values) {
        if (values!= null) {
            getMitarbeitergruppe().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withAnrede(STAnredeschluessel value) {
        setAnrede(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withName(String value) {
        setName(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withNamenszusatz1(String value) {
        setNamenszusatz1(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withNamenszusatz2(String value) {
        setNamenszusatz2(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartnernummerVM(String value) {
        setPartnernummerVM(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartnernummer(String value) {
        setPartnernummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withVorsteuerabzugsberechtigt(Boolean value) {
        setVorsteuerabzugsberechtigt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withAnschrift(CTPartneranschrift... values) {
        if (values!= null) {
            for (CTPartneranschrift value: values) {
                getAnschrift().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withAnschrift(Collection<CTPartneranschrift> values) {
        if (values!= null) {
            getAnschrift().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withZusaetzlichePartnerdaten(CTZusaetzlichePartnerdaten... values) {
        if (values!= null) {
            for (CTZusaetzlichePartnerdaten value: values) {
                getZusaetzlichePartnerdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withZusaetzlichePartnerdaten(Collection<CTZusaetzlichePartnerdaten> values) {
        if (values!= null) {
            getZusaetzlichePartnerdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withKommunikationsverbindung(CTKommunikationsverbindung... values) {
        if (values!= null) {
            for (CTKommunikationsverbindung value: values) {
                getKommunikationsverbindung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withKommunikationsverbindung(Collection<CTKommunikationsverbindung> values) {
        if (values!= null) {
            getKommunikationsverbindung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withBankverbindung(CTBankverbindungBasis... values) {
        if (values!= null) {
            for (CTBankverbindungBasis value: values) {
                getBankverbindung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withBankverbindung(Collection<CTBankverbindungBasis> values) {
        if (values!= null) {
            getBankverbindung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withHandeltAufRechnungVon(CTHandeltAufRechnungVon... values) {
        if (values!= null) {
            for (CTHandeltAufRechnungVon value: values) {
                getHandeltAufRechnungVon().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withHandeltAufRechnungVon(Collection<CTHandeltAufRechnungVon> values) {
        if (values!= null) {
            getHandeltAufRechnungVon().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withGruppenvertragspartner(CTGruppenvertragspartner... values) {
        if (values!= null) {
            for (CTGruppenvertragspartner value: values) {
                getGruppenvertragspartner().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withGruppenvertragspartner(Collection<CTGruppenvertragspartner> values) {
        if (values!= null) {
            getGruppenvertragspartner().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartnerbeziehung(CTPartnerbeziehung... values) {
        if (values!= null) {
            for (CTPartnerbeziehung value: values) {
                getPartnerbeziehung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartnerbeziehung(Collection<CTPartnerbeziehung> values) {
        if (values!= null) {
            getPartnerbeziehung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withVertrauensperson(CTVertrauensperson value) {
        setVertrauensperson(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withKreditkarte(CTKreditkarte... values) {
        if (values!= null) {
            for (CTKreditkarte value: values) {
                getKreditkarte().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withKreditkarte(Collection<CTKreditkarte> values) {
        if (values!= null) {
            getKreditkarte().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withUmsatzsteuerIdentifikationsnummer(String value) {
        setUmsatzsteuerIdentifikationsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withAltePartnernummer(String value) {
        setAltePartnernummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withBesteuerung(CTBesteuerung value) {
        setBesteuerung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withDirektmarketing(CTWerbeerlaubnis... values) {
        if (values!= null) {
            for (CTWerbeerlaubnis value: values) {
                getDirektmarketing().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withDirektmarketing(Collection<CTWerbeerlaubnis> values) {
        if (values!= null) {
            getDirektmarketing().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withFinanzamt(String value) {
        setFinanzamt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartneranmerkung(String value) {
        setPartneranmerkung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withBriefanrede(String value) {
        setBriefanrede(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withKommunikationspartner(CTKommunikationspartner value) {
        setKommunikationspartner(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartnernummerExtern(CTPartnernummer... values) {
        if (values!= null) {
            for (CTPartnernummer value: values) {
                getPartnernummerExtern().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withPartnernummerExtern(Collection<CTPartnernummer> values) {
        if (values!= null) {
            getPartnernummerExtern().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withVollmachtgeber(CTVollmachtgeber value) {
        setVollmachtgeber(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJuristischePerson withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
