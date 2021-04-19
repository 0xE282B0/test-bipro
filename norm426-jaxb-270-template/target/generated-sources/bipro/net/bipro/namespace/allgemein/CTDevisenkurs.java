
package net.bipro.namespace.allgemein;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
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
 * Der Umrechnungskurs von einer Währung in eine andere Währung.
 * 
 * <p>Java class for CT_Devisenkurs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Devisenkurs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ausgangswaehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel"/&gt;
 *         &lt;element name="Zielwaehrung" type="{http://www.bipro.net/namespace/datentypen}ST_Waehrungsschluessel"/&gt;
 *         &lt;element name="Kurs" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl"/&gt;
 *         &lt;element name="Zeitpunkt" type="{http://www.bipro.net/namespace/datentypen}ST_DatumZeit"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Devisenkurs", propOrder = {
    "ausgangswaehrung",
    "zielwaehrung",
    "kurs",
    "zeitpunkt"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTDevisenkurs
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Ausgangswaehrung", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel ausgangswaehrung;
    @XmlElement(name = "Zielwaehrung", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STWaehrungsschluessel zielwaehrung;
    @XmlElement(name = "Kurs", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal kurs;
    @XmlElement(name = "Zeitpunkt", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String zeitpunkt;

    /**
     * Gets the value of the ausgangswaehrung property.
     * 
     * @return
     *     possible object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWaehrungsschluessel getAusgangswaehrung() {
        return ausgangswaehrung;
    }

    /**
     * Sets the value of the ausgangswaehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAusgangswaehrung(STWaehrungsschluessel value) {
        this.ausgangswaehrung = value;
    }

    /**
     * Gets the value of the zielwaehrung property.
     * 
     * @return
     *     possible object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STWaehrungsschluessel getZielwaehrung() {
        return zielwaehrung;
    }

    /**
     * Sets the value of the zielwaehrung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWaehrungsschluessel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZielwaehrung(STWaehrungsschluessel value) {
        this.zielwaehrung = value;
    }

    /**
     * Gets the value of the kurs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getKurs() {
        return kurs;
    }

    /**
     * Sets the value of the kurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKurs(BigDecimal value) {
        this.kurs = value;
    }

    /**
     * Gets the value of the zeitpunkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getZeitpunkt() {
        return zeitpunkt;
    }

    /**
     * Sets the value of the zeitpunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZeitpunkt(String value) {
        this.zeitpunkt = value;
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
        final CTDevisenkurs that = ((CTDevisenkurs) object);
        {
            STWaehrungsschluessel lhsAusgangswaehrung;
            lhsAusgangswaehrung = this.getAusgangswaehrung();
            STWaehrungsschluessel rhsAusgangswaehrung;
            rhsAusgangswaehrung = that.getAusgangswaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ausgangswaehrung", lhsAusgangswaehrung), LocatorUtils.property(thatLocator, "ausgangswaehrung", rhsAusgangswaehrung), lhsAusgangswaehrung, rhsAusgangswaehrung, (this.ausgangswaehrung!= null), (that.ausgangswaehrung!= null))) {
                return false;
            }
        }
        {
            STWaehrungsschluessel lhsZielwaehrung;
            lhsZielwaehrung = this.getZielwaehrung();
            STWaehrungsschluessel rhsZielwaehrung;
            rhsZielwaehrung = that.getZielwaehrung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zielwaehrung", lhsZielwaehrung), LocatorUtils.property(thatLocator, "zielwaehrung", rhsZielwaehrung), lhsZielwaehrung, rhsZielwaehrung, (this.zielwaehrung!= null), (that.zielwaehrung!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsKurs;
            lhsKurs = this.getKurs();
            BigDecimal rhsKurs;
            rhsKurs = that.getKurs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kurs", lhsKurs), LocatorUtils.property(thatLocator, "kurs", rhsKurs), lhsKurs, rhsKurs, (this.kurs!= null), (that.kurs!= null))) {
                return false;
            }
        }
        {
            String lhsZeitpunkt;
            lhsZeitpunkt = this.getZeitpunkt();
            String rhsZeitpunkt;
            rhsZeitpunkt = that.getZeitpunkt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeitpunkt", lhsZeitpunkt), LocatorUtils.property(thatLocator, "zeitpunkt", rhsZeitpunkt), lhsZeitpunkt, rhsZeitpunkt, (this.zeitpunkt!= null), (that.zeitpunkt!= null))) {
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
            STWaehrungsschluessel theAusgangswaehrung;
            theAusgangswaehrung = this.getAusgangswaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ausgangswaehrung", theAusgangswaehrung), currentHashCode, theAusgangswaehrung, (this.ausgangswaehrung!= null));
        }
        {
            STWaehrungsschluessel theZielwaehrung;
            theZielwaehrung = this.getZielwaehrung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zielwaehrung", theZielwaehrung), currentHashCode, theZielwaehrung, (this.zielwaehrung!= null));
        }
        {
            BigDecimal theKurs;
            theKurs = this.getKurs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kurs", theKurs), currentHashCode, theKurs, (this.kurs!= null));
        }
        {
            String theZeitpunkt;
            theZeitpunkt = this.getZeitpunkt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitpunkt", theZeitpunkt), currentHashCode, theZeitpunkt, (this.zeitpunkt!= null));
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
        if (draftCopy instanceof CTDevisenkurs) {
            final CTDevisenkurs copy = ((CTDevisenkurs) draftCopy);
            {
                Boolean ausgangswaehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ausgangswaehrung!= null));
                if (ausgangswaehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWaehrungsschluessel sourceAusgangswaehrung;
                    sourceAusgangswaehrung = this.getAusgangswaehrung();
                    STWaehrungsschluessel copyAusgangswaehrung = ((STWaehrungsschluessel) strategy.copy(LocatorUtils.property(locator, "ausgangswaehrung", sourceAusgangswaehrung), sourceAusgangswaehrung, (this.ausgangswaehrung!= null)));
                    copy.setAusgangswaehrung(copyAusgangswaehrung);
                } else {
                    if (ausgangswaehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ausgangswaehrung = null;
                    }
                }
            }
            {
                Boolean zielwaehrungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zielwaehrung!= null));
                if (zielwaehrungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWaehrungsschluessel sourceZielwaehrung;
                    sourceZielwaehrung = this.getZielwaehrung();
                    STWaehrungsschluessel copyZielwaehrung = ((STWaehrungsschluessel) strategy.copy(LocatorUtils.property(locator, "zielwaehrung", sourceZielwaehrung), sourceZielwaehrung, (this.zielwaehrung!= null)));
                    copy.setZielwaehrung(copyZielwaehrung);
                } else {
                    if (zielwaehrungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zielwaehrung = null;
                    }
                }
            }
            {
                Boolean kursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kurs!= null));
                if (kursShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceKurs;
                    sourceKurs = this.getKurs();
                    BigDecimal copyKurs = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "kurs", sourceKurs), sourceKurs, (this.kurs!= null)));
                    copy.setKurs(copyKurs);
                } else {
                    if (kursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kurs = null;
                    }
                }
            }
            {
                Boolean zeitpunktShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeitpunkt!= null));
                if (zeitpunktShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZeitpunkt;
                    sourceZeitpunkt = this.getZeitpunkt();
                    String copyZeitpunkt = ((String) strategy.copy(LocatorUtils.property(locator, "zeitpunkt", sourceZeitpunkt), sourceZeitpunkt, (this.zeitpunkt!= null)));
                    copy.setZeitpunkt(copyZeitpunkt);
                } else {
                    if (zeitpunktShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeitpunkt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDevisenkurs();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDevisenkurs withAusgangswaehrung(STWaehrungsschluessel value) {
        setAusgangswaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDevisenkurs withZielwaehrung(STWaehrungsschluessel value) {
        setZielwaehrung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDevisenkurs withKurs(BigDecimal value) {
        setKurs(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDevisenkurs withZeitpunkt(String value) {
        setZeitpunkt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDevisenkurs withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDevisenkurs withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
