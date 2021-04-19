
package net.bipro.namespace.allgemein;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STBerechnungseinheit;
import net.bipro.namespace.datentypen.STEVermittlerrolleSchluessel;
import net.bipro.namespace.datentypen.STVermittlerrolle;
import net.bipro.namespace.datentypen.STVermittlertyp;
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
 * Rolle(n) des Vermittlers innerhalb des Geschaeftsvorgangs.
 * 
 * <p>Java class for CT_Vermittlerrolle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Vermittlerrolle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Vermittlerrolle"/&gt;
 *         &lt;element name="Wert" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Wertschluessel" type="{http://www.bipro.net/namespace/datentypen}STE_VermittlerrolleSchluessel" minOccurs="0"/&gt;
 *         &lt;element name="Werteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Berechnungseinheit" minOccurs="0"/&gt;
 *         &lt;element name="Vermittlertyp" type="{http://www.bipro.net/namespace/datentypen}ST_Vermittlertyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Vermittlerrolle", propOrder = {
    "artID",
    "wert",
    "wertschluessel",
    "werteinheit",
    "vermittlertyp"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTVermittlerrolle
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVermittlerrolle artID;
    @XmlElement(name = "Wert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal wert;
    @XmlElement(name = "Wertschluessel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEVermittlerrolleSchluessel wertschluessel;
    @XmlElement(name = "Werteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBerechnungseinheit werteinheit;
    @XmlElement(name = "Vermittlertyp")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVermittlertyp vermittlertyp;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STVermittlerrolle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STVermittlerrolle getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVermittlerrolle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STVermittlerrolle value) {
        this.artID = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWert(BigDecimal value) {
        this.wert = value;
    }

    /**
     * Gets the value of the wertschluessel property.
     * 
     * @return
     *     possible object is
     *     {@link STEVermittlerrolleSchluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEVermittlerrolleSchluessel getWertschluessel() {
        return wertschluessel;
    }

    /**
     * Sets the value of the wertschluessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEVermittlerrolleSchluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWertschluessel(STEVermittlerrolleSchluessel value) {
        this.wertschluessel = value;
    }

    /**
     * Gets the value of the werteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STBerechnungseinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBerechnungseinheit getWerteinheit() {
        return werteinheit;
    }

    /**
     * Sets the value of the werteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBerechnungseinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWerteinheit(STBerechnungseinheit value) {
        this.werteinheit = value;
    }

    /**
     * Gets the value of the vermittlertyp property.
     * 
     * @return
     *     possible object is
     *     {@link STVermittlertyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STVermittlertyp getVermittlertyp() {
        return vermittlertyp;
    }

    /**
     * Sets the value of the vermittlertyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVermittlertyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVermittlertyp(STVermittlertyp value) {
        this.vermittlertyp = value;
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
        final CTVermittlerrolle that = ((CTVermittlerrolle) object);
        {
            STVermittlerrolle lhsArtID;
            lhsArtID = this.getArtID();
            STVermittlerrolle rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWert;
            lhsWert = this.getWert();
            BigDecimal rhsWert;
            rhsWert = that.getWert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wert", lhsWert), LocatorUtils.property(thatLocator, "wert", rhsWert), lhsWert, rhsWert, (this.wert!= null), (that.wert!= null))) {
                return false;
            }
        }
        {
            STEVermittlerrolleSchluessel lhsWertschluessel;
            lhsWertschluessel = this.getWertschluessel();
            STEVermittlerrolleSchluessel rhsWertschluessel;
            rhsWertschluessel = that.getWertschluessel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wertschluessel", lhsWertschluessel), LocatorUtils.property(thatLocator, "wertschluessel", rhsWertschluessel), lhsWertschluessel, rhsWertschluessel, (this.wertschluessel!= null), (that.wertschluessel!= null))) {
                return false;
            }
        }
        {
            STBerechnungseinheit lhsWerteinheit;
            lhsWerteinheit = this.getWerteinheit();
            STBerechnungseinheit rhsWerteinheit;
            rhsWerteinheit = that.getWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "werteinheit", lhsWerteinheit), LocatorUtils.property(thatLocator, "werteinheit", rhsWerteinheit), lhsWerteinheit, rhsWerteinheit, (this.werteinheit!= null), (that.werteinheit!= null))) {
                return false;
            }
        }
        {
            STVermittlertyp lhsVermittlertyp;
            lhsVermittlertyp = this.getVermittlertyp();
            STVermittlertyp rhsVermittlertyp;
            rhsVermittlertyp = that.getVermittlertyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittlertyp", lhsVermittlertyp), LocatorUtils.property(thatLocator, "vermittlertyp", rhsVermittlertyp), lhsVermittlertyp, rhsVermittlertyp, (this.vermittlertyp!= null), (that.vermittlertyp!= null))) {
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
            STVermittlerrolle theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            BigDecimal theWert;
            theWert = this.getWert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wert", theWert), currentHashCode, theWert, (this.wert!= null));
        }
        {
            STEVermittlerrolleSchluessel theWertschluessel;
            theWertschluessel = this.getWertschluessel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wertschluessel", theWertschluessel), currentHashCode, theWertschluessel, (this.wertschluessel!= null));
        }
        {
            STBerechnungseinheit theWerteinheit;
            theWerteinheit = this.getWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "werteinheit", theWerteinheit), currentHashCode, theWerteinheit, (this.werteinheit!= null));
        }
        {
            STVermittlertyp theVermittlertyp;
            theVermittlertyp = this.getVermittlertyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittlertyp", theVermittlertyp), currentHashCode, theVermittlertyp, (this.vermittlertyp!= null));
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
        if (draftCopy instanceof CTVermittlerrolle) {
            final CTVermittlerrolle copy = ((CTVermittlerrolle) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVermittlerrolle sourceArtID;
                    sourceArtID = this.getArtID();
                    STVermittlerrolle copyArtID = ((STVermittlerrolle) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean wertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wert!= null));
                if (wertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWert;
                    sourceWert = this.getWert();
                    BigDecimal copyWert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wert", sourceWert), sourceWert, (this.wert!= null)));
                    copy.setWert(copyWert);
                } else {
                    if (wertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wert = null;
                    }
                }
            }
            {
                Boolean wertschluesselShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wertschluessel!= null));
                if (wertschluesselShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEVermittlerrolleSchluessel sourceWertschluessel;
                    sourceWertschluessel = this.getWertschluessel();
                    STEVermittlerrolleSchluessel copyWertschluessel = ((STEVermittlerrolleSchluessel) strategy.copy(LocatorUtils.property(locator, "wertschluessel", sourceWertschluessel), sourceWertschluessel, (this.wertschluessel!= null)));
                    copy.setWertschluessel(copyWertschluessel);
                } else {
                    if (wertschluesselShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wertschluessel = null;
                    }
                }
            }
            {
                Boolean werteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.werteinheit!= null));
                if (werteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBerechnungseinheit sourceWerteinheit;
                    sourceWerteinheit = this.getWerteinheit();
                    STBerechnungseinheit copyWerteinheit = ((STBerechnungseinheit) strategy.copy(LocatorUtils.property(locator, "werteinheit", sourceWerteinheit), sourceWerteinheit, (this.werteinheit!= null)));
                    copy.setWerteinheit(copyWerteinheit);
                } else {
                    if (werteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.werteinheit = null;
                    }
                }
            }
            {
                Boolean vermittlertypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermittlertyp!= null));
                if (vermittlertypShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVermittlertyp sourceVermittlertyp;
                    sourceVermittlertyp = this.getVermittlertyp();
                    STVermittlertyp copyVermittlertyp = ((STVermittlertyp) strategy.copy(LocatorUtils.property(locator, "vermittlertyp", sourceVermittlertyp), sourceVermittlertyp, (this.vermittlertyp!= null)));
                    copy.setVermittlertyp(copyVermittlertyp);
                } else {
                    if (vermittlertypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittlertyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVermittlerrolle();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittlerrolle withArtID(STVermittlerrolle value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittlerrolle withWert(BigDecimal value) {
        setWert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittlerrolle withWertschluessel(STEVermittlerrolleSchluessel value) {
        setWertschluessel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittlerrolle withWerteinheit(STBerechnungseinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittlerrolle withVermittlertyp(STVermittlertyp value) {
        setVermittlertyp(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittlerrolle withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittlerrolle withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
