
package net.bipro.namespace.sepa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTVertragsnummer;
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
 * <p>Java class for CT_Notifikation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Notifikation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Versand" type="{http://www.bipro.net/namespace/datentypen}ST_Datum"/&gt;
 *         &lt;element name="BetroffenerVertrag" type="{http://www.bipro.net/namespace/allgemein}CT_Vertragsnummer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Mandat" type="{http://www.bipro.net/namespace/sepa}CT_Mandat"/&gt;
 *         &lt;element name="Abbuchung" type="{http://www.bipro.net/namespace/sepa}CT_Abbuchung" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Notifikation", propOrder = {
    "versand",
    "betroffenerVertrag",
    "mandat",
    "abbuchung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTNotifikation
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Versand", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String versand;
    @XmlElement(name = "BetroffenerVertrag", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVertragsnummer> betroffenerVertrag;
    @XmlElement(name = "Mandat", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTMandat mandat;
    @XmlElement(name = "Abbuchung", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTAbbuchung> abbuchung;

    /**
     * Gets the value of the versand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getVersand() {
        return versand;
    }

    /**
     * Sets the value of the versand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersand(String value) {
        this.versand = value;
    }

    /**
     * Gets the value of the betroffenerVertrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the betroffenerVertrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetroffenerVertrag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVertragsnummer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVertragsnummer> getBetroffenerVertrag() {
        if (betroffenerVertrag == null) {
            betroffenerVertrag = new ArrayList<CTVertragsnummer>();
        }
        return this.betroffenerVertrag;
    }

    /**
     * Gets the value of the mandat property.
     * 
     * @return
     *     possible object is
     *     {@link CTMandat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMandat getMandat() {
        return mandat;
    }

    /**
     * Sets the value of the mandat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTMandat }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMandat(CTMandat value) {
        this.mandat = value;
    }

    /**
     * Gets the value of the abbuchung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbuchung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbuchung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAbbuchung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTAbbuchung> getAbbuchung() {
        if (abbuchung == null) {
            abbuchung = new ArrayList<CTAbbuchung>();
        }
        return this.abbuchung;
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
        final CTNotifikation that = ((CTNotifikation) object);
        {
            String lhsVersand;
            lhsVersand = this.getVersand();
            String rhsVersand;
            rhsVersand = that.getVersand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versand", lhsVersand), LocatorUtils.property(thatLocator, "versand", rhsVersand), lhsVersand, rhsVersand, (this.versand!= null), (that.versand!= null))) {
                return false;
            }
        }
        {
            List<CTVertragsnummer> lhsBetroffenerVertrag;
            lhsBetroffenerVertrag = (((this.betroffenerVertrag!= null)&&(!this.betroffenerVertrag.isEmpty()))?this.getBetroffenerVertrag():null);
            List<CTVertragsnummer> rhsBetroffenerVertrag;
            rhsBetroffenerVertrag = (((that.betroffenerVertrag!= null)&&(!that.betroffenerVertrag.isEmpty()))?that.getBetroffenerVertrag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betroffenerVertrag", lhsBetroffenerVertrag), LocatorUtils.property(thatLocator, "betroffenerVertrag", rhsBetroffenerVertrag), lhsBetroffenerVertrag, rhsBetroffenerVertrag, ((this.betroffenerVertrag!= null)&&(!this.betroffenerVertrag.isEmpty())), ((that.betroffenerVertrag!= null)&&(!that.betroffenerVertrag.isEmpty())))) {
                return false;
            }
        }
        {
            CTMandat lhsMandat;
            lhsMandat = this.getMandat();
            CTMandat rhsMandat;
            rhsMandat = that.getMandat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mandat", lhsMandat), LocatorUtils.property(thatLocator, "mandat", rhsMandat), lhsMandat, rhsMandat, (this.mandat!= null), (that.mandat!= null))) {
                return false;
            }
        }
        {
            List<CTAbbuchung> lhsAbbuchung;
            lhsAbbuchung = (((this.abbuchung!= null)&&(!this.abbuchung.isEmpty()))?this.getAbbuchung():null);
            List<CTAbbuchung> rhsAbbuchung;
            rhsAbbuchung = (((that.abbuchung!= null)&&(!that.abbuchung.isEmpty()))?that.getAbbuchung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abbuchung", lhsAbbuchung), LocatorUtils.property(thatLocator, "abbuchung", rhsAbbuchung), lhsAbbuchung, rhsAbbuchung, ((this.abbuchung!= null)&&(!this.abbuchung.isEmpty())), ((that.abbuchung!= null)&&(!that.abbuchung.isEmpty())))) {
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
            String theVersand;
            theVersand = this.getVersand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versand", theVersand), currentHashCode, theVersand, (this.versand!= null));
        }
        {
            List<CTVertragsnummer> theBetroffenerVertrag;
            theBetroffenerVertrag = (((this.betroffenerVertrag!= null)&&(!this.betroffenerVertrag.isEmpty()))?this.getBetroffenerVertrag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betroffenerVertrag", theBetroffenerVertrag), currentHashCode, theBetroffenerVertrag, ((this.betroffenerVertrag!= null)&&(!this.betroffenerVertrag.isEmpty())));
        }
        {
            CTMandat theMandat;
            theMandat = this.getMandat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mandat", theMandat), currentHashCode, theMandat, (this.mandat!= null));
        }
        {
            List<CTAbbuchung> theAbbuchung;
            theAbbuchung = (((this.abbuchung!= null)&&(!this.abbuchung.isEmpty()))?this.getAbbuchung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abbuchung", theAbbuchung), currentHashCode, theAbbuchung, ((this.abbuchung!= null)&&(!this.abbuchung.isEmpty())));
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
        if (draftCopy instanceof CTNotifikation) {
            final CTNotifikation copy = ((CTNotifikation) draftCopy);
            {
                Boolean versandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versand!= null));
                if (versandShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVersand;
                    sourceVersand = this.getVersand();
                    String copyVersand = ((String) strategy.copy(LocatorUtils.property(locator, "versand", sourceVersand), sourceVersand, (this.versand!= null)));
                    copy.setVersand(copyVersand);
                } else {
                    if (versandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versand = null;
                    }
                }
            }
            {
                Boolean betroffenerVertragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.betroffenerVertrag!= null)&&(!this.betroffenerVertrag.isEmpty())));
                if (betroffenerVertragShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVertragsnummer> sourceBetroffenerVertrag;
                    sourceBetroffenerVertrag = (((this.betroffenerVertrag!= null)&&(!this.betroffenerVertrag.isEmpty()))?this.getBetroffenerVertrag():null);
                    @SuppressWarnings("unchecked")
                    List<CTVertragsnummer> copyBetroffenerVertrag = ((List<CTVertragsnummer> ) strategy.copy(LocatorUtils.property(locator, "betroffenerVertrag", sourceBetroffenerVertrag), sourceBetroffenerVertrag, ((this.betroffenerVertrag!= null)&&(!this.betroffenerVertrag.isEmpty()))));
                    copy.betroffenerVertrag = null;
                    if (copyBetroffenerVertrag!= null) {
                        List<CTVertragsnummer> uniqueBetroffenerVertragl = copy.getBetroffenerVertrag();
                        uniqueBetroffenerVertragl.addAll(copyBetroffenerVertrag);
                    }
                } else {
                    if (betroffenerVertragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.betroffenerVertrag = null;
                    }
                }
            }
            {
                Boolean mandatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mandat!= null));
                if (mandatShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTMandat sourceMandat;
                    sourceMandat = this.getMandat();
                    CTMandat copyMandat = ((CTMandat) strategy.copy(LocatorUtils.property(locator, "mandat", sourceMandat), sourceMandat, (this.mandat!= null)));
                    copy.setMandat(copyMandat);
                } else {
                    if (mandatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mandat = null;
                    }
                }
            }
            {
                Boolean abbuchungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.abbuchung!= null)&&(!this.abbuchung.isEmpty())));
                if (abbuchungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTAbbuchung> sourceAbbuchung;
                    sourceAbbuchung = (((this.abbuchung!= null)&&(!this.abbuchung.isEmpty()))?this.getAbbuchung():null);
                    @SuppressWarnings("unchecked")
                    List<CTAbbuchung> copyAbbuchung = ((List<CTAbbuchung> ) strategy.copy(LocatorUtils.property(locator, "abbuchung", sourceAbbuchung), sourceAbbuchung, ((this.abbuchung!= null)&&(!this.abbuchung.isEmpty()))));
                    copy.abbuchung = null;
                    if (copyAbbuchung!= null) {
                        List<CTAbbuchung> uniqueAbbuchungl = copy.getAbbuchung();
                        uniqueAbbuchungl.addAll(copyAbbuchung);
                    }
                } else {
                    if (abbuchungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abbuchung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTNotifikation();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withVersand(String value) {
        setVersand(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withBetroffenerVertrag(CTVertragsnummer... values) {
        if (values!= null) {
            for (CTVertragsnummer value: values) {
                getBetroffenerVertrag().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withBetroffenerVertrag(Collection<CTVertragsnummer> values) {
        if (values!= null) {
            getBetroffenerVertrag().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withMandat(CTMandat value) {
        setMandat(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withAbbuchung(CTAbbuchung... values) {
        if (values!= null) {
            for (CTAbbuchung value: values) {
                getAbbuchung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withAbbuchung(Collection<CTAbbuchung> values) {
        if (values!= null) {
            getAbbuchung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTNotifikation withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
