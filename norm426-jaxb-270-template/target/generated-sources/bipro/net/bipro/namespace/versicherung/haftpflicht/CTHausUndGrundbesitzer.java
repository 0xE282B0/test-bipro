
package net.bipro.namespace.versicherung.haftpflicht;

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
 * <p>Java class for CT_HausUndGrundbesitzer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_HausUndGrundbesitzer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Wagnisanschrift" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Wagnisanschrift" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_HausUndGrundbesitzer", propOrder = {
    "wagnisanschrift"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTHausUndGrundbesitzer
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Wagnisanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTWagnisanschrift> wagnisanschrift;

    /**
     * Gets the value of the wagnisanschrift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wagnisanschrift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWagnisanschrift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTWagnisanschrift }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTWagnisanschrift> getWagnisanschrift() {
        if (wagnisanschrift == null) {
            wagnisanschrift = new ArrayList<CTWagnisanschrift>();
        }
        return this.wagnisanschrift;
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
        final CTHausUndGrundbesitzer that = ((CTHausUndGrundbesitzer) object);
        {
            List<CTWagnisanschrift> lhsWagnisanschrift;
            lhsWagnisanschrift = (((this.wagnisanschrift!= null)&&(!this.wagnisanschrift.isEmpty()))?this.getWagnisanschrift():null);
            List<CTWagnisanschrift> rhsWagnisanschrift;
            rhsWagnisanschrift = (((that.wagnisanschrift!= null)&&(!that.wagnisanschrift.isEmpty()))?that.getWagnisanschrift():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wagnisanschrift", lhsWagnisanschrift), LocatorUtils.property(thatLocator, "wagnisanschrift", rhsWagnisanschrift), lhsWagnisanschrift, rhsWagnisanschrift, ((this.wagnisanschrift!= null)&&(!this.wagnisanschrift.isEmpty())), ((that.wagnisanschrift!= null)&&(!that.wagnisanschrift.isEmpty())))) {
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
            List<CTWagnisanschrift> theWagnisanschrift;
            theWagnisanschrift = (((this.wagnisanschrift!= null)&&(!this.wagnisanschrift.isEmpty()))?this.getWagnisanschrift():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wagnisanschrift", theWagnisanschrift), currentHashCode, theWagnisanschrift, ((this.wagnisanschrift!= null)&&(!this.wagnisanschrift.isEmpty())));
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
        if (draftCopy instanceof CTHausUndGrundbesitzer) {
            final CTHausUndGrundbesitzer copy = ((CTHausUndGrundbesitzer) draftCopy);
            {
                Boolean wagnisanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.wagnisanschrift!= null)&&(!this.wagnisanschrift.isEmpty())));
                if (wagnisanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTWagnisanschrift> sourceWagnisanschrift;
                    sourceWagnisanschrift = (((this.wagnisanschrift!= null)&&(!this.wagnisanschrift.isEmpty()))?this.getWagnisanschrift():null);
                    @SuppressWarnings("unchecked")
                    List<CTWagnisanschrift> copyWagnisanschrift = ((List<CTWagnisanschrift> ) strategy.copy(LocatorUtils.property(locator, "wagnisanschrift", sourceWagnisanschrift), sourceWagnisanschrift, ((this.wagnisanschrift!= null)&&(!this.wagnisanschrift.isEmpty()))));
                    copy.wagnisanschrift = null;
                    if (copyWagnisanschrift!= null) {
                        List<CTWagnisanschrift> uniqueWagnisanschriftl = copy.getWagnisanschrift();
                        uniqueWagnisanschriftl.addAll(copyWagnisanschrift);
                    }
                } else {
                    if (wagnisanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wagnisanschrift = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTHausUndGrundbesitzer();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausUndGrundbesitzer withWagnisanschrift(CTWagnisanschrift... values) {
        if (values!= null) {
            for (CTWagnisanschrift value: values) {
                getWagnisanschrift().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausUndGrundbesitzer withWagnisanschrift(Collection<CTWagnisanschrift> values) {
        if (values!= null) {
            getWagnisanschrift().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausUndGrundbesitzer withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTHausUndGrundbesitzer withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
