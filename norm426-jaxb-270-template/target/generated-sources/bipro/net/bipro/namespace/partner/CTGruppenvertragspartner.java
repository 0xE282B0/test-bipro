
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEGruppenvertragspartner;
import net.bipro.namespace.datentypen.STGruppenvertragspartnerStatus;
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
 * <p>Java class for CT_Gruppenvertragspartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gruppenvertragspartner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.bipro.net/namespace/datentypen}STE_Gruppenvertragspartner" minOccurs="0"/&gt;
 *         &lt;element name="Mitgliedsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text025" minOccurs="0"/&gt;
 *         &lt;element name="Gruppenvertragsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.bipro.net/namespace/datentypen}ST_GruppenvertragspartnerStatus" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gruppenvertragspartner", propOrder = {
    "id",
    "mitgliedsnummer",
    "gruppenvertragsnummer",
    "status",
    "name"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGruppenvertragspartner
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEGruppenvertragspartner id;
    @XmlElement(name = "Mitgliedsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String mitgliedsnummer;
    @XmlElement(name = "Gruppenvertragsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String gruppenvertragsnummer;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STGruppenvertragspartnerStatus status;
    @XmlElement(name = "Name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String name;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link STEGruppenvertragspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEGruppenvertragspartner getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGruppenvertragspartner }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setID(STEGruppenvertragspartner value) {
        this.id = value;
    }

    /**
     * Gets the value of the mitgliedsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getMitgliedsnummer() {
        return mitgliedsnummer;
    }

    /**
     * Sets the value of the mitgliedsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMitgliedsnummer(String value) {
        this.mitgliedsnummer = value;
    }

    /**
     * Gets the value of the gruppenvertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getGruppenvertragsnummer() {
        return gruppenvertragsnummer;
    }

    /**
     * Sets the value of the gruppenvertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGruppenvertragsnummer(String value) {
        this.gruppenvertragsnummer = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STGruppenvertragspartnerStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STGruppenvertragspartnerStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGruppenvertragspartnerStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStatus(STGruppenvertragspartnerStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setName(String value) {
        this.name = value;
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
        final CTGruppenvertragspartner that = ((CTGruppenvertragspartner) object);
        {
            STEGruppenvertragspartner lhsID;
            lhsID = this.getID();
            STEGruppenvertragspartner rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            String lhsMitgliedsnummer;
            lhsMitgliedsnummer = this.getMitgliedsnummer();
            String rhsMitgliedsnummer;
            rhsMitgliedsnummer = that.getMitgliedsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitgliedsnummer", lhsMitgliedsnummer), LocatorUtils.property(thatLocator, "mitgliedsnummer", rhsMitgliedsnummer), lhsMitgliedsnummer, rhsMitgliedsnummer, (this.mitgliedsnummer!= null), (that.mitgliedsnummer!= null))) {
                return false;
            }
        }
        {
            String lhsGruppenvertragsnummer;
            lhsGruppenvertragsnummer = this.getGruppenvertragsnummer();
            String rhsGruppenvertragsnummer;
            rhsGruppenvertragsnummer = that.getGruppenvertragsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppenvertragsnummer", lhsGruppenvertragsnummer), LocatorUtils.property(thatLocator, "gruppenvertragsnummer", rhsGruppenvertragsnummer), lhsGruppenvertragsnummer, rhsGruppenvertragsnummer, (this.gruppenvertragsnummer!= null), (that.gruppenvertragsnummer!= null))) {
                return false;
            }
        }
        {
            STGruppenvertragspartnerStatus lhsStatus;
            lhsStatus = this.getStatus();
            STGruppenvertragspartnerStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
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
            STEGruppenvertragspartner theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            String theMitgliedsnummer;
            theMitgliedsnummer = this.getMitgliedsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitgliedsnummer", theMitgliedsnummer), currentHashCode, theMitgliedsnummer, (this.mitgliedsnummer!= null));
        }
        {
            String theGruppenvertragsnummer;
            theGruppenvertragsnummer = this.getGruppenvertragsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gruppenvertragsnummer", theGruppenvertragsnummer), currentHashCode, theGruppenvertragsnummer, (this.gruppenvertragsnummer!= null));
        }
        {
            STGruppenvertragspartnerStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
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
        if (draftCopy instanceof CTGruppenvertragspartner) {
            final CTGruppenvertragspartner copy = ((CTGruppenvertragspartner) draftCopy);
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGruppenvertragspartner sourceID;
                    sourceID = this.getID();
                    STEGruppenvertragspartner copyID = ((STEGruppenvertragspartner) strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID, (this.id!= null)));
                    copy.setID(copyID);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
            {
                Boolean mitgliedsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mitgliedsnummer!= null));
                if (mitgliedsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMitgliedsnummer;
                    sourceMitgliedsnummer = this.getMitgliedsnummer();
                    String copyMitgliedsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "mitgliedsnummer", sourceMitgliedsnummer), sourceMitgliedsnummer, (this.mitgliedsnummer!= null)));
                    copy.setMitgliedsnummer(copyMitgliedsnummer);
                } else {
                    if (mitgliedsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitgliedsnummer = null;
                    }
                }
            }
            {
                Boolean gruppenvertragsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gruppenvertragsnummer!= null));
                if (gruppenvertragsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGruppenvertragsnummer;
                    sourceGruppenvertragsnummer = this.getGruppenvertragsnummer();
                    String copyGruppenvertragsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "gruppenvertragsnummer", sourceGruppenvertragsnummer), sourceGruppenvertragsnummer, (this.gruppenvertragsnummer!= null)));
                    copy.setGruppenvertragsnummer(copyGruppenvertragsnummer);
                } else {
                    if (gruppenvertragsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gruppenvertragsnummer = null;
                    }
                }
            }
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGruppenvertragspartnerStatus sourceStatus;
                    sourceStatus = this.getStatus();
                    STGruppenvertragspartnerStatus copyStatus = ((STGruppenvertragspartnerStatus) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
                    copy.setStatus(copyStatus);
                } else {
                    if (statusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.status = null;
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGruppenvertragspartner();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGruppenvertragspartner withID(STEGruppenvertragspartner value) {
        setID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGruppenvertragspartner withMitgliedsnummer(String value) {
        setMitgliedsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGruppenvertragspartner withGruppenvertragsnummer(String value) {
        setGruppenvertragsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGruppenvertragspartner withStatus(STGruppenvertragspartnerStatus value) {
        setStatus(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGruppenvertragspartner withName(String value) {
        setName(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGruppenvertragspartner withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGruppenvertragspartner withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
