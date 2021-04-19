
package net.bipro.namespace.allgemein;

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
 * Klasse zur Angabe von geografischen Koordinaten
 * 
 * <p>Java class for CT_Geoposition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Geoposition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Breite" type="{http://www.bipro.net/namespace/datentypen}ST_Geokoordinate"/&gt;
 *         &lt;element name="Laenge" type="{http://www.bipro.net/namespace/datentypen}ST_Geokoordinate"/&gt;
 *         &lt;element name="Hoehe" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Geoposition", propOrder = {
    "breite",
    "laenge",
    "hoehe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGeoposition
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Breite", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal breite;
    @XmlElement(name = "Laenge", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal laenge;
    @XmlElement(name = "Hoehe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal hoehe;

    /**
     * Gets the value of the breite property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBreite(BigDecimal value) {
        this.breite = value;
    }

    /**
     * Gets the value of the laenge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLaenge(BigDecimal value) {
        this.laenge = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHoehe(BigDecimal value) {
        this.hoehe = value;
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
        final CTGeoposition that = ((CTGeoposition) object);
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
            BigDecimal lhsLaenge;
            lhsLaenge = this.getLaenge();
            BigDecimal rhsLaenge;
            rhsLaenge = that.getLaenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "laenge", lhsLaenge), LocatorUtils.property(thatLocator, "laenge", rhsLaenge), lhsLaenge, rhsLaenge, (this.laenge!= null), (that.laenge!= null))) {
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
            BigDecimal theBreite;
            theBreite = this.getBreite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "breite", theBreite), currentHashCode, theBreite, (this.breite!= null));
        }
        {
            BigDecimal theLaenge;
            theLaenge = this.getLaenge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "laenge", theLaenge), currentHashCode, theLaenge, (this.laenge!= null));
        }
        {
            BigDecimal theHoehe;
            theHoehe = this.getHoehe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hoehe", theHoehe), currentHashCode, theHoehe, (this.hoehe!= null));
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
        if (draftCopy instanceof CTGeoposition) {
            final CTGeoposition copy = ((CTGeoposition) draftCopy);
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGeoposition();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeoposition withBreite(BigDecimal value) {
        setBreite(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeoposition withLaenge(BigDecimal value) {
        setLaenge(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeoposition withHoehe(BigDecimal value) {
        setHoehe(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeoposition withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeoposition withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
