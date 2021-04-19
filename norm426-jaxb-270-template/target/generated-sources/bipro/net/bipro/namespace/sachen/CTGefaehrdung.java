
package net.bipro.namespace.sachen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
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
 * Klasse zur Abbildung von speziellen Gefahrumständen 
 * 
 * <p>Java class for CT_Gefaehrdung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gefaehrdung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_ZusaetzlicheGegenstandsdaten"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntfernungZu" type="{http://www.bipro.net/namespace/sachen}CT_EntfernungZu" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gefaehrdung", propOrder = {
    "entfernungZu"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGefaehrdung
    extends CTZusaetzlicheGegenstandsdaten
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "EntfernungZu")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTEntfernungZu entfernungZu;

    /**
     * Gets the value of the entfernungZu property.
     * 
     * @return
     *     possible object is
     *     {@link CTEntfernungZu }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEntfernungZu getEntfernungZu() {
        return entfernungZu;
    }

    /**
     * Sets the value of the entfernungZu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEntfernungZu }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEntfernungZu(CTEntfernungZu value) {
        this.entfernungZu = value;
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
        final CTGefaehrdung that = ((CTGefaehrdung) object);
        {
            CTEntfernungZu lhsEntfernungZu;
            lhsEntfernungZu = this.getEntfernungZu();
            CTEntfernungZu rhsEntfernungZu;
            rhsEntfernungZu = that.getEntfernungZu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entfernungZu", lhsEntfernungZu), LocatorUtils.property(thatLocator, "entfernungZu", rhsEntfernungZu), lhsEntfernungZu, rhsEntfernungZu, (this.entfernungZu!= null), (that.entfernungZu!= null))) {
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
            CTEntfernungZu theEntfernungZu;
            theEntfernungZu = this.getEntfernungZu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entfernungZu", theEntfernungZu), currentHashCode, theEntfernungZu, (this.entfernungZu!= null));
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
        if (draftCopy instanceof CTGefaehrdung) {
            final CTGefaehrdung copy = ((CTGefaehrdung) draftCopy);
            {
                Boolean entfernungZuShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.entfernungZu!= null));
                if (entfernungZuShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTEntfernungZu sourceEntfernungZu;
                    sourceEntfernungZu = this.getEntfernungZu();
                    CTEntfernungZu copyEntfernungZu = ((CTEntfernungZu) strategy.copy(LocatorUtils.property(locator, "entfernungZu", sourceEntfernungZu), sourceEntfernungZu, (this.entfernungZu!= null)));
                    copy.setEntfernungZu(copyEntfernungZu);
                } else {
                    if (entfernungZuShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.entfernungZu = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGefaehrdung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefaehrdung withEntfernungZu(CTEntfernungZu value) {
        setEntfernungZu(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefaehrdung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefaehrdung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
