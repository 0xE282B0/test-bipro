
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
 * Frage deren Antwort in Form eines Textes zu geben ist.
 * 
 * <p>Java class for CT_FrageText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_FrageText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_EinfacheFrage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximaleTextlaenge" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="AntwortText" type="{http://www.bipro.net/namespace/fragen}CT_AntwortText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_FrageText", propOrder = {
    "maximaleTextlaenge",
    "antwortText"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTFrageText
    extends CTEinfacheFrage
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "MaximaleTextlaenge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer maximaleTextlaenge;
    @XmlElement(name = "AntwortText")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTAntwortText antwortText;

    /**
     * Gets the value of the maximaleTextlaenge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getMaximaleTextlaenge() {
        return maximaleTextlaenge;
    }

    /**
     * Sets the value of the maximaleTextlaenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMaximaleTextlaenge(Integer value) {
        this.maximaleTextlaenge = value;
    }

    /**
     * Gets the value of the antwortText property.
     * 
     * @return
     *     possible object is
     *     {@link CTAntwortText }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortText getAntwortText() {
        return antwortText;
    }

    /**
     * Sets the value of the antwortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAntwortText }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAntwortText(CTAntwortText value) {
        this.antwortText = value;
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
        final CTFrageText that = ((CTFrageText) object);
        {
            Integer lhsMaximaleTextlaenge;
            lhsMaximaleTextlaenge = this.getMaximaleTextlaenge();
            Integer rhsMaximaleTextlaenge;
            rhsMaximaleTextlaenge = that.getMaximaleTextlaenge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximaleTextlaenge", lhsMaximaleTextlaenge), LocatorUtils.property(thatLocator, "maximaleTextlaenge", rhsMaximaleTextlaenge), lhsMaximaleTextlaenge, rhsMaximaleTextlaenge, (this.maximaleTextlaenge!= null), (that.maximaleTextlaenge!= null))) {
                return false;
            }
        }
        {
            CTAntwortText lhsAntwortText;
            lhsAntwortText = this.getAntwortText();
            CTAntwortText rhsAntwortText;
            rhsAntwortText = that.getAntwortText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antwortText", lhsAntwortText), LocatorUtils.property(thatLocator, "antwortText", rhsAntwortText), lhsAntwortText, rhsAntwortText, (this.antwortText!= null), (that.antwortText!= null))) {
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
            Integer theMaximaleTextlaenge;
            theMaximaleTextlaenge = this.getMaximaleTextlaenge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximaleTextlaenge", theMaximaleTextlaenge), currentHashCode, theMaximaleTextlaenge, (this.maximaleTextlaenge!= null));
        }
        {
            CTAntwortText theAntwortText;
            theAntwortText = this.getAntwortText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antwortText", theAntwortText), currentHashCode, theAntwortText, (this.antwortText!= null));
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
        if (draftCopy instanceof CTFrageText) {
            final CTFrageText copy = ((CTFrageText) draftCopy);
            {
                Boolean maximaleTextlaengeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maximaleTextlaenge!= null));
                if (maximaleTextlaengeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMaximaleTextlaenge;
                    sourceMaximaleTextlaenge = this.getMaximaleTextlaenge();
                    Integer copyMaximaleTextlaenge = ((Integer) strategy.copy(LocatorUtils.property(locator, "maximaleTextlaenge", sourceMaximaleTextlaenge), sourceMaximaleTextlaenge, (this.maximaleTextlaenge!= null)));
                    copy.setMaximaleTextlaenge(copyMaximaleTextlaenge);
                } else {
                    if (maximaleTextlaengeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maximaleTextlaenge = null;
                    }
                }
            }
            {
                Boolean antwortTextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antwortText!= null));
                if (antwortTextShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAntwortText sourceAntwortText;
                    sourceAntwortText = this.getAntwortText();
                    CTAntwortText copyAntwortText = ((CTAntwortText) strategy.copy(LocatorUtils.property(locator, "antwortText", sourceAntwortText), sourceAntwortText, (this.antwortText!= null)));
                    copy.setAntwortText(copyAntwortText);
                } else {
                    if (antwortTextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antwortText = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFrageText();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withMaximaleTextlaenge(Integer value) {
        setMaximaleTextlaenge(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withAntwortText(CTAntwortText value) {
        setAntwortText(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withFachlicheID(String value) {
        setFachlicheID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withTechnischeID(String value) {
        setTechnischeID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withText(String value) {
        setText(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withFreitextErlaubt(Boolean value) {
        setFreitextErlaubt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withErlaeuterung(String value) {
        setErlaeuterung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withOptional(Boolean value) {
        setOptional(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withBedingung(CTBedingung value) {
        setBedingung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withWiederholbar(Boolean value) {
        setWiederholbar(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withMaxAntworten(Integer value) {
        setMaxAntworten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withOrdnungsnummer(Integer value) {
        setOrdnungsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withAnzeigenummer(String value) {
        setAnzeigenummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageText withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
