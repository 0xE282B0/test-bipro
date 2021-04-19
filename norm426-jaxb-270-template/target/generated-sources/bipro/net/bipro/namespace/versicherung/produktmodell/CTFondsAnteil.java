
package net.bipro.namespace.versicherung.produktmodell;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTDevisenkurs;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STWaehrungsschluessel;
import net.bipro.namespace.kapitalanlage.basis.CTBestand;
import net.bipro.namespace.kapitalanlage.basis.CTInvestment;
import net.bipro.namespace.kapitalanlage.basis.CTInvestmentkurs;
import net.bipro.namespace.kapitalanlage.basis.CTZusaetzlicheInvestmentDaten;
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
 * Informationen zu den einzelnen Fonds des Portfolios
 * 
 * <p>Java class for CT_FondsAnteil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_FondsAnteil"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/kapitalanlage/basis}CT_Investment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Garantiefonds" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Prozentsatz" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_FondsAnteil", propOrder = {
    "garantiefonds",
    "prozentsatz"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTFondsAnteil
    extends CTInvestment
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Garantiefonds")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean garantiefonds;
    @XmlElement(name = "Prozentsatz", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal prozentsatz;

    /**
     * Gets the value of the garantiefonds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isGarantiefonds() {
        return garantiefonds;
    }

    /**
     * Sets the value of the garantiefonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGarantiefonds(Boolean value) {
        this.garantiefonds = value;
    }

    /**
     * Gets the value of the prozentsatz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getProzentsatz() {
        return prozentsatz;
    }

    /**
     * Sets the value of the prozentsatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setProzentsatz(BigDecimal value) {
        this.prozentsatz = value;
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
        final CTFondsAnteil that = ((CTFondsAnteil) object);
        {
            Boolean lhsGarantiefonds;
            lhsGarantiefonds = this.isGarantiefonds();
            Boolean rhsGarantiefonds;
            rhsGarantiefonds = that.isGarantiefonds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garantiefonds", lhsGarantiefonds), LocatorUtils.property(thatLocator, "garantiefonds", rhsGarantiefonds), lhsGarantiefonds, rhsGarantiefonds, (this.garantiefonds!= null), (that.garantiefonds!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsProzentsatz;
            lhsProzentsatz = this.getProzentsatz();
            BigDecimal rhsProzentsatz;
            rhsProzentsatz = that.getProzentsatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prozentsatz", lhsProzentsatz), LocatorUtils.property(thatLocator, "prozentsatz", rhsProzentsatz), lhsProzentsatz, rhsProzentsatz, (this.prozentsatz!= null), (that.prozentsatz!= null))) {
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
            Boolean theGarantiefonds;
            theGarantiefonds = this.isGarantiefonds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "garantiefonds", theGarantiefonds), currentHashCode, theGarantiefonds, (this.garantiefonds!= null));
        }
        {
            BigDecimal theProzentsatz;
            theProzentsatz = this.getProzentsatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prozentsatz", theProzentsatz), currentHashCode, theProzentsatz, (this.prozentsatz!= null));
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
        if (draftCopy instanceof CTFondsAnteil) {
            final CTFondsAnteil copy = ((CTFondsAnteil) draftCopy);
            {
                Boolean garantiefondsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garantiefonds!= null));
                if (garantiefondsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGarantiefonds;
                    sourceGarantiefonds = this.isGarantiefonds();
                    Boolean copyGarantiefonds = ((Boolean) strategy.copy(LocatorUtils.property(locator, "garantiefonds", sourceGarantiefonds), sourceGarantiefonds, (this.garantiefonds!= null)));
                    copy.setGarantiefonds(copyGarantiefonds);
                } else {
                    if (garantiefondsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garantiefonds = null;
                    }
                }
            }
            {
                Boolean prozentsatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.prozentsatz!= null));
                if (prozentsatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceProzentsatz;
                    sourceProzentsatz = this.getProzentsatz();
                    BigDecimal copyProzentsatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "prozentsatz", sourceProzentsatz), sourceProzentsatz, (this.prozentsatz!= null)));
                    copy.setProzentsatz(copyProzentsatz);
                } else {
                    if (prozentsatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.prozentsatz = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFondsAnteil();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withGarantiefonds(Boolean value) {
        setGarantiefonds(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withProzentsatz(BigDecimal value) {
        setProzentsatz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withISIN(String value) {
        setISIN(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withWertpapierkennnummer(String value) {
        setWertpapierkennnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withWertpapierklassifikation(String value) {
        setWertpapierklassifikation(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withAnteile(BigDecimal value) {
        setAnteile(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withWaehrung(STWaehrungsschluessel value) {
        setWaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withZusaetzlicheInvestmentDaten(CTZusaetzlicheInvestmentDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheInvestmentDaten value: values) {
                getZusaetzlicheInvestmentDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withZusaetzlicheInvestmentDaten(Collection<CTZusaetzlicheInvestmentDaten> values) {
        if (values!= null) {
            getZusaetzlicheInvestmentDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withDevisenkurs(CTDevisenkurs value) {
        setDevisenkurs(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withInvestmentkurs(CTInvestmentkurs value) {
        setInvestmentkurs(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withBestandInInvestmentwaehrung(CTBestand value) {
        setBestandInInvestmentwaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withBestandInDepotwaehrung(CTBestand value) {
        setBestandInDepotwaehrung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFondsAnteil withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
