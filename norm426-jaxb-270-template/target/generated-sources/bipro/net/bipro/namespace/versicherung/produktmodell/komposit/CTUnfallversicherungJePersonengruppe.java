
package net.bipro.namespace.versicherung.produktmodell.komposit;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.produktmodell.CTBeitrag;
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
 * Die Klasse UnfallVersicherungJePersonengruppe enthält zentrale Daten über eine versicherte Personengruppe innerhalb einer Unfallversicherung, z.B. das Einschlussdatum der Gruppe oder den Gesamtbeitrag der Gruppe.
 * 
 * <p>Java class for CT_UnfallversicherungJePersonengruppe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_UnfallversicherungJePersonengruppe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_UnfallversicherungJe"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersichertePersonengruppe" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_VersichertePersonengruppe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_UnfallversicherungJePersonengruppe", propOrder = {
    "versichertePersonengruppe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTUnfallversicherungJePersonengruppe
    extends CTUnfallversicherungJe
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "VersichertePersonengruppe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVersichertePersonengruppe versichertePersonengruppe;

    /**
     * Gets the value of the versichertePersonengruppe property.
     * 
     * @return
     *     possible object is
     *     {@link CTVersichertePersonengruppe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePersonengruppe getVersichertePersonengruppe() {
        return versichertePersonengruppe;
    }

    /**
     * Sets the value of the versichertePersonengruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVersichertePersonengruppe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersichertePersonengruppe(CTVersichertePersonengruppe value) {
        this.versichertePersonengruppe = value;
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
        final CTUnfallversicherungJePersonengruppe that = ((CTUnfallversicherungJePersonengruppe) object);
        {
            CTVersichertePersonengruppe lhsVersichertePersonengruppe;
            lhsVersichertePersonengruppe = this.getVersichertePersonengruppe();
            CTVersichertePersonengruppe rhsVersichertePersonengruppe;
            rhsVersichertePersonengruppe = that.getVersichertePersonengruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertePersonengruppe", lhsVersichertePersonengruppe), LocatorUtils.property(thatLocator, "versichertePersonengruppe", rhsVersichertePersonengruppe), lhsVersichertePersonengruppe, rhsVersichertePersonengruppe, (this.versichertePersonengruppe!= null), (that.versichertePersonengruppe!= null))) {
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
            CTVersichertePersonengruppe theVersichertePersonengruppe;
            theVersichertePersonengruppe = this.getVersichertePersonengruppe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertePersonengruppe", theVersichertePersonengruppe), currentHashCode, theVersichertePersonengruppe, (this.versichertePersonengruppe!= null));
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
        if (draftCopy instanceof CTUnfallversicherungJePersonengruppe) {
            final CTUnfallversicherungJePersonengruppe copy = ((CTUnfallversicherungJePersonengruppe) draftCopy);
            {
                Boolean versichertePersonengruppeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versichertePersonengruppe!= null));
                if (versichertePersonengruppeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVersichertePersonengruppe sourceVersichertePersonengruppe;
                    sourceVersichertePersonengruppe = this.getVersichertePersonengruppe();
                    CTVersichertePersonengruppe copyVersichertePersonengruppe = ((CTVersichertePersonengruppe) strategy.copy(LocatorUtils.property(locator, "versichertePersonengruppe", sourceVersichertePersonengruppe), sourceVersichertePersonengruppe, (this.versichertePersonengruppe!= null)));
                    copy.setVersichertePersonengruppe(copyVersichertePersonengruppe);
                } else {
                    if (versichertePersonengruppeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertePersonengruppe = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTUnfallversicherungJePersonengruppe();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withVersichertePersonengruppe(CTVersichertePersonengruppe value) {
        setVersichertePersonengruppe(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withEinschlussdatum(String value) {
        setEinschlussdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withAusschlussdatum(String value) {
        setAusschlussdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJePersonengruppe withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
