
package net.bipro.namespace.sachen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STGrundstueckart;
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
 * <p>Java class for CT_Grundstueck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Grundstueck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Flaeche" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Werteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="UeberdachteFlaeche" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Eigentuemer" type="{http://www.bipro.net/namespace/sachen}CT_Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vermieter" type="{http://www.bipro.net/namespace/sachen}CT_Vermieter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mieter" type="{http://www.bipro.net/namespace/sachen}CT_Mieter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Objektanschrift" type="{http://www.bipro.net/namespace/sachen}CT_Objektanschrift" minOccurs="0"/&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Grundstueckart" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Grundstueck", propOrder = {
    "flaeche",
    "werteinheit",
    "ueberdachteFlaeche",
    "eigentuemer",
    "vermieter",
    "mieter",
    "objektanschrift",
    "artID"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGrundstueck
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Flaeche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal flaeche;
    @XmlElement(name = "Werteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit werteinheit;
    @XmlElement(name = "UeberdachteFlaeche")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal ueberdachteFlaeche;
    @XmlElement(name = "Eigentuemer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTEigentuemer> eigentuemer;
    @XmlElement(name = "Vermieter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVermieter> vermieter;
    @XmlElement(name = "Mieter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTMieter> mieter;
    @XmlElement(name = "Objektanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTObjektanschrift objektanschrift;
    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STGrundstueckart artID;

    /**
     * Gets the value of the flaeche property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getFlaeche() {
        return flaeche;
    }

    /**
     * Sets the value of the flaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFlaeche(BigDecimal value) {
        this.flaeche = value;
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
     * Gets the value of the ueberdachteFlaeche property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getUeberdachteFlaeche() {
        return ueberdachteFlaeche;
    }

    /**
     * Sets the value of the ueberdachteFlaeche property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUeberdachteFlaeche(BigDecimal value) {
        this.ueberdachteFlaeche = value;
    }

    /**
     * Gets the value of the eigentuemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eigentuemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEigentuemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTEigentuemer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTEigentuemer> getEigentuemer() {
        if (eigentuemer == null) {
            eigentuemer = new ArrayList<CTEigentuemer>();
        }
        return this.eigentuemer;
    }

    /**
     * Gets the value of the vermieter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vermieter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVermieter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVermieter }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVermieter> getVermieter() {
        if (vermieter == null) {
            vermieter = new ArrayList<CTVermieter>();
        }
        return this.vermieter;
    }

    /**
     * Gets the value of the mieter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mieter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMieter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMieter }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTMieter> getMieter() {
        if (mieter == null) {
            mieter = new ArrayList<CTMieter>();
        }
        return this.mieter;
    }

    /**
     * Gets the value of the objektanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link CTObjektanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift getObjektanschrift() {
        return objektanschrift;
    }

    /**
     * Sets the value of the objektanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTObjektanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setObjektanschrift(CTObjektanschrift value) {
        this.objektanschrift = value;
    }

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STGrundstueckart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STGrundstueckart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGrundstueckart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STGrundstueckart value) {
        this.artID = value;
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
        final CTGrundstueck that = ((CTGrundstueck) object);
        {
            BigDecimal lhsFlaeche;
            lhsFlaeche = this.getFlaeche();
            BigDecimal rhsFlaeche;
            rhsFlaeche = that.getFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flaeche", lhsFlaeche), LocatorUtils.property(thatLocator, "flaeche", rhsFlaeche), lhsFlaeche, rhsFlaeche, (this.flaeche!= null), (that.flaeche!= null))) {
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
            BigDecimal lhsUeberdachteFlaeche;
            lhsUeberdachteFlaeche = this.getUeberdachteFlaeche();
            BigDecimal rhsUeberdachteFlaeche;
            rhsUeberdachteFlaeche = that.getUeberdachteFlaeche();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ueberdachteFlaeche", lhsUeberdachteFlaeche), LocatorUtils.property(thatLocator, "ueberdachteFlaeche", rhsUeberdachteFlaeche), lhsUeberdachteFlaeche, rhsUeberdachteFlaeche, (this.ueberdachteFlaeche!= null), (that.ueberdachteFlaeche!= null))) {
                return false;
            }
        }
        {
            List<CTEigentuemer> lhsEigentuemer;
            lhsEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
            List<CTEigentuemer> rhsEigentuemer;
            rhsEigentuemer = (((that.eigentuemer!= null)&&(!that.eigentuemer.isEmpty()))?that.getEigentuemer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eigentuemer", lhsEigentuemer), LocatorUtils.property(thatLocator, "eigentuemer", rhsEigentuemer), lhsEigentuemer, rhsEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())), ((that.eigentuemer!= null)&&(!that.eigentuemer.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTVermieter> lhsVermieter;
            lhsVermieter = (((this.vermieter!= null)&&(!this.vermieter.isEmpty()))?this.getVermieter():null);
            List<CTVermieter> rhsVermieter;
            rhsVermieter = (((that.vermieter!= null)&&(!that.vermieter.isEmpty()))?that.getVermieter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vermieter", lhsVermieter), LocatorUtils.property(thatLocator, "vermieter", rhsVermieter), lhsVermieter, rhsVermieter, ((this.vermieter!= null)&&(!this.vermieter.isEmpty())), ((that.vermieter!= null)&&(!that.vermieter.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTMieter> lhsMieter;
            lhsMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
            List<CTMieter> rhsMieter;
            rhsMieter = (((that.mieter!= null)&&(!that.mieter.isEmpty()))?that.getMieter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieter", lhsMieter), LocatorUtils.property(thatLocator, "mieter", rhsMieter), lhsMieter, rhsMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty())), ((that.mieter!= null)&&(!that.mieter.isEmpty())))) {
                return false;
            }
        }
        {
            CTObjektanschrift lhsObjektanschrift;
            lhsObjektanschrift = this.getObjektanschrift();
            CTObjektanschrift rhsObjektanschrift;
            rhsObjektanschrift = that.getObjektanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektanschrift", lhsObjektanschrift), LocatorUtils.property(thatLocator, "objektanschrift", rhsObjektanschrift), lhsObjektanschrift, rhsObjektanschrift, (this.objektanschrift!= null), (that.objektanschrift!= null))) {
                return false;
            }
        }
        {
            STGrundstueckart lhsArtID;
            lhsArtID = this.getArtID();
            STGrundstueckart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
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
            BigDecimal theFlaeche;
            theFlaeche = this.getFlaeche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flaeche", theFlaeche), currentHashCode, theFlaeche, (this.flaeche!= null));
        }
        {
            STWerteinheit theWerteinheit;
            theWerteinheit = this.getWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "werteinheit", theWerteinheit), currentHashCode, theWerteinheit, (this.werteinheit!= null));
        }
        {
            BigDecimal theUeberdachteFlaeche;
            theUeberdachteFlaeche = this.getUeberdachteFlaeche();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ueberdachteFlaeche", theUeberdachteFlaeche), currentHashCode, theUeberdachteFlaeche, (this.ueberdachteFlaeche!= null));
        }
        {
            List<CTEigentuemer> theEigentuemer;
            theEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eigentuemer", theEigentuemer), currentHashCode, theEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())));
        }
        {
            List<CTVermieter> theVermieter;
            theVermieter = (((this.vermieter!= null)&&(!this.vermieter.isEmpty()))?this.getVermieter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermieter", theVermieter), currentHashCode, theVermieter, ((this.vermieter!= null)&&(!this.vermieter.isEmpty())));
        }
        {
            List<CTMieter> theMieter;
            theMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mieter", theMieter), currentHashCode, theMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty())));
        }
        {
            CTObjektanschrift theObjektanschrift;
            theObjektanschrift = this.getObjektanschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objektanschrift", theObjektanschrift), currentHashCode, theObjektanschrift, (this.objektanschrift!= null));
        }
        {
            STGrundstueckart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
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
        if (draftCopy instanceof CTGrundstueck) {
            final CTGrundstueck copy = ((CTGrundstueck) draftCopy);
            {
                Boolean flaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flaeche!= null));
                if (flaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFlaeche;
                    sourceFlaeche = this.getFlaeche();
                    BigDecimal copyFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "flaeche", sourceFlaeche), sourceFlaeche, (this.flaeche!= null)));
                    copy.setFlaeche(copyFlaeche);
                } else {
                    if (flaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flaeche = null;
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
                Boolean ueberdachteFlaecheShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ueberdachteFlaeche!= null));
                if (ueberdachteFlaecheShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceUeberdachteFlaeche;
                    sourceUeberdachteFlaeche = this.getUeberdachteFlaeche();
                    BigDecimal copyUeberdachteFlaeche = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "ueberdachteFlaeche", sourceUeberdachteFlaeche), sourceUeberdachteFlaeche, (this.ueberdachteFlaeche!= null)));
                    copy.setUeberdachteFlaeche(copyUeberdachteFlaeche);
                } else {
                    if (ueberdachteFlaecheShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ueberdachteFlaeche = null;
                    }
                }
            }
            {
                Boolean eigentuemerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())));
                if (eigentuemerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTEigentuemer> sourceEigentuemer;
                    sourceEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
                    @SuppressWarnings("unchecked")
                    List<CTEigentuemer> copyEigentuemer = ((List<CTEigentuemer> ) strategy.copy(LocatorUtils.property(locator, "eigentuemer", sourceEigentuemer), sourceEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))));
                    copy.eigentuemer = null;
                    if (copyEigentuemer!= null) {
                        List<CTEigentuemer> uniqueEigentuemerl = copy.getEigentuemer();
                        uniqueEigentuemerl.addAll(copyEigentuemer);
                    }
                } else {
                    if (eigentuemerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eigentuemer = null;
                    }
                }
            }
            {
                Boolean vermieterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vermieter!= null)&&(!this.vermieter.isEmpty())));
                if (vermieterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVermieter> sourceVermieter;
                    sourceVermieter = (((this.vermieter!= null)&&(!this.vermieter.isEmpty()))?this.getVermieter():null);
                    @SuppressWarnings("unchecked")
                    List<CTVermieter> copyVermieter = ((List<CTVermieter> ) strategy.copy(LocatorUtils.property(locator, "vermieter", sourceVermieter), sourceVermieter, ((this.vermieter!= null)&&(!this.vermieter.isEmpty()))));
                    copy.vermieter = null;
                    if (copyVermieter!= null) {
                        List<CTVermieter> uniqueVermieterl = copy.getVermieter();
                        uniqueVermieterl.addAll(copyVermieter);
                    }
                } else {
                    if (vermieterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vermieter = null;
                    }
                }
            }
            {
                Boolean mieterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mieter!= null)&&(!this.mieter.isEmpty())));
                if (mieterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTMieter> sourceMieter;
                    sourceMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
                    @SuppressWarnings("unchecked")
                    List<CTMieter> copyMieter = ((List<CTMieter> ) strategy.copy(LocatorUtils.property(locator, "mieter", sourceMieter), sourceMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty()))));
                    copy.mieter = null;
                    if (copyMieter!= null) {
                        List<CTMieter> uniqueMieterl = copy.getMieter();
                        uniqueMieterl.addAll(copyMieter);
                    }
                } else {
                    if (mieterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mieter = null;
                    }
                }
            }
            {
                Boolean objektanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektanschrift!= null));
                if (objektanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTObjektanschrift sourceObjektanschrift;
                    sourceObjektanschrift = this.getObjektanschrift();
                    CTObjektanschrift copyObjektanschrift = ((CTObjektanschrift) strategy.copy(LocatorUtils.property(locator, "objektanschrift", sourceObjektanschrift), sourceObjektanschrift, (this.objektanschrift!= null)));
                    copy.setObjektanschrift(copyObjektanschrift);
                } else {
                    if (objektanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektanschrift = null;
                    }
                }
            }
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGrundstueckart sourceArtID;
                    sourceArtID = this.getArtID();
                    STGrundstueckart copyArtID = ((STGrundstueckart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGrundstueck();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withFlaeche(BigDecimal value) {
        setFlaeche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withWerteinheit(STWerteinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withUeberdachteFlaeche(BigDecimal value) {
        setUeberdachteFlaeche(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withEigentuemer(CTEigentuemer... values) {
        if (values!= null) {
            for (CTEigentuemer value: values) {
                getEigentuemer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withEigentuemer(Collection<CTEigentuemer> values) {
        if (values!= null) {
            getEigentuemer().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withVermieter(CTVermieter... values) {
        if (values!= null) {
            for (CTVermieter value: values) {
                getVermieter().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withVermieter(Collection<CTVermieter> values) {
        if (values!= null) {
            getVermieter().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withMieter(CTMieter... values) {
        if (values!= null) {
            for (CTMieter value: values) {
                getMieter().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withMieter(Collection<CTMieter> values) {
        if (values!= null) {
            getMieter().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withObjektanschrift(CTObjektanschrift value) {
        setObjektanschrift(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withArtID(STGrundstueckart value) {
        setArtID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGrundstueck withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
