
package net.bipro.namespace.partner;

import java.math.BigDecimal;
import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTUnternehmen;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
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
 * Daten zum Versicherungsstatus einer natuerlichen Person in der gesetzlichen Krankenversicherung.
 * 
 * Das Attribut Krankenkasse fehlt, da der entsprechende einfache Datentyp (ST_Krankenkasse) nicht definiert ist.
 * 
 * <p>Java class for CT_GesetzlicheKrankenversicherung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_GesetzlicheKrankenversicherung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GesetzlichVersichert" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein"/&gt;
 *         &lt;element name="Pflichtig" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Beitragssatz" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Land" type="{http://www.bipro.net/namespace/datentypen}ST_Laenderkennzeichen" minOccurs="0"/&gt;
 *         &lt;element name="BestehtBei" type="{http://www.bipro.net/namespace/allgemein}CT_Unternehmen" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_GesetzlicheKrankenversicherung", propOrder = {
    "gesetzlichVersichert",
    "pflichtig",
    "beitragssatz",
    "land",
    "bestehtBei"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGesetzlicheKrankenversicherung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "GesetzlichVersichert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected boolean gesetzlichVersichert;
    @XmlElement(name = "Pflichtig")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean pflichtig;
    @XmlElement(name = "Beitragssatz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal beitragssatz;
    @XmlElement(name = "Land")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STLaenderkennzeichen land;
    @XmlElement(name = "BestehtBei")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTUnternehmen bestehtBei;

    /**
     * Gets the value of the gesetzlichVersichert property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public boolean isGesetzlichVersichert() {
        return gesetzlichVersichert;
    }

    /**
     * Sets the value of the gesetzlichVersichert property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGesetzlichVersichert(boolean value) {
        this.gesetzlichVersichert = value;
    }

    /**
     * Gets the value of the pflichtig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isPflichtig() {
        return pflichtig;
    }

    /**
     * Sets the value of the pflichtig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPflichtig(Boolean value) {
        this.pflichtig = value;
    }

    /**
     * Gets the value of the beitragssatz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBeitragssatz() {
        return beitragssatz;
    }

    /**
     * Sets the value of the beitragssatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBeitragssatz(BigDecimal value) {
        this.beitragssatz = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STLaenderkennzeichen getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLaenderkennzeichen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLand(STLaenderkennzeichen value) {
        this.land = value;
    }

    /**
     * Gets the value of the bestehtBei property.
     * 
     * @return
     *     possible object is
     *     {@link CTUnternehmen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTUnternehmen getBestehtBei() {
        return bestehtBei;
    }

    /**
     * Sets the value of the bestehtBei property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTUnternehmen }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBestehtBei(CTUnternehmen value) {
        this.bestehtBei = value;
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
        final CTGesetzlicheKrankenversicherung that = ((CTGesetzlicheKrankenversicherung) object);
        {
            boolean lhsGesetzlichVersichert;
            lhsGesetzlichVersichert = this.isGesetzlichVersichert();
            boolean rhsGesetzlichVersichert;
            rhsGesetzlichVersichert = that.isGesetzlichVersichert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gesetzlichVersichert", lhsGesetzlichVersichert), LocatorUtils.property(thatLocator, "gesetzlichVersichert", rhsGesetzlichVersichert), lhsGesetzlichVersichert, rhsGesetzlichVersichert, true, true)) {
                return false;
            }
        }
        {
            Boolean lhsPflichtig;
            lhsPflichtig = this.isPflichtig();
            Boolean rhsPflichtig;
            rhsPflichtig = that.isPflichtig();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pflichtig", lhsPflichtig), LocatorUtils.property(thatLocator, "pflichtig", rhsPflichtig), lhsPflichtig, rhsPflichtig, (this.pflichtig!= null), (that.pflichtig!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBeitragssatz;
            lhsBeitragssatz = this.getBeitragssatz();
            BigDecimal rhsBeitragssatz;
            rhsBeitragssatz = that.getBeitragssatz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragssatz", lhsBeitragssatz), LocatorUtils.property(thatLocator, "beitragssatz", rhsBeitragssatz), lhsBeitragssatz, rhsBeitragssatz, (this.beitragssatz!= null), (that.beitragssatz!= null))) {
                return false;
            }
        }
        {
            STLaenderkennzeichen lhsLand;
            lhsLand = this.getLand();
            STLaenderkennzeichen rhsLand;
            rhsLand = that.getLand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "land", lhsLand), LocatorUtils.property(thatLocator, "land", rhsLand), lhsLand, rhsLand, (this.land!= null), (that.land!= null))) {
                return false;
            }
        }
        {
            CTUnternehmen lhsBestehtBei;
            lhsBestehtBei = this.getBestehtBei();
            CTUnternehmen rhsBestehtBei;
            rhsBestehtBei = that.getBestehtBei();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestehtBei", lhsBestehtBei), LocatorUtils.property(thatLocator, "bestehtBei", rhsBestehtBei), lhsBestehtBei, rhsBestehtBei, (this.bestehtBei!= null), (that.bestehtBei!= null))) {
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
            boolean theGesetzlichVersichert;
            theGesetzlichVersichert = this.isGesetzlichVersichert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gesetzlichVersichert", theGesetzlichVersichert), currentHashCode, theGesetzlichVersichert, true);
        }
        {
            Boolean thePflichtig;
            thePflichtig = this.isPflichtig();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pflichtig", thePflichtig), currentHashCode, thePflichtig, (this.pflichtig!= null));
        }
        {
            BigDecimal theBeitragssatz;
            theBeitragssatz = this.getBeitragssatz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragssatz", theBeitragssatz), currentHashCode, theBeitragssatz, (this.beitragssatz!= null));
        }
        {
            STLaenderkennzeichen theLand;
            theLand = this.getLand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "land", theLand), currentHashCode, theLand, (this.land!= null));
        }
        {
            CTUnternehmen theBestehtBei;
            theBestehtBei = this.getBestehtBei();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestehtBei", theBestehtBei), currentHashCode, theBestehtBei, (this.bestehtBei!= null));
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
        if (draftCopy instanceof CTGesetzlicheKrankenversicherung) {
            final CTGesetzlicheKrankenversicherung copy = ((CTGesetzlicheKrankenversicherung) draftCopy);
            {
                Boolean gesetzlichVersichertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (gesetzlichVersichertShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceGesetzlichVersichert;
                    sourceGesetzlichVersichert = this.isGesetzlichVersichert();
                    boolean copyGesetzlichVersichert = strategy.copy(LocatorUtils.property(locator, "gesetzlichVersichert", sourceGesetzlichVersichert), sourceGesetzlichVersichert, true);
                    copy.setGesetzlichVersichert(copyGesetzlichVersichert);
                } else {
                    if (gesetzlichVersichertShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean pflichtigShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pflichtig!= null));
                if (pflichtigShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePflichtig;
                    sourcePflichtig = this.isPflichtig();
                    Boolean copyPflichtig = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pflichtig", sourcePflichtig), sourcePflichtig, (this.pflichtig!= null)));
                    copy.setPflichtig(copyPflichtig);
                } else {
                    if (pflichtigShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pflichtig = null;
                    }
                }
            }
            {
                Boolean beitragssatzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragssatz!= null));
                if (beitragssatzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBeitragssatz;
                    sourceBeitragssatz = this.getBeitragssatz();
                    BigDecimal copyBeitragssatz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "beitragssatz", sourceBeitragssatz), sourceBeitragssatz, (this.beitragssatz!= null)));
                    copy.setBeitragssatz(copyBeitragssatz);
                } else {
                    if (beitragssatzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragssatz = null;
                    }
                }
            }
            {
                Boolean landShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.land!= null));
                if (landShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLaenderkennzeichen sourceLand;
                    sourceLand = this.getLand();
                    STLaenderkennzeichen copyLand = ((STLaenderkennzeichen) strategy.copy(LocatorUtils.property(locator, "land", sourceLand), sourceLand, (this.land!= null)));
                    copy.setLand(copyLand);
                } else {
                    if (landShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.land = null;
                    }
                }
            }
            {
                Boolean bestehtBeiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestehtBei!= null));
                if (bestehtBeiShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTUnternehmen sourceBestehtBei;
                    sourceBestehtBei = this.getBestehtBei();
                    CTUnternehmen copyBestehtBei = ((CTUnternehmen) strategy.copy(LocatorUtils.property(locator, "bestehtBei", sourceBestehtBei), sourceBestehtBei, (this.bestehtBei!= null)));
                    copy.setBestehtBei(copyBestehtBei);
                } else {
                    if (bestehtBeiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestehtBei = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGesetzlicheKrankenversicherung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung withGesetzlichVersichert(boolean value) {
        setGesetzlichVersichert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung withPflichtig(Boolean value) {
        setPflichtig(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung withBeitragssatz(BigDecimal value) {
        setBeitragssatz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung withLand(STLaenderkennzeichen value) {
        setLand(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung withBestehtBei(CTUnternehmen value) {
        setBestehtBei(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGesetzlicheKrankenversicherung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
