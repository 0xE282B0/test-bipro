
package net.bipro.namespace.allgemein;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.kapitalanlage.basis.CTAnteiligerBetrag;
import net.bipro.namespace.kapitalanlage.basis.CTBestand;
import net.bipro.namespace.kapitalanlage.basis.CTGrenzwert;
import net.bipro.namespace.kapitalanlage.basis.CTInvestmentkurs;
import net.bipro.namespace.kapitalanlage.basis.CTSaldo;
import net.bipro.namespace.kapitalanlage.basis.CTZinsen;
import net.bipro.namespace.partner.CTArbeitgeberanteil;
import net.bipro.namespace.partner.CTArbeitnehmeranteil;
import net.bipro.namespace.partner.CTEinkommen;
import net.bipro.namespace.partner.CTFreistellungsbetrag;
import net.bipro.namespace.partner.CTLohnsumme;
import net.bipro.namespace.partner.CTUmsatz;
import net.bipro.namespace.sepa.CTAbbuchung;
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
 * Das Objekt Geldwert dient der Beschreibung von Gegenstandswerten mit den Attributen Betrag und Waehrung.
 * Bestehende Attribute zur Wertbeschreibung in Gebaeude und Fahrzeug bleiben erhalten (Abwärtskompatibilität). In diesen Fällen DARF Geldwert NICHT genutzt werden.
 * 
 * <p>Java class for CT_Geldwert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Geldwert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Betrag" type="{http://www.bipro.net/namespace/datentypen}ST_Betrag" minOccurs="0"/&gt;
 *         &lt;element name="Waehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel" minOccurs="0"/&gt;
 *         &lt;element name="Stichtag" type="{http://www.bipro.net/namespace/datentypen}ST_DatumZeit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Geldwert", propOrder = {
    "betrag",
    "waehrung",
    "stichtag"
})
@XmlSeeAlso({
    CTArbeitgeberanteil.class,
    CTArbeitnehmeranteil.class,
    CTEinkommen.class,
    CTFreistellungsbetrag.class,
    CTLohnsumme.class,
    CTUmsatz.class,
    CTAbbuchung.class,
    CTAnteiligerBetrag.class,
    CTBestand.class,
    CTGrenzwert.class,
    CTInvestmentkurs.class,
    CTSaldo.class,
    CTZinsen.class,
    CTBestaetigungssumme.class,
    CTBetrag.class,
    CTKaufpreis.class,
    CTMietwert.class,
    CTNeuwert.class,
    CTPachtwert.class,
    CTStichtagsbetrag.class,
    CTZeitwert.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTGeldwert
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Betrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal betrag;
    @XmlElement(name = "Waehrung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel waehrung;
    @XmlElement(name = "Stichtag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String stichtag;

    /**
     * Gets the value of the betrag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBetrag(BigDecimal value) {
        this.betrag = value;
    }

    /**
     * Gets the value of the waehrung property.
     * 
     * @return
     *     possible object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWaehrungsschluessel getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWaehrung(STWaehrungsschluessel value) {
        this.waehrung = value;
    }

    /**
     * Gets the value of the stichtag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getStichtag() {
        return stichtag;
    }

    /**
     * Sets the value of the stichtag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStichtag(String value) {
        this.stichtag = value;
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
        final CTGeldwert that = ((CTGeldwert) object);
        {
            BigDecimal lhsBetrag;
            lhsBetrag = this.getBetrag();
            BigDecimal rhsBetrag;
            rhsBetrag = that.getBetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betrag", lhsBetrag), LocatorUtils.property(thatLocator, "betrag", rhsBetrag), lhsBetrag, rhsBetrag, (this.betrag!= null), (that.betrag!= null))) {
                return false;
            }
        }
        {
            STWaehrungsschluessel lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            STWaehrungsschluessel rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung, (this.waehrung!= null), (that.waehrung!= null))) {
                return false;
            }
        }
        {
            String lhsStichtag;
            lhsStichtag = this.getStichtag();
            String rhsStichtag;
            rhsStichtag = that.getStichtag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stichtag", lhsStichtag), LocatorUtils.property(thatLocator, "stichtag", rhsStichtag), lhsStichtag, rhsStichtag, (this.stichtag!= null), (that.stichtag!= null))) {
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
            BigDecimal theBetrag;
            theBetrag = this.getBetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betrag", theBetrag), currentHashCode, theBetrag, (this.betrag!= null));
        }
        {
            STWaehrungsschluessel theWaehrung;
            theWaehrung = this.getWaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waehrung", theWaehrung), currentHashCode, theWaehrung, (this.waehrung!= null));
        }
        {
            String theStichtag;
            theStichtag = this.getStichtag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stichtag", theStichtag), currentHashCode, theStichtag, (this.stichtag!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTGeldwert) {
            final CTGeldwert copy = ((CTGeldwert) target);
            {
                Boolean betragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betrag!= null));
                if (betragShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBetrag;
                    sourceBetrag = this.getBetrag();
                    BigDecimal copyBetrag = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "betrag", sourceBetrag), sourceBetrag, (this.betrag!= null)));
                    copy.setBetrag(copyBetrag);
                } else {
                    if (betragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betrag = null;
                    }
                }
            }
            {
                Boolean waehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waehrung!= null));
                if (waehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWaehrungsschluessel sourceWaehrung;
                    sourceWaehrung = this.getWaehrung();
                    STWaehrungsschluessel copyWaehrung = ((STWaehrungsschluessel) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung, (this.waehrung!= null)));
                    copy.setWaehrung(copyWaehrung);
                } else {
                    if (waehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waehrung = null;
                    }
                }
            }
            {
                Boolean stichtagShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stichtag!= null));
                if (stichtagShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStichtag;
                    sourceStichtag = this.getStichtag();
                    String copyStichtag = ((String) strategy.copy(LocatorUtils.property(locator, "stichtag", sourceStichtag), sourceStichtag, (this.stichtag!= null)));
                    copy.setStichtag(copyStichtag);
                } else {
                    if (stichtagShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stichtag = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeldwert withBetrag(BigDecimal value) {
        setBetrag(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeldwert withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeldwert withStichtag(String value) {
        setStichtag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeldwert withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeldwert withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
