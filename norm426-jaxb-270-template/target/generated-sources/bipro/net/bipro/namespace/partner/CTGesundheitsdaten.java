
package net.bipro.namespace.partner;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
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
 * Biometrische Daten einer (natürlichen) versicherten Person
 * 
 * <p>Java class for CT_Gesundheitsdaten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gesundheitsdaten"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Groesse" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Gewicht" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="DioptrienLinks" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="DioptrienRechts" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="FehlendeZaehne" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="VoraussichtlicherEntbindungstermin" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Behinderungsgrad" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="ZuZiehendeZaehne" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gesundheitsdaten", propOrder = {
    "groesse",
    "gewicht",
    "dioptrienLinks",
    "dioptrienRechts",
    "fehlendeZaehne",
    "voraussichtlicherEntbindungstermin",
    "behinderungsgrad",
    "zuZiehendeZaehne"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGesundheitsdaten
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Groesse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer groesse;
    @XmlElement(name = "Gewicht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer gewicht;
    @XmlElement(name = "DioptrienLinks")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal dioptrienLinks;
    @XmlElement(name = "DioptrienRechts")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal dioptrienRechts;
    @XmlElement(name = "FehlendeZaehne")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer fehlendeZaehne;
    @XmlElement(name = "VoraussichtlicherEntbindungstermin")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String voraussichtlicherEntbindungstermin;
    @XmlElement(name = "Behinderungsgrad")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal behinderungsgrad;
    @XmlElement(name = "ZuZiehendeZaehne")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer zuZiehendeZaehne;

    /**
     * Gets the value of the groesse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getGroesse() {
        return groesse;
    }

    /**
     * Sets the value of the groesse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGroesse(Integer value) {
        this.groesse = value;
    }

    /**
     * Gets the value of the gewicht property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getGewicht() {
        return gewicht;
    }

    /**
     * Sets the value of the gewicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGewicht(Integer value) {
        this.gewicht = value;
    }

    /**
     * Gets the value of the dioptrienLinks property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getDioptrienLinks() {
        return dioptrienLinks;
    }

    /**
     * Sets the value of the dioptrienLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDioptrienLinks(BigDecimal value) {
        this.dioptrienLinks = value;
    }

    /**
     * Gets the value of the dioptrienRechts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getDioptrienRechts() {
        return dioptrienRechts;
    }

    /**
     * Sets the value of the dioptrienRechts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDioptrienRechts(BigDecimal value) {
        this.dioptrienRechts = value;
    }

    /**
     * Gets the value of the fehlendeZaehne property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getFehlendeZaehne() {
        return fehlendeZaehne;
    }

    /**
     * Sets the value of the fehlendeZaehne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFehlendeZaehne(Integer value) {
        this.fehlendeZaehne = value;
    }

    /**
     * Gets the value of the voraussichtlicherEntbindungstermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVoraussichtlicherEntbindungstermin() {
        return voraussichtlicherEntbindungstermin;
    }

    /**
     * Sets the value of the voraussichtlicherEntbindungstermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVoraussichtlicherEntbindungstermin(String value) {
        this.voraussichtlicherEntbindungstermin = value;
    }

    /**
     * Gets the value of the behinderungsgrad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBehinderungsgrad() {
        return behinderungsgrad;
    }

    /**
     * Sets the value of the behinderungsgrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBehinderungsgrad(BigDecimal value) {
        this.behinderungsgrad = value;
    }

    /**
     * Gets the value of the zuZiehendeZaehne property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getZuZiehendeZaehne() {
        return zuZiehendeZaehne;
    }

    /**
     * Sets the value of the zuZiehendeZaehne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZuZiehendeZaehne(Integer value) {
        this.zuZiehendeZaehne = value;
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
        final CTGesundheitsdaten that = ((CTGesundheitsdaten) object);
        {
            Integer lhsGroesse;
            lhsGroesse = this.getGroesse();
            Integer rhsGroesse;
            rhsGroesse = that.getGroesse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groesse", lhsGroesse), LocatorUtils.property(thatLocator, "groesse", rhsGroesse), lhsGroesse, rhsGroesse, (this.groesse!= null), (that.groesse!= null))) {
                return false;
            }
        }
        {
            Integer lhsGewicht;
            lhsGewicht = this.getGewicht();
            Integer rhsGewicht;
            rhsGewicht = that.getGewicht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gewicht", lhsGewicht), LocatorUtils.property(thatLocator, "gewicht", rhsGewicht), lhsGewicht, rhsGewicht, (this.gewicht!= null), (that.gewicht!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsDioptrienLinks;
            lhsDioptrienLinks = this.getDioptrienLinks();
            BigDecimal rhsDioptrienLinks;
            rhsDioptrienLinks = that.getDioptrienLinks();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dioptrienLinks", lhsDioptrienLinks), LocatorUtils.property(thatLocator, "dioptrienLinks", rhsDioptrienLinks), lhsDioptrienLinks, rhsDioptrienLinks, (this.dioptrienLinks!= null), (that.dioptrienLinks!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsDioptrienRechts;
            lhsDioptrienRechts = this.getDioptrienRechts();
            BigDecimal rhsDioptrienRechts;
            rhsDioptrienRechts = that.getDioptrienRechts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dioptrienRechts", lhsDioptrienRechts), LocatorUtils.property(thatLocator, "dioptrienRechts", rhsDioptrienRechts), lhsDioptrienRechts, rhsDioptrienRechts, (this.dioptrienRechts!= null), (that.dioptrienRechts!= null))) {
                return false;
            }
        }
        {
            Integer lhsFehlendeZaehne;
            lhsFehlendeZaehne = this.getFehlendeZaehne();
            Integer rhsFehlendeZaehne;
            rhsFehlendeZaehne = that.getFehlendeZaehne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fehlendeZaehne", lhsFehlendeZaehne), LocatorUtils.property(thatLocator, "fehlendeZaehne", rhsFehlendeZaehne), lhsFehlendeZaehne, rhsFehlendeZaehne, (this.fehlendeZaehne!= null), (that.fehlendeZaehne!= null))) {
                return false;
            }
        }
        {
            String lhsVoraussichtlicherEntbindungstermin;
            lhsVoraussichtlicherEntbindungstermin = this.getVoraussichtlicherEntbindungstermin();
            String rhsVoraussichtlicherEntbindungstermin;
            rhsVoraussichtlicherEntbindungstermin = that.getVoraussichtlicherEntbindungstermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voraussichtlicherEntbindungstermin", lhsVoraussichtlicherEntbindungstermin), LocatorUtils.property(thatLocator, "voraussichtlicherEntbindungstermin", rhsVoraussichtlicherEntbindungstermin), lhsVoraussichtlicherEntbindungstermin, rhsVoraussichtlicherEntbindungstermin, (this.voraussichtlicherEntbindungstermin!= null), (that.voraussichtlicherEntbindungstermin!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBehinderungsgrad;
            lhsBehinderungsgrad = this.getBehinderungsgrad();
            BigDecimal rhsBehinderungsgrad;
            rhsBehinderungsgrad = that.getBehinderungsgrad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "behinderungsgrad", lhsBehinderungsgrad), LocatorUtils.property(thatLocator, "behinderungsgrad", rhsBehinderungsgrad), lhsBehinderungsgrad, rhsBehinderungsgrad, (this.behinderungsgrad!= null), (that.behinderungsgrad!= null))) {
                return false;
            }
        }
        {
            Integer lhsZuZiehendeZaehne;
            lhsZuZiehendeZaehne = this.getZuZiehendeZaehne();
            Integer rhsZuZiehendeZaehne;
            rhsZuZiehendeZaehne = that.getZuZiehendeZaehne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zuZiehendeZaehne", lhsZuZiehendeZaehne), LocatorUtils.property(thatLocator, "zuZiehendeZaehne", rhsZuZiehendeZaehne), lhsZuZiehendeZaehne, rhsZuZiehendeZaehne, (this.zuZiehendeZaehne!= null), (that.zuZiehendeZaehne!= null))) {
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
            Integer theGroesse;
            theGroesse = this.getGroesse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groesse", theGroesse), currentHashCode, theGroesse, (this.groesse!= null));
        }
        {
            Integer theGewicht;
            theGewicht = this.getGewicht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gewicht", theGewicht), currentHashCode, theGewicht, (this.gewicht!= null));
        }
        {
            BigDecimal theDioptrienLinks;
            theDioptrienLinks = this.getDioptrienLinks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dioptrienLinks", theDioptrienLinks), currentHashCode, theDioptrienLinks, (this.dioptrienLinks!= null));
        }
        {
            BigDecimal theDioptrienRechts;
            theDioptrienRechts = this.getDioptrienRechts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dioptrienRechts", theDioptrienRechts), currentHashCode, theDioptrienRechts, (this.dioptrienRechts!= null));
        }
        {
            Integer theFehlendeZaehne;
            theFehlendeZaehne = this.getFehlendeZaehne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fehlendeZaehne", theFehlendeZaehne), currentHashCode, theFehlendeZaehne, (this.fehlendeZaehne!= null));
        }
        {
            String theVoraussichtlicherEntbindungstermin;
            theVoraussichtlicherEntbindungstermin = this.getVoraussichtlicherEntbindungstermin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voraussichtlicherEntbindungstermin", theVoraussichtlicherEntbindungstermin), currentHashCode, theVoraussichtlicherEntbindungstermin, (this.voraussichtlicherEntbindungstermin!= null));
        }
        {
            BigDecimal theBehinderungsgrad;
            theBehinderungsgrad = this.getBehinderungsgrad();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "behinderungsgrad", theBehinderungsgrad), currentHashCode, theBehinderungsgrad, (this.behinderungsgrad!= null));
        }
        {
            Integer theZuZiehendeZaehne;
            theZuZiehendeZaehne = this.getZuZiehendeZaehne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zuZiehendeZaehne", theZuZiehendeZaehne), currentHashCode, theZuZiehendeZaehne, (this.zuZiehendeZaehne!= null));
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
        if (draftCopy instanceof CTGesundheitsdaten) {
            final CTGesundheitsdaten copy = ((CTGesundheitsdaten) draftCopy);
            {
                Boolean groesseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.groesse!= null));
                if (groesseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceGroesse;
                    sourceGroesse = this.getGroesse();
                    Integer copyGroesse = ((Integer) strategy.copy(LocatorUtils.property(locator, "groesse", sourceGroesse), sourceGroesse, (this.groesse!= null)));
                    copy.setGroesse(copyGroesse);
                } else {
                    if (groesseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.groesse = null;
                    }
                }
            }
            {
                Boolean gewichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gewicht!= null));
                if (gewichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceGewicht;
                    sourceGewicht = this.getGewicht();
                    Integer copyGewicht = ((Integer) strategy.copy(LocatorUtils.property(locator, "gewicht", sourceGewicht), sourceGewicht, (this.gewicht!= null)));
                    copy.setGewicht(copyGewicht);
                } else {
                    if (gewichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gewicht = null;
                    }
                }
            }
            {
                Boolean dioptrienLinksShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dioptrienLinks!= null));
                if (dioptrienLinksShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceDioptrienLinks;
                    sourceDioptrienLinks = this.getDioptrienLinks();
                    BigDecimal copyDioptrienLinks = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "dioptrienLinks", sourceDioptrienLinks), sourceDioptrienLinks, (this.dioptrienLinks!= null)));
                    copy.setDioptrienLinks(copyDioptrienLinks);
                } else {
                    if (dioptrienLinksShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dioptrienLinks = null;
                    }
                }
            }
            {
                Boolean dioptrienRechtsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dioptrienRechts!= null));
                if (dioptrienRechtsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceDioptrienRechts;
                    sourceDioptrienRechts = this.getDioptrienRechts();
                    BigDecimal copyDioptrienRechts = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "dioptrienRechts", sourceDioptrienRechts), sourceDioptrienRechts, (this.dioptrienRechts!= null)));
                    copy.setDioptrienRechts(copyDioptrienRechts);
                } else {
                    if (dioptrienRechtsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dioptrienRechts = null;
                    }
                }
            }
            {
                Boolean fehlendeZaehneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fehlendeZaehne!= null));
                if (fehlendeZaehneShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceFehlendeZaehne;
                    sourceFehlendeZaehne = this.getFehlendeZaehne();
                    Integer copyFehlendeZaehne = ((Integer) strategy.copy(LocatorUtils.property(locator, "fehlendeZaehne", sourceFehlendeZaehne), sourceFehlendeZaehne, (this.fehlendeZaehne!= null)));
                    copy.setFehlendeZaehne(copyFehlendeZaehne);
                } else {
                    if (fehlendeZaehneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fehlendeZaehne = null;
                    }
                }
            }
            {
                Boolean voraussichtlicherEntbindungsterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voraussichtlicherEntbindungstermin!= null));
                if (voraussichtlicherEntbindungsterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVoraussichtlicherEntbindungstermin;
                    sourceVoraussichtlicherEntbindungstermin = this.getVoraussichtlicherEntbindungstermin();
                    String copyVoraussichtlicherEntbindungstermin = ((String) strategy.copy(LocatorUtils.property(locator, "voraussichtlicherEntbindungstermin", sourceVoraussichtlicherEntbindungstermin), sourceVoraussichtlicherEntbindungstermin, (this.voraussichtlicherEntbindungstermin!= null)));
                    copy.setVoraussichtlicherEntbindungstermin(copyVoraussichtlicherEntbindungstermin);
                } else {
                    if (voraussichtlicherEntbindungsterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.voraussichtlicherEntbindungstermin = null;
                    }
                }
            }
            {
                Boolean behinderungsgradShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.behinderungsgrad!= null));
                if (behinderungsgradShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBehinderungsgrad;
                    sourceBehinderungsgrad = this.getBehinderungsgrad();
                    BigDecimal copyBehinderungsgrad = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "behinderungsgrad", sourceBehinderungsgrad), sourceBehinderungsgrad, (this.behinderungsgrad!= null)));
                    copy.setBehinderungsgrad(copyBehinderungsgrad);
                } else {
                    if (behinderungsgradShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.behinderungsgrad = null;
                    }
                }
            }
            {
                Boolean zuZiehendeZaehneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zuZiehendeZaehne!= null));
                if (zuZiehendeZaehneShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceZuZiehendeZaehne;
                    sourceZuZiehendeZaehne = this.getZuZiehendeZaehne();
                    Integer copyZuZiehendeZaehne = ((Integer) strategy.copy(LocatorUtils.property(locator, "zuZiehendeZaehne", sourceZuZiehendeZaehne), sourceZuZiehendeZaehne, (this.zuZiehendeZaehne!= null)));
                    copy.setZuZiehendeZaehne(copyZuZiehendeZaehne);
                } else {
                    if (zuZiehendeZaehneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zuZiehendeZaehne = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGesundheitsdaten();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withGroesse(Integer value) {
        setGroesse(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withGewicht(Integer value) {
        setGewicht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withDioptrienLinks(BigDecimal value) {
        setDioptrienLinks(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withDioptrienRechts(BigDecimal value) {
        setDioptrienRechts(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withFehlendeZaehne(Integer value) {
        setFehlendeZaehne(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withVoraussichtlicherEntbindungstermin(String value) {
        setVoraussichtlicherEntbindungstermin(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withBehinderungsgrad(BigDecimal value) {
        setBehinderungsgrad(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withZuZiehendeZaehne(Integer value) {
        setZuZiehendeZaehne(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGesundheitsdaten withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
