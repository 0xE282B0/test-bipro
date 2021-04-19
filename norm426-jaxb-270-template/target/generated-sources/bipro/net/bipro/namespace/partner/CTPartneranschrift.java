
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTAdresse;
import net.bipro.namespace.allgemein.CTGeoposition;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAdresstyp;
import net.bipro.namespace.datentypen.STAnschriftart;
import net.bipro.namespace.datentypen.STLaenderkennzeichen;
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
 * Anschrift eines Partners.
 * 
 * <p>Java class for CT_Partneranschrift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Partneranschrift"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Adresse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Anschriftart" minOccurs="0"/&gt;
 *         &lt;element name="Postfach" type="{http://www.bipro.net/namespace/datentypen}ST_Postfach" minOccurs="0"/&gt;
 *         &lt;element name="Adresszusatz" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Adresstyp" type="{http://www.bipro.net/namespace/datentypen}ST_Adresstyp" minOccurs="0"/&gt;
 *         &lt;element name="BevorzugteKorrespondenzanschrift" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Partneranschrift", propOrder = {
    "artID",
    "postfach",
    "adresszusatz",
    "adresstyp",
    "bevorzugteKorrespondenzanschrift"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTPartneranschrift
    extends CTAdresse
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAnschriftart artID;
    @XmlElement(name = "Postfach")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String postfach;
    @XmlElement(name = "Adresszusatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String adresszusatz;
    @XmlElement(name = "Adresstyp")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STAdresstyp adresstyp;
    @XmlElement(name = "BevorzugteKorrespondenzanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean bevorzugteKorrespondenzanschrift;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STAnschriftart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAnschriftart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAnschriftart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STAnschriftart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the postfach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPostfach() {
        return postfach;
    }

    /**
     * Sets the value of the postfach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPostfach(String value) {
        this.postfach = value;
    }

    /**
     * Gets the value of the adresszusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAdresszusatz() {
        return adresszusatz;
    }

    /**
     * Sets the value of the adresszusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAdresszusatz(String value) {
        this.adresszusatz = value;
    }

    /**
     * Gets the value of the adresstyp property.
     * 
     * @return
     *     possible object is
     *     {@link STAdresstyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STAdresstyp getAdresstyp() {
        return adresstyp;
    }

    /**
     * Sets the value of the adresstyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAdresstyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAdresstyp(STAdresstyp value) {
        this.adresstyp = value;
    }

    /**
     * Gets the value of the bevorzugteKorrespondenzanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isBevorzugteKorrespondenzanschrift() {
        return bevorzugteKorrespondenzanschrift;
    }

    /**
     * Sets the value of the bevorzugteKorrespondenzanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBevorzugteKorrespondenzanschrift(Boolean value) {
        this.bevorzugteKorrespondenzanschrift = value;
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
        final CTPartneranschrift that = ((CTPartneranschrift) object);
        {
            STAnschriftart lhsArtID;
            lhsArtID = this.getArtID();
            STAnschriftart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsPostfach;
            lhsPostfach = this.getPostfach();
            String rhsPostfach;
            rhsPostfach = that.getPostfach();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postfach", lhsPostfach), LocatorUtils.property(thatLocator, "postfach", rhsPostfach), lhsPostfach, rhsPostfach, (this.postfach!= null), (that.postfach!= null))) {
                return false;
            }
        }
        {
            String lhsAdresszusatz;
            lhsAdresszusatz = this.getAdresszusatz();
            String rhsAdresszusatz;
            rhsAdresszusatz = that.getAdresszusatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adresszusatz", lhsAdresszusatz), LocatorUtils.property(thatLocator, "adresszusatz", rhsAdresszusatz), lhsAdresszusatz, rhsAdresszusatz, (this.adresszusatz!= null), (that.adresszusatz!= null))) {
                return false;
            }
        }
        {
            STAdresstyp lhsAdresstyp;
            lhsAdresstyp = this.getAdresstyp();
            STAdresstyp rhsAdresstyp;
            rhsAdresstyp = that.getAdresstyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adresstyp", lhsAdresstyp), LocatorUtils.property(thatLocator, "adresstyp", rhsAdresstyp), lhsAdresstyp, rhsAdresstyp, (this.adresstyp!= null), (that.adresstyp!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBevorzugteKorrespondenzanschrift;
            lhsBevorzugteKorrespondenzanschrift = this.isBevorzugteKorrespondenzanschrift();
            Boolean rhsBevorzugteKorrespondenzanschrift;
            rhsBevorzugteKorrespondenzanschrift = that.isBevorzugteKorrespondenzanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bevorzugteKorrespondenzanschrift", lhsBevorzugteKorrespondenzanschrift), LocatorUtils.property(thatLocator, "bevorzugteKorrespondenzanschrift", rhsBevorzugteKorrespondenzanschrift), lhsBevorzugteKorrespondenzanschrift, rhsBevorzugteKorrespondenzanschrift, (this.bevorzugteKorrespondenzanschrift!= null), (that.bevorzugteKorrespondenzanschrift!= null))) {
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
            STAnschriftart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String thePostfach;
            thePostfach = this.getPostfach();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postfach", thePostfach), currentHashCode, thePostfach, (this.postfach!= null));
        }
        {
            String theAdresszusatz;
            theAdresszusatz = this.getAdresszusatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adresszusatz", theAdresszusatz), currentHashCode, theAdresszusatz, (this.adresszusatz!= null));
        }
        {
            STAdresstyp theAdresstyp;
            theAdresstyp = this.getAdresstyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adresstyp", theAdresstyp), currentHashCode, theAdresstyp, (this.adresstyp!= null));
        }
        {
            Boolean theBevorzugteKorrespondenzanschrift;
            theBevorzugteKorrespondenzanschrift = this.isBevorzugteKorrespondenzanschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bevorzugteKorrespondenzanschrift", theBevorzugteKorrespondenzanschrift), currentHashCode, theBevorzugteKorrespondenzanschrift, (this.bevorzugteKorrespondenzanschrift!= null));
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
        if (draftCopy instanceof CTPartneranschrift) {
            final CTPartneranschrift copy = ((CTPartneranschrift) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAnschriftart sourceArtID;
                    sourceArtID = this.getArtID();
                    STAnschriftart copyArtID = ((STAnschriftart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean postfachShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postfach!= null));
                if (postfachShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostfach;
                    sourcePostfach = this.getPostfach();
                    String copyPostfach = ((String) strategy.copy(LocatorUtils.property(locator, "postfach", sourcePostfach), sourcePostfach, (this.postfach!= null)));
                    copy.setPostfach(copyPostfach);
                } else {
                    if (postfachShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postfach = null;
                    }
                }
            }
            {
                Boolean adresszusatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adresszusatz!= null));
                if (adresszusatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAdresszusatz;
                    sourceAdresszusatz = this.getAdresszusatz();
                    String copyAdresszusatz = ((String) strategy.copy(LocatorUtils.property(locator, "adresszusatz", sourceAdresszusatz), sourceAdresszusatz, (this.adresszusatz!= null)));
                    copy.setAdresszusatz(copyAdresszusatz);
                } else {
                    if (adresszusatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adresszusatz = null;
                    }
                }
            }
            {
                Boolean adresstypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.adresstyp!= null));
                if (adresstypShouldBeCopiedAndSet == Boolean.TRUE) {
                    STAdresstyp sourceAdresstyp;
                    sourceAdresstyp = this.getAdresstyp();
                    STAdresstyp copyAdresstyp = ((STAdresstyp) strategy.copy(LocatorUtils.property(locator, "adresstyp", sourceAdresstyp), sourceAdresstyp, (this.adresstyp!= null)));
                    copy.setAdresstyp(copyAdresstyp);
                } else {
                    if (adresstypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.adresstyp = null;
                    }
                }
            }
            {
                Boolean bevorzugteKorrespondenzanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bevorzugteKorrespondenzanschrift!= null));
                if (bevorzugteKorrespondenzanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBevorzugteKorrespondenzanschrift;
                    sourceBevorzugteKorrespondenzanschrift = this.isBevorzugteKorrespondenzanschrift();
                    Boolean copyBevorzugteKorrespondenzanschrift = ((Boolean) strategy.copy(LocatorUtils.property(locator, "bevorzugteKorrespondenzanschrift", sourceBevorzugteKorrespondenzanschrift), sourceBevorzugteKorrespondenzanschrift, (this.bevorzugteKorrespondenzanschrift!= null)));
                    copy.setBevorzugteKorrespondenzanschrift(copyBevorzugteKorrespondenzanschrift);
                } else {
                    if (bevorzugteKorrespondenzanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bevorzugteKorrespondenzanschrift = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTPartneranschrift();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withArtID(STAnschriftart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withPostfach(String value) {
        setPostfach(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withAdresszusatz(String value) {
        setAdresszusatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withAdresstyp(STAdresstyp value) {
        setAdresstyp(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withBevorzugteKorrespondenzanschrift(Boolean value) {
        setBevorzugteKorrespondenzanschrift(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withStrasse(String value) {
        setStrasse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withHausnummer(String value) {
        setHausnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withPostleitzahl(String value) {
        setPostleitzahl(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withOrt(String value) {
        setOrt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withLand(STLaenderkennzeichen value) {
        setLand(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withLandname(String value) {
        setLandname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withOrtsteil(String value) {
        setOrtsteil(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withGeoposition(CTGeoposition value) {
        setGeoposition(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartneranschrift withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
