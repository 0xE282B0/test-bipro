
package net.bipro.namespace.versicherung.sach;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STAufbewahrungsart;
import net.bipro.namespace.datentypen.STESafeart;
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
 * <p>Java class for CT_Aufbewahrungsart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Aufbewahrungsart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Aufbewahrungsart" minOccurs="0"/&gt;
 *         &lt;element name="Safeart" type="{http://www.bipro.net/namespace/datentypen}STE_Safeart" minOccurs="0"/&gt;
 *         &lt;element name="Safebezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Aufbewahrungsart", propOrder = {
    "artID",
    "safeart",
    "safebezeichnung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTAufbewahrungsart
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAufbewahrungsart artID;
    @XmlElement(name = "Safeart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STESafeart safeart;
    @XmlElement(name = "Safebezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String safebezeichnung;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STAufbewahrungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAufbewahrungsart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAufbewahrungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STAufbewahrungsart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the safeart property.
     * 
     * @return
     *     possible object is
     *     {@link STESafeart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STESafeart getSafeart() {
        return safeart;
    }

    /**
     * Sets the value of the safeart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STESafeart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSafeart(STESafeart value) {
        this.safeart = value;
    }

    /**
     * Gets the value of the safebezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSafebezeichnung() {
        return safebezeichnung;
    }

    /**
     * Sets the value of the safebezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSafebezeichnung(String value) {
        this.safebezeichnung = value;
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
        final CTAufbewahrungsart that = ((CTAufbewahrungsart) object);
        {
            STAufbewahrungsart lhsArtID;
            lhsArtID = this.getArtID();
            STAufbewahrungsart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            STESafeart lhsSafeart;
            lhsSafeart = this.getSafeart();
            STESafeart rhsSafeart;
            rhsSafeart = that.getSafeart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "safeart", lhsSafeart), LocatorUtils.property(thatLocator, "safeart", rhsSafeart), lhsSafeart, rhsSafeart, (this.safeart!= null), (that.safeart!= null))) {
                return false;
            }
        }
        {
            String lhsSafebezeichnung;
            lhsSafebezeichnung = this.getSafebezeichnung();
            String rhsSafebezeichnung;
            rhsSafebezeichnung = that.getSafebezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "safebezeichnung", lhsSafebezeichnung), LocatorUtils.property(thatLocator, "safebezeichnung", rhsSafebezeichnung), lhsSafebezeichnung, rhsSafebezeichnung, (this.safebezeichnung!= null), (that.safebezeichnung!= null))) {
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
            STAufbewahrungsart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            STESafeart theSafeart;
            theSafeart = this.getSafeart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "safeart", theSafeart), currentHashCode, theSafeart, (this.safeart!= null));
        }
        {
            String theSafebezeichnung;
            theSafebezeichnung = this.getSafebezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "safebezeichnung", theSafebezeichnung), currentHashCode, theSafebezeichnung, (this.safebezeichnung!= null));
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
        if (draftCopy instanceof CTAufbewahrungsart) {
            final CTAufbewahrungsart copy = ((CTAufbewahrungsart) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAufbewahrungsart sourceArtID;
                    sourceArtID = this.getArtID();
                    STAufbewahrungsart copyArtID = ((STAufbewahrungsart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean safeartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.safeart!= null));
                if (safeartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STESafeart sourceSafeart;
                    sourceSafeart = this.getSafeart();
                    STESafeart copySafeart = ((STESafeart) strategy.copy(LocatorUtils.property(locator, "safeart", sourceSafeart), sourceSafeart, (this.safeart!= null)));
                    copy.setSafeart(copySafeart);
                } else {
                    if (safeartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.safeart = null;
                    }
                }
            }
            {
                Boolean safebezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.safebezeichnung!= null));
                if (safebezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSafebezeichnung;
                    sourceSafebezeichnung = this.getSafebezeichnung();
                    String copySafebezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "safebezeichnung", sourceSafebezeichnung), sourceSafebezeichnung, (this.safebezeichnung!= null)));
                    copy.setSafebezeichnung(copySafebezeichnung);
                } else {
                    if (safebezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.safebezeichnung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAufbewahrungsart();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAufbewahrungsart withArtID(STAufbewahrungsart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAufbewahrungsart withSafeart(STESafeart value) {
        setSafeart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAufbewahrungsart withSafebezeichnung(String value) {
        setSafebezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAufbewahrungsart withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTAufbewahrungsart withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
