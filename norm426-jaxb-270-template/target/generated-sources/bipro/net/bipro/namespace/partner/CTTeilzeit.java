
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
 * Angaben zur Abbildung der Teilzeit.
 * 
 * <p>Java class for CT_Teilzeit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Teilzeit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Anteil" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Wochenstunden" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Vollzeitstunden" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Teilzeit", propOrder = {
    "anteil",
    "wochenstunden",
    "vollzeitstunden"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTTeilzeit
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Anteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anteil;
    @XmlElement(name = "Wochenstunden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal wochenstunden;
    @XmlElement(name = "Vollzeitstunden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal vollzeitstunden;

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnteil(BigDecimal value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the wochenstunden property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getWochenstunden() {
        return wochenstunden;
    }

    /**
     * Sets the value of the wochenstunden property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWochenstunden(BigDecimal value) {
        this.wochenstunden = value;
    }

    /**
     * Gets the value of the vollzeitstunden property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getVollzeitstunden() {
        return vollzeitstunden;
    }

    /**
     * Sets the value of the vollzeitstunden property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVollzeitstunden(BigDecimal value) {
        this.vollzeitstunden = value;
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
        final CTTeilzeit that = ((CTTeilzeit) object);
        {
            BigDecimal lhsAnteil;
            lhsAnteil = this.getAnteil();
            BigDecimal rhsAnteil;
            rhsAnteil = that.getAnteil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteil", lhsAnteil), LocatorUtils.property(thatLocator, "anteil", rhsAnteil), lhsAnteil, rhsAnteil, (this.anteil!= null), (that.anteil!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWochenstunden;
            lhsWochenstunden = this.getWochenstunden();
            BigDecimal rhsWochenstunden;
            rhsWochenstunden = that.getWochenstunden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wochenstunden", lhsWochenstunden), LocatorUtils.property(thatLocator, "wochenstunden", rhsWochenstunden), lhsWochenstunden, rhsWochenstunden, (this.wochenstunden!= null), (that.wochenstunden!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsVollzeitstunden;
            lhsVollzeitstunden = this.getVollzeitstunden();
            BigDecimal rhsVollzeitstunden;
            rhsVollzeitstunden = that.getVollzeitstunden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vollzeitstunden", lhsVollzeitstunden), LocatorUtils.property(thatLocator, "vollzeitstunden", rhsVollzeitstunden), lhsVollzeitstunden, rhsVollzeitstunden, (this.vollzeitstunden!= null), (that.vollzeitstunden!= null))) {
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
            BigDecimal theAnteil;
            theAnteil = this.getAnteil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anteil", theAnteil), currentHashCode, theAnteil, (this.anteil!= null));
        }
        {
            BigDecimal theWochenstunden;
            theWochenstunden = this.getWochenstunden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wochenstunden", theWochenstunden), currentHashCode, theWochenstunden, (this.wochenstunden!= null));
        }
        {
            BigDecimal theVollzeitstunden;
            theVollzeitstunden = this.getVollzeitstunden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vollzeitstunden", theVollzeitstunden), currentHashCode, theVollzeitstunden, (this.vollzeitstunden!= null));
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
        if (draftCopy instanceof CTTeilzeit) {
            final CTTeilzeit copy = ((CTTeilzeit) draftCopy);
            {
                Boolean anteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anteil!= null));
                if (anteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnteil;
                    sourceAnteil = this.getAnteil();
                    BigDecimal copyAnteil = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anteil", sourceAnteil), sourceAnteil, (this.anteil!= null)));
                    copy.setAnteil(copyAnteil);
                } else {
                    if (anteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anteil = null;
                    }
                }
            }
            {
                Boolean wochenstundenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wochenstunden!= null));
                if (wochenstundenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWochenstunden;
                    sourceWochenstunden = this.getWochenstunden();
                    BigDecimal copyWochenstunden = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wochenstunden", sourceWochenstunden), sourceWochenstunden, (this.wochenstunden!= null)));
                    copy.setWochenstunden(copyWochenstunden);
                } else {
                    if (wochenstundenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wochenstunden = null;
                    }
                }
            }
            {
                Boolean vollzeitstundenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vollzeitstunden!= null));
                if (vollzeitstundenShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceVollzeitstunden;
                    sourceVollzeitstunden = this.getVollzeitstunden();
                    BigDecimal copyVollzeitstunden = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "vollzeitstunden", sourceVollzeitstunden), sourceVollzeitstunden, (this.vollzeitstunden!= null)));
                    copy.setVollzeitstunden(copyVollzeitstunden);
                } else {
                    if (vollzeitstundenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vollzeitstunden = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTTeilzeit();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilzeit withAnteil(BigDecimal value) {
        setAnteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilzeit withWochenstunden(BigDecimal value) {
        setWochenstunden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilzeit withVollzeitstunden(BigDecimal value) {
        setVollzeitstunden(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilzeit withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilzeit withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
