
package net.bipro.namespace.allgemein;

import java.util.Collection;
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
 * Klasse zur Übermittlung von Informationen, wann, wo und ob eine Unterschrift geleistet wurde. 
 * 
 * <p>Java class for CT_Unterschrift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Unterschrift"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ort" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Datum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="UnterschriftLiegtVor" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Unterschrift", propOrder = {
    "ort",
    "datum",
    "unterschriftLiegtVor"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTUnterschrift
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Ort")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String ort;
    @XmlElement(name = "Datum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String datum;
    @XmlElement(name = "UnterschriftLiegtVor")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean unterschriftLiegtVor;

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Gets the value of the unterschriftLiegtVor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isUnterschriftLiegtVor() {
        return unterschriftLiegtVor;
    }

    /**
     * Sets the value of the unterschriftLiegtVor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setUnterschriftLiegtVor(Boolean value) {
        this.unterschriftLiegtVor = value;
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
        final CTUnterschrift that = ((CTUnterschrift) object);
        {
            String lhsOrt;
            lhsOrt = this.getOrt();
            String rhsOrt;
            rhsOrt = that.getOrt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ort", lhsOrt), LocatorUtils.property(thatLocator, "ort", rhsOrt), lhsOrt, rhsOrt, (this.ort!= null), (that.ort!= null))) {
                return false;
            }
        }
        {
            String lhsDatum;
            lhsDatum = this.getDatum();
            String rhsDatum;
            rhsDatum = that.getDatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datum", lhsDatum), LocatorUtils.property(thatLocator, "datum", rhsDatum), lhsDatum, rhsDatum, (this.datum!= null), (that.datum!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUnterschriftLiegtVor;
            lhsUnterschriftLiegtVor = this.isUnterschriftLiegtVor();
            Boolean rhsUnterschriftLiegtVor;
            rhsUnterschriftLiegtVor = that.isUnterschriftLiegtVor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unterschriftLiegtVor", lhsUnterschriftLiegtVor), LocatorUtils.property(thatLocator, "unterschriftLiegtVor", rhsUnterschriftLiegtVor), lhsUnterschriftLiegtVor, rhsUnterschriftLiegtVor, (this.unterschriftLiegtVor!= null), (that.unterschriftLiegtVor!= null))) {
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
            String theOrt;
            theOrt = this.getOrt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ort", theOrt), currentHashCode, theOrt, (this.ort!= null));
        }
        {
            String theDatum;
            theDatum = this.getDatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datum", theDatum), currentHashCode, theDatum, (this.datum!= null));
        }
        {
            Boolean theUnterschriftLiegtVor;
            theUnterschriftLiegtVor = this.isUnterschriftLiegtVor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unterschriftLiegtVor", theUnterschriftLiegtVor), currentHashCode, theUnterschriftLiegtVor, (this.unterschriftLiegtVor!= null));
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
        if (draftCopy instanceof CTUnterschrift) {
            final CTUnterschrift copy = ((CTUnterschrift) draftCopy);
            {
                Boolean ortShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ort!= null));
                if (ortShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOrt;
                    sourceOrt = this.getOrt();
                    String copyOrt = ((String) strategy.copy(LocatorUtils.property(locator, "ort", sourceOrt), sourceOrt, (this.ort!= null)));
                    copy.setOrt(copyOrt);
                } else {
                    if (ortShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ort = null;
                    }
                }
            }
            {
                Boolean datumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.datum!= null));
                if (datumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDatum;
                    sourceDatum = this.getDatum();
                    String copyDatum = ((String) strategy.copy(LocatorUtils.property(locator, "datum", sourceDatum), sourceDatum, (this.datum!= null)));
                    copy.setDatum(copyDatum);
                } else {
                    if (datumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.datum = null;
                    }
                }
            }
            {
                Boolean unterschriftLiegtVorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unterschriftLiegtVor!= null));
                if (unterschriftLiegtVorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceUnterschriftLiegtVor;
                    sourceUnterschriftLiegtVor = this.isUnterschriftLiegtVor();
                    Boolean copyUnterschriftLiegtVor = ((Boolean) strategy.copy(LocatorUtils.property(locator, "unterschriftLiegtVor", sourceUnterschriftLiegtVor), sourceUnterschriftLiegtVor, (this.unterschriftLiegtVor!= null)));
                    copy.setUnterschriftLiegtVor(copyUnterschriftLiegtVor);
                } else {
                    if (unterschriftLiegtVorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unterschriftLiegtVor = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTUnterschrift();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnterschrift withOrt(String value) {
        setOrt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnterschrift withDatum(String value) {
        setDatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnterschrift withUnterschriftLiegtVor(Boolean value) {
        setUnterschriftLiegtVor(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnterschrift withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnterschrift withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
