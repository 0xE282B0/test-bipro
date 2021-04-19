
package net.bipro.namespace.gevo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTDatei;
import net.bipro.namespace.allgemein.CTDienstleister;
import net.bipro.namespace.allgemein.CTVermittler;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.versicherung.tarifierung.CTTAA;
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
 * Basis-Objekt aller von der BiPRO definierten Geschaeftsvorgaenge.
 * 
 * <p>Java class for CT_Geschaeftsvorgang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Geschaeftsvorgang"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vorgangsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Vorgangsnummer" minOccurs="0"/&gt;
 *         &lt;element name="VorgangsnummerVM" type="{http://www.bipro.net/namespace/datentypen}ST_Vorgangsnummer" minOccurs="0"/&gt;
 *         &lt;element name="Erstelldatum" type="{http://www.bipro.net/namespace/datentypen}ST_Zeitstempel" minOccurs="0"/&gt;
 *         &lt;element name="Freitext" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_GeVoArt" minOccurs="0"/&gt;
 *         &lt;element name="Vermittler" type="{http://www.bipro.net/namespace/allgemein}CT_Vermittler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dokumentanforderung" type="{http://www.bipro.net/namespace/gevo}CT_Dokumentanforderung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Datei" type="{http://www.bipro.net/namespace/allgemein}CT_Datei" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dokumentinformation" type="{http://www.bipro.net/namespace/gevo}CT_Dokumentinformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dienstleister" type="{http://www.bipro.net/namespace/allgemein}CT_Dienstleister" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dokumentversand" type="{http://www.bipro.net/namespace/gevo}CT_Dokumentversand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Geschaeftsvorgang", propOrder = {
    "vorgangsnummer",
    "vorgangsnummerVM",
    "erstelldatum",
    "freitext",
    "artID",
    "vermittler",
    "dokumentanforderung",
    "datei",
    "dokumentinformation",
    "dienstleister",
    "dokumentversand"
})
@XmlSeeAlso({
    CTTAA.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTGeschaeftsvorgang
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Vorgangsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String vorgangsnummer;
    @XmlElement(name = "VorgangsnummerVM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String vorgangsnummerVM;
    @XmlElement(name = "Erstelldatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String erstelldatum;
    @XmlElement(name = "Freitext")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String freitext;
    @XmlElement(name = "ArtID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String artID;
    @XmlElement(name = "Vermittler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTVermittler> vermittler;
    @XmlElement(name = "Dokumentanforderung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDokumentanforderung> dokumentanforderung;
    @XmlElement(name = "Datei")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDatei> datei;
    @XmlElement(name = "Dokumentinformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDokumentinformation> dokumentinformation;
    @XmlElement(name = "Dienstleister")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDienstleister> dienstleister;
    @XmlElement(name = "Dokumentversand")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDokumentversand> dokumentversand;

    /**
     * Gets the value of the vorgangsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVorgangsnummer() {
        return vorgangsnummer;
    }

    /**
     * Sets the value of the vorgangsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVorgangsnummer(String value) {
        this.vorgangsnummer = value;
    }

    /**
     * Gets the value of the vorgangsnummerVM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVorgangsnummerVM() {
        return vorgangsnummerVM;
    }

    /**
     * Sets the value of the vorgangsnummerVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVorgangsnummerVM(String value) {
        this.vorgangsnummerVM = value;
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
     * Gets the value of the freitext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getFreitext() {
        return freitext;
    }

    /**
     * Sets the value of the freitext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFreitext(String value) {
        this.freitext = value;
    }

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(String value) {
        this.artID = value;
    }

    /**
     * Gets the value of the vermittler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vermittler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVermittler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVermittler }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTVermittler> getVermittler() {
        if (vermittler == null) {
            vermittler = new ArrayList<CTVermittler>();
        }
        return this.vermittler;
    }

    /**
     * Gets the value of the dokumentanforderung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentanforderung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentanforderung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDokumentanforderung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDokumentanforderung> getDokumentanforderung() {
        if (dokumentanforderung == null) {
            dokumentanforderung = new ArrayList<CTDokumentanforderung>();
        }
        return this.dokumentanforderung;
    }

    /**
     * Gets the value of the datei property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datei property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatei().add(newItem);
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
    public List<CTDatei> getDatei() {
        if (datei == null) {
            datei = new ArrayList<CTDatei>();
        }
        return this.datei;
    }

    /**
     * Gets the value of the dokumentinformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentinformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentinformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDokumentinformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDokumentinformation> getDokumentinformation() {
        if (dokumentinformation == null) {
            dokumentinformation = new ArrayList<CTDokumentinformation>();
        }
        return this.dokumentinformation;
    }

    /**
     * Gets the value of the dienstleister property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dienstleister property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDienstleister().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDienstleister }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDienstleister> getDienstleister() {
        if (dienstleister == null) {
            dienstleister = new ArrayList<CTDienstleister>();
        }
        return this.dienstleister;
    }

    /**
     * Gets the value of the dokumentversand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentversand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentversand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDokumentversand }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDokumentversand> getDokumentversand() {
        if (dokumentversand == null) {
            dokumentversand = new ArrayList<CTDokumentversand>();
        }
        return this.dokumentversand;
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
        final CTGeschaeftsvorgang that = ((CTGeschaeftsvorgang) object);
        {
            String lhsVorgangsnummer;
            lhsVorgangsnummer = this.getVorgangsnummer();
            String rhsVorgangsnummer;
            rhsVorgangsnummer = that.getVorgangsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorgangsnummer", lhsVorgangsnummer), LocatorUtils.property(thatLocator, "vorgangsnummer", rhsVorgangsnummer), lhsVorgangsnummer, rhsVorgangsnummer, (this.vorgangsnummer!= null), (that.vorgangsnummer!= null))) {
                return false;
            }
        }
        {
            String lhsVorgangsnummerVM;
            lhsVorgangsnummerVM = this.getVorgangsnummerVM();
            String rhsVorgangsnummerVM;
            rhsVorgangsnummerVM = that.getVorgangsnummerVM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorgangsnummerVM", lhsVorgangsnummerVM), LocatorUtils.property(thatLocator, "vorgangsnummerVM", rhsVorgangsnummerVM), lhsVorgangsnummerVM, rhsVorgangsnummerVM, (this.vorgangsnummerVM!= null), (that.vorgangsnummerVM!= null))) {
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
            String lhsFreitext;
            lhsFreitext = this.getFreitext();
            String rhsFreitext;
            rhsFreitext = that.getFreitext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitext", lhsFreitext), LocatorUtils.property(thatLocator, "freitext", rhsFreitext), lhsFreitext, rhsFreitext, (this.freitext!= null), (that.freitext!= null))) {
                return false;
            }
        }
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
            List<CTVermittler> lhsVermittler;
            lhsVermittler = (((this.vermittler!= null)&&(!this.vermittler.isEmpty()))?this.getVermittler():null);
            List<CTVermittler> rhsVermittler;
            rhsVermittler = (((that.vermittler!= null)&&(!that.vermittler.isEmpty()))?that.getVermittler():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittler", lhsVermittler), LocatorUtils.property(thatLocator, "vermittler", rhsVermittler), lhsVermittler, rhsVermittler, ((this.vermittler!= null)&&(!this.vermittler.isEmpty())), ((that.vermittler!= null)&&(!that.vermittler.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTDokumentanforderung> lhsDokumentanforderung;
            lhsDokumentanforderung = (((this.dokumentanforderung!= null)&&(!this.dokumentanforderung.isEmpty()))?this.getDokumentanforderung():null);
            List<CTDokumentanforderung> rhsDokumentanforderung;
            rhsDokumentanforderung = (((that.dokumentanforderung!= null)&&(!that.dokumentanforderung.isEmpty()))?that.getDokumentanforderung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dokumentanforderung", lhsDokumentanforderung), LocatorUtils.property(thatLocator, "dokumentanforderung", rhsDokumentanforderung), lhsDokumentanforderung, rhsDokumentanforderung, ((this.dokumentanforderung!= null)&&(!this.dokumentanforderung.isEmpty())), ((that.dokumentanforderung!= null)&&(!that.dokumentanforderung.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTDatei> lhsDatei;
            lhsDatei = (((this.datei!= null)&&(!this.datei.isEmpty()))?this.getDatei():null);
            List<CTDatei> rhsDatei;
            rhsDatei = (((that.datei!= null)&&(!that.datei.isEmpty()))?that.getDatei():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datei", lhsDatei), LocatorUtils.property(thatLocator, "datei", rhsDatei), lhsDatei, rhsDatei, ((this.datei!= null)&&(!this.datei.isEmpty())), ((that.datei!= null)&&(!that.datei.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTDokumentinformation> lhsDokumentinformation;
            lhsDokumentinformation = (((this.dokumentinformation!= null)&&(!this.dokumentinformation.isEmpty()))?this.getDokumentinformation():null);
            List<CTDokumentinformation> rhsDokumentinformation;
            rhsDokumentinformation = (((that.dokumentinformation!= null)&&(!that.dokumentinformation.isEmpty()))?that.getDokumentinformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dokumentinformation", lhsDokumentinformation), LocatorUtils.property(thatLocator, "dokumentinformation", rhsDokumentinformation), lhsDokumentinformation, rhsDokumentinformation, ((this.dokumentinformation!= null)&&(!this.dokumentinformation.isEmpty())), ((that.dokumentinformation!= null)&&(!that.dokumentinformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTDienstleister> lhsDienstleister;
            lhsDienstleister = (((this.dienstleister!= null)&&(!this.dienstleister.isEmpty()))?this.getDienstleister():null);
            List<CTDienstleister> rhsDienstleister;
            rhsDienstleister = (((that.dienstleister!= null)&&(!that.dienstleister.isEmpty()))?that.getDienstleister():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dienstleister", lhsDienstleister), LocatorUtils.property(thatLocator, "dienstleister", rhsDienstleister), lhsDienstleister, rhsDienstleister, ((this.dienstleister!= null)&&(!this.dienstleister.isEmpty())), ((that.dienstleister!= null)&&(!that.dienstleister.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTDokumentversand> lhsDokumentversand;
            lhsDokumentversand = (((this.dokumentversand!= null)&&(!this.dokumentversand.isEmpty()))?this.getDokumentversand():null);
            List<CTDokumentversand> rhsDokumentversand;
            rhsDokumentversand = (((that.dokumentversand!= null)&&(!that.dokumentversand.isEmpty()))?that.getDokumentversand():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dokumentversand", lhsDokumentversand), LocatorUtils.property(thatLocator, "dokumentversand", rhsDokumentversand), lhsDokumentversand, rhsDokumentversand, ((this.dokumentversand!= null)&&(!this.dokumentversand.isEmpty())), ((that.dokumentversand!= null)&&(!that.dokumentversand.isEmpty())))) {
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
            String theVorgangsnummer;
            theVorgangsnummer = this.getVorgangsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorgangsnummer", theVorgangsnummer), currentHashCode, theVorgangsnummer, (this.vorgangsnummer!= null));
        }
        {
            String theVorgangsnummerVM;
            theVorgangsnummerVM = this.getVorgangsnummerVM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorgangsnummerVM", theVorgangsnummerVM), currentHashCode, theVorgangsnummerVM, (this.vorgangsnummerVM!= null));
        }
        {
            String theErstelldatum;
            theErstelldatum = this.getErstelldatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erstelldatum", theErstelldatum), currentHashCode, theErstelldatum, (this.erstelldatum!= null));
        }
        {
            String theFreitext;
            theFreitext = this.getFreitext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freitext", theFreitext), currentHashCode, theFreitext, (this.freitext!= null));
        }
        {
            String theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            List<CTVermittler> theVermittler;
            theVermittler = (((this.vermittler!= null)&&(!this.vermittler.isEmpty()))?this.getVermittler():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittler", theVermittler), currentHashCode, theVermittler, ((this.vermittler!= null)&&(!this.vermittler.isEmpty())));
        }
        {
            List<CTDokumentanforderung> theDokumentanforderung;
            theDokumentanforderung = (((this.dokumentanforderung!= null)&&(!this.dokumentanforderung.isEmpty()))?this.getDokumentanforderung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dokumentanforderung", theDokumentanforderung), currentHashCode, theDokumentanforderung, ((this.dokumentanforderung!= null)&&(!this.dokumentanforderung.isEmpty())));
        }
        {
            List<CTDatei> theDatei;
            theDatei = (((this.datei!= null)&&(!this.datei.isEmpty()))?this.getDatei():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datei", theDatei), currentHashCode, theDatei, ((this.datei!= null)&&(!this.datei.isEmpty())));
        }
        {
            List<CTDokumentinformation> theDokumentinformation;
            theDokumentinformation = (((this.dokumentinformation!= null)&&(!this.dokumentinformation.isEmpty()))?this.getDokumentinformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dokumentinformation", theDokumentinformation), currentHashCode, theDokumentinformation, ((this.dokumentinformation!= null)&&(!this.dokumentinformation.isEmpty())));
        }
        {
            List<CTDienstleister> theDienstleister;
            theDienstleister = (((this.dienstleister!= null)&&(!this.dienstleister.isEmpty()))?this.getDienstleister():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dienstleister", theDienstleister), currentHashCode, theDienstleister, ((this.dienstleister!= null)&&(!this.dienstleister.isEmpty())));
        }
        {
            List<CTDokumentversand> theDokumentversand;
            theDokumentversand = (((this.dokumentversand!= null)&&(!this.dokumentversand.isEmpty()))?this.getDokumentversand():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dokumentversand", theDokumentversand), currentHashCode, theDokumentversand, ((this.dokumentversand!= null)&&(!this.dokumentversand.isEmpty())));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTGeschaeftsvorgang) {
            final CTGeschaeftsvorgang copy = ((CTGeschaeftsvorgang) target);
            {
                Boolean vorgangsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorgangsnummer!= null));
                if (vorgangsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVorgangsnummer;
                    sourceVorgangsnummer = this.getVorgangsnummer();
                    String copyVorgangsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "vorgangsnummer", sourceVorgangsnummer), sourceVorgangsnummer, (this.vorgangsnummer!= null)));
                    copy.setVorgangsnummer(copyVorgangsnummer);
                } else {
                    if (vorgangsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorgangsnummer = null;
                    }
                }
            }
            {
                Boolean vorgangsnummerVMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorgangsnummerVM!= null));
                if (vorgangsnummerVMShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVorgangsnummerVM;
                    sourceVorgangsnummerVM = this.getVorgangsnummerVM();
                    String copyVorgangsnummerVM = ((String) strategy.copy(LocatorUtils.property(locator, "vorgangsnummerVM", sourceVorgangsnummerVM), sourceVorgangsnummerVM, (this.vorgangsnummerVM!= null)));
                    copy.setVorgangsnummerVM(copyVorgangsnummerVM);
                } else {
                    if (vorgangsnummerVMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorgangsnummerVM = null;
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
                Boolean freitextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freitext!= null));
                if (freitextShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreitext;
                    sourceFreitext = this.getFreitext();
                    String copyFreitext = ((String) strategy.copy(LocatorUtils.property(locator, "freitext", sourceFreitext), sourceFreitext, (this.freitext!= null)));
                    copy.setFreitext(copyFreitext);
                } else {
                    if (freitextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freitext = null;
                    }
                }
            }
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
                Boolean vermittlerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vermittler!= null)&&(!this.vermittler.isEmpty())));
                if (vermittlerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVermittler> sourceVermittler;
                    sourceVermittler = (((this.vermittler!= null)&&(!this.vermittler.isEmpty()))?this.getVermittler():null);
                    @SuppressWarnings("unchecked")
                    List<CTVermittler> copyVermittler = ((List<CTVermittler> ) strategy.copy(LocatorUtils.property(locator, "vermittler", sourceVermittler), sourceVermittler, ((this.vermittler!= null)&&(!this.vermittler.isEmpty()))));
                    copy.vermittler = null;
                    if (copyVermittler!= null) {
                        List<CTVermittler> uniqueVermittlerl = copy.getVermittler();
                        uniqueVermittlerl.addAll(copyVermittler);
                    }
                } else {
                    if (vermittlerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittler = null;
                    }
                }
            }
            {
                Boolean dokumentanforderungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.dokumentanforderung!= null)&&(!this.dokumentanforderung.isEmpty())));
                if (dokumentanforderungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDokumentanforderung> sourceDokumentanforderung;
                    sourceDokumentanforderung = (((this.dokumentanforderung!= null)&&(!this.dokumentanforderung.isEmpty()))?this.getDokumentanforderung():null);
                    @SuppressWarnings("unchecked")
                    List<CTDokumentanforderung> copyDokumentanforderung = ((List<CTDokumentanforderung> ) strategy.copy(LocatorUtils.property(locator, "dokumentanforderung", sourceDokumentanforderung), sourceDokumentanforderung, ((this.dokumentanforderung!= null)&&(!this.dokumentanforderung.isEmpty()))));
                    copy.dokumentanforderung = null;
                    if (copyDokumentanforderung!= null) {
                        List<CTDokumentanforderung> uniqueDokumentanforderungl = copy.getDokumentanforderung();
                        uniqueDokumentanforderungl.addAll(copyDokumentanforderung);
                    }
                } else {
                    if (dokumentanforderungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dokumentanforderung = null;
                    }
                }
            }
            {
                Boolean dateiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.datei!= null)&&(!this.datei.isEmpty())));
                if (dateiShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDatei> sourceDatei;
                    sourceDatei = (((this.datei!= null)&&(!this.datei.isEmpty()))?this.getDatei():null);
                    @SuppressWarnings("unchecked")
                    List<CTDatei> copyDatei = ((List<CTDatei> ) strategy.copy(LocatorUtils.property(locator, "datei", sourceDatei), sourceDatei, ((this.datei!= null)&&(!this.datei.isEmpty()))));
                    copy.datei = null;
                    if (copyDatei!= null) {
                        List<CTDatei> uniqueDateil = copy.getDatei();
                        uniqueDateil.addAll(copyDatei);
                    }
                } else {
                    if (dateiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datei = null;
                    }
                }
            }
            {
                Boolean dokumentinformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.dokumentinformation!= null)&&(!this.dokumentinformation.isEmpty())));
                if (dokumentinformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDokumentinformation> sourceDokumentinformation;
                    sourceDokumentinformation = (((this.dokumentinformation!= null)&&(!this.dokumentinformation.isEmpty()))?this.getDokumentinformation():null);
                    @SuppressWarnings("unchecked")
                    List<CTDokumentinformation> copyDokumentinformation = ((List<CTDokumentinformation> ) strategy.copy(LocatorUtils.property(locator, "dokumentinformation", sourceDokumentinformation), sourceDokumentinformation, ((this.dokumentinformation!= null)&&(!this.dokumentinformation.isEmpty()))));
                    copy.dokumentinformation = null;
                    if (copyDokumentinformation!= null) {
                        List<CTDokumentinformation> uniqueDokumentinformationl = copy.getDokumentinformation();
                        uniqueDokumentinformationl.addAll(copyDokumentinformation);
                    }
                } else {
                    if (dokumentinformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dokumentinformation = null;
                    }
                }
            }
            {
                Boolean dienstleisterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.dienstleister!= null)&&(!this.dienstleister.isEmpty())));
                if (dienstleisterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDienstleister> sourceDienstleister;
                    sourceDienstleister = (((this.dienstleister!= null)&&(!this.dienstleister.isEmpty()))?this.getDienstleister():null);
                    @SuppressWarnings("unchecked")
                    List<CTDienstleister> copyDienstleister = ((List<CTDienstleister> ) strategy.copy(LocatorUtils.property(locator, "dienstleister", sourceDienstleister), sourceDienstleister, ((this.dienstleister!= null)&&(!this.dienstleister.isEmpty()))));
                    copy.dienstleister = null;
                    if (copyDienstleister!= null) {
                        List<CTDienstleister> uniqueDienstleisterl = copy.getDienstleister();
                        uniqueDienstleisterl.addAll(copyDienstleister);
                    }
                } else {
                    if (dienstleisterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dienstleister = null;
                    }
                }
            }
            {
                Boolean dokumentversandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.dokumentversand!= null)&&(!this.dokumentversand.isEmpty())));
                if (dokumentversandShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDokumentversand> sourceDokumentversand;
                    sourceDokumentversand = (((this.dokumentversand!= null)&&(!this.dokumentversand.isEmpty()))?this.getDokumentversand():null);
                    @SuppressWarnings("unchecked")
                    List<CTDokumentversand> copyDokumentversand = ((List<CTDokumentversand> ) strategy.copy(LocatorUtils.property(locator, "dokumentversand", sourceDokumentversand), sourceDokumentversand, ((this.dokumentversand!= null)&&(!this.dokumentversand.isEmpty()))));
                    copy.dokumentversand = null;
                    if (copyDokumentversand!= null) {
                        List<CTDokumentversand> uniqueDokumentversandl = copy.getDokumentversand();
                        uniqueDokumentversandl.addAll(copyDokumentversand);
                    }
                } else {
                    if (dokumentversandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dokumentversand = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withVorgangsnummer(String value) {
        setVorgangsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withVorgangsnummerVM(String value) {
        setVorgangsnummerVM(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withErstelldatum(String value) {
        setErstelldatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withFreitext(String value) {
        setFreitext(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withArtID(String value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withVermittler(CTVermittler... values) {
        if (values!= null) {
            for (CTVermittler value: values) {
                getVermittler().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withVermittler(Collection<CTVermittler> values) {
        if (values!= null) {
            getVermittler().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDokumentanforderung(CTDokumentanforderung... values) {
        if (values!= null) {
            for (CTDokumentanforderung value: values) {
                getDokumentanforderung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDokumentanforderung(Collection<CTDokumentanforderung> values) {
        if (values!= null) {
            getDokumentanforderung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDatei(CTDatei... values) {
        if (values!= null) {
            for (CTDatei value: values) {
                getDatei().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDatei(Collection<CTDatei> values) {
        if (values!= null) {
            getDatei().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDokumentinformation(CTDokumentinformation... values) {
        if (values!= null) {
            for (CTDokumentinformation value: values) {
                getDokumentinformation().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDokumentinformation(Collection<CTDokumentinformation> values) {
        if (values!= null) {
            getDokumentinformation().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDienstleister(CTDienstleister... values) {
        if (values!= null) {
            for (CTDienstleister value: values) {
                getDienstleister().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDienstleister(Collection<CTDienstleister> values) {
        if (values!= null) {
            getDienstleister().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDokumentversand(CTDokumentversand... values) {
        if (values!= null) {
            for (CTDokumentversand value: values) {
                getDokumentversand().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withDokumentversand(Collection<CTDokumentversand> values) {
        if (values!= null) {
            getDokumentversand().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeschaeftsvorgang withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
