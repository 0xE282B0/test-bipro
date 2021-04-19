
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STArtVermoegenswirksameLeistung;
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
 * <p>Java class for CT_VermoegenswirksameLeistung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_VermoegenswirksameLeistung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arbeitgeberanteil" type="{http://www.bipro.net/namespace/partner}CT_Arbeitgeberanteil" minOccurs="0"/&gt;
 *         &lt;element name="Arbeitnehmeranteil" type="{http://www.bipro.net/namespace/partner}CT_Arbeitnehmeranteil" minOccurs="0"/&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_ArtVermoegenswirksameLeistung" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_VermoegenswirksameLeistung", propOrder = {
    "arbeitgeberanteil",
    "arbeitnehmeranteil",
    "artID"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVermoegenswirksameLeistung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Arbeitgeberanteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTArbeitgeberanteil arbeitgeberanteil;
    @XmlElement(name = "Arbeitnehmeranteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTArbeitnehmeranteil arbeitnehmeranteil;
    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STArtVermoegenswirksameLeistung artID;

    /**
     * Gets the value of the arbeitgeberanteil property.
     * 
     * @return
     *     possible object is
     *     {@link CTArbeitgeberanteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTArbeitgeberanteil getArbeitgeberanteil() {
        return arbeitgeberanteil;
    }

    /**
     * Sets the value of the arbeitgeberanteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTArbeitgeberanteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArbeitgeberanteil(CTArbeitgeberanteil value) {
        this.arbeitgeberanteil = value;
    }

    /**
     * Gets the value of the arbeitnehmeranteil property.
     * 
     * @return
     *     possible object is
     *     {@link CTArbeitnehmeranteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTArbeitnehmeranteil getArbeitnehmeranteil() {
        return arbeitnehmeranteil;
    }

    /**
     * Sets the value of the arbeitnehmeranteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTArbeitnehmeranteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArbeitnehmeranteil(CTArbeitnehmeranteil value) {
        this.arbeitnehmeranteil = value;
    }

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STArtVermoegenswirksameLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STArtVermoegenswirksameLeistung getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STArtVermoegenswirksameLeistung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STArtVermoegenswirksameLeistung value) {
        this.artID = value;
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
        final CTVermoegenswirksameLeistung that = ((CTVermoegenswirksameLeistung) object);
        {
            CTArbeitgeberanteil lhsArbeitgeberanteil;
            lhsArbeitgeberanteil = this.getArbeitgeberanteil();
            CTArbeitgeberanteil rhsArbeitgeberanteil;
            rhsArbeitgeberanteil = that.getArbeitgeberanteil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arbeitgeberanteil", lhsArbeitgeberanteil), LocatorUtils.property(thatLocator, "arbeitgeberanteil", rhsArbeitgeberanteil), lhsArbeitgeberanteil, rhsArbeitgeberanteil, (this.arbeitgeberanteil!= null), (that.arbeitgeberanteil!= null))) {
                return false;
            }
        }
        {
            CTArbeitnehmeranteil lhsArbeitnehmeranteil;
            lhsArbeitnehmeranteil = this.getArbeitnehmeranteil();
            CTArbeitnehmeranteil rhsArbeitnehmeranteil;
            rhsArbeitnehmeranteil = that.getArbeitnehmeranteil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arbeitnehmeranteil", lhsArbeitnehmeranteil), LocatorUtils.property(thatLocator, "arbeitnehmeranteil", rhsArbeitnehmeranteil), lhsArbeitnehmeranteil, rhsArbeitnehmeranteil, (this.arbeitnehmeranteil!= null), (that.arbeitnehmeranteil!= null))) {
                return false;
            }
        }
        {
            STArtVermoegenswirksameLeistung lhsArtID;
            lhsArtID = this.getArtID();
            STArtVermoegenswirksameLeistung rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
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
            CTArbeitgeberanteil theArbeitgeberanteil;
            theArbeitgeberanteil = this.getArbeitgeberanteil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arbeitgeberanteil", theArbeitgeberanteil), currentHashCode, theArbeitgeberanteil, (this.arbeitgeberanteil!= null));
        }
        {
            CTArbeitnehmeranteil theArbeitnehmeranteil;
            theArbeitnehmeranteil = this.getArbeitnehmeranteil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arbeitnehmeranteil", theArbeitnehmeranteil), currentHashCode, theArbeitnehmeranteil, (this.arbeitnehmeranteil!= null));
        }
        {
            STArtVermoegenswirksameLeistung theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
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
        if (draftCopy instanceof CTVermoegenswirksameLeistung) {
            final CTVermoegenswirksameLeistung copy = ((CTVermoegenswirksameLeistung) draftCopy);
            {
                Boolean arbeitgeberanteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.arbeitgeberanteil!= null));
                if (arbeitgeberanteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTArbeitgeberanteil sourceArbeitgeberanteil;
                    sourceArbeitgeberanteil = this.getArbeitgeberanteil();
                    CTArbeitgeberanteil copyArbeitgeberanteil = ((CTArbeitgeberanteil) strategy.copy(LocatorUtils.property(locator, "arbeitgeberanteil", sourceArbeitgeberanteil), sourceArbeitgeberanteil, (this.arbeitgeberanteil!= null)));
                    copy.setArbeitgeberanteil(copyArbeitgeberanteil);
                } else {
                    if (arbeitgeberanteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.arbeitgeberanteil = null;
                    }
                }
            }
            {
                Boolean arbeitnehmeranteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.arbeitnehmeranteil!= null));
                if (arbeitnehmeranteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTArbeitnehmeranteil sourceArbeitnehmeranteil;
                    sourceArbeitnehmeranteil = this.getArbeitnehmeranteil();
                    CTArbeitnehmeranteil copyArbeitnehmeranteil = ((CTArbeitnehmeranteil) strategy.copy(LocatorUtils.property(locator, "arbeitnehmeranteil", sourceArbeitnehmeranteil), sourceArbeitnehmeranteil, (this.arbeitnehmeranteil!= null)));
                    copy.setArbeitnehmeranteil(copyArbeitnehmeranteil);
                } else {
                    if (arbeitnehmeranteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.arbeitnehmeranteil = null;
                    }
                }
            }
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STArtVermoegenswirksameLeistung sourceArtID;
                    sourceArtID = this.getArtID();
                    STArtVermoegenswirksameLeistung copyArtID = ((STArtVermoegenswirksameLeistung) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVermoegenswirksameLeistung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVermoegenswirksameLeistung withArbeitgeberanteil(CTArbeitgeberanteil value) {
        setArbeitgeberanteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVermoegenswirksameLeistung withArbeitnehmeranteil(CTArbeitnehmeranteil value) {
        setArbeitnehmeranteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVermoegenswirksameLeistung withArtID(STArtVermoegenswirksameLeistung value) {
        setArtID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVermoegenswirksameLeistung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVermoegenswirksameLeistung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
