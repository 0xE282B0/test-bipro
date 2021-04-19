
package net.bipro.namespace.sachen;

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
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STWerteinheit;
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
 * Klasse zur Beschreibung eines Betriebes als Risikoobjekt und dessen Anteil bei gemischter Nutzung und Mischbetrieben.
 * 
 * <p>Java class for CT_Betrieb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Betrieb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Betriebsart" type="{http://www.bipro.net/namespace/datentypen}ST_Betriebsart" minOccurs="0"/&gt;
 *         &lt;element name="Stichwort" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Anteil" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Werteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Betrieb", propOrder = {
    "betriebsart",
    "stichwort",
    "anteil",
    "werteinheit"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTBetrieb
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlList
    @XmlElement(name = "Betriebsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<String> betriebsart;
    @XmlElement(name = "Stichwort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String stichwort;
    @XmlElement(name = "Anteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal anteil;
    @XmlElement(name = "Werteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit werteinheit;

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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWerteinheit(STWerteinheit value) {
        this.werteinheit = value;
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
        final CTBetrieb that = ((CTBetrieb) object);
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
        if (draftCopy instanceof CTBetrieb) {
            final CTBetrieb copy = ((CTBetrieb) draftCopy);
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBetrieb();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withBetriebsart(String... values) {
        if (values!= null) {
            for (String value: values) {
                getBetriebsart().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withBetriebsart(Collection<String> values) {
        if (values!= null) {
            getBetriebsart().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withStichwort(String value) {
        setStichwort(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withAnteil(BigDecimal value) {
        setAnteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withWerteinheit(STWerteinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBetrieb withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
