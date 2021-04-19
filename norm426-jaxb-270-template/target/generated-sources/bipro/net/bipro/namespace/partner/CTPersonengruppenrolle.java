
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.versicherung.produktmodell.komposit.CTVersichertePersonengruppe;
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
 * Die Rolle der Personengruppe innerhalb eines konkreten Kontexts innerhalb der Nachricht. Alle Personengruppen werden innerhalb einer Liste unterhalb des Wurzelelements der Nachricht (i.d.R. abgeleitet von Geschaeftsvorgang) uebertragen und aus dem jeweiligen Kontext, aus dem sie benoetigt werden, mit Hilfe einer von diesem Datentypen abgeleiteten Rolle referenziert.
 * 
 * Hierfuer enthaelt Partnerrolle ein Attribut von Typ ST_ID, dessen Wert mit dem Wert des Attributs PersonengruppenID (ebenfalls vom Typ ST_ID) einer in der oben angesprochenen Liste enthaltenen Personengruppe uebereinstimmen muss.
 * 
 * <p>Java class for CT_Personengruppenrolle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Personengruppenrolle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonengruppenID" type="{http://www.bipro.net/namespace/datentypen}ST_ID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Personengruppenrolle", propOrder = {
    "personengruppenID"
})
@XmlSeeAlso({
    CTVersichertePersonengruppe.class,
    CTMitarbeitergruppe.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTPersonengruppenrolle
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "PersonengruppenID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String personengruppenID;

    /**
     * Gets the value of the personengruppenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPersonengruppenID() {
        return personengruppenID;
    }

    /**
     * Sets the value of the personengruppenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPersonengruppenID(String value) {
        this.personengruppenID = value;
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
        final CTPersonengruppenrolle that = ((CTPersonengruppenrolle) object);
        {
            String lhsPersonengruppenID;
            lhsPersonengruppenID = this.getPersonengruppenID();
            String rhsPersonengruppenID;
            rhsPersonengruppenID = that.getPersonengruppenID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personengruppenID", lhsPersonengruppenID), LocatorUtils.property(thatLocator, "personengruppenID", rhsPersonengruppenID), lhsPersonengruppenID, rhsPersonengruppenID, (this.personengruppenID!= null), (that.personengruppenID!= null))) {
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
            String thePersonengruppenID;
            thePersonengruppenID = this.getPersonengruppenID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personengruppenID", thePersonengruppenID), currentHashCode, thePersonengruppenID, (this.personengruppenID!= null));
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
        if (target instanceof CTPersonengruppenrolle) {
            final CTPersonengruppenrolle copy = ((CTPersonengruppenrolle) target);
            {
                Boolean personengruppenIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.personengruppenID!= null));
                if (personengruppenIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePersonengruppenID;
                    sourcePersonengruppenID = this.getPersonengruppenID();
                    String copyPersonengruppenID = ((String) strategy.copy(LocatorUtils.property(locator, "personengruppenID", sourcePersonengruppenID), sourcePersonengruppenID, (this.personengruppenID!= null)));
                    copy.setPersonengruppenID(copyPersonengruppenID);
                } else {
                    if (personengruppenIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.personengruppenID = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppenrolle withPersonengruppenID(String value) {
        setPersonengruppenID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppenrolle withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppenrolle withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
