
package net.bipro.namespace.allgemein;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STDateityp;
import net.bipro.namespace.datentypen.STDokumentartID;
import net.bipro.namespace.datentypen.STKomprimierungstyp;
import net.bipro.namespace.datentypen.STVertraulich;
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
import org.w3._2005._05.xmlmime.Base64Binary;


/**
 * Container-Objekt fuer zu uebertragende Dateien.
 * 
 * <p>Java class for CT_Datei complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Datei"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateiID" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *         &lt;element name="Dateiname" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Dateityp" type="{http://www.bipro.net/namespace/datentypen}ST_Dateityp" minOccurs="0"/&gt;
 *         &lt;element name="Daten" type="{http://www.w3.org/2005/05/xmlmime}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Datenlink" type="{http://www.bipro.net/namespace/datentypen}ST_URL" minOccurs="0"/&gt;
 *         &lt;element name="Komprimierungstyp" type="{http://www.bipro.net/namespace/datentypen}ST_Komprimierungstyp"/&gt;
 *         &lt;element name="Erstelldatum" type="{http://www.bipro.net/namespace/datentypen}ST_Zeitstempel" minOccurs="0"/&gt;
 *         &lt;element name="DokumentartID" type="{http://www.bipro.net/namespace/datentypen}ST_DokumentartID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Kurzbeschreibung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Dateikennung" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Pruefsumme" type="{http://www.bipro.net/namespace/allgemein}CT_Pruefsumme" minOccurs="0"/&gt;
 *         &lt;element name="Vertraulich" type="{http://www.bipro.net/namespace/datentypen}ST_Vertraulich" minOccurs="0"/&gt;
 *         &lt;element name="IstEingangspost" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Quelle" type="{http://www.bipro.net/namespace/allgemein}CT_Quelle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Datei", propOrder = {
    "dateiID",
    "dateiname",
    "dateityp",
    "daten",
    "datenlink",
    "komprimierungstyp",
    "erstelldatum",
    "dokumentartID",
    "kurzbeschreibung",
    "bezeichnung",
    "dateikennung",
    "pruefsumme",
    "vertraulich",
    "istEingangspost",
    "quelle"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTDatei
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "DateiID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String dateiID;
    @XmlElement(name = "Dateiname")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String dateiname;
    @XmlElement(name = "Dateityp")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STDateityp dateityp;
    @XmlElement(name = "Daten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Base64Binary daten;
    @XmlElement(name = "Datenlink")
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String datenlink;
    @XmlElement(name = "Komprimierungstyp", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STKomprimierungstyp komprimierungstyp;
    @XmlElement(name = "Erstelldatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String erstelldatum;
    @XmlElement(name = "DokumentartID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STDokumentartID> dokumentartID;
    @XmlElement(name = "Kurzbeschreibung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kurzbeschreibung;
    @XmlElement(name = "Bezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "Dateikennung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String dateikennung;
    @XmlElement(name = "Pruefsumme")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTPruefsumme pruefsumme;
    @XmlElement(name = "Vertraulich")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVertraulich vertraulich;
    @XmlElement(name = "IstEingangspost")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean istEingangspost;
    @XmlElement(name = "Quelle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTQuelle quelle;

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
     * Gets the value of the dateiname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDateiname() {
        return dateiname;
    }

    /**
     * Sets the value of the dateiname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDateiname(String value) {
        this.dateiname = value;
    }

    /**
     * Gets the value of the dateityp property.
     * 
     * @return
     *     possible object is
     *     {@link STDateityp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STDateityp getDateityp() {
        return dateityp;
    }

    /**
     * Sets the value of the dateityp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDateityp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDateityp(STDateityp value) {
        this.dateityp = value;
    }

    /**
     * Gets the value of the daten property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Base64Binary getDaten() {
        return daten;
    }

    /**
     * Sets the value of the daten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDaten(Base64Binary value) {
        this.daten = value;
    }

    /**
     * Gets the value of the datenlink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDatenlink() {
        return datenlink;
    }

    /**
     * Sets the value of the datenlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDatenlink(String value) {
        this.datenlink = value;
    }

    /**
     * Gets the value of the komprimierungstyp property.
     * 
     * @return
     *     possible object is
     *     {@link STKomprimierungstyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STKomprimierungstyp getKomprimierungstyp() {
        return komprimierungstyp;
    }

    /**
     * Sets the value of the komprimierungstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STKomprimierungstyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKomprimierungstyp(STKomprimierungstyp value) {
        this.komprimierungstyp = value;
    }

    /**
     * Gets the value of the erstelldatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getErstelldatum() {
        return erstelldatum;
    }

    /**
     * Sets the value of the erstelldatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setErstelldatum(String value) {
        this.erstelldatum = value;
    }

    /**
     * Gets the value of the dokumentartID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentartID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentartID().add(newItem);
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
    public List<STDokumentartID> getDokumentartID() {
        if (dokumentartID == null) {
            dokumentartID = new ArrayList<STDokumentartID>();
        }
        return this.dokumentartID;
    }

    /**
     * Gets the value of the kurzbeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKurzbeschreibung() {
        return kurzbeschreibung;
    }

    /**
     * Sets the value of the kurzbeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKurzbeschreibung(String value) {
        this.kurzbeschreibung = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the dateikennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDateikennung() {
        return dateikennung;
    }

    /**
     * Sets the value of the dateikennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDateikennung(String value) {
        this.dateikennung = value;
    }

    /**
     * Gets the value of the pruefsumme property.
     * 
     * @return
     *     possible object is
     *     {@link CTPruefsumme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPruefsumme getPruefsumme() {
        return pruefsumme;
    }

    /**
     * Sets the value of the pruefsumme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPruefsumme }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setPruefsumme(CTPruefsumme value) {
        this.pruefsumme = value;
    }

    /**
     * Gets the value of the vertraulich property.
     * 
     * @return
     *     possible object is
     *     {@link STVertraulich }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STVertraulich getVertraulich() {
        return vertraulich;
    }

    /**
     * Sets the value of the vertraulich property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVertraulich }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVertraulich(STVertraulich value) {
        this.vertraulich = value;
    }

    /**
     * Gets the value of the istEingangspost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isIstEingangspost() {
        return istEingangspost;
    }

    /**
     * Sets the value of the istEingangspost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setIstEingangspost(Boolean value) {
        this.istEingangspost = value;
    }

    /**
     * Gets the value of the quelle property.
     * 
     * @return
     *     possible object is
     *     {@link CTQuelle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTQuelle getQuelle() {
        return quelle;
    }

    /**
     * Sets the value of the quelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTQuelle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setQuelle(CTQuelle value) {
        this.quelle = value;
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
        final CTDatei that = ((CTDatei) object);
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
            String lhsDateiname;
            lhsDateiname = this.getDateiname();
            String rhsDateiname;
            rhsDateiname = that.getDateiname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateiname", lhsDateiname), LocatorUtils.property(thatLocator, "dateiname", rhsDateiname), lhsDateiname, rhsDateiname, (this.dateiname!= null), (that.dateiname!= null))) {
                return false;
            }
        }
        {
            STDateityp lhsDateityp;
            lhsDateityp = this.getDateityp();
            STDateityp rhsDateityp;
            rhsDateityp = that.getDateityp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateityp", lhsDateityp), LocatorUtils.property(thatLocator, "dateityp", rhsDateityp), lhsDateityp, rhsDateityp, (this.dateityp!= null), (that.dateityp!= null))) {
                return false;
            }
        }
        {
            Base64Binary lhsDaten;
            lhsDaten = this.getDaten();
            Base64Binary rhsDaten;
            rhsDaten = that.getDaten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daten", lhsDaten), LocatorUtils.property(thatLocator, "daten", rhsDaten), lhsDaten, rhsDaten, (this.daten!= null), (that.daten!= null))) {
                return false;
            }
        }
        {
            String lhsDatenlink;
            lhsDatenlink = this.getDatenlink();
            String rhsDatenlink;
            rhsDatenlink = that.getDatenlink();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datenlink", lhsDatenlink), LocatorUtils.property(thatLocator, "datenlink", rhsDatenlink), lhsDatenlink, rhsDatenlink, (this.datenlink!= null), (that.datenlink!= null))) {
                return false;
            }
        }
        {
            STKomprimierungstyp lhsKomprimierungstyp;
            lhsKomprimierungstyp = this.getKomprimierungstyp();
            STKomprimierungstyp rhsKomprimierungstyp;
            rhsKomprimierungstyp = that.getKomprimierungstyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "komprimierungstyp", lhsKomprimierungstyp), LocatorUtils.property(thatLocator, "komprimierungstyp", rhsKomprimierungstyp), lhsKomprimierungstyp, rhsKomprimierungstyp, (this.komprimierungstyp!= null), (that.komprimierungstyp!= null))) {
                return false;
            }
        }
        {
            String lhsErstelldatum;
            lhsErstelldatum = this.getErstelldatum();
            String rhsErstelldatum;
            rhsErstelldatum = that.getErstelldatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erstelldatum", lhsErstelldatum), LocatorUtils.property(thatLocator, "erstelldatum", rhsErstelldatum), lhsErstelldatum, rhsErstelldatum, (this.erstelldatum!= null), (that.erstelldatum!= null))) {
                return false;
            }
        }
        {
            List<STDokumentartID> lhsDokumentartID;
            lhsDokumentartID = (((this.dokumentartID!= null)&&(!this.dokumentartID.isEmpty()))?this.getDokumentartID():null);
            List<STDokumentartID> rhsDokumentartID;
            rhsDokumentartID = (((that.dokumentartID!= null)&&(!that.dokumentartID.isEmpty()))?that.getDokumentartID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dokumentartID", lhsDokumentartID), LocatorUtils.property(thatLocator, "dokumentartID", rhsDokumentartID), lhsDokumentartID, rhsDokumentartID, ((this.dokumentartID!= null)&&(!this.dokumentartID.isEmpty())), ((that.dokumentartID!= null)&&(!that.dokumentartID.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsKurzbeschreibung;
            lhsKurzbeschreibung = this.getKurzbeschreibung();
            String rhsKurzbeschreibung;
            rhsKurzbeschreibung = that.getKurzbeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kurzbeschreibung", lhsKurzbeschreibung), LocatorUtils.property(thatLocator, "kurzbeschreibung", rhsKurzbeschreibung), lhsKurzbeschreibung, rhsKurzbeschreibung, (this.kurzbeschreibung!= null), (that.kurzbeschreibung!= null))) {
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
            String lhsDateikennung;
            lhsDateikennung = this.getDateikennung();
            String rhsDateikennung;
            rhsDateikennung = that.getDateikennung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateikennung", lhsDateikennung), LocatorUtils.property(thatLocator, "dateikennung", rhsDateikennung), lhsDateikennung, rhsDateikennung, (this.dateikennung!= null), (that.dateikennung!= null))) {
                return false;
            }
        }
        {
            CTPruefsumme lhsPruefsumme;
            lhsPruefsumme = this.getPruefsumme();
            CTPruefsumme rhsPruefsumme;
            rhsPruefsumme = that.getPruefsumme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pruefsumme", lhsPruefsumme), LocatorUtils.property(thatLocator, "pruefsumme", rhsPruefsumme), lhsPruefsumme, rhsPruefsumme, (this.pruefsumme!= null), (that.pruefsumme!= null))) {
                return false;
            }
        }
        {
            STVertraulich lhsVertraulich;
            lhsVertraulich = this.getVertraulich();
            STVertraulich rhsVertraulich;
            rhsVertraulich = that.getVertraulich();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertraulich", lhsVertraulich), LocatorUtils.property(thatLocator, "vertraulich", rhsVertraulich), lhsVertraulich, rhsVertraulich, (this.vertraulich!= null), (that.vertraulich!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIstEingangspost;
            lhsIstEingangspost = this.isIstEingangspost();
            Boolean rhsIstEingangspost;
            rhsIstEingangspost = that.isIstEingangspost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "istEingangspost", lhsIstEingangspost), LocatorUtils.property(thatLocator, "istEingangspost", rhsIstEingangspost), lhsIstEingangspost, rhsIstEingangspost, (this.istEingangspost!= null), (that.istEingangspost!= null))) {
                return false;
            }
        }
        {
            CTQuelle lhsQuelle;
            lhsQuelle = this.getQuelle();
            CTQuelle rhsQuelle;
            rhsQuelle = that.getQuelle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quelle", lhsQuelle), LocatorUtils.property(thatLocator, "quelle", rhsQuelle), lhsQuelle, rhsQuelle, (this.quelle!= null), (that.quelle!= null))) {
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
            String theDateiID;
            theDateiID = this.getDateiID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateiID", theDateiID), currentHashCode, theDateiID, (this.dateiID!= null));
        }
        {
            String theDateiname;
            theDateiname = this.getDateiname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateiname", theDateiname), currentHashCode, theDateiname, (this.dateiname!= null));
        }
        {
            STDateityp theDateityp;
            theDateityp = this.getDateityp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateityp", theDateityp), currentHashCode, theDateityp, (this.dateityp!= null));
        }
        {
            Base64Binary theDaten;
            theDaten = this.getDaten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daten", theDaten), currentHashCode, theDaten, (this.daten!= null));
        }
        {
            String theDatenlink;
            theDatenlink = this.getDatenlink();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datenlink", theDatenlink), currentHashCode, theDatenlink, (this.datenlink!= null));
        }
        {
            STKomprimierungstyp theKomprimierungstyp;
            theKomprimierungstyp = this.getKomprimierungstyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "komprimierungstyp", theKomprimierungstyp), currentHashCode, theKomprimierungstyp, (this.komprimierungstyp!= null));
        }
        {
            String theErstelldatum;
            theErstelldatum = this.getErstelldatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erstelldatum", theErstelldatum), currentHashCode, theErstelldatum, (this.erstelldatum!= null));
        }
        {
            List<STDokumentartID> theDokumentartID;
            theDokumentartID = (((this.dokumentartID!= null)&&(!this.dokumentartID.isEmpty()))?this.getDokumentartID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dokumentartID", theDokumentartID), currentHashCode, theDokumentartID, ((this.dokumentartID!= null)&&(!this.dokumentartID.isEmpty())));
        }
        {
            String theKurzbeschreibung;
            theKurzbeschreibung = this.getKurzbeschreibung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kurzbeschreibung", theKurzbeschreibung), currentHashCode, theKurzbeschreibung, (this.kurzbeschreibung!= null));
        }
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            String theDateikennung;
            theDateikennung = this.getDateikennung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateikennung", theDateikennung), currentHashCode, theDateikennung, (this.dateikennung!= null));
        }
        {
            CTPruefsumme thePruefsumme;
            thePruefsumme = this.getPruefsumme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pruefsumme", thePruefsumme), currentHashCode, thePruefsumme, (this.pruefsumme!= null));
        }
        {
            STVertraulich theVertraulich;
            theVertraulich = this.getVertraulich();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertraulich", theVertraulich), currentHashCode, theVertraulich, (this.vertraulich!= null));
        }
        {
            Boolean theIstEingangspost;
            theIstEingangspost = this.isIstEingangspost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "istEingangspost", theIstEingangspost), currentHashCode, theIstEingangspost, (this.istEingangspost!= null));
        }
        {
            CTQuelle theQuelle;
            theQuelle = this.getQuelle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quelle", theQuelle), currentHashCode, theQuelle, (this.quelle!= null));
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
        if (draftCopy instanceof CTDatei) {
            final CTDatei copy = ((CTDatei) draftCopy);
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
                Boolean dateinameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateiname!= null));
                if (dateinameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDateiname;
                    sourceDateiname = this.getDateiname();
                    String copyDateiname = ((String) strategy.copy(LocatorUtils.property(locator, "dateiname", sourceDateiname), sourceDateiname, (this.dateiname!= null)));
                    copy.setDateiname(copyDateiname);
                } else {
                    if (dateinameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateiname = null;
                    }
                }
            }
            {
                Boolean dateitypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateityp!= null));
                if (dateitypShouldBeCopiedAndSet == Boolean.TRUE) {
                    STDateityp sourceDateityp;
                    sourceDateityp = this.getDateityp();
                    STDateityp copyDateityp = ((STDateityp) strategy.copy(LocatorUtils.property(locator, "dateityp", sourceDateityp), sourceDateityp, (this.dateityp!= null)));
                    copy.setDateityp(copyDateityp);
                } else {
                    if (dateitypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateityp = null;
                    }
                }
            }
            {
                Boolean datenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.daten!= null));
                if (datenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Base64Binary sourceDaten;
                    sourceDaten = this.getDaten();
                    Base64Binary copyDaten = ((Base64Binary) strategy.copy(LocatorUtils.property(locator, "daten", sourceDaten), sourceDaten, (this.daten!= null)));
                    copy.setDaten(copyDaten);
                } else {
                    if (datenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.daten = null;
                    }
                }
            }
            {
                Boolean datenlinkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datenlink!= null));
                if (datenlinkShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDatenlink;
                    sourceDatenlink = this.getDatenlink();
                    String copyDatenlink = ((String) strategy.copy(LocatorUtils.property(locator, "datenlink", sourceDatenlink), sourceDatenlink, (this.datenlink!= null)));
                    copy.setDatenlink(copyDatenlink);
                } else {
                    if (datenlinkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datenlink = null;
                    }
                }
            }
            {
                Boolean komprimierungstypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.komprimierungstyp!= null));
                if (komprimierungstypShouldBeCopiedAndSet == Boolean.TRUE) {
                    STKomprimierungstyp sourceKomprimierungstyp;
                    sourceKomprimierungstyp = this.getKomprimierungstyp();
                    STKomprimierungstyp copyKomprimierungstyp = ((STKomprimierungstyp) strategy.copy(LocatorUtils.property(locator, "komprimierungstyp", sourceKomprimierungstyp), sourceKomprimierungstyp, (this.komprimierungstyp!= null)));
                    copy.setKomprimierungstyp(copyKomprimierungstyp);
                } else {
                    if (komprimierungstypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.komprimierungstyp = null;
                    }
                }
            }
            {
                Boolean erstelldatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erstelldatum!= null));
                if (erstelldatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErstelldatum;
                    sourceErstelldatum = this.getErstelldatum();
                    String copyErstelldatum = ((String) strategy.copy(LocatorUtils.property(locator, "erstelldatum", sourceErstelldatum), sourceErstelldatum, (this.erstelldatum!= null)));
                    copy.setErstelldatum(copyErstelldatum);
                } else {
                    if (erstelldatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erstelldatum = null;
                    }
                }
            }
            {
                Boolean dokumentartIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.dokumentartID!= null)&&(!this.dokumentartID.isEmpty())));
                if (dokumentartIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STDokumentartID> sourceDokumentartID;
                    sourceDokumentartID = (((this.dokumentartID!= null)&&(!this.dokumentartID.isEmpty()))?this.getDokumentartID():null);
                    @SuppressWarnings("unchecked")
                    List<STDokumentartID> copyDokumentartID = ((List<STDokumentartID> ) strategy.copy(LocatorUtils.property(locator, "dokumentartID", sourceDokumentartID), sourceDokumentartID, ((this.dokumentartID!= null)&&(!this.dokumentartID.isEmpty()))));
                    copy.dokumentartID = null;
                    if (copyDokumentartID!= null) {
                        List<STDokumentartID> uniqueDokumentartIDl = copy.getDokumentartID();
                        uniqueDokumentartIDl.addAll(copyDokumentartID);
                    }
                } else {
                    if (dokumentartIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dokumentartID = null;
                    }
                }
            }
            {
                Boolean kurzbeschreibungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kurzbeschreibung!= null));
                if (kurzbeschreibungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKurzbeschreibung;
                    sourceKurzbeschreibung = this.getKurzbeschreibung();
                    String copyKurzbeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "kurzbeschreibung", sourceKurzbeschreibung), sourceKurzbeschreibung, (this.kurzbeschreibung!= null)));
                    copy.setKurzbeschreibung(copyKurzbeschreibung);
                } else {
                    if (kurzbeschreibungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kurzbeschreibung = null;
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
                Boolean dateikennungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateikennung!= null));
                if (dateikennungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDateikennung;
                    sourceDateikennung = this.getDateikennung();
                    String copyDateikennung = ((String) strategy.copy(LocatorUtils.property(locator, "dateikennung", sourceDateikennung), sourceDateikennung, (this.dateikennung!= null)));
                    copy.setDateikennung(copyDateikennung);
                } else {
                    if (dateikennungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateikennung = null;
                    }
                }
            }
            {
                Boolean pruefsummeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pruefsumme!= null));
                if (pruefsummeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTPruefsumme sourcePruefsumme;
                    sourcePruefsumme = this.getPruefsumme();
                    CTPruefsumme copyPruefsumme = ((CTPruefsumme) strategy.copy(LocatorUtils.property(locator, "pruefsumme", sourcePruefsumme), sourcePruefsumme, (this.pruefsumme!= null)));
                    copy.setPruefsumme(copyPruefsumme);
                } else {
                    if (pruefsummeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pruefsumme = null;
                    }
                }
            }
            {
                Boolean vertraulichShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertraulich!= null));
                if (vertraulichShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVertraulich sourceVertraulich;
                    sourceVertraulich = this.getVertraulich();
                    STVertraulich copyVertraulich = ((STVertraulich) strategy.copy(LocatorUtils.property(locator, "vertraulich", sourceVertraulich), sourceVertraulich, (this.vertraulich!= null)));
                    copy.setVertraulich(copyVertraulich);
                } else {
                    if (vertraulichShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertraulich = null;
                    }
                }
            }
            {
                Boolean istEingangspostShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.istEingangspost!= null));
                if (istEingangspostShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceIstEingangspost;
                    sourceIstEingangspost = this.isIstEingangspost();
                    Boolean copyIstEingangspost = ((Boolean) strategy.copy(LocatorUtils.property(locator, "istEingangspost", sourceIstEingangspost), sourceIstEingangspost, (this.istEingangspost!= null)));
                    copy.setIstEingangspost(copyIstEingangspost);
                } else {
                    if (istEingangspostShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.istEingangspost = null;
                    }
                }
            }
            {
                Boolean quelleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.quelle!= null));
                if (quelleShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTQuelle sourceQuelle;
                    sourceQuelle = this.getQuelle();
                    CTQuelle copyQuelle = ((CTQuelle) strategy.copy(LocatorUtils.property(locator, "quelle", sourceQuelle), sourceQuelle, (this.quelle!= null)));
                    copy.setQuelle(copyQuelle);
                } else {
                    if (quelleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.quelle = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDatei();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDateiID(String value) {
        setDateiID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDateiname(String value) {
        setDateiname(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDateityp(STDateityp value) {
        setDateityp(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDaten(Base64Binary value) {
        setDaten(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDatenlink(String value) {
        setDatenlink(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withKomprimierungstyp(STKomprimierungstyp value) {
        setKomprimierungstyp(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withErstelldatum(String value) {
        setErstelldatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDokumentartID(STDokumentartID... values) {
        if (values!= null) {
            for (STDokumentartID value: values) {
                getDokumentartID().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDokumentartID(Collection<STDokumentartID> values) {
        if (values!= null) {
            getDokumentartID().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withDateikennung(String value) {
        setDateikennung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withPruefsumme(CTPruefsumme value) {
        setPruefsumme(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withVertraulich(STVertraulich value) {
        setVertraulich(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withIstEingangspost(Boolean value) {
        setIstEingangspost(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withQuelle(CTQuelle value) {
        setQuelle(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDatei withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
