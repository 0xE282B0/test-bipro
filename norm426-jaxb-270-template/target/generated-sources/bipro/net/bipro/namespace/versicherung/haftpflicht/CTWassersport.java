
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
 * <p>Java class for CT_Wassersport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Wassersport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersichertesSportboot" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_VersichertesSportboot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Wassersport", propOrder = {
    "versichertesSportboot"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTWassersport
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "VersichertesSportboot")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVersichertesSportboot> versichertesSportboot;

    /**
     * Gets the value of the versichertesSportboot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versichertesSportboot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersichertesSportboot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVersichertesSportboot }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVersichertesSportboot> getVersichertesSportboot() {
        if (versichertesSportboot == null) {
            versichertesSportboot = new ArrayList<CTVersichertesSportboot>();
        }
        return this.versichertesSportboot;
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
        final CTWassersport that = ((CTWassersport) object);
        {
            List<CTVersichertesSportboot> lhsVersichertesSportboot;
            lhsVersichertesSportboot = (((this.versichertesSportboot!= null)&&(!this.versichertesSportboot.isEmpty()))?this.getVersichertesSportboot():null);
            List<CTVersichertesSportboot> rhsVersichertesSportboot;
            rhsVersichertesSportboot = (((that.versichertesSportboot!= null)&&(!that.versichertesSportboot.isEmpty()))?that.getVersichertesSportboot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertesSportboot", lhsVersichertesSportboot), LocatorUtils.property(thatLocator, "versichertesSportboot", rhsVersichertesSportboot), lhsVersichertesSportboot, rhsVersichertesSportboot, ((this.versichertesSportboot!= null)&&(!this.versichertesSportboot.isEmpty())), ((that.versichertesSportboot!= null)&&(!that.versichertesSportboot.isEmpty())))) {
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
            List<CTVersichertesSportboot> theVersichertesSportboot;
            theVersichertesSportboot = (((this.versichertesSportboot!= null)&&(!this.versichertesSportboot.isEmpty()))?this.getVersichertesSportboot():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertesSportboot", theVersichertesSportboot), currentHashCode, theVersichertesSportboot, ((this.versichertesSportboot!= null)&&(!this.versichertesSportboot.isEmpty())));
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
        if (draftCopy instanceof CTWassersport) {
            final CTWassersport copy = ((CTWassersport) draftCopy);
            {
                Boolean versichertesSportbootShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.versichertesSportboot!= null)&&(!this.versichertesSportboot.isEmpty())));
                if (versichertesSportbootShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVersichertesSportboot> sourceVersichertesSportboot;
                    sourceVersichertesSportboot = (((this.versichertesSportboot!= null)&&(!this.versichertesSportboot.isEmpty()))?this.getVersichertesSportboot():null);
                    @SuppressWarnings("unchecked")
                    List<CTVersichertesSportboot> copyVersichertesSportboot = ((List<CTVersichertesSportboot> ) strategy.copy(LocatorUtils.property(locator, "versichertesSportboot", sourceVersichertesSportboot), sourceVersichertesSportboot, ((this.versichertesSportboot!= null)&&(!this.versichertesSportboot.isEmpty()))));
                    copy.versichertesSportboot = null;
                    if (copyVersichertesSportboot!= null) {
                        List<CTVersichertesSportboot> uniqueVersichertesSportbootl = copy.getVersichertesSportboot();
                        uniqueVersichertesSportbootl.addAll(copyVersichertesSportboot);
                    }
                } else {
                    if (versichertesSportbootShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertesSportboot = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTWassersport();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWassersport withVersichertesSportboot(CTVersichertesSportboot... values) {
        if (values!= null) {
            for (CTVersichertesSportboot value: values) {
                getVersichertesSportboot().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWassersport withVersichertesSportboot(Collection<CTVersichertesSportboot> values) {
        if (values!= null) {
            getVersichertesSportboot().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWassersport withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWassersport withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
