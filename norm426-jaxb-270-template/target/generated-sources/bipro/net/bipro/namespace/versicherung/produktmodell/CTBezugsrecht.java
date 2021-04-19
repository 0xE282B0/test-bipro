
package net.bipro.namespace.versicherung.produktmodell;

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
import net.bipro.namespace.datentypen.STBezugsrecht;
import net.bipro.namespace.datentypen.STLeistungsfall;
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
 * Angaben zu Bezugsrechten und -berechtigten.
 * 
 * <p>Java class for CT_Bezugsrecht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Bezugsrecht"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Leistungsfall" type="{http://www.bipro.net/namespace/datentypen}ST_Leistungsfall" minOccurs="0"/&gt;
 *         &lt;element name="UnwiderruflichesBezugsrecht" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="IndexBerechtigter" type="{http://www.bipro.net/namespace/datentypen}ST_Bezugsrecht" minOccurs="0"/&gt;
 *         &lt;element name="Individualbezug" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Bezugsrechtsanteil" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="Bezugsberechtigter" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Bezugsberechtigter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Bezugsrecht", propOrder = {
    "leistungsfall",
    "unwiderruflichesBezugsrecht",
    "indexBerechtigter",
    "individualbezug",
    "bezugsrechtsanteil",
    "bezugsberechtigter"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTBezugsrecht
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Leistungsfall")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STLeistungsfall leistungsfall;
    @XmlElement(name = "UnwiderruflichesBezugsrecht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean unwiderruflichesBezugsrecht;
    @XmlElement(name = "IndexBerechtigter")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBezugsrecht indexBerechtigter;
    @XmlElement(name = "Individualbezug")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String individualbezug;
    @XmlElement(name = "Bezugsrechtsanteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal bezugsrechtsanteil;
    @XmlElement(name = "Bezugsberechtigter")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTBezugsberechtigter bezugsberechtigter;

    /**
     * Gets the value of the leistungsfall property.
     * 
     * @return
     *     possible object is
     *     {@link STLeistungsfall }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STLeistungsfall getLeistungsfall() {
        return leistungsfall;
    }

    /**
     * Sets the value of the leistungsfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLeistungsfall }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setLeistungsfall(STLeistungsfall value) {
        this.leistungsfall = value;
    }

    /**
     * Gets the value of the unwiderruflichesBezugsrecht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isUnwiderruflichesBezugsrecht() {
        return unwiderruflichesBezugsrecht;
    }

    /**
     * Sets the value of the unwiderruflichesBezugsrecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setUnwiderruflichesBezugsrecht(Boolean value) {
        this.unwiderruflichesBezugsrecht = value;
    }

    /**
     * Gets the value of the indexBerechtigter property.
     * 
     * @return
     *     possible object is
     *     {@link STBezugsrecht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBezugsrecht getIndexBerechtigter() {
        return indexBerechtigter;
    }

    /**
     * Sets the value of the indexBerechtigter property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBezugsrecht }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setIndexBerechtigter(STBezugsrecht value) {
        this.indexBerechtigter = value;
    }

    /**
     * Gets the value of the individualbezug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getIndividualbezug() {
        return individualbezug;
    }

    /**
     * Sets the value of the individualbezug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setIndividualbezug(String value) {
        this.individualbezug = value;
    }

    /**
     * Gets the value of the bezugsrechtsanteil property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBezugsrechtsanteil() {
        return bezugsrechtsanteil;
    }

    /**
     * Sets the value of the bezugsrechtsanteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBezugsrechtsanteil(BigDecimal value) {
        this.bezugsrechtsanteil = value;
    }

    /**
     * Gets the value of the bezugsberechtigter property.
     * 
     * @return
     *     possible object is
     *     {@link CTBezugsberechtigter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsberechtigter getBezugsberechtigter() {
        return bezugsberechtigter;
    }

    /**
     * Sets the value of the bezugsberechtigter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBezugsberechtigter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBezugsberechtigter(CTBezugsberechtigter value) {
        this.bezugsberechtigter = value;
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
        final CTBezugsrecht that = ((CTBezugsrecht) object);
        {
            STLeistungsfall lhsLeistungsfall;
            lhsLeistungsfall = this.getLeistungsfall();
            STLeistungsfall rhsLeistungsfall;
            rhsLeistungsfall = that.getLeistungsfall();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leistungsfall", lhsLeistungsfall), LocatorUtils.property(thatLocator, "leistungsfall", rhsLeistungsfall), lhsLeistungsfall, rhsLeistungsfall, (this.leistungsfall!= null), (that.leistungsfall!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUnwiderruflichesBezugsrecht;
            lhsUnwiderruflichesBezugsrecht = this.isUnwiderruflichesBezugsrecht();
            Boolean rhsUnwiderruflichesBezugsrecht;
            rhsUnwiderruflichesBezugsrecht = that.isUnwiderruflichesBezugsrecht();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unwiderruflichesBezugsrecht", lhsUnwiderruflichesBezugsrecht), LocatorUtils.property(thatLocator, "unwiderruflichesBezugsrecht", rhsUnwiderruflichesBezugsrecht), lhsUnwiderruflichesBezugsrecht, rhsUnwiderruflichesBezugsrecht, (this.unwiderruflichesBezugsrecht!= null), (that.unwiderruflichesBezugsrecht!= null))) {
                return false;
            }
        }
        {
            STBezugsrecht lhsIndexBerechtigter;
            lhsIndexBerechtigter = this.getIndexBerechtigter();
            STBezugsrecht rhsIndexBerechtigter;
            rhsIndexBerechtigter = that.getIndexBerechtigter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indexBerechtigter", lhsIndexBerechtigter), LocatorUtils.property(thatLocator, "indexBerechtigter", rhsIndexBerechtigter), lhsIndexBerechtigter, rhsIndexBerechtigter, (this.indexBerechtigter!= null), (that.indexBerechtigter!= null))) {
                return false;
            }
        }
        {
            String lhsIndividualbezug;
            lhsIndividualbezug = this.getIndividualbezug();
            String rhsIndividualbezug;
            rhsIndividualbezug = that.getIndividualbezug();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "individualbezug", lhsIndividualbezug), LocatorUtils.property(thatLocator, "individualbezug", rhsIndividualbezug), lhsIndividualbezug, rhsIndividualbezug, (this.individualbezug!= null), (that.individualbezug!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBezugsrechtsanteil;
            lhsBezugsrechtsanteil = this.getBezugsrechtsanteil();
            BigDecimal rhsBezugsrechtsanteil;
            rhsBezugsrechtsanteil = that.getBezugsrechtsanteil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezugsrechtsanteil", lhsBezugsrechtsanteil), LocatorUtils.property(thatLocator, "bezugsrechtsanteil", rhsBezugsrechtsanteil), lhsBezugsrechtsanteil, rhsBezugsrechtsanteil, (this.bezugsrechtsanteil!= null), (that.bezugsrechtsanteil!= null))) {
                return false;
            }
        }
        {
            CTBezugsberechtigter lhsBezugsberechtigter;
            lhsBezugsberechtigter = this.getBezugsberechtigter();
            CTBezugsberechtigter rhsBezugsberechtigter;
            rhsBezugsberechtigter = that.getBezugsberechtigter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezugsberechtigter", lhsBezugsberechtigter), LocatorUtils.property(thatLocator, "bezugsberechtigter", rhsBezugsberechtigter), lhsBezugsberechtigter, rhsBezugsberechtigter, (this.bezugsberechtigter!= null), (that.bezugsberechtigter!= null))) {
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
            STLeistungsfall theLeistungsfall;
            theLeistungsfall = this.getLeistungsfall();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leistungsfall", theLeistungsfall), currentHashCode, theLeistungsfall, (this.leistungsfall!= null));
        }
        {
            Boolean theUnwiderruflichesBezugsrecht;
            theUnwiderruflichesBezugsrecht = this.isUnwiderruflichesBezugsrecht();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unwiderruflichesBezugsrecht", theUnwiderruflichesBezugsrecht), currentHashCode, theUnwiderruflichesBezugsrecht, (this.unwiderruflichesBezugsrecht!= null));
        }
        {
            STBezugsrecht theIndexBerechtigter;
            theIndexBerechtigter = this.getIndexBerechtigter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indexBerechtigter", theIndexBerechtigter), currentHashCode, theIndexBerechtigter, (this.indexBerechtigter!= null));
        }
        {
            String theIndividualbezug;
            theIndividualbezug = this.getIndividualbezug();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "individualbezug", theIndividualbezug), currentHashCode, theIndividualbezug, (this.individualbezug!= null));
        }
        {
            BigDecimal theBezugsrechtsanteil;
            theBezugsrechtsanteil = this.getBezugsrechtsanteil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezugsrechtsanteil", theBezugsrechtsanteil), currentHashCode, theBezugsrechtsanteil, (this.bezugsrechtsanteil!= null));
        }
        {
            CTBezugsberechtigter theBezugsberechtigter;
            theBezugsberechtigter = this.getBezugsberechtigter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezugsberechtigter", theBezugsberechtigter), currentHashCode, theBezugsberechtigter, (this.bezugsberechtigter!= null));
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
        if (draftCopy instanceof CTBezugsrecht) {
            final CTBezugsrecht copy = ((CTBezugsrecht) draftCopy);
            {
                Boolean leistungsfallShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leistungsfall!= null));
                if (leistungsfallShouldBeCopiedAndSet == Boolean.TRUE) {
                    STLeistungsfall sourceLeistungsfall;
                    sourceLeistungsfall = this.getLeistungsfall();
                    STLeistungsfall copyLeistungsfall = ((STLeistungsfall) strategy.copy(LocatorUtils.property(locator, "leistungsfall", sourceLeistungsfall), sourceLeistungsfall, (this.leistungsfall!= null)));
                    copy.setLeistungsfall(copyLeistungsfall);
                } else {
                    if (leistungsfallShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leistungsfall = null;
                    }
                }
            }
            {
                Boolean unwiderruflichesBezugsrechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.unwiderruflichesBezugsrecht!= null));
                if (unwiderruflichesBezugsrechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceUnwiderruflichesBezugsrecht;
                    sourceUnwiderruflichesBezugsrecht = this.isUnwiderruflichesBezugsrecht();
                    Boolean copyUnwiderruflichesBezugsrecht = ((Boolean) strategy.copy(LocatorUtils.property(locator, "unwiderruflichesBezugsrecht", sourceUnwiderruflichesBezugsrecht), sourceUnwiderruflichesBezugsrecht, (this.unwiderruflichesBezugsrecht!= null)));
                    copy.setUnwiderruflichesBezugsrecht(copyUnwiderruflichesBezugsrecht);
                } else {
                    if (unwiderruflichesBezugsrechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unwiderruflichesBezugsrecht = null;
                    }
                }
            }
            {
                Boolean indexBerechtigterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.indexBerechtigter!= null));
                if (indexBerechtigterShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBezugsrecht sourceIndexBerechtigter;
                    sourceIndexBerechtigter = this.getIndexBerechtigter();
                    STBezugsrecht copyIndexBerechtigter = ((STBezugsrecht) strategy.copy(LocatorUtils.property(locator, "indexBerechtigter", sourceIndexBerechtigter), sourceIndexBerechtigter, (this.indexBerechtigter!= null)));
                    copy.setIndexBerechtigter(copyIndexBerechtigter);
                } else {
                    if (indexBerechtigterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.indexBerechtigter = null;
                    }
                }
            }
            {
                Boolean individualbezugShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.individualbezug!= null));
                if (individualbezugShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIndividualbezug;
                    sourceIndividualbezug = this.getIndividualbezug();
                    String copyIndividualbezug = ((String) strategy.copy(LocatorUtils.property(locator, "individualbezug", sourceIndividualbezug), sourceIndividualbezug, (this.individualbezug!= null)));
                    copy.setIndividualbezug(copyIndividualbezug);
                } else {
                    if (individualbezugShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.individualbezug = null;
                    }
                }
            }
            {
                Boolean bezugsrechtsanteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bezugsrechtsanteil!= null));
                if (bezugsrechtsanteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBezugsrechtsanteil;
                    sourceBezugsrechtsanteil = this.getBezugsrechtsanteil();
                    BigDecimal copyBezugsrechtsanteil = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "bezugsrechtsanteil", sourceBezugsrechtsanteil), sourceBezugsrechtsanteil, (this.bezugsrechtsanteil!= null)));
                    copy.setBezugsrechtsanteil(copyBezugsrechtsanteil);
                } else {
                    if (bezugsrechtsanteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezugsrechtsanteil = null;
                    }
                }
            }
            {
                Boolean bezugsberechtigterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bezugsberechtigter!= null));
                if (bezugsberechtigterShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTBezugsberechtigter sourceBezugsberechtigter;
                    sourceBezugsberechtigter = this.getBezugsberechtigter();
                    CTBezugsberechtigter copyBezugsberechtigter = ((CTBezugsberechtigter) strategy.copy(LocatorUtils.property(locator, "bezugsberechtigter", sourceBezugsberechtigter), sourceBezugsberechtigter, (this.bezugsberechtigter!= null)));
                    copy.setBezugsberechtigter(copyBezugsberechtigter);
                } else {
                    if (bezugsberechtigterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezugsberechtigter = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBezugsrecht();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withLeistungsfall(STLeistungsfall value) {
        setLeistungsfall(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withUnwiderruflichesBezugsrecht(Boolean value) {
        setUnwiderruflichesBezugsrecht(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withIndexBerechtigter(STBezugsrecht value) {
        setIndexBerechtigter(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withIndividualbezug(String value) {
        setIndividualbezug(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withBezugsrechtsanteil(BigDecimal value) {
        setBezugsrechtsanteil(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withBezugsberechtigter(CTBezugsberechtigter value) {
        setBezugsberechtigter(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBezugsrecht withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
