
package net.bipro.namespace.fragen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * Fragenkomplexe bestehen aus Elementen. Es gibt verschiedene Arten von Elementen, die sich in ihren Eigenschaften unterscheiden. Daher ist diese Klasse abstrakt modelliert. Die tatsächlich möglichen Arten von Elementen ergeben sich aus den abgeleiteten Klassen. Erläuterung siehe dort.
 * 
 * <p>Java class for CT_Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Element"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ordnungsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Anzeigenummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text017" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Element", propOrder = {
    "ordnungsnummer",
    "anzeigenummer"
})
@XmlSeeAlso({
    CTGliederungspunkt.class,
    CTFrage.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTElement
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Ordnungsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer ordnungsnummer;
    @XmlElement(name = "Anzeigenummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String anzeigenummer;

    /**
     * Gets the value of the ordnungsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getOrdnungsnummer() {
        return ordnungsnummer;
    }

    /**
     * Sets the value of the ordnungsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setOrdnungsnummer(Integer value) {
        this.ordnungsnummer = value;
    }

    /**
     * Gets the value of the anzeigenummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getAnzeigenummer() {
        return anzeigenummer;
    }

    /**
     * Sets the value of the anzeigenummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnzeigenummer(String value) {
        this.anzeigenummer = value;
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
        final CTElement that = ((CTElement) object);
        {
            Integer lhsOrdnungsnummer;
            lhsOrdnungsnummer = this.getOrdnungsnummer();
            Integer rhsOrdnungsnummer;
            rhsOrdnungsnummer = that.getOrdnungsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordnungsnummer", lhsOrdnungsnummer), LocatorUtils.property(thatLocator, "ordnungsnummer", rhsOrdnungsnummer), lhsOrdnungsnummer, rhsOrdnungsnummer, (this.ordnungsnummer!= null), (that.ordnungsnummer!= null))) {
                return false;
            }
        }
        {
            String lhsAnzeigenummer;
            lhsAnzeigenummer = this.getAnzeigenummer();
            String rhsAnzeigenummer;
            rhsAnzeigenummer = that.getAnzeigenummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzeigenummer", lhsAnzeigenummer), LocatorUtils.property(thatLocator, "anzeigenummer", rhsAnzeigenummer), lhsAnzeigenummer, rhsAnzeigenummer, (this.anzeigenummer!= null), (that.anzeigenummer!= null))) {
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
            Integer theOrdnungsnummer;
            theOrdnungsnummer = this.getOrdnungsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordnungsnummer", theOrdnungsnummer), currentHashCode, theOrdnungsnummer, (this.ordnungsnummer!= null));
        }
        {
            String theAnzeigenummer;
            theAnzeigenummer = this.getAnzeigenummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzeigenummer", theAnzeigenummer), currentHashCode, theAnzeigenummer, (this.anzeigenummer!= null));
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
        if (target instanceof CTElement) {
            final CTElement copy = ((CTElement) target);
            {
                Boolean ordnungsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ordnungsnummer!= null));
                if (ordnungsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceOrdnungsnummer;
                    sourceOrdnungsnummer = this.getOrdnungsnummer();
                    Integer copyOrdnungsnummer = ((Integer) strategy.copy(LocatorUtils.property(locator, "ordnungsnummer", sourceOrdnungsnummer), sourceOrdnungsnummer, (this.ordnungsnummer!= null)));
                    copy.setOrdnungsnummer(copyOrdnungsnummer);
                } else {
                    if (ordnungsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ordnungsnummer = null;
                    }
                }
            }
            {
                Boolean anzeigenummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzeigenummer!= null));
                if (anzeigenummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnzeigenummer;
                    sourceAnzeigenummer = this.getAnzeigenummer();
                    String copyAnzeigenummer = ((String) strategy.copy(LocatorUtils.property(locator, "anzeigenummer", sourceAnzeigenummer), sourceAnzeigenummer, (this.anzeigenummer!= null)));
                    copy.setAnzeigenummer(copyAnzeigenummer);
                } else {
                    if (anzeigenummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzeigenummer = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElement withOrdnungsnummer(Integer value) {
        setOrdnungsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElement withAnzeigenummer(String value) {
        setAnzeigenummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElement withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElement withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
