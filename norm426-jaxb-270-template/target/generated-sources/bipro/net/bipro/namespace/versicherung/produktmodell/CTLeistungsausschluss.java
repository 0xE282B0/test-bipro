
package net.bipro.namespace.versicherung.produktmodell;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STELeistungsausschluss;
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
 * Abbildung von Versicherungsausschlüssen. In der Krankenversicherung zur Abblidung von besonderen Vereinbarungen, insbesondere von durch das Vertriebssystem definierten Leistungsausschlüssen.
 * 
 * <p>Java class for CT_Leistungsausschluss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Leistungsausschluss"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_Leistungsausschluss" minOccurs="0"/&gt;
 *         &lt;element name="Art" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Grund" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="Endetermin" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Dauer" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Leistungsausschluss", propOrder = {
    "artID",
    "art",
    "grund",
    "endetermin",
    "dauer"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTLeistungsausschluss
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STELeistungsausschluss artID;
    @XmlElement(name = "Art")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String art;
    @XmlElement(name = "Grund")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String grund;
    @XmlElement(name = "Endetermin")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String endetermin;
    @XmlElement(name = "Dauer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum dauer;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STELeistungsausschluss }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STELeistungsausschluss getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STELeistungsausschluss }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STELeistungsausschluss value) {
        this.artID = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArt(String value) {
        this.art = value;
    }

    /**
     * Gets the value of the grund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGrund() {
        return grund;
    }

    /**
     * Sets the value of the grund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGrund(String value) {
        this.grund = value;
    }

    /**
     * Gets the value of the endetermin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getEndetermin() {
        return endetermin;
    }

    /**
     * Sets the value of the endetermin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEndetermin(String value) {
        this.endetermin = value;
    }

    /**
     * Gets the value of the dauer property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getDauer() {
        return dauer;
    }

    /**
     * Sets the value of the dauer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDauer(CTZeitraum value) {
        this.dauer = value;
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
        final CTLeistungsausschluss that = ((CTLeistungsausschluss) object);
        {
            STELeistungsausschluss lhsArtID;
            lhsArtID = this.getArtID();
            STELeistungsausschluss rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsArt;
            lhsArt = this.getArt();
            String rhsArt;
            rhsArt = that.getArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "art", lhsArt), LocatorUtils.property(thatLocator, "art", rhsArt), lhsArt, rhsArt, (this.art!= null), (that.art!= null))) {
                return false;
            }
        }
        {
            String lhsGrund;
            lhsGrund = this.getGrund();
            String rhsGrund;
            rhsGrund = that.getGrund();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grund", lhsGrund), LocatorUtils.property(thatLocator, "grund", rhsGrund), lhsGrund, rhsGrund, (this.grund!= null), (that.grund!= null))) {
                return false;
            }
        }
        {
            String lhsEndetermin;
            lhsEndetermin = this.getEndetermin();
            String rhsEndetermin;
            rhsEndetermin = that.getEndetermin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endetermin", lhsEndetermin), LocatorUtils.property(thatLocator, "endetermin", rhsEndetermin), lhsEndetermin, rhsEndetermin, (this.endetermin!= null), (that.endetermin!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsDauer;
            lhsDauer = this.getDauer();
            CTZeitraum rhsDauer;
            rhsDauer = that.getDauer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dauer", lhsDauer), LocatorUtils.property(thatLocator, "dauer", rhsDauer), lhsDauer, rhsDauer, (this.dauer!= null), (that.dauer!= null))) {
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
            STELeistungsausschluss theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theArt;
            theArt = this.getArt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "art", theArt), currentHashCode, theArt, (this.art!= null));
        }
        {
            String theGrund;
            theGrund = this.getGrund();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grund", theGrund), currentHashCode, theGrund, (this.grund!= null));
        }
        {
            String theEndetermin;
            theEndetermin = this.getEndetermin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endetermin", theEndetermin), currentHashCode, theEndetermin, (this.endetermin!= null));
        }
        {
            CTZeitraum theDauer;
            theDauer = this.getDauer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dauer", theDauer), currentHashCode, theDauer, (this.dauer!= null));
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
        if (draftCopy instanceof CTLeistungsausschluss) {
            final CTLeistungsausschluss copy = ((CTLeistungsausschluss) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STELeistungsausschluss sourceArtID;
                    sourceArtID = this.getArtID();
                    STELeistungsausschluss copyArtID = ((STELeistungsausschluss) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean artShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.art!= null));
                if (artShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceArt;
                    sourceArt = this.getArt();
                    String copyArt = ((String) strategy.copy(LocatorUtils.property(locator, "art", sourceArt), sourceArt, (this.art!= null)));
                    copy.setArt(copyArt);
                } else {
                    if (artShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.art = null;
                    }
                }
            }
            {
                Boolean grundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grund!= null));
                if (grundShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGrund;
                    sourceGrund = this.getGrund();
                    String copyGrund = ((String) strategy.copy(LocatorUtils.property(locator, "grund", sourceGrund), sourceGrund, (this.grund!= null)));
                    copy.setGrund(copyGrund);
                } else {
                    if (grundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grund = null;
                    }
                }
            }
            {
                Boolean endeterminShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.endetermin!= null));
                if (endeterminShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEndetermin;
                    sourceEndetermin = this.getEndetermin();
                    String copyEndetermin = ((String) strategy.copy(LocatorUtils.property(locator, "endetermin", sourceEndetermin), sourceEndetermin, (this.endetermin!= null)));
                    copy.setEndetermin(copyEndetermin);
                } else {
                    if (endeterminShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.endetermin = null;
                    }
                }
            }
            {
                Boolean dauerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dauer!= null));
                if (dauerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceDauer;
                    sourceDauer = this.getDauer();
                    CTZeitraum copyDauer = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "dauer", sourceDauer), sourceDauer, (this.dauer!= null)));
                    copy.setDauer(copyDauer);
                } else {
                    if (dauerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dauer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTLeistungsausschluss();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLeistungsausschluss withArtID(STELeistungsausschluss value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLeistungsausschluss withArt(String value) {
        setArt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLeistungsausschluss withGrund(String value) {
        setGrund(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLeistungsausschluss withEndetermin(String value) {
        setEndetermin(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLeistungsausschluss withDauer(CTZeitraum value) {
        setDauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLeistungsausschluss withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTLeistungsausschluss withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
