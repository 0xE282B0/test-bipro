
package net.bipro.namespace.fragen;

import java.util.Collection;
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
 * Ableitung der Klasse Antwort zur typisierten Übertragung eines Zeitraumes als Antwort.
 * 
 * <p>Java class for CT_AntwortZeitraum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_AntwortZeitraum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_Antwort"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Von" type="{http://www.bipro.net/namespace/datentypen}ST_Datum"/&gt;
 *         &lt;element name="Bis" type="{http://www.bipro.net/namespace/datentypen}ST_Datum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AntwortZeitraum", propOrder = {
    "von",
    "bis"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAntwortZeitraum
    extends CTAntwort
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Von", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String von;
    @XmlElement(name = "Bis", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String bis;

    /**
     * Gets the value of the von property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getVon() {
        return von;
    }

    /**
     * Sets the value of the von property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setVon(String value) {
        this.von = value;
    }

    /**
     * Gets the value of the bis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBis() {
        return bis;
    }

    /**
     * Sets the value of the bis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBis(String value) {
        this.bis = value;
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
        final CTAntwortZeitraum that = ((CTAntwortZeitraum) object);
        {
            String lhsVon;
            lhsVon = this.getVon();
            String rhsVon;
            rhsVon = that.getVon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "von", lhsVon), LocatorUtils.property(thatLocator, "von", rhsVon), lhsVon, rhsVon, (this.von!= null), (that.von!= null))) {
                return false;
            }
        }
        {
            String lhsBis;
            lhsBis = this.getBis();
            String rhsBis;
            rhsBis = that.getBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bis", lhsBis), LocatorUtils.property(thatLocator, "bis", rhsBis), lhsBis, rhsBis, (this.bis!= null), (that.bis!= null))) {
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
            String theVon;
            theVon = this.getVon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "von", theVon), currentHashCode, theVon, (this.von!= null));
        }
        {
            String theBis;
            theBis = this.getBis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bis", theBis), currentHashCode, theBis, (this.bis!= null));
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
        if (draftCopy instanceof CTAntwortZeitraum) {
            final CTAntwortZeitraum copy = ((CTAntwortZeitraum) draftCopy);
            {
                Boolean vonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.von!= null));
                if (vonShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVon;
                    sourceVon = this.getVon();
                    String copyVon = ((String) strategy.copy(LocatorUtils.property(locator, "von", sourceVon), sourceVon, (this.von!= null)));
                    copy.setVon(copyVon);
                } else {
                    if (vonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.von = null;
                    }
                }
            }
            {
                Boolean bisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bis!= null));
                if (bisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBis;
                    sourceBis = this.getBis();
                    String copyBis = ((String) strategy.copy(LocatorUtils.property(locator, "bis", sourceBis), sourceBis, (this.bis!= null)));
                    copy.setBis(copyBis);
                } else {
                    if (bisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bis = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAntwortZeitraum();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortZeitraum withVon(String value) {
        setVon(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortZeitraum withBis(String value) {
        setBis(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortZeitraum withFreitext(String value) {
        setFreitext(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortZeitraum withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortZeitraum withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
