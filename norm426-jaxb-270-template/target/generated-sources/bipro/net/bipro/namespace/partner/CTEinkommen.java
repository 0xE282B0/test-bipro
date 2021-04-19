
package net.bipro.namespace.partner;

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
import net.bipro.namespace.datentypen.STBruttoNetto;
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
 * Information zum konkreten Einkommen der Einkommensart
 * 
 * <p>Java class for CT_Einkommen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Einkommen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Geldwert"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zahlungsweise" type="{http://www.bipro.net/namespace/datentypen}ST_Zahlungsweise" minOccurs="0"/&gt;
 *         &lt;element name="Art" type="{http://www.bipro.net/namespace/datentypen}ST_BruttoNetto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Einkommen", propOrder = {
    "zahlungsweise",
    "art"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTEinkommen
    extends CTGeldwert
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Zahlungsweise")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STZahlungsweise zahlungsweise;
    @XmlElement(name = "Art")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBruttoNetto art;

    /**
     * Gets the value of the zahlungsweise property.
     * 
     * @return
     *     possible object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STZahlungsweise getZahlungsweise() {
        return zahlungsweise;
    }

    /**
     * Sets the value of the zahlungsweise property.
     * 
     * @param value
     *     allowed object is
     *     {@link STZahlungsweise }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZahlungsweise(STZahlungsweise value) {
        this.zahlungsweise = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link STBruttoNetto }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBruttoNetto getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBruttoNetto }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArt(STBruttoNetto value) {
        this.art = value;
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
        final CTEinkommen that = ((CTEinkommen) object);
        {
            STZahlungsweise lhsZahlungsweise;
            lhsZahlungsweise = this.getZahlungsweise();
            STZahlungsweise rhsZahlungsweise;
            rhsZahlungsweise = that.getZahlungsweise();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zahlungsweise", lhsZahlungsweise), LocatorUtils.property(thatLocator, "zahlungsweise", rhsZahlungsweise), lhsZahlungsweise, rhsZahlungsweise, (this.zahlungsweise!= null), (that.zahlungsweise!= null))) {
                return false;
            }
        }
        {
            STBruttoNetto lhsArt;
            lhsArt = this.getArt();
            STBruttoNetto rhsArt;
            rhsArt = that.getArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "art", lhsArt), LocatorUtils.property(thatLocator, "art", rhsArt), lhsArt, rhsArt, (this.art!= null), (that.art!= null))) {
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
            STZahlungsweise theZahlungsweise;
            theZahlungsweise = this.getZahlungsweise();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zahlungsweise", theZahlungsweise), currentHashCode, theZahlungsweise, (this.zahlungsweise!= null));
        }
        {
            STBruttoNetto theArt;
            theArt = this.getArt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "art", theArt), currentHashCode, theArt, (this.art!= null));
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
        if (draftCopy instanceof CTEinkommen) {
            final CTEinkommen copy = ((CTEinkommen) draftCopy);
            {
                Boolean zahlungsweiseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zahlungsweise!= null));
                if (zahlungsweiseShouldBeCopiedAndSet == Boolean.TRUE) {
                    STZahlungsweise sourceZahlungsweise;
                    sourceZahlungsweise = this.getZahlungsweise();
                    STZahlungsweise copyZahlungsweise = ((STZahlungsweise) strategy.copy(LocatorUtils.property(locator, "zahlungsweise", sourceZahlungsweise), sourceZahlungsweise, (this.zahlungsweise!= null)));
                    copy.setZahlungsweise(copyZahlungsweise);
                } else {
                    if (zahlungsweiseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zahlungsweise = null;
                    }
                }
            }
            {
                Boolean artShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.art!= null));
                if (artShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBruttoNetto sourceArt;
                    sourceArt = this.getArt();
                    STBruttoNetto copyArt = ((STBruttoNetto) strategy.copy(LocatorUtils.property(locator, "art", sourceArt), sourceArt, (this.art!= null)));
                    copy.setArt(copyArt);
                } else {
                    if (artShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.art = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTEinkommen();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommen withZahlungsweise(STZahlungsweise value) {
        setZahlungsweise(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommen withArt(STBruttoNetto value) {
        setArt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommen withBetrag(BigDecimal value) {
        setBetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommen withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommen withStichtag(String value) {
        setStichtag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommen withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTEinkommen withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
