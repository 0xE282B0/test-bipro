
package net.bipro.namespace.versicherung.produktmodell.komposit;

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
import net.bipro.namespace.datentypen.STEGefahr;
import net.bipro.namespace.versicherung.produktmodell.CTSelbstbeteiligung;
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
 * Klasse zur Beschreibung von versicherten Gefahren (z.B. Feuer, Leitungswasser, Sturm,…)
 * 
 * <p>Java class for CT_Gefahr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gefahr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gefahr" type="{http://www.bipro.net/namespace/datentypen}STE_Gefahr" minOccurs="0"/&gt;
 *         &lt;element name="Selbstbeteiligung" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Selbstbeteiligung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gefahr", propOrder = {
    "gefahr",
    "selbstbeteiligung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGefahr
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Gefahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEGefahr gefahr;
    @XmlElement(name = "Selbstbeteiligung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTSelbstbeteiligung> selbstbeteiligung;

    /**
     * Gets the value of the gefahr property.
     * 
     * @return
     *     possible object is
     *     {@link STEGefahr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEGefahr getGefahr() {
        return gefahr;
    }

    /**
     * Sets the value of the gefahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGefahr }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGefahr(STEGefahr value) {
        this.gefahr = value;
    }

    /**
     * Gets the value of the selbstbeteiligung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selbstbeteiligung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelbstbeteiligung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSelbstbeteiligung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTSelbstbeteiligung> getSelbstbeteiligung() {
        if (selbstbeteiligung == null) {
            selbstbeteiligung = new ArrayList<CTSelbstbeteiligung>();
        }
        return this.selbstbeteiligung;
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
        final CTGefahr that = ((CTGefahr) object);
        {
            STEGefahr lhsGefahr;
            lhsGefahr = this.getGefahr();
            STEGefahr rhsGefahr;
            rhsGefahr = that.getGefahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahr", lhsGefahr), LocatorUtils.property(thatLocator, "gefahr", rhsGefahr), lhsGefahr, rhsGefahr, (this.gefahr!= null), (that.gefahr!= null))) {
                return false;
            }
        }
        {
            List<CTSelbstbeteiligung> lhsSelbstbeteiligung;
            lhsSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
            List<CTSelbstbeteiligung> rhsSelbstbeteiligung;
            rhsSelbstbeteiligung = (((that.selbstbeteiligung!= null)&&(!that.selbstbeteiligung.isEmpty()))?that.getSelbstbeteiligung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selbstbeteiligung", lhsSelbstbeteiligung), LocatorUtils.property(thatLocator, "selbstbeteiligung", rhsSelbstbeteiligung), lhsSelbstbeteiligung, rhsSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())), ((that.selbstbeteiligung!= null)&&(!that.selbstbeteiligung.isEmpty())))) {
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
            STEGefahr theGefahr;
            theGefahr = this.getGefahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahr", theGefahr), currentHashCode, theGefahr, (this.gefahr!= null));
        }
        {
            List<CTSelbstbeteiligung> theSelbstbeteiligung;
            theSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selbstbeteiligung", theSelbstbeteiligung), currentHashCode, theSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())));
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
        if (draftCopy instanceof CTGefahr) {
            final CTGefahr copy = ((CTGefahr) draftCopy);
            {
                Boolean gefahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gefahr!= null));
                if (gefahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGefahr sourceGefahr;
                    sourceGefahr = this.getGefahr();
                    STEGefahr copyGefahr = ((STEGefahr) strategy.copy(LocatorUtils.property(locator, "gefahr", sourceGefahr), sourceGefahr, (this.gefahr!= null)));
                    copy.setGefahr(copyGefahr);
                } else {
                    if (gefahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahr = null;
                    }
                }
            }
            {
                Boolean selbstbeteiligungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())));
                if (selbstbeteiligungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSelbstbeteiligung> sourceSelbstbeteiligung;
                    sourceSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
                    @SuppressWarnings("unchecked")
                    List<CTSelbstbeteiligung> copySelbstbeteiligung = ((List<CTSelbstbeteiligung> ) strategy.copy(LocatorUtils.property(locator, "selbstbeteiligung", sourceSelbstbeteiligung), sourceSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))));
                    copy.selbstbeteiligung = null;
                    if (copySelbstbeteiligung!= null) {
                        List<CTSelbstbeteiligung> uniqueSelbstbeteiligungl = copy.getSelbstbeteiligung();
                        uniqueSelbstbeteiligungl.addAll(copySelbstbeteiligung);
                    }
                } else {
                    if (selbstbeteiligungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.selbstbeteiligung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGefahr();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahr withGefahr(STEGefahr value) {
        setGefahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahr withSelbstbeteiligung(CTSelbstbeteiligung... values) {
        if (values!= null) {
            for (CTSelbstbeteiligung value: values) {
                getSelbstbeteiligung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahr withSelbstbeteiligung(Collection<CTSelbstbeteiligung> values) {
        if (values!= null) {
            getSelbstbeteiligung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahr withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahr withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
