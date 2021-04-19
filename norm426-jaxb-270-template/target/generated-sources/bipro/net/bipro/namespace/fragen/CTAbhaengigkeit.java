
package net.bipro.namespace.fragen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STOperator;
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
 * Eine Frage wird relevant, wenn der durch die Bedingung gebildete logische Ausdruck mit &bdquo;wahr&ldquo; bewertet wird. In der Klasse Abhängigkeit wird angegeben, mit welchem Vergleichsoperator die vom Anwender erfasste Antwort auf eine bestimmte Frage mit einem vom Provider vorgebenen Antwortwert zu vergleichen ist.
 * 
 * <p>Java class for CT_Abhaengigkeit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Abhaengigkeit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_Bedingung"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkerOperand" type="{http://www.bipro.net/namespace/datentypen}ST_ID"/&gt;
 *         &lt;element name="Operator" type="{http://www.bipro.net/namespace/datentypen}ST_Operator"/&gt;
 *         &lt;element name="RechterOperand" type="{http://www.bipro.net/namespace/fragen}CT_Antwort"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Abhaengigkeit", propOrder = {
    "linkerOperand",
    "operator",
    "rechterOperand"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAbhaengigkeit
    extends CTBedingung
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "LinkerOperand", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String linkerOperand;
    @XmlElement(name = "Operator", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STOperator operator;
    @XmlElement(name = "RechterOperand", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTAntwort rechterOperand;

    /**
     * Gets the value of the linkerOperand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getLinkerOperand() {
        return linkerOperand;
    }

    /**
     * Sets the value of the linkerOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLinkerOperand(String value) {
        this.linkerOperand = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link STOperator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link STOperator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setOperator(STOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the rechterOperand property.
     * 
     * @return
     *     possible object is
     *     {@link CTAntwort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwort getRechterOperand() {
        return rechterOperand;
    }

    /**
     * Sets the value of the rechterOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAntwort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setRechterOperand(CTAntwort value) {
        this.rechterOperand = value;
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
        final CTAbhaengigkeit that = ((CTAbhaengigkeit) object);
        {
            String lhsLinkerOperand;
            lhsLinkerOperand = this.getLinkerOperand();
            String rhsLinkerOperand;
            rhsLinkerOperand = that.getLinkerOperand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linkerOperand", lhsLinkerOperand), LocatorUtils.property(thatLocator, "linkerOperand", rhsLinkerOperand), lhsLinkerOperand, rhsLinkerOperand, (this.linkerOperand!= null), (that.linkerOperand!= null))) {
                return false;
            }
        }
        {
            STOperator lhsOperator;
            lhsOperator = this.getOperator();
            STOperator rhsOperator;
            rhsOperator = that.getOperator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operator", lhsOperator), LocatorUtils.property(thatLocator, "operator", rhsOperator), lhsOperator, rhsOperator, (this.operator!= null), (that.operator!= null))) {
                return false;
            }
        }
        {
            CTAntwort lhsRechterOperand;
            lhsRechterOperand = this.getRechterOperand();
            CTAntwort rhsRechterOperand;
            rhsRechterOperand = that.getRechterOperand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rechterOperand", lhsRechterOperand), LocatorUtils.property(thatLocator, "rechterOperand", rhsRechterOperand), lhsRechterOperand, rhsRechterOperand, (this.rechterOperand!= null), (that.rechterOperand!= null))) {
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
            String theLinkerOperand;
            theLinkerOperand = this.getLinkerOperand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linkerOperand", theLinkerOperand), currentHashCode, theLinkerOperand, (this.linkerOperand!= null));
        }
        {
            STOperator theOperator;
            theOperator = this.getOperator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operator", theOperator), currentHashCode, theOperator, (this.operator!= null));
        }
        {
            CTAntwort theRechterOperand;
            theRechterOperand = this.getRechterOperand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rechterOperand", theRechterOperand), currentHashCode, theRechterOperand, (this.rechterOperand!= null));
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
        if (draftCopy instanceof CTAbhaengigkeit) {
            final CTAbhaengigkeit copy = ((CTAbhaengigkeit) draftCopy);
            {
                Boolean linkerOperandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.linkerOperand!= null));
                if (linkerOperandShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLinkerOperand;
                    sourceLinkerOperand = this.getLinkerOperand();
                    String copyLinkerOperand = ((String) strategy.copy(LocatorUtils.property(locator, "linkerOperand", sourceLinkerOperand), sourceLinkerOperand, (this.linkerOperand!= null)));
                    copy.setLinkerOperand(copyLinkerOperand);
                } else {
                    if (linkerOperandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.linkerOperand = null;
                    }
                }
            }
            {
                Boolean operatorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.operator!= null));
                if (operatorShouldBeCopiedAndSet == Boolean.TRUE) {
                    STOperator sourceOperator;
                    sourceOperator = this.getOperator();
                    STOperator copyOperator = ((STOperator) strategy.copy(LocatorUtils.property(locator, "operator", sourceOperator), sourceOperator, (this.operator!= null)));
                    copy.setOperator(copyOperator);
                } else {
                    if (operatorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.operator = null;
                    }
                }
            }
            {
                Boolean rechterOperandShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rechterOperand!= null));
                if (rechterOperandShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAntwort sourceRechterOperand;
                    sourceRechterOperand = this.getRechterOperand();
                    CTAntwort copyRechterOperand = ((CTAntwort) strategy.copy(LocatorUtils.property(locator, "rechterOperand", sourceRechterOperand), sourceRechterOperand, (this.rechterOperand!= null)));
                    copy.setRechterOperand(copyRechterOperand);
                } else {
                    if (rechterOperandShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rechterOperand = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAbhaengigkeit();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbhaengigkeit withLinkerOperand(String value) {
        setLinkerOperand(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbhaengigkeit withOperator(STOperator value) {
        setOperator(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbhaengigkeit withRechterOperand(CTAntwort value) {
        setRechterOperand(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbhaengigkeit withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAbhaengigkeit withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
