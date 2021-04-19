
package net.bipro.namespace.allgemein;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STUnternehmensnummernart;
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
 * Daten eines produktgebenden Unternehmens, z.B. Versicherungsunternehmen, Kapitalanlageunternehmen, Bausparunternehmen, gesetzlicher Krankenversicherer.
 * 
 * <p>Java class for CT_Unternehmen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Unternehmen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nummer" type="{http://www.bipro.net/namespace/datentypen}ST_Unternehmensnummer" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Ort" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Geschaeftsstelle" type="{http://www.bipro.net/namespace/datentypen}ST_Geschaeftsstellennummer" minOccurs="0"/&gt;
 *         &lt;element name="Nummernart" type="{http://www.bipro.net/namespace/datentypen}ST_Unternehmensnummernart" minOccurs="0"/&gt;
 *         &lt;element name="PartnerID" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Unternehmen", propOrder = {
    "nummer",
    "name",
    "ort",
    "geschaeftsstelle",
    "nummernart",
    "partnerID"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTUnternehmen
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Nummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String nummer;
    @XmlElement(name = "Name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String name;
    @XmlElement(name = "Ort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String ort;
    @XmlElement(name = "Geschaeftsstelle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String geschaeftsstelle;
    @XmlElement(name = "Nummernart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STUnternehmensnummernart nummernart;
    @XmlElement(name = "PartnerID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String partnerID;

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the geschaeftsstelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGeschaeftsstelle() {
        return geschaeftsstelle;
    }

    /**
     * Sets the value of the geschaeftsstelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGeschaeftsstelle(String value) {
        this.geschaeftsstelle = value;
    }

    /**
     * Gets the value of the nummernart property.
     * 
     * @return
     *     possible object is
     *     {@link STUnternehmensnummernart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STUnternehmensnummernart getNummernart() {
        return nummernart;
    }

    /**
     * Sets the value of the nummernart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STUnternehmensnummernart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNummernart(STUnternehmensnummernart value) {
        this.nummernart = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPartnerID(String value) {
        this.partnerID = value;
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
        final CTUnternehmen that = ((CTUnternehmen) object);
        {
            String lhsNummer;
            lhsNummer = this.getNummer();
            String rhsNummer;
            rhsNummer = that.getNummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nummer", lhsNummer), LocatorUtils.property(thatLocator, "nummer", rhsNummer), lhsNummer, rhsNummer, (this.nummer!= null), (that.nummer!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt, (this.ort!= null), (that.ort!= null))) {
                return false;
            }
        }
        {
            String lhsGeschaeftsstelle;
            lhsGeschaeftsstelle = this.getGeschaeftsstelle();
            String rhsGeschaeftsstelle;
            rhsGeschaeftsstelle = that.getGeschaeftsstelle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geschaeftsstelle", lhsGeschaeftsstelle), LocatorUtils.property(thatLocator, "geschaeftsstelle", rhsGeschaeftsstelle), lhsGeschaeftsstelle, rhsGeschaeftsstelle, (this.geschaeftsstelle!= null), (that.geschaeftsstelle!= null))) {
                return false;
            }
        }
        {
            STUnternehmensnummernart lhsNummernart;
            lhsNummernart = this.getNummernart();
            STUnternehmensnummernart rhsNummernart;
            rhsNummernart = that.getNummernart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nummernart", lhsNummernart), LocatorUtils.property(thatLocator, "nummernart", rhsNummernart), lhsNummernart, rhsNummernart, (this.nummernart!= null), (that.nummernart!= null))) {
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
            String theNummer;
            theNummer = this.getNummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nummer", theNummer), currentHashCode, theNummer, (this.nummer!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theOrt;
            theOrt = this.getOrt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ort", theOrt), currentHashCode, theOrt, (this.ort!= null));
        }
        {
            String theGeschaeftsstelle;
            theGeschaeftsstelle = this.getGeschaeftsstelle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geschaeftsstelle", theGeschaeftsstelle), currentHashCode, theGeschaeftsstelle, (this.geschaeftsstelle!= null));
        }
        {
            STUnternehmensnummernart theNummernart;
            theNummernart = this.getNummernart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nummernart", theNummernart), currentHashCode, theNummernart, (this.nummernart!= null));
        }
        {
            String thePartnerID;
            thePartnerID = this.getPartnerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerID", thePartnerID), currentHashCode, thePartnerID, (this.partnerID!= null));
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
        if (draftCopy instanceof CTUnternehmen) {
            final CTUnternehmen copy = ((CTUnternehmen) draftCopy);
            {
                Boolean nummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nummer!= null));
                if (nummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNummer;
                    sourceNummer = this.getNummer();
                    String copyNummer = ((String) strategy.copy(LocatorUtils.property(locator, "nummer", sourceNummer), sourceNummer, (this.nummer!= null)));
                    copy.setNummer(copyNummer);
                } else {
                    if (nummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nummer = null;
                    }
                }
            }
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.name!= null));
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceName;
                    sourceName = this.getName();
                    String copyName = ((String) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, (this.name!= null)));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean ortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ort!= null));
                if (ortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrt;
                    sourceOrt = this.getOrt();
                    String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt, (this.ort!= null)));
                    copy.setOrt(copyOrt);
                } else {
                    if (ortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ort = null;
                    }
                }
            }
            {
                Boolean geschaeftsstelleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geschaeftsstelle!= null));
                if (geschaeftsstelleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeschaeftsstelle;
                    sourceGeschaeftsstelle = this.getGeschaeftsstelle();
                    String copyGeschaeftsstelle = ((String) strategy.copy(LocatorUtils.property(locator, "geschaeftsstelle", sourceGeschaeftsstelle), sourceGeschaeftsstelle, (this.geschaeftsstelle!= null)));
                    copy.setGeschaeftsstelle(copyGeschaeftsstelle);
                } else {
                    if (geschaeftsstelleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geschaeftsstelle = null;
                    }
                }
            }
            {
                Boolean nummernartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nummernart!= null));
                if (nummernartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STUnternehmensnummernart sourceNummernart;
                    sourceNummernart = this.getNummernart();
                    STUnternehmensnummernart copyNummernart = ((STUnternehmensnummernart) strategy.copy(LocatorUtils.property(locator, "nummernart", sourceNummernart), sourceNummernart, (this.nummernart!= null)));
                    copy.setNummernart(copyNummernart);
                } else {
                    if (nummernartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nummernart = null;
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTUnternehmen();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withNummer(String value) {
        setNummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withName(String value) {
        setName(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withOrt(String value) {
        setOrt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withGeschaeftsstelle(String value) {
        setGeschaeftsstelle(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withNummernart(STUnternehmensnummernart value) {
        setNummernart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
