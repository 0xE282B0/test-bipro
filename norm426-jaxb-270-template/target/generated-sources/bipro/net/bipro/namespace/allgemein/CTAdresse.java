
package net.bipro.namespace.allgemein;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STLaenderkennzeichen;
import net.bipro.namespace.partner.CTPartneranschrift;
import net.bipro.namespace.sachen.CTAbgangsort;
import net.bipro.namespace.sachen.CTBestimmungsort;
import net.bipro.namespace.sachen.CTObjektanschrift;
import net.bipro.namespace.versicherung.haftpflicht.CTWagnisanschrift;
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
 * Basisklasse von der alle Anschriften abgeleitet werden.
 * 
 * <p>Java class for CT_Adresse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Adresse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Strasse" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Hausnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text017" minOccurs="0"/&gt;
 *         &lt;element name="Postleitzahl" type="{http://www.bipro.net/namespace/datentypen}ST_Postleitzahl" minOccurs="0"/&gt;
 *         &lt;element name="Ort" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Land" type="{http://www.bipro.net/namespace/datentypen}ST_Laenderkennzeichen" minOccurs="0"/&gt;
 *         &lt;element name="Landname" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Ortsteil" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Referenz" type="{http://www.bipro.net/namespace/datentypen}ST_Referenz" minOccurs="0"/&gt;
 *         &lt;element name="Geoposition" type="{http://www.bipro.net/namespace/allgemein}CT_Geoposition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Adresse", propOrder = {
    "strasse",
    "hausnummer",
    "postleitzahl",
    "ort",
    "land",
    "landname",
    "ortsteil",
    "referenz",
    "geoposition"
})
@XmlSeeAlso({
    CTPartneranschrift.class,
    CTWagnisanschrift.class,
    CTAbgangsort.class,
    CTBestimmungsort.class,
    CTObjektanschrift.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTAdresse
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Strasse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String strasse;
    @XmlElement(name = "Hausnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String hausnummer;
    @XmlElement(name = "Postleitzahl")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String postleitzahl;
    @XmlElement(name = "Ort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String ort;
    @XmlElement(name = "Land")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STLaenderkennzeichen land;
    @XmlElement(name = "Landname")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String landname;
    @XmlElement(name = "Ortsteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String ortsteil;
    @XmlElement(name = "Referenz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String referenz;
    @XmlElement(name = "Geoposition")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTGeoposition geoposition;

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Gets the value of the hausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Sets the value of the hausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the postleitzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Sets the value of the postleitzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setPostleitzahl(String value) {
        this.postleitzahl = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STLaenderkennzeichen getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLand(STLaenderkennzeichen value) {
        this.land = value;
    }

    /**
     * Gets the value of the landname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getLandname() {
        return landname;
    }

    /**
     * Sets the value of the landname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLandname(String value) {
        this.landname = value;
    }

    /**
     * Gets the value of the ortsteil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getOrtsteil() {
        return ortsteil;
    }

    /**
     * Sets the value of the ortsteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setOrtsteil(String value) {
        this.ortsteil = value;
    }

    /**
     * Gets the value of the referenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getReferenz() {
        return referenz;
    }

    /**
     * Sets the value of the referenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setReferenz(String value) {
        this.referenz = value;
    }

    /**
     * Gets the value of the geoposition property.
     * 
     * @return
     *     possible object is
     *     {@link CTGeoposition }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeoposition getGeoposition() {
        return geoposition;
    }

    /**
     * Sets the value of the geoposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGeoposition }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGeoposition(CTGeoposition value) {
        this.geoposition = value;
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
        final CTAdresse that = ((CTAdresse) object);
        {
            String lhsStrasse;
            lhsStrasse = this.getStrasse();
            String rhsStrasse;
            rhsStrasse = that.getStrasse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strasse", lhsStrasse), LocatorUtils.property(thatLocator, "strasse", rhsStrasse), lhsStrasse, rhsStrasse, (this.strasse!= null), (that.strasse!= null))) {
                return false;
            }
        }
        {
            String lhsHausnummer;
            lhsHausnummer = this.getHausnummer();
            String rhsHausnummer;
            rhsHausnummer = that.getHausnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hausnummer", lhsHausnummer), LocatorUtils.property(thatLocator, "hausnummer", rhsHausnummer), lhsHausnummer, rhsHausnummer, (this.hausnummer!= null), (that.hausnummer!= null))) {
                return false;
            }
        }
        {
            String lhsPostleitzahl;
            lhsPostleitzahl = this.getPostleitzahl();
            String rhsPostleitzahl;
            rhsPostleitzahl = that.getPostleitzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postleitzahl", lhsPostleitzahl), LocatorUtils.property(thatLocator, "postleitzahl", rhsPostleitzahl), lhsPostleitzahl, rhsPostleitzahl, (this.postleitzahl!= null), (that.postleitzahl!= null))) {
                return false;
            }
        }
        {
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt, (this.ort!= null), (that.ort!= null))) {
                return false;
            }
        }
        {
            STLaenderkennzeichen lhsLand;
            lhsLand = this.getLand();
            STLaenderkennzeichen rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand, (this.land!= null), (that.land!= null))) {
                return false;
            }
        }
        {
            String lhsLandname;
            lhsLandname = this.getLandname();
            String rhsLandname;
            rhsLandname = that.getLandname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "landname", lhsLandname), LocatorUtils.property(thatLocator, "landname", rhsLandname), lhsLandname, rhsLandname, (this.landname!= null), (that.landname!= null))) {
                return false;
            }
        }
        {
            String lhsOrtsteil;
            lhsOrtsteil = this.getOrtsteil();
            String rhsOrtsteil;
            rhsOrtsteil = that.getOrtsteil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ortsteil", lhsOrtsteil), LocatorUtils.property(thatLocator, "ortsteil", rhsOrtsteil), lhsOrtsteil, rhsOrtsteil, (this.ortsteil!= null), (that.ortsteil!= null))) {
                return false;
            }
        }
        {
            String lhsReferenz;
            lhsReferenz = this.getReferenz();
            String rhsReferenz;
            rhsReferenz = that.getReferenz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenz", lhsReferenz), LocatorUtils.property(thatLocator, "referenz", rhsReferenz), lhsReferenz, rhsReferenz, (this.referenz!= null), (that.referenz!= null))) {
                return false;
            }
        }
        {
            CTGeoposition lhsGeoposition;
            lhsGeoposition = this.getGeoposition();
            CTGeoposition rhsGeoposition;
            rhsGeoposition = that.getGeoposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoposition", lhsGeoposition), LocatorUtils.property(thatLocator, "geoposition", rhsGeoposition), lhsGeoposition, rhsGeoposition, (this.geoposition!= null), (that.geoposition!= null))) {
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
            String theStrasse;
            theStrasse = this.getStrasse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strasse", theStrasse), currentHashCode, theStrasse, (this.strasse!= null));
        }
        {
            String theHausnummer;
            theHausnummer = this.getHausnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hausnummer", theHausnummer), currentHashCode, theHausnummer, (this.hausnummer!= null));
        }
        {
            String thePostleitzahl;
            thePostleitzahl = this.getPostleitzahl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postleitzahl", thePostleitzahl), currentHashCode, thePostleitzahl, (this.postleitzahl!= null));
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ort", theOrt), currentHashCode, theOrt, (this.ort!= null));
        }
        {
            STLaenderkennzeichen theLand;
            theLand = this.getLand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "land", theLand), currentHashCode, theLand, (this.land!= null));
        }
        {
            String theLandname;
            theLandname = this.getLandname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "landname", theLandname), currentHashCode, theLandname, (this.landname!= null));
        }
        {
            String theOrtsteil;
            theOrtsteil = this.getOrtsteil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ortsteil", theOrtsteil), currentHashCode, theOrtsteil, (this.ortsteil!= null));
        }
        {
            String theReferenz;
            theReferenz = this.getReferenz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenz", theReferenz), currentHashCode, theReferenz, (this.referenz!= null));
        }
        {
            CTGeoposition theGeoposition;
            theGeoposition = this.getGeoposition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geoposition", theGeoposition), currentHashCode, theGeoposition, (this.geoposition!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTAdresse) {
            final CTAdresse copy = ((CTAdresse) target);
            {
                Boolean strasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.strasse!= null));
                if (strasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStrasse;
                    sourceStrasse = this.getStrasse();
                    String copyStrasse = ((String) strategy.copy(LocatorUtils.property(locator, "strasse", sourceStrasse), sourceStrasse, (this.strasse!= null)));
                    copy.setStrasse(copyStrasse);
                } else {
                    if (strasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.strasse = null;
                    }
                }
            }
            {
                Boolean hausnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hausnummer!= null));
                if (hausnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHausnummer;
                    sourceHausnummer = this.getHausnummer();
                    String copyHausnummer = ((String) strategy.copy(LocatorUtils.property(locator, "hausnummer", sourceHausnummer), sourceHausnummer, (this.hausnummer!= null)));
                    copy.setHausnummer(copyHausnummer);
                } else {
                    if (hausnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hausnummer = null;
                    }
                }
            }
            {
                Boolean postleitzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postleitzahl!= null));
                if (postleitzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostleitzahl;
                    sourcePostleitzahl = this.getPostleitzahl();
                    String copyPostleitzahl = ((String) strategy.copy(LocatorUtils.property(locator, "postleitzahl", sourcePostleitzahl), sourcePostleitzahl, (this.postleitzahl!= null)));
                    copy.setPostleitzahl(copyPostleitzahl);
                } else {
                    if (postleitzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postleitzahl = null;
                    }
                }
            }
            {
                Boolean ortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ort!= null));
                if (ortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrt;
                    sourceOrt = this.getOrt();
                    String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt, (this.ort!= null)));
                    copy.setOrt(copyOrt);
                } else {
                    if (ortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ort = null;
                    }
                }
            }
            {
                Boolean landShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.land!= null));
                if (landShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLaenderkennzeichen sourceLand;
                    sourceLand = this.getLand();
                    STLaenderkennzeichen copyLand = ((STLaenderkennzeichen) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand, (this.land!= null)));
                    copy.setLand(copyLand);
                } else {
                    if (landShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.land = null;
                    }
                }
            }
            {
                Boolean landnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.landname!= null));
                if (landnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLandname;
                    sourceLandname = this.getLandname();
                    String copyLandname = ((String) strategy.copy(LocatorUtils.property(locator, "landname", sourceLandname), sourceLandname, (this.landname!= null)));
                    copy.setLandname(copyLandname);
                } else {
                    if (landnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.landname = null;
                    }
                }
            }
            {
                Boolean ortsteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ortsteil!= null));
                if (ortsteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrtsteil;
                    sourceOrtsteil = this.getOrtsteil();
                    String copyOrtsteil = ((String) strategy.copy(LocatorUtils.property(locator, "ortsteil", sourceOrtsteil), sourceOrtsteil, (this.ortsteil!= null)));
                    copy.setOrtsteil(copyOrtsteil);
                } else {
                    if (ortsteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ortsteil = null;
                    }
                }
            }
            {
                Boolean referenzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referenz!= null));
                if (referenzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReferenz;
                    sourceReferenz = this.getReferenz();
                    String copyReferenz = ((String) strategy.copy(LocatorUtils.property(locator, "referenz", sourceReferenz), sourceReferenz, (this.referenz!= null)));
                    copy.setReferenz(copyReferenz);
                } else {
                    if (referenzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenz = null;
                    }
                }
            }
            {
                Boolean geopositionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geoposition!= null));
                if (geopositionShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGeoposition sourceGeoposition;
                    sourceGeoposition = this.getGeoposition();
                    CTGeoposition copyGeoposition = ((CTGeoposition) strategy.copy(LocatorUtils.property(locator, "geoposition", sourceGeoposition), sourceGeoposition, (this.geoposition!= null)));
                    copy.setGeoposition(copyGeoposition);
                } else {
                    if (geopositionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoposition = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withStrasse(String value) {
        setStrasse(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withHausnummer(String value) {
        setHausnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withPostleitzahl(String value) {
        setPostleitzahl(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withOrt(String value) {
        setOrt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withLand(STLaenderkennzeichen value) {
        setLand(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withLandname(String value) {
        setLandname(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withOrtsteil(String value) {
        setOrtsteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withGeoposition(CTGeoposition value) {
        setGeoposition(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAdresse withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
