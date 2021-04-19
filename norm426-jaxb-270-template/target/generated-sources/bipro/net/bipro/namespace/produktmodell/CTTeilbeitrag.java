
package net.bipro.namespace.produktmodell;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBetrag;
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
 * Klasse zur Abbildung von Teilbeiträgen.
 * 
 * <p>Java class for CT_Teilbeitrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Teilbeitrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Anteil" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Betrag" type="{http://www.bipro.net/namespace/allgemein}CT_Betrag" minOccurs="0"/&gt;
 *         &lt;element name="Beitragsfoerderung" type="{http://www.bipro.net/namespace/produktmodell}CT_Beitragsfoerderung" minOccurs="0"/&gt;
 *         &lt;element name="Beitragsschuldner" type="{http://www.bipro.net/namespace/produktmodell}CT_Beitragsschuldner" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Teilbeitrag", propOrder = {
    "anteil",
    "betrag",
    "beitragsfoerderung",
    "beitragsschuldner"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTTeilbeitrag
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Anteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anteil;
    @XmlElement(name = "Betrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBetrag betrag;
    @XmlElement(name = "Beitragsfoerderung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBeitragsfoerderung beitragsfoerderung;
    @XmlElement(name = "Beitragsschuldner")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBeitragsschuldner beitragsschuldner;

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnteil(BigDecimal value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the betrag property.
     * 
     * @return
     *     possible object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrag getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBetrag(CTBetrag value) {
        this.betrag = value;
    }

    /**
     * Gets the value of the beitragsfoerderung property.
     * 
     * @return
     *     possible object is
     *     {@link CTBeitragsfoerderung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitragsfoerderung getBeitragsfoerderung() {
        return beitragsfoerderung;
    }

    /**
     * Sets the value of the beitragsfoerderung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBeitragsfoerderung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeitragsfoerderung(CTBeitragsfoerderung value) {
        this.beitragsfoerderung = value;
    }

    /**
     * Gets the value of the beitragsschuldner property.
     * 
     * @return
     *     possible object is
     *     {@link CTBeitragsschuldner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBeitragsschuldner getBeitragsschuldner() {
        return beitragsschuldner;
    }

    /**
     * Sets the value of the beitragsschuldner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBeitragsschuldner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeitragsschuldner(CTBeitragsschuldner value) {
        this.beitragsschuldner = value;
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
        final CTTeilbeitrag that = ((CTTeilbeitrag) object);
        {
            BigDecimal lhsAnteil;
            lhsAnteil = this.getAnteil();
            BigDecimal rhsAnteil;
            rhsAnteil = that.getAnteil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteil", lhsAnteil), LocatorUtils.property(thatLocator, "anteil", rhsAnteil), lhsAnteil, rhsAnteil, (this.anteil!= null), (that.anteil!= null))) {
                return false;
            }
        }
        {
            CTBetrag lhsBetrag;
            lhsBetrag = this.getBetrag();
            CTBetrag rhsBetrag;
            rhsBetrag = that.getBetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betrag", lhsBetrag), LocatorUtils.property(thatLocator, "betrag", rhsBetrag), lhsBetrag, rhsBetrag, (this.betrag!= null), (that.betrag!= null))) {
                return false;
            }
        }
        {
            CTBeitragsfoerderung lhsBeitragsfoerderung;
            lhsBeitragsfoerderung = this.getBeitragsfoerderung();
            CTBeitragsfoerderung rhsBeitragsfoerderung;
            rhsBeitragsfoerderung = that.getBeitragsfoerderung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragsfoerderung", lhsBeitragsfoerderung), LocatorUtils.property(thatLocator, "beitragsfoerderung", rhsBeitragsfoerderung), lhsBeitragsfoerderung, rhsBeitragsfoerderung, (this.beitragsfoerderung!= null), (that.beitragsfoerderung!= null))) {
                return false;
            }
        }
        {
            CTBeitragsschuldner lhsBeitragsschuldner;
            lhsBeitragsschuldner = this.getBeitragsschuldner();
            CTBeitragsschuldner rhsBeitragsschuldner;
            rhsBeitragsschuldner = that.getBeitragsschuldner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragsschuldner", lhsBeitragsschuldner), LocatorUtils.property(thatLocator, "beitragsschuldner", rhsBeitragsschuldner), lhsBeitragsschuldner, rhsBeitragsschuldner, (this.beitragsschuldner!= null), (that.beitragsschuldner!= null))) {
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
            BigDecimal theAnteil;
            theAnteil = this.getAnteil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anteil", theAnteil), currentHashCode, theAnteil, (this.anteil!= null));
        }
        {
            CTBetrag theBetrag;
            theBetrag = this.getBetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betrag", theBetrag), currentHashCode, theBetrag, (this.betrag!= null));
        }
        {
            CTBeitragsfoerderung theBeitragsfoerderung;
            theBeitragsfoerderung = this.getBeitragsfoerderung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragsfoerderung", theBeitragsfoerderung), currentHashCode, theBeitragsfoerderung, (this.beitragsfoerderung!= null));
        }
        {
            CTBeitragsschuldner theBeitragsschuldner;
            theBeitragsschuldner = this.getBeitragsschuldner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragsschuldner", theBeitragsschuldner), currentHashCode, theBeitragsschuldner, (this.beitragsschuldner!= null));
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
        if (draftCopy instanceof CTTeilbeitrag) {
            final CTTeilbeitrag copy = ((CTTeilbeitrag) draftCopy);
            {
                Boolean anteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anteil!= null));
                if (anteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnteil;
                    sourceAnteil = this.getAnteil();
                    BigDecimal copyAnteil = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anteil", sourceAnteil), sourceAnteil, (this.anteil!= null)));
                    copy.setAnteil(copyAnteil);
                } else {
                    if (anteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anteil = null;
                    }
                }
            }
            {
                Boolean betragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betrag!= null));
                if (betragShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBetrag sourceBetrag;
                    sourceBetrag = this.getBetrag();
                    CTBetrag copyBetrag = ((CTBetrag) strategy.copy(LocatorUtils.property(locator, "betrag", sourceBetrag), sourceBetrag, (this.betrag!= null)));
                    copy.setBetrag(copyBetrag);
                } else {
                    if (betragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betrag = null;
                    }
                }
            }
            {
                Boolean beitragsfoerderungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragsfoerderung!= null));
                if (beitragsfoerderungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBeitragsfoerderung sourceBeitragsfoerderung;
                    sourceBeitragsfoerderung = this.getBeitragsfoerderung();
                    CTBeitragsfoerderung copyBeitragsfoerderung = ((CTBeitragsfoerderung) strategy.copy(LocatorUtils.property(locator, "beitragsfoerderung", sourceBeitragsfoerderung), sourceBeitragsfoerderung, (this.beitragsfoerderung!= null)));
                    copy.setBeitragsfoerderung(copyBeitragsfoerderung);
                } else {
                    if (beitragsfoerderungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragsfoerderung = null;
                    }
                }
            }
            {
                Boolean beitragsschuldnerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragsschuldner!= null));
                if (beitragsschuldnerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBeitragsschuldner sourceBeitragsschuldner;
                    sourceBeitragsschuldner = this.getBeitragsschuldner();
                    CTBeitragsschuldner copyBeitragsschuldner = ((CTBeitragsschuldner) strategy.copy(LocatorUtils.property(locator, "beitragsschuldner", sourceBeitragsschuldner), sourceBeitragsschuldner, (this.beitragsschuldner!= null)));
                    copy.setBeitragsschuldner(copyBeitragsschuldner);
                } else {
                    if (beitragsschuldnerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragsschuldner = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTTeilbeitrag();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilbeitrag withAnteil(BigDecimal value) {
        setAnteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilbeitrag withBetrag(CTBetrag value) {
        setBetrag(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilbeitrag withBeitragsfoerderung(CTBeitragsfoerderung value) {
        setBeitragsfoerderung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilbeitrag withBeitragsschuldner(CTBeitragsschuldner value) {
        setBeitragsschuldner(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilbeitrag withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTTeilbeitrag withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
