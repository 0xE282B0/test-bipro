
package net.bipro.namespace.allgemein;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.versicherung.haftpflicht.CTHaftpflichtwagnis;
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
 * <p>Java class for CT_Aktivitaet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Aktivitaet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AktivitaetID" type="{http://www.bipro.net/namespace/datentypen}ST_ID"/&gt;
 *         &lt;element name="Referenz" type="{http://www.bipro.net/namespace/datentypen}ST_Referenz" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Aktivitaet", propOrder = {
    "aktivitaetID",
    "referenz"
})
@XmlSeeAlso({
    CTHaftpflichtwagnis.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTAktivitaet
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "AktivitaetID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aktivitaetID;
    @XmlElement(name = "Referenz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String referenz;

    /**
     * Gets the value of the aktivitaetID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAktivitaetID() {
        return aktivitaetID;
    }

    /**
     * Sets the value of the aktivitaetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAktivitaetID(String value) {
        this.aktivitaetID = value;
    }

    /**
     * Gets the value of the referenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setReferenz(String value) {
        this.referenz = value;
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
        final CTAktivitaet that = ((CTAktivitaet) object);
        {
            String lhsAktivitaetID;
            lhsAktivitaetID = this.getAktivitaetID();
            String rhsAktivitaetID;
            rhsAktivitaetID = that.getAktivitaetID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktivitaetID", lhsAktivitaetID), LocatorUtils.property(thatLocator, "aktivitaetID", rhsAktivitaetID), lhsAktivitaetID, rhsAktivitaetID, (this.aktivitaetID!= null), (that.aktivitaetID!= null))) {
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
            String theAktivitaetID;
            theAktivitaetID = this.getAktivitaetID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktivitaetID", theAktivitaetID), currentHashCode, theAktivitaetID, (this.aktivitaetID!= null));
        }
        {
            String theReferenz;
            theReferenz = this.getReferenz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenz", theReferenz), currentHashCode, theReferenz, (this.referenz!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTAktivitaet) {
            final CTAktivitaet copy = ((CTAktivitaet) target);
            {
                Boolean aktivitaetIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktivitaetID!= null));
                if (aktivitaetIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktivitaetID;
                    sourceAktivitaetID = this.getAktivitaetID();
                    String copyAktivitaetID = ((String) strategy.copy(LocatorUtils.property(locator, "aktivitaetID", sourceAktivitaetID), sourceAktivitaetID, (this.aktivitaetID!= null)));
                    copy.setAktivitaetID(copyAktivitaetID);
                } else {
                    if (aktivitaetIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktivitaetID = null;
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
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAktivitaet withAktivitaetID(String value) {
        setAktivitaetID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAktivitaet withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAktivitaet withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAktivitaet withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
