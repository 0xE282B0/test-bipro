
package net.bipro.namespace.versicherung.produktmodell.komposit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.produktmodell.CTBeitrag;
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
 * Die Klasse UnfallversicherungJe enthält zentrale Daten über eine versicherte Person oder Personengruppe innerhalb einer Unfallversicherung, z.B. das Einschlussdatum der Person/Gruppe oder den Gesamtbeitrag der Person/Gruppe.
 * 
 * <p>Java class for CT_UnfallversicherungJe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_UnfallversicherungJe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Einschlussdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Ausschlussdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Aenderungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Beitrag" type="{http://www.bipro.net/namespace/produktmodell}CT_Beitrag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_UnfallversicherungJe", propOrder = {
    "einschlussdatum",
    "ausschlussdatum",
    "aenderungsdatum",
    "beitrag"
})
@XmlSeeAlso({
    CTUnfallversicherungJePersonengruppe.class,
    CTUnfallversicherungJeVP.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTUnfallversicherungJe
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Einschlussdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String einschlussdatum;
    @XmlElement(name = "Ausschlussdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String ausschlussdatum;
    @XmlElement(name = "Aenderungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String aenderungsdatum;
    @XmlElement(name = "Beitrag")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTBeitrag> beitrag;

    /**
     * Gets the value of the einschlussdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getEinschlussdatum() {
        return einschlussdatum;
    }

    /**
     * Sets the value of the einschlussdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinschlussdatum(String value) {
        this.einschlussdatum = value;
    }

    /**
     * Gets the value of the ausschlussdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAusschlussdatum() {
        return ausschlussdatum;
    }

    /**
     * Sets the value of the ausschlussdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAusschlussdatum(String value) {
        this.ausschlussdatum = value;
    }

    /**
     * Gets the value of the aenderungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAenderungsdatum() {
        return aenderungsdatum;
    }

    /**
     * Sets the value of the aenderungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAenderungsdatum(String value) {
        this.aenderungsdatum = value;
    }

    /**
     * Gets the value of the beitrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beitrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeitrag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTBeitrag }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTBeitrag> getBeitrag() {
        if (beitrag == null) {
            beitrag = new ArrayList<CTBeitrag>();
        }
        return this.beitrag;
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
        final CTUnfallversicherungJe that = ((CTUnfallversicherungJe) object);
        {
            String lhsEinschlussdatum;
            lhsEinschlussdatum = this.getEinschlussdatum();
            String rhsEinschlussdatum;
            rhsEinschlussdatum = that.getEinschlussdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einschlussdatum", lhsEinschlussdatum), LocatorUtils.property(thatLocator, "einschlussdatum", rhsEinschlussdatum), lhsEinschlussdatum, rhsEinschlussdatum, (this.einschlussdatum!= null), (that.einschlussdatum!= null))) {
                return false;
            }
        }
        {
            String lhsAusschlussdatum;
            lhsAusschlussdatum = this.getAusschlussdatum();
            String rhsAusschlussdatum;
            rhsAusschlussdatum = that.getAusschlussdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausschlussdatum", lhsAusschlussdatum), LocatorUtils.property(thatLocator, "ausschlussdatum", rhsAusschlussdatum), lhsAusschlussdatum, rhsAusschlussdatum, (this.ausschlussdatum!= null), (that.ausschlussdatum!= null))) {
                return false;
            }
        }
        {
            String lhsAenderungsdatum;
            lhsAenderungsdatum = this.getAenderungsdatum();
            String rhsAenderungsdatum;
            rhsAenderungsdatum = that.getAenderungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aenderungsdatum", lhsAenderungsdatum), LocatorUtils.property(thatLocator, "aenderungsdatum", rhsAenderungsdatum), lhsAenderungsdatum, rhsAenderungsdatum, (this.aenderungsdatum!= null), (that.aenderungsdatum!= null))) {
                return false;
            }
        }
        {
            List<CTBeitrag> lhsBeitrag;
            lhsBeitrag = (((this.beitrag!= null)&&(!this.beitrag.isEmpty()))?this.getBeitrag():null);
            List<CTBeitrag> rhsBeitrag;
            rhsBeitrag = (((that.beitrag!= null)&&(!that.beitrag.isEmpty()))?that.getBeitrag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitrag", lhsBeitrag), LocatorUtils.property(thatLocator, "beitrag", rhsBeitrag), lhsBeitrag, rhsBeitrag, ((this.beitrag!= null)&&(!this.beitrag.isEmpty())), ((that.beitrag!= null)&&(!that.beitrag.isEmpty())))) {
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
            String theEinschlussdatum;
            theEinschlussdatum = this.getEinschlussdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einschlussdatum", theEinschlussdatum), currentHashCode, theEinschlussdatum, (this.einschlussdatum!= null));
        }
        {
            String theAusschlussdatum;
            theAusschlussdatum = this.getAusschlussdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausschlussdatum", theAusschlussdatum), currentHashCode, theAusschlussdatum, (this.ausschlussdatum!= null));
        }
        {
            String theAenderungsdatum;
            theAenderungsdatum = this.getAenderungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aenderungsdatum", theAenderungsdatum), currentHashCode, theAenderungsdatum, (this.aenderungsdatum!= null));
        }
        {
            List<CTBeitrag> theBeitrag;
            theBeitrag = (((this.beitrag!= null)&&(!this.beitrag.isEmpty()))?this.getBeitrag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitrag", theBeitrag), currentHashCode, theBeitrag, ((this.beitrag!= null)&&(!this.beitrag.isEmpty())));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTUnfallversicherungJe) {
            final CTUnfallversicherungJe copy = ((CTUnfallversicherungJe) target);
            {
                Boolean einschlussdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einschlussdatum!= null));
                if (einschlussdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEinschlussdatum;
                    sourceEinschlussdatum = this.getEinschlussdatum();
                    String copyEinschlussdatum = ((String) strategy.copy(LocatorUtils.property(locator, "einschlussdatum", sourceEinschlussdatum), sourceEinschlussdatum, (this.einschlussdatum!= null)));
                    copy.setEinschlussdatum(copyEinschlussdatum);
                } else {
                    if (einschlussdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einschlussdatum = null;
                    }
                }
            }
            {
                Boolean ausschlussdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausschlussdatum!= null));
                if (ausschlussdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAusschlussdatum;
                    sourceAusschlussdatum = this.getAusschlussdatum();
                    String copyAusschlussdatum = ((String) strategy.copy(LocatorUtils.property(locator, "ausschlussdatum", sourceAusschlussdatum), sourceAusschlussdatum, (this.ausschlussdatum!= null)));
                    copy.setAusschlussdatum(copyAusschlussdatum);
                } else {
                    if (ausschlussdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausschlussdatum = null;
                    }
                }
            }
            {
                Boolean aenderungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.aenderungsdatum!= null));
                if (aenderungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAenderungsdatum;
                    sourceAenderungsdatum = this.getAenderungsdatum();
                    String copyAenderungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "aenderungsdatum", sourceAenderungsdatum), sourceAenderungsdatum, (this.aenderungsdatum!= null)));
                    copy.setAenderungsdatum(copyAenderungsdatum);
                } else {
                    if (aenderungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aenderungsdatum = null;
                    }
                }
            }
            {
                Boolean beitragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.beitrag!= null)&&(!this.beitrag.isEmpty())));
                if (beitragShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTBeitrag> sourceBeitrag;
                    sourceBeitrag = (((this.beitrag!= null)&&(!this.beitrag.isEmpty()))?this.getBeitrag():null);
                    @SuppressWarnings("unchecked")
                    List<CTBeitrag> copyBeitrag = ((List<CTBeitrag> ) strategy.copy(LocatorUtils.property(locator, "beitrag", sourceBeitrag), sourceBeitrag, ((this.beitrag!= null)&&(!this.beitrag.isEmpty()))));
                    copy.beitrag = null;
                    if (copyBeitrag!= null) {
                        List<CTBeitrag> uniqueBeitragl = copy.getBeitrag();
                        uniqueBeitragl.addAll(copyBeitrag);
                    }
                } else {
                    if (beitragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitrag = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJe withEinschlussdatum(String value) {
        setEinschlussdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJe withAusschlussdatum(String value) {
        setAusschlussdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJe withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJe withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJe withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJe withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnfallversicherungJe withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
