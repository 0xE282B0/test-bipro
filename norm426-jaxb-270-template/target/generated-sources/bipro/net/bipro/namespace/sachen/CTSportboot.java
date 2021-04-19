
package net.bipro.namespace.sachen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
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
 * <p>Java class for CT_Sportboot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Sportboot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bootsname" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Registriernummer" type="{http://www.bipro.net/namespace/datentypen}ST_SportbootRegistriernummer" minOccurs="0"/&gt;
 *         &lt;element name="Motornummer" type="{http://www.bipro.net/namespace/datentypen}ST_SportbootMotornummer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Sportboot", propOrder = {
    "bootsname",
    "registriernummer",
    "motornummer"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTSportboot
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Bootsname")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bootsname;
    @XmlElement(name = "Registriernummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String registriernummer;
    @XmlElement(name = "Motornummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String motornummer;

    /**
     * Gets the value of the bootsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBootsname() {
        return bootsname;
    }

    /**
     * Sets the value of the bootsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBootsname(String value) {
        this.bootsname = value;
    }

    /**
     * Gets the value of the registriernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getRegistriernummer() {
        return registriernummer;
    }

    /**
     * Sets the value of the registriernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setRegistriernummer(String value) {
        this.registriernummer = value;
    }

    /**
     * Gets the value of the motornummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getMotornummer() {
        return motornummer;
    }

    /**
     * Sets the value of the motornummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMotornummer(String value) {
        this.motornummer = value;
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
        final CTSportboot that = ((CTSportboot) object);
        {
            String lhsBootsname;
            lhsBootsname = this.getBootsname();
            String rhsBootsname;
            rhsBootsname = that.getBootsname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bootsname", lhsBootsname), LocatorUtils.property(thatLocator, "bootsname", rhsBootsname), lhsBootsname, rhsBootsname, (this.bootsname!= null), (that.bootsname!= null))) {
                return false;
            }
        }
        {
            String lhsRegistriernummer;
            lhsRegistriernummer = this.getRegistriernummer();
            String rhsRegistriernummer;
            rhsRegistriernummer = that.getRegistriernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registriernummer", lhsRegistriernummer), LocatorUtils.property(thatLocator, "registriernummer", rhsRegistriernummer), lhsRegistriernummer, rhsRegistriernummer, (this.registriernummer!= null), (that.registriernummer!= null))) {
                return false;
            }
        }
        {
            String lhsMotornummer;
            lhsMotornummer = this.getMotornummer();
            String rhsMotornummer;
            rhsMotornummer = that.getMotornummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "motornummer", lhsMotornummer), LocatorUtils.property(thatLocator, "motornummer", rhsMotornummer), lhsMotornummer, rhsMotornummer, (this.motornummer!= null), (that.motornummer!= null))) {
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
            String theBootsname;
            theBootsname = this.getBootsname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bootsname", theBootsname), currentHashCode, theBootsname, (this.bootsname!= null));
        }
        {
            String theRegistriernummer;
            theRegistriernummer = this.getRegistriernummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registriernummer", theRegistriernummer), currentHashCode, theRegistriernummer, (this.registriernummer!= null));
        }
        {
            String theMotornummer;
            theMotornummer = this.getMotornummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "motornummer", theMotornummer), currentHashCode, theMotornummer, (this.motornummer!= null));
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
        if (draftCopy instanceof CTSportboot) {
            final CTSportboot copy = ((CTSportboot) draftCopy);
            {
                Boolean bootsnameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bootsname!= null));
                if (bootsnameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBootsname;
                    sourceBootsname = this.getBootsname();
                    String copyBootsname = ((String) strategy.copy(LocatorUtils.property(locator, "bootsname", sourceBootsname), sourceBootsname, (this.bootsname!= null)));
                    copy.setBootsname(copyBootsname);
                } else {
                    if (bootsnameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bootsname = null;
                    }
                }
            }
            {
                Boolean registriernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.registriernummer!= null));
                if (registriernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRegistriernummer;
                    sourceRegistriernummer = this.getRegistriernummer();
                    String copyRegistriernummer = ((String) strategy.copy(LocatorUtils.property(locator, "registriernummer", sourceRegistriernummer), sourceRegistriernummer, (this.registriernummer!= null)));
                    copy.setRegistriernummer(copyRegistriernummer);
                } else {
                    if (registriernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.registriernummer = null;
                    }
                }
            }
            {
                Boolean motornummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.motornummer!= null));
                if (motornummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMotornummer;
                    sourceMotornummer = this.getMotornummer();
                    String copyMotornummer = ((String) strategy.copy(LocatorUtils.property(locator, "motornummer", sourceMotornummer), sourceMotornummer, (this.motornummer!= null)));
                    copy.setMotornummer(copyMotornummer);
                } else {
                    if (motornummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.motornummer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTSportboot();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withBootsname(String value) {
        setBootsname(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withRegistriernummer(String value) {
        setRegistriernummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withMotornummer(String value) {
        setMotornummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSportboot withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
