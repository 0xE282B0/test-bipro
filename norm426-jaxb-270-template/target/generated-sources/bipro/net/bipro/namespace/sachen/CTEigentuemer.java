
package net.bipro.namespace.sachen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STArtWohnungseigentuemergemeinschaft;
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
 * Eigentümer, auch Nießbraucher, Dinglicher Nutzungsberechtigter
 * 
 * <p>Java class for CT_Eigentuemer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Eigentuemer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/partner}CT_Partnerrolle"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtWEG" type="{http://www.bipro.net/namespace/datentypen}ST_ArtWohnungseigentuemergemeinschaft" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Eigentuemer", propOrder = {
    "artWEG"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTEigentuemer
    extends CTPartnerrolle
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtWEG")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STArtWohnungseigentuemergemeinschaft artWEG;

    /**
     * Gets the value of the artWEG property.
     * 
     * @return
     *     possible object is
     *     {@link STArtWohnungseigentuemergemeinschaft }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STArtWohnungseigentuemergemeinschaft getArtWEG() {
        return artWEG;
    }

    /**
     * Sets the value of the artWEG property.
     * 
     * @param value
     *     allowed object is
     *     {@link STArtWohnungseigentuemergemeinschaft }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtWEG(STArtWohnungseigentuemergemeinschaft value) {
        this.artWEG = value;
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
        final CTEigentuemer that = ((CTEigentuemer) object);
        {
            STArtWohnungseigentuemergemeinschaft lhsArtWEG;
            lhsArtWEG = this.getArtWEG();
            STArtWohnungseigentuemergemeinschaft rhsArtWEG;
            rhsArtWEG = that.getArtWEG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artWEG", lhsArtWEG), LocatorUtils.property(thatLocator, "artWEG", rhsArtWEG), lhsArtWEG, rhsArtWEG, (this.artWEG!= null), (that.artWEG!= null))) {
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
            STArtWohnungseigentuemergemeinschaft theArtWEG;
            theArtWEG = this.getArtWEG();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artWEG", theArtWEG), currentHashCode, theArtWEG, (this.artWEG!= null));
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
        if (draftCopy instanceof CTEigentuemer) {
            final CTEigentuemer copy = ((CTEigentuemer) draftCopy);
            {
                Boolean artWEGShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artWEG!= null));
                if (artWEGShouldBeCopiedAndSet == Boolean.TRUE) {
                    STArtWohnungseigentuemergemeinschaft sourceArtWEG;
                    sourceArtWEG = this.getArtWEG();
                    STArtWohnungseigentuemergemeinschaft copyArtWEG = ((STArtWohnungseigentuemergemeinschaft) strategy.copy(LocatorUtils.property(locator, "artWEG", sourceArtWEG), sourceArtWEG, (this.artWEG!= null)));
                    copy.setArtWEG(copyArtWEG);
                } else {
                    if (artWEGShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artWEG = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTEigentuemer();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEigentuemer withArtWEG(STArtWohnungseigentuemergemeinschaft value) {
        setArtWEG(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEigentuemer withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEigentuemer withGueltigkeit(CTZeitraum value) {
        setGueltigkeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEigentuemer withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEigentuemer withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
