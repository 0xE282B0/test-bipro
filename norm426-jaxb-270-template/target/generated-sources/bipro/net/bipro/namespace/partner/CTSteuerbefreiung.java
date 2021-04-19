
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STSteuerbefreiungsart;
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
 * Informationen zu einer Steuerbefreiung.
 * 
 * <p>Java class for CT_Steuerbefreiung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Steuerbefreiung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Steuerbefreiungsart" minOccurs="0"/&gt;
 *         &lt;element name="Gueltigkeitszeitraum" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="Freistellungsbetrag" type="{http://www.bipro.net/namespace/partner}CT_Freistellungsbetrag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Steuerbefreiung", propOrder = {
    "artID",
    "gueltigkeitszeitraum",
    "freistellungsbetrag"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTSteuerbefreiung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STSteuerbefreiungsart artID;
    @XmlElement(name = "Gueltigkeitszeitraum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum gueltigkeitszeitraum;
    @XmlElement(name = "Freistellungsbetrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTFreistellungsbetrag freistellungsbetrag;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STSteuerbefreiungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STSteuerbefreiungsart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSteuerbefreiungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STSteuerbefreiungsart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the gueltigkeitszeitraum property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getGueltigkeitszeitraum() {
        return gueltigkeitszeitraum;
    }

    /**
     * Sets the value of the gueltigkeitszeitraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGueltigkeitszeitraum(CTZeitraum value) {
        this.gueltigkeitszeitraum = value;
    }

    /**
     * Gets the value of the freistellungsbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link CTFreistellungsbetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFreistellungsbetrag getFreistellungsbetrag() {
        return freistellungsbetrag;
    }

    /**
     * Sets the value of the freistellungsbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTFreistellungsbetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFreistellungsbetrag(CTFreistellungsbetrag value) {
        this.freistellungsbetrag = value;
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
        final CTSteuerbefreiung that = ((CTSteuerbefreiung) object);
        {
            STSteuerbefreiungsart lhsArtID;
            lhsArtID = this.getArtID();
            STSteuerbefreiungsart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsGueltigkeitszeitraum;
            lhsGueltigkeitszeitraum = this.getGueltigkeitszeitraum();
            CTZeitraum rhsGueltigkeitszeitraum;
            rhsGueltigkeitszeitraum = that.getGueltigkeitszeitraum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigkeitszeitraum", lhsGueltigkeitszeitraum), LocatorUtils.property(thatLocator, "gueltigkeitszeitraum", rhsGueltigkeitszeitraum), lhsGueltigkeitszeitraum, rhsGueltigkeitszeitraum, (this.gueltigkeitszeitraum!= null), (that.gueltigkeitszeitraum!= null))) {
                return false;
            }
        }
        {
            CTFreistellungsbetrag lhsFreistellungsbetrag;
            lhsFreistellungsbetrag = this.getFreistellungsbetrag();
            CTFreistellungsbetrag rhsFreistellungsbetrag;
            rhsFreistellungsbetrag = that.getFreistellungsbetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freistellungsbetrag", lhsFreistellungsbetrag), LocatorUtils.property(thatLocator, "freistellungsbetrag", rhsFreistellungsbetrag), lhsFreistellungsbetrag, rhsFreistellungsbetrag, (this.freistellungsbetrag!= null), (that.freistellungsbetrag!= null))) {
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
            STSteuerbefreiungsart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            CTZeitraum theGueltigkeitszeitraum;
            theGueltigkeitszeitraum = this.getGueltigkeitszeitraum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigkeitszeitraum", theGueltigkeitszeitraum), currentHashCode, theGueltigkeitszeitraum, (this.gueltigkeitszeitraum!= null));
        }
        {
            CTFreistellungsbetrag theFreistellungsbetrag;
            theFreistellungsbetrag = this.getFreistellungsbetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freistellungsbetrag", theFreistellungsbetrag), currentHashCode, theFreistellungsbetrag, (this.freistellungsbetrag!= null));
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
        if (draftCopy instanceof CTSteuerbefreiung) {
            final CTSteuerbefreiung copy = ((CTSteuerbefreiung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STSteuerbefreiungsart sourceArtID;
                    sourceArtID = this.getArtID();
                    STSteuerbefreiungsart copyArtID = ((STSteuerbefreiungsart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean gueltigkeitszeitraumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigkeitszeitraum!= null));
                if (gueltigkeitszeitraumShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceGueltigkeitszeitraum;
                    sourceGueltigkeitszeitraum = this.getGueltigkeitszeitraum();
                    CTZeitraum copyGueltigkeitszeitraum = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "gueltigkeitszeitraum", sourceGueltigkeitszeitraum), sourceGueltigkeitszeitraum, (this.gueltigkeitszeitraum!= null)));
                    copy.setGueltigkeitszeitraum(copyGueltigkeitszeitraum);
                } else {
                    if (gueltigkeitszeitraumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigkeitszeitraum = null;
                    }
                }
            }
            {
                Boolean freistellungsbetragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freistellungsbetrag!= null));
                if (freistellungsbetragShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTFreistellungsbetrag sourceFreistellungsbetrag;
                    sourceFreistellungsbetrag = this.getFreistellungsbetrag();
                    CTFreistellungsbetrag copyFreistellungsbetrag = ((CTFreistellungsbetrag) strategy.copy(LocatorUtils.property(locator, "freistellungsbetrag", sourceFreistellungsbetrag), sourceFreistellungsbetrag, (this.freistellungsbetrag!= null)));
                    copy.setFreistellungsbetrag(copyFreistellungsbetrag);
                } else {
                    if (freistellungsbetragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freistellungsbetrag = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTSteuerbefreiung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTSteuerbefreiung withArtID(STSteuerbefreiungsart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTSteuerbefreiung withGueltigkeitszeitraum(CTZeitraum value) {
        setGueltigkeitszeitraum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTSteuerbefreiung withFreistellungsbetrag(CTFreistellungsbetrag value) {
        setFreistellungsbetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTSteuerbefreiung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTSteuerbefreiung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
