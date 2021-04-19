
package net.bipro.namespace.allgemein;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.nachrichten.CTProzessAnfrage;
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
 * Nachrichten-Objekt zur Abfrage des Status eines laufenden Prozesses.
 * 
 * <p>Java class for CT_FileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_FileRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/nachrichten}CT_ProzessAnfrage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datei" type="{http://www.bipro.net/namespace/allgemein}CT_Datei" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_FileRequest", propOrder = {
    "datei"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTFileRequest
    extends CTProzessAnfrage
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Datei", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTDatei> datei;

    /**
     * Gets the value of the datei property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datei property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatei().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDatei }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTDatei> getDatei() {
        if (datei == null) {
            datei = new ArrayList<CTDatei>();
        }
        return this.datei;
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
        final CTFileRequest that = ((CTFileRequest) object);
        {
            List<CTDatei> lhsDatei;
            lhsDatei = (((this.datei!= null)&&(!this.datei.isEmpty()))?this.getDatei():null);
            List<CTDatei> rhsDatei;
            rhsDatei = (((that.datei!= null)&&(!that.datei.isEmpty()))?that.getDatei():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datei", lhsDatei), LocatorUtils.property(thatLocator, "datei", rhsDatei), lhsDatei, rhsDatei, ((this.datei!= null)&&(!this.datei.isEmpty())), ((that.datei!= null)&&(!that.datei.isEmpty())))) {
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
            List<CTDatei> theDatei;
            theDatei = (((this.datei!= null)&&(!this.datei.isEmpty()))?this.getDatei():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datei", theDatei), currentHashCode, theDatei, ((this.datei!= null)&&(!this.datei.isEmpty())));
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
        if (draftCopy instanceof CTFileRequest) {
            final CTFileRequest copy = ((CTFileRequest) draftCopy);
            {
                Boolean dateiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.datei!= null)&&(!this.datei.isEmpty())));
                if (dateiShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDatei> sourceDatei;
                    sourceDatei = (((this.datei!= null)&&(!this.datei.isEmpty()))?this.getDatei():null);
                    @SuppressWarnings("unchecked")
                    List<CTDatei> copyDatei = ((List<CTDatei> ) strategy.copy(LocatorUtils.property(locator, "datei", sourceDatei), sourceDatei, ((this.datei!= null)&&(!this.datei.isEmpty()))));
                    copy.datei = null;
                    if (copyDatei!= null) {
                        List<CTDatei> uniqueDateil = copy.getDatei();
                        uniqueDateil.addAll(copyDatei);
                    }
                } else {
                    if (dateiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datei = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFileRequest();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFileRequest withDatei(CTDatei... values) {
        if (values!= null) {
            for (CTDatei value: values) {
                getDatei().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFileRequest withDatei(Collection<CTDatei> values) {
        if (values!= null) {
            getDatei().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFileRequest withBiPROVersion(String value) {
        setBiPROVersion(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFileRequest withConsumerID(String value) {
        setConsumerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFileRequest withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFileRequest withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
