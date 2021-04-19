
package net.bipro.namespace.fragen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * Eine Frage ist ein zu beantwortendes Element. Es gibt mehrere Arten von Fragen, daher ist diese Klasse abstrakt modelliert. Die tatsächlich möglichen Arten von Fragen ergeben sich aus den abgeleiteten Klassen. Erläuterung siehe dort.
 * 
 * <p>Java class for CT_Frage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Frage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Erlaeuterung" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="Optional" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Bedingung" type="{http://www.bipro.net/namespace/fragen}CT_Bedingung" minOccurs="0"/&gt;
 *         &lt;element name="Wiederholbar" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="MaxAntworten" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Frage", propOrder = {
    "erlaeuterung",
    "optional",
    "bedingung",
    "wiederholbar",
    "maxAntworten"
})
@XmlSeeAlso({
    CTEinfacheFrage.class,
    CTKomplexeFrage.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTFrage
    extends CTElement
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Erlaeuterung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String erlaeuterung;
    @XmlElement(name = "Optional")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean optional;
    @XmlElement(name = "Bedingung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBedingung bedingung;
    @XmlElement(name = "Wiederholbar")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean wiederholbar;
    @XmlElement(name = "MaxAntworten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer maxAntworten;

    /**
     * Gets the value of the erlaeuterung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getErlaeuterung() {
        return erlaeuterung;
    }

    /**
     * Sets the value of the erlaeuterung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setErlaeuterung(String value) {
        this.erlaeuterung = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setOptional(Boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the bedingung property.
     * 
     * @return
     *     possible object is
     *     {@link CTBedingung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBedingung getBedingung() {
        return bedingung;
    }

    /**
     * Sets the value of the bedingung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBedingung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBedingung(CTBedingung value) {
        this.bedingung = value;
    }

    /**
     * Gets the value of the wiederholbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isWiederholbar() {
        return wiederholbar;
    }

    /**
     * Sets the value of the wiederholbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setWiederholbar(Boolean value) {
        this.wiederholbar = value;
    }

    /**
     * Gets the value of the maxAntworten property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getMaxAntworten() {
        return maxAntworten;
    }

    /**
     * Sets the value of the maxAntworten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMaxAntworten(Integer value) {
        this.maxAntworten = value;
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
        final CTFrage that = ((CTFrage) object);
        {
            String lhsErlaeuterung;
            lhsErlaeuterung = this.getErlaeuterung();
            String rhsErlaeuterung;
            rhsErlaeuterung = that.getErlaeuterung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erlaeuterung", lhsErlaeuterung), LocatorUtils.property(thatLocator, "erlaeuterung", rhsErlaeuterung), lhsErlaeuterung, rhsErlaeuterung, (this.erlaeuterung!= null), (that.erlaeuterung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsOptional;
            lhsOptional = this.isOptional();
            Boolean rhsOptional;
            rhsOptional = that.isOptional();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optional", lhsOptional), LocatorUtils.property(thatLocator, "optional", rhsOptional), lhsOptional, rhsOptional, (this.optional!= null), (that.optional!= null))) {
                return false;
            }
        }
        {
            CTBedingung lhsBedingung;
            lhsBedingung = this.getBedingung();
            CTBedingung rhsBedingung;
            rhsBedingung = that.getBedingung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bedingung", lhsBedingung), LocatorUtils.property(thatLocator, "bedingung", rhsBedingung), lhsBedingung, rhsBedingung, (this.bedingung!= null), (that.bedingung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsWiederholbar;
            lhsWiederholbar = this.isWiederholbar();
            Boolean rhsWiederholbar;
            rhsWiederholbar = that.isWiederholbar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiederholbar", lhsWiederholbar), LocatorUtils.property(thatLocator, "wiederholbar", rhsWiederholbar), lhsWiederholbar, rhsWiederholbar, (this.wiederholbar!= null), (that.wiederholbar!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaxAntworten;
            lhsMaxAntworten = this.getMaxAntworten();
            Integer rhsMaxAntworten;
            rhsMaxAntworten = that.getMaxAntworten();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxAntworten", lhsMaxAntworten), LocatorUtils.property(thatLocator, "maxAntworten", rhsMaxAntworten), lhsMaxAntworten, rhsMaxAntworten, (this.maxAntworten!= null), (that.maxAntworten!= null))) {
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
            String theErlaeuterung;
            theErlaeuterung = this.getErlaeuterung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erlaeuterung", theErlaeuterung), currentHashCode, theErlaeuterung, (this.erlaeuterung!= null));
        }
        {
            Boolean theOptional;
            theOptional = this.isOptional();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optional", theOptional), currentHashCode, theOptional, (this.optional!= null));
        }
        {
            CTBedingung theBedingung;
            theBedingung = this.getBedingung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bedingung", theBedingung), currentHashCode, theBedingung, (this.bedingung!= null));
        }
        {
            Boolean theWiederholbar;
            theWiederholbar = this.isWiederholbar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiederholbar", theWiederholbar), currentHashCode, theWiederholbar, (this.wiederholbar!= null));
        }
        {
            Integer theMaxAntworten;
            theMaxAntworten = this.getMaxAntworten();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxAntworten", theMaxAntworten), currentHashCode, theMaxAntworten, (this.maxAntworten!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTFrage) {
            final CTFrage copy = ((CTFrage) target);
            {
                Boolean erlaeuterungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erlaeuterung!= null));
                if (erlaeuterungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErlaeuterung;
                    sourceErlaeuterung = this.getErlaeuterung();
                    String copyErlaeuterung = ((String) strategy.copy(LocatorUtils.property(locator, "erlaeuterung", sourceErlaeuterung), sourceErlaeuterung, (this.erlaeuterung!= null)));
                    copy.setErlaeuterung(copyErlaeuterung);
                } else {
                    if (erlaeuterungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erlaeuterung = null;
                    }
                }
            }
            {
                Boolean optionalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.optional!= null));
                if (optionalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceOptional;
                    sourceOptional = this.isOptional();
                    Boolean copyOptional = ((Boolean) strategy.copy(LocatorUtils.property(locator, "optional", sourceOptional), sourceOptional, (this.optional!= null)));
                    copy.setOptional(copyOptional);
                } else {
                    if (optionalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.optional = null;
                    }
                }
            }
            {
                Boolean bedingungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bedingung!= null));
                if (bedingungShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBedingung sourceBedingung;
                    sourceBedingung = this.getBedingung();
                    CTBedingung copyBedingung = ((CTBedingung) strategy.copy(LocatorUtils.property(locator, "bedingung", sourceBedingung), sourceBedingung, (this.bedingung!= null)));
                    copy.setBedingung(copyBedingung);
                } else {
                    if (bedingungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bedingung = null;
                    }
                }
            }
            {
                Boolean wiederholbarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wiederholbar!= null));
                if (wiederholbarShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceWiederholbar;
                    sourceWiederholbar = this.isWiederholbar();
                    Boolean copyWiederholbar = ((Boolean) strategy.copy(LocatorUtils.property(locator, "wiederholbar", sourceWiederholbar), sourceWiederholbar, (this.wiederholbar!= null)));
                    copy.setWiederholbar(copyWiederholbar);
                } else {
                    if (wiederholbarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wiederholbar = null;
                    }
                }
            }
            {
                Boolean maxAntwortenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxAntworten!= null));
                if (maxAntwortenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMaxAntworten;
                    sourceMaxAntworten = this.getMaxAntworten();
                    Integer copyMaxAntworten = ((Integer) strategy.copy(LocatorUtils.property(locator, "maxAntworten", sourceMaxAntworten), sourceMaxAntworten, (this.maxAntworten!= null)));
                    copy.setMaxAntworten(copyMaxAntworten);
                } else {
                    if (maxAntwortenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxAntworten = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withErlaeuterung(String value) {
        setErlaeuterung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withOptional(Boolean value) {
        setOptional(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withBedingung(CTBedingung value) {
        setBedingung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withWiederholbar(Boolean value) {
        setWiederholbar(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withMaxAntworten(Integer value) {
        setMaxAntworten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withOrdnungsnummer(Integer value) {
        setOrdnungsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withAnzeigenummer(String value) {
        setAnzeigenummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrage withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
