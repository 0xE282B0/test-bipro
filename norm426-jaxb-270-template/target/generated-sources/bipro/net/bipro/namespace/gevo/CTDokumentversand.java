
package net.bipro.namespace.gevo;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STDokumentartID;
import net.bipro.namespace.datentypen.STVersandart;
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
 * Informationen zu einem Dokument, das alternativ - d.h. nicht innerhalb einer BiPRO-Nachricht - versand wird (z.B. postalischer Versand des beantworteten Risikofragebogens).
 * Die Versandart des Dokuments MUSS entweder mittels des Attributs Versandart oder des Attributs SonstigeVersandart angegeben werden.
 * 
 * <p>Java class for CT_Dokumentversand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Dokumentversand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_DokumentartID"/&gt;
 *         &lt;element name="Versandart" type="{http://www.bipro.net/namespace/datentypen}ST_Versandart" minOccurs="0"/&gt;
 *         &lt;element name="SonstigeVersandart" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Erlaeuterung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Dokumentversand", propOrder = {
    "artID",
    "versandart",
    "sonstigeVersandart",
    "bezeichnung",
    "erlaeuterung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTDokumentversand
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STDokumentartID artID;
    @XmlElement(name = "Versandart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVersandart versandart;
    @XmlElement(name = "SonstigeVersandart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String sonstigeVersandart;
    @XmlElement(name = "Bezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "Erlaeuterung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String erlaeuterung;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STDokumentartID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STDokumentartID getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDokumentartID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STDokumentartID value) {
        this.artID = value;
    }

    /**
     * Gets the value of the versandart property.
     * 
     * @return
     *     possible object is
     *     {@link STVersandart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVersandart getVersandart() {
        return versandart;
    }

    /**
     * Sets the value of the versandart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVersandart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersandart(STVersandart value) {
        this.versandart = value;
    }

    /**
     * Gets the value of the sonstigeVersandart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSonstigeVersandart() {
        return sonstigeVersandart;
    }

    /**
     * Sets the value of the sonstigeVersandart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSonstigeVersandart(String value) {
        this.sonstigeVersandart = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the erlaeuterung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getErlaeuterung() {
        return erlaeuterung;
    }

    /**
     * Sets the value of the erlaeuterung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setErlaeuterung(String value) {
        this.erlaeuterung = value;
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
        final CTDokumentversand that = ((CTDokumentversand) object);
        {
            STDokumentartID lhsArtID;
            lhsArtID = this.getArtID();
            STDokumentartID rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            STVersandart lhsVersandart;
            lhsVersandart = this.getVersandart();
            STVersandart rhsVersandart;
            rhsVersandart = that.getVersandart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versandart", lhsVersandart), LocatorUtils.property(thatLocator, "versandart", rhsVersandart), lhsVersandart, rhsVersandart, (this.versandart!= null), (that.versandart!= null))) {
                return false;
            }
        }
        {
            String lhsSonstigeVersandart;
            lhsSonstigeVersandart = this.getSonstigeVersandart();
            String rhsSonstigeVersandart;
            rhsSonstigeVersandart = that.getSonstigeVersandart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sonstigeVersandart", lhsSonstigeVersandart), LocatorUtils.property(thatLocator, "sonstigeVersandart", rhsSonstigeVersandart), lhsSonstigeVersandart, rhsSonstigeVersandart, (this.sonstigeVersandart!= null), (that.sonstigeVersandart!= null))) {
                return false;
            }
        }
        {
            String lhsBezeichnung;
            lhsBezeichnung = this.getBezeichnung();
            String rhsBezeichnung;
            rhsBezeichnung = that.getBezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezeichnung", lhsBezeichnung), LocatorUtils.property(thatLocator, "bezeichnung", rhsBezeichnung), lhsBezeichnung, rhsBezeichnung, (this.bezeichnung!= null), (that.bezeichnung!= null))) {
                return false;
            }
        }
        {
            String lhsErlaeuterung;
            lhsErlaeuterung = this.getErlaeuterung();
            String rhsErlaeuterung;
            rhsErlaeuterung = that.getErlaeuterung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erlaeuterung", lhsErlaeuterung), LocatorUtils.property(thatLocator, "erlaeuterung", rhsErlaeuterung), lhsErlaeuterung, rhsErlaeuterung, (this.erlaeuterung!= null), (that.erlaeuterung!= null))) {
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
            STDokumentartID theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            STVersandart theVersandart;
            theVersandart = this.getVersandart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versandart", theVersandart), currentHashCode, theVersandart, (this.versandart!= null));
        }
        {
            String theSonstigeVersandart;
            theSonstigeVersandart = this.getSonstigeVersandart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sonstigeVersandart", theSonstigeVersandart), currentHashCode, theSonstigeVersandart, (this.sonstigeVersandart!= null));
        }
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            String theErlaeuterung;
            theErlaeuterung = this.getErlaeuterung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erlaeuterung", theErlaeuterung), currentHashCode, theErlaeuterung, (this.erlaeuterung!= null));
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
        if (draftCopy instanceof CTDokumentversand) {
            final CTDokumentversand copy = ((CTDokumentversand) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STDokumentartID sourceArtID;
                    sourceArtID = this.getArtID();
                    STDokumentartID copyArtID = ((STDokumentartID) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean versandartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versandart!= null));
                if (versandartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVersandart sourceVersandart;
                    sourceVersandart = this.getVersandart();
                    STVersandart copyVersandart = ((STVersandart) strategy.copy(LocatorUtils.property(locator, "versandart", sourceVersandart), sourceVersandart, (this.versandart!= null)));
                    copy.setVersandart(copyVersandart);
                } else {
                    if (versandartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versandart = null;
                    }
                }
            }
            {
                Boolean sonstigeVersandartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sonstigeVersandart!= null));
                if (sonstigeVersandartShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSonstigeVersandart;
                    sourceSonstigeVersandart = this.getSonstigeVersandart();
                    String copySonstigeVersandart = ((String) strategy.copy(LocatorUtils.property(locator, "sonstigeVersandart", sourceSonstigeVersandart), sourceSonstigeVersandart, (this.sonstigeVersandart!= null)));
                    copy.setSonstigeVersandart(copySonstigeVersandart);
                } else {
                    if (sonstigeVersandartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sonstigeVersandart = null;
                    }
                }
            }
            {
                Boolean bezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bezeichnung!= null));
                if (bezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBezeichnung;
                    sourceBezeichnung = this.getBezeichnung();
                    String copyBezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "bezeichnung", sourceBezeichnung), sourceBezeichnung, (this.bezeichnung!= null)));
                    copy.setBezeichnung(copyBezeichnung);
                } else {
                    if (bezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezeichnung = null;
                    }
                }
            }
            {
                Boolean erlaeuterungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erlaeuterung!= null));
                if (erlaeuterungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErlaeuterung;
                    sourceErlaeuterung = this.getErlaeuterung();
                    String copyErlaeuterung = ((String) strategy.copy(LocatorUtils.property(locator, "erlaeuterung", sourceErlaeuterung), sourceErlaeuterung, (this.erlaeuterung!= null)));
                    copy.setErlaeuterung(copyErlaeuterung);
                } else {
                    if (erlaeuterungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erlaeuterung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDokumentversand();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDokumentversand withArtID(STDokumentartID value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDokumentversand withVersandart(STVersandart value) {
        setVersandart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDokumentversand withSonstigeVersandart(String value) {
        setSonstigeVersandart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDokumentversand withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDokumentversand withErlaeuterung(String value) {
        setErlaeuterung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDokumentversand withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDokumentversand withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
