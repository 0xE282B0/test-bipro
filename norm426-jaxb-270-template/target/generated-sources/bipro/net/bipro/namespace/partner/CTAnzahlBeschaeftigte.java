
package net.bipro.namespace.partner;

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
import net.bipro.namespace.datentypen.STBeschaeftigtentyp;
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
 * Anzahl der Beschäftigten einer juristischen Person. Dies wird  als Nominell Beschäftigte in MAK (Mitarbeiter-Kapazitäten) und/oder als Effektiv Beschäftigte (alle Mitarbeiter ohne Berücksichtigung des Beschäftigungstyps) angegeben.
 * 
 * Mitarbeitende Familienangehörige sowie der Inhaber/Geschäftsführer sind selbst nicht mitzuzählen, sind aber trotzdem mitversichert.
 * 
 * Bei einem Unternehmen ohne Beschäftigte darf diese Klasse nicht geliefert werden.
 * 
 * Wenn es nur ein Objekt gibt, DARF auf die ArtID verzichtet werden, da von Vollzeitmitarbeitern ausgegangen wird. Werden mehrere Objekte übergeben, MUSS zur Anzahl der nominell Beschäftigten jeweils die ArtID angegeben werden.
 * 
 * <p>Java class for CT_AnzahlBeschaeftigte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_AnzahlBeschaeftigte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Beschaeftigtentyp" minOccurs="0"/&gt;
 *         &lt;element name="Nominell" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="Effektiv" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AnzahlBeschaeftigte", propOrder = {
    "artID",
    "nominell",
    "effektiv"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAnzahlBeschaeftigte
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBeschaeftigtentyp artID;
    @XmlElement(name = "Nominell")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Integer nominell;
    @XmlElement(name = "Effektiv")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal effektiv;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STBeschaeftigtentyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBeschaeftigtentyp getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBeschaeftigtentyp }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STBeschaeftigtentyp value) {
        this.artID = value;
    }

    /**
     * Gets the value of the nominell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Integer getNominell() {
        return nominell;
    }

    /**
     * Sets the value of the nominell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setNominell(Integer value) {
        this.nominell = value;
    }

    /**
     * Gets the value of the effektiv property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getEffektiv() {
        return effektiv;
    }

    /**
     * Sets the value of the effektiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setEffektiv(BigDecimal value) {
        this.effektiv = value;
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
        final CTAnzahlBeschaeftigte that = ((CTAnzahlBeschaeftigte) object);
        {
            STBeschaeftigtentyp lhsArtID;
            lhsArtID = this.getArtID();
            STBeschaeftigtentyp rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            Integer lhsNominell;
            lhsNominell = this.getNominell();
            Integer rhsNominell;
            rhsNominell = that.getNominell();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nominell", lhsNominell), LocatorUtils.property(thatLocator, "nominell", rhsNominell), lhsNominell, rhsNominell, (this.nominell!= null), (that.nominell!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsEffektiv;
            lhsEffektiv = this.getEffektiv();
            BigDecimal rhsEffektiv;
            rhsEffektiv = that.getEffektiv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effektiv", lhsEffektiv), LocatorUtils.property(thatLocator, "effektiv", rhsEffektiv), lhsEffektiv, rhsEffektiv, (this.effektiv!= null), (that.effektiv!= null))) {
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
            STBeschaeftigtentyp theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            Integer theNominell;
            theNominell = this.getNominell();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nominell", theNominell), currentHashCode, theNominell, (this.nominell!= null));
        }
        {
            BigDecimal theEffektiv;
            theEffektiv = this.getEffektiv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effektiv", theEffektiv), currentHashCode, theEffektiv, (this.effektiv!= null));
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
        if (draftCopy instanceof CTAnzahlBeschaeftigte) {
            final CTAnzahlBeschaeftigte copy = ((CTAnzahlBeschaeftigte) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBeschaeftigtentyp sourceArtID;
                    sourceArtID = this.getArtID();
                    STBeschaeftigtentyp copyArtID = ((STBeschaeftigtentyp) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean nominellShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nominell!= null));
                if (nominellShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceNominell;
                    sourceNominell = this.getNominell();
                    Integer copyNominell = ((Integer) strategy.copy(LocatorUtils.property(locator, "nominell", sourceNominell), sourceNominell, (this.nominell!= null)));
                    copy.setNominell(copyNominell);
                } else {
                    if (nominellShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nominell = null;
                    }
                }
            }
            {
                Boolean effektivShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.effektiv!= null));
                if (effektivShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceEffektiv;
                    sourceEffektiv = this.getEffektiv();
                    BigDecimal copyEffektiv = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "effektiv", sourceEffektiv), sourceEffektiv, (this.effektiv!= null)));
                    copy.setEffektiv(copyEffektiv);
                } else {
                    if (effektivShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.effektiv = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAnzahlBeschaeftigte();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnzahlBeschaeftigte withArtID(STBeschaeftigtentyp value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnzahlBeschaeftigte withNominell(Integer value) {
        setNominell(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnzahlBeschaeftigte withEffektiv(BigDecimal value) {
        setEffektiv(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnzahlBeschaeftigte withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAnzahlBeschaeftigte withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
