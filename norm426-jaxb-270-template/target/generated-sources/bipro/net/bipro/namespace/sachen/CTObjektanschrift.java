
package net.bipro.namespace.sachen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTAdresse;
import net.bipro.namespace.allgemein.CTGeoposition;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STLaenderkennzeichen;
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
 * <p>Java class for CT_Objektanschrift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Objektanschrift"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Adresse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Flurstueck" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Parzelle" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Objektanschrift", propOrder = {
    "flurstueck",
    "parzelle"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTObjektanschrift
    extends CTAdresse
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Flurstueck")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String flurstueck;
    @XmlElement(name = "Parzelle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String parzelle;

    /**
     * Gets the value of the flurstueck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getFlurstueck() {
        return flurstueck;
    }

    /**
     * Sets the value of the flurstueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setFlurstueck(String value) {
        this.flurstueck = value;
    }

    /**
     * Gets the value of the parzelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getParzelle() {
        return parzelle;
    }

    /**
     * Sets the value of the parzelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setParzelle(String value) {
        this.parzelle = value;
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
        final CTObjektanschrift that = ((CTObjektanschrift) object);
        {
            String lhsFlurstueck;
            lhsFlurstueck = this.getFlurstueck();
            String rhsFlurstueck;
            rhsFlurstueck = that.getFlurstueck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flurstueck", lhsFlurstueck), LocatorUtils.property(thatLocator, "flurstueck", rhsFlurstueck), lhsFlurstueck, rhsFlurstueck, (this.flurstueck!= null), (that.flurstueck!= null))) {
                return false;
            }
        }
        {
            String lhsParzelle;
            lhsParzelle = this.getParzelle();
            String rhsParzelle;
            rhsParzelle = that.getParzelle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parzelle", lhsParzelle), LocatorUtils.property(thatLocator, "parzelle", rhsParzelle), lhsParzelle, rhsParzelle, (this.parzelle!= null), (that.parzelle!= null))) {
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
            String theFlurstueck;
            theFlurstueck = this.getFlurstueck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flurstueck", theFlurstueck), currentHashCode, theFlurstueck, (this.flurstueck!= null));
        }
        {
            String theParzelle;
            theParzelle = this.getParzelle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parzelle", theParzelle), currentHashCode, theParzelle, (this.parzelle!= null));
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
        if (draftCopy instanceof CTObjektanschrift) {
            final CTObjektanschrift copy = ((CTObjektanschrift) draftCopy);
            {
                Boolean flurstueckShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.flurstueck!= null));
                if (flurstueckShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFlurstueck;
                    sourceFlurstueck = this.getFlurstueck();
                    String copyFlurstueck = ((String) strategy.copy(LocatorUtils.property(locator, "flurstueck", sourceFlurstueck), sourceFlurstueck, (this.flurstueck!= null)));
                    copy.setFlurstueck(copyFlurstueck);
                } else {
                    if (flurstueckShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.flurstueck = null;
                    }
                }
            }
            {
                Boolean parzelleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parzelle!= null));
                if (parzelleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceParzelle;
                    sourceParzelle = this.getParzelle();
                    String copyParzelle = ((String) strategy.copy(LocatorUtils.property(locator, "parzelle", sourceParzelle), sourceParzelle, (this.parzelle!= null)));
                    copy.setParzelle(copyParzelle);
                } else {
                    if (parzelleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parzelle = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTObjektanschrift();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withFlurstueck(String value) {
        setFlurstueck(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withParzelle(String value) {
        setParzelle(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withStrasse(String value) {
        setStrasse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withHausnummer(String value) {
        setHausnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withPostleitzahl(String value) {
        setPostleitzahl(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withOrt(String value) {
        setOrt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withLand(STLaenderkennzeichen value) {
        setLand(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withLandname(String value) {
        setLandname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withOrtsteil(String value) {
        setOrtsteil(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withGeoposition(CTGeoposition value) {
        setGeoposition(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
