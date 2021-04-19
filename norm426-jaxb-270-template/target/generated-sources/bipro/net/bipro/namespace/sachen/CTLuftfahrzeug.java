
package net.bipro.namespace.sachen;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STLuftfahrzeugtyp;
import net.bipro.namespace.datentypen.STWerteinheit;
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
 * Ein Luftfahrzeug ist ein Gerät, das innerhalb der Erdatmosphäre fliegt oder fährt.
 * 
 * <p>Java class for CT_Luftfahrzeug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Luftfahrzeug"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fluggewicht" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Fluggewichteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Luftfahrzeugtyp" type="{http://www.bipro.net/namespace/datentypen}ST_Luftfahrzeugtyp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Luftfahrzeug", propOrder = {
    "fluggewicht",
    "fluggewichteinheit",
    "luftfahrzeugtyp"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTLuftfahrzeug
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Fluggewicht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal fluggewicht;
    @XmlElement(name = "Fluggewichteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit fluggewichteinheit;
    @XmlElement(name = "Luftfahrzeugtyp")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STLuftfahrzeugtyp luftfahrzeugtyp;

    /**
     * Gets the value of the fluggewicht property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getFluggewicht() {
        return fluggewicht;
    }

    /**
     * Sets the value of the fluggewicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFluggewicht(BigDecimal value) {
        this.fluggewicht = value;
    }

    /**
     * Gets the value of the fluggewichteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getFluggewichteinheit() {
        return fluggewichteinheit;
    }

    /**
     * Sets the value of the fluggewichteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFluggewichteinheit(STWerteinheit value) {
        this.fluggewichteinheit = value;
    }

    /**
     * Gets the value of the luftfahrzeugtyp property.
     * 
     * @return
     *     possible object is
     *     {@link STLuftfahrzeugtyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STLuftfahrzeugtyp getLuftfahrzeugtyp() {
        return luftfahrzeugtyp;
    }

    /**
     * Sets the value of the luftfahrzeugtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLuftfahrzeugtyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLuftfahrzeugtyp(STLuftfahrzeugtyp value) {
        this.luftfahrzeugtyp = value;
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
        final CTLuftfahrzeug that = ((CTLuftfahrzeug) object);
        {
            BigDecimal lhsFluggewicht;
            lhsFluggewicht = this.getFluggewicht();
            BigDecimal rhsFluggewicht;
            rhsFluggewicht = that.getFluggewicht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fluggewicht", lhsFluggewicht), LocatorUtils.property(thatLocator, "fluggewicht", rhsFluggewicht), lhsFluggewicht, rhsFluggewicht, (this.fluggewicht!= null), (that.fluggewicht!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsFluggewichteinheit;
            lhsFluggewichteinheit = this.getFluggewichteinheit();
            STWerteinheit rhsFluggewichteinheit;
            rhsFluggewichteinheit = that.getFluggewichteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fluggewichteinheit", lhsFluggewichteinheit), LocatorUtils.property(thatLocator, "fluggewichteinheit", rhsFluggewichteinheit), lhsFluggewichteinheit, rhsFluggewichteinheit, (this.fluggewichteinheit!= null), (that.fluggewichteinheit!= null))) {
                return false;
            }
        }
        {
            STLuftfahrzeugtyp lhsLuftfahrzeugtyp;
            lhsLuftfahrzeugtyp = this.getLuftfahrzeugtyp();
            STLuftfahrzeugtyp rhsLuftfahrzeugtyp;
            rhsLuftfahrzeugtyp = that.getLuftfahrzeugtyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "luftfahrzeugtyp", lhsLuftfahrzeugtyp), LocatorUtils.property(thatLocator, "luftfahrzeugtyp", rhsLuftfahrzeugtyp), lhsLuftfahrzeugtyp, rhsLuftfahrzeugtyp, (this.luftfahrzeugtyp!= null), (that.luftfahrzeugtyp!= null))) {
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
            BigDecimal theFluggewicht;
            theFluggewicht = this.getFluggewicht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fluggewicht", theFluggewicht), currentHashCode, theFluggewicht, (this.fluggewicht!= null));
        }
        {
            STWerteinheit theFluggewichteinheit;
            theFluggewichteinheit = this.getFluggewichteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fluggewichteinheit", theFluggewichteinheit), currentHashCode, theFluggewichteinheit, (this.fluggewichteinheit!= null));
        }
        {
            STLuftfahrzeugtyp theLuftfahrzeugtyp;
            theLuftfahrzeugtyp = this.getLuftfahrzeugtyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "luftfahrzeugtyp", theLuftfahrzeugtyp), currentHashCode, theLuftfahrzeugtyp, (this.luftfahrzeugtyp!= null));
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
        if (draftCopy instanceof CTLuftfahrzeug) {
            final CTLuftfahrzeug copy = ((CTLuftfahrzeug) draftCopy);
            {
                Boolean fluggewichtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fluggewicht!= null));
                if (fluggewichtShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceFluggewicht;
                    sourceFluggewicht = this.getFluggewicht();
                    BigDecimal copyFluggewicht = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "fluggewicht", sourceFluggewicht), sourceFluggewicht, (this.fluggewicht!= null)));
                    copy.setFluggewicht(copyFluggewicht);
                } else {
                    if (fluggewichtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fluggewicht = null;
                    }
                }
            }
            {
                Boolean fluggewichteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fluggewichteinheit!= null));
                if (fluggewichteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceFluggewichteinheit;
                    sourceFluggewichteinheit = this.getFluggewichteinheit();
                    STWerteinheit copyFluggewichteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "fluggewichteinheit", sourceFluggewichteinheit), sourceFluggewichteinheit, (this.fluggewichteinheit!= null)));
                    copy.setFluggewichteinheit(copyFluggewichteinheit);
                } else {
                    if (fluggewichteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fluggewichteinheit = null;
                    }
                }
            }
            {
                Boolean luftfahrzeugtypShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.luftfahrzeugtyp!= null));
                if (luftfahrzeugtypShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLuftfahrzeugtyp sourceLuftfahrzeugtyp;
                    sourceLuftfahrzeugtyp = this.getLuftfahrzeugtyp();
                    STLuftfahrzeugtyp copyLuftfahrzeugtyp = ((STLuftfahrzeugtyp) strategy.copy(LocatorUtils.property(locator, "luftfahrzeugtyp", sourceLuftfahrzeugtyp), sourceLuftfahrzeugtyp, (this.luftfahrzeugtyp!= null)));
                    copy.setLuftfahrzeugtyp(copyLuftfahrzeugtyp);
                } else {
                    if (luftfahrzeugtypShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.luftfahrzeugtyp = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTLuftfahrzeug();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withFluggewicht(BigDecimal value) {
        setFluggewicht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withFluggewichteinheit(STWerteinheit value) {
        setFluggewichteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withLuftfahrzeugtyp(STLuftfahrzeugtyp value) {
        setLuftfahrzeugtyp(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTLuftfahrzeug withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
