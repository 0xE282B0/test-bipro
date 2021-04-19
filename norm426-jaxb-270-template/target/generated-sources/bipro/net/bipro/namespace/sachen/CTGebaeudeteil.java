
package net.bipro.namespace.sachen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STEGebaeudeteil;
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
 * Teil eines Gebäudes, z. B. eine Wohnung, ein Raum, ein sonstiger Gebäudeteil.
 * 
 * <p>Java class for CT_Gebaeudeteil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gebaeudeteil"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}STE_Gebaeudeteil"/&gt;
 *         &lt;element name="Stockwerk" type="{http://www.bipro.net/namespace/datentypen}ST_Text025" minOccurs="0"/&gt;
 *         &lt;element name="Eigentuemer" type="{http://www.bipro.net/namespace/sachen}CT_Eigentuemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mieter" type="{http://www.bipro.net/namespace/sachen}CT_Mieter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vermieter" type="{http://www.bipro.net/namespace/sachen}CT_Vermieter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Konstruktion" type="{http://www.bipro.net/namespace/sachen}CT_Konstruktion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gebaeudeteil", propOrder = {
    "artID",
    "stockwerk",
    "eigentuemer",
    "mieter",
    "vermieter",
    "konstruktion"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGebaeudeteil
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEGebaeudeteil artID;
    @XmlElement(name = "Stockwerk")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String stockwerk;
    @XmlElement(name = "Eigentuemer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTEigentuemer> eigentuemer;
    @XmlElement(name = "Mieter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTMieter> mieter;
    @XmlElement(name = "Vermieter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTVermieter> vermieter;
    @XmlElement(name = "Konstruktion")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTKonstruktion> konstruktion;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STEGebaeudeteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEGebaeudeteil getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGebaeudeteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STEGebaeudeteil value) {
        this.artID = value;
    }

    /**
     * Gets the value of the stockwerk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getStockwerk() {
        return stockwerk;
    }

    /**
     * Sets the value of the stockwerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setStockwerk(String value) {
        this.stockwerk = value;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTEigentuemer> getEigentuemer() {
        if (eigentuemer == null) {
            eigentuemer = new ArrayList<CTEigentuemer>();
        }
        return this.eigentuemer;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTMieter> getMieter() {
        if (mieter == null) {
            mieter = new ArrayList<CTMieter>();
        }
        return this.mieter;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTVermieter> getVermieter() {
        if (vermieter == null) {
            vermieter = new ArrayList<CTVermieter>();
        }
        return this.vermieter;
    }

    /**
     * Gets the value of the konstruktion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the konstruktion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKonstruktion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKonstruktion }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTKonstruktion> getKonstruktion() {
        if (konstruktion == null) {
            konstruktion = new ArrayList<CTKonstruktion>();
        }
        return this.konstruktion;
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
        final CTGebaeudeteil that = ((CTGebaeudeteil) object);
        {
            STEGebaeudeteil lhsArtID;
            lhsArtID = this.getArtID();
            STEGebaeudeteil rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsStockwerk;
            lhsStockwerk = this.getStockwerk();
            String rhsStockwerk;
            rhsStockwerk = that.getStockwerk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stockwerk", lhsStockwerk), LocatorUtils.property(thatLocator, "stockwerk", rhsStockwerk), lhsStockwerk, rhsStockwerk, (this.stockwerk!= null), (that.stockwerk!= null))) {
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
            List<CTMieter> lhsMieter;
            lhsMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
            List<CTMieter> rhsMieter;
            rhsMieter = (((that.mieter!= null)&&(!that.mieter.isEmpty()))?that.getMieter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mieter", lhsMieter), LocatorUtils.property(thatLocator, "mieter", rhsMieter), lhsMieter, rhsMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty())), ((that.mieter!= null)&&(!that.mieter.isEmpty())))) {
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
            List<CTKonstruktion> lhsKonstruktion;
            lhsKonstruktion = (((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))?this.getKonstruktion():null);
            List<CTKonstruktion> rhsKonstruktion;
            rhsKonstruktion = (((that.konstruktion!= null)&&(!that.konstruktion.isEmpty()))?that.getKonstruktion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "konstruktion", lhsKonstruktion), LocatorUtils.property(thatLocator, "konstruktion", rhsKonstruktion), lhsKonstruktion, rhsKonstruktion, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty())), ((that.konstruktion!= null)&&(!that.konstruktion.isEmpty())))) {
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
            STEGebaeudeteil theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theStockwerk;
            theStockwerk = this.getStockwerk();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stockwerk", theStockwerk), currentHashCode, theStockwerk, (this.stockwerk!= null));
        }
        {
            List<CTEigentuemer> theEigentuemer;
            theEigentuemer = (((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty()))?this.getEigentuemer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eigentuemer", theEigentuemer), currentHashCode, theEigentuemer, ((this.eigentuemer!= null)&&(!this.eigentuemer.isEmpty())));
        }
        {
            List<CTMieter> theMieter;
            theMieter = (((this.mieter!= null)&&(!this.mieter.isEmpty()))?this.getMieter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mieter", theMieter), currentHashCode, theMieter, ((this.mieter!= null)&&(!this.mieter.isEmpty())));
        }
        {
            List<CTVermieter> theVermieter;
            theVermieter = (((this.vermieter!= null)&&(!this.vermieter.isEmpty()))?this.getVermieter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vermieter", theVermieter), currentHashCode, theVermieter, ((this.vermieter!= null)&&(!this.vermieter.isEmpty())));
        }
        {
            List<CTKonstruktion> theKonstruktion;
            theKonstruktion = (((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))?this.getKonstruktion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "konstruktion", theKonstruktion), currentHashCode, theKonstruktion, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty())));
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
        if (draftCopy instanceof CTGebaeudeteil) {
            final CTGebaeudeteil copy = ((CTGebaeudeteil) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGebaeudeteil sourceArtID;
                    sourceArtID = this.getArtID();
                    STEGebaeudeteil copyArtID = ((STEGebaeudeteil) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean stockwerkShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stockwerk!= null));
                if (stockwerkShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStockwerk;
                    sourceStockwerk = this.getStockwerk();
                    String copyStockwerk = ((String) strategy.copy(LocatorUtils.property(locator, "stockwerk", sourceStockwerk), sourceStockwerk, (this.stockwerk!= null)));
                    copy.setStockwerk(copyStockwerk);
                } else {
                    if (stockwerkShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stockwerk = null;
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
                Boolean konstruktionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty())));
                if (konstruktionShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTKonstruktion> sourceKonstruktion;
                    sourceKonstruktion = (((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))?this.getKonstruktion():null);
                    @SuppressWarnings("unchecked")
                    List<CTKonstruktion> copyKonstruktion = ((List<CTKonstruktion> ) strategy.copy(LocatorUtils.property(locator, "konstruktion", sourceKonstruktion), sourceKonstruktion, ((this.konstruktion!= null)&&(!this.konstruktion.isEmpty()))));
                    copy.konstruktion = null;
                    if (copyKonstruktion!= null) {
                        List<CTKonstruktion> uniqueKonstruktionl = copy.getKonstruktion();
                        uniqueKonstruktionl.addAll(copyKonstruktion);
                    }
                } else {
                    if (konstruktionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.konstruktion = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGebaeudeteil();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withArtID(STEGebaeudeteil value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withStockwerk(String value) {
        setStockwerk(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withEigentuemer(CTEigentuemer... values) {
        if (values!= null) {
            for (CTEigentuemer value: values) {
                getEigentuemer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withEigentuemer(Collection<CTEigentuemer> values) {
        if (values!= null) {
            getEigentuemer().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withMieter(CTMieter... values) {
        if (values!= null) {
            for (CTMieter value: values) {
                getMieter().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withMieter(Collection<CTMieter> values) {
        if (values!= null) {
            getMieter().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withVermieter(CTVermieter... values) {
        if (values!= null) {
            for (CTVermieter value: values) {
                getVermieter().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withVermieter(Collection<CTVermieter> values) {
        if (values!= null) {
            getVermieter().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withKonstruktion(CTKonstruktion... values) {
        if (values!= null) {
            for (CTKonstruktion value: values) {
                getKonstruktion().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withKonstruktion(Collection<CTKonstruktion> values) {
        if (values!= null) {
            getKonstruktion().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudeteil withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
