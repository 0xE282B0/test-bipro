
package net.bipro.namespace.versicherung.produktmodell;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
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
 * Klauseln sind die allgemeinen Einzelbestimmungen in einem Versicherungsvertrag. Sie konkretisieren, erweitern oder beschränken die Allgemeinen (AVB) und Besonderen Versicherungsbedingungen (BVB).
 * Klauseln DÜRFEN NUR in dem für sie vorgesehenen Kontext (Produkt, Elementarprodukt) angegeben werden.
 * 
 * <p>Java class for CT_Klausel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Klausel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Klausel" minOccurs="0"/&gt;
 *         &lt;element name="Klauseltext" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="Zusatzangabe" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="Formularbezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Klausel", propOrder = {
    "artID",
    "klauseltext",
    "zusatzangabe",
    "formularbezeichnung",
    "version"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTKlausel
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String artID;
    @XmlElement(name = "Klauseltext")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String klauseltext;
    @XmlElement(name = "Zusatzangabe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String zusatzangabe;
    @XmlElement(name = "Formularbezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String formularbezeichnung;
    @XmlElement(name = "Version")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String version;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(String value) {
        this.artID = value;
    }

    /**
     * Gets the value of the klauseltext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getKlauseltext() {
        return klauseltext;
    }

    /**
     * Sets the value of the klauseltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKlauseltext(String value) {
        this.klauseltext = value;
    }

    /**
     * Gets the value of the zusatzangabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getZusatzangabe() {
        return zusatzangabe;
    }

    /**
     * Sets the value of the zusatzangabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZusatzangabe(String value) {
        this.zusatzangabe = value;
    }

    /**
     * Gets the value of the formularbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFormularbezeichnung() {
        return formularbezeichnung;
    }

    /**
     * Sets the value of the formularbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFormularbezeichnung(String value) {
        this.formularbezeichnung = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersion(String value) {
        this.version = value;
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
        final CTKlausel that = ((CTKlausel) object);
        {
            String lhsArtID;
            lhsArtID = this.getArtID();
            String rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsKlauseltext;
            lhsKlauseltext = this.getKlauseltext();
            String rhsKlauseltext;
            rhsKlauseltext = that.getKlauseltext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klauseltext", lhsKlauseltext), LocatorUtils.property(thatLocator, "klauseltext", rhsKlauseltext), lhsKlauseltext, rhsKlauseltext, (this.klauseltext!= null), (that.klauseltext!= null))) {
                return false;
            }
        }
        {
            String lhsZusatzangabe;
            lhsZusatzangabe = this.getZusatzangabe();
            String rhsZusatzangabe;
            rhsZusatzangabe = that.getZusatzangabe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusatzangabe", lhsZusatzangabe), LocatorUtils.property(thatLocator, "zusatzangabe", rhsZusatzangabe), lhsZusatzangabe, rhsZusatzangabe, (this.zusatzangabe!= null), (that.zusatzangabe!= null))) {
                return false;
            }
        }
        {
            String lhsFormularbezeichnung;
            lhsFormularbezeichnung = this.getFormularbezeichnung();
            String rhsFormularbezeichnung;
            rhsFormularbezeichnung = that.getFormularbezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formularbezeichnung", lhsFormularbezeichnung), LocatorUtils.property(thatLocator, "formularbezeichnung", rhsFormularbezeichnung), lhsFormularbezeichnung, rhsFormularbezeichnung, (this.formularbezeichnung!= null), (that.formularbezeichnung!= null))) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
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
            String theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theKlauseltext;
            theKlauseltext = this.getKlauseltext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "klauseltext", theKlauseltext), currentHashCode, theKlauseltext, (this.klauseltext!= null));
        }
        {
            String theZusatzangabe;
            theZusatzangabe = this.getZusatzangabe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zusatzangabe", theZusatzangabe), currentHashCode, theZusatzangabe, (this.zusatzangabe!= null));
        }
        {
            String theFormularbezeichnung;
            theFormularbezeichnung = this.getFormularbezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formularbezeichnung", theFormularbezeichnung), currentHashCode, theFormularbezeichnung, (this.formularbezeichnung!= null));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion, (this.version!= null));
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
        if (draftCopy instanceof CTKlausel) {
            final CTKlausel copy = ((CTKlausel) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceArtID;
                    sourceArtID = this.getArtID();
                    String copyArtID = ((String) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean klauseltextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.klauseltext!= null));
                if (klauseltextShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKlauseltext;
                    sourceKlauseltext = this.getKlauseltext();
                    String copyKlauseltext = ((String) strategy.copy(LocatorUtils.property(locator, "klauseltext", sourceKlauseltext), sourceKlauseltext, (this.klauseltext!= null)));
                    copy.setKlauseltext(copyKlauseltext);
                } else {
                    if (klauseltextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.klauseltext = null;
                    }
                }
            }
            {
                Boolean zusatzangabeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zusatzangabe!= null));
                if (zusatzangabeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZusatzangabe;
                    sourceZusatzangabe = this.getZusatzangabe();
                    String copyZusatzangabe = ((String) strategy.copy(LocatorUtils.property(locator, "zusatzangabe", sourceZusatzangabe), sourceZusatzangabe, (this.zusatzangabe!= null)));
                    copy.setZusatzangabe(copyZusatzangabe);
                } else {
                    if (zusatzangabeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusatzangabe = null;
                    }
                }
            }
            {
                Boolean formularbezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.formularbezeichnung!= null));
                if (formularbezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFormularbezeichnung;
                    sourceFormularbezeichnung = this.getFormularbezeichnung();
                    String copyFormularbezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "formularbezeichnung", sourceFormularbezeichnung), sourceFormularbezeichnung, (this.formularbezeichnung!= null)));
                    copy.setFormularbezeichnung(copyFormularbezeichnung);
                } else {
                    if (formularbezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.formularbezeichnung = null;
                    }
                }
            }
            {
                Boolean versionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.version!= null));
                if (versionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVersion;
                    sourceVersion = this.getVersion();
                    String copyVersion = ((String) strategy.copy(LocatorUtils.property(locator, "version", sourceVersion), sourceVersion, (this.version!= null)));
                    copy.setVersion(copyVersion);
                } else {
                    if (versionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.version = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKlausel();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKlausel withArtID(String value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKlausel withKlauseltext(String value) {
        setKlauseltext(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKlausel withZusatzangabe(String value) {
        setZusatzangabe(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKlausel withFormularbezeichnung(String value) {
        setFormularbezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKlausel withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKlausel withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKlausel withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
