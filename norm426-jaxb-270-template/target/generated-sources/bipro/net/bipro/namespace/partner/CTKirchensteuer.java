
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
 * Angaben zu Kirchensteuerpflicht und -satz.
 * 
 * <p>Java class for CT_Kirchensteuer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Kirchensteuer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kirchensteuer" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein"/&gt;
 *         &lt;element name="Kirchensteuersatz" type="{http://www.bipro.net/namespace/datentypen}ST_Faktor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Kirchensteuer", propOrder = {
    "kirchensteuer",
    "kirchensteuersatz"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTKirchensteuer
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Kirchensteuer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected boolean kirchensteuer;
    @XmlElement(name = "Kirchensteuersatz", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal kirchensteuersatz;

    /**
     * Gets the value of the kirchensteuer property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public boolean isKirchensteuer() {
        return kirchensteuer;
    }

    /**
     * Sets the value of the kirchensteuer property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKirchensteuer(boolean value) {
        this.kirchensteuer = value;
    }

    /**
     * Gets the value of the kirchensteuersatz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getKirchensteuersatz() {
        return kirchensteuersatz;
    }

    /**
     * Sets the value of the kirchensteuersatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKirchensteuersatz(BigDecimal value) {
        this.kirchensteuersatz = value;
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
        final CTKirchensteuer that = ((CTKirchensteuer) object);
        {
            boolean lhsKirchensteuer;
            lhsKirchensteuer = this.isKirchensteuer();
            boolean rhsKirchensteuer;
            rhsKirchensteuer = that.isKirchensteuer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kirchensteuer", lhsKirchensteuer), LocatorUtils.property(thatLocator, "kirchensteuer", rhsKirchensteuer), lhsKirchensteuer, rhsKirchensteuer, true, true)) {
                return false;
            }
        }
        {
            BigDecimal lhsKirchensteuersatz;
            lhsKirchensteuersatz = this.getKirchensteuersatz();
            BigDecimal rhsKirchensteuersatz;
            rhsKirchensteuersatz = that.getKirchensteuersatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kirchensteuersatz", lhsKirchensteuersatz), LocatorUtils.property(thatLocator, "kirchensteuersatz", rhsKirchensteuersatz), lhsKirchensteuersatz, rhsKirchensteuersatz, (this.kirchensteuersatz!= null), (that.kirchensteuersatz!= null))) {
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
            boolean theKirchensteuer;
            theKirchensteuer = this.isKirchensteuer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kirchensteuer", theKirchensteuer), currentHashCode, theKirchensteuer, true);
        }
        {
            BigDecimal theKirchensteuersatz;
            theKirchensteuersatz = this.getKirchensteuersatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kirchensteuersatz", theKirchensteuersatz), currentHashCode, theKirchensteuersatz, (this.kirchensteuersatz!= null));
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
        if (draftCopy instanceof CTKirchensteuer) {
            final CTKirchensteuer copy = ((CTKirchensteuer) draftCopy);
            {
                Boolean kirchensteuerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (kirchensteuerShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceKirchensteuer;
                    sourceKirchensteuer = this.isKirchensteuer();
                    boolean copyKirchensteuer = strategy.copy(LocatorUtils.property(locator, "kirchensteuer", sourceKirchensteuer), sourceKirchensteuer, true);
                    copy.setKirchensteuer(copyKirchensteuer);
                } else {
                    if (kirchensteuerShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean kirchensteuersatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kirchensteuersatz!= null));
                if (kirchensteuersatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKirchensteuersatz;
                    sourceKirchensteuersatz = this.getKirchensteuersatz();
                    BigDecimal copyKirchensteuersatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kirchensteuersatz", sourceKirchensteuersatz), sourceKirchensteuersatz, (this.kirchensteuersatz!= null)));
                    copy.setKirchensteuersatz(copyKirchensteuersatz);
                } else {
                    if (kirchensteuersatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kirchensteuersatz = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKirchensteuer();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKirchensteuer withKirchensteuer(boolean value) {
        setKirchensteuer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKirchensteuer withKirchensteuersatz(BigDecimal value) {
        setKirchensteuersatz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKirchensteuer withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKirchensteuer withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
