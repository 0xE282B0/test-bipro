
package net.bipro.namespace.versicherung.produktmodell;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBestaetigungssumme;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STVersicherungsbestaetigung;
import net.bipro.namespace.partner.CTSicherungsglaeubiger;
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
 * Diese Klasse definiert sämtliche Bestätigungen an Dritte wie z.B. Sicherungsschein, Pflichtversicherungsbestätigung, Hypothekengläubiger, Bestätigung für Leasinggeber u.s.w
 * 
 * <p>Java class for CT_Versicherungsbestaetigung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Versicherungsbestaetigung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Versicherungsbestaetigung" minOccurs="0"/&gt;
 *         &lt;element name="Aktenzeichen" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Bestaetigungssumme" type="{http://www.bipro.net/namespace/allgemein}CT_Bestaetigungssumme" minOccurs="0"/&gt;
 *         &lt;element name="Bestaetigungsempfaenger" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Bestaetigungsempfaenger" minOccurs="0"/&gt;
 *         &lt;element name="Sicherungsglaeubiger" type="{http://www.bipro.net/namespace/partner}CT_Sicherungsglaeubiger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Versicherungsbestaetigung", propOrder = {
    "artID",
    "aktenzeichen",
    "bestaetigungssumme",
    "bestaetigungsempfaenger",
    "sicherungsglaeubiger"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVersicherungsbestaetigung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVersicherungsbestaetigung artID;
    @XmlElement(name = "Aktenzeichen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aktenzeichen;
    @XmlElement(name = "Bestaetigungssumme")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBestaetigungssumme bestaetigungssumme;
    @XmlElement(name = "Bestaetigungsempfaenger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBestaetigungsempfaenger bestaetigungsempfaenger;
    @XmlElement(name = "Sicherungsglaeubiger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTSicherungsglaeubiger sicherungsglaeubiger;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STVersicherungsbestaetigung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVersicherungsbestaetigung getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVersicherungsbestaetigung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STVersicherungsbestaetigung value) {
        this.artID = value;
    }

    /**
     * Gets the value of the aktenzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAktenzeichen() {
        return aktenzeichen;
    }

    /**
     * Sets the value of the aktenzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAktenzeichen(String value) {
        this.aktenzeichen = value;
    }

    /**
     * Gets the value of the bestaetigungssumme property.
     * 
     * @return
     *     possible object is
     *     {@link CTBestaetigungssumme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBestaetigungssumme getBestaetigungssumme() {
        return bestaetigungssumme;
    }

    /**
     * Sets the value of the bestaetigungssumme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBestaetigungssumme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBestaetigungssumme(CTBestaetigungssumme value) {
        this.bestaetigungssumme = value;
    }

    /**
     * Gets the value of the bestaetigungsempfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link CTBestaetigungsempfaenger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBestaetigungsempfaenger getBestaetigungsempfaenger() {
        return bestaetigungsempfaenger;
    }

    /**
     * Sets the value of the bestaetigungsempfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBestaetigungsempfaenger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBestaetigungsempfaenger(CTBestaetigungsempfaenger value) {
        this.bestaetigungsempfaenger = value;
    }

    /**
     * Gets the value of the sicherungsglaeubiger property.
     * 
     * @return
     *     possible object is
     *     {@link CTSicherungsglaeubiger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherungsglaeubiger getSicherungsglaeubiger() {
        return sicherungsglaeubiger;
    }

    /**
     * Sets the value of the sicherungsglaeubiger property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSicherungsglaeubiger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSicherungsglaeubiger(CTSicherungsglaeubiger value) {
        this.sicherungsglaeubiger = value;
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
        final CTVersicherungsbestaetigung that = ((CTVersicherungsbestaetigung) object);
        {
            STVersicherungsbestaetigung lhsArtID;
            lhsArtID = this.getArtID();
            STVersicherungsbestaetigung rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsAktenzeichen;
            lhsAktenzeichen = this.getAktenzeichen();
            String rhsAktenzeichen;
            rhsAktenzeichen = that.getAktenzeichen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aktenzeichen", lhsAktenzeichen), LocatorUtils.property(thatLocator, "aktenzeichen", rhsAktenzeichen), lhsAktenzeichen, rhsAktenzeichen, (this.aktenzeichen!= null), (that.aktenzeichen!= null))) {
                return false;
            }
        }
        {
            CTBestaetigungssumme lhsBestaetigungssumme;
            lhsBestaetigungssumme = this.getBestaetigungssumme();
            CTBestaetigungssumme rhsBestaetigungssumme;
            rhsBestaetigungssumme = that.getBestaetigungssumme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestaetigungssumme", lhsBestaetigungssumme), LocatorUtils.property(thatLocator, "bestaetigungssumme", rhsBestaetigungssumme), lhsBestaetigungssumme, rhsBestaetigungssumme, (this.bestaetigungssumme!= null), (that.bestaetigungssumme!= null))) {
                return false;
            }
        }
        {
            CTBestaetigungsempfaenger lhsBestaetigungsempfaenger;
            lhsBestaetigungsempfaenger = this.getBestaetigungsempfaenger();
            CTBestaetigungsempfaenger rhsBestaetigungsempfaenger;
            rhsBestaetigungsempfaenger = that.getBestaetigungsempfaenger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestaetigungsempfaenger", lhsBestaetigungsempfaenger), LocatorUtils.property(thatLocator, "bestaetigungsempfaenger", rhsBestaetigungsempfaenger), lhsBestaetigungsempfaenger, rhsBestaetigungsempfaenger, (this.bestaetigungsempfaenger!= null), (that.bestaetigungsempfaenger!= null))) {
                return false;
            }
        }
        {
            CTSicherungsglaeubiger lhsSicherungsglaeubiger;
            lhsSicherungsglaeubiger = this.getSicherungsglaeubiger();
            CTSicherungsglaeubiger rhsSicherungsglaeubiger;
            rhsSicherungsglaeubiger = that.getSicherungsglaeubiger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherungsglaeubiger", lhsSicherungsglaeubiger), LocatorUtils.property(thatLocator, "sicherungsglaeubiger", rhsSicherungsglaeubiger), lhsSicherungsglaeubiger, rhsSicherungsglaeubiger, (this.sicherungsglaeubiger!= null), (that.sicherungsglaeubiger!= null))) {
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
            STVersicherungsbestaetigung theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theAktenzeichen;
            theAktenzeichen = this.getAktenzeichen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aktenzeichen", theAktenzeichen), currentHashCode, theAktenzeichen, (this.aktenzeichen!= null));
        }
        {
            CTBestaetigungssumme theBestaetigungssumme;
            theBestaetigungssumme = this.getBestaetigungssumme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestaetigungssumme", theBestaetigungssumme), currentHashCode, theBestaetigungssumme, (this.bestaetigungssumme!= null));
        }
        {
            CTBestaetigungsempfaenger theBestaetigungsempfaenger;
            theBestaetigungsempfaenger = this.getBestaetigungsempfaenger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestaetigungsempfaenger", theBestaetigungsempfaenger), currentHashCode, theBestaetigungsempfaenger, (this.bestaetigungsempfaenger!= null));
        }
        {
            CTSicherungsglaeubiger theSicherungsglaeubiger;
            theSicherungsglaeubiger = this.getSicherungsglaeubiger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherungsglaeubiger", theSicherungsglaeubiger), currentHashCode, theSicherungsglaeubiger, (this.sicherungsglaeubiger!= null));
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
        if (draftCopy instanceof CTVersicherungsbestaetigung) {
            final CTVersicherungsbestaetigung copy = ((CTVersicherungsbestaetigung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVersicherungsbestaetigung sourceArtID;
                    sourceArtID = this.getArtID();
                    STVersicherungsbestaetigung copyArtID = ((STVersicherungsbestaetigung) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean aktenzeichenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aktenzeichen!= null));
                if (aktenzeichenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAktenzeichen;
                    sourceAktenzeichen = this.getAktenzeichen();
                    String copyAktenzeichen = ((String) strategy.copy(LocatorUtils.property(locator, "aktenzeichen", sourceAktenzeichen), sourceAktenzeichen, (this.aktenzeichen!= null)));
                    copy.setAktenzeichen(copyAktenzeichen);
                } else {
                    if (aktenzeichenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aktenzeichen = null;
                    }
                }
            }
            {
                Boolean bestaetigungssummeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestaetigungssumme!= null));
                if (bestaetigungssummeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBestaetigungssumme sourceBestaetigungssumme;
                    sourceBestaetigungssumme = this.getBestaetigungssumme();
                    CTBestaetigungssumme copyBestaetigungssumme = ((CTBestaetigungssumme) strategy.copy(LocatorUtils.property(locator, "bestaetigungssumme", sourceBestaetigungssumme), sourceBestaetigungssumme, (this.bestaetigungssumme!= null)));
                    copy.setBestaetigungssumme(copyBestaetigungssumme);
                } else {
                    if (bestaetigungssummeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestaetigungssumme = null;
                    }
                }
            }
            {
                Boolean bestaetigungsempfaengerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestaetigungsempfaenger!= null));
                if (bestaetigungsempfaengerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBestaetigungsempfaenger sourceBestaetigungsempfaenger;
                    sourceBestaetigungsempfaenger = this.getBestaetigungsempfaenger();
                    CTBestaetigungsempfaenger copyBestaetigungsempfaenger = ((CTBestaetigungsempfaenger) strategy.copy(LocatorUtils.property(locator, "bestaetigungsempfaenger", sourceBestaetigungsempfaenger), sourceBestaetigungsempfaenger, (this.bestaetigungsempfaenger!= null)));
                    copy.setBestaetigungsempfaenger(copyBestaetigungsempfaenger);
                } else {
                    if (bestaetigungsempfaengerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestaetigungsempfaenger = null;
                    }
                }
            }
            {
                Boolean sicherungsglaeubigerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sicherungsglaeubiger!= null));
                if (sicherungsglaeubigerShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTSicherungsglaeubiger sourceSicherungsglaeubiger;
                    sourceSicherungsglaeubiger = this.getSicherungsglaeubiger();
                    CTSicherungsglaeubiger copySicherungsglaeubiger = ((CTSicherungsglaeubiger) strategy.copy(LocatorUtils.property(locator, "sicherungsglaeubiger", sourceSicherungsglaeubiger), sourceSicherungsglaeubiger, (this.sicherungsglaeubiger!= null)));
                    copy.setSicherungsglaeubiger(copySicherungsglaeubiger);
                } else {
                    if (sicherungsglaeubigerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherungsglaeubiger = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVersicherungsbestaetigung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungsbestaetigung withArtID(STVersicherungsbestaetigung value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungsbestaetigung withAktenzeichen(String value) {
        setAktenzeichen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungsbestaetigung withBestaetigungssumme(CTBestaetigungssumme value) {
        setBestaetigungssumme(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungsbestaetigung withBestaetigungsempfaenger(CTBestaetigungsempfaenger value) {
        setBestaetigungsempfaenger(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungsbestaetigung withSicherungsglaeubiger(CTSicherungsglaeubiger value) {
        setSicherungsglaeubiger(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungsbestaetigung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVersicherungsbestaetigung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
