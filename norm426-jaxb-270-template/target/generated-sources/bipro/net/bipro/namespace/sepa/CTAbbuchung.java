
package net.bipro.namespace.sepa;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTGeldwert;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.datentypen.STZahlungsweise;
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
 * Die einmalige bzw. regelmäßige Abbuchung eines bestimmten Betrags zu bzw. ab einem konkreten Zeitpunkt.
 * 
 * Die Angabe des Zeitpunkts MUSS mittels dem Attribut Stichtag erfolgen.
 * Im Attribut Zahlweise MUSS angegeben werden, ob es sich um eine einmalige oder wiederkehrende Abbuchung handelt. Ist Zahlweise kontinuierlich (z.B. monatlich, jährlich) belegt, MUSS das Datum "Stichtag" als erster Abbuchungstag belegt bzw. interpretiert werden.
 * 
 * Bsp.: Zahlweise = 8 (monatlich), Stichtag = 2013-04-01 bedeutet: Ab dem 1.4.2013 wird monatlich der angegebene Betrag abgebucht.
 * 
 * Im Kontext SEPA sind nur Abbuchungen in Euro erlaubt. Die "Waehrung" MUSS also mit "EUR" (Euro) belegt werden.
 * 
 * <p>Java class for CT_Abbuchung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Abbuchung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Geldwert"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zahlweise" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsweise"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Abbuchung", propOrder = {
    "zahlweise"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAbbuchung
    extends CTGeldwert
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Zahlweise", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsweise zahlweise;

    /**
     * Gets the value of the zahlweise property.
     * 
     * @return
     *     possible object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STZahlungsweise getZahlweise() {
        return zahlweise;
    }

    /**
     * Sets the value of the zahlweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZahlweise(STZahlungsweise value) {
        this.zahlweise = value;
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
        final CTAbbuchung that = ((CTAbbuchung) object);
        {
            STZahlungsweise lhsZahlweise;
            lhsZahlweise = this.getZahlweise();
            STZahlungsweise rhsZahlweise;
            rhsZahlweise = that.getZahlweise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zahlweise", lhsZahlweise), LocatorUtils.property(thatLocator, "zahlweise", rhsZahlweise), lhsZahlweise, rhsZahlweise, (this.zahlweise!= null), (that.zahlweise!= null))) {
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
            STZahlungsweise theZahlweise;
            theZahlweise = this.getZahlweise();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahlweise", theZahlweise), currentHashCode, theZahlweise, (this.zahlweise!= null));
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
        if (draftCopy instanceof CTAbbuchung) {
            final CTAbbuchung copy = ((CTAbbuchung) draftCopy);
            {
                Boolean zahlweiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zahlweise!= null));
                if (zahlweiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    STZahlungsweise sourceZahlweise;
                    sourceZahlweise = this.getZahlweise();
                    STZahlungsweise copyZahlweise = ((STZahlungsweise) strategy.copy(LocatorUtils.property(locator, "zahlweise", sourceZahlweise), sourceZahlweise, (this.zahlweise!= null)));
                    copy.setZahlweise(copyZahlweise);
                } else {
                    if (zahlweiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zahlweise = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAbbuchung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbbuchung withZahlweise(STZahlungsweise value) {
        setZahlweise(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbbuchung withBetrag(BigDecimal value) {
        setBetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbbuchung withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbbuchung withStichtag(String value) {
        setStichtag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbbuchung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbbuchung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
