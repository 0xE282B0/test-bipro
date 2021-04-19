
package net.bipro.namespace.allgemein;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
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
 * Identifizierende Nummer für einen  Vertrag (z.B. Versicherungsscheinnummer, Kontonummer, Depotnummer).
 * 
 * <p>Java class for CT_Vertragsnummer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Vertragsnummer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Versicherungsscheinnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Versicherungsscheinnummer" minOccurs="0"/&gt;
 *         &lt;element name="Vorgangsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Vorgangsnummer" minOccurs="0"/&gt;
 *         &lt;element name="Kontonummer" type="{http://www.bipro.net/namespace/datentypen}ST_Kontonummer" minOccurs="0"/&gt;
 *         &lt;element name="Depotnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Depotnummer" minOccurs="0"/&gt;
 *         &lt;element name="DruckaufbereiteteVertragsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="VertragsverbindungsnummerGDV" type="{http://www.bipro.net/namespace/datentypen}ST_Text035" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Vertragsnummer", propOrder = {
    "versicherungsscheinnummer",
    "vorgangsnummer",
    "kontonummer",
    "depotnummer",
    "druckaufbereiteteVertragsnummer",
    "vertragsverbindungsnummerGDV"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTVertragsnummer
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Versicherungsscheinnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String versicherungsscheinnummer;
    @XmlElement(name = "Vorgangsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String vorgangsnummer;
    @XmlElement(name = "Kontonummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kontonummer;
    @XmlElement(name = "Depotnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String depotnummer;
    @XmlElement(name = "DruckaufbereiteteVertragsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String druckaufbereiteteVertragsnummer;
    @XmlElement(name = "VertragsverbindungsnummerGDV")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<String> vertragsverbindungsnummerGDV;

    /**
     * Gets the value of the versicherungsscheinnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVersicherungsscheinnummer() {
        return versicherungsscheinnummer;
    }

    /**
     * Sets the value of the versicherungsscheinnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVersicherungsscheinnummer(String value) {
        this.versicherungsscheinnummer = value;
    }

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
     * Gets the value of the kontonummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKontonummer() {
        return kontonummer;
    }

    /**
     * Sets the value of the kontonummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKontonummer(String value) {
        this.kontonummer = value;
    }

    /**
     * Gets the value of the depotnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDepotnummer() {
        return depotnummer;
    }

    /**
     * Sets the value of the depotnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDepotnummer(String value) {
        this.depotnummer = value;
    }

    /**
     * Gets the value of the druckaufbereiteteVertragsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDruckaufbereiteteVertragsnummer() {
        return druckaufbereiteteVertragsnummer;
    }

    /**
     * Sets the value of the druckaufbereiteteVertragsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDruckaufbereiteteVertragsnummer(String value) {
        this.druckaufbereiteteVertragsnummer = value;
    }

    /**
     * Gets the value of the vertragsverbindungsnummerGDV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vertragsverbindungsnummerGDV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVertragsverbindungsnummerGDV().add(newItem);
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
    public List<String> getVertragsverbindungsnummerGDV() {
        if (vertragsverbindungsnummerGDV == null) {
            vertragsverbindungsnummerGDV = new ArrayList<String>();
        }
        return this.vertragsverbindungsnummerGDV;
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
        final CTVertragsnummer that = ((CTVertragsnummer) object);
        {
            String lhsVersicherungsscheinnummer;
            lhsVersicherungsscheinnummer = this.getVersicherungsscheinnummer();
            String rhsVersicherungsscheinnummer;
            rhsVersicherungsscheinnummer = that.getVersicherungsscheinnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versicherungsscheinnummer", lhsVersicherungsscheinnummer), LocatorUtils.property(thatLocator, "versicherungsscheinnummer", rhsVersicherungsscheinnummer), lhsVersicherungsscheinnummer, rhsVersicherungsscheinnummer, (this.versicherungsscheinnummer!= null), (that.versicherungsscheinnummer!= null))) {
                return false;
            }
        }
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
            String lhsKontonummer;
            lhsKontonummer = this.getKontonummer();
            String rhsKontonummer;
            rhsKontonummer = that.getKontonummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kontonummer", lhsKontonummer), LocatorUtils.property(thatLocator, "kontonummer", rhsKontonummer), lhsKontonummer, rhsKontonummer, (this.kontonummer!= null), (that.kontonummer!= null))) {
                return false;
            }
        }
        {
            String lhsDepotnummer;
            lhsDepotnummer = this.getDepotnummer();
            String rhsDepotnummer;
            rhsDepotnummer = that.getDepotnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depotnummer", lhsDepotnummer), LocatorUtils.property(thatLocator, "depotnummer", rhsDepotnummer), lhsDepotnummer, rhsDepotnummer, (this.depotnummer!= null), (that.depotnummer!= null))) {
                return false;
            }
        }
        {
            String lhsDruckaufbereiteteVertragsnummer;
            lhsDruckaufbereiteteVertragsnummer = this.getDruckaufbereiteteVertragsnummer();
            String rhsDruckaufbereiteteVertragsnummer;
            rhsDruckaufbereiteteVertragsnummer = that.getDruckaufbereiteteVertragsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "druckaufbereiteteVertragsnummer", lhsDruckaufbereiteteVertragsnummer), LocatorUtils.property(thatLocator, "druckaufbereiteteVertragsnummer", rhsDruckaufbereiteteVertragsnummer), lhsDruckaufbereiteteVertragsnummer, rhsDruckaufbereiteteVertragsnummer, (this.druckaufbereiteteVertragsnummer!= null), (that.druckaufbereiteteVertragsnummer!= null))) {
                return false;
            }
        }
        {
            List<String> lhsVertragsverbindungsnummerGDV;
            lhsVertragsverbindungsnummerGDV = (((this.vertragsverbindungsnummerGDV!= null)&&(!this.vertragsverbindungsnummerGDV.isEmpty()))?this.getVertragsverbindungsnummerGDV():null);
            List<String> rhsVertragsverbindungsnummerGDV;
            rhsVertragsverbindungsnummerGDV = (((that.vertragsverbindungsnummerGDV!= null)&&(!that.vertragsverbindungsnummerGDV.isEmpty()))?that.getVertragsverbindungsnummerGDV():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vertragsverbindungsnummerGDV", lhsVertragsverbindungsnummerGDV), LocatorUtils.property(thatLocator, "vertragsverbindungsnummerGDV", rhsVertragsverbindungsnummerGDV), lhsVertragsverbindungsnummerGDV, rhsVertragsverbindungsnummerGDV, ((this.vertragsverbindungsnummerGDV!= null)&&(!this.vertragsverbindungsnummerGDV.isEmpty())), ((that.vertragsverbindungsnummerGDV!= null)&&(!that.vertragsverbindungsnummerGDV.isEmpty())))) {
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
            String theVersicherungsscheinnummer;
            theVersicherungsscheinnummer = this.getVersicherungsscheinnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versicherungsscheinnummer", theVersicherungsscheinnummer), currentHashCode, theVersicherungsscheinnummer, (this.versicherungsscheinnummer!= null));
        }
        {
            String theVorgangsnummer;
            theVorgangsnummer = this.getVorgangsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorgangsnummer", theVorgangsnummer), currentHashCode, theVorgangsnummer, (this.vorgangsnummer!= null));
        }
        {
            String theKontonummer;
            theKontonummer = this.getKontonummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kontonummer", theKontonummer), currentHashCode, theKontonummer, (this.kontonummer!= null));
        }
        {
            String theDepotnummer;
            theDepotnummer = this.getDepotnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depotnummer", theDepotnummer), currentHashCode, theDepotnummer, (this.depotnummer!= null));
        }
        {
            String theDruckaufbereiteteVertragsnummer;
            theDruckaufbereiteteVertragsnummer = this.getDruckaufbereiteteVertragsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "druckaufbereiteteVertragsnummer", theDruckaufbereiteteVertragsnummer), currentHashCode, theDruckaufbereiteteVertragsnummer, (this.druckaufbereiteteVertragsnummer!= null));
        }
        {
            List<String> theVertragsverbindungsnummerGDV;
            theVertragsverbindungsnummerGDV = (((this.vertragsverbindungsnummerGDV!= null)&&(!this.vertragsverbindungsnummerGDV.isEmpty()))?this.getVertragsverbindungsnummerGDV():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vertragsverbindungsnummerGDV", theVertragsverbindungsnummerGDV), currentHashCode, theVertragsverbindungsnummerGDV, ((this.vertragsverbindungsnummerGDV!= null)&&(!this.vertragsverbindungsnummerGDV.isEmpty())));
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
        if (draftCopy instanceof CTVertragsnummer) {
            final CTVertragsnummer copy = ((CTVertragsnummer) draftCopy);
            {
                Boolean versicherungsscheinnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versicherungsscheinnummer!= null));
                if (versicherungsscheinnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVersicherungsscheinnummer;
                    sourceVersicherungsscheinnummer = this.getVersicherungsscheinnummer();
                    String copyVersicherungsscheinnummer = ((String) strategy.copy(LocatorUtils.property(locator, "versicherungsscheinnummer", sourceVersicherungsscheinnummer), sourceVersicherungsscheinnummer, (this.versicherungsscheinnummer!= null)));
                    copy.setVersicherungsscheinnummer(copyVersicherungsscheinnummer);
                } else {
                    if (versicherungsscheinnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versicherungsscheinnummer = null;
                    }
                }
            }
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
                Boolean kontonummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kontonummer!= null));
                if (kontonummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKontonummer;
                    sourceKontonummer = this.getKontonummer();
                    String copyKontonummer = ((String) strategy.copy(LocatorUtils.property(locator, "kontonummer", sourceKontonummer), sourceKontonummer, (this.kontonummer!= null)));
                    copy.setKontonummer(copyKontonummer);
                } else {
                    if (kontonummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kontonummer = null;
                    }
                }
            }
            {
                Boolean depotnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.depotnummer!= null));
                if (depotnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDepotnummer;
                    sourceDepotnummer = this.getDepotnummer();
                    String copyDepotnummer = ((String) strategy.copy(LocatorUtils.property(locator, "depotnummer", sourceDepotnummer), sourceDepotnummer, (this.depotnummer!= null)));
                    copy.setDepotnummer(copyDepotnummer);
                } else {
                    if (depotnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.depotnummer = null;
                    }
                }
            }
            {
                Boolean druckaufbereiteteVertragsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.druckaufbereiteteVertragsnummer!= null));
                if (druckaufbereiteteVertragsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDruckaufbereiteteVertragsnummer;
                    sourceDruckaufbereiteteVertragsnummer = this.getDruckaufbereiteteVertragsnummer();
                    String copyDruckaufbereiteteVertragsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "druckaufbereiteteVertragsnummer", sourceDruckaufbereiteteVertragsnummer), sourceDruckaufbereiteteVertragsnummer, (this.druckaufbereiteteVertragsnummer!= null)));
                    copy.setDruckaufbereiteteVertragsnummer(copyDruckaufbereiteteVertragsnummer);
                } else {
                    if (druckaufbereiteteVertragsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.druckaufbereiteteVertragsnummer = null;
                    }
                }
            }
            {
                Boolean vertragsverbindungsnummerGDVShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vertragsverbindungsnummerGDV!= null)&&(!this.vertragsverbindungsnummerGDV.isEmpty())));
                if (vertragsverbindungsnummerGDVShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceVertragsverbindungsnummerGDV;
                    sourceVertragsverbindungsnummerGDV = (((this.vertragsverbindungsnummerGDV!= null)&&(!this.vertragsverbindungsnummerGDV.isEmpty()))?this.getVertragsverbindungsnummerGDV():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyVertragsverbindungsnummerGDV = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "vertragsverbindungsnummerGDV", sourceVertragsverbindungsnummerGDV), sourceVertragsverbindungsnummerGDV, ((this.vertragsverbindungsnummerGDV!= null)&&(!this.vertragsverbindungsnummerGDV.isEmpty()))));
                    copy.vertragsverbindungsnummerGDV = null;
                    if (copyVertragsverbindungsnummerGDV!= null) {
                        List<String> uniqueVertragsverbindungsnummerGDVl = copy.getVertragsverbindungsnummerGDV();
                        uniqueVertragsverbindungsnummerGDVl.addAll(copyVertragsverbindungsnummerGDV);
                    }
                } else {
                    if (vertragsverbindungsnummerGDVShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vertragsverbindungsnummerGDV = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVertragsnummer();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withVersicherungsscheinnummer(String value) {
        setVersicherungsscheinnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withVorgangsnummer(String value) {
        setVorgangsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withKontonummer(String value) {
        setKontonummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withDepotnummer(String value) {
        setDepotnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withDruckaufbereiteteVertragsnummer(String value) {
        setDruckaufbereiteteVertragsnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withVertragsverbindungsnummerGDV(String... values) {
        if (values!= null) {
            for (String value: values) {
                getVertragsverbindungsnummerGDV().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withVertragsverbindungsnummerGDV(Collection<String> values) {
        if (values!= null) {
            getVertragsverbindungsnummerGDV().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTVertragsnummer withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
