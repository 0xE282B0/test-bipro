
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEHaushaltsart;
import net.bipro.namespace.datentypen.STEKinderImHaushalt;
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
 * Angaben zu weiteren im Haushalt lebenden Personen (insb. Kinder).
 * 
 * Das Attribut KinderImHaushalt (ST_KinderImHaushalt) fehlt, da der entsprechende einfache Datentyp nicht definiert ist.
 * 
 * <p>Java class for CT_Haushalt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Haushalt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Haushaltsgroesse" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlKinder" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="GeburtsdatumJuengstesKind" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="GeburtsdatumAeltestesKind" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="KinderImHaushalt" type="{http://www.bipro.net/namespace/datentypen}STE_KinderImHaushalt" minOccurs="0"/&gt;
 *         &lt;element name="Haushaltsart" type="{http://www.bipro.net/namespace/datentypen}STE_Haushaltsart" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Haushalt", propOrder = {
    "haushaltsgroesse",
    "anzahlKinder",
    "geburtsdatumJuengstesKind",
    "geburtsdatumAeltestesKind",
    "kinderImHaushalt",
    "haushaltsart"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTHaushalt
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Haushaltsgroesse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer haushaltsgroesse;
    @XmlElement(name = "AnzahlKinder")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlKinder;
    @XmlElement(name = "GeburtsdatumJuengstesKind")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String geburtsdatumJuengstesKind;
    @XmlElement(name = "GeburtsdatumAeltestesKind")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String geburtsdatumAeltestesKind;
    @XmlElement(name = "KinderImHaushalt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEKinderImHaushalt kinderImHaushalt;
    @XmlElement(name = "Haushaltsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STEHaushaltsart haushaltsart;

    /**
     * Gets the value of the haushaltsgroesse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getHaushaltsgroesse() {
        return haushaltsgroesse;
    }

    /**
     * Sets the value of the haushaltsgroesse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHaushaltsgroesse(Integer value) {
        this.haushaltsgroesse = value;
    }

    /**
     * Gets the value of the anzahlKinder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlKinder() {
        return anzahlKinder;
    }

    /**
     * Sets the value of the anzahlKinder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlKinder(Integer value) {
        this.anzahlKinder = value;
    }

    /**
     * Gets the value of the geburtsdatumJuengstesKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getGeburtsdatumJuengstesKind() {
        return geburtsdatumJuengstesKind;
    }

    /**
     * Sets the value of the geburtsdatumJuengstesKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGeburtsdatumJuengstesKind(String value) {
        this.geburtsdatumJuengstesKind = value;
    }

    /**
     * Gets the value of the geburtsdatumAeltestesKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getGeburtsdatumAeltestesKind() {
        return geburtsdatumAeltestesKind;
    }

    /**
     * Sets the value of the geburtsdatumAeltestesKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGeburtsdatumAeltestesKind(String value) {
        this.geburtsdatumAeltestesKind = value;
    }

    /**
     * Gets the value of the kinderImHaushalt property.
     * 
     * @return
     *     possible object is
     *     {@link STEKinderImHaushalt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEKinderImHaushalt getKinderImHaushalt() {
        return kinderImHaushalt;
    }

    /**
     * Sets the value of the kinderImHaushalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEKinderImHaushalt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKinderImHaushalt(STEKinderImHaushalt value) {
        this.kinderImHaushalt = value;
    }

    /**
     * Gets the value of the haushaltsart property.
     * 
     * @return
     *     possible object is
     *     {@link STEHaushaltsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STEHaushaltsart getHaushaltsart() {
        return haushaltsart;
    }

    /**
     * Sets the value of the haushaltsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEHaushaltsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setHaushaltsart(STEHaushaltsart value) {
        this.haushaltsart = value;
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
        final CTHaushalt that = ((CTHaushalt) object);
        {
            Integer lhsHaushaltsgroesse;
            lhsHaushaltsgroesse = this.getHaushaltsgroesse();
            Integer rhsHaushaltsgroesse;
            rhsHaushaltsgroesse = that.getHaushaltsgroesse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haushaltsgroesse", lhsHaushaltsgroesse), LocatorUtils.property(thatLocator, "haushaltsgroesse", rhsHaushaltsgroesse), lhsHaushaltsgroesse, rhsHaushaltsgroesse, (this.haushaltsgroesse!= null), (that.haushaltsgroesse!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlKinder;
            lhsAnzahlKinder = this.getAnzahlKinder();
            Integer rhsAnzahlKinder;
            rhsAnzahlKinder = that.getAnzahlKinder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlKinder", lhsAnzahlKinder), LocatorUtils.property(thatLocator, "anzahlKinder", rhsAnzahlKinder), lhsAnzahlKinder, rhsAnzahlKinder, (this.anzahlKinder!= null), (that.anzahlKinder!= null))) {
                return false;
            }
        }
        {
            String lhsGeburtsdatumJuengstesKind;
            lhsGeburtsdatumJuengstesKind = this.getGeburtsdatumJuengstesKind();
            String rhsGeburtsdatumJuengstesKind;
            rhsGeburtsdatumJuengstesKind = that.getGeburtsdatumJuengstesKind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geburtsdatumJuengstesKind", lhsGeburtsdatumJuengstesKind), LocatorUtils.property(thatLocator, "geburtsdatumJuengstesKind", rhsGeburtsdatumJuengstesKind), lhsGeburtsdatumJuengstesKind, rhsGeburtsdatumJuengstesKind, (this.geburtsdatumJuengstesKind!= null), (that.geburtsdatumJuengstesKind!= null))) {
                return false;
            }
        }
        {
            String lhsGeburtsdatumAeltestesKind;
            lhsGeburtsdatumAeltestesKind = this.getGeburtsdatumAeltestesKind();
            String rhsGeburtsdatumAeltestesKind;
            rhsGeburtsdatumAeltestesKind = that.getGeburtsdatumAeltestesKind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geburtsdatumAeltestesKind", lhsGeburtsdatumAeltestesKind), LocatorUtils.property(thatLocator, "geburtsdatumAeltestesKind", rhsGeburtsdatumAeltestesKind), lhsGeburtsdatumAeltestesKind, rhsGeburtsdatumAeltestesKind, (this.geburtsdatumAeltestesKind!= null), (that.geburtsdatumAeltestesKind!= null))) {
                return false;
            }
        }
        {
            STEKinderImHaushalt lhsKinderImHaushalt;
            lhsKinderImHaushalt = this.getKinderImHaushalt();
            STEKinderImHaushalt rhsKinderImHaushalt;
            rhsKinderImHaushalt = that.getKinderImHaushalt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kinderImHaushalt", lhsKinderImHaushalt), LocatorUtils.property(thatLocator, "kinderImHaushalt", rhsKinderImHaushalt), lhsKinderImHaushalt, rhsKinderImHaushalt, (this.kinderImHaushalt!= null), (that.kinderImHaushalt!= null))) {
                return false;
            }
        }
        {
            STEHaushaltsart lhsHaushaltsart;
            lhsHaushaltsart = this.getHaushaltsart();
            STEHaushaltsart rhsHaushaltsart;
            rhsHaushaltsart = that.getHaushaltsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haushaltsart", lhsHaushaltsart), LocatorUtils.property(thatLocator, "haushaltsart", rhsHaushaltsart), lhsHaushaltsart, rhsHaushaltsart, (this.haushaltsart!= null), (that.haushaltsart!= null))) {
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
            Integer theHaushaltsgroesse;
            theHaushaltsgroesse = this.getHaushaltsgroesse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haushaltsgroesse", theHaushaltsgroesse), currentHashCode, theHaushaltsgroesse, (this.haushaltsgroesse!= null));
        }
        {
            Integer theAnzahlKinder;
            theAnzahlKinder = this.getAnzahlKinder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlKinder", theAnzahlKinder), currentHashCode, theAnzahlKinder, (this.anzahlKinder!= null));
        }
        {
            String theGeburtsdatumJuengstesKind;
            theGeburtsdatumJuengstesKind = this.getGeburtsdatumJuengstesKind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geburtsdatumJuengstesKind", theGeburtsdatumJuengstesKind), currentHashCode, theGeburtsdatumJuengstesKind, (this.geburtsdatumJuengstesKind!= null));
        }
        {
            String theGeburtsdatumAeltestesKind;
            theGeburtsdatumAeltestesKind = this.getGeburtsdatumAeltestesKind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geburtsdatumAeltestesKind", theGeburtsdatumAeltestesKind), currentHashCode, theGeburtsdatumAeltestesKind, (this.geburtsdatumAeltestesKind!= null));
        }
        {
            STEKinderImHaushalt theKinderImHaushalt;
            theKinderImHaushalt = this.getKinderImHaushalt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kinderImHaushalt", theKinderImHaushalt), currentHashCode, theKinderImHaushalt, (this.kinderImHaushalt!= null));
        }
        {
            STEHaushaltsart theHaushaltsart;
            theHaushaltsart = this.getHaushaltsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haushaltsart", theHaushaltsart), currentHashCode, theHaushaltsart, (this.haushaltsart!= null));
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
        if (draftCopy instanceof CTHaushalt) {
            final CTHaushalt copy = ((CTHaushalt) draftCopy);
            {
                Boolean haushaltsgroesseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haushaltsgroesse!= null));
                if (haushaltsgroesseShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceHaushaltsgroesse;
                    sourceHaushaltsgroesse = this.getHaushaltsgroesse();
                    Integer copyHaushaltsgroesse = ((Integer) strategy.copy(LocatorUtils.property(locator, "haushaltsgroesse", sourceHaushaltsgroesse), sourceHaushaltsgroesse, (this.haushaltsgroesse!= null)));
                    copy.setHaushaltsgroesse(copyHaushaltsgroesse);
                } else {
                    if (haushaltsgroesseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haushaltsgroesse = null;
                    }
                }
            }
            {
                Boolean anzahlKinderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlKinder!= null));
                if (anzahlKinderShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlKinder;
                    sourceAnzahlKinder = this.getAnzahlKinder();
                    Integer copyAnzahlKinder = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlKinder", sourceAnzahlKinder), sourceAnzahlKinder, (this.anzahlKinder!= null)));
                    copy.setAnzahlKinder(copyAnzahlKinder);
                } else {
                    if (anzahlKinderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlKinder = null;
                    }
                }
            }
            {
                Boolean geburtsdatumJuengstesKindShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geburtsdatumJuengstesKind!= null));
                if (geburtsdatumJuengstesKindShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeburtsdatumJuengstesKind;
                    sourceGeburtsdatumJuengstesKind = this.getGeburtsdatumJuengstesKind();
                    String copyGeburtsdatumJuengstesKind = ((String) strategy.copy(LocatorUtils.property(locator, "geburtsdatumJuengstesKind", sourceGeburtsdatumJuengstesKind), sourceGeburtsdatumJuengstesKind, (this.geburtsdatumJuengstesKind!= null)));
                    copy.setGeburtsdatumJuengstesKind(copyGeburtsdatumJuengstesKind);
                } else {
                    if (geburtsdatumJuengstesKindShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geburtsdatumJuengstesKind = null;
                    }
                }
            }
            {
                Boolean geburtsdatumAeltestesKindShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geburtsdatumAeltestesKind!= null));
                if (geburtsdatumAeltestesKindShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGeburtsdatumAeltestesKind;
                    sourceGeburtsdatumAeltestesKind = this.getGeburtsdatumAeltestesKind();
                    String copyGeburtsdatumAeltestesKind = ((String) strategy.copy(LocatorUtils.property(locator, "geburtsdatumAeltestesKind", sourceGeburtsdatumAeltestesKind), sourceGeburtsdatumAeltestesKind, (this.geburtsdatumAeltestesKind!= null)));
                    copy.setGeburtsdatumAeltestesKind(copyGeburtsdatumAeltestesKind);
                } else {
                    if (geburtsdatumAeltestesKindShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geburtsdatumAeltestesKind = null;
                    }
                }
            }
            {
                Boolean kinderImHaushaltShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kinderImHaushalt!= null));
                if (kinderImHaushaltShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEKinderImHaushalt sourceKinderImHaushalt;
                    sourceKinderImHaushalt = this.getKinderImHaushalt();
                    STEKinderImHaushalt copyKinderImHaushalt = ((STEKinderImHaushalt) strategy.copy(LocatorUtils.property(locator, "kinderImHaushalt", sourceKinderImHaushalt), sourceKinderImHaushalt, (this.kinderImHaushalt!= null)));
                    copy.setKinderImHaushalt(copyKinderImHaushalt);
                } else {
                    if (kinderImHaushaltShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kinderImHaushalt = null;
                    }
                }
            }
            {
                Boolean haushaltsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.haushaltsart!= null));
                if (haushaltsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEHaushaltsart sourceHaushaltsart;
                    sourceHaushaltsart = this.getHaushaltsart();
                    STEHaushaltsart copyHaushaltsart = ((STEHaushaltsart) strategy.copy(LocatorUtils.property(locator, "haushaltsart", sourceHaushaltsart), sourceHaushaltsart, (this.haushaltsart!= null)));
                    copy.setHaushaltsart(copyHaushaltsart);
                } else {
                    if (haushaltsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.haushaltsart = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTHaushalt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withHaushaltsgroesse(Integer value) {
        setHaushaltsgroesse(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withAnzahlKinder(Integer value) {
        setAnzahlKinder(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withGeburtsdatumJuengstesKind(String value) {
        setGeburtsdatumJuengstesKind(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withGeburtsdatumAeltestesKind(String value) {
        setGeburtsdatumAeltestesKind(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withKinderImHaushalt(STEKinderImHaushalt value) {
        setKinderImHaushalt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withHaushaltsart(STEHaushaltsart value) {
        setHaushaltsart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTHaushalt withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
