
package net.bipro.namespace.versicherung.produktmodell.komposit;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STArtDerVorlaeufigenDeckung;
import net.bipro.namespace.datentypen.STSparte;
import net.bipro.namespace.datentypen.STVorlaeufigeDeckung;
import net.bipro.namespace.versicherung.tarifierung.CTZusaetzlicheAntragsdaten;
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
 * <p>Java class for CT_VorlaeufigeDeckung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_VorlaeufigeDeckung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/versicherung/tarifierung}CT_ZusaetzlicheAntragsdaten"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_VorlaeufigeDeckung"/&gt;
 *         &lt;element name="Beginn" type="{http://www.bipro.net/namespace/datentypen}ST_DatumZeit" minOccurs="0"/&gt;
 *         &lt;element name="Ablaufart" type="{http://www.bipro.net/namespace/datentypen}ST_ArtDerVorlaeufigenDeckung" minOccurs="0"/&gt;
 *         &lt;element name="Ablauf" type="{http://www.bipro.net/namespace/datentypen}ST_DatumZeit" minOccurs="0"/&gt;
 *         &lt;element name="Sparte" type="{http://www.bipro.net/namespace/datentypen}ST_Sparte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_VorlaeufigeDeckung", propOrder = {
    "artID",
    "beginn",
    "ablaufart",
    "ablauf",
    "sparte"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTVorlaeufigeDeckung
    extends CTZusaetzlicheAntragsdaten
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVorlaeufigeDeckung artID;
    @XmlElement(name = "Beginn")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String beginn;
    @XmlElement(name = "Ablaufart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STArtDerVorlaeufigenDeckung ablaufart;
    @XmlElement(name = "Ablauf")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String ablauf;
    @XmlElement(name = "Sparte")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STSparte sparte;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STVorlaeufigeDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STVorlaeufigeDeckung getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVorlaeufigeDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STVorlaeufigeDeckung value) {
        this.artID = value;
    }

    /**
     * Gets the value of the beginn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBeginn() {
        return beginn;
    }

    /**
     * Sets the value of the beginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeginn(String value) {
        this.beginn = value;
    }

    /**
     * Gets the value of the ablaufart property.
     * 
     * @return
     *     possible object is
     *     {@link STArtDerVorlaeufigenDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STArtDerVorlaeufigenDeckung getAblaufart() {
        return ablaufart;
    }

    /**
     * Sets the value of the ablaufart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STArtDerVorlaeufigenDeckung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAblaufart(STArtDerVorlaeufigenDeckung value) {
        this.ablaufart = value;
    }

    /**
     * Gets the value of the ablauf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getAblauf() {
        return ablauf;
    }

    /**
     * Sets the value of the ablauf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAblauf(String value) {
        this.ablauf = value;
    }

    /**
     * Gets the value of the sparte property.
     * 
     * @return
     *     possible object is
     *     {@link STSparte }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STSparte getSparte() {
        return sparte;
    }

    /**
     * Sets the value of the sparte property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSparte }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSparte(STSparte value) {
        this.sparte = value;
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
        final CTVorlaeufigeDeckung that = ((CTVorlaeufigeDeckung) object);
        {
            STVorlaeufigeDeckung lhsArtID;
            lhsArtID = this.getArtID();
            STVorlaeufigeDeckung rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsBeginn;
            lhsBeginn = this.getBeginn();
            String rhsBeginn;
            rhsBeginn = that.getBeginn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beginn", lhsBeginn), LocatorUtils.property(thatLocator, "beginn", rhsBeginn), lhsBeginn, rhsBeginn, (this.beginn!= null), (that.beginn!= null))) {
                return false;
            }
        }
        {
            STArtDerVorlaeufigenDeckung lhsAblaufart;
            lhsAblaufart = this.getAblaufart();
            STArtDerVorlaeufigenDeckung rhsAblaufart;
            rhsAblaufart = that.getAblaufart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ablaufart", lhsAblaufart), LocatorUtils.property(thatLocator, "ablaufart", rhsAblaufart), lhsAblaufart, rhsAblaufart, (this.ablaufart!= null), (that.ablaufart!= null))) {
                return false;
            }
        }
        {
            String lhsAblauf;
            lhsAblauf = this.getAblauf();
            String rhsAblauf;
            rhsAblauf = that.getAblauf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ablauf", lhsAblauf), LocatorUtils.property(thatLocator, "ablauf", rhsAblauf), lhsAblauf, rhsAblauf, (this.ablauf!= null), (that.ablauf!= null))) {
                return false;
            }
        }
        {
            STSparte lhsSparte;
            lhsSparte = this.getSparte();
            STSparte rhsSparte;
            rhsSparte = that.getSparte();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sparte", lhsSparte), LocatorUtils.property(thatLocator, "sparte", rhsSparte), lhsSparte, rhsSparte, (this.sparte!= null), (that.sparte!= null))) {
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
            STVorlaeufigeDeckung theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theBeginn;
            theBeginn = this.getBeginn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beginn", theBeginn), currentHashCode, theBeginn, (this.beginn!= null));
        }
        {
            STArtDerVorlaeufigenDeckung theAblaufart;
            theAblaufart = this.getAblaufart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ablaufart", theAblaufart), currentHashCode, theAblaufart, (this.ablaufart!= null));
        }
        {
            String theAblauf;
            theAblauf = this.getAblauf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ablauf", theAblauf), currentHashCode, theAblauf, (this.ablauf!= null));
        }
        {
            STSparte theSparte;
            theSparte = this.getSparte();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sparte", theSparte), currentHashCode, theSparte, (this.sparte!= null));
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
        if (draftCopy instanceof CTVorlaeufigeDeckung) {
            final CTVorlaeufigeDeckung copy = ((CTVorlaeufigeDeckung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVorlaeufigeDeckung sourceArtID;
                    sourceArtID = this.getArtID();
                    STVorlaeufigeDeckung copyArtID = ((STVorlaeufigeDeckung) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean beginnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beginn!= null));
                if (beginnShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBeginn;
                    sourceBeginn = this.getBeginn();
                    String copyBeginn = ((String) strategy.copy(LocatorUtils.property(locator, "beginn", sourceBeginn), sourceBeginn, (this.beginn!= null)));
                    copy.setBeginn(copyBeginn);
                } else {
                    if (beginnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beginn = null;
                    }
                }
            }
            {
                Boolean ablaufartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ablaufart!= null));
                if (ablaufartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STArtDerVorlaeufigenDeckung sourceAblaufart;
                    sourceAblaufart = this.getAblaufart();
                    STArtDerVorlaeufigenDeckung copyAblaufart = ((STArtDerVorlaeufigenDeckung) strategy.copy(LocatorUtils.property(locator, "ablaufart", sourceAblaufart), sourceAblaufart, (this.ablaufart!= null)));
                    copy.setAblaufart(copyAblaufart);
                } else {
                    if (ablaufartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ablaufart = null;
                    }
                }
            }
            {
                Boolean ablaufShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ablauf!= null));
                if (ablaufShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAblauf;
                    sourceAblauf = this.getAblauf();
                    String copyAblauf = ((String) strategy.copy(LocatorUtils.property(locator, "ablauf", sourceAblauf), sourceAblauf, (this.ablauf!= null)));
                    copy.setAblauf(copyAblauf);
                } else {
                    if (ablaufShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ablauf = null;
                    }
                }
            }
            {
                Boolean sparteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sparte!= null));
                if (sparteShouldBeCopiedAndSet == Boolean.TRUE) {
                    STSparte sourceSparte;
                    sourceSparte = this.getSparte();
                    STSparte copySparte = ((STSparte) strategy.copy(LocatorUtils.property(locator, "sparte", sourceSparte), sourceSparte, (this.sparte!= null)));
                    copy.setSparte(copySparte);
                } else {
                    if (sparteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sparte = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVorlaeufigeDeckung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVorlaeufigeDeckung withArtID(STVorlaeufigeDeckung value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVorlaeufigeDeckung withBeginn(String value) {
        setBeginn(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVorlaeufigeDeckung withAblaufart(STArtDerVorlaeufigenDeckung value) {
        setAblaufart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVorlaeufigeDeckung withAblauf(String value) {
        setAblauf(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVorlaeufigeDeckung withSparte(STSparte value) {
        setSparte(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVorlaeufigeDeckung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVorlaeufigeDeckung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
