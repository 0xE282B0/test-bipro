
package net.bipro.namespace.kapitalanlage.basis;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.partner.CTPartnerrolle;
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
 * Gläubiger der abgetretenen Kapitalanlage.
 * 
 * <p>Java class for CT_Abtretungsglaeubiger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Abtretungsglaeubiger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/partner}CT_Partnerrolle"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatumDerAbtretung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Rangfolge" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="AnteiligerBetrag" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_AnteiligerBetrag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Abtretungsglaeubiger", propOrder = {
    "datumDerAbtretung",
    "rangfolge",
    "anteiligerBetrag"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAbtretungsglaeubiger
    extends CTPartnerrolle
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "DatumDerAbtretung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String datumDerAbtretung;
    @XmlElement(name = "Rangfolge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer rangfolge;
    @XmlElement(name = "AnteiligerBetrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTAnteiligerBetrag anteiligerBetrag;

    /**
     * Gets the value of the datumDerAbtretung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDatumDerAbtretung() {
        return datumDerAbtretung;
    }

    /**
     * Sets the value of the datumDerAbtretung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDatumDerAbtretung(String value) {
        this.datumDerAbtretung = value;
    }

    /**
     * Gets the value of the rangfolge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getRangfolge() {
        return rangfolge;
    }

    /**
     * Sets the value of the rangfolge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setRangfolge(Integer value) {
        this.rangfolge = value;
    }

    /**
     * Gets the value of the anteiligerBetrag property.
     * 
     * @return
     *     possible object is
     *     {@link CTAnteiligerBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnteiligerBetrag getAnteiligerBetrag() {
        return anteiligerBetrag;
    }

    /**
     * Sets the value of the anteiligerBetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAnteiligerBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnteiligerBetrag(CTAnteiligerBetrag value) {
        this.anteiligerBetrag = value;
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
        final CTAbtretungsglaeubiger that = ((CTAbtretungsglaeubiger) object);
        {
            String lhsDatumDerAbtretung;
            lhsDatumDerAbtretung = this.getDatumDerAbtretung();
            String rhsDatumDerAbtretung;
            rhsDatumDerAbtretung = that.getDatumDerAbtretung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datumDerAbtretung", lhsDatumDerAbtretung), LocatorUtils.property(thatLocator, "datumDerAbtretung", rhsDatumDerAbtretung), lhsDatumDerAbtretung, rhsDatumDerAbtretung, (this.datumDerAbtretung!= null), (that.datumDerAbtretung!= null))) {
                return false;
            }
        }
        {
            Integer lhsRangfolge;
            lhsRangfolge = this.getRangfolge();
            Integer rhsRangfolge;
            rhsRangfolge = that.getRangfolge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangfolge", lhsRangfolge), LocatorUtils.property(thatLocator, "rangfolge", rhsRangfolge), lhsRangfolge, rhsRangfolge, (this.rangfolge!= null), (that.rangfolge!= null))) {
                return false;
            }
        }
        {
            CTAnteiligerBetrag lhsAnteiligerBetrag;
            lhsAnteiligerBetrag = this.getAnteiligerBetrag();
            CTAnteiligerBetrag rhsAnteiligerBetrag;
            rhsAnteiligerBetrag = that.getAnteiligerBetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteiligerBetrag", lhsAnteiligerBetrag), LocatorUtils.property(thatLocator, "anteiligerBetrag", rhsAnteiligerBetrag), lhsAnteiligerBetrag, rhsAnteiligerBetrag, (this.anteiligerBetrag!= null), (that.anteiligerBetrag!= null))) {
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
            String theDatumDerAbtretung;
            theDatumDerAbtretung = this.getDatumDerAbtretung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datumDerAbtretung", theDatumDerAbtretung), currentHashCode, theDatumDerAbtretung, (this.datumDerAbtretung!= null));
        }
        {
            Integer theRangfolge;
            theRangfolge = this.getRangfolge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangfolge", theRangfolge), currentHashCode, theRangfolge, (this.rangfolge!= null));
        }
        {
            CTAnteiligerBetrag theAnteiligerBetrag;
            theAnteiligerBetrag = this.getAnteiligerBetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anteiligerBetrag", theAnteiligerBetrag), currentHashCode, theAnteiligerBetrag, (this.anteiligerBetrag!= null));
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
        if (draftCopy instanceof CTAbtretungsglaeubiger) {
            final CTAbtretungsglaeubiger copy = ((CTAbtretungsglaeubiger) draftCopy);
            {
                Boolean datumDerAbtretungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datumDerAbtretung!= null));
                if (datumDerAbtretungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDatumDerAbtretung;
                    sourceDatumDerAbtretung = this.getDatumDerAbtretung();
                    String copyDatumDerAbtretung = ((String) strategy.copy(LocatorUtils.property(locator, "datumDerAbtretung", sourceDatumDerAbtretung), sourceDatumDerAbtretung, (this.datumDerAbtretung!= null)));
                    copy.setDatumDerAbtretung(copyDatumDerAbtretung);
                } else {
                    if (datumDerAbtretungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datumDerAbtretung = null;
                    }
                }
            }
            {
                Boolean rangfolgeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rangfolge!= null));
                if (rangfolgeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceRangfolge;
                    sourceRangfolge = this.getRangfolge();
                    Integer copyRangfolge = ((Integer) strategy.copy(LocatorUtils.property(locator, "rangfolge", sourceRangfolge), sourceRangfolge, (this.rangfolge!= null)));
                    copy.setRangfolge(copyRangfolge);
                } else {
                    if (rangfolgeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rangfolge = null;
                    }
                }
            }
            {
                Boolean anteiligerBetragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anteiligerBetrag!= null));
                if (anteiligerBetragShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAnteiligerBetrag sourceAnteiligerBetrag;
                    sourceAnteiligerBetrag = this.getAnteiligerBetrag();
                    CTAnteiligerBetrag copyAnteiligerBetrag = ((CTAnteiligerBetrag) strategy.copy(LocatorUtils.property(locator, "anteiligerBetrag", sourceAnteiligerBetrag), sourceAnteiligerBetrag, (this.anteiligerBetrag!= null)));
                    copy.setAnteiligerBetrag(copyAnteiligerBetrag);
                } else {
                    if (anteiligerBetragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anteiligerBetrag = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAbtretungsglaeubiger();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbtretungsglaeubiger withDatumDerAbtretung(String value) {
        setDatumDerAbtretung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbtretungsglaeubiger withRangfolge(Integer value) {
        setRangfolge(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbtretungsglaeubiger withAnteiligerBetrag(CTAnteiligerBetrag value) {
        setAnteiligerBetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbtretungsglaeubiger withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbtretungsglaeubiger withGueltigkeit(CTZeitraum value) {
        setGueltigkeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbtretungsglaeubiger withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbtretungsglaeubiger withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
