
package net.bipro.namespace.partner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STKommunikationstyp;
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
 * Angaben zu Telefon, Fax, Email etc.
 * 
 * <p>Java class for CT_Kommunikationsverbindung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Kommunikationsverbindung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Kommunikationstyp"/&gt;
 *         &lt;element name="Kommunikationsadresse" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Referenz" type="{http://www.bipro.net/namespace/datentypen}ST_Referenz" minOccurs="0"/&gt;
 *         &lt;element name="Kommunikationsprovider" type="{http://www.bipro.net/namespace/datentypen}ST_Kommunikationsprovider" minOccurs="0"/&gt;
 *         &lt;element name="KommunikationsadresseURI" type="{http://www.bipro.net/namespace/datentypen}ST_KommunikationsadresseURI" minOccurs="0"/&gt;
 *         &lt;element name="Erreichbarkeit" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="BevorzugteKommunikationsverbindung" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Kommunikationsverbindung", propOrder = {
    "artID",
    "kommunikationsadresse",
    "referenz",
    "kommunikationsprovider",
    "kommunikationsadresseURI",
    "erreichbarkeit",
    "bevorzugteKommunikationsverbindung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTKommunikationsverbindung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STKommunikationstyp artID;
    @XmlElement(name = "Kommunikationsadresse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kommunikationsadresse;
    @XmlElement(name = "Referenz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String referenz;
    @XmlList
    @XmlElement(name = "Kommunikationsprovider")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<String> kommunikationsprovider;
    @XmlElement(name = "KommunikationsadresseURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kommunikationsadresseURI;
    @XmlElement(name = "Erreichbarkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String erreichbarkeit;
    @XmlElement(name = "BevorzugteKommunikationsverbindung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean bevorzugteKommunikationsverbindung;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STKommunikationstyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STKommunikationstyp getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STKommunikationstyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STKommunikationstyp value) {
        this.artID = value;
    }

    /**
     * Gets the value of the kommunikationsadresse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKommunikationsadresse() {
        return kommunikationsadresse;
    }

    /**
     * Sets the value of the kommunikationsadresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKommunikationsadresse(String value) {
        this.kommunikationsadresse = value;
    }

    /**
     * Gets the value of the referenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getReferenz() {
        return referenz;
    }

    /**
     * Sets the value of the referenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setReferenz(String value) {
        this.referenz = value;
    }

    /**
     * Gets the value of the kommunikationsprovider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kommunikationsprovider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommunikationsprovider().add(newItem);
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
    public List<String> getKommunikationsprovider() {
        if (kommunikationsprovider == null) {
            kommunikationsprovider = new ArrayList<String>();
        }
        return this.kommunikationsprovider;
    }

    /**
     * Gets the value of the kommunikationsadresseURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKommunikationsadresseURI() {
        return kommunikationsadresseURI;
    }

    /**
     * Sets the value of the kommunikationsadresseURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKommunikationsadresseURI(String value) {
        this.kommunikationsadresseURI = value;
    }

    /**
     * Gets the value of the erreichbarkeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getErreichbarkeit() {
        return erreichbarkeit;
    }

    /**
     * Sets the value of the erreichbarkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setErreichbarkeit(String value) {
        this.erreichbarkeit = value;
    }

    /**
     * Gets the value of the bevorzugteKommunikationsverbindung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isBevorzugteKommunikationsverbindung() {
        return bevorzugteKommunikationsverbindung;
    }

    /**
     * Sets the value of the bevorzugteKommunikationsverbindung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBevorzugteKommunikationsverbindung(Boolean value) {
        this.bevorzugteKommunikationsverbindung = value;
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
        final CTKommunikationsverbindung that = ((CTKommunikationsverbindung) object);
        {
            STKommunikationstyp lhsArtID;
            lhsArtID = this.getArtID();
            STKommunikationstyp rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsKommunikationsadresse;
            lhsKommunikationsadresse = this.getKommunikationsadresse();
            String rhsKommunikationsadresse;
            rhsKommunikationsadresse = that.getKommunikationsadresse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kommunikationsadresse", lhsKommunikationsadresse), LocatorUtils.property(thatLocator, "kommunikationsadresse", rhsKommunikationsadresse), lhsKommunikationsadresse, rhsKommunikationsadresse, (this.kommunikationsadresse!= null), (that.kommunikationsadresse!= null))) {
                return false;
            }
        }
        {
            String lhsReferenz;
            lhsReferenz = this.getReferenz();
            String rhsReferenz;
            rhsReferenz = that.getReferenz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenz", lhsReferenz), LocatorUtils.property(thatLocator, "referenz", rhsReferenz), lhsReferenz, rhsReferenz, (this.referenz!= null), (that.referenz!= null))) {
                return false;
            }
        }
        {
            List<String> lhsKommunikationsprovider;
            lhsKommunikationsprovider = (((this.kommunikationsprovider!= null)&&(!this.kommunikationsprovider.isEmpty()))?this.getKommunikationsprovider():null);
            List<String> rhsKommunikationsprovider;
            rhsKommunikationsprovider = (((that.kommunikationsprovider!= null)&&(!that.kommunikationsprovider.isEmpty()))?that.getKommunikationsprovider():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kommunikationsprovider", lhsKommunikationsprovider), LocatorUtils.property(thatLocator, "kommunikationsprovider", rhsKommunikationsprovider), lhsKommunikationsprovider, rhsKommunikationsprovider, ((this.kommunikationsprovider!= null)&&(!this.kommunikationsprovider.isEmpty())), ((that.kommunikationsprovider!= null)&&(!that.kommunikationsprovider.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsKommunikationsadresseURI;
            lhsKommunikationsadresseURI = this.getKommunikationsadresseURI();
            String rhsKommunikationsadresseURI;
            rhsKommunikationsadresseURI = that.getKommunikationsadresseURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kommunikationsadresseURI", lhsKommunikationsadresseURI), LocatorUtils.property(thatLocator, "kommunikationsadresseURI", rhsKommunikationsadresseURI), lhsKommunikationsadresseURI, rhsKommunikationsadresseURI, (this.kommunikationsadresseURI!= null), (that.kommunikationsadresseURI!= null))) {
                return false;
            }
        }
        {
            String lhsErreichbarkeit;
            lhsErreichbarkeit = this.getErreichbarkeit();
            String rhsErreichbarkeit;
            rhsErreichbarkeit = that.getErreichbarkeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erreichbarkeit", lhsErreichbarkeit), LocatorUtils.property(thatLocator, "erreichbarkeit", rhsErreichbarkeit), lhsErreichbarkeit, rhsErreichbarkeit, (this.erreichbarkeit!= null), (that.erreichbarkeit!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBevorzugteKommunikationsverbindung;
            lhsBevorzugteKommunikationsverbindung = this.isBevorzugteKommunikationsverbindung();
            Boolean rhsBevorzugteKommunikationsverbindung;
            rhsBevorzugteKommunikationsverbindung = that.isBevorzugteKommunikationsverbindung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bevorzugteKommunikationsverbindung", lhsBevorzugteKommunikationsverbindung), LocatorUtils.property(thatLocator, "bevorzugteKommunikationsverbindung", rhsBevorzugteKommunikationsverbindung), lhsBevorzugteKommunikationsverbindung, rhsBevorzugteKommunikationsverbindung, (this.bevorzugteKommunikationsverbindung!= null), (that.bevorzugteKommunikationsverbindung!= null))) {
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
            STKommunikationstyp theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theKommunikationsadresse;
            theKommunikationsadresse = this.getKommunikationsadresse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kommunikationsadresse", theKommunikationsadresse), currentHashCode, theKommunikationsadresse, (this.kommunikationsadresse!= null));
        }
        {
            String theReferenz;
            theReferenz = this.getReferenz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenz", theReferenz), currentHashCode, theReferenz, (this.referenz!= null));
        }
        {
            List<String> theKommunikationsprovider;
            theKommunikationsprovider = (((this.kommunikationsprovider!= null)&&(!this.kommunikationsprovider.isEmpty()))?this.getKommunikationsprovider():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kommunikationsprovider", theKommunikationsprovider), currentHashCode, theKommunikationsprovider, ((this.kommunikationsprovider!= null)&&(!this.kommunikationsprovider.isEmpty())));
        }
        {
            String theKommunikationsadresseURI;
            theKommunikationsadresseURI = this.getKommunikationsadresseURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kommunikationsadresseURI", theKommunikationsadresseURI), currentHashCode, theKommunikationsadresseURI, (this.kommunikationsadresseURI!= null));
        }
        {
            String theErreichbarkeit;
            theErreichbarkeit = this.getErreichbarkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erreichbarkeit", theErreichbarkeit), currentHashCode, theErreichbarkeit, (this.erreichbarkeit!= null));
        }
        {
            Boolean theBevorzugteKommunikationsverbindung;
            theBevorzugteKommunikationsverbindung = this.isBevorzugteKommunikationsverbindung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bevorzugteKommunikationsverbindung", theBevorzugteKommunikationsverbindung), currentHashCode, theBevorzugteKommunikationsverbindung, (this.bevorzugteKommunikationsverbindung!= null));
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
        if (draftCopy instanceof CTKommunikationsverbindung) {
            final CTKommunikationsverbindung copy = ((CTKommunikationsverbindung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STKommunikationstyp sourceArtID;
                    sourceArtID = this.getArtID();
                    STKommunikationstyp copyArtID = ((STKommunikationstyp) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean kommunikationsadresseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kommunikationsadresse!= null));
                if (kommunikationsadresseShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKommunikationsadresse;
                    sourceKommunikationsadresse = this.getKommunikationsadresse();
                    String copyKommunikationsadresse = ((String) strategy.copy(LocatorUtils.property(locator, "kommunikationsadresse", sourceKommunikationsadresse), sourceKommunikationsadresse, (this.kommunikationsadresse!= null)));
                    copy.setKommunikationsadresse(copyKommunikationsadresse);
                } else {
                    if (kommunikationsadresseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kommunikationsadresse = null;
                    }
                }
            }
            {
                Boolean referenzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referenz!= null));
                if (referenzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReferenz;
                    sourceReferenz = this.getReferenz();
                    String copyReferenz = ((String) strategy.copy(LocatorUtils.property(locator, "referenz", sourceReferenz), sourceReferenz, (this.referenz!= null)));
                    copy.setReferenz(copyReferenz);
                } else {
                    if (referenzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenz = null;
                    }
                }
            }
            {
                Boolean kommunikationsproviderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.kommunikationsprovider!= null)&&(!this.kommunikationsprovider.isEmpty())));
                if (kommunikationsproviderShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceKommunikationsprovider;
                    sourceKommunikationsprovider = (((this.kommunikationsprovider!= null)&&(!this.kommunikationsprovider.isEmpty()))?this.getKommunikationsprovider():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyKommunikationsprovider = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "kommunikationsprovider", sourceKommunikationsprovider), sourceKommunikationsprovider, ((this.kommunikationsprovider!= null)&&(!this.kommunikationsprovider.isEmpty()))));
                    copy.kommunikationsprovider = null;
                    if (copyKommunikationsprovider!= null) {
                        List<String> uniqueKommunikationsproviderl = copy.getKommunikationsprovider();
                        uniqueKommunikationsproviderl.addAll(copyKommunikationsprovider);
                    }
                } else {
                    if (kommunikationsproviderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kommunikationsprovider = null;
                    }
                }
            }
            {
                Boolean kommunikationsadresseURIShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kommunikationsadresseURI!= null));
                if (kommunikationsadresseURIShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKommunikationsadresseURI;
                    sourceKommunikationsadresseURI = this.getKommunikationsadresseURI();
                    String copyKommunikationsadresseURI = ((String) strategy.copy(LocatorUtils.property(locator, "kommunikationsadresseURI", sourceKommunikationsadresseURI), sourceKommunikationsadresseURI, (this.kommunikationsadresseURI!= null)));
                    copy.setKommunikationsadresseURI(copyKommunikationsadresseURI);
                } else {
                    if (kommunikationsadresseURIShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kommunikationsadresseURI = null;
                    }
                }
            }
            {
                Boolean erreichbarkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erreichbarkeit!= null));
                if (erreichbarkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErreichbarkeit;
                    sourceErreichbarkeit = this.getErreichbarkeit();
                    String copyErreichbarkeit = ((String) strategy.copy(LocatorUtils.property(locator, "erreichbarkeit", sourceErreichbarkeit), sourceErreichbarkeit, (this.erreichbarkeit!= null)));
                    copy.setErreichbarkeit(copyErreichbarkeit);
                } else {
                    if (erreichbarkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erreichbarkeit = null;
                    }
                }
            }
            {
                Boolean bevorzugteKommunikationsverbindungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bevorzugteKommunikationsverbindung!= null));
                if (bevorzugteKommunikationsverbindungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBevorzugteKommunikationsverbindung;
                    sourceBevorzugteKommunikationsverbindung = this.isBevorzugteKommunikationsverbindung();
                    Boolean copyBevorzugteKommunikationsverbindung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bevorzugteKommunikationsverbindung", sourceBevorzugteKommunikationsverbindung), sourceBevorzugteKommunikationsverbindung, (this.bevorzugteKommunikationsverbindung!= null)));
                    copy.setBevorzugteKommunikationsverbindung(copyBevorzugteKommunikationsverbindung);
                } else {
                    if (bevorzugteKommunikationsverbindungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bevorzugteKommunikationsverbindung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKommunikationsverbindung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withArtID(STKommunikationstyp value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withKommunikationsadresse(String value) {
        setKommunikationsadresse(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withKommunikationsprovider(String... values) {
        if (values!= null) {
            for (String value: values) {
                getKommunikationsprovider().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withKommunikationsprovider(Collection<String> values) {
        if (values!= null) {
            getKommunikationsprovider().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withKommunikationsadresseURI(String value) {
        setKommunikationsadresseURI(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withErreichbarkeit(String value) {
        setErreichbarkeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withBevorzugteKommunikationsverbindung(Boolean value) {
        setBevorzugteKommunikationsverbindung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKommunikationsverbindung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
