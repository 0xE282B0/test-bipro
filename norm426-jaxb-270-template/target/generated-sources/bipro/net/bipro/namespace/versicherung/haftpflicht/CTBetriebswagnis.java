
package net.bipro.namespace.versicherung.haftpflicht;

import java.math.BigDecimal;
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
import net.bipro.namespace.datentypen.STBerechnungsart;
import net.bipro.namespace.datentypen.STBerechnungseinheitHaftpflicht;
import net.bipro.namespace.datentypen.STEKlassifizierungHaftpflicht;
import net.bipro.namespace.datentypen.STEWagnisart;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.datentypen.STWerteinheit;
import net.bipro.namespace.fragen.CTFragenkomplex;
import net.bipro.namespace.versicherung.produktmodell.CTVorschaden;
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
 * Klasse zur genauen Beschreibung des Betriebes und dessen Anteil bei Mischbetrieben.
 * 
 * <p>Java class for CT_Betriebswagnis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Betriebswagnis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Haftpflichtwagnis"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Betriebsart" type="{http://www.bipro.net/namespace/datentypen}ST_Betriebsart" minOccurs="0"/&gt;
 *         &lt;element name="Stichwort" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Anteil" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Werteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Umweltbasis" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Umweltbasis" minOccurs="0"/&gt;
 *         &lt;element name="Umweltschaden" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Umweltschaden" minOccurs="0"/&gt;
 *         &lt;element name="Betriebshaftpflicht" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Betriebshaftpflicht" minOccurs="0"/&gt;
 *         &lt;element name="Vermoegensschaden" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Vermoegensschaden" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Betriebswagnis", propOrder = {
    "betriebsart",
    "stichwort",
    "anteil",
    "werteinheit",
    "umweltbasis",
    "umweltschaden",
    "betriebshaftpflicht",
    "vermoegensschaden"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTBetriebswagnis
    extends CTHaftpflichtwagnis
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlList
    @XmlElement(name = "Betriebsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<String> betriebsart;
    @XmlElement(name = "Stichwort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String stichwort;
    @XmlElement(name = "Anteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anteil;
    @XmlElement(name = "Werteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit werteinheit;
    @XmlElement(name = "Umweltbasis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTUmweltbasis umweltbasis;
    @XmlElement(name = "Umweltschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTUmweltschaden umweltschaden;
    @XmlElement(name = "Betriebshaftpflicht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTBetriebshaftpflicht betriebshaftpflicht;
    @XmlElement(name = "Vermoegensschaden")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTVermoegensschaden vermoegensschaden;

    /**
     * Gets the value of the betriebsart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betriebsart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetriebsart().add(newItem);
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
    public List<String> getBetriebsart() {
        if (betriebsart == null) {
            betriebsart = new ArrayList<String>();
        }
        return this.betriebsart;
    }

    /**
     * Gets the value of the stichwort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getStichwort() {
        return stichwort;
    }

    /**
     * Sets the value of the stichwort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setStichwort(String value) {
        this.stichwort = value;
    }

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnteil(BigDecimal value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the werteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getWerteinheit() {
        return werteinheit;
    }

    /**
     * Sets the value of the werteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWerteinheit(STWerteinheit value) {
        this.werteinheit = value;
    }

    /**
     * Gets the value of the umweltbasis property.
     * 
     * @return
     *     possible object is
     *     {@link CTUmweltbasis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUmweltbasis getUmweltbasis() {
        return umweltbasis;
    }

    /**
     * Sets the value of the umweltbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUmweltbasis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUmweltbasis(CTUmweltbasis value) {
        this.umweltbasis = value;
    }

    /**
     * Gets the value of the umweltschaden property.
     * 
     * @return
     *     possible object is
     *     {@link CTUmweltschaden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUmweltschaden getUmweltschaden() {
        return umweltschaden;
    }

    /**
     * Sets the value of the umweltschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUmweltschaden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUmweltschaden(CTUmweltschaden value) {
        this.umweltschaden = value;
    }

    /**
     * Gets the value of the betriebshaftpflicht property.
     * 
     * @return
     *     possible object is
     *     {@link CTBetriebshaftpflicht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebshaftpflicht getBetriebshaftpflicht() {
        return betriebshaftpflicht;
    }

    /**
     * Sets the value of the betriebshaftpflicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBetriebshaftpflicht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBetriebshaftpflicht(CTBetriebshaftpflicht value) {
        this.betriebshaftpflicht = value;
    }

    /**
     * Gets the value of the vermoegensschaden property.
     * 
     * @return
     *     possible object is
     *     {@link CTVermoegensschaden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVermoegensschaden getVermoegensschaden() {
        return vermoegensschaden;
    }

    /**
     * Sets the value of the vermoegensschaden property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVermoegensschaden }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVermoegensschaden(CTVermoegensschaden value) {
        this.vermoegensschaden = value;
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
        final CTBetriebswagnis that = ((CTBetriebswagnis) object);
        {
            List<String> lhsBetriebsart;
            lhsBetriebsart = (((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))?this.getBetriebsart():null);
            List<String> rhsBetriebsart;
            rhsBetriebsart = (((that.betriebsart!= null)&&(!that.betriebsart.isEmpty()))?that.getBetriebsart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebsart", lhsBetriebsart), LocatorUtils.property(thatLocator, "betriebsart", rhsBetriebsart), lhsBetriebsart, rhsBetriebsart, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty())), ((that.betriebsart!= null)&&(!that.betriebsart.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsStichwort;
            lhsStichwort = this.getStichwort();
            String rhsStichwort;
            rhsStichwort = that.getStichwort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stichwort", lhsStichwort), LocatorUtils.property(thatLocator, "stichwort", rhsStichwort), lhsStichwort, rhsStichwort, (this.stichwort!= null), (that.stichwort!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAnteil;
            lhsAnteil = this.getAnteil();
            BigDecimal rhsAnteil;
            rhsAnteil = that.getAnteil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anteil", lhsAnteil), LocatorUtils.property(thatLocator, "anteil", rhsAnteil), lhsAnteil, rhsAnteil, (this.anteil!= null), (that.anteil!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsWerteinheit;
            lhsWerteinheit = this.getWerteinheit();
            STWerteinheit rhsWerteinheit;
            rhsWerteinheit = that.getWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "werteinheit", lhsWerteinheit), LocatorUtils.property(thatLocator, "werteinheit", rhsWerteinheit), lhsWerteinheit, rhsWerteinheit, (this.werteinheit!= null), (that.werteinheit!= null))) {
                return false;
            }
        }
        {
            CTUmweltbasis lhsUmweltbasis;
            lhsUmweltbasis = this.getUmweltbasis();
            CTUmweltbasis rhsUmweltbasis;
            rhsUmweltbasis = that.getUmweltbasis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umweltbasis", lhsUmweltbasis), LocatorUtils.property(thatLocator, "umweltbasis", rhsUmweltbasis), lhsUmweltbasis, rhsUmweltbasis, (this.umweltbasis!= null), (that.umweltbasis!= null))) {
                return false;
            }
        }
        {
            CTUmweltschaden lhsUmweltschaden;
            lhsUmweltschaden = this.getUmweltschaden();
            CTUmweltschaden rhsUmweltschaden;
            rhsUmweltschaden = that.getUmweltschaden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "umweltschaden", lhsUmweltschaden), LocatorUtils.property(thatLocator, "umweltschaden", rhsUmweltschaden), lhsUmweltschaden, rhsUmweltschaden, (this.umweltschaden!= null), (that.umweltschaden!= null))) {
                return false;
            }
        }
        {
            CTBetriebshaftpflicht lhsBetriebshaftpflicht;
            lhsBetriebshaftpflicht = this.getBetriebshaftpflicht();
            CTBetriebshaftpflicht rhsBetriebshaftpflicht;
            rhsBetriebshaftpflicht = that.getBetriebshaftpflicht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betriebshaftpflicht", lhsBetriebshaftpflicht), LocatorUtils.property(thatLocator, "betriebshaftpflicht", rhsBetriebshaftpflicht), lhsBetriebshaftpflicht, rhsBetriebshaftpflicht, (this.betriebshaftpflicht!= null), (that.betriebshaftpflicht!= null))) {
                return false;
            }
        }
        {
            CTVermoegensschaden lhsVermoegensschaden;
            lhsVermoegensschaden = this.getVermoegensschaden();
            CTVermoegensschaden rhsVermoegensschaden;
            rhsVermoegensschaden = that.getVermoegensschaden();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermoegensschaden", lhsVermoegensschaden), LocatorUtils.property(thatLocator, "vermoegensschaden", rhsVermoegensschaden), lhsVermoegensschaden, rhsVermoegensschaden, (this.vermoegensschaden!= null), (that.vermoegensschaden!= null))) {
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
            List<String> theBetriebsart;
            theBetriebsart = (((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))?this.getBetriebsart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betriebsart", theBetriebsart), currentHashCode, theBetriebsart, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty())));
        }
        {
            String theStichwort;
            theStichwort = this.getStichwort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stichwort", theStichwort), currentHashCode, theStichwort, (this.stichwort!= null));
        }
        {
            BigDecimal theAnteil;
            theAnteil = this.getAnteil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anteil", theAnteil), currentHashCode, theAnteil, (this.anteil!= null));
        }
        {
            STWerteinheit theWerteinheit;
            theWerteinheit = this.getWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "werteinheit", theWerteinheit), currentHashCode, theWerteinheit, (this.werteinheit!= null));
        }
        {
            CTUmweltbasis theUmweltbasis;
            theUmweltbasis = this.getUmweltbasis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "umweltbasis", theUmweltbasis), currentHashCode, theUmweltbasis, (this.umweltbasis!= null));
        }
        {
            CTUmweltschaden theUmweltschaden;
            theUmweltschaden = this.getUmweltschaden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "umweltschaden", theUmweltschaden), currentHashCode, theUmweltschaden, (this.umweltschaden!= null));
        }
        {
            CTBetriebshaftpflicht theBetriebshaftpflicht;
            theBetriebshaftpflicht = this.getBetriebshaftpflicht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betriebshaftpflicht", theBetriebshaftpflicht), currentHashCode, theBetriebshaftpflicht, (this.betriebshaftpflicht!= null));
        }
        {
            CTVermoegensschaden theVermoegensschaden;
            theVermoegensschaden = this.getVermoegensschaden();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermoegensschaden", theVermoegensschaden), currentHashCode, theVermoegensschaden, (this.vermoegensschaden!= null));
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
        if (draftCopy instanceof CTBetriebswagnis) {
            final CTBetriebswagnis copy = ((CTBetriebswagnis) draftCopy);
            {
                Boolean betriebsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty())));
                if (betriebsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceBetriebsart;
                    sourceBetriebsart = (((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))?this.getBetriebsart():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyBetriebsart = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "betriebsart", sourceBetriebsart), sourceBetriebsart, ((this.betriebsart!= null)&&(!this.betriebsart.isEmpty()))));
                    copy.betriebsart = null;
                    if (copyBetriebsart!= null) {
                        List<String> uniqueBetriebsartl = copy.getBetriebsart();
                        uniqueBetriebsartl.addAll(copyBetriebsart);
                    }
                } else {
                    if (betriebsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betriebsart = null;
                    }
                }
            }
            {
                Boolean stichwortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stichwort!= null));
                if (stichwortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStichwort;
                    sourceStichwort = this.getStichwort();
                    String copyStichwort = ((String) strategy.copy(LocatorUtils.property(locator, "stichwort", sourceStichwort), sourceStichwort, (this.stichwort!= null)));
                    copy.setStichwort(copyStichwort);
                } else {
                    if (stichwortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stichwort = null;
                    }
                }
            }
            {
                Boolean anteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anteil!= null));
                if (anteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceAnteil;
                    sourceAnteil = this.getAnteil();
                    BigDecimal copyAnteil = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "anteil", sourceAnteil), sourceAnteil, (this.anteil!= null)));
                    copy.setAnteil(copyAnteil);
                } else {
                    if (anteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anteil = null;
                    }
                }
            }
            {
                Boolean werteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.werteinheit!= null));
                if (werteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceWerteinheit;
                    sourceWerteinheit = this.getWerteinheit();
                    STWerteinheit copyWerteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "werteinheit", sourceWerteinheit), sourceWerteinheit, (this.werteinheit!= null)));
                    copy.setWerteinheit(copyWerteinheit);
                } else {
                    if (werteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.werteinheit = null;
                    }
                }
            }
            {
                Boolean umweltbasisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umweltbasis!= null));
                if (umweltbasisShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTUmweltbasis sourceUmweltbasis;
                    sourceUmweltbasis = this.getUmweltbasis();
                    CTUmweltbasis copyUmweltbasis = ((CTUmweltbasis) strategy.copy(LocatorUtils.property(locator, "umweltbasis", sourceUmweltbasis), sourceUmweltbasis, (this.umweltbasis!= null)));
                    copy.setUmweltbasis(copyUmweltbasis);
                } else {
                    if (umweltbasisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umweltbasis = null;
                    }
                }
            }
            {
                Boolean umweltschadenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.umweltschaden!= null));
                if (umweltschadenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTUmweltschaden sourceUmweltschaden;
                    sourceUmweltschaden = this.getUmweltschaden();
                    CTUmweltschaden copyUmweltschaden = ((CTUmweltschaden) strategy.copy(LocatorUtils.property(locator, "umweltschaden", sourceUmweltschaden), sourceUmweltschaden, (this.umweltschaden!= null)));
                    copy.setUmweltschaden(copyUmweltschaden);
                } else {
                    if (umweltschadenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.umweltschaden = null;
                    }
                }
            }
            {
                Boolean betriebshaftpflichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.betriebshaftpflicht!= null));
                if (betriebshaftpflichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBetriebshaftpflicht sourceBetriebshaftpflicht;
                    sourceBetriebshaftpflicht = this.getBetriebshaftpflicht();
                    CTBetriebshaftpflicht copyBetriebshaftpflicht = ((CTBetriebshaftpflicht) strategy.copy(LocatorUtils.property(locator, "betriebshaftpflicht", sourceBetriebshaftpflicht), sourceBetriebshaftpflicht, (this.betriebshaftpflicht!= null)));
                    copy.setBetriebshaftpflicht(copyBetriebshaftpflicht);
                } else {
                    if (betriebshaftpflichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betriebshaftpflicht = null;
                    }
                }
            }
            {
                Boolean vermoegensschadenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vermoegensschaden!= null));
                if (vermoegensschadenShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTVermoegensschaden sourceVermoegensschaden;
                    sourceVermoegensschaden = this.getVermoegensschaden();
                    CTVermoegensschaden copyVermoegensschaden = ((CTVermoegensschaden) strategy.copy(LocatorUtils.property(locator, "vermoegensschaden", sourceVermoegensschaden), sourceVermoegensschaden, (this.vermoegensschaden!= null)));
                    copy.setVermoegensschaden(copyVermoegensschaden);
                } else {
                    if (vermoegensschadenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermoegensschaden = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBetriebswagnis();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withBetriebsart(String... values) {
        if (values!= null) {
            for (String value: values) {
                getBetriebsart().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withBetriebsart(Collection<String> values) {
        if (values!= null) {
            getBetriebsart().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withStichwort(String value) {
        setStichwort(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withAnteil(BigDecimal value) {
        setAnteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWerteinheit(STWerteinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withUmweltbasis(CTUmweltbasis value) {
        setUmweltbasis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withUmweltschaden(CTUmweltschaden value) {
        setUmweltschaden(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withBetriebshaftpflicht(CTBetriebshaftpflicht value) {
        setBetriebshaftpflicht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withVermoegensschaden(CTVermoegensschaden value) {
        setVermoegensschaden(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWagnisart(STEWagnisart value) {
        setWagnisart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withBerechnungseinheit(STBerechnungseinheitHaftpflicht value) {
        setBerechnungseinheit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWagnismenge(BigDecimal value) {
        setWagnismenge(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withJagd(CTJagd value) {
        setJagd(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withPrivat(CTPrivat value) {
        setPrivat(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWassersport(CTWassersport value) {
        setWassersport(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withTierhalter(CTTierhalter value) {
        setTierhalter(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withVorschaden(CTVorschaden... values) {
        if (values!= null) {
            for (CTVorschaden value: values) {
                getVorschaden().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withVorschaden(Collection<CTVorschaden> values) {
        if (values!= null) {
            getVorschaden().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withHausUndGrundbesitzer(CTHausUndGrundbesitzer value) {
        setHausUndGrundbesitzer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withGewaesserschaden(CTGewaesserschaden value) {
        setGewaesserschaden(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withBauherren(CTBauherren value) {
        setBauherren(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withFragenkomplex(CTFragenkomplex... values) {
        if (values!= null) {
            for (CTFragenkomplex value: values) {
                getFragenkomplex().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withFragenkomplex(Collection<CTFragenkomplex> values) {
        if (values!= null) {
            getFragenkomplex().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWagnistext(String value) {
        setWagnistext(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWagnisbeschreibung(String value) {
        setWagnisbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withHauptwagnis(CTHauptwagnis value) {
        setHauptwagnis(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withKlassifizierung(STEKlassifizierungHaftpflicht value) {
        setKlassifizierung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withWerteinheitBerechnungseinheit(STWerteinheit value) {
        setWerteinheitBerechnungseinheit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withErlaeuterungBerechnungseinheit(String value) {
        setErlaeuterungBerechnungseinheit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withBerechnungsart(STBerechnungsart value) {
        setBerechnungsart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withAktivitaetID(String value) {
        setAktivitaetID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBetriebswagnis withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
