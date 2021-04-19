
package net.bipro.namespace.versicherung.sach;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEAlarmierungsart;
import net.bipro.namespace.datentypen.STESicherheitsstufe;
import net.bipro.namespace.datentypen.STESicherung;
import net.bipro.namespace.datentypen.STSicherungseinrichtung;
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
 * <p>Java class for CT_Sicherung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Sicherung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KategorieID" type="{http://www.bipro.net/namespace/datentypen}ST_Sicherungseinrichtung" minOccurs="0"/&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_Sicherung" minOccurs="0"/&gt;
 *         &lt;element name="Sicherheitsstufe" type="{http://www.bipro.net/namespace/datentypen}STE_Sicherheitsstufe" minOccurs="0"/&gt;
 *         &lt;element name="Alarmierungsart" type="{http://www.bipro.net/namespace/datentypen}STE_Alarmierungsart" minOccurs="0"/&gt;
 *         &lt;element name="Sicherungsbezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Hersteller" type="{http://www.bipro.net/namespace/datentypen}ST_Text080" minOccurs="0"/&gt;
 *         &lt;element name="Systembezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text080" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Sicherung", propOrder = {
    "kategorieID",
    "artID",
    "sicherheitsstufe",
    "alarmierungsart",
    "sicherungsbezeichnung",
    "hersteller",
    "systembezeichnung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTSicherung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "KategorieID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STSicherungseinrichtung kategorieID;
    @XmlElement(name = "ArtID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STESicherung artID;
    @XmlElement(name = "Sicherheitsstufe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STESicherheitsstufe sicherheitsstufe;
    @XmlElement(name = "Alarmierungsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEAlarmierungsart alarmierungsart;
    @XmlElement(name = "Sicherungsbezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String sicherungsbezeichnung;
    @XmlElement(name = "Hersteller")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String hersteller;
    @XmlElement(name = "Systembezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String systembezeichnung;

    /**
     * Gets the value of the kategorieID property.
     * 
     * @return
     *     possible object is
     *     {@link STSicherungseinrichtung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STSicherungseinrichtung getKategorieID() {
        return kategorieID;
    }

    /**
     * Sets the value of the kategorieID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSicherungseinrichtung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKategorieID(STSicherungseinrichtung value) {
        this.kategorieID = value;
    }

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STESicherung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STESicherung getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STESicherung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STESicherung value) {
        this.artID = value;
    }

    /**
     * Gets the value of the sicherheitsstufe property.
     * 
     * @return
     *     possible object is
     *     {@link STESicherheitsstufe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STESicherheitsstufe getSicherheitsstufe() {
        return sicherheitsstufe;
    }

    /**
     * Sets the value of the sicherheitsstufe property.
     * 
     * @param value
     *     allowed object is
     *     {@link STESicherheitsstufe }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSicherheitsstufe(STESicherheitsstufe value) {
        this.sicherheitsstufe = value;
    }

    /**
     * Gets the value of the alarmierungsart property.
     * 
     * @return
     *     possible object is
     *     {@link STEAlarmierungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEAlarmierungsart getAlarmierungsart() {
        return alarmierungsart;
    }

    /**
     * Sets the value of the alarmierungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEAlarmierungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAlarmierungsart(STEAlarmierungsart value) {
        this.alarmierungsart = value;
    }

    /**
     * Gets the value of the sicherungsbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSicherungsbezeichnung() {
        return sicherungsbezeichnung;
    }

    /**
     * Sets the value of the sicherungsbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSicherungsbezeichnung(String value) {
        this.sicherungsbezeichnung = value;
    }

    /**
     * Gets the value of the hersteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getHersteller() {
        return hersteller;
    }

    /**
     * Sets the value of the hersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setHersteller(String value) {
        this.hersteller = value;
    }

    /**
     * Gets the value of the systembezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getSystembezeichnung() {
        return systembezeichnung;
    }

    /**
     * Sets the value of the systembezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSystembezeichnung(String value) {
        this.systembezeichnung = value;
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
        final CTSicherung that = ((CTSicherung) object);
        {
            STSicherungseinrichtung lhsKategorieID;
            lhsKategorieID = this.getKategorieID();
            STSicherungseinrichtung rhsKategorieID;
            rhsKategorieID = that.getKategorieID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kategorieID", lhsKategorieID), LocatorUtils.property(thatLocator, "kategorieID", rhsKategorieID), lhsKategorieID, rhsKategorieID, (this.kategorieID!= null), (that.kategorieID!= null))) {
                return false;
            }
        }
        {
            STESicherung lhsArtID;
            lhsArtID = this.getArtID();
            STESicherung rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            STESicherheitsstufe lhsSicherheitsstufe;
            lhsSicherheitsstufe = this.getSicherheitsstufe();
            STESicherheitsstufe rhsSicherheitsstufe;
            rhsSicherheitsstufe = that.getSicherheitsstufe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherheitsstufe", lhsSicherheitsstufe), LocatorUtils.property(thatLocator, "sicherheitsstufe", rhsSicherheitsstufe), lhsSicherheitsstufe, rhsSicherheitsstufe, (this.sicherheitsstufe!= null), (that.sicherheitsstufe!= null))) {
                return false;
            }
        }
        {
            STEAlarmierungsart lhsAlarmierungsart;
            lhsAlarmierungsart = this.getAlarmierungsart();
            STEAlarmierungsart rhsAlarmierungsart;
            rhsAlarmierungsart = that.getAlarmierungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alarmierungsart", lhsAlarmierungsart), LocatorUtils.property(thatLocator, "alarmierungsart", rhsAlarmierungsart), lhsAlarmierungsart, rhsAlarmierungsart, (this.alarmierungsart!= null), (that.alarmierungsart!= null))) {
                return false;
            }
        }
        {
            String lhsSicherungsbezeichnung;
            lhsSicherungsbezeichnung = this.getSicherungsbezeichnung();
            String rhsSicherungsbezeichnung;
            rhsSicherungsbezeichnung = that.getSicherungsbezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sicherungsbezeichnung", lhsSicherungsbezeichnung), LocatorUtils.property(thatLocator, "sicherungsbezeichnung", rhsSicherungsbezeichnung), lhsSicherungsbezeichnung, rhsSicherungsbezeichnung, (this.sicherungsbezeichnung!= null), (that.sicherungsbezeichnung!= null))) {
                return false;
            }
        }
        {
            String lhsHersteller;
            lhsHersteller = this.getHersteller();
            String rhsHersteller;
            rhsHersteller = that.getHersteller();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hersteller", lhsHersteller), LocatorUtils.property(thatLocator, "hersteller", rhsHersteller), lhsHersteller, rhsHersteller, (this.hersteller!= null), (that.hersteller!= null))) {
                return false;
            }
        }
        {
            String lhsSystembezeichnung;
            lhsSystembezeichnung = this.getSystembezeichnung();
            String rhsSystembezeichnung;
            rhsSystembezeichnung = that.getSystembezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "systembezeichnung", lhsSystembezeichnung), LocatorUtils.property(thatLocator, "systembezeichnung", rhsSystembezeichnung), lhsSystembezeichnung, rhsSystembezeichnung, (this.systembezeichnung!= null), (that.systembezeichnung!= null))) {
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
            STSicherungseinrichtung theKategorieID;
            theKategorieID = this.getKategorieID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kategorieID", theKategorieID), currentHashCode, theKategorieID, (this.kategorieID!= null));
        }
        {
            STESicherung theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            STESicherheitsstufe theSicherheitsstufe;
            theSicherheitsstufe = this.getSicherheitsstufe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherheitsstufe", theSicherheitsstufe), currentHashCode, theSicherheitsstufe, (this.sicherheitsstufe!= null));
        }
        {
            STEAlarmierungsart theAlarmierungsart;
            theAlarmierungsart = this.getAlarmierungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alarmierungsart", theAlarmierungsart), currentHashCode, theAlarmierungsart, (this.alarmierungsart!= null));
        }
        {
            String theSicherungsbezeichnung;
            theSicherungsbezeichnung = this.getSicherungsbezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sicherungsbezeichnung", theSicherungsbezeichnung), currentHashCode, theSicherungsbezeichnung, (this.sicherungsbezeichnung!= null));
        }
        {
            String theHersteller;
            theHersteller = this.getHersteller();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hersteller", theHersteller), currentHashCode, theHersteller, (this.hersteller!= null));
        }
        {
            String theSystembezeichnung;
            theSystembezeichnung = this.getSystembezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "systembezeichnung", theSystembezeichnung), currentHashCode, theSystembezeichnung, (this.systembezeichnung!= null));
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
        if (draftCopy instanceof CTSicherung) {
            final CTSicherung copy = ((CTSicherung) draftCopy);
            {
                Boolean kategorieIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kategorieID!= null));
                if (kategorieIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STSicherungseinrichtung sourceKategorieID;
                    sourceKategorieID = this.getKategorieID();
                    STSicherungseinrichtung copyKategorieID = ((STSicherungseinrichtung) strategy.copy(LocatorUtils.property(locator, "kategorieID", sourceKategorieID), sourceKategorieID, (this.kategorieID!= null)));
                    copy.setKategorieID(copyKategorieID);
                } else {
                    if (kategorieIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kategorieID = null;
                    }
                }
            }
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STESicherung sourceArtID;
                    sourceArtID = this.getArtID();
                    STESicherung copyArtID = ((STESicherung) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean sicherheitsstufeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sicherheitsstufe!= null));
                if (sicherheitsstufeShouldBeCopiedAndSet == Boolean.TRUE) {
                    STESicherheitsstufe sourceSicherheitsstufe;
                    sourceSicherheitsstufe = this.getSicherheitsstufe();
                    STESicherheitsstufe copySicherheitsstufe = ((STESicherheitsstufe) strategy.copy(LocatorUtils.property(locator, "sicherheitsstufe", sourceSicherheitsstufe), sourceSicherheitsstufe, (this.sicherheitsstufe!= null)));
                    copy.setSicherheitsstufe(copySicherheitsstufe);
                } else {
                    if (sicherheitsstufeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherheitsstufe = null;
                    }
                }
            }
            {
                Boolean alarmierungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.alarmierungsart!= null));
                if (alarmierungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEAlarmierungsart sourceAlarmierungsart;
                    sourceAlarmierungsart = this.getAlarmierungsart();
                    STEAlarmierungsart copyAlarmierungsart = ((STEAlarmierungsart) strategy.copy(LocatorUtils.property(locator, "alarmierungsart", sourceAlarmierungsart), sourceAlarmierungsart, (this.alarmierungsart!= null)));
                    copy.setAlarmierungsart(copyAlarmierungsart);
                } else {
                    if (alarmierungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.alarmierungsart = null;
                    }
                }
            }
            {
                Boolean sicherungsbezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sicherungsbezeichnung!= null));
                if (sicherungsbezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSicherungsbezeichnung;
                    sourceSicherungsbezeichnung = this.getSicherungsbezeichnung();
                    String copySicherungsbezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "sicherungsbezeichnung", sourceSicherungsbezeichnung), sourceSicherungsbezeichnung, (this.sicherungsbezeichnung!= null)));
                    copy.setSicherungsbezeichnung(copySicherungsbezeichnung);
                } else {
                    if (sicherungsbezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sicherungsbezeichnung = null;
                    }
                }
            }
            {
                Boolean herstellerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hersteller!= null));
                if (herstellerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHersteller;
                    sourceHersteller = this.getHersteller();
                    String copyHersteller = ((String) strategy.copy(LocatorUtils.property(locator, "hersteller", sourceHersteller), sourceHersteller, (this.hersteller!= null)));
                    copy.setHersteller(copyHersteller);
                } else {
                    if (herstellerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hersteller = null;
                    }
                }
            }
            {
                Boolean systembezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.systembezeichnung!= null));
                if (systembezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSystembezeichnung;
                    sourceSystembezeichnung = this.getSystembezeichnung();
                    String copySystembezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "systembezeichnung", sourceSystembezeichnung), sourceSystembezeichnung, (this.systembezeichnung!= null)));
                    copy.setSystembezeichnung(copySystembezeichnung);
                } else {
                    if (systembezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.systembezeichnung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTSicherung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withKategorieID(STSicherungseinrichtung value) {
        setKategorieID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withArtID(STESicherung value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withSicherheitsstufe(STESicherheitsstufe value) {
        setSicherheitsstufe(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withAlarmierungsart(STEAlarmierungsart value) {
        setAlarmierungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withSicherungsbezeichnung(String value) {
        setSicherungsbezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withHersteller(String value) {
        setHersteller(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withSystembezeichnung(String value) {
        setSystembezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSicherung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
