
package net.bipro.namespace.gevo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTDatei;
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
 * Dient der Anforderung von Druckstuecken und anderen Dokumenten.
 * 
 * <p>Java class for CT_Dokumentanforderung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Dokumentanforderung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_DokumentartID" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DateiID" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *         &lt;element name="Versandart" type="{http://www.bipro.net/namespace/datentypen}ST_Versandart" minOccurs="0"/&gt;
 *         &lt;element name="Empfaenger" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenzEmpfaenger" type="{http://www.bipro.net/namespace/datentypen}ST_Text080" minOccurs="0"/&gt;
 *         &lt;element name="VermittleranschriftAufDokument" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="VermittlerSpezifischeDokumentenergaenzung" type="{http://www.bipro.net/namespace/allgemein}CT_Datei" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sprache" type="{http://www.bipro.net/namespace/datentypen}ST_Sprache" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Dokumentanforderung", propOrder = {
    "artID",
    "dateiID",
    "versandart",
    "empfaenger",
    "referenzEmpfaenger",
    "vermittleranschriftAufDokument",
    "vermittlerSpezifischeDokumentenergaenzung",
    "sprache"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTDokumentanforderung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STDokumentartID> artID;
    @XmlElement(name = "DateiID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String dateiID;
    @XmlElement(name = "Versandart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVersandart versandart;
    @XmlElement(name = "Empfaenger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String empfaenger;
    @XmlElement(name = "ReferenzEmpfaenger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String referenzEmpfaenger;
    @XmlElement(name = "VermittleranschriftAufDokument")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean vermittleranschriftAufDokument;
    @XmlElement(name = "VermittlerSpezifischeDokumentenergaenzung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDatei> vermittlerSpezifischeDokumentenergaenzung;
    @XmlElement(name = "Sprache")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<String> sprache;

    /**
     * Gets the value of the artID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STDokumentartID }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<STDokumentartID> getArtID() {
        if (artID == null) {
            artID = new ArrayList<STDokumentartID>();
        }
        return this.artID;
    }

    /**
     * Gets the value of the dateiID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDateiID() {
        return dateiID;
    }

    /**
     * Sets the value of the dateiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDateiID(String value) {
        this.dateiID = value;
    }

    /**
     * Gets the value of the versandart property.
     * 
     * @return
     *     possible object is
     *     {@link STVersandart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVersandart(STVersandart value) {
        this.versandart = value;
    }

    /**
     * Gets the value of the empfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getEmpfaenger() {
        return empfaenger;
    }

    /**
     * Sets the value of the empfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setEmpfaenger(String value) {
        this.empfaenger = value;
    }

    /**
     * Gets the value of the referenzEmpfaenger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getReferenzEmpfaenger() {
        return referenzEmpfaenger;
    }

    /**
     * Sets the value of the referenzEmpfaenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setReferenzEmpfaenger(String value) {
        this.referenzEmpfaenger = value;
    }

    /**
     * Gets the value of the vermittleranschriftAufDokument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isVermittleranschriftAufDokument() {
        return vermittleranschriftAufDokument;
    }

    /**
     * Sets the value of the vermittleranschriftAufDokument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVermittleranschriftAufDokument(Boolean value) {
        this.vermittleranschriftAufDokument = value;
    }

    /**
     * Gets the value of the vermittlerSpezifischeDokumentenergaenzung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vermittlerSpezifischeDokumentenergaenzung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVermittlerSpezifischeDokumentenergaenzung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDatei }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDatei> getVermittlerSpezifischeDokumentenergaenzung() {
        if (vermittlerSpezifischeDokumentenergaenzung == null) {
            vermittlerSpezifischeDokumentenergaenzung = new ArrayList<CTDatei>();
        }
        return this.vermittlerSpezifischeDokumentenergaenzung;
    }

    /**
     * Gets the value of the sprache property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sprache property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSprache().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<String> getSprache() {
        if (sprache == null) {
            sprache = new ArrayList<String>();
        }
        return this.sprache;
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
        final CTDokumentanforderung that = ((CTDokumentanforderung) object);
        {
            List<STDokumentartID> lhsArtID;
            lhsArtID = (((this.artID!= null)&&(!this.artID.isEmpty()))?this.getArtID():null);
            List<STDokumentartID> rhsArtID;
            rhsArtID = (((that.artID!= null)&&(!that.artID.isEmpty()))?that.getArtID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, ((this.artID!= null)&&(!this.artID.isEmpty())), ((that.artID!= null)&&(!that.artID.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsDateiID;
            lhsDateiID = this.getDateiID();
            String rhsDateiID;
            rhsDateiID = that.getDateiID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateiID", lhsDateiID), LocatorUtils.property(thatLocator, "dateiID", rhsDateiID), lhsDateiID, rhsDateiID, (this.dateiID!= null), (that.dateiID!= null))) {
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
            String lhsEmpfaenger;
            lhsEmpfaenger = this.getEmpfaenger();
            String rhsEmpfaenger;
            rhsEmpfaenger = that.getEmpfaenger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "empfaenger", lhsEmpfaenger), LocatorUtils.property(thatLocator, "empfaenger", rhsEmpfaenger), lhsEmpfaenger, rhsEmpfaenger, (this.empfaenger!= null), (that.empfaenger!= null))) {
                return false;
            }
        }
        {
            String lhsReferenzEmpfaenger;
            lhsReferenzEmpfaenger = this.getReferenzEmpfaenger();
            String rhsReferenzEmpfaenger;
            rhsReferenzEmpfaenger = that.getReferenzEmpfaenger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenzEmpfaenger", lhsReferenzEmpfaenger), LocatorUtils.property(thatLocator, "referenzEmpfaenger", rhsReferenzEmpfaenger), lhsReferenzEmpfaenger, rhsReferenzEmpfaenger, (this.referenzEmpfaenger!= null), (that.referenzEmpfaenger!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVermittleranschriftAufDokument;
            lhsVermittleranschriftAufDokument = this.isVermittleranschriftAufDokument();
            Boolean rhsVermittleranschriftAufDokument;
            rhsVermittleranschriftAufDokument = that.isVermittleranschriftAufDokument();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittleranschriftAufDokument", lhsVermittleranschriftAufDokument), LocatorUtils.property(thatLocator, "vermittleranschriftAufDokument", rhsVermittleranschriftAufDokument), lhsVermittleranschriftAufDokument, rhsVermittleranschriftAufDokument, (this.vermittleranschriftAufDokument!= null), (that.vermittleranschriftAufDokument!= null))) {
                return false;
            }
        }
        {
            List<CTDatei> lhsVermittlerSpezifischeDokumentenergaenzung;
            lhsVermittlerSpezifischeDokumentenergaenzung = (((this.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!this.vermittlerSpezifischeDokumentenergaenzung.isEmpty()))?this.getVermittlerSpezifischeDokumentenergaenzung():null);
            List<CTDatei> rhsVermittlerSpezifischeDokumentenergaenzung;
            rhsVermittlerSpezifischeDokumentenergaenzung = (((that.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!that.vermittlerSpezifischeDokumentenergaenzung.isEmpty()))?that.getVermittlerSpezifischeDokumentenergaenzung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittlerSpezifischeDokumentenergaenzung", lhsVermittlerSpezifischeDokumentenergaenzung), LocatorUtils.property(thatLocator, "vermittlerSpezifischeDokumentenergaenzung", rhsVermittlerSpezifischeDokumentenergaenzung), lhsVermittlerSpezifischeDokumentenergaenzung, rhsVermittlerSpezifischeDokumentenergaenzung, ((this.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!this.vermittlerSpezifischeDokumentenergaenzung.isEmpty())), ((that.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!that.vermittlerSpezifischeDokumentenergaenzung.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsSprache;
            lhsSprache = (((this.sprache!= null)&&(!this.sprache.isEmpty()))?this.getSprache():null);
            List<String> rhsSprache;
            rhsSprache = (((that.sprache!= null)&&(!that.sprache.isEmpty()))?that.getSprache():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sprache", lhsSprache), LocatorUtils.property(thatLocator, "sprache", rhsSprache), lhsSprache, rhsSprache, ((this.sprache!= null)&&(!this.sprache.isEmpty())), ((that.sprache!= null)&&(!that.sprache.isEmpty())))) {
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
            List<STDokumentartID> theArtID;
            theArtID = (((this.artID!= null)&&(!this.artID.isEmpty()))?this.getArtID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, ((this.artID!= null)&&(!this.artID.isEmpty())));
        }
        {
            String theDateiID;
            theDateiID = this.getDateiID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateiID", theDateiID), currentHashCode, theDateiID, (this.dateiID!= null));
        }
        {
            STVersandart theVersandart;
            theVersandart = this.getVersandart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versandart", theVersandart), currentHashCode, theVersandart, (this.versandart!= null));
        }
        {
            String theEmpfaenger;
            theEmpfaenger = this.getEmpfaenger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "empfaenger", theEmpfaenger), currentHashCode, theEmpfaenger, (this.empfaenger!= null));
        }
        {
            String theReferenzEmpfaenger;
            theReferenzEmpfaenger = this.getReferenzEmpfaenger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenzEmpfaenger", theReferenzEmpfaenger), currentHashCode, theReferenzEmpfaenger, (this.referenzEmpfaenger!= null));
        }
        {
            Boolean theVermittleranschriftAufDokument;
            theVermittleranschriftAufDokument = this.isVermittleranschriftAufDokument();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittleranschriftAufDokument", theVermittleranschriftAufDokument), currentHashCode, theVermittleranschriftAufDokument, (this.vermittleranschriftAufDokument!= null));
        }
        {
            List<CTDatei> theVermittlerSpezifischeDokumentenergaenzung;
            theVermittlerSpezifischeDokumentenergaenzung = (((this.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!this.vermittlerSpezifischeDokumentenergaenzung.isEmpty()))?this.getVermittlerSpezifischeDokumentenergaenzung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittlerSpezifischeDokumentenergaenzung", theVermittlerSpezifischeDokumentenergaenzung), currentHashCode, theVermittlerSpezifischeDokumentenergaenzung, ((this.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!this.vermittlerSpezifischeDokumentenergaenzung.isEmpty())));
        }
        {
            List<String> theSprache;
            theSprache = (((this.sprache!= null)&&(!this.sprache.isEmpty()))?this.getSprache():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sprache", theSprache), currentHashCode, theSprache, ((this.sprache!= null)&&(!this.sprache.isEmpty())));
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
        if (draftCopy instanceof CTDokumentanforderung) {
            final CTDokumentanforderung copy = ((CTDokumentanforderung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.artID!= null)&&(!this.artID.isEmpty())));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STDokumentartID> sourceArtID;
                    sourceArtID = (((this.artID!= null)&&(!this.artID.isEmpty()))?this.getArtID():null);
                    @SuppressWarnings("unchecked")
                    List<STDokumentartID> copyArtID = ((List<STDokumentartID> ) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, ((this.artID!= null)&&(!this.artID.isEmpty()))));
                    copy.artID = null;
                    if (copyArtID!= null) {
                        List<STDokumentartID> uniqueArtIDl = copy.getArtID();
                        uniqueArtIDl.addAll(copyArtID);
                    }
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean dateiIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateiID!= null));
                if (dateiIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDateiID;
                    sourceDateiID = this.getDateiID();
                    String copyDateiID = ((String) strategy.copy(LocatorUtils.property(locator, "dateiID", sourceDateiID), sourceDateiID, (this.dateiID!= null)));
                    copy.setDateiID(copyDateiID);
                } else {
                    if (dateiIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateiID = null;
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
                Boolean empfaengerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.empfaenger!= null));
                if (empfaengerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEmpfaenger;
                    sourceEmpfaenger = this.getEmpfaenger();
                    String copyEmpfaenger = ((String) strategy.copy(LocatorUtils.property(locator, "empfaenger", sourceEmpfaenger), sourceEmpfaenger, (this.empfaenger!= null)));
                    copy.setEmpfaenger(copyEmpfaenger);
                } else {
                    if (empfaengerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.empfaenger = null;
                    }
                }
            }
            {
                Boolean referenzEmpfaengerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referenzEmpfaenger!= null));
                if (referenzEmpfaengerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReferenzEmpfaenger;
                    sourceReferenzEmpfaenger = this.getReferenzEmpfaenger();
                    String copyReferenzEmpfaenger = ((String) strategy.copy(LocatorUtils.property(locator, "referenzEmpfaenger", sourceReferenzEmpfaenger), sourceReferenzEmpfaenger, (this.referenzEmpfaenger!= null)));
                    copy.setReferenzEmpfaenger(copyReferenzEmpfaenger);
                } else {
                    if (referenzEmpfaengerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenzEmpfaenger = null;
                    }
                }
            }
            {
                Boolean vermittleranschriftAufDokumentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermittleranschriftAufDokument!= null));
                if (vermittleranschriftAufDokumentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVermittleranschriftAufDokument;
                    sourceVermittleranschriftAufDokument = this.isVermittleranschriftAufDokument();
                    Boolean copyVermittleranschriftAufDokument = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vermittleranschriftAufDokument", sourceVermittleranschriftAufDokument), sourceVermittleranschriftAufDokument, (this.vermittleranschriftAufDokument!= null)));
                    copy.setVermittleranschriftAufDokument(copyVermittleranschriftAufDokument);
                } else {
                    if (vermittleranschriftAufDokumentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittleranschriftAufDokument = null;
                    }
                }
            }
            {
                Boolean vermittlerSpezifischeDokumentenergaenzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!this.vermittlerSpezifischeDokumentenergaenzung.isEmpty())));
                if (vermittlerSpezifischeDokumentenergaenzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDatei> sourceVermittlerSpezifischeDokumentenergaenzung;
                    sourceVermittlerSpezifischeDokumentenergaenzung = (((this.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!this.vermittlerSpezifischeDokumentenergaenzung.isEmpty()))?this.getVermittlerSpezifischeDokumentenergaenzung():null);
                    @SuppressWarnings("unchecked")
                    List<CTDatei> copyVermittlerSpezifischeDokumentenergaenzung = ((List<CTDatei> ) strategy.copy(LocatorUtils.property(locator, "vermittlerSpezifischeDokumentenergaenzung", sourceVermittlerSpezifischeDokumentenergaenzung), sourceVermittlerSpezifischeDokumentenergaenzung, ((this.vermittlerSpezifischeDokumentenergaenzung!= null)&&(!this.vermittlerSpezifischeDokumentenergaenzung.isEmpty()))));
                    copy.vermittlerSpezifischeDokumentenergaenzung = null;
                    if (copyVermittlerSpezifischeDokumentenergaenzung!= null) {
                        List<CTDatei> uniqueVermittlerSpezifischeDokumentenergaenzungl = copy.getVermittlerSpezifischeDokumentenergaenzung();
                        uniqueVermittlerSpezifischeDokumentenergaenzungl.addAll(copyVermittlerSpezifischeDokumentenergaenzung);
                    }
                } else {
                    if (vermittlerSpezifischeDokumentenergaenzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittlerSpezifischeDokumentenergaenzung = null;
                    }
                }
            }
            {
                Boolean spracheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sprache!= null)&&(!this.sprache.isEmpty())));
                if (spracheShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceSprache;
                    sourceSprache = (((this.sprache!= null)&&(!this.sprache.isEmpty()))?this.getSprache():null);
                    @SuppressWarnings("unchecked")
                    List<String> copySprache = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "sprache", sourceSprache), sourceSprache, ((this.sprache!= null)&&(!this.sprache.isEmpty()))));
                    copy.sprache = null;
                    if (copySprache!= null) {
                        List<String> uniqueSprachel = copy.getSprache();
                        uniqueSprachel.addAll(copySprache);
                    }
                } else {
                    if (spracheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sprache = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDokumentanforderung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withArtID(STDokumentartID... values) {
        if (values!= null) {
            for (STDokumentartID value: values) {
                getArtID().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withArtID(Collection<STDokumentartID> values) {
        if (values!= null) {
            getArtID().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withDateiID(String value) {
        setDateiID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withVersandart(STVersandart value) {
        setVersandart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withEmpfaenger(String value) {
        setEmpfaenger(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withReferenzEmpfaenger(String value) {
        setReferenzEmpfaenger(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withVermittleranschriftAufDokument(Boolean value) {
        setVermittleranschriftAufDokument(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withVermittlerSpezifischeDokumentenergaenzung(CTDatei... values) {
        if (values!= null) {
            for (CTDatei value: values) {
                getVermittlerSpezifischeDokumentenergaenzung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withVermittlerSpezifischeDokumentenergaenzung(Collection<CTDatei> values) {
        if (values!= null) {
            getVermittlerSpezifischeDokumentenergaenzung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withSprache(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSprache().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withSprache(Collection<String> values) {
        if (values!= null) {
            getSprache().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentanforderung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
