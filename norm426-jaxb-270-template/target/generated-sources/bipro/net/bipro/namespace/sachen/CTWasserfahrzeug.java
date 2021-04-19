
package net.bipro.namespace.sachen;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STBootMotorlage;
import net.bipro.namespace.datentypen.STLaenderkennzeichen;
import net.bipro.namespace.datentypen.STWasserfahrzeugtyp;
import net.bipro.namespace.datentypen.STWerteinheit;
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
 * Wasserfahrzeuge sind Fahrzeuge, die zur Fortbewegung auf dem oder im Wasser bestimmt sind.
 * 
 * <p>Java class for CT_Wasserfahrzeug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Wasserfahrzeug"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Wasserfahrzeugtyp" type="{http://www.bipro.net/namespace/datentypen}ST_Wasserfahrzeugtyp" minOccurs="0"/&gt;
 *         &lt;element name="StaendigerLiegeplatz" type="{http://www.bipro.net/namespace/datentypen}ST_Laenderkennzeichen" minOccurs="0"/&gt;
 *         &lt;element name="Registrierung" type="{http://www.bipro.net/namespace/datentypen}ST_SportbootRegistriernummer" minOccurs="0"/&gt;
 *         &lt;element name="Motornummer" type="{http://www.bipro.net/namespace/datentypen}ST_SportbootMotornummer" minOccurs="0"/&gt;
 *         &lt;element name="Motorlage" type="{http://www.bipro.net/namespace/datentypen}ST_BootMotorlage" minOccurs="0"/&gt;
 *         &lt;element name="Baujahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Ladefaehigkeit" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="LadefaehigkeitEinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Motorleistung" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlFassendePersonen" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Segelflaeche" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="EingetragenerNameSchiffsregister" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="SchiffsregisterOrt" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Wasserfahrzeug", propOrder = {
    "wasserfahrzeugtyp",
    "staendigerLiegeplatz",
    "registrierung",
    "motornummer",
    "motorlage",
    "baujahr",
    "ladefaehigkeit",
    "ladefaehigkeitEinheit",
    "motorleistung",
    "anzahlFassendePersonen",
    "segelflaeche",
    "eingetragenerNameSchiffsregister",
    "schiffsregisterOrt"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTWasserfahrzeug
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Wasserfahrzeugtyp")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWasserfahrzeugtyp wasserfahrzeugtyp;
    @XmlElement(name = "StaendigerLiegeplatz")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STLaenderkennzeichen staendigerLiegeplatz;
    @XmlElement(name = "Registrierung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String registrierung;
    @XmlElement(name = "Motornummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String motornummer;
    @XmlElement(name = "Motorlage")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBootMotorlage motorlage;
    @XmlElement(name = "Baujahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer baujahr;
    @XmlElement(name = "Ladefaehigkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal ladefaehigkeit;
    @XmlElement(name = "LadefaehigkeitEinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit ladefaehigkeitEinheit;
    @XmlElement(name = "Motorleistung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal motorleistung;
    @XmlElement(name = "AnzahlFassendePersonen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlFassendePersonen;
    @XmlElement(name = "Segelflaeche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer segelflaeche;
    @XmlElement(name = "EingetragenerNameSchiffsregister")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String eingetragenerNameSchiffsregister;
    @XmlElement(name = "SchiffsregisterOrt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String schiffsregisterOrt;

    /**
     * Gets the value of the wasserfahrzeugtyp property.
     * 
     * @return
     *     possible object is
     *     {@link STWasserfahrzeugtyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWasserfahrzeugtyp getWasserfahrzeugtyp() {
        return wasserfahrzeugtyp;
    }

    /**
     * Sets the value of the wasserfahrzeugtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWasserfahrzeugtyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWasserfahrzeugtyp(STWasserfahrzeugtyp value) {
        this.wasserfahrzeugtyp = value;
    }

    /**
     * Gets the value of the staendigerLiegeplatz property.
     * 
     * @return
     *     possible object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STLaenderkennzeichen getStaendigerLiegeplatz() {
        return staendigerLiegeplatz;
    }

    /**
     * Sets the value of the staendigerLiegeplatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStaendigerLiegeplatz(STLaenderkennzeichen value) {
        this.staendigerLiegeplatz = value;
    }

    /**
     * Gets the value of the registrierung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getRegistrierung() {
        return registrierung;
    }

    /**
     * Sets the value of the registrierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setRegistrierung(String value) {
        this.registrierung = value;
    }

    /**
     * Gets the value of the motornummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getMotornummer() {
        return motornummer;
    }

    /**
     * Sets the value of the motornummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMotornummer(String value) {
        this.motornummer = value;
    }

    /**
     * Gets the value of the motorlage property.
     * 
     * @return
     *     possible object is
     *     {@link STBootMotorlage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBootMotorlage getMotorlage() {
        return motorlage;
    }

    /**
     * Sets the value of the motorlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBootMotorlage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMotorlage(STBootMotorlage value) {
        this.motorlage = value;
    }

    /**
     * Gets the value of the baujahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getBaujahr() {
        return baujahr;
    }

    /**
     * Sets the value of the baujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBaujahr(Integer value) {
        this.baujahr = value;
    }

    /**
     * Gets the value of the ladefaehigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getLadefaehigkeit() {
        return ladefaehigkeit;
    }

    /**
     * Sets the value of the ladefaehigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLadefaehigkeit(BigDecimal value) {
        this.ladefaehigkeit = value;
    }

    /**
     * Gets the value of the ladefaehigkeitEinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getLadefaehigkeitEinheit() {
        return ladefaehigkeitEinheit;
    }

    /**
     * Sets the value of the ladefaehigkeitEinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLadefaehigkeitEinheit(STWerteinheit value) {
        this.ladefaehigkeitEinheit = value;
    }

    /**
     * Gets the value of the motorleistung property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getMotorleistung() {
        return motorleistung;
    }

    /**
     * Sets the value of the motorleistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMotorleistung(BigDecimal value) {
        this.motorleistung = value;
    }

    /**
     * Gets the value of the anzahlFassendePersonen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlFassendePersonen() {
        return anzahlFassendePersonen;
    }

    /**
     * Sets the value of the anzahlFassendePersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlFassendePersonen(Integer value) {
        this.anzahlFassendePersonen = value;
    }

    /**
     * Gets the value of the segelflaeche property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getSegelflaeche() {
        return segelflaeche;
    }

    /**
     * Sets the value of the segelflaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSegelflaeche(Integer value) {
        this.segelflaeche = value;
    }

    /**
     * Gets the value of the eingetragenerNameSchiffsregister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getEingetragenerNameSchiffsregister() {
        return eingetragenerNameSchiffsregister;
    }

    /**
     * Sets the value of the eingetragenerNameSchiffsregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setEingetragenerNameSchiffsregister(String value) {
        this.eingetragenerNameSchiffsregister = value;
    }

    /**
     * Gets the value of the schiffsregisterOrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getSchiffsregisterOrt() {
        return schiffsregisterOrt;
    }

    /**
     * Sets the value of the schiffsregisterOrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSchiffsregisterOrt(String value) {
        this.schiffsregisterOrt = value;
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
        final CTWasserfahrzeug that = ((CTWasserfahrzeug) object);
        {
            STWasserfahrzeugtyp lhsWasserfahrzeugtyp;
            lhsWasserfahrzeugtyp = this.getWasserfahrzeugtyp();
            STWasserfahrzeugtyp rhsWasserfahrzeugtyp;
            rhsWasserfahrzeugtyp = that.getWasserfahrzeugtyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wasserfahrzeugtyp", lhsWasserfahrzeugtyp), LocatorUtils.property(thatLocator, "wasserfahrzeugtyp", rhsWasserfahrzeugtyp), lhsWasserfahrzeugtyp, rhsWasserfahrzeugtyp, (this.wasserfahrzeugtyp!= null), (that.wasserfahrzeugtyp!= null))) {
                return false;
            }
        }
        {
            STLaenderkennzeichen lhsStaendigerLiegeplatz;
            lhsStaendigerLiegeplatz = this.getStaendigerLiegeplatz();
            STLaenderkennzeichen rhsStaendigerLiegeplatz;
            rhsStaendigerLiegeplatz = that.getStaendigerLiegeplatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "staendigerLiegeplatz", lhsStaendigerLiegeplatz), LocatorUtils.property(thatLocator, "staendigerLiegeplatz", rhsStaendigerLiegeplatz), lhsStaendigerLiegeplatz, rhsStaendigerLiegeplatz, (this.staendigerLiegeplatz!= null), (that.staendigerLiegeplatz!= null))) {
                return false;
            }
        }
        {
            String lhsRegistrierung;
            lhsRegistrierung = this.getRegistrierung();
            String rhsRegistrierung;
            rhsRegistrierung = that.getRegistrierung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrierung", lhsRegistrierung), LocatorUtils.property(thatLocator, "registrierung", rhsRegistrierung), lhsRegistrierung, rhsRegistrierung, (this.registrierung!= null), (that.registrierung!= null))) {
                return false;
            }
        }
        {
            String lhsMotornummer;
            lhsMotornummer = this.getMotornummer();
            String rhsMotornummer;
            rhsMotornummer = that.getMotornummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "motornummer", lhsMotornummer), LocatorUtils.property(thatLocator, "motornummer", rhsMotornummer), lhsMotornummer, rhsMotornummer, (this.motornummer!= null), (that.motornummer!= null))) {
                return false;
            }
        }
        {
            STBootMotorlage lhsMotorlage;
            lhsMotorlage = this.getMotorlage();
            STBootMotorlage rhsMotorlage;
            rhsMotorlage = that.getMotorlage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "motorlage", lhsMotorlage), LocatorUtils.property(thatLocator, "motorlage", rhsMotorlage), lhsMotorlage, rhsMotorlage, (this.motorlage!= null), (that.motorlage!= null))) {
                return false;
            }
        }
        {
            Integer lhsBaujahr;
            lhsBaujahr = this.getBaujahr();
            Integer rhsBaujahr;
            rhsBaujahr = that.getBaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baujahr", lhsBaujahr), LocatorUtils.property(thatLocator, "baujahr", rhsBaujahr), lhsBaujahr, rhsBaujahr, (this.baujahr!= null), (that.baujahr!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLadefaehigkeit;
            lhsLadefaehigkeit = this.getLadefaehigkeit();
            BigDecimal rhsLadefaehigkeit;
            rhsLadefaehigkeit = that.getLadefaehigkeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ladefaehigkeit", lhsLadefaehigkeit), LocatorUtils.property(thatLocator, "ladefaehigkeit", rhsLadefaehigkeit), lhsLadefaehigkeit, rhsLadefaehigkeit, (this.ladefaehigkeit!= null), (that.ladefaehigkeit!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsLadefaehigkeitEinheit;
            lhsLadefaehigkeitEinheit = this.getLadefaehigkeitEinheit();
            STWerteinheit rhsLadefaehigkeitEinheit;
            rhsLadefaehigkeitEinheit = that.getLadefaehigkeitEinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ladefaehigkeitEinheit", lhsLadefaehigkeitEinheit), LocatorUtils.property(thatLocator, "ladefaehigkeitEinheit", rhsLadefaehigkeitEinheit), lhsLadefaehigkeitEinheit, rhsLadefaehigkeitEinheit, (this.ladefaehigkeitEinheit!= null), (that.ladefaehigkeitEinheit!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMotorleistung;
            lhsMotorleistung = this.getMotorleistung();
            BigDecimal rhsMotorleistung;
            rhsMotorleistung = that.getMotorleistung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "motorleistung", lhsMotorleistung), LocatorUtils.property(thatLocator, "motorleistung", rhsMotorleistung), lhsMotorleistung, rhsMotorleistung, (this.motorleistung!= null), (that.motorleistung!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlFassendePersonen;
            lhsAnzahlFassendePersonen = this.getAnzahlFassendePersonen();
            Integer rhsAnzahlFassendePersonen;
            rhsAnzahlFassendePersonen = that.getAnzahlFassendePersonen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlFassendePersonen", lhsAnzahlFassendePersonen), LocatorUtils.property(thatLocator, "anzahlFassendePersonen", rhsAnzahlFassendePersonen), lhsAnzahlFassendePersonen, rhsAnzahlFassendePersonen, (this.anzahlFassendePersonen!= null), (that.anzahlFassendePersonen!= null))) {
                return false;
            }
        }
        {
            Integer lhsSegelflaeche;
            lhsSegelflaeche = this.getSegelflaeche();
            Integer rhsSegelflaeche;
            rhsSegelflaeche = that.getSegelflaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "segelflaeche", lhsSegelflaeche), LocatorUtils.property(thatLocator, "segelflaeche", rhsSegelflaeche), lhsSegelflaeche, rhsSegelflaeche, (this.segelflaeche!= null), (that.segelflaeche!= null))) {
                return false;
            }
        }
        {
            String lhsEingetragenerNameSchiffsregister;
            lhsEingetragenerNameSchiffsregister = this.getEingetragenerNameSchiffsregister();
            String rhsEingetragenerNameSchiffsregister;
            rhsEingetragenerNameSchiffsregister = that.getEingetragenerNameSchiffsregister();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eingetragenerNameSchiffsregister", lhsEingetragenerNameSchiffsregister), LocatorUtils.property(thatLocator, "eingetragenerNameSchiffsregister", rhsEingetragenerNameSchiffsregister), lhsEingetragenerNameSchiffsregister, rhsEingetragenerNameSchiffsregister, (this.eingetragenerNameSchiffsregister!= null), (that.eingetragenerNameSchiffsregister!= null))) {
                return false;
            }
        }
        {
            String lhsSchiffsregisterOrt;
            lhsSchiffsregisterOrt = this.getSchiffsregisterOrt();
            String rhsSchiffsregisterOrt;
            rhsSchiffsregisterOrt = that.getSchiffsregisterOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schiffsregisterOrt", lhsSchiffsregisterOrt), LocatorUtils.property(thatLocator, "schiffsregisterOrt", rhsSchiffsregisterOrt), lhsSchiffsregisterOrt, rhsSchiffsregisterOrt, (this.schiffsregisterOrt!= null), (that.schiffsregisterOrt!= null))) {
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
            STWasserfahrzeugtyp theWasserfahrzeugtyp;
            theWasserfahrzeugtyp = this.getWasserfahrzeugtyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wasserfahrzeugtyp", theWasserfahrzeugtyp), currentHashCode, theWasserfahrzeugtyp, (this.wasserfahrzeugtyp!= null));
        }
        {
            STLaenderkennzeichen theStaendigerLiegeplatz;
            theStaendigerLiegeplatz = this.getStaendigerLiegeplatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "staendigerLiegeplatz", theStaendigerLiegeplatz), currentHashCode, theStaendigerLiegeplatz, (this.staendigerLiegeplatz!= null));
        }
        {
            String theRegistrierung;
            theRegistrierung = this.getRegistrierung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrierung", theRegistrierung), currentHashCode, theRegistrierung, (this.registrierung!= null));
        }
        {
            String theMotornummer;
            theMotornummer = this.getMotornummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "motornummer", theMotornummer), currentHashCode, theMotornummer, (this.motornummer!= null));
        }
        {
            STBootMotorlage theMotorlage;
            theMotorlage = this.getMotorlage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "motorlage", theMotorlage), currentHashCode, theMotorlage, (this.motorlage!= null));
        }
        {
            Integer theBaujahr;
            theBaujahr = this.getBaujahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baujahr", theBaujahr), currentHashCode, theBaujahr, (this.baujahr!= null));
        }
        {
            BigDecimal theLadefaehigkeit;
            theLadefaehigkeit = this.getLadefaehigkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ladefaehigkeit", theLadefaehigkeit), currentHashCode, theLadefaehigkeit, (this.ladefaehigkeit!= null));
        }
        {
            STWerteinheit theLadefaehigkeitEinheit;
            theLadefaehigkeitEinheit = this.getLadefaehigkeitEinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ladefaehigkeitEinheit", theLadefaehigkeitEinheit), currentHashCode, theLadefaehigkeitEinheit, (this.ladefaehigkeitEinheit!= null));
        }
        {
            BigDecimal theMotorleistung;
            theMotorleistung = this.getMotorleistung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "motorleistung", theMotorleistung), currentHashCode, theMotorleistung, (this.motorleistung!= null));
        }
        {
            Integer theAnzahlFassendePersonen;
            theAnzahlFassendePersonen = this.getAnzahlFassendePersonen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlFassendePersonen", theAnzahlFassendePersonen), currentHashCode, theAnzahlFassendePersonen, (this.anzahlFassendePersonen!= null));
        }
        {
            Integer theSegelflaeche;
            theSegelflaeche = this.getSegelflaeche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "segelflaeche", theSegelflaeche), currentHashCode, theSegelflaeche, (this.segelflaeche!= null));
        }
        {
            String theEingetragenerNameSchiffsregister;
            theEingetragenerNameSchiffsregister = this.getEingetragenerNameSchiffsregister();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eingetragenerNameSchiffsregister", theEingetragenerNameSchiffsregister), currentHashCode, theEingetragenerNameSchiffsregister, (this.eingetragenerNameSchiffsregister!= null));
        }
        {
            String theSchiffsregisterOrt;
            theSchiffsregisterOrt = this.getSchiffsregisterOrt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schiffsregisterOrt", theSchiffsregisterOrt), currentHashCode, theSchiffsregisterOrt, (this.schiffsregisterOrt!= null));
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
        if (draftCopy instanceof CTWasserfahrzeug) {
            final CTWasserfahrzeug copy = ((CTWasserfahrzeug) draftCopy);
            {
                Boolean wasserfahrzeugtypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wasserfahrzeugtyp!= null));
                if (wasserfahrzeugtypShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWasserfahrzeugtyp sourceWasserfahrzeugtyp;
                    sourceWasserfahrzeugtyp = this.getWasserfahrzeugtyp();
                    STWasserfahrzeugtyp copyWasserfahrzeugtyp = ((STWasserfahrzeugtyp) strategy.copy(LocatorUtils.property(locator, "wasserfahrzeugtyp", sourceWasserfahrzeugtyp), sourceWasserfahrzeugtyp, (this.wasserfahrzeugtyp!= null)));
                    copy.setWasserfahrzeugtyp(copyWasserfahrzeugtyp);
                } else {
                    if (wasserfahrzeugtypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wasserfahrzeugtyp = null;
                    }
                }
            }
            {
                Boolean staendigerLiegeplatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.staendigerLiegeplatz!= null));
                if (staendigerLiegeplatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLaenderkennzeichen sourceStaendigerLiegeplatz;
                    sourceStaendigerLiegeplatz = this.getStaendigerLiegeplatz();
                    STLaenderkennzeichen copyStaendigerLiegeplatz = ((STLaenderkennzeichen) strategy.copy(LocatorUtils.property(locator, "staendigerLiegeplatz", sourceStaendigerLiegeplatz), sourceStaendigerLiegeplatz, (this.staendigerLiegeplatz!= null)));
                    copy.setStaendigerLiegeplatz(copyStaendigerLiegeplatz);
                } else {
                    if (staendigerLiegeplatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.staendigerLiegeplatz = null;
                    }
                }
            }
            {
                Boolean registrierungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.registrierung!= null));
                if (registrierungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRegistrierung;
                    sourceRegistrierung = this.getRegistrierung();
                    String copyRegistrierung = ((String) strategy.copy(LocatorUtils.property(locator, "registrierung", sourceRegistrierung), sourceRegistrierung, (this.registrierung!= null)));
                    copy.setRegistrierung(copyRegistrierung);
                } else {
                    if (registrierungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.registrierung = null;
                    }
                }
            }
            {
                Boolean motornummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.motornummer!= null));
                if (motornummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMotornummer;
                    sourceMotornummer = this.getMotornummer();
                    String copyMotornummer = ((String) strategy.copy(LocatorUtils.property(locator, "motornummer", sourceMotornummer), sourceMotornummer, (this.motornummer!= null)));
                    copy.setMotornummer(copyMotornummer);
                } else {
                    if (motornummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.motornummer = null;
                    }
                }
            }
            {
                Boolean motorlageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.motorlage!= null));
                if (motorlageShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBootMotorlage sourceMotorlage;
                    sourceMotorlage = this.getMotorlage();
                    STBootMotorlage copyMotorlage = ((STBootMotorlage) strategy.copy(LocatorUtils.property(locator, "motorlage", sourceMotorlage), sourceMotorlage, (this.motorlage!= null)));
                    copy.setMotorlage(copyMotorlage);
                } else {
                    if (motorlageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.motorlage = null;
                    }
                }
            }
            {
                Boolean baujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baujahr!= null));
                if (baujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceBaujahr;
                    sourceBaujahr = this.getBaujahr();
                    Integer copyBaujahr = ((Integer) strategy.copy(LocatorUtils.property(locator, "baujahr", sourceBaujahr), sourceBaujahr, (this.baujahr!= null)));
                    copy.setBaujahr(copyBaujahr);
                } else {
                    if (baujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baujahr = null;
                    }
                }
            }
            {
                Boolean ladefaehigkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ladefaehigkeit!= null));
                if (ladefaehigkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLadefaehigkeit;
                    sourceLadefaehigkeit = this.getLadefaehigkeit();
                    BigDecimal copyLadefaehigkeit = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "ladefaehigkeit", sourceLadefaehigkeit), sourceLadefaehigkeit, (this.ladefaehigkeit!= null)));
                    copy.setLadefaehigkeit(copyLadefaehigkeit);
                } else {
                    if (ladefaehigkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ladefaehigkeit = null;
                    }
                }
            }
            {
                Boolean ladefaehigkeitEinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ladefaehigkeitEinheit!= null));
                if (ladefaehigkeitEinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceLadefaehigkeitEinheit;
                    sourceLadefaehigkeitEinheit = this.getLadefaehigkeitEinheit();
                    STWerteinheit copyLadefaehigkeitEinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "ladefaehigkeitEinheit", sourceLadefaehigkeitEinheit), sourceLadefaehigkeitEinheit, (this.ladefaehigkeitEinheit!= null)));
                    copy.setLadefaehigkeitEinheit(copyLadefaehigkeitEinheit);
                } else {
                    if (ladefaehigkeitEinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ladefaehigkeitEinheit = null;
                    }
                }
            }
            {
                Boolean motorleistungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.motorleistung!= null));
                if (motorleistungShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMotorleistung;
                    sourceMotorleistung = this.getMotorleistung();
                    BigDecimal copyMotorleistung = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "motorleistung", sourceMotorleistung), sourceMotorleistung, (this.motorleistung!= null)));
                    copy.setMotorleistung(copyMotorleistung);
                } else {
                    if (motorleistungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.motorleistung = null;
                    }
                }
            }
            {
                Boolean anzahlFassendePersonenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlFassendePersonen!= null));
                if (anzahlFassendePersonenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlFassendePersonen;
                    sourceAnzahlFassendePersonen = this.getAnzahlFassendePersonen();
                    Integer copyAnzahlFassendePersonen = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlFassendePersonen", sourceAnzahlFassendePersonen), sourceAnzahlFassendePersonen, (this.anzahlFassendePersonen!= null)));
                    copy.setAnzahlFassendePersonen(copyAnzahlFassendePersonen);
                } else {
                    if (anzahlFassendePersonenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlFassendePersonen = null;
                    }
                }
            }
            {
                Boolean segelflaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.segelflaeche!= null));
                if (segelflaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceSegelflaeche;
                    sourceSegelflaeche = this.getSegelflaeche();
                    Integer copySegelflaeche = ((Integer) strategy.copy(LocatorUtils.property(locator, "segelflaeche", sourceSegelflaeche), sourceSegelflaeche, (this.segelflaeche!= null)));
                    copy.setSegelflaeche(copySegelflaeche);
                } else {
                    if (segelflaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.segelflaeche = null;
                    }
                }
            }
            {
                Boolean eingetragenerNameSchiffsregisterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.eingetragenerNameSchiffsregister!= null));
                if (eingetragenerNameSchiffsregisterShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEingetragenerNameSchiffsregister;
                    sourceEingetragenerNameSchiffsregister = this.getEingetragenerNameSchiffsregister();
                    String copyEingetragenerNameSchiffsregister = ((String) strategy.copy(LocatorUtils.property(locator, "eingetragenerNameSchiffsregister", sourceEingetragenerNameSchiffsregister), sourceEingetragenerNameSchiffsregister, (this.eingetragenerNameSchiffsregister!= null)));
                    copy.setEingetragenerNameSchiffsregister(copyEingetragenerNameSchiffsregister);
                } else {
                    if (eingetragenerNameSchiffsregisterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eingetragenerNameSchiffsregister = null;
                    }
                }
            }
            {
                Boolean schiffsregisterOrtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.schiffsregisterOrt!= null));
                if (schiffsregisterOrtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSchiffsregisterOrt;
                    sourceSchiffsregisterOrt = this.getSchiffsregisterOrt();
                    String copySchiffsregisterOrt = ((String) strategy.copy(LocatorUtils.property(locator, "schiffsregisterOrt", sourceSchiffsregisterOrt), sourceSchiffsregisterOrt, (this.schiffsregisterOrt!= null)));
                    copy.setSchiffsregisterOrt(copySchiffsregisterOrt);
                } else {
                    if (schiffsregisterOrtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schiffsregisterOrt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTWasserfahrzeug();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withWasserfahrzeugtyp(STWasserfahrzeugtyp value) {
        setWasserfahrzeugtyp(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withStaendigerLiegeplatz(STLaenderkennzeichen value) {
        setStaendigerLiegeplatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withRegistrierung(String value) {
        setRegistrierung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withMotornummer(String value) {
        setMotornummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withMotorlage(STBootMotorlage value) {
        setMotorlage(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withBaujahr(Integer value) {
        setBaujahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withLadefaehigkeit(BigDecimal value) {
        setLadefaehigkeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withLadefaehigkeitEinheit(STWerteinheit value) {
        setLadefaehigkeitEinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withMotorleistung(BigDecimal value) {
        setMotorleistung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withAnzahlFassendePersonen(Integer value) {
        setAnzahlFassendePersonen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withSegelflaeche(Integer value) {
        setSegelflaeche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withEingetragenerNameSchiffsregister(String value) {
        setEingetragenerNameSchiffsregister(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withSchiffsregisterOrt(String value) {
        setSchiffsregisterOrt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWasserfahrzeug withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
