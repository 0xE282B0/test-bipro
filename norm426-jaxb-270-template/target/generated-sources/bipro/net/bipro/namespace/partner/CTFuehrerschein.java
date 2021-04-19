
package net.bipro.namespace.partner;

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
 * <p>Java class for CT_Fuehrerschein complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Fuehrerschein"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fuehrerscheinklasse" type="{http://www.bipro.net/namespace/datentypen}ST_Fuehrerscheinklasse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FuehrerscheinAusstellung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="FuehrerscheinAusstellungsLand" type="{http://www.bipro.net/namespace/datentypen}ST_Laenderkennzeichen" minOccurs="0"/&gt;
 *         &lt;element name="EUFuehrerschein" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Vorhanden" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="EntzogenAm" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Fuehrerschein", propOrder = {
    "fuehrerscheinklasse",
    "fuehrerscheinAusstellung",
    "fuehrerscheinAusstellungsLand",
    "euFuehrerschein",
    "vorhanden",
    "entzogenAm"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTFuehrerschein
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Fuehrerscheinklasse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<String> fuehrerscheinklasse;
    @XmlElement(name = "FuehrerscheinAusstellung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String fuehrerscheinAusstellung;
    @XmlElement(name = "FuehrerscheinAusstellungsLand")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLaenderkennzeichen fuehrerscheinAusstellungsLand;
    @XmlElement(name = "EUFuehrerschein")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean euFuehrerschein;
    @XmlElement(name = "Vorhanden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean vorhanden;
    @XmlElement(name = "EntzogenAm")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String entzogenAm;

    /**
     * Gets the value of the fuehrerscheinklasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuehrerscheinklasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuehrerscheinklasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<String> getFuehrerscheinklasse() {
        if (fuehrerscheinklasse == null) {
            fuehrerscheinklasse = new ArrayList<String>();
        }
        return this.fuehrerscheinklasse;
    }

    /**
     * Gets the value of the fuehrerscheinAusstellung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFuehrerscheinAusstellung() {
        return fuehrerscheinAusstellung;
    }

    /**
     * Sets the value of the fuehrerscheinAusstellung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFuehrerscheinAusstellung(String value) {
        this.fuehrerscheinAusstellung = value;
    }

    /**
     * Gets the value of the fuehrerscheinAusstellungsLand property.
     * 
     * @return
     *     possible object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLaenderkennzeichen getFuehrerscheinAusstellungsLand() {
        return fuehrerscheinAusstellungsLand;
    }

    /**
     * Sets the value of the fuehrerscheinAusstellungsLand property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFuehrerscheinAusstellungsLand(STLaenderkennzeichen value) {
        this.fuehrerscheinAusstellungsLand = value;
    }

    /**
     * Gets the value of the euFuehrerschein property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isEUFuehrerschein() {
        return euFuehrerschein;
    }

    /**
     * Sets the value of the euFuehrerschein property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEUFuehrerschein(Boolean value) {
        this.euFuehrerschein = value;
    }

    /**
     * Gets the value of the vorhanden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isVorhanden() {
        return vorhanden;
    }

    /**
     * Sets the value of the vorhanden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVorhanden(Boolean value) {
        this.vorhanden = value;
    }

    /**
     * Gets the value of the entzogenAm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getEntzogenAm() {
        return entzogenAm;
    }

    /**
     * Sets the value of the entzogenAm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEntzogenAm(String value) {
        this.entzogenAm = value;
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
        final CTFuehrerschein that = ((CTFuehrerschein) object);
        {
            List<String> lhsFuehrerscheinklasse;
            lhsFuehrerscheinklasse = (((this.fuehrerscheinklasse!= null)&&(!this.fuehrerscheinklasse.isEmpty()))?this.getFuehrerscheinklasse():null);
            List<String> rhsFuehrerscheinklasse;
            rhsFuehrerscheinklasse = (((that.fuehrerscheinklasse!= null)&&(!that.fuehrerscheinklasse.isEmpty()))?that.getFuehrerscheinklasse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fuehrerscheinklasse", lhsFuehrerscheinklasse), LocatorUtils.property(thatLocator, "fuehrerscheinklasse", rhsFuehrerscheinklasse), lhsFuehrerscheinklasse, rhsFuehrerscheinklasse, ((this.fuehrerscheinklasse!= null)&&(!this.fuehrerscheinklasse.isEmpty())), ((that.fuehrerscheinklasse!= null)&&(!that.fuehrerscheinklasse.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsFuehrerscheinAusstellung;
            lhsFuehrerscheinAusstellung = this.getFuehrerscheinAusstellung();
            String rhsFuehrerscheinAusstellung;
            rhsFuehrerscheinAusstellung = that.getFuehrerscheinAusstellung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fuehrerscheinAusstellung", lhsFuehrerscheinAusstellung), LocatorUtils.property(thatLocator, "fuehrerscheinAusstellung", rhsFuehrerscheinAusstellung), lhsFuehrerscheinAusstellung, rhsFuehrerscheinAusstellung, (this.fuehrerscheinAusstellung!= null), (that.fuehrerscheinAusstellung!= null))) {
                return false;
            }
        }
        {
            STLaenderkennzeichen lhsFuehrerscheinAusstellungsLand;
            lhsFuehrerscheinAusstellungsLand = this.getFuehrerscheinAusstellungsLand();
            STLaenderkennzeichen rhsFuehrerscheinAusstellungsLand;
            rhsFuehrerscheinAusstellungsLand = that.getFuehrerscheinAusstellungsLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fuehrerscheinAusstellungsLand", lhsFuehrerscheinAusstellungsLand), LocatorUtils.property(thatLocator, "fuehrerscheinAusstellungsLand", rhsFuehrerscheinAusstellungsLand), lhsFuehrerscheinAusstellungsLand, rhsFuehrerscheinAusstellungsLand, (this.fuehrerscheinAusstellungsLand!= null), (that.fuehrerscheinAusstellungsLand!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEUFuehrerschein;
            lhsEUFuehrerschein = this.isEUFuehrerschein();
            Boolean rhsEUFuehrerschein;
            rhsEUFuehrerschein = that.isEUFuehrerschein();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "euFuehrerschein", lhsEUFuehrerschein), LocatorUtils.property(thatLocator, "euFuehrerschein", rhsEUFuehrerschein), lhsEUFuehrerschein, rhsEUFuehrerschein, (this.euFuehrerschein!= null), (that.euFuehrerschein!= null))) {
                return false;
            }
        }
        {
            Boolean lhsVorhanden;
            lhsVorhanden = this.isVorhanden();
            Boolean rhsVorhanden;
            rhsVorhanden = that.isVorhanden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vorhanden", lhsVorhanden), LocatorUtils.property(thatLocator, "vorhanden", rhsVorhanden), lhsVorhanden, rhsVorhanden, (this.vorhanden!= null), (that.vorhanden!= null))) {
                return false;
            }
        }
        {
            String lhsEntzogenAm;
            lhsEntzogenAm = this.getEntzogenAm();
            String rhsEntzogenAm;
            rhsEntzogenAm = that.getEntzogenAm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entzogenAm", lhsEntzogenAm), LocatorUtils.property(thatLocator, "entzogenAm", rhsEntzogenAm), lhsEntzogenAm, rhsEntzogenAm, (this.entzogenAm!= null), (that.entzogenAm!= null))) {
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
            List<String> theFuehrerscheinklasse;
            theFuehrerscheinklasse = (((this.fuehrerscheinklasse!= null)&&(!this.fuehrerscheinklasse.isEmpty()))?this.getFuehrerscheinklasse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fuehrerscheinklasse", theFuehrerscheinklasse), currentHashCode, theFuehrerscheinklasse, ((this.fuehrerscheinklasse!= null)&&(!this.fuehrerscheinklasse.isEmpty())));
        }
        {
            String theFuehrerscheinAusstellung;
            theFuehrerscheinAusstellung = this.getFuehrerscheinAusstellung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fuehrerscheinAusstellung", theFuehrerscheinAusstellung), currentHashCode, theFuehrerscheinAusstellung, (this.fuehrerscheinAusstellung!= null));
        }
        {
            STLaenderkennzeichen theFuehrerscheinAusstellungsLand;
            theFuehrerscheinAusstellungsLand = this.getFuehrerscheinAusstellungsLand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fuehrerscheinAusstellungsLand", theFuehrerscheinAusstellungsLand), currentHashCode, theFuehrerscheinAusstellungsLand, (this.fuehrerscheinAusstellungsLand!= null));
        }
        {
            Boolean theEUFuehrerschein;
            theEUFuehrerschein = this.isEUFuehrerschein();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "euFuehrerschein", theEUFuehrerschein), currentHashCode, theEUFuehrerschein, (this.euFuehrerschein!= null));
        }
        {
            Boolean theVorhanden;
            theVorhanden = this.isVorhanden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vorhanden", theVorhanden), currentHashCode, theVorhanden, (this.vorhanden!= null));
        }
        {
            String theEntzogenAm;
            theEntzogenAm = this.getEntzogenAm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entzogenAm", theEntzogenAm), currentHashCode, theEntzogenAm, (this.entzogenAm!= null));
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
        if (draftCopy instanceof CTFuehrerschein) {
            final CTFuehrerschein copy = ((CTFuehrerschein) draftCopy);
            {
                Boolean fuehrerscheinklasseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fuehrerscheinklasse!= null)&&(!this.fuehrerscheinklasse.isEmpty())));
                if (fuehrerscheinklasseShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceFuehrerscheinklasse;
                    sourceFuehrerscheinklasse = (((this.fuehrerscheinklasse!= null)&&(!this.fuehrerscheinklasse.isEmpty()))?this.getFuehrerscheinklasse():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyFuehrerscheinklasse = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "fuehrerscheinklasse", sourceFuehrerscheinklasse), sourceFuehrerscheinklasse, ((this.fuehrerscheinklasse!= null)&&(!this.fuehrerscheinklasse.isEmpty()))));
                    copy.fuehrerscheinklasse = null;
                    if (copyFuehrerscheinklasse!= null) {
                        List<String> uniqueFuehrerscheinklassel = copy.getFuehrerscheinklasse();
                        uniqueFuehrerscheinklassel.addAll(copyFuehrerscheinklasse);
                    }
                } else {
                    if (fuehrerscheinklasseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fuehrerscheinklasse = null;
                    }
                }
            }
            {
                Boolean fuehrerscheinAusstellungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fuehrerscheinAusstellung!= null));
                if (fuehrerscheinAusstellungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFuehrerscheinAusstellung;
                    sourceFuehrerscheinAusstellung = this.getFuehrerscheinAusstellung();
                    String copyFuehrerscheinAusstellung = ((String) strategy.copy(LocatorUtils.property(locator, "fuehrerscheinAusstellung", sourceFuehrerscheinAusstellung), sourceFuehrerscheinAusstellung, (this.fuehrerscheinAusstellung!= null)));
                    copy.setFuehrerscheinAusstellung(copyFuehrerscheinAusstellung);
                } else {
                    if (fuehrerscheinAusstellungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fuehrerscheinAusstellung = null;
                    }
                }
            }
            {
                Boolean fuehrerscheinAusstellungsLandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fuehrerscheinAusstellungsLand!= null));
                if (fuehrerscheinAusstellungsLandShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLaenderkennzeichen sourceFuehrerscheinAusstellungsLand;
                    sourceFuehrerscheinAusstellungsLand = this.getFuehrerscheinAusstellungsLand();
                    STLaenderkennzeichen copyFuehrerscheinAusstellungsLand = ((STLaenderkennzeichen) strategy.copy(LocatorUtils.property(locator, "fuehrerscheinAusstellungsLand", sourceFuehrerscheinAusstellungsLand), sourceFuehrerscheinAusstellungsLand, (this.fuehrerscheinAusstellungsLand!= null)));
                    copy.setFuehrerscheinAusstellungsLand(copyFuehrerscheinAusstellungsLand);
                } else {
                    if (fuehrerscheinAusstellungsLandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fuehrerscheinAusstellungsLand = null;
                    }
                }
            }
            {
                Boolean euFuehrerscheinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.euFuehrerschein!= null));
                if (euFuehrerscheinShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEUFuehrerschein;
                    sourceEUFuehrerschein = this.isEUFuehrerschein();
                    Boolean copyEUFuehrerschein = ((Boolean) strategy.copy(LocatorUtils.property(locator, "euFuehrerschein", sourceEUFuehrerschein), sourceEUFuehrerschein, (this.euFuehrerschein!= null)));
                    copy.setEUFuehrerschein(copyEUFuehrerschein);
                } else {
                    if (euFuehrerscheinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.euFuehrerschein = null;
                    }
                }
            }
            {
                Boolean vorhandenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vorhanden!= null));
                if (vorhandenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceVorhanden;
                    sourceVorhanden = this.isVorhanden();
                    Boolean copyVorhanden = ((Boolean) strategy.copy(LocatorUtils.property(locator, "vorhanden", sourceVorhanden), sourceVorhanden, (this.vorhanden!= null)));
                    copy.setVorhanden(copyVorhanden);
                } else {
                    if (vorhandenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vorhanden = null;
                    }
                }
            }
            {
                Boolean entzogenAmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entzogenAm!= null));
                if (entzogenAmShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEntzogenAm;
                    sourceEntzogenAm = this.getEntzogenAm();
                    String copyEntzogenAm = ((String) strategy.copy(LocatorUtils.property(locator, "entzogenAm", sourceEntzogenAm), sourceEntzogenAm, (this.entzogenAm!= null)));
                    copy.setEntzogenAm(copyEntzogenAm);
                } else {
                    if (entzogenAmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entzogenAm = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFuehrerschein();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withFuehrerscheinklasse(String... values) {
        if (values!= null) {
            for (String value: values) {
                getFuehrerscheinklasse().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withFuehrerscheinklasse(Collection<String> values) {
        if (values!= null) {
            getFuehrerscheinklasse().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withFuehrerscheinAusstellung(String value) {
        setFuehrerscheinAusstellung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withFuehrerscheinAusstellungsLand(STLaenderkennzeichen value) {
        setFuehrerscheinAusstellungsLand(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withEUFuehrerschein(Boolean value) {
        setEUFuehrerschein(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withVorhanden(Boolean value) {
        setVorhanden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withEntzogenAm(String value) {
        setEntzogenAm(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFuehrerschein withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
