
package net.bipro.namespace.versicherung.haftpflicht;

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
import net.bipro.namespace.datentypen.STMitversicherungsart;
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
 * <p>Java class for CT_Privat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Privat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mitversicherungsart" type="{http://www.bipro.net/namespace/datentypen}ST_Mitversicherungsart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MitversicherterAngehoeriger" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_MitversicherterAngehoeriger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MitversichertePerson" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_MitversichertePerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MitversicherteNichtehelicheLebensgemeinschaft" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_MitversicherteNichtehelicheLebensgemeinschaft" minOccurs="0"/&gt;
 *         &lt;element name="DiensthaftpflichtGiltFuer" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_DiensthaftpflichtGiltFuer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Privat", propOrder = {
    "mitversicherungsart",
    "mitversicherterAngehoeriger",
    "mitversichertePerson",
    "mitversicherteNichtehelicheLebensgemeinschaft",
    "diensthaftpflichtGiltFuer"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTPrivat
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Mitversicherungsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STMitversicherungsart> mitversicherungsart;
    @XmlElement(name = "MitversicherterAngehoeriger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTMitversicherterAngehoeriger> mitversicherterAngehoeriger;
    @XmlElement(name = "MitversichertePerson")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTMitversichertePerson> mitversichertePerson;
    @XmlElement(name = "MitversicherteNichtehelicheLebensgemeinschaft")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTMitversicherteNichtehelicheLebensgemeinschaft mitversicherteNichtehelicheLebensgemeinschaft;
    @XmlElement(name = "DiensthaftpflichtGiltFuer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDiensthaftpflichtGiltFuer> diensthaftpflichtGiltFuer;

    /**
     * Gets the value of the mitversicherungsart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitversicherungsart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMitversicherungsart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMitversicherungsart }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<STMitversicherungsart> getMitversicherungsart() {
        if (mitversicherungsart == null) {
            mitversicherungsart = new ArrayList<STMitversicherungsart>();
        }
        return this.mitversicherungsart;
    }

    /**
     * Gets the value of the mitversicherterAngehoeriger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitversicherterAngehoeriger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMitversicherterAngehoeriger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMitversicherterAngehoeriger }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTMitversicherterAngehoeriger> getMitversicherterAngehoeriger() {
        if (mitversicherterAngehoeriger == null) {
            mitversicherterAngehoeriger = new ArrayList<CTMitversicherterAngehoeriger>();
        }
        return this.mitversicherterAngehoeriger;
    }

    /**
     * Gets the value of the mitversichertePerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitversichertePerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMitversichertePerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMitversichertePerson }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTMitversichertePerson> getMitversichertePerson() {
        if (mitversichertePerson == null) {
            mitversichertePerson = new ArrayList<CTMitversichertePerson>();
        }
        return this.mitversichertePerson;
    }

    /**
     * Gets the value of the mitversicherteNichtehelicheLebensgemeinschaft property.
     * 
     * @return
     *     possible object is
     *     {@link CTMitversicherteNichtehelicheLebensgemeinschaft }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTMitversicherteNichtehelicheLebensgemeinschaft getMitversicherteNichtehelicheLebensgemeinschaft() {
        return mitversicherteNichtehelicheLebensgemeinschaft;
    }

    /**
     * Sets the value of the mitversicherteNichtehelicheLebensgemeinschaft property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTMitversicherteNichtehelicheLebensgemeinschaft }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMitversicherteNichtehelicheLebensgemeinschaft(CTMitversicherteNichtehelicheLebensgemeinschaft value) {
        this.mitversicherteNichtehelicheLebensgemeinschaft = value;
    }

    /**
     * Gets the value of the diensthaftpflichtGiltFuer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diensthaftpflichtGiltFuer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiensthaftpflichtGiltFuer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDiensthaftpflichtGiltFuer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDiensthaftpflichtGiltFuer> getDiensthaftpflichtGiltFuer() {
        if (diensthaftpflichtGiltFuer == null) {
            diensthaftpflichtGiltFuer = new ArrayList<CTDiensthaftpflichtGiltFuer>();
        }
        return this.diensthaftpflichtGiltFuer;
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
        final CTPrivat that = ((CTPrivat) object);
        {
            List<STMitversicherungsart> lhsMitversicherungsart;
            lhsMitversicherungsart = (((this.mitversicherungsart!= null)&&(!this.mitversicherungsart.isEmpty()))?this.getMitversicherungsart():null);
            List<STMitversicherungsart> rhsMitversicherungsart;
            rhsMitversicherungsart = (((that.mitversicherungsart!= null)&&(!that.mitversicherungsart.isEmpty()))?that.getMitversicherungsart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitversicherungsart", lhsMitversicherungsart), LocatorUtils.property(thatLocator, "mitversicherungsart", rhsMitversicherungsart), lhsMitversicherungsart, rhsMitversicherungsart, ((this.mitversicherungsart!= null)&&(!this.mitversicherungsart.isEmpty())), ((that.mitversicherungsart!= null)&&(!that.mitversicherungsart.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTMitversicherterAngehoeriger> lhsMitversicherterAngehoeriger;
            lhsMitversicherterAngehoeriger = (((this.mitversicherterAngehoeriger!= null)&&(!this.mitversicherterAngehoeriger.isEmpty()))?this.getMitversicherterAngehoeriger():null);
            List<CTMitversicherterAngehoeriger> rhsMitversicherterAngehoeriger;
            rhsMitversicherterAngehoeriger = (((that.mitversicherterAngehoeriger!= null)&&(!that.mitversicherterAngehoeriger.isEmpty()))?that.getMitversicherterAngehoeriger():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitversicherterAngehoeriger", lhsMitversicherterAngehoeriger), LocatorUtils.property(thatLocator, "mitversicherterAngehoeriger", rhsMitversicherterAngehoeriger), lhsMitversicherterAngehoeriger, rhsMitversicherterAngehoeriger, ((this.mitversicherterAngehoeriger!= null)&&(!this.mitversicherterAngehoeriger.isEmpty())), ((that.mitversicherterAngehoeriger!= null)&&(!that.mitversicherterAngehoeriger.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTMitversichertePerson> lhsMitversichertePerson;
            lhsMitversichertePerson = (((this.mitversichertePerson!= null)&&(!this.mitversichertePerson.isEmpty()))?this.getMitversichertePerson():null);
            List<CTMitversichertePerson> rhsMitversichertePerson;
            rhsMitversichertePerson = (((that.mitversichertePerson!= null)&&(!that.mitversichertePerson.isEmpty()))?that.getMitversichertePerson():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitversichertePerson", lhsMitversichertePerson), LocatorUtils.property(thatLocator, "mitversichertePerson", rhsMitversichertePerson), lhsMitversichertePerson, rhsMitversichertePerson, ((this.mitversichertePerson!= null)&&(!this.mitversichertePerson.isEmpty())), ((that.mitversichertePerson!= null)&&(!that.mitversichertePerson.isEmpty())))) {
                return false;
            }
        }
        {
            CTMitversicherteNichtehelicheLebensgemeinschaft lhsMitversicherteNichtehelicheLebensgemeinschaft;
            lhsMitversicherteNichtehelicheLebensgemeinschaft = this.getMitversicherteNichtehelicheLebensgemeinschaft();
            CTMitversicherteNichtehelicheLebensgemeinschaft rhsMitversicherteNichtehelicheLebensgemeinschaft;
            rhsMitversicherteNichtehelicheLebensgemeinschaft = that.getMitversicherteNichtehelicheLebensgemeinschaft();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitversicherteNichtehelicheLebensgemeinschaft", lhsMitversicherteNichtehelicheLebensgemeinschaft), LocatorUtils.property(thatLocator, "mitversicherteNichtehelicheLebensgemeinschaft", rhsMitversicherteNichtehelicheLebensgemeinschaft), lhsMitversicherteNichtehelicheLebensgemeinschaft, rhsMitversicherteNichtehelicheLebensgemeinschaft, (this.mitversicherteNichtehelicheLebensgemeinschaft!= null), (that.mitversicherteNichtehelicheLebensgemeinschaft!= null))) {
                return false;
            }
        }
        {
            List<CTDiensthaftpflichtGiltFuer> lhsDiensthaftpflichtGiltFuer;
            lhsDiensthaftpflichtGiltFuer = (((this.diensthaftpflichtGiltFuer!= null)&&(!this.diensthaftpflichtGiltFuer.isEmpty()))?this.getDiensthaftpflichtGiltFuer():null);
            List<CTDiensthaftpflichtGiltFuer> rhsDiensthaftpflichtGiltFuer;
            rhsDiensthaftpflichtGiltFuer = (((that.diensthaftpflichtGiltFuer!= null)&&(!that.diensthaftpflichtGiltFuer.isEmpty()))?that.getDiensthaftpflichtGiltFuer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diensthaftpflichtGiltFuer", lhsDiensthaftpflichtGiltFuer), LocatorUtils.property(thatLocator, "diensthaftpflichtGiltFuer", rhsDiensthaftpflichtGiltFuer), lhsDiensthaftpflichtGiltFuer, rhsDiensthaftpflichtGiltFuer, ((this.diensthaftpflichtGiltFuer!= null)&&(!this.diensthaftpflichtGiltFuer.isEmpty())), ((that.diensthaftpflichtGiltFuer!= null)&&(!that.diensthaftpflichtGiltFuer.isEmpty())))) {
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
            List<STMitversicherungsart> theMitversicherungsart;
            theMitversicherungsart = (((this.mitversicherungsart!= null)&&(!this.mitversicherungsart.isEmpty()))?this.getMitversicherungsart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitversicherungsart", theMitversicherungsart), currentHashCode, theMitversicherungsart, ((this.mitversicherungsart!= null)&&(!this.mitversicherungsart.isEmpty())));
        }
        {
            List<CTMitversicherterAngehoeriger> theMitversicherterAngehoeriger;
            theMitversicherterAngehoeriger = (((this.mitversicherterAngehoeriger!= null)&&(!this.mitversicherterAngehoeriger.isEmpty()))?this.getMitversicherterAngehoeriger():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitversicherterAngehoeriger", theMitversicherterAngehoeriger), currentHashCode, theMitversicherterAngehoeriger, ((this.mitversicherterAngehoeriger!= null)&&(!this.mitversicherterAngehoeriger.isEmpty())));
        }
        {
            List<CTMitversichertePerson> theMitversichertePerson;
            theMitversichertePerson = (((this.mitversichertePerson!= null)&&(!this.mitversichertePerson.isEmpty()))?this.getMitversichertePerson():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitversichertePerson", theMitversichertePerson), currentHashCode, theMitversichertePerson, ((this.mitversichertePerson!= null)&&(!this.mitversichertePerson.isEmpty())));
        }
        {
            CTMitversicherteNichtehelicheLebensgemeinschaft theMitversicherteNichtehelicheLebensgemeinschaft;
            theMitversicherteNichtehelicheLebensgemeinschaft = this.getMitversicherteNichtehelicheLebensgemeinschaft();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitversicherteNichtehelicheLebensgemeinschaft", theMitversicherteNichtehelicheLebensgemeinschaft), currentHashCode, theMitversicherteNichtehelicheLebensgemeinschaft, (this.mitversicherteNichtehelicheLebensgemeinschaft!= null));
        }
        {
            List<CTDiensthaftpflichtGiltFuer> theDiensthaftpflichtGiltFuer;
            theDiensthaftpflichtGiltFuer = (((this.diensthaftpflichtGiltFuer!= null)&&(!this.diensthaftpflichtGiltFuer.isEmpty()))?this.getDiensthaftpflichtGiltFuer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diensthaftpflichtGiltFuer", theDiensthaftpflichtGiltFuer), currentHashCode, theDiensthaftpflichtGiltFuer, ((this.diensthaftpflichtGiltFuer!= null)&&(!this.diensthaftpflichtGiltFuer.isEmpty())));
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
        if (draftCopy instanceof CTPrivat) {
            final CTPrivat copy = ((CTPrivat) draftCopy);
            {
                Boolean mitversicherungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mitversicherungsart!= null)&&(!this.mitversicherungsart.isEmpty())));
                if (mitversicherungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STMitversicherungsart> sourceMitversicherungsart;
                    sourceMitversicherungsart = (((this.mitversicherungsart!= null)&&(!this.mitversicherungsart.isEmpty()))?this.getMitversicherungsart():null);
                    @SuppressWarnings("unchecked")
                    List<STMitversicherungsart> copyMitversicherungsart = ((List<STMitversicherungsart> ) strategy.copy(LocatorUtils.property(locator, "mitversicherungsart", sourceMitversicherungsart), sourceMitversicherungsart, ((this.mitversicherungsart!= null)&&(!this.mitversicherungsart.isEmpty()))));
                    copy.mitversicherungsart = null;
                    if (copyMitversicherungsart!= null) {
                        List<STMitversicherungsart> uniqueMitversicherungsartl = copy.getMitversicherungsart();
                        uniqueMitversicherungsartl.addAll(copyMitversicherungsart);
                    }
                } else {
                    if (mitversicherungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitversicherungsart = null;
                    }
                }
            }
            {
                Boolean mitversicherterAngehoerigerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mitversicherterAngehoeriger!= null)&&(!this.mitversicherterAngehoeriger.isEmpty())));
                if (mitversicherterAngehoerigerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTMitversicherterAngehoeriger> sourceMitversicherterAngehoeriger;
                    sourceMitversicherterAngehoeriger = (((this.mitversicherterAngehoeriger!= null)&&(!this.mitversicherterAngehoeriger.isEmpty()))?this.getMitversicherterAngehoeriger():null);
                    @SuppressWarnings("unchecked")
                    List<CTMitversicherterAngehoeriger> copyMitversicherterAngehoeriger = ((List<CTMitversicherterAngehoeriger> ) strategy.copy(LocatorUtils.property(locator, "mitversicherterAngehoeriger", sourceMitversicherterAngehoeriger), sourceMitversicherterAngehoeriger, ((this.mitversicherterAngehoeriger!= null)&&(!this.mitversicherterAngehoeriger.isEmpty()))));
                    copy.mitversicherterAngehoeriger = null;
                    if (copyMitversicherterAngehoeriger!= null) {
                        List<CTMitversicherterAngehoeriger> uniqueMitversicherterAngehoerigerl = copy.getMitversicherterAngehoeriger();
                        uniqueMitversicherterAngehoerigerl.addAll(copyMitversicherterAngehoeriger);
                    }
                } else {
                    if (mitversicherterAngehoerigerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitversicherterAngehoeriger = null;
                    }
                }
            }
            {
                Boolean mitversichertePersonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mitversichertePerson!= null)&&(!this.mitversichertePerson.isEmpty())));
                if (mitversichertePersonShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTMitversichertePerson> sourceMitversichertePerson;
                    sourceMitversichertePerson = (((this.mitversichertePerson!= null)&&(!this.mitversichertePerson.isEmpty()))?this.getMitversichertePerson():null);
                    @SuppressWarnings("unchecked")
                    List<CTMitversichertePerson> copyMitversichertePerson = ((List<CTMitversichertePerson> ) strategy.copy(LocatorUtils.property(locator, "mitversichertePerson", sourceMitversichertePerson), sourceMitversichertePerson, ((this.mitversichertePerson!= null)&&(!this.mitversichertePerson.isEmpty()))));
                    copy.mitversichertePerson = null;
                    if (copyMitversichertePerson!= null) {
                        List<CTMitversichertePerson> uniqueMitversichertePersonl = copy.getMitversichertePerson();
                        uniqueMitversichertePersonl.addAll(copyMitversichertePerson);
                    }
                } else {
                    if (mitversichertePersonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitversichertePerson = null;
                    }
                }
            }
            {
                Boolean mitversicherteNichtehelicheLebensgemeinschaftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mitversicherteNichtehelicheLebensgemeinschaft!= null));
                if (mitversicherteNichtehelicheLebensgemeinschaftShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTMitversicherteNichtehelicheLebensgemeinschaft sourceMitversicherteNichtehelicheLebensgemeinschaft;
                    sourceMitversicherteNichtehelicheLebensgemeinschaft = this.getMitversicherteNichtehelicheLebensgemeinschaft();
                    CTMitversicherteNichtehelicheLebensgemeinschaft copyMitversicherteNichtehelicheLebensgemeinschaft = ((CTMitversicherteNichtehelicheLebensgemeinschaft) strategy.copy(LocatorUtils.property(locator, "mitversicherteNichtehelicheLebensgemeinschaft", sourceMitversicherteNichtehelicheLebensgemeinschaft), sourceMitversicherteNichtehelicheLebensgemeinschaft, (this.mitversicherteNichtehelicheLebensgemeinschaft!= null)));
                    copy.setMitversicherteNichtehelicheLebensgemeinschaft(copyMitversicherteNichtehelicheLebensgemeinschaft);
                } else {
                    if (mitversicherteNichtehelicheLebensgemeinschaftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitversicherteNichtehelicheLebensgemeinschaft = null;
                    }
                }
            }
            {
                Boolean diensthaftpflichtGiltFuerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.diensthaftpflichtGiltFuer!= null)&&(!this.diensthaftpflichtGiltFuer.isEmpty())));
                if (diensthaftpflichtGiltFuerShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDiensthaftpflichtGiltFuer> sourceDiensthaftpflichtGiltFuer;
                    sourceDiensthaftpflichtGiltFuer = (((this.diensthaftpflichtGiltFuer!= null)&&(!this.diensthaftpflichtGiltFuer.isEmpty()))?this.getDiensthaftpflichtGiltFuer():null);
                    @SuppressWarnings("unchecked")
                    List<CTDiensthaftpflichtGiltFuer> copyDiensthaftpflichtGiltFuer = ((List<CTDiensthaftpflichtGiltFuer> ) strategy.copy(LocatorUtils.property(locator, "diensthaftpflichtGiltFuer", sourceDiensthaftpflichtGiltFuer), sourceDiensthaftpflichtGiltFuer, ((this.diensthaftpflichtGiltFuer!= null)&&(!this.diensthaftpflichtGiltFuer.isEmpty()))));
                    copy.diensthaftpflichtGiltFuer = null;
                    if (copyDiensthaftpflichtGiltFuer!= null) {
                        List<CTDiensthaftpflichtGiltFuer> uniqueDiensthaftpflichtGiltFuerl = copy.getDiensthaftpflichtGiltFuer();
                        uniqueDiensthaftpflichtGiltFuerl.addAll(copyDiensthaftpflichtGiltFuer);
                    }
                } else {
                    if (diensthaftpflichtGiltFuerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.diensthaftpflichtGiltFuer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTPrivat();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withMitversicherungsart(STMitversicherungsart... values) {
        if (values!= null) {
            for (STMitversicherungsart value: values) {
                getMitversicherungsart().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withMitversicherungsart(Collection<STMitversicherungsart> values) {
        if (values!= null) {
            getMitversicherungsart().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withMitversicherterAngehoeriger(CTMitversicherterAngehoeriger... values) {
        if (values!= null) {
            for (CTMitversicherterAngehoeriger value: values) {
                getMitversicherterAngehoeriger().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withMitversicherterAngehoeriger(Collection<CTMitversicherterAngehoeriger> values) {
        if (values!= null) {
            getMitversicherterAngehoeriger().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withMitversichertePerson(CTMitversichertePerson... values) {
        if (values!= null) {
            for (CTMitversichertePerson value: values) {
                getMitversichertePerson().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withMitversichertePerson(Collection<CTMitversichertePerson> values) {
        if (values!= null) {
            getMitversichertePerson().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withMitversicherteNichtehelicheLebensgemeinschaft(CTMitversicherteNichtehelicheLebensgemeinschaft value) {
        setMitversicherteNichtehelicheLebensgemeinschaft(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withDiensthaftpflichtGiltFuer(CTDiensthaftpflichtGiltFuer... values) {
        if (values!= null) {
            for (CTDiensthaftpflichtGiltFuer value: values) {
                getDiensthaftpflichtGiltFuer().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withDiensthaftpflichtGiltFuer(Collection<CTDiensthaftpflichtGiltFuer> values) {
        if (values!= null) {
            getDiensthaftpflichtGiltFuer().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTPrivat withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
