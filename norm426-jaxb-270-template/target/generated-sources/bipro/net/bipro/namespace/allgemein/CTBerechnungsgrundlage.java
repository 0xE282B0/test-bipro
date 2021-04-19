
package net.bipro.namespace.allgemein;

import java.math.BigDecimal;
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
 * Über das Objekt Berechnungsgrundlage können Angaben dazu erfolgen, ob bestimmte Faktoren in die Bestimmung des Werts eingeflossen sind. Erfolgt eine solche Angabe nicht, so gelten folgende Standardannahmen:
 * (Letzte/Summe)ErhalteneZulagen:
 * Zulagen berücksichtigt - ja
 * GezahlteBeitragssumme: 
 * Zulagen berücksichtigt - nein
 * GarantierteRente/Erlebensfallleistung:
 * Zulagen berücksichtigt - ja
 * Steuern berücksichtigt - ja
 * Gesamte/Beitragsfreie Rente/Erlebens-/Todesfallleistung:
 * Zulagen berücksichtigt - ja
 * Hochrechnungszins - Pflichtangabe (bei fondsgebundenen)
 * Wertentwicklung gem. Hochrechnungszins nach Fondskosten - ja
 * Steuern berücksichtigt - nein
 * GarantierteTodesfallleistung:
 * Zulagen berücksichtigt - ja
 * Rückkaufswert:
 * Zulagen berücksichtigt - ja
 * Stornokosten berücksichtigt - ja
 * Steuern berücksichtigt - ja
 * Vertragswert:
 * Zulagen berücksichtigt - ja
 * Steuern berücksichtigt - ja
 * 
 * <p>Java class for CT_Berechnungsgrundlage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Berechnungsgrundlage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zulagen" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Stornokosten" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Steuern" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="WertentwicklungNachFondskosten" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Hochrechnungszins" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Berechnungsgrundlage", propOrder = {
    "zulagen",
    "stornokosten",
    "steuern",
    "wertentwicklungNachFondskosten",
    "hochrechnungszins"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTBerechnungsgrundlage
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Zulagen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean zulagen;
    @XmlElement(name = "Stornokosten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean stornokosten;
    @XmlElement(name = "Steuern")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean steuern;
    @XmlElement(name = "WertentwicklungNachFondskosten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean wertentwicklungNachFondskosten;
    @XmlElement(name = "Hochrechnungszins")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal hochrechnungszins;

    /**
     * Gets the value of the zulagen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isZulagen() {
        return zulagen;
    }

    /**
     * Sets the value of the zulagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZulagen(Boolean value) {
        this.zulagen = value;
    }

    /**
     * Gets the value of the stornokosten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isStornokosten() {
        return stornokosten;
    }

    /**
     * Sets the value of the stornokosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStornokosten(Boolean value) {
        this.stornokosten = value;
    }

    /**
     * Gets the value of the steuern property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isSteuern() {
        return steuern;
    }

    /**
     * Sets the value of the steuern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSteuern(Boolean value) {
        this.steuern = value;
    }

    /**
     * Gets the value of the wertentwicklungNachFondskosten property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isWertentwicklungNachFondskosten() {
        return wertentwicklungNachFondskosten;
    }

    /**
     * Sets the value of the wertentwicklungNachFondskosten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWertentwicklungNachFondskosten(Boolean value) {
        this.wertentwicklungNachFondskosten = value;
    }

    /**
     * Gets the value of the hochrechnungszins property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getHochrechnungszins() {
        return hochrechnungszins;
    }

    /**
     * Sets the value of the hochrechnungszins property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHochrechnungszins(BigDecimal value) {
        this.hochrechnungszins = value;
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
        final CTBerechnungsgrundlage that = ((CTBerechnungsgrundlage) object);
        {
            Boolean lhsZulagen;
            lhsZulagen = this.isZulagen();
            Boolean rhsZulagen;
            rhsZulagen = that.isZulagen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zulagen", lhsZulagen), LocatorUtils.property(thatLocator, "zulagen", rhsZulagen), lhsZulagen, rhsZulagen, (this.zulagen!= null), (that.zulagen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsStornokosten;
            lhsStornokosten = this.isStornokosten();
            Boolean rhsStornokosten;
            rhsStornokosten = that.isStornokosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stornokosten", lhsStornokosten), LocatorUtils.property(thatLocator, "stornokosten", rhsStornokosten), lhsStornokosten, rhsStornokosten, (this.stornokosten!= null), (that.stornokosten!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSteuern;
            lhsSteuern = this.isSteuern();
            Boolean rhsSteuern;
            rhsSteuern = that.isSteuern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "steuern", lhsSteuern), LocatorUtils.property(thatLocator, "steuern", rhsSteuern), lhsSteuern, rhsSteuern, (this.steuern!= null), (that.steuern!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWertentwicklungNachFondskosten;
            lhsWertentwicklungNachFondskosten = this.isWertentwicklungNachFondskosten();
            Boolean rhsWertentwicklungNachFondskosten;
            rhsWertentwicklungNachFondskosten = that.isWertentwicklungNachFondskosten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wertentwicklungNachFondskosten", lhsWertentwicklungNachFondskosten), LocatorUtils.property(thatLocator, "wertentwicklungNachFondskosten", rhsWertentwicklungNachFondskosten), lhsWertentwicklungNachFondskosten, rhsWertentwicklungNachFondskosten, (this.wertentwicklungNachFondskosten!= null), (that.wertentwicklungNachFondskosten!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHochrechnungszins;
            lhsHochrechnungszins = this.getHochrechnungszins();
            BigDecimal rhsHochrechnungszins;
            rhsHochrechnungszins = that.getHochrechnungszins();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hochrechnungszins", lhsHochrechnungszins), LocatorUtils.property(thatLocator, "hochrechnungszins", rhsHochrechnungszins), lhsHochrechnungszins, rhsHochrechnungszins, (this.hochrechnungszins!= null), (that.hochrechnungszins!= null))) {
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
            Boolean theZulagen;
            theZulagen = this.isZulagen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zulagen", theZulagen), currentHashCode, theZulagen, (this.zulagen!= null));
        }
        {
            Boolean theStornokosten;
            theStornokosten = this.isStornokosten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stornokosten", theStornokosten), currentHashCode, theStornokosten, (this.stornokosten!= null));
        }
        {
            Boolean theSteuern;
            theSteuern = this.isSteuern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "steuern", theSteuern), currentHashCode, theSteuern, (this.steuern!= null));
        }
        {
            Boolean theWertentwicklungNachFondskosten;
            theWertentwicklungNachFondskosten = this.isWertentwicklungNachFondskosten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wertentwicklungNachFondskosten", theWertentwicklungNachFondskosten), currentHashCode, theWertentwicklungNachFondskosten, (this.wertentwicklungNachFondskosten!= null));
        }
        {
            BigDecimal theHochrechnungszins;
            theHochrechnungszins = this.getHochrechnungszins();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hochrechnungszins", theHochrechnungszins), currentHashCode, theHochrechnungszins, (this.hochrechnungszins!= null));
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
        if (draftCopy instanceof CTBerechnungsgrundlage) {
            final CTBerechnungsgrundlage copy = ((CTBerechnungsgrundlage) draftCopy);
            {
                Boolean zulagenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zulagen!= null));
                if (zulagenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZulagen;
                    sourceZulagen = this.isZulagen();
                    Boolean copyZulagen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zulagen", sourceZulagen), sourceZulagen, (this.zulagen!= null)));
                    copy.setZulagen(copyZulagen);
                } else {
                    if (zulagenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zulagen = null;
                    }
                }
            }
            {
                Boolean stornokostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stornokosten!= null));
                if (stornokostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceStornokosten;
                    sourceStornokosten = this.isStornokosten();
                    Boolean copyStornokosten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "stornokosten", sourceStornokosten), sourceStornokosten, (this.stornokosten!= null)));
                    copy.setStornokosten(copyStornokosten);
                } else {
                    if (stornokostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stornokosten = null;
                    }
                }
            }
            {
                Boolean steuernShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.steuern!= null));
                if (steuernShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSteuern;
                    sourceSteuern = this.isSteuern();
                    Boolean copySteuern = ((Boolean) strategy.copy(LocatorUtils.property(locator, "steuern", sourceSteuern), sourceSteuern, (this.steuern!= null)));
                    copy.setSteuern(copySteuern);
                } else {
                    if (steuernShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.steuern = null;
                    }
                }
            }
            {
                Boolean wertentwicklungNachFondskostenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wertentwicklungNachFondskosten!= null));
                if (wertentwicklungNachFondskostenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWertentwicklungNachFondskosten;
                    sourceWertentwicklungNachFondskosten = this.isWertentwicklungNachFondskosten();
                    Boolean copyWertentwicklungNachFondskosten = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wertentwicklungNachFondskosten", sourceWertentwicklungNachFondskosten), sourceWertentwicklungNachFondskosten, (this.wertentwicklungNachFondskosten!= null)));
                    copy.setWertentwicklungNachFondskosten(copyWertentwicklungNachFondskosten);
                } else {
                    if (wertentwicklungNachFondskostenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wertentwicklungNachFondskosten = null;
                    }
                }
            }
            {
                Boolean hochrechnungszinsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hochrechnungszins!= null));
                if (hochrechnungszinsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHochrechnungszins;
                    sourceHochrechnungszins = this.getHochrechnungszins();
                    BigDecimal copyHochrechnungszins = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hochrechnungszins", sourceHochrechnungszins), sourceHochrechnungszins, (this.hochrechnungszins!= null)));
                    copy.setHochrechnungszins(copyHochrechnungszins);
                } else {
                    if (hochrechnungszinsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hochrechnungszins = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBerechnungsgrundlage();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage withZulagen(Boolean value) {
        setZulagen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage withStornokosten(Boolean value) {
        setStornokosten(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage withSteuern(Boolean value) {
        setSteuern(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage withWertentwicklungNachFondskosten(Boolean value) {
        setWertentwicklungNachFondskosten(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage withHochrechnungszins(BigDecimal value) {
        setHochrechnungszins(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
