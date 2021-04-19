
package net.bipro.namespace.fragen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
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
 * Mit der Klasse UND können logische UND-Verknüpfungen von zwei oder mehr Bedingungen abgebildet werden. Das Ergebnis ist true, wenn alle so verknüpften Bedingungen true sind, ansonsten ist das Ergebnis false.
 * 
 * <p>Java class for CT_Und complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Und"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_Bedingung"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bedingung" type="{http://www.bipro.net/namespace/fragen}CT_Bedingung" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Und", propOrder = {
    "bedingung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTUnd
    extends CTBedingung
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Bedingung", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTBedingung> bedingung;

    /**
     * Gets the value of the bedingung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedingung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedingung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTBedingung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTBedingung> getBedingung() {
        if (bedingung == null) {
            bedingung = new ArrayList<CTBedingung>();
        }
        return this.bedingung;
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
        final CTUnd that = ((CTUnd) object);
        {
            List<CTBedingung> lhsBedingung;
            lhsBedingung = (((this.bedingung!= null)&&(!this.bedingung.isEmpty()))?this.getBedingung():null);
            List<CTBedingung> rhsBedingung;
            rhsBedingung = (((that.bedingung!= null)&&(!that.bedingung.isEmpty()))?that.getBedingung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedingung", lhsBedingung), LocatorUtils.property(thatLocator, "bedingung", rhsBedingung), lhsBedingung, rhsBedingung, ((this.bedingung!= null)&&(!this.bedingung.isEmpty())), ((that.bedingung!= null)&&(!that.bedingung.isEmpty())))) {
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
            List<CTBedingung> theBedingung;
            theBedingung = (((this.bedingung!= null)&&(!this.bedingung.isEmpty()))?this.getBedingung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bedingung", theBedingung), currentHashCode, theBedingung, ((this.bedingung!= null)&&(!this.bedingung.isEmpty())));
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
        if (draftCopy instanceof CTUnd) {
            final CTUnd copy = ((CTUnd) draftCopy);
            {
                Boolean bedingungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bedingung!= null)&&(!this.bedingung.isEmpty())));
                if (bedingungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTBedingung> sourceBedingung;
                    sourceBedingung = (((this.bedingung!= null)&&(!this.bedingung.isEmpty()))?this.getBedingung():null);
                    @SuppressWarnings("unchecked")
                    List<CTBedingung> copyBedingung = ((List<CTBedingung> ) strategy.copy(LocatorUtils.property(locator, "bedingung", sourceBedingung), sourceBedingung, ((this.bedingung!= null)&&(!this.bedingung.isEmpty()))));
                    copy.bedingung = null;
                    if (copyBedingung!= null) {
                        List<CTBedingung> uniqueBedingungl = copy.getBedingung();
                        uniqueBedingungl.addAll(copyBedingung);
                    }
                } else {
                    if (bedingungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bedingung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTUnd();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnd withBedingung(CTBedingung... values) {
        if (values!= null) {
            for (CTBedingung value: values) {
                getBedingung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnd withBedingung(Collection<CTBedingung> values) {
        if (values!= null) {
            getBedingung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnd withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnd withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
