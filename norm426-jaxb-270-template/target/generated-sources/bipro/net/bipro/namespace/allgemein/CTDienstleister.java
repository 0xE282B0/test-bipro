
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
 * Dienstleister, der einen Service erbringt.
 * 
 * <p>Java class for CT_Dienstleister complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Dienstleister"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerID" type="{http://www.bipro.net/namespace/datentypen}ST_ID"/&gt;
 *         &lt;element name="SubDienstleister" type="{http://www.bipro.net/namespace/allgemein}CT_Dienstleister" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Dienstleister", propOrder = {
    "partnerID",
    "subDienstleister"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTDienstleister
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "PartnerID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String partnerID;
    @XmlElement(name = "SubDienstleister")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTDienstleister> subDienstleister;

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the subDienstleister property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDienstleister property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDienstleister().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDienstleister }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTDienstleister> getSubDienstleister() {
        if (subDienstleister == null) {
            subDienstleister = new ArrayList<CTDienstleister>();
        }
        return this.subDienstleister;
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
        final CTDienstleister that = ((CTDienstleister) object);
        {
            String lhsPartnerID;
            lhsPartnerID = this.getPartnerID();
            String rhsPartnerID;
            rhsPartnerID = that.getPartnerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerID", lhsPartnerID), LocatorUtils.property(thatLocator, "partnerID", rhsPartnerID), lhsPartnerID, rhsPartnerID, (this.partnerID!= null), (that.partnerID!= null))) {
                return false;
            }
        }
        {
            List<CTDienstleister> lhsSubDienstleister;
            lhsSubDienstleister = (((this.subDienstleister!= null)&&(!this.subDienstleister.isEmpty()))?this.getSubDienstleister():null);
            List<CTDienstleister> rhsSubDienstleister;
            rhsSubDienstleister = (((that.subDienstleister!= null)&&(!that.subDienstleister.isEmpty()))?that.getSubDienstleister():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subDienstleister", lhsSubDienstleister), LocatorUtils.property(thatLocator, "subDienstleister", rhsSubDienstleister), lhsSubDienstleister, rhsSubDienstleister, ((this.subDienstleister!= null)&&(!this.subDienstleister.isEmpty())), ((that.subDienstleister!= null)&&(!that.subDienstleister.isEmpty())))) {
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
            String thePartnerID;
            thePartnerID = this.getPartnerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerID", thePartnerID), currentHashCode, thePartnerID, (this.partnerID!= null));
        }
        {
            List<CTDienstleister> theSubDienstleister;
            theSubDienstleister = (((this.subDienstleister!= null)&&(!this.subDienstleister.isEmpty()))?this.getSubDienstleister():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subDienstleister", theSubDienstleister), currentHashCode, theSubDienstleister, ((this.subDienstleister!= null)&&(!this.subDienstleister.isEmpty())));
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
        if (draftCopy instanceof CTDienstleister) {
            final CTDienstleister copy = ((CTDienstleister) draftCopy);
            {
                Boolean partnerIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partnerID!= null));
                if (partnerIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePartnerID;
                    sourcePartnerID = this.getPartnerID();
                    String copyPartnerID = ((String) strategy.copy(LocatorUtils.property(locator, "partnerID", sourcePartnerID), sourcePartnerID, (this.partnerID!= null)));
                    copy.setPartnerID(copyPartnerID);
                } else {
                    if (partnerIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnerID = null;
                    }
                }
            }
            {
                Boolean subDienstleisterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.subDienstleister!= null)&&(!this.subDienstleister.isEmpty())));
                if (subDienstleisterShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDienstleister> sourceSubDienstleister;
                    sourceSubDienstleister = (((this.subDienstleister!= null)&&(!this.subDienstleister.isEmpty()))?this.getSubDienstleister():null);
                    @SuppressWarnings("unchecked")
                    List<CTDienstleister> copySubDienstleister = ((List<CTDienstleister> ) strategy.copy(LocatorUtils.property(locator, "subDienstleister", sourceSubDienstleister), sourceSubDienstleister, ((this.subDienstleister!= null)&&(!this.subDienstleister.isEmpty()))));
                    copy.subDienstleister = null;
                    if (copySubDienstleister!= null) {
                        List<CTDienstleister> uniqueSubDienstleisterl = copy.getSubDienstleister();
                        uniqueSubDienstleisterl.addAll(copySubDienstleister);
                    }
                } else {
                    if (subDienstleisterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.subDienstleister = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDienstleister();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDienstleister withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDienstleister withSubDienstleister(CTDienstleister... values) {
        if (values!= null) {
            for (CTDienstleister value: values) {
                getSubDienstleister().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDienstleister withSubDienstleister(Collection<CTDienstleister> values) {
        if (values!= null) {
            getSubDienstleister().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDienstleister withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTDienstleister withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
