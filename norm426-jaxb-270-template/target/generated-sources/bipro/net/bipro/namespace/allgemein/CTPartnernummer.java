
package net.bipro.namespace.allgemein;

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
 * Eindeutige Identifizierung eines Partners bei dem Partner, der als Quelle spezifiziert wird. 
 * Wird benötigt um eine Partnernummer zu spezifieren, die nicht vom produktgebenden Unternehmen oder vom Vermittler sondern von einem Dritten vergeben wurde, z. B. einem Dienstleister.
 * 
 * <p>Java class for CT_Partnernummer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Partnernummer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030"/&gt;
 *         &lt;element name="Quelle" type="{http://www.bipro.net/namespace/allgemein}CT_Quelle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Partnernummer", propOrder = {
    "nummer",
    "quelle"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTPartnernummer
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Nummer", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String nummer;
    @XmlElement(name = "Quelle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTQuelle quelle;

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the quelle property.
     * 
     * @return
     *     possible object is
     *     {@link CTQuelle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTQuelle getQuelle() {
        return quelle;
    }

    /**
     * Sets the value of the quelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTQuelle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setQuelle(CTQuelle value) {
        this.quelle = value;
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
        final CTPartnernummer that = ((CTPartnernummer) object);
        {
            String lhsNummer;
            lhsNummer = this.getNummer();
            String rhsNummer;
            rhsNummer = that.getNummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nummer", lhsNummer), LocatorUtils.property(thatLocator, "nummer", rhsNummer), lhsNummer, rhsNummer, (this.nummer!= null), (that.nummer!= null))) {
                return false;
            }
        }
        {
            CTQuelle lhsQuelle;
            lhsQuelle = this.getQuelle();
            CTQuelle rhsQuelle;
            rhsQuelle = that.getQuelle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quelle", lhsQuelle), LocatorUtils.property(thatLocator, "quelle", rhsQuelle), lhsQuelle, rhsQuelle, (this.quelle!= null), (that.quelle!= null))) {
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
            String theNummer;
            theNummer = this.getNummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nummer", theNummer), currentHashCode, theNummer, (this.nummer!= null));
        }
        {
            CTQuelle theQuelle;
            theQuelle = this.getQuelle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quelle", theQuelle), currentHashCode, theQuelle, (this.quelle!= null));
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
        if (draftCopy instanceof CTPartnernummer) {
            final CTPartnernummer copy = ((CTPartnernummer) draftCopy);
            {
                Boolean nummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nummer!= null));
                if (nummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNummer;
                    sourceNummer = this.getNummer();
                    String copyNummer = ((String) strategy.copy(LocatorUtils.property(locator, "nummer", sourceNummer), sourceNummer, (this.nummer!= null)));
                    copy.setNummer(copyNummer);
                } else {
                    if (nummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nummer = null;
                    }
                }
            }
            {
                Boolean quelleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.quelle!= null));
                if (quelleShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTQuelle sourceQuelle;
                    sourceQuelle = this.getQuelle();
                    CTQuelle copyQuelle = ((CTQuelle) strategy.copy(LocatorUtils.property(locator, "quelle", sourceQuelle), sourceQuelle, (this.quelle!= null)));
                    copy.setQuelle(copyQuelle);
                } else {
                    if (quelleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.quelle = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTPartnernummer();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnernummer withNummer(String value) {
        setNummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnernummer withQuelle(CTQuelle value) {
        setQuelle(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnernummer withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnernummer withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
