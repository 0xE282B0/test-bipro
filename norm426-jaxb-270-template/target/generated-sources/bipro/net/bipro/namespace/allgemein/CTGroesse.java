
package net.bipro.namespace.allgemein;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
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
 * Die physische Ausdehnung eines Gegenstandes.
 * 
 * <p>Java class for CT_Groesse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Groesse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Laenge" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Breite" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Hoehe" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Umfang" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="LaengenWerteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Flaeche" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="FlaechenWerteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Volumen" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="VolumenWerteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Groesse", propOrder = {
    "laenge",
    "breite",
    "hoehe",
    "umfang",
    "laengenWerteinheit",
    "flaeche",
    "flaechenWerteinheit",
    "volumen",
    "volumenWerteinheit"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGroesse
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Laenge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal laenge;
    @XmlElement(name = "Breite")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal breite;
    @XmlElement(name = "Hoehe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal hoehe;
    @XmlElement(name = "Umfang")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal umfang;
    @XmlElement(name = "LaengenWerteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit laengenWerteinheit;
    @XmlElement(name = "Flaeche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal flaeche;
    @XmlElement(name = "FlaechenWerteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit flaechenWerteinheit;
    @XmlElement(name = "Volumen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal volumen;
    @XmlElement(name = "VolumenWerteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit volumenWerteinheit;

    /**
     * Gets the value of the laenge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getLaenge() {
        return laenge;
    }

    /**
     * Sets the value of the laenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLaenge(BigDecimal value) {
        this.laenge = value;
    }

    /**
     * Gets the value of the breite property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBreite() {
        return breite;
    }

    /**
     * Sets the value of the breite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBreite(BigDecimal value) {
        this.breite = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setHoehe(BigDecimal value) {
        this.hoehe = value;
    }

    /**
     * Gets the value of the umfang property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getUmfang() {
        return umfang;
    }

    /**
     * Sets the value of the umfang property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUmfang(BigDecimal value) {
        this.umfang = value;
    }

    /**
     * Gets the value of the laengenWerteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getLaengenWerteinheit() {
        return laengenWerteinheit;
    }

    /**
     * Sets the value of the laengenWerteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLaengenWerteinheit(STWerteinheit value) {
        this.laengenWerteinheit = value;
    }

    /**
     * Gets the value of the flaeche property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getFlaeche() {
        return flaeche;
    }

    /**
     * Sets the value of the flaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFlaeche(BigDecimal value) {
        this.flaeche = value;
    }

    /**
     * Gets the value of the flaechenWerteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getFlaechenWerteinheit() {
        return flaechenWerteinheit;
    }

    /**
     * Sets the value of the flaechenWerteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFlaechenWerteinheit(STWerteinheit value) {
        this.flaechenWerteinheit = value;
    }

    /**
     * Gets the value of the volumen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getVolumen() {
        return volumen;
    }

    /**
     * Sets the value of the volumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVolumen(BigDecimal value) {
        this.volumen = value;
    }

    /**
     * Gets the value of the volumenWerteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getVolumenWerteinheit() {
        return volumenWerteinheit;
    }

    /**
     * Sets the value of the volumenWerteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVolumenWerteinheit(STWerteinheit value) {
        this.volumenWerteinheit = value;
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
        final CTGroesse that = ((CTGroesse) object);
        {
            BigDecimal lhsLaenge;
            lhsLaenge = this.getLaenge();
            BigDecimal rhsLaenge;
            rhsLaenge = that.getLaenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laenge", lhsLaenge), LocatorUtils.property(thatLocator, "laenge", rhsLaenge), lhsLaenge, rhsLaenge, (this.laenge!= null), (that.laenge!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBreite;
            lhsBreite = this.getBreite();
            BigDecimal rhsBreite;
            rhsBreite = that.getBreite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "breite", lhsBreite), LocatorUtils.property(thatLocator, "breite", rhsBreite), lhsBreite, rhsBreite, (this.breite!= null), (that.breite!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHoehe;
            lhsHoehe = this.getHoehe();
            BigDecimal rhsHoehe;
            rhsHoehe = that.getHoehe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hoehe", lhsHoehe), LocatorUtils.property(thatLocator, "hoehe", rhsHoehe), lhsHoehe, rhsHoehe, (this.hoehe!= null), (that.hoehe!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsUmfang;
            lhsUmfang = this.getUmfang();
            BigDecimal rhsUmfang;
            rhsUmfang = that.getUmfang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umfang", lhsUmfang), LocatorUtils.property(thatLocator, "umfang", rhsUmfang), lhsUmfang, rhsUmfang, (this.umfang!= null), (that.umfang!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsLaengenWerteinheit;
            lhsLaengenWerteinheit = this.getLaengenWerteinheit();
            STWerteinheit rhsLaengenWerteinheit;
            rhsLaengenWerteinheit = that.getLaengenWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laengenWerteinheit", lhsLaengenWerteinheit), LocatorUtils.property(thatLocator, "laengenWerteinheit", rhsLaengenWerteinheit), lhsLaengenWerteinheit, rhsLaengenWerteinheit, (this.laengenWerteinheit!= null), (that.laengenWerteinheit!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFlaeche;
            lhsFlaeche = this.getFlaeche();
            BigDecimal rhsFlaeche;
            rhsFlaeche = that.getFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaeche", lhsFlaeche), LocatorUtils.property(thatLocator, "flaeche", rhsFlaeche), lhsFlaeche, rhsFlaeche, (this.flaeche!= null), (that.flaeche!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsFlaechenWerteinheit;
            lhsFlaechenWerteinheit = this.getFlaechenWerteinheit();
            STWerteinheit rhsFlaechenWerteinheit;
            rhsFlaechenWerteinheit = that.getFlaechenWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaechenWerteinheit", lhsFlaechenWerteinheit), LocatorUtils.property(thatLocator, "flaechenWerteinheit", rhsFlaechenWerteinheit), lhsFlaechenWerteinheit, rhsFlaechenWerteinheit, (this.flaechenWerteinheit!= null), (that.flaechenWerteinheit!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVolumen;
            lhsVolumen = this.getVolumen();
            BigDecimal rhsVolumen;
            rhsVolumen = that.getVolumen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "volumen", lhsVolumen), LocatorUtils.property(thatLocator, "volumen", rhsVolumen), lhsVolumen, rhsVolumen, (this.volumen!= null), (that.volumen!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsVolumenWerteinheit;
            lhsVolumenWerteinheit = this.getVolumenWerteinheit();
            STWerteinheit rhsVolumenWerteinheit;
            rhsVolumenWerteinheit = that.getVolumenWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "volumenWerteinheit", lhsVolumenWerteinheit), LocatorUtils.property(thatLocator, "volumenWerteinheit", rhsVolumenWerteinheit), lhsVolumenWerteinheit, rhsVolumenWerteinheit, (this.volumenWerteinheit!= null), (that.volumenWerteinheit!= null))) {
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
            BigDecimal theLaenge;
            theLaenge = this.getLaenge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "laenge", theLaenge), currentHashCode, theLaenge, (this.laenge!= null));
        }
        {
            BigDecimal theBreite;
            theBreite = this.getBreite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "breite", theBreite), currentHashCode, theBreite, (this.breite!= null));
        }
        {
            BigDecimal theHoehe;
            theHoehe = this.getHoehe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hoehe", theHoehe), currentHashCode, theHoehe, (this.hoehe!= null));
        }
        {
            BigDecimal theUmfang;
            theUmfang = this.getUmfang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "umfang", theUmfang), currentHashCode, theUmfang, (this.umfang!= null));
        }
        {
            STWerteinheit theLaengenWerteinheit;
            theLaengenWerteinheit = this.getLaengenWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "laengenWerteinheit", theLaengenWerteinheit), currentHashCode, theLaengenWerteinheit, (this.laengenWerteinheit!= null));
        }
        {
            BigDecimal theFlaeche;
            theFlaeche = this.getFlaeche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flaeche", theFlaeche), currentHashCode, theFlaeche, (this.flaeche!= null));
        }
        {
            STWerteinheit theFlaechenWerteinheit;
            theFlaechenWerteinheit = this.getFlaechenWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flaechenWerteinheit", theFlaechenWerteinheit), currentHashCode, theFlaechenWerteinheit, (this.flaechenWerteinheit!= null));
        }
        {
            BigDecimal theVolumen;
            theVolumen = this.getVolumen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "volumen", theVolumen), currentHashCode, theVolumen, (this.volumen!= null));
        }
        {
            STWerteinheit theVolumenWerteinheit;
            theVolumenWerteinheit = this.getVolumenWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "volumenWerteinheit", theVolumenWerteinheit), currentHashCode, theVolumenWerteinheit, (this.volumenWerteinheit!= null));
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
        if (draftCopy instanceof CTGroesse) {
            final CTGroesse copy = ((CTGroesse) draftCopy);
            {
                Boolean laengeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.laenge!= null));
                if (laengeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLaenge;
                    sourceLaenge = this.getLaenge();
                    BigDecimal copyLaenge = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "laenge", sourceLaenge), sourceLaenge, (this.laenge!= null)));
                    copy.setLaenge(copyLaenge);
                } else {
                    if (laengeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.laenge = null;
                    }
                }
            }
            {
                Boolean breiteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.breite!= null));
                if (breiteShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBreite;
                    sourceBreite = this.getBreite();
                    BigDecimal copyBreite = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "breite", sourceBreite), sourceBreite, (this.breite!= null)));
                    copy.setBreite(copyBreite);
                } else {
                    if (breiteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.breite = null;
                    }
                }
            }
            {
                Boolean hoeheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hoehe!= null));
                if (hoeheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHoehe;
                    sourceHoehe = this.getHoehe();
                    BigDecimal copyHoehe = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hoehe", sourceHoehe), sourceHoehe, (this.hoehe!= null)));
                    copy.setHoehe(copyHoehe);
                } else {
                    if (hoeheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hoehe = null;
                    }
                }
            }
            {
                Boolean umfangShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umfang!= null));
                if (umfangShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceUmfang;
                    sourceUmfang = this.getUmfang();
                    BigDecimal copyUmfang = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "umfang", sourceUmfang), sourceUmfang, (this.umfang!= null)));
                    copy.setUmfang(copyUmfang);
                } else {
                    if (umfangShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umfang = null;
                    }
                }
            }
            {
                Boolean laengenWerteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.laengenWerteinheit!= null));
                if (laengenWerteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceLaengenWerteinheit;
                    sourceLaengenWerteinheit = this.getLaengenWerteinheit();
                    STWerteinheit copyLaengenWerteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "laengenWerteinheit", sourceLaengenWerteinheit), sourceLaengenWerteinheit, (this.laengenWerteinheit!= null)));
                    copy.setLaengenWerteinheit(copyLaengenWerteinheit);
                } else {
                    if (laengenWerteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.laengenWerteinheit = null;
                    }
                }
            }
            {
                Boolean flaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaeche!= null));
                if (flaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFlaeche;
                    sourceFlaeche = this.getFlaeche();
                    BigDecimal copyFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "flaeche", sourceFlaeche), sourceFlaeche, (this.flaeche!= null)));
                    copy.setFlaeche(copyFlaeche);
                } else {
                    if (flaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaeche = null;
                    }
                }
            }
            {
                Boolean flaechenWerteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaechenWerteinheit!= null));
                if (flaechenWerteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceFlaechenWerteinheit;
                    sourceFlaechenWerteinheit = this.getFlaechenWerteinheit();
                    STWerteinheit copyFlaechenWerteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "flaechenWerteinheit", sourceFlaechenWerteinheit), sourceFlaechenWerteinheit, (this.flaechenWerteinheit!= null)));
                    copy.setFlaechenWerteinheit(copyFlaechenWerteinheit);
                } else {
                    if (flaechenWerteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaechenWerteinheit = null;
                    }
                }
            }
            {
                Boolean volumenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.volumen!= null));
                if (volumenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVolumen;
                    sourceVolumen = this.getVolumen();
                    BigDecimal copyVolumen = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "volumen", sourceVolumen), sourceVolumen, (this.volumen!= null)));
                    copy.setVolumen(copyVolumen);
                } else {
                    if (volumenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.volumen = null;
                    }
                }
            }
            {
                Boolean volumenWerteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.volumenWerteinheit!= null));
                if (volumenWerteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceVolumenWerteinheit;
                    sourceVolumenWerteinheit = this.getVolumenWerteinheit();
                    STWerteinheit copyVolumenWerteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "volumenWerteinheit", sourceVolumenWerteinheit), sourceVolumenWerteinheit, (this.volumenWerteinheit!= null)));
                    copy.setVolumenWerteinheit(copyVolumenWerteinheit);
                } else {
                    if (volumenWerteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.volumenWerteinheit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGroesse();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withLaenge(BigDecimal value) {
        setLaenge(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withBreite(BigDecimal value) {
        setBreite(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withHoehe(BigDecimal value) {
        setHoehe(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withUmfang(BigDecimal value) {
        setUmfang(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withLaengenWerteinheit(STWerteinheit value) {
        setLaengenWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withFlaeche(BigDecimal value) {
        setFlaeche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withFlaechenWerteinheit(STWerteinheit value) {
        setFlaechenWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withVolumen(BigDecimal value) {
        setVolumen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withVolumenWerteinheit(STWerteinheit value) {
        setVolumenWerteinheit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGroesse withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
