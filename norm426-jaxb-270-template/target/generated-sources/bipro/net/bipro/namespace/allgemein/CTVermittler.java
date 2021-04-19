
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
import net.bipro.namespace.datentypen.STVermittlerart;
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
 * Daten des fuer den Geschaeftsvorgang verantwortlichen Vermittlers.
 * 
 * <p>Java class for CT_Vermittler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Vermittler"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vermittlernummer" type="{http://www.bipro.net/namespace/datentypen}ST_Vermittlernummer" minOccurs="0"/&gt;
 *         &lt;element name="VermittlernummerVM" type="{http://www.bipro.net/namespace/datentypen}ST_Vermittlernummer" minOccurs="0"/&gt;
 *         &lt;element name="PartnerID" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *         &lt;element name="IHKRegistrierungsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Art" type="{http://www.bipro.net/namespace/datentypen}ST_Vermittlerart" minOccurs="0"/&gt;
 *         &lt;element name="Vermittlerrolle" type="{http://www.bipro.net/namespace/allgemein}CT_Vermittlerrolle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vermittler" type="{http://www.bipro.net/namespace/allgemein}CT_Vermittler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vertriebskanal" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Vermittler", propOrder = {
    "vermittlernummer",
    "vermittlernummerVM",
    "partnerID",
    "ihkRegistrierungsnummer",
    "art",
    "vermittlerrolle",
    "vermittler",
    "vertriebskanal"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTVermittler
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Vermittlernummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String vermittlernummer;
    @XmlElement(name = "VermittlernummerVM")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String vermittlernummerVM;
    @XmlElement(name = "PartnerID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String partnerID;
    @XmlElement(name = "IHKRegistrierungsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String ihkRegistrierungsnummer;
    @XmlElement(name = "Art")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STVermittlerart art;
    @XmlElement(name = "Vermittlerrolle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTVermittlerrolle> vermittlerrolle;
    @XmlElement(name = "Vermittler")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTVermittler> vermittler;
    @XmlElement(name = "Vertriebskanal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String vertriebskanal;

    /**
     * Gets the value of the vermittlernummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVermittlernummer() {
        return vermittlernummer;
    }

    /**
     * Sets the value of the vermittlernummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVermittlernummer(String value) {
        this.vermittlernummer = value;
    }

    /**
     * Gets the value of the vermittlernummerVM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVermittlernummerVM() {
        return vermittlernummerVM;
    }

    /**
     * Sets the value of the vermittlernummerVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVermittlernummerVM(String value) {
        this.vermittlernummerVM = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the ihkRegistrierungsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getIHKRegistrierungsnummer() {
        return ihkRegistrierungsnummer;
    }

    /**
     * Sets the value of the ihkRegistrierungsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setIHKRegistrierungsnummer(String value) {
        this.ihkRegistrierungsnummer = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link STVermittlerart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STVermittlerart getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVermittlerart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArt(STVermittlerart value) {
        this.art = value;
    }

    /**
     * Gets the value of the vermittlerrolle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vermittlerrolle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVermittlerrolle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVermittlerrolle }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTVermittlerrolle> getVermittlerrolle() {
        if (vermittlerrolle == null) {
            vermittlerrolle = new ArrayList<CTVermittlerrolle>();
        }
        return this.vermittlerrolle;
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
     * Gets the value of the vertriebskanal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVertriebskanal() {
        return vertriebskanal;
    }

    /**
     * Sets the value of the vertriebskanal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVertriebskanal(String value) {
        this.vertriebskanal = value;
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
        final CTVermittler that = ((CTVermittler) object);
        {
            String lhsVermittlernummer;
            lhsVermittlernummer = this.getVermittlernummer();
            String rhsVermittlernummer;
            rhsVermittlernummer = that.getVermittlernummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittlernummer", lhsVermittlernummer), LocatorUtils.property(thatLocator, "vermittlernummer", rhsVermittlernummer), lhsVermittlernummer, rhsVermittlernummer, (this.vermittlernummer!= null), (that.vermittlernummer!= null))) {
                return false;
            }
        }
        {
            String lhsVermittlernummerVM;
            lhsVermittlernummerVM = this.getVermittlernummerVM();
            String rhsVermittlernummerVM;
            rhsVermittlernummerVM = that.getVermittlernummerVM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittlernummerVM", lhsVermittlernummerVM), LocatorUtils.property(thatLocator, "vermittlernummerVM", rhsVermittlernummerVM), lhsVermittlernummerVM, rhsVermittlernummerVM, (this.vermittlernummerVM!= null), (that.vermittlernummerVM!= null))) {
                return false;
            }
        }
        {
            String lhsPartnerID;
            lhsPartnerID = this.getPartnerID();
            String rhsPartnerID;
            rhsPartnerID = that.getPartnerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerID", lhsPartnerID), LocatorUtils.property(thatLocator, "partnerID", rhsPartnerID), lhsPartnerID, rhsPartnerID, (this.partnerID!= null), (that.partnerID!= null))) {
                return false;
            }
        }
        {
            String lhsIHKRegistrierungsnummer;
            lhsIHKRegistrierungsnummer = this.getIHKRegistrierungsnummer();
            String rhsIHKRegistrierungsnummer;
            rhsIHKRegistrierungsnummer = that.getIHKRegistrierungsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ihkRegistrierungsnummer", lhsIHKRegistrierungsnummer), LocatorUtils.property(thatLocator, "ihkRegistrierungsnummer", rhsIHKRegistrierungsnummer), lhsIHKRegistrierungsnummer, rhsIHKRegistrierungsnummer, (this.ihkRegistrierungsnummer!= null), (that.ihkRegistrierungsnummer!= null))) {
                return false;
            }
        }
        {
            STVermittlerart lhsArt;
            lhsArt = this.getArt();
            STVermittlerart rhsArt;
            rhsArt = that.getArt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "art", lhsArt), LocatorUtils.property(thatLocator, "art", rhsArt), lhsArt, rhsArt, (this.art!= null), (that.art!= null))) {
                return false;
            }
        }
        {
            List<CTVermittlerrolle> lhsVermittlerrolle;
            lhsVermittlerrolle = (((this.vermittlerrolle!= null)&&(!this.vermittlerrolle.isEmpty()))?this.getVermittlerrolle():null);
            List<CTVermittlerrolle> rhsVermittlerrolle;
            rhsVermittlerrolle = (((that.vermittlerrolle!= null)&&(!that.vermittlerrolle.isEmpty()))?that.getVermittlerrolle():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermittlerrolle", lhsVermittlerrolle), LocatorUtils.property(thatLocator, "vermittlerrolle", rhsVermittlerrolle), lhsVermittlerrolle, rhsVermittlerrolle, ((this.vermittlerrolle!= null)&&(!this.vermittlerrolle.isEmpty())), ((that.vermittlerrolle!= null)&&(!that.vermittlerrolle.isEmpty())))) {
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
            String lhsVertriebskanal;
            lhsVertriebskanal = this.getVertriebskanal();
            String rhsVertriebskanal;
            rhsVertriebskanal = that.getVertriebskanal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertriebskanal", lhsVertriebskanal), LocatorUtils.property(thatLocator, "vertriebskanal", rhsVertriebskanal), lhsVertriebskanal, rhsVertriebskanal, (this.vertriebskanal!= null), (that.vertriebskanal!= null))) {
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
            String theVermittlernummer;
            theVermittlernummer = this.getVermittlernummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittlernummer", theVermittlernummer), currentHashCode, theVermittlernummer, (this.vermittlernummer!= null));
        }
        {
            String theVermittlernummerVM;
            theVermittlernummerVM = this.getVermittlernummerVM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittlernummerVM", theVermittlernummerVM), currentHashCode, theVermittlernummerVM, (this.vermittlernummerVM!= null));
        }
        {
            String thePartnerID;
            thePartnerID = this.getPartnerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerID", thePartnerID), currentHashCode, thePartnerID, (this.partnerID!= null));
        }
        {
            String theIHKRegistrierungsnummer;
            theIHKRegistrierungsnummer = this.getIHKRegistrierungsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ihkRegistrierungsnummer", theIHKRegistrierungsnummer), currentHashCode, theIHKRegistrierungsnummer, (this.ihkRegistrierungsnummer!= null));
        }
        {
            STVermittlerart theArt;
            theArt = this.getArt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "art", theArt), currentHashCode, theArt, (this.art!= null));
        }
        {
            List<CTVermittlerrolle> theVermittlerrolle;
            theVermittlerrolle = (((this.vermittlerrolle!= null)&&(!this.vermittlerrolle.isEmpty()))?this.getVermittlerrolle():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittlerrolle", theVermittlerrolle), currentHashCode, theVermittlerrolle, ((this.vermittlerrolle!= null)&&(!this.vermittlerrolle.isEmpty())));
        }
        {
            List<CTVermittler> theVermittler;
            theVermittler = (((this.vermittler!= null)&&(!this.vermittler.isEmpty()))?this.getVermittler():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermittler", theVermittler), currentHashCode, theVermittler, ((this.vermittler!= null)&&(!this.vermittler.isEmpty())));
        }
        {
            String theVertriebskanal;
            theVertriebskanal = this.getVertriebskanal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertriebskanal", theVertriebskanal), currentHashCode, theVertriebskanal, (this.vertriebskanal!= null));
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
        if (draftCopy instanceof CTVermittler) {
            final CTVermittler copy = ((CTVermittler) draftCopy);
            {
                Boolean vermittlernummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermittlernummer!= null));
                if (vermittlernummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVermittlernummer;
                    sourceVermittlernummer = this.getVermittlernummer();
                    String copyVermittlernummer = ((String) strategy.copy(LocatorUtils.property(locator, "vermittlernummer", sourceVermittlernummer), sourceVermittlernummer, (this.vermittlernummer!= null)));
                    copy.setVermittlernummer(copyVermittlernummer);
                } else {
                    if (vermittlernummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittlernummer = null;
                    }
                }
            }
            {
                Boolean vermittlernummerVMShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermittlernummerVM!= null));
                if (vermittlernummerVMShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVermittlernummerVM;
                    sourceVermittlernummerVM = this.getVermittlernummerVM();
                    String copyVermittlernummerVM = ((String) strategy.copy(LocatorUtils.property(locator, "vermittlernummerVM", sourceVermittlernummerVM), sourceVermittlernummerVM, (this.vermittlernummerVM!= null)));
                    copy.setVermittlernummerVM(copyVermittlernummerVM);
                } else {
                    if (vermittlernummerVMShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittlernummerVM = null;
                    }
                }
            }
            {
                Boolean partnerIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partnerID!= null));
                if (partnerIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePartnerID;
                    sourcePartnerID = this.getPartnerID();
                    String copyPartnerID = ((String) strategy.copy(LocatorUtils.property(locator, "partnerID", sourcePartnerID), sourcePartnerID, (this.partnerID!= null)));
                    copy.setPartnerID(copyPartnerID);
                } else {
                    if (partnerIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnerID = null;
                    }
                }
            }
            {
                Boolean ihkRegistrierungsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ihkRegistrierungsnummer!= null));
                if (ihkRegistrierungsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIHKRegistrierungsnummer;
                    sourceIHKRegistrierungsnummer = this.getIHKRegistrierungsnummer();
                    String copyIHKRegistrierungsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "ihkRegistrierungsnummer", sourceIHKRegistrierungsnummer), sourceIHKRegistrierungsnummer, (this.ihkRegistrierungsnummer!= null)));
                    copy.setIHKRegistrierungsnummer(copyIHKRegistrierungsnummer);
                } else {
                    if (ihkRegistrierungsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ihkRegistrierungsnummer = null;
                    }
                }
            }
            {
                Boolean artShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.art!= null));
                if (artShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVermittlerart sourceArt;
                    sourceArt = this.getArt();
                    STVermittlerart copyArt = ((STVermittlerart) strategy.copy(LocatorUtils.property(locator, "art", sourceArt), sourceArt, (this.art!= null)));
                    copy.setArt(copyArt);
                } else {
                    if (artShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.art = null;
                    }
                }
            }
            {
                Boolean vermittlerrolleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vermittlerrolle!= null)&&(!this.vermittlerrolle.isEmpty())));
                if (vermittlerrolleShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVermittlerrolle> sourceVermittlerrolle;
                    sourceVermittlerrolle = (((this.vermittlerrolle!= null)&&(!this.vermittlerrolle.isEmpty()))?this.getVermittlerrolle():null);
                    @SuppressWarnings("unchecked")
                    List<CTVermittlerrolle> copyVermittlerrolle = ((List<CTVermittlerrolle> ) strategy.copy(LocatorUtils.property(locator, "vermittlerrolle", sourceVermittlerrolle), sourceVermittlerrolle, ((this.vermittlerrolle!= null)&&(!this.vermittlerrolle.isEmpty()))));
                    copy.vermittlerrolle = null;
                    if (copyVermittlerrolle!= null) {
                        List<CTVermittlerrolle> uniqueVermittlerrollel = copy.getVermittlerrolle();
                        uniqueVermittlerrollel.addAll(copyVermittlerrolle);
                    }
                } else {
                    if (vermittlerrolleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermittlerrolle = null;
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
                Boolean vertriebskanalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vertriebskanal!= null));
                if (vertriebskanalShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVertriebskanal;
                    sourceVertriebskanal = this.getVertriebskanal();
                    String copyVertriebskanal = ((String) strategy.copy(LocatorUtils.property(locator, "vertriebskanal", sourceVertriebskanal), sourceVertriebskanal, (this.vertriebskanal!= null)));
                    copy.setVertriebskanal(copyVertriebskanal);
                } else {
                    if (vertriebskanalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertriebskanal = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVermittler();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withVermittlernummer(String value) {
        setVermittlernummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withVermittlernummerVM(String value) {
        setVermittlernummerVM(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withIHKRegistrierungsnummer(String value) {
        setIHKRegistrierungsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withArt(STVermittlerart value) {
        setArt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withVermittlerrolle(CTVermittlerrolle... values) {
        if (values!= null) {
            for (CTVermittlerrolle value: values) {
                getVermittlerrolle().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withVermittlerrolle(Collection<CTVermittlerrolle> values) {
        if (values!= null) {
            getVermittlerrolle().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withVermittler(CTVermittler... values) {
        if (values!= null) {
            for (CTVermittler value: values) {
                getVermittler().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withVermittler(Collection<CTVermittler> values) {
        if (values!= null) {
            getVermittler().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withVertriebskanal(String value) {
        setVertriebskanal(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVermittler withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
