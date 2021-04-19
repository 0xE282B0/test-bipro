
package net.bipro.namespace.versicherung.produktmodell.komposit;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STGefahrengruppe;
import net.bipro.namespace.partner.CTPartnerrolle;
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
 * <p>Java class for CT_VersichertePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_VersichertePerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/partner}CT_Partnerrolle"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gefahrengruppe" type="{http://www.bipro.net/namespace/datentypen}ST_Gefahrengruppe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_VersichertePerson", propOrder = {
    "gefahrengruppe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTVersichertePerson
    extends CTPartnerrolle
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Gefahrengruppe")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STGefahrengruppe gefahrengruppe;

    /**
     * Gets the value of the gefahrengruppe property.
     * 
     * @return
     *     possible object is
     *     {@link STGefahrengruppe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STGefahrengruppe getGefahrengruppe() {
        return gefahrengruppe;
    }

    /**
     * Sets the value of the gefahrengruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGefahrengruppe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGefahrengruppe(STGefahrengruppe value) {
        this.gefahrengruppe = value;
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
        final CTVersichertePerson that = ((CTVersichertePerson) object);
        {
            STGefahrengruppe lhsGefahrengruppe;
            lhsGefahrengruppe = this.getGefahrengruppe();
            STGefahrengruppe rhsGefahrengruppe;
            rhsGefahrengruppe = that.getGefahrengruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahrengruppe", lhsGefahrengruppe), LocatorUtils.property(thatLocator, "gefahrengruppe", rhsGefahrengruppe), lhsGefahrengruppe, rhsGefahrengruppe, (this.gefahrengruppe!= null), (that.gefahrengruppe!= null))) {
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
            STGefahrengruppe theGefahrengruppe;
            theGefahrengruppe = this.getGefahrengruppe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahrengruppe", theGefahrengruppe), currentHashCode, theGefahrengruppe, (this.gefahrengruppe!= null));
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
        if (draftCopy instanceof CTVersichertePerson) {
            final CTVersichertePerson copy = ((CTVersichertePerson) draftCopy);
            {
                Boolean gefahrengruppeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gefahrengruppe!= null));
                if (gefahrengruppeShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGefahrengruppe sourceGefahrengruppe;
                    sourceGefahrengruppe = this.getGefahrengruppe();
                    STGefahrengruppe copyGefahrengruppe = ((STGefahrengruppe) strategy.copy(LocatorUtils.property(locator, "gefahrengruppe", sourceGefahrengruppe), sourceGefahrengruppe, (this.gefahrengruppe!= null)));
                    copy.setGefahrengruppe(copyGefahrengruppe);
                } else {
                    if (gefahrengruppeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahrengruppe = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVersichertePerson();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePerson withGefahrengruppe(STGefahrengruppe value) {
        setGefahrengruppe(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePerson withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePerson withGueltigkeit(CTZeitraum value) {
        setGueltigkeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePerson withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePerson withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
