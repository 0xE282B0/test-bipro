
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
 * Die Klasse UnfallVersicherungJeVP enthält zentrale Daten über eine versicherte Person (VP) innerhalb einer Unfallversicherung, z.B. das Einschlussdatum der VP oder den Gesamtbeitrag der VP.
 * 
 * <p>Java class for CT_UnfallversicherungJeVP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_UnfallversicherungJeVP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_UnfallversicherungJe"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersichertePerson" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_VersichertePerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_UnfallversicherungJeVP", propOrder = {
    "versichertePerson"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTUnfallversicherungJeVP
    extends CTUnfallversicherungJe
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "VersichertePerson")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVersichertePerson versichertePerson;

    /**
     * Gets the value of the versichertePerson property.
     * 
     * @return
     *     possible object is
     *     {@link CTVersichertePerson }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersichertePerson getVersichertePerson() {
        return versichertePerson;
    }

    /**
     * Sets the value of the versichertePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVersichertePerson }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersichertePerson(CTVersichertePerson value) {
        this.versichertePerson = value;
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
        final CTUnfallversicherungJeVP that = ((CTUnfallversicherungJeVP) object);
        {
            CTVersichertePerson lhsVersichertePerson;
            lhsVersichertePerson = this.getVersichertePerson();
            CTVersichertePerson rhsVersichertePerson;
            rhsVersichertePerson = that.getVersichertePerson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertePerson", lhsVersichertePerson), LocatorUtils.property(thatLocator, "versichertePerson", rhsVersichertePerson), lhsVersichertePerson, rhsVersichertePerson, (this.versichertePerson!= null), (that.versichertePerson!= null))) {
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
            CTVersichertePerson theVersichertePerson;
            theVersichertePerson = this.getVersichertePerson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertePerson", theVersichertePerson), currentHashCode, theVersichertePerson, (this.versichertePerson!= null));
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
        if (draftCopy instanceof CTUnfallversicherungJeVP) {
            final CTUnfallversicherungJeVP copy = ((CTUnfallversicherungJeVP) draftCopy);
            {
                Boolean versichertePersonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versichertePerson!= null));
                if (versichertePersonShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVersichertePerson sourceVersichertePerson;
                    sourceVersichertePerson = this.getVersichertePerson();
                    CTVersichertePerson copyVersichertePerson = ((CTVersichertePerson) strategy.copy(LocatorUtils.property(locator, "versichertePerson", sourceVersichertePerson), sourceVersichertePerson, (this.versichertePerson!= null)));
                    copy.setVersichertePerson(copyVersichertePerson);
                } else {
                    if (versichertePersonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertePerson = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTUnfallversicherungJeVP();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withVersichertePerson(CTVersichertePerson value) {
        setVersichertePerson(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withEinschlussdatum(String value) {
        setEinschlussdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withAusschlussdatum(String value) {
        setAusschlussdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJeVP withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
