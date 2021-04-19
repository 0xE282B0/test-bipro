
package net.bipro.namespace.versicherung.haftpflicht;

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
 * <p>Java class for CT_Gewaesserschaden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gewaesserschaden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Einbaujahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="Trinkwasserschutzgebiet" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Wagnisanschrift" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Wagnisanschrift" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gewaesserschaden", propOrder = {
    "einbaujahr",
    "trinkwasserschutzgebiet",
    "wagnisanschrift"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGewaesserschaden
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Einbaujahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer einbaujahr;
    @XmlElement(name = "Trinkwasserschutzgebiet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean trinkwasserschutzgebiet;
    @XmlElement(name = "Wagnisanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTWagnisanschrift wagnisanschrift;

    /**
     * Gets the value of the einbaujahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getEinbaujahr() {
        return einbaujahr;
    }

    /**
     * Sets the value of the einbaujahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setEinbaujahr(Integer value) {
        this.einbaujahr = value;
    }

    /**
     * Gets the value of the trinkwasserschutzgebiet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isTrinkwasserschutzgebiet() {
        return trinkwasserschutzgebiet;
    }

    /**
     * Sets the value of the trinkwasserschutzgebiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setTrinkwasserschutzgebiet(Boolean value) {
        this.trinkwasserschutzgebiet = value;
    }

    /**
     * Gets the value of the wagnisanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link CTWagnisanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTWagnisanschrift getWagnisanschrift() {
        return wagnisanschrift;
    }

    /**
     * Sets the value of the wagnisanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTWagnisanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWagnisanschrift(CTWagnisanschrift value) {
        this.wagnisanschrift = value;
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
        final CTGewaesserschaden that = ((CTGewaesserschaden) object);
        {
            Integer lhsEinbaujahr;
            lhsEinbaujahr = this.getEinbaujahr();
            Integer rhsEinbaujahr;
            rhsEinbaujahr = that.getEinbaujahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einbaujahr", lhsEinbaujahr), LocatorUtils.property(thatLocator, "einbaujahr", rhsEinbaujahr), lhsEinbaujahr, rhsEinbaujahr, (this.einbaujahr!= null), (that.einbaujahr!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTrinkwasserschutzgebiet;
            lhsTrinkwasserschutzgebiet = this.isTrinkwasserschutzgebiet();
            Boolean rhsTrinkwasserschutzgebiet;
            rhsTrinkwasserschutzgebiet = that.isTrinkwasserschutzgebiet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trinkwasserschutzgebiet", lhsTrinkwasserschutzgebiet), LocatorUtils.property(thatLocator, "trinkwasserschutzgebiet", rhsTrinkwasserschutzgebiet), lhsTrinkwasserschutzgebiet, rhsTrinkwasserschutzgebiet, (this.trinkwasserschutzgebiet!= null), (that.trinkwasserschutzgebiet!= null))) {
                return false;
            }
        }
        {
            CTWagnisanschrift lhsWagnisanschrift;
            lhsWagnisanschrift = this.getWagnisanschrift();
            CTWagnisanschrift rhsWagnisanschrift;
            rhsWagnisanschrift = that.getWagnisanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wagnisanschrift", lhsWagnisanschrift), LocatorUtils.property(thatLocator, "wagnisanschrift", rhsWagnisanschrift), lhsWagnisanschrift, rhsWagnisanschrift, (this.wagnisanschrift!= null), (that.wagnisanschrift!= null))) {
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
            Integer theEinbaujahr;
            theEinbaujahr = this.getEinbaujahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einbaujahr", theEinbaujahr), currentHashCode, theEinbaujahr, (this.einbaujahr!= null));
        }
        {
            Boolean theTrinkwasserschutzgebiet;
            theTrinkwasserschutzgebiet = this.isTrinkwasserschutzgebiet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trinkwasserschutzgebiet", theTrinkwasserschutzgebiet), currentHashCode, theTrinkwasserschutzgebiet, (this.trinkwasserschutzgebiet!= null));
        }
        {
            CTWagnisanschrift theWagnisanschrift;
            theWagnisanschrift = this.getWagnisanschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wagnisanschrift", theWagnisanschrift), currentHashCode, theWagnisanschrift, (this.wagnisanschrift!= null));
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
        if (draftCopy instanceof CTGewaesserschaden) {
            final CTGewaesserschaden copy = ((CTGewaesserschaden) draftCopy);
            {
                Boolean einbaujahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einbaujahr!= null));
                if (einbaujahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceEinbaujahr;
                    sourceEinbaujahr = this.getEinbaujahr();
                    Integer copyEinbaujahr = ((Integer) strategy.copy(LocatorUtils.property(locator, "einbaujahr", sourceEinbaujahr), sourceEinbaujahr, (this.einbaujahr!= null)));
                    copy.setEinbaujahr(copyEinbaujahr);
                } else {
                    if (einbaujahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einbaujahr = null;
                    }
                }
            }
            {
                Boolean trinkwasserschutzgebietShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trinkwasserschutzgebiet!= null));
                if (trinkwasserschutzgebietShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceTrinkwasserschutzgebiet;
                    sourceTrinkwasserschutzgebiet = this.isTrinkwasserschutzgebiet();
                    Boolean copyTrinkwasserschutzgebiet = ((Boolean) strategy.copy(LocatorUtils.property(locator, "trinkwasserschutzgebiet", sourceTrinkwasserschutzgebiet), sourceTrinkwasserschutzgebiet, (this.trinkwasserschutzgebiet!= null)));
                    copy.setTrinkwasserschutzgebiet(copyTrinkwasserschutzgebiet);
                } else {
                    if (trinkwasserschutzgebietShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trinkwasserschutzgebiet = null;
                    }
                }
            }
            {
                Boolean wagnisanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wagnisanschrift!= null));
                if (wagnisanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTWagnisanschrift sourceWagnisanschrift;
                    sourceWagnisanschrift = this.getWagnisanschrift();
                    CTWagnisanschrift copyWagnisanschrift = ((CTWagnisanschrift) strategy.copy(LocatorUtils.property(locator, "wagnisanschrift", sourceWagnisanschrift), sourceWagnisanschrift, (this.wagnisanschrift!= null)));
                    copy.setWagnisanschrift(copyWagnisanschrift);
                } else {
                    if (wagnisanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wagnisanschrift = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGewaesserschaden();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGewaesserschaden withEinbaujahr(Integer value) {
        setEinbaujahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGewaesserschaden withTrinkwasserschutzgebiet(Boolean value) {
        setTrinkwasserschutzgebiet(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGewaesserschaden withWagnisanschrift(CTWagnisanschrift value) {
        setWagnisanschrift(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGewaesserschaden withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGewaesserschaden withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
