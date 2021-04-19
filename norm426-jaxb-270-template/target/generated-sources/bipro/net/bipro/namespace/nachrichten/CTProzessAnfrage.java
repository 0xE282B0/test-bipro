
package net.bipro.namespace.nachrichten;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTFileRequest;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.versicherung.tarifierung.CTOfferRequest;
import net.bipro.namespace.versicherung.tarifierung.CTOrderRequest;
import net.bipro.namespace.versicherung.tarifierung.CTQuoteRequest;
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
 * Prozess-Objekt. Alle Anfrage-Nachrichten innerhalb der von der BiPRO definierten Prozesse werden von diesem Datentypen abgeleitet.
 * 
 * <p>Java class for CT_ProzessAnfrage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ProzessAnfrage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BiPROVersion" type="{http://www.bipro.net/namespace/datentypen}ST_Version"/&gt;
 *         &lt;element name="ConsumerID" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ProzessAnfrage", propOrder = {
    "biPROVersion",
    "consumerID"
})
@XmlSeeAlso({
    CTFileRequest.class,
    CTOfferRequest.class,
    CTOrderRequest.class,
    CTQuoteRequest.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTProzessAnfrage
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "BiPROVersion", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String biPROVersion;
    @XmlElement(name = "ConsumerID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String consumerID;

    /**
     * Gets the value of the biPROVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBiPROVersion() {
        return biPROVersion;
    }

    /**
     * Sets the value of the biPROVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBiPROVersion(String value) {
        this.biPROVersion = value;
    }

    /**
     * Gets the value of the consumerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getConsumerID() {
        return consumerID;
    }

    /**
     * Sets the value of the consumerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setConsumerID(String value) {
        this.consumerID = value;
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
        final CTProzessAnfrage that = ((CTProzessAnfrage) object);
        {
            String lhsBiPROVersion;
            lhsBiPROVersion = this.getBiPROVersion();
            String rhsBiPROVersion;
            rhsBiPROVersion = that.getBiPROVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "biPROVersion", lhsBiPROVersion), LocatorUtils.property(thatLocator, "biPROVersion", rhsBiPROVersion), lhsBiPROVersion, rhsBiPROVersion, (this.biPROVersion!= null), (that.biPROVersion!= null))) {
                return false;
            }
        }
        {
            String lhsConsumerID;
            lhsConsumerID = this.getConsumerID();
            String rhsConsumerID;
            rhsConsumerID = that.getConsumerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerID", lhsConsumerID), LocatorUtils.property(thatLocator, "consumerID", rhsConsumerID), lhsConsumerID, rhsConsumerID, (this.consumerID!= null), (that.consumerID!= null))) {
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
            String theBiPROVersion;
            theBiPROVersion = this.getBiPROVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "biPROVersion", theBiPROVersion), currentHashCode, theBiPROVersion, (this.biPROVersion!= null));
        }
        {
            String theConsumerID;
            theConsumerID = this.getConsumerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerID", theConsumerID), currentHashCode, theConsumerID, (this.consumerID!= null));
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
        if (target instanceof CTProzessAnfrage) {
            final CTProzessAnfrage copy = ((CTProzessAnfrage) target);
            {
                Boolean biPROVersionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.biPROVersion!= null));
                if (biPROVersionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBiPROVersion;
                    sourceBiPROVersion = this.getBiPROVersion();
                    String copyBiPROVersion = ((String) strategy.copy(LocatorUtils.property(locator, "biPROVersion", sourceBiPROVersion), sourceBiPROVersion, (this.biPROVersion!= null)));
                    copy.setBiPROVersion(copyBiPROVersion);
                } else {
                    if (biPROVersionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.biPROVersion = null;
                    }
                }
            }
            {
                Boolean consumerIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.consumerID!= null));
                if (consumerIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceConsumerID;
                    sourceConsumerID = this.getConsumerID();
                    String copyConsumerID = ((String) strategy.copy(LocatorUtils.property(locator, "consumerID", sourceConsumerID), sourceConsumerID, (this.consumerID!= null)));
                    copy.setConsumerID(copyConsumerID);
                } else {
                    if (consumerIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.consumerID = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProzessAnfrage withBiPROVersion(String value) {
        setBiPROVersion(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProzessAnfrage withConsumerID(String value) {
        setConsumerID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProzessAnfrage withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProzessAnfrage withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
