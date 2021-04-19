
package net.bipro.namespace.versicherung.produktmodell.komposit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STEGefahr;
import net.bipro.namespace.datentypen.STEGefahrenmerkmal;
import net.bipro.namespace.datentypen.STEKategorieID;
import net.bipro.namespace.datentypen.STEKondition;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
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
 * Klasse zur Abbildung von Zu- Abschlägen einzelner Gefahren aus Gefahrenmerkmalen in Gewerbe.
 * 
 * <p>Java class for CT_Kondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Kondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/produktmodell}CT_Kondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gefahrenmerkmal" type="{http://www.bipro.net/namespace/datentypen}STE_Gefahrenmerkmal" minOccurs="0"/&gt;
 *         &lt;element name="Gefahr" type="{http://www.bipro.net/namespace/datentypen}STE_Gefahr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Kondition", propOrder = {
    "gefahrenmerkmal",
    "gefahr"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTKondition
    extends net.bipro.namespace.produktmodell.CTKondition
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Gefahrenmerkmal")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEGefahrenmerkmal gefahrenmerkmal;
    @XmlElement(name = "Gefahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STEGefahr> gefahr;

    /**
     * Gets the value of the gefahrenmerkmal property.
     * 
     * @return
     *     possible object is
     *     {@link STEGefahrenmerkmal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEGefahrenmerkmal getGefahrenmerkmal() {
        return gefahrenmerkmal;
    }

    /**
     * Sets the value of the gefahrenmerkmal property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGefahrenmerkmal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGefahrenmerkmal(STEGefahrenmerkmal value) {
        this.gefahrenmerkmal = value;
    }

    /**
     * Gets the value of the gefahr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gefahr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGefahr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STEGefahr }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<STEGefahr> getGefahr() {
        if (gefahr == null) {
            gefahr = new ArrayList<STEGefahr>();
        }
        return this.gefahr;
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
        final CTKondition that = ((CTKondition) object);
        {
            STEGefahrenmerkmal lhsGefahrenmerkmal;
            lhsGefahrenmerkmal = this.getGefahrenmerkmal();
            STEGefahrenmerkmal rhsGefahrenmerkmal;
            rhsGefahrenmerkmal = that.getGefahrenmerkmal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahrenmerkmal", lhsGefahrenmerkmal), LocatorUtils.property(thatLocator, "gefahrenmerkmal", rhsGefahrenmerkmal), lhsGefahrenmerkmal, rhsGefahrenmerkmal, (this.gefahrenmerkmal!= null), (that.gefahrenmerkmal!= null))) {
                return false;
            }
        }
        {
            List<STEGefahr> lhsGefahr;
            lhsGefahr = (((this.gefahr!= null)&&(!this.gefahr.isEmpty()))?this.getGefahr():null);
            List<STEGefahr> rhsGefahr;
            rhsGefahr = (((that.gefahr!= null)&&(!that.gefahr.isEmpty()))?that.getGefahr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gefahr", lhsGefahr), LocatorUtils.property(thatLocator, "gefahr", rhsGefahr), lhsGefahr, rhsGefahr, ((this.gefahr!= null)&&(!this.gefahr.isEmpty())), ((that.gefahr!= null)&&(!that.gefahr.isEmpty())))) {
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
            STEGefahrenmerkmal theGefahrenmerkmal;
            theGefahrenmerkmal = this.getGefahrenmerkmal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahrenmerkmal", theGefahrenmerkmal), currentHashCode, theGefahrenmerkmal, (this.gefahrenmerkmal!= null));
        }
        {
            List<STEGefahr> theGefahr;
            theGefahr = (((this.gefahr!= null)&&(!this.gefahr.isEmpty()))?this.getGefahr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gefahr", theGefahr), currentHashCode, theGefahr, ((this.gefahr!= null)&&(!this.gefahr.isEmpty())));
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
        if (draftCopy instanceof CTKondition) {
            final CTKondition copy = ((CTKondition) draftCopy);
            {
                Boolean gefahrenmerkmalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gefahrenmerkmal!= null));
                if (gefahrenmerkmalShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGefahrenmerkmal sourceGefahrenmerkmal;
                    sourceGefahrenmerkmal = this.getGefahrenmerkmal();
                    STEGefahrenmerkmal copyGefahrenmerkmal = ((STEGefahrenmerkmal) strategy.copy(LocatorUtils.property(locator, "gefahrenmerkmal", sourceGefahrenmerkmal), sourceGefahrenmerkmal, (this.gefahrenmerkmal!= null)));
                    copy.setGefahrenmerkmal(copyGefahrenmerkmal);
                } else {
                    if (gefahrenmerkmalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahrenmerkmal = null;
                    }
                }
            }
            {
                Boolean gefahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.gefahr!= null)&&(!this.gefahr.isEmpty())));
                if (gefahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STEGefahr> sourceGefahr;
                    sourceGefahr = (((this.gefahr!= null)&&(!this.gefahr.isEmpty()))?this.getGefahr():null);
                    @SuppressWarnings("unchecked")
                    List<STEGefahr> copyGefahr = ((List<STEGefahr> ) strategy.copy(LocatorUtils.property(locator, "gefahr", sourceGefahr), sourceGefahr, ((this.gefahr!= null)&&(!this.gefahr.isEmpty()))));
                    copy.gefahr = null;
                    if (copyGefahr!= null) {
                        List<STEGefahr> uniqueGefahrl = copy.getGefahr();
                        uniqueGefahrl.addAll(copyGefahr);
                    }
                } else {
                    if (gefahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gefahr = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKondition();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withGefahrenmerkmal(STEGefahrenmerkmal value) {
        setGefahrenmerkmal(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withGefahr(STEGefahr... values) {
        if (values!= null) {
            for (STEGefahr value: values) {
                getGefahr().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withGefahr(Collection<STEGefahr> values) {
        if (values!= null) {
            getGefahr().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withKategorieID(STEKategorieID value) {
        setKategorieID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withArtID(STEKondition value) {
        setArtID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withWert(BigDecimal value) {
        setWert(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withWerteinheit(STWerteinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withGrund(String value) {
        setGrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withGueltigkeit(CTZeitraum value) {
        setGueltigkeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKondition withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
