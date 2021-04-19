
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
 * Angaben zur Einkommenssteuer.
 * 
 * Das Attribut Veranlagung (ST_Veranlagung) fehlt, da der entsprechende einfache Datentyp nicht definiert ist.
 * 
 * <p>Java class for CT_Einkommenssteuer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Einkommenssteuer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Grenzsteuersatz" type="{http://www.bipro.net/namespace/datentypen}ST_Faktor" minOccurs="0"/&gt;
 *         &lt;element name="Freibetrag" type="{http://www.bipro.net/namespace/datentypen}ST_Betrag" minOccurs="0"/&gt;
 *         &lt;element name="Kirchensteuer" type="{http://www.bipro.net/namespace/partner}CT_Kirchensteuer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Einkommenssteuer", propOrder = {
    "grenzsteuersatz",
    "freibetrag",
    "kirchensteuer"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTEinkommenssteuer
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Grenzsteuersatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal grenzsteuersatz;
    @XmlElement(name = "Freibetrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal freibetrag;
    @XmlElement(name = "Kirchensteuer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTKirchensteuer kirchensteuer;

    /**
     * Gets the value of the grenzsteuersatz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getGrenzsteuersatz() {
        return grenzsteuersatz;
    }

    /**
     * Sets the value of the grenzsteuersatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGrenzsteuersatz(BigDecimal value) {
        this.grenzsteuersatz = value;
    }

    /**
     * Gets the value of the freibetrag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getFreibetrag() {
        return freibetrag;
    }

    /**
     * Sets the value of the freibetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFreibetrag(BigDecimal value) {
        this.freibetrag = value;
    }

    /**
     * Gets the value of the kirchensteuer property.
     * 
     * @return
     *     possible object is
     *     {@link CTKirchensteuer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKirchensteuer getKirchensteuer() {
        return kirchensteuer;
    }

    /**
     * Sets the value of the kirchensteuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTKirchensteuer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKirchensteuer(CTKirchensteuer value) {
        this.kirchensteuer = value;
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
        final CTEinkommenssteuer that = ((CTEinkommenssteuer) object);
        {
            BigDecimal lhsGrenzsteuersatz;
            lhsGrenzsteuersatz = this.getGrenzsteuersatz();
            BigDecimal rhsGrenzsteuersatz;
            rhsGrenzsteuersatz = that.getGrenzsteuersatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grenzsteuersatz", lhsGrenzsteuersatz), LocatorUtils.property(thatLocator, "grenzsteuersatz", rhsGrenzsteuersatz), lhsGrenzsteuersatz, rhsGrenzsteuersatz, (this.grenzsteuersatz!= null), (that.grenzsteuersatz!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFreibetrag;
            lhsFreibetrag = this.getFreibetrag();
            BigDecimal rhsFreibetrag;
            rhsFreibetrag = that.getFreibetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freibetrag", lhsFreibetrag), LocatorUtils.property(thatLocator, "freibetrag", rhsFreibetrag), lhsFreibetrag, rhsFreibetrag, (this.freibetrag!= null), (that.freibetrag!= null))) {
                return false;
            }
        }
        {
            CTKirchensteuer lhsKirchensteuer;
            lhsKirchensteuer = this.getKirchensteuer();
            CTKirchensteuer rhsKirchensteuer;
            rhsKirchensteuer = that.getKirchensteuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kirchensteuer", lhsKirchensteuer), LocatorUtils.property(thatLocator, "kirchensteuer", rhsKirchensteuer), lhsKirchensteuer, rhsKirchensteuer, (this.kirchensteuer!= null), (that.kirchensteuer!= null))) {
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
            BigDecimal theGrenzsteuersatz;
            theGrenzsteuersatz = this.getGrenzsteuersatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grenzsteuersatz", theGrenzsteuersatz), currentHashCode, theGrenzsteuersatz, (this.grenzsteuersatz!= null));
        }
        {
            BigDecimal theFreibetrag;
            theFreibetrag = this.getFreibetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freibetrag", theFreibetrag), currentHashCode, theFreibetrag, (this.freibetrag!= null));
        }
        {
            CTKirchensteuer theKirchensteuer;
            theKirchensteuer = this.getKirchensteuer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kirchensteuer", theKirchensteuer), currentHashCode, theKirchensteuer, (this.kirchensteuer!= null));
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
        if (draftCopy instanceof CTEinkommenssteuer) {
            final CTEinkommenssteuer copy = ((CTEinkommenssteuer) draftCopy);
            {
                Boolean grenzsteuersatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grenzsteuersatz!= null));
                if (grenzsteuersatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGrenzsteuersatz;
                    sourceGrenzsteuersatz = this.getGrenzsteuersatz();
                    BigDecimal copyGrenzsteuersatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grenzsteuersatz", sourceGrenzsteuersatz), sourceGrenzsteuersatz, (this.grenzsteuersatz!= null)));
                    copy.setGrenzsteuersatz(copyGrenzsteuersatz);
                } else {
                    if (grenzsteuersatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grenzsteuersatz = null;
                    }
                }
            }
            {
                Boolean freibetragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freibetrag!= null));
                if (freibetragShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFreibetrag;
                    sourceFreibetrag = this.getFreibetrag();
                    BigDecimal copyFreibetrag = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "freibetrag", sourceFreibetrag), sourceFreibetrag, (this.freibetrag!= null)));
                    copy.setFreibetrag(copyFreibetrag);
                } else {
                    if (freibetragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freibetrag = null;
                    }
                }
            }
            {
                Boolean kirchensteuerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kirchensteuer!= null));
                if (kirchensteuerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTKirchensteuer sourceKirchensteuer;
                    sourceKirchensteuer = this.getKirchensteuer();
                    CTKirchensteuer copyKirchensteuer = ((CTKirchensteuer) strategy.copy(LocatorUtils.property(locator, "kirchensteuer", sourceKirchensteuer), sourceKirchensteuer, (this.kirchensteuer!= null)));
                    copy.setKirchensteuer(copyKirchensteuer);
                } else {
                    if (kirchensteuerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kirchensteuer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTEinkommenssteuer();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommenssteuer withGrenzsteuersatz(BigDecimal value) {
        setGrenzsteuersatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommenssteuer withFreibetrag(BigDecimal value) {
        setFreibetrag(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommenssteuer withKirchensteuer(CTKirchensteuer value) {
        setKirchensteuer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommenssteuer withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommenssteuer withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
