
package net.bipro.namespace.kapitalanlage.basis;

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
import net.bipro.namespace.datentypen.STKapitalanlageart;
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
 * Eine Kapitalanlage, z.B. Termineinlage Sparbrief, Termineinlage Festgeld, Sparkonto, Kontokorrentkonto, Geschäftsanteile, Depot.
 * 
 * <p>Java class for CT_Kapitalanlage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Kapitalanlage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Kapitalanlageart" minOccurs="0"/&gt;
 *         &lt;element name="Unterdepotnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Depotnummer" minOccurs="0"/&gt;
 *         &lt;element name="Waehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel" minOccurs="0"/&gt;
 *         &lt;element name="DatumErsteEinzahlung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Abtretung" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Zinsen" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Zinsen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vereinbarung" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Vereinbarung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Saldo" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Saldo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Abtretungsglaeubiger" type="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Abtretungsglaeubiger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Kapitalanlage", propOrder = {
    "artID",
    "unterdepotnummer",
    "waehrung",
    "datumErsteEinzahlung",
    "abtretung",
    "zinsen",
    "vereinbarung",
    "saldo",
    "abtretungsglaeubiger"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTKapitalanlage
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STKapitalanlageart artID;
    @XmlElement(name = "Unterdepotnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String unterdepotnummer;
    @XmlElement(name = "Waehrung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel waehrung;
    @XmlElement(name = "DatumErsteEinzahlung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String datumErsteEinzahlung;
    @XmlElement(name = "Abtretung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean abtretung;
    @XmlElement(name = "Zinsen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTZinsen> zinsen;
    @XmlElement(name = "Vereinbarung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVereinbarung> vereinbarung;
    @XmlElement(name = "Saldo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTSaldo> saldo;
    @XmlElement(name = "Abtretungsglaeubiger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTAbtretungsglaeubiger> abtretungsglaeubiger;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STKapitalanlageart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STKapitalanlageart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STKapitalanlageart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STKapitalanlageart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the unterdepotnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getUnterdepotnummer() {
        return unterdepotnummer;
    }

    /**
     * Sets the value of the unterdepotnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUnterdepotnummer(String value) {
        this.unterdepotnummer = value;
    }

    /**
     * Gets the value of the waehrung property.
     * 
     * @return
     *     possible object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWaehrungsschluessel getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the value of the waehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWaehrung(STWaehrungsschluessel value) {
        this.waehrung = value;
    }

    /**
     * Gets the value of the datumErsteEinzahlung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getDatumErsteEinzahlung() {
        return datumErsteEinzahlung;
    }

    /**
     * Sets the value of the datumErsteEinzahlung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDatumErsteEinzahlung(String value) {
        this.datumErsteEinzahlung = value;
    }

    /**
     * Gets the value of the abtretung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isAbtretung() {
        return abtretung;
    }

    /**
     * Sets the value of the abtretung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbtretung(Boolean value) {
        this.abtretung = value;
    }

    /**
     * Gets the value of the zinsen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zinsen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZinsen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTZinsen }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTZinsen> getZinsen() {
        if (zinsen == null) {
            zinsen = new ArrayList<CTZinsen>();
        }
        return this.zinsen;
    }

    /**
     * Gets the value of the vereinbarung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vereinbarung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVereinbarung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVereinbarung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVereinbarung> getVereinbarung() {
        if (vereinbarung == null) {
            vereinbarung = new ArrayList<CTVereinbarung>();
        }
        return this.vereinbarung;
    }

    /**
     * Gets the value of the saldo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saldo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaldo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSaldo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTSaldo> getSaldo() {
        if (saldo == null) {
            saldo = new ArrayList<CTSaldo>();
        }
        return this.saldo;
    }

    /**
     * Gets the value of the abtretungsglaeubiger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abtretungsglaeubiger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbtretungsglaeubiger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAbtretungsglaeubiger }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTAbtretungsglaeubiger> getAbtretungsglaeubiger() {
        if (abtretungsglaeubiger == null) {
            abtretungsglaeubiger = new ArrayList<CTAbtretungsglaeubiger>();
        }
        return this.abtretungsglaeubiger;
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
        final CTKapitalanlage that = ((CTKapitalanlage) object);
        {
            STKapitalanlageart lhsArtID;
            lhsArtID = this.getArtID();
            STKapitalanlageart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsUnterdepotnummer;
            lhsUnterdepotnummer = this.getUnterdepotnummer();
            String rhsUnterdepotnummer;
            rhsUnterdepotnummer = that.getUnterdepotnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterdepotnummer", lhsUnterdepotnummer), LocatorUtils.property(thatLocator, "unterdepotnummer", rhsUnterdepotnummer), lhsUnterdepotnummer, rhsUnterdepotnummer, (this.unterdepotnummer!= null), (that.unterdepotnummer!= null))) {
                return false;
            }
        }
        {
            STWaehrungsschluessel lhsWaehrung;
            lhsWaehrung = this.getWaehrung();
            STWaehrungsschluessel rhsWaehrung;
            rhsWaehrung = that.getWaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waehrung", lhsWaehrung), LocatorUtils.property(thatLocator, "waehrung", rhsWaehrung), lhsWaehrung, rhsWaehrung, (this.waehrung!= null), (that.waehrung!= null))) {
                return false;
            }
        }
        {
            String lhsDatumErsteEinzahlung;
            lhsDatumErsteEinzahlung = this.getDatumErsteEinzahlung();
            String rhsDatumErsteEinzahlung;
            rhsDatumErsteEinzahlung = that.getDatumErsteEinzahlung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datumErsteEinzahlung", lhsDatumErsteEinzahlung), LocatorUtils.property(thatLocator, "datumErsteEinzahlung", rhsDatumErsteEinzahlung), lhsDatumErsteEinzahlung, rhsDatumErsteEinzahlung, (this.datumErsteEinzahlung!= null), (that.datumErsteEinzahlung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAbtretung;
            lhsAbtretung = this.isAbtretung();
            Boolean rhsAbtretung;
            rhsAbtretung = that.isAbtretung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abtretung", lhsAbtretung), LocatorUtils.property(thatLocator, "abtretung", rhsAbtretung), lhsAbtretung, rhsAbtretung, (this.abtretung!= null), (that.abtretung!= null))) {
                return false;
            }
        }
        {
            List<CTZinsen> lhsZinsen;
            lhsZinsen = (((this.zinsen!= null)&&(!this.zinsen.isEmpty()))?this.getZinsen():null);
            List<CTZinsen> rhsZinsen;
            rhsZinsen = (((that.zinsen!= null)&&(!that.zinsen.isEmpty()))?that.getZinsen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zinsen", lhsZinsen), LocatorUtils.property(thatLocator, "zinsen", rhsZinsen), lhsZinsen, rhsZinsen, ((this.zinsen!= null)&&(!this.zinsen.isEmpty())), ((that.zinsen!= null)&&(!that.zinsen.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTVereinbarung> lhsVereinbarung;
            lhsVereinbarung = (((this.vereinbarung!= null)&&(!this.vereinbarung.isEmpty()))?this.getVereinbarung():null);
            List<CTVereinbarung> rhsVereinbarung;
            rhsVereinbarung = (((that.vereinbarung!= null)&&(!that.vereinbarung.isEmpty()))?that.getVereinbarung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vereinbarung", lhsVereinbarung), LocatorUtils.property(thatLocator, "vereinbarung", rhsVereinbarung), lhsVereinbarung, rhsVereinbarung, ((this.vereinbarung!= null)&&(!this.vereinbarung.isEmpty())), ((that.vereinbarung!= null)&&(!that.vereinbarung.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTSaldo> lhsSaldo;
            lhsSaldo = (((this.saldo!= null)&&(!this.saldo.isEmpty()))?this.getSaldo():null);
            List<CTSaldo> rhsSaldo;
            rhsSaldo = (((that.saldo!= null)&&(!that.saldo.isEmpty()))?that.getSaldo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saldo", lhsSaldo), LocatorUtils.property(thatLocator, "saldo", rhsSaldo), lhsSaldo, rhsSaldo, ((this.saldo!= null)&&(!this.saldo.isEmpty())), ((that.saldo!= null)&&(!that.saldo.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTAbtretungsglaeubiger> lhsAbtretungsglaeubiger;
            lhsAbtretungsglaeubiger = (((this.abtretungsglaeubiger!= null)&&(!this.abtretungsglaeubiger.isEmpty()))?this.getAbtretungsglaeubiger():null);
            List<CTAbtretungsglaeubiger> rhsAbtretungsglaeubiger;
            rhsAbtretungsglaeubiger = (((that.abtretungsglaeubiger!= null)&&(!that.abtretungsglaeubiger.isEmpty()))?that.getAbtretungsglaeubiger():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abtretungsglaeubiger", lhsAbtretungsglaeubiger), LocatorUtils.property(thatLocator, "abtretungsglaeubiger", rhsAbtretungsglaeubiger), lhsAbtretungsglaeubiger, rhsAbtretungsglaeubiger, ((this.abtretungsglaeubiger!= null)&&(!this.abtretungsglaeubiger.isEmpty())), ((that.abtretungsglaeubiger!= null)&&(!that.abtretungsglaeubiger.isEmpty())))) {
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
            STKapitalanlageart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theUnterdepotnummer;
            theUnterdepotnummer = this.getUnterdepotnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unterdepotnummer", theUnterdepotnummer), currentHashCode, theUnterdepotnummer, (this.unterdepotnummer!= null));
        }
        {
            STWaehrungsschluessel theWaehrung;
            theWaehrung = this.getWaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waehrung", theWaehrung), currentHashCode, theWaehrung, (this.waehrung!= null));
        }
        {
            String theDatumErsteEinzahlung;
            theDatumErsteEinzahlung = this.getDatumErsteEinzahlung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datumErsteEinzahlung", theDatumErsteEinzahlung), currentHashCode, theDatumErsteEinzahlung, (this.datumErsteEinzahlung!= null));
        }
        {
            Boolean theAbtretung;
            theAbtretung = this.isAbtretung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abtretung", theAbtretung), currentHashCode, theAbtretung, (this.abtretung!= null));
        }
        {
            List<CTZinsen> theZinsen;
            theZinsen = (((this.zinsen!= null)&&(!this.zinsen.isEmpty()))?this.getZinsen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zinsen", theZinsen), currentHashCode, theZinsen, ((this.zinsen!= null)&&(!this.zinsen.isEmpty())));
        }
        {
            List<CTVereinbarung> theVereinbarung;
            theVereinbarung = (((this.vereinbarung!= null)&&(!this.vereinbarung.isEmpty()))?this.getVereinbarung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vereinbarung", theVereinbarung), currentHashCode, theVereinbarung, ((this.vereinbarung!= null)&&(!this.vereinbarung.isEmpty())));
        }
        {
            List<CTSaldo> theSaldo;
            theSaldo = (((this.saldo!= null)&&(!this.saldo.isEmpty()))?this.getSaldo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saldo", theSaldo), currentHashCode, theSaldo, ((this.saldo!= null)&&(!this.saldo.isEmpty())));
        }
        {
            List<CTAbtretungsglaeubiger> theAbtretungsglaeubiger;
            theAbtretungsglaeubiger = (((this.abtretungsglaeubiger!= null)&&(!this.abtretungsglaeubiger.isEmpty()))?this.getAbtretungsglaeubiger():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abtretungsglaeubiger", theAbtretungsglaeubiger), currentHashCode, theAbtretungsglaeubiger, ((this.abtretungsglaeubiger!= null)&&(!this.abtretungsglaeubiger.isEmpty())));
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
        if (draftCopy instanceof CTKapitalanlage) {
            final CTKapitalanlage copy = ((CTKapitalanlage) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STKapitalanlageart sourceArtID;
                    sourceArtID = this.getArtID();
                    STKapitalanlageart copyArtID = ((STKapitalanlageart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean unterdepotnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unterdepotnummer!= null));
                if (unterdepotnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUnterdepotnummer;
                    sourceUnterdepotnummer = this.getUnterdepotnummer();
                    String copyUnterdepotnummer = ((String) strategy.copy(LocatorUtils.property(locator, "unterdepotnummer", sourceUnterdepotnummer), sourceUnterdepotnummer, (this.unterdepotnummer!= null)));
                    copy.setUnterdepotnummer(copyUnterdepotnummer);
                } else {
                    if (unterdepotnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unterdepotnummer = null;
                    }
                }
            }
            {
                Boolean waehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.waehrung!= null));
                if (waehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWaehrungsschluessel sourceWaehrung;
                    sourceWaehrung = this.getWaehrung();
                    STWaehrungsschluessel copyWaehrung = ((STWaehrungsschluessel) strategy.copy(LocatorUtils.property(locator, "waehrung", sourceWaehrung), sourceWaehrung, (this.waehrung!= null)));
                    copy.setWaehrung(copyWaehrung);
                } else {
                    if (waehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.waehrung = null;
                    }
                }
            }
            {
                Boolean datumErsteEinzahlungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datumErsteEinzahlung!= null));
                if (datumErsteEinzahlungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDatumErsteEinzahlung;
                    sourceDatumErsteEinzahlung = this.getDatumErsteEinzahlung();
                    String copyDatumErsteEinzahlung = ((String) strategy.copy(LocatorUtils.property(locator, "datumErsteEinzahlung", sourceDatumErsteEinzahlung), sourceDatumErsteEinzahlung, (this.datumErsteEinzahlung!= null)));
                    copy.setDatumErsteEinzahlung(copyDatumErsteEinzahlung);
                } else {
                    if (datumErsteEinzahlungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datumErsteEinzahlung = null;
                    }
                }
            }
            {
                Boolean abtretungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abtretung!= null));
                if (abtretungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAbtretung;
                    sourceAbtretung = this.isAbtretung();
                    Boolean copyAbtretung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "abtretung", sourceAbtretung), sourceAbtretung, (this.abtretung!= null)));
                    copy.setAbtretung(copyAbtretung);
                } else {
                    if (abtretungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abtretung = null;
                    }
                }
            }
            {
                Boolean zinsenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zinsen!= null)&&(!this.zinsen.isEmpty())));
                if (zinsenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTZinsen> sourceZinsen;
                    sourceZinsen = (((this.zinsen!= null)&&(!this.zinsen.isEmpty()))?this.getZinsen():null);
                    @SuppressWarnings("unchecked")
                    List<CTZinsen> copyZinsen = ((List<CTZinsen> ) strategy.copy(LocatorUtils.property(locator, "zinsen", sourceZinsen), sourceZinsen, ((this.zinsen!= null)&&(!this.zinsen.isEmpty()))));
                    copy.zinsen = null;
                    if (copyZinsen!= null) {
                        List<CTZinsen> uniqueZinsenl = copy.getZinsen();
                        uniqueZinsenl.addAll(copyZinsen);
                    }
                } else {
                    if (zinsenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zinsen = null;
                    }
                }
            }
            {
                Boolean vereinbarungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vereinbarung!= null)&&(!this.vereinbarung.isEmpty())));
                if (vereinbarungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVereinbarung> sourceVereinbarung;
                    sourceVereinbarung = (((this.vereinbarung!= null)&&(!this.vereinbarung.isEmpty()))?this.getVereinbarung():null);
                    @SuppressWarnings("unchecked")
                    List<CTVereinbarung> copyVereinbarung = ((List<CTVereinbarung> ) strategy.copy(LocatorUtils.property(locator, "vereinbarung", sourceVereinbarung), sourceVereinbarung, ((this.vereinbarung!= null)&&(!this.vereinbarung.isEmpty()))));
                    copy.vereinbarung = null;
                    if (copyVereinbarung!= null) {
                        List<CTVereinbarung> uniqueVereinbarungl = copy.getVereinbarung();
                        uniqueVereinbarungl.addAll(copyVereinbarung);
                    }
                } else {
                    if (vereinbarungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vereinbarung = null;
                    }
                }
            }
            {
                Boolean saldoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.saldo!= null)&&(!this.saldo.isEmpty())));
                if (saldoShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSaldo> sourceSaldo;
                    sourceSaldo = (((this.saldo!= null)&&(!this.saldo.isEmpty()))?this.getSaldo():null);
                    @SuppressWarnings("unchecked")
                    List<CTSaldo> copySaldo = ((List<CTSaldo> ) strategy.copy(LocatorUtils.property(locator, "saldo", sourceSaldo), sourceSaldo, ((this.saldo!= null)&&(!this.saldo.isEmpty()))));
                    copy.saldo = null;
                    if (copySaldo!= null) {
                        List<CTSaldo> uniqueSaldol = copy.getSaldo();
                        uniqueSaldol.addAll(copySaldo);
                    }
                } else {
                    if (saldoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.saldo = null;
                    }
                }
            }
            {
                Boolean abtretungsglaeubigerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.abtretungsglaeubiger!= null)&&(!this.abtretungsglaeubiger.isEmpty())));
                if (abtretungsglaeubigerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTAbtretungsglaeubiger> sourceAbtretungsglaeubiger;
                    sourceAbtretungsglaeubiger = (((this.abtretungsglaeubiger!= null)&&(!this.abtretungsglaeubiger.isEmpty()))?this.getAbtretungsglaeubiger():null);
                    @SuppressWarnings("unchecked")
                    List<CTAbtretungsglaeubiger> copyAbtretungsglaeubiger = ((List<CTAbtretungsglaeubiger> ) strategy.copy(LocatorUtils.property(locator, "abtretungsglaeubiger", sourceAbtretungsglaeubiger), sourceAbtretungsglaeubiger, ((this.abtretungsglaeubiger!= null)&&(!this.abtretungsglaeubiger.isEmpty()))));
                    copy.abtretungsglaeubiger = null;
                    if (copyAbtretungsglaeubiger!= null) {
                        List<CTAbtretungsglaeubiger> uniqueAbtretungsglaeubigerl = copy.getAbtretungsglaeubiger();
                        uniqueAbtretungsglaeubigerl.addAll(copyAbtretungsglaeubiger);
                    }
                } else {
                    if (abtretungsglaeubigerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abtretungsglaeubiger = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKapitalanlage();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withArtID(STKapitalanlageart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withUnterdepotnummer(String value) {
        setUnterdepotnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withDatumErsteEinzahlung(String value) {
        setDatumErsteEinzahlung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withAbtretung(Boolean value) {
        setAbtretung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withZinsen(CTZinsen... values) {
        if (values!= null) {
            for (CTZinsen value: values) {
                getZinsen().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withZinsen(Collection<CTZinsen> values) {
        if (values!= null) {
            getZinsen().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withVereinbarung(CTVereinbarung... values) {
        if (values!= null) {
            for (CTVereinbarung value: values) {
                getVereinbarung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withVereinbarung(Collection<CTVereinbarung> values) {
        if (values!= null) {
            getVereinbarung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withSaldo(CTSaldo... values) {
        if (values!= null) {
            for (CTSaldo value: values) {
                getSaldo().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withSaldo(Collection<CTSaldo> values) {
        if (values!= null) {
            getSaldo().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withAbtretungsglaeubiger(CTAbtretungsglaeubiger... values) {
        if (values!= null) {
            for (CTAbtretungsglaeubiger value: values) {
                getAbtretungsglaeubiger().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withAbtretungsglaeubiger(Collection<CTAbtretungsglaeubiger> values) {
        if (values!= null) {
            getAbtretungsglaeubiger().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTKapitalanlage withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
