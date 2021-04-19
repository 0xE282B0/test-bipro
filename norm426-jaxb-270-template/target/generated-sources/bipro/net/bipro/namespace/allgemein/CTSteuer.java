
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
import net.bipro.namespace.datentypen.STLaenderkennzeichen;
import net.bipro.namespace.datentypen.STSteuerart;
import net.bipro.namespace.datentypen.STVersicherungsteuerabfuehrung;
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
 * Informationen zu einer Steuer (z.B. Versicherungsteuer, Umsatzsteuer).
 * 
 * <p>Java class for CT_Steuer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Steuer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Steuerart" minOccurs="0"/&gt;
 *         &lt;element name="Satz" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Land" type="{http://www.bipro.net/namespace/datentypen}ST_Laenderkennzeichen" minOccurs="0"/&gt;
 *         &lt;element name="Versicherungsteuerabfuehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Versicherungsteuerabfuehrung" minOccurs="0"/&gt;
 *         &lt;element name="Betrag" type="{http://www.bipro.net/namespace/allgemein}CT_Betrag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Steuer", propOrder = {
    "artID",
    "satz",
    "land",
    "versicherungsteuerabfuehrung",
    "betrag"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTSteuer
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STSteuerart artID;
    @XmlElement(name = "Satz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal satz;
    @XmlElement(name = "Land")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLaenderkennzeichen land;
    @XmlElement(name = "Versicherungsteuerabfuehrung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVersicherungsteuerabfuehrung versicherungsteuerabfuehrung;
    @XmlElement(name = "Betrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBetrag betrag;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STSteuerart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STSteuerart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSteuerart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STSteuerart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the satz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getSatz() {
        return satz;
    }

    /**
     * Sets the value of the satz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSatz(BigDecimal value) {
        this.satz = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLaenderkennzeichen getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLand(STLaenderkennzeichen value) {
        this.land = value;
    }

    /**
     * Gets the value of the versicherungsteuerabfuehrung property.
     * 
     * @return
     *     possible object is
     *     {@link STVersicherungsteuerabfuehrung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVersicherungsteuerabfuehrung getVersicherungsteuerabfuehrung() {
        return versicherungsteuerabfuehrung;
    }

    /**
     * Sets the value of the versicherungsteuerabfuehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVersicherungsteuerabfuehrung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersicherungsteuerabfuehrung(STVersicherungsteuerabfuehrung value) {
        this.versicherungsteuerabfuehrung = value;
    }

    /**
     * Gets the value of the betrag property.
     * 
     * @return
     *     possible object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetrag getBetrag() {
        return betrag;
    }

    /**
     * Sets the value of the betrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBetrag }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBetrag(CTBetrag value) {
        this.betrag = value;
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
        final CTSteuer that = ((CTSteuer) object);
        {
            STSteuerart lhsArtID;
            lhsArtID = this.getArtID();
            STSteuerart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSatz;
            lhsSatz = this.getSatz();
            BigDecimal rhsSatz;
            rhsSatz = that.getSatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "satz", lhsSatz), LocatorUtils.property(thatLocator, "satz", rhsSatz), lhsSatz, rhsSatz, (this.satz!= null), (that.satz!= null))) {
                return false;
            }
        }
        {
            STLaenderkennzeichen lhsLand;
            lhsLand = this.getLand();
            STLaenderkennzeichen rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand, (this.land!= null), (that.land!= null))) {
                return false;
            }
        }
        {
            STVersicherungsteuerabfuehrung lhsVersicherungsteuerabfuehrung;
            lhsVersicherungsteuerabfuehrung = this.getVersicherungsteuerabfuehrung();
            STVersicherungsteuerabfuehrung rhsVersicherungsteuerabfuehrung;
            rhsVersicherungsteuerabfuehrung = that.getVersicherungsteuerabfuehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versicherungsteuerabfuehrung", lhsVersicherungsteuerabfuehrung), LocatorUtils.property(thatLocator, "versicherungsteuerabfuehrung", rhsVersicherungsteuerabfuehrung), lhsVersicherungsteuerabfuehrung, rhsVersicherungsteuerabfuehrung, (this.versicherungsteuerabfuehrung!= null), (that.versicherungsteuerabfuehrung!= null))) {
                return false;
            }
        }
        {
            CTBetrag lhsBetrag;
            lhsBetrag = this.getBetrag();
            CTBetrag rhsBetrag;
            rhsBetrag = that.getBetrag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betrag", lhsBetrag), LocatorUtils.property(thatLocator, "betrag", rhsBetrag), lhsBetrag, rhsBetrag, (this.betrag!= null), (that.betrag!= null))) {
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
            STSteuerart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            BigDecimal theSatz;
            theSatz = this.getSatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "satz", theSatz), currentHashCode, theSatz, (this.satz!= null));
        }
        {
            STLaenderkennzeichen theLand;
            theLand = this.getLand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "land", theLand), currentHashCode, theLand, (this.land!= null));
        }
        {
            STVersicherungsteuerabfuehrung theVersicherungsteuerabfuehrung;
            theVersicherungsteuerabfuehrung = this.getVersicherungsteuerabfuehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versicherungsteuerabfuehrung", theVersicherungsteuerabfuehrung), currentHashCode, theVersicherungsteuerabfuehrung, (this.versicherungsteuerabfuehrung!= null));
        }
        {
            CTBetrag theBetrag;
            theBetrag = this.getBetrag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betrag", theBetrag), currentHashCode, theBetrag, (this.betrag!= null));
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
        if (draftCopy instanceof CTSteuer) {
            final CTSteuer copy = ((CTSteuer) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STSteuerart sourceArtID;
                    sourceArtID = this.getArtID();
                    STSteuerart copyArtID = ((STSteuerart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean satzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.satz!= null));
                if (satzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceSatz;
                    sourceSatz = this.getSatz();
                    BigDecimal copySatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "satz", sourceSatz), sourceSatz, (this.satz!= null)));
                    copy.setSatz(copySatz);
                } else {
                    if (satzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.satz = null;
                    }
                }
            }
            {
                Boolean landShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.land!= null));
                if (landShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLaenderkennzeichen sourceLand;
                    sourceLand = this.getLand();
                    STLaenderkennzeichen copyLand = ((STLaenderkennzeichen) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand, (this.land!= null)));
                    copy.setLand(copyLand);
                } else {
                    if (landShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.land = null;
                    }
                }
            }
            {
                Boolean versicherungsteuerabfuehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versicherungsteuerabfuehrung!= null));
                if (versicherungsteuerabfuehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVersicherungsteuerabfuehrung sourceVersicherungsteuerabfuehrung;
                    sourceVersicherungsteuerabfuehrung = this.getVersicherungsteuerabfuehrung();
                    STVersicherungsteuerabfuehrung copyVersicherungsteuerabfuehrung = ((STVersicherungsteuerabfuehrung) strategy.copy(LocatorUtils.property(locator, "versicherungsteuerabfuehrung", sourceVersicherungsteuerabfuehrung), sourceVersicherungsteuerabfuehrung, (this.versicherungsteuerabfuehrung!= null)));
                    copy.setVersicherungsteuerabfuehrung(copyVersicherungsteuerabfuehrung);
                } else {
                    if (versicherungsteuerabfuehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versicherungsteuerabfuehrung = null;
                    }
                }
            }
            {
                Boolean betragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betrag!= null));
                if (betragShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBetrag sourceBetrag;
                    sourceBetrag = this.getBetrag();
                    CTBetrag copyBetrag = ((CTBetrag) strategy.copy(LocatorUtils.property(locator, "betrag", sourceBetrag), sourceBetrag, (this.betrag!= null)));
                    copy.setBetrag(copyBetrag);
                } else {
                    if (betragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betrag = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTSteuer();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSteuer withArtID(STSteuerart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSteuer withSatz(BigDecimal value) {
        setSatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSteuer withLand(STLaenderkennzeichen value) {
        setLand(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSteuer withVersicherungsteuerabfuehrung(STVersicherungsteuerabfuehrung value) {
        setVersicherungsteuerabfuehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSteuer withBetrag(CTBetrag value) {
        setBetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSteuer withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSteuer withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
