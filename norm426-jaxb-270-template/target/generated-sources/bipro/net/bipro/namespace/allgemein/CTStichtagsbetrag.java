
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
import net.bipro.namespace.datentypen.STStichtagswert;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
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
 * Beschreibt einen Geldwert, der zu einem bestimmten Zeitpunkt gültig ist.
 * 
 * Garantierte Leistungen verstehen sich ohne zukünftige Überschussbeteiligungen aber inklusive bereits verdienter Überschussanteile. Gesamte Leistungen verstehen sich inklusive bereits verdienter und noch zu erwartender Überschussanteile.
 * Renten und Kapitalleistungen schließen sich wechselseitig aus, die gemeinsame Angabe ist nur bei Tarifen mit Renten-/Kapitalwahlrecht zulässig.
 * Summenwerte gelten sofern nicht anders angegeben vom Vertragsbeginn bis zum angegebenen Stichtag.
 * 
 * <p>Java class for CT_Stichtagsbetrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Stichtagsbetrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Geldwert"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Stichtagswert"/&gt;
 *         &lt;element name="Berechnungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Berechnungsgrundlage" type="{http://www.bipro.net/namespace/allgemein}CT_Berechnungsgrundlage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Stichtagsbetrag", propOrder = {
    "artID",
    "berechnungsdatum",
    "berechnungsgrundlage"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTStichtagsbetrag
    extends CTGeldwert
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STStichtagswert artID;
    @XmlElement(name = "Berechnungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String berechnungsdatum;
    @XmlElement(name = "Berechnungsgrundlage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBerechnungsgrundlage berechnungsgrundlage;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STStichtagswert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STStichtagswert getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STStichtagswert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STStichtagswert value) {
        this.artID = value;
    }

    /**
     * Gets the value of the berechnungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBerechnungsdatum() {
        return berechnungsdatum;
    }

    /**
     * Sets the value of the berechnungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBerechnungsdatum(String value) {
        this.berechnungsdatum = value;
    }

    /**
     * Gets the value of the berechnungsgrundlage property.
     * 
     * @return
     *     possible object is
     *     {@link CTBerechnungsgrundlage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBerechnungsgrundlage getBerechnungsgrundlage() {
        return berechnungsgrundlage;
    }

    /**
     * Sets the value of the berechnungsgrundlage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBerechnungsgrundlage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBerechnungsgrundlage(CTBerechnungsgrundlage value) {
        this.berechnungsgrundlage = value;
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
        final CTStichtagsbetrag that = ((CTStichtagsbetrag) object);
        {
            STStichtagswert lhsArtID;
            lhsArtID = this.getArtID();
            STStichtagswert rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsBerechnungsdatum;
            lhsBerechnungsdatum = this.getBerechnungsdatum();
            String rhsBerechnungsdatum;
            rhsBerechnungsdatum = that.getBerechnungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berechnungsdatum", lhsBerechnungsdatum), LocatorUtils.property(thatLocator, "berechnungsdatum", rhsBerechnungsdatum), lhsBerechnungsdatum, rhsBerechnungsdatum, (this.berechnungsdatum!= null), (that.berechnungsdatum!= null))) {
                return false;
            }
        }
        {
            CTBerechnungsgrundlage lhsBerechnungsgrundlage;
            lhsBerechnungsgrundlage = this.getBerechnungsgrundlage();
            CTBerechnungsgrundlage rhsBerechnungsgrundlage;
            rhsBerechnungsgrundlage = that.getBerechnungsgrundlage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "berechnungsgrundlage", lhsBerechnungsgrundlage), LocatorUtils.property(thatLocator, "berechnungsgrundlage", rhsBerechnungsgrundlage), lhsBerechnungsgrundlage, rhsBerechnungsgrundlage, (this.berechnungsgrundlage!= null), (that.berechnungsgrundlage!= null))) {
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
            STStichtagswert theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theBerechnungsdatum;
            theBerechnungsdatum = this.getBerechnungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "berechnungsdatum", theBerechnungsdatum), currentHashCode, theBerechnungsdatum, (this.berechnungsdatum!= null));
        }
        {
            CTBerechnungsgrundlage theBerechnungsgrundlage;
            theBerechnungsgrundlage = this.getBerechnungsgrundlage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "berechnungsgrundlage", theBerechnungsgrundlage), currentHashCode, theBerechnungsgrundlage, (this.berechnungsgrundlage!= null));
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
        if (draftCopy instanceof CTStichtagsbetrag) {
            final CTStichtagsbetrag copy = ((CTStichtagsbetrag) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STStichtagswert sourceArtID;
                    sourceArtID = this.getArtID();
                    STStichtagswert copyArtID = ((STStichtagswert) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean berechnungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.berechnungsdatum!= null));
                if (berechnungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBerechnungsdatum;
                    sourceBerechnungsdatum = this.getBerechnungsdatum();
                    String copyBerechnungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "berechnungsdatum", sourceBerechnungsdatum), sourceBerechnungsdatum, (this.berechnungsdatum!= null)));
                    copy.setBerechnungsdatum(copyBerechnungsdatum);
                } else {
                    if (berechnungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berechnungsdatum = null;
                    }
                }
            }
            {
                Boolean berechnungsgrundlageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.berechnungsgrundlage!= null));
                if (berechnungsgrundlageShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBerechnungsgrundlage sourceBerechnungsgrundlage;
                    sourceBerechnungsgrundlage = this.getBerechnungsgrundlage();
                    CTBerechnungsgrundlage copyBerechnungsgrundlage = ((CTBerechnungsgrundlage) strategy.copy(LocatorUtils.property(locator, "berechnungsgrundlage", sourceBerechnungsgrundlage), sourceBerechnungsgrundlage, (this.berechnungsgrundlage!= null)));
                    copy.setBerechnungsgrundlage(copyBerechnungsgrundlage);
                } else {
                    if (berechnungsgrundlageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.berechnungsgrundlage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTStichtagsbetrag();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withArtID(STStichtagswert value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withBerechnungsdatum(String value) {
        setBerechnungsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withBerechnungsgrundlage(CTBerechnungsgrundlage value) {
        setBerechnungsgrundlage(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withBetrag(BigDecimal value) {
        setBetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withStichtag(String value) {
        setStichtag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTStichtagsbetrag withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
