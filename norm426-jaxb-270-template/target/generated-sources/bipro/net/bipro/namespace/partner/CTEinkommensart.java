
package net.bipro.namespace.partner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEinkommensart;
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
 * Art des Einkommens.
 * 
 * <p>Java class for CT_Einkommensart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Einkommensart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnzahlGehaelterProJahr" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Einkommensart" type="{http://www.bipro.net/namespace/datentypen}ST_Einkommensart" minOccurs="0"/&gt;
 *         &lt;element name="VermoegenswirksameLeistung" type="{http://www.bipro.net/namespace/partner}CT_VermoegenswirksameLeistung" minOccurs="0"/&gt;
 *         &lt;element name="Einkommen" type="{http://www.bipro.net/namespace/partner}CT_Einkommen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Einkommensart", propOrder = {
    "anzahlGehaelterProJahr",
    "einkommensart",
    "vermoegenswirksameLeistung",
    "einkommen"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTEinkommensart
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "AnzahlGehaelterProJahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anzahlGehaelterProJahr;
    @XmlElement(name = "Einkommensart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEinkommensart einkommensart;
    @XmlElement(name = "VermoegenswirksameLeistung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVermoegenswirksameLeistung vermoegenswirksameLeistung;
    @XmlElement(name = "Einkommen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTEinkommen> einkommen;

    /**
     * Gets the value of the anzahlGehaelterProJahr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getAnzahlGehaelterProJahr() {
        return anzahlGehaelterProJahr;
    }

    /**
     * Sets the value of the anzahlGehaelterProJahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlGehaelterProJahr(BigDecimal value) {
        this.anzahlGehaelterProJahr = value;
    }

    /**
     * Gets the value of the einkommensart property.
     * 
     * @return
     *     possible object is
     *     {@link STEinkommensart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEinkommensart getEinkommensart() {
        return einkommensart;
    }

    /**
     * Sets the value of the einkommensart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEinkommensart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinkommensart(STEinkommensart value) {
        this.einkommensart = value;
    }

    /**
     * Gets the value of the vermoegenswirksameLeistung property.
     * 
     * @return
     *     possible object is
     *     {@link CTVermoegenswirksameLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVermoegenswirksameLeistung getVermoegenswirksameLeistung() {
        return vermoegenswirksameLeistung;
    }

    /**
     * Sets the value of the vermoegenswirksameLeistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVermoegenswirksameLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVermoegenswirksameLeistung(CTVermoegenswirksameLeistung value) {
        this.vermoegenswirksameLeistung = value;
    }

    /**
     * Gets the value of the einkommen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the einkommen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEinkommen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTEinkommen }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTEinkommen> getEinkommen() {
        if (einkommen == null) {
            einkommen = new ArrayList<CTEinkommen>();
        }
        return this.einkommen;
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
        final CTEinkommensart that = ((CTEinkommensart) object);
        {
            BigDecimal lhsAnzahlGehaelterProJahr;
            lhsAnzahlGehaelterProJahr = this.getAnzahlGehaelterProJahr();
            BigDecimal rhsAnzahlGehaelterProJahr;
            rhsAnzahlGehaelterProJahr = that.getAnzahlGehaelterProJahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlGehaelterProJahr", lhsAnzahlGehaelterProJahr), LocatorUtils.property(thatLocator, "anzahlGehaelterProJahr", rhsAnzahlGehaelterProJahr), lhsAnzahlGehaelterProJahr, rhsAnzahlGehaelterProJahr, (this.anzahlGehaelterProJahr!= null), (that.anzahlGehaelterProJahr!= null))) {
                return false;
            }
        }
        {
            STEinkommensart lhsEinkommensart;
            lhsEinkommensart = this.getEinkommensart();
            STEinkommensart rhsEinkommensart;
            rhsEinkommensart = that.getEinkommensart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einkommensart", lhsEinkommensart), LocatorUtils.property(thatLocator, "einkommensart", rhsEinkommensart), lhsEinkommensart, rhsEinkommensart, (this.einkommensart!= null), (that.einkommensart!= null))) {
                return false;
            }
        }
        {
            CTVermoegenswirksameLeistung lhsVermoegenswirksameLeistung;
            lhsVermoegenswirksameLeistung = this.getVermoegenswirksameLeistung();
            CTVermoegenswirksameLeistung rhsVermoegenswirksameLeistung;
            rhsVermoegenswirksameLeistung = that.getVermoegenswirksameLeistung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermoegenswirksameLeistung", lhsVermoegenswirksameLeistung), LocatorUtils.property(thatLocator, "vermoegenswirksameLeistung", rhsVermoegenswirksameLeistung), lhsVermoegenswirksameLeistung, rhsVermoegenswirksameLeistung, (this.vermoegenswirksameLeistung!= null), (that.vermoegenswirksameLeistung!= null))) {
                return false;
            }
        }
        {
            List<CTEinkommen> lhsEinkommen;
            lhsEinkommen = (((this.einkommen!= null)&&(!this.einkommen.isEmpty()))?this.getEinkommen():null);
            List<CTEinkommen> rhsEinkommen;
            rhsEinkommen = (((that.einkommen!= null)&&(!that.einkommen.isEmpty()))?that.getEinkommen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einkommen", lhsEinkommen), LocatorUtils.property(thatLocator, "einkommen", rhsEinkommen), lhsEinkommen, rhsEinkommen, ((this.einkommen!= null)&&(!this.einkommen.isEmpty())), ((that.einkommen!= null)&&(!that.einkommen.isEmpty())))) {
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
            BigDecimal theAnzahlGehaelterProJahr;
            theAnzahlGehaelterProJahr = this.getAnzahlGehaelterProJahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlGehaelterProJahr", theAnzahlGehaelterProJahr), currentHashCode, theAnzahlGehaelterProJahr, (this.anzahlGehaelterProJahr!= null));
        }
        {
            STEinkommensart theEinkommensart;
            theEinkommensart = this.getEinkommensart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einkommensart", theEinkommensart), currentHashCode, theEinkommensart, (this.einkommensart!= null));
        }
        {
            CTVermoegenswirksameLeistung theVermoegenswirksameLeistung;
            theVermoegenswirksameLeistung = this.getVermoegenswirksameLeistung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermoegenswirksameLeistung", theVermoegenswirksameLeistung), currentHashCode, theVermoegenswirksameLeistung, (this.vermoegenswirksameLeistung!= null));
        }
        {
            List<CTEinkommen> theEinkommen;
            theEinkommen = (((this.einkommen!= null)&&(!this.einkommen.isEmpty()))?this.getEinkommen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einkommen", theEinkommen), currentHashCode, theEinkommen, ((this.einkommen!= null)&&(!this.einkommen.isEmpty())));
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
        if (draftCopy instanceof CTEinkommensart) {
            final CTEinkommensart copy = ((CTEinkommensart) draftCopy);
            {
                Boolean anzahlGehaelterProJahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlGehaelterProJahr!= null));
                if (anzahlGehaelterProJahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnzahlGehaelterProJahr;
                    sourceAnzahlGehaelterProJahr = this.getAnzahlGehaelterProJahr();
                    BigDecimal copyAnzahlGehaelterProJahr = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anzahlGehaelterProJahr", sourceAnzahlGehaelterProJahr), sourceAnzahlGehaelterProJahr, (this.anzahlGehaelterProJahr!= null)));
                    copy.setAnzahlGehaelterProJahr(copyAnzahlGehaelterProJahr);
                } else {
                    if (anzahlGehaelterProJahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlGehaelterProJahr = null;
                    }
                }
            }
            {
                Boolean einkommensartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einkommensart!= null));
                if (einkommensartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEinkommensart sourceEinkommensart;
                    sourceEinkommensart = this.getEinkommensart();
                    STEinkommensart copyEinkommensart = ((STEinkommensart) strategy.copy(LocatorUtils.property(locator, "einkommensart", sourceEinkommensart), sourceEinkommensart, (this.einkommensart!= null)));
                    copy.setEinkommensart(copyEinkommensart);
                } else {
                    if (einkommensartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einkommensart = null;
                    }
                }
            }
            {
                Boolean vermoegenswirksameLeistungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermoegenswirksameLeistung!= null));
                if (vermoegenswirksameLeistungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVermoegenswirksameLeistung sourceVermoegenswirksameLeistung;
                    sourceVermoegenswirksameLeistung = this.getVermoegenswirksameLeistung();
                    CTVermoegenswirksameLeistung copyVermoegenswirksameLeistung = ((CTVermoegenswirksameLeistung) strategy.copy(LocatorUtils.property(locator, "vermoegenswirksameLeistung", sourceVermoegenswirksameLeistung), sourceVermoegenswirksameLeistung, (this.vermoegenswirksameLeistung!= null)));
                    copy.setVermoegenswirksameLeistung(copyVermoegenswirksameLeistung);
                } else {
                    if (vermoegenswirksameLeistungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermoegenswirksameLeistung = null;
                    }
                }
            }
            {
                Boolean einkommenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.einkommen!= null)&&(!this.einkommen.isEmpty())));
                if (einkommenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTEinkommen> sourceEinkommen;
                    sourceEinkommen = (((this.einkommen!= null)&&(!this.einkommen.isEmpty()))?this.getEinkommen():null);
                    @SuppressWarnings("unchecked")
                    List<CTEinkommen> copyEinkommen = ((List<CTEinkommen> ) strategy.copy(LocatorUtils.property(locator, "einkommen", sourceEinkommen), sourceEinkommen, ((this.einkommen!= null)&&(!this.einkommen.isEmpty()))));
                    copy.einkommen = null;
                    if (copyEinkommen!= null) {
                        List<CTEinkommen> uniqueEinkommenl = copy.getEinkommen();
                        uniqueEinkommenl.addAll(copyEinkommen);
                    }
                } else {
                    if (einkommenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einkommen = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTEinkommensart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart withAnzahlGehaelterProJahr(BigDecimal value) {
        setAnzahlGehaelterProJahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart withEinkommensart(STEinkommensart value) {
        setEinkommensart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart withVermoegenswirksameLeistung(CTVermoegenswirksameLeistung value) {
        setVermoegenswirksameLeistung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart withEinkommen(CTEinkommen... values) {
        if (values!= null) {
            for (CTEinkommen value: values) {
                getEinkommen().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart withEinkommen(Collection<CTEinkommen> values) {
        if (values!= null) {
            getEinkommen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinkommensart withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
