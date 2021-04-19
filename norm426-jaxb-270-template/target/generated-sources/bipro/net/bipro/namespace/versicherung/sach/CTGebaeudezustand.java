
package net.bipro.namespace.versicherung.sach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitwert;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
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
 * Klasse zur Risikobeurteilung des Gebäudezustandes und eventuell vorhandeneer Baumängeln
 * 
 * <p>Java class for CT_Gebaeudezustand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gebaeudezustand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_ZusaetzlicheGegenstandsdaten"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZumAbbruchBestimmt" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="GanzOderTeilweiseLeerstehend" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="AnMehrerenStellenOffen" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Beheizt" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Zeitwert" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitwert" minOccurs="0"/&gt;
 *         &lt;element name="Mangel" type="{http://www.bipro.net/namespace/versicherung/sach}CT_Mangel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gebaeudezustand", propOrder = {
    "zumAbbruchBestimmt",
    "ganzOderTeilweiseLeerstehend",
    "anMehrerenStellenOffen",
    "beheizt",
    "zeitwert",
    "mangel"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGebaeudezustand
    extends CTZusaetzlicheGegenstandsdaten
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ZumAbbruchBestimmt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean zumAbbruchBestimmt;
    @XmlElement(name = "GanzOderTeilweiseLeerstehend")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean ganzOderTeilweiseLeerstehend;
    @XmlElement(name = "AnMehrerenStellenOffen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean anMehrerenStellenOffen;
    @XmlElement(name = "Beheizt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean beheizt;
    @XmlElement(name = "Zeitwert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTZeitwert zeitwert;
    @XmlElement(name = "Mangel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTMangel> mangel;

    /**
     * Gets the value of the zumAbbruchBestimmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isZumAbbruchBestimmt() {
        return zumAbbruchBestimmt;
    }

    /**
     * Sets the value of the zumAbbruchBestimmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZumAbbruchBestimmt(Boolean value) {
        this.zumAbbruchBestimmt = value;
    }

    /**
     * Gets the value of the ganzOderTeilweiseLeerstehend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isGanzOderTeilweiseLeerstehend() {
        return ganzOderTeilweiseLeerstehend;
    }

    /**
     * Sets the value of the ganzOderTeilweiseLeerstehend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGanzOderTeilweiseLeerstehend(Boolean value) {
        this.ganzOderTeilweiseLeerstehend = value;
    }

    /**
     * Gets the value of the anMehrerenStellenOffen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isAnMehrerenStellenOffen() {
        return anMehrerenStellenOffen;
    }

    /**
     * Sets the value of the anMehrerenStellenOffen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAnMehrerenStellenOffen(Boolean value) {
        this.anMehrerenStellenOffen = value;
    }

    /**
     * Gets the value of the beheizt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isBeheizt() {
        return beheizt;
    }

    /**
     * Sets the value of the beheizt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeheizt(Boolean value) {
        this.beheizt = value;
    }

    /**
     * Gets the value of the zeitwert property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTZeitwert getZeitwert() {
        return zeitwert;
    }

    /**
     * Sets the value of the zeitwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitwert }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZeitwert(CTZeitwert value) {
        this.zeitwert = value;
    }

    /**
     * Gets the value of the mangel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mangel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMangel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMangel }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTMangel> getMangel() {
        if (mangel == null) {
            mangel = new ArrayList<CTMangel>();
        }
        return this.mangel;
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
        final CTGebaeudezustand that = ((CTGebaeudezustand) object);
        {
            Boolean lhsZumAbbruchBestimmt;
            lhsZumAbbruchBestimmt = this.isZumAbbruchBestimmt();
            Boolean rhsZumAbbruchBestimmt;
            rhsZumAbbruchBestimmt = that.isZumAbbruchBestimmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zumAbbruchBestimmt", lhsZumAbbruchBestimmt), LocatorUtils.property(thatLocator, "zumAbbruchBestimmt", rhsZumAbbruchBestimmt), lhsZumAbbruchBestimmt, rhsZumAbbruchBestimmt, (this.zumAbbruchBestimmt!= null), (that.zumAbbruchBestimmt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsGanzOderTeilweiseLeerstehend;
            lhsGanzOderTeilweiseLeerstehend = this.isGanzOderTeilweiseLeerstehend();
            Boolean rhsGanzOderTeilweiseLeerstehend;
            rhsGanzOderTeilweiseLeerstehend = that.isGanzOderTeilweiseLeerstehend();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ganzOderTeilweiseLeerstehend", lhsGanzOderTeilweiseLeerstehend), LocatorUtils.property(thatLocator, "ganzOderTeilweiseLeerstehend", rhsGanzOderTeilweiseLeerstehend), lhsGanzOderTeilweiseLeerstehend, rhsGanzOderTeilweiseLeerstehend, (this.ganzOderTeilweiseLeerstehend!= null), (that.ganzOderTeilweiseLeerstehend!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAnMehrerenStellenOffen;
            lhsAnMehrerenStellenOffen = this.isAnMehrerenStellenOffen();
            Boolean rhsAnMehrerenStellenOffen;
            rhsAnMehrerenStellenOffen = that.isAnMehrerenStellenOffen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anMehrerenStellenOffen", lhsAnMehrerenStellenOffen), LocatorUtils.property(thatLocator, "anMehrerenStellenOffen", rhsAnMehrerenStellenOffen), lhsAnMehrerenStellenOffen, rhsAnMehrerenStellenOffen, (this.anMehrerenStellenOffen!= null), (that.anMehrerenStellenOffen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBeheizt;
            lhsBeheizt = this.isBeheizt();
            Boolean rhsBeheizt;
            rhsBeheizt = that.isBeheizt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beheizt", lhsBeheizt), LocatorUtils.property(thatLocator, "beheizt", rhsBeheizt), lhsBeheizt, rhsBeheizt, (this.beheizt!= null), (that.beheizt!= null))) {
                return false;
            }
        }
        {
            CTZeitwert lhsZeitwert;
            lhsZeitwert = this.getZeitwert();
            CTZeitwert rhsZeitwert;
            rhsZeitwert = that.getZeitwert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeitwert", lhsZeitwert), LocatorUtils.property(thatLocator, "zeitwert", rhsZeitwert), lhsZeitwert, rhsZeitwert, (this.zeitwert!= null), (that.zeitwert!= null))) {
                return false;
            }
        }
        {
            List<CTMangel> lhsMangel;
            lhsMangel = (((this.mangel!= null)&&(!this.mangel.isEmpty()))?this.getMangel():null);
            List<CTMangel> rhsMangel;
            rhsMangel = (((that.mangel!= null)&&(!that.mangel.isEmpty()))?that.getMangel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mangel", lhsMangel), LocatorUtils.property(thatLocator, "mangel", rhsMangel), lhsMangel, rhsMangel, ((this.mangel!= null)&&(!this.mangel.isEmpty())), ((that.mangel!= null)&&(!that.mangel.isEmpty())))) {
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
            Boolean theZumAbbruchBestimmt;
            theZumAbbruchBestimmt = this.isZumAbbruchBestimmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zumAbbruchBestimmt", theZumAbbruchBestimmt), currentHashCode, theZumAbbruchBestimmt, (this.zumAbbruchBestimmt!= null));
        }
        {
            Boolean theGanzOderTeilweiseLeerstehend;
            theGanzOderTeilweiseLeerstehend = this.isGanzOderTeilweiseLeerstehend();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ganzOderTeilweiseLeerstehend", theGanzOderTeilweiseLeerstehend), currentHashCode, theGanzOderTeilweiseLeerstehend, (this.ganzOderTeilweiseLeerstehend!= null));
        }
        {
            Boolean theAnMehrerenStellenOffen;
            theAnMehrerenStellenOffen = this.isAnMehrerenStellenOffen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anMehrerenStellenOffen", theAnMehrerenStellenOffen), currentHashCode, theAnMehrerenStellenOffen, (this.anMehrerenStellenOffen!= null));
        }
        {
            Boolean theBeheizt;
            theBeheizt = this.isBeheizt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beheizt", theBeheizt), currentHashCode, theBeheizt, (this.beheizt!= null));
        }
        {
            CTZeitwert theZeitwert;
            theZeitwert = this.getZeitwert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitwert", theZeitwert), currentHashCode, theZeitwert, (this.zeitwert!= null));
        }
        {
            List<CTMangel> theMangel;
            theMangel = (((this.mangel!= null)&&(!this.mangel.isEmpty()))?this.getMangel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mangel", theMangel), currentHashCode, theMangel, ((this.mangel!= null)&&(!this.mangel.isEmpty())));
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
        if (draftCopy instanceof CTGebaeudezustand) {
            final CTGebaeudezustand copy = ((CTGebaeudezustand) draftCopy);
            {
                Boolean zumAbbruchBestimmtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zumAbbruchBestimmt!= null));
                if (zumAbbruchBestimmtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceZumAbbruchBestimmt;
                    sourceZumAbbruchBestimmt = this.isZumAbbruchBestimmt();
                    Boolean copyZumAbbruchBestimmt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "zumAbbruchBestimmt", sourceZumAbbruchBestimmt), sourceZumAbbruchBestimmt, (this.zumAbbruchBestimmt!= null)));
                    copy.setZumAbbruchBestimmt(copyZumAbbruchBestimmt);
                } else {
                    if (zumAbbruchBestimmtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zumAbbruchBestimmt = null;
                    }
                }
            }
            {
                Boolean ganzOderTeilweiseLeerstehendShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ganzOderTeilweiseLeerstehend!= null));
                if (ganzOderTeilweiseLeerstehendShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceGanzOderTeilweiseLeerstehend;
                    sourceGanzOderTeilweiseLeerstehend = this.isGanzOderTeilweiseLeerstehend();
                    Boolean copyGanzOderTeilweiseLeerstehend = ((Boolean) strategy.copy(LocatorUtils.property(locator, "ganzOderTeilweiseLeerstehend", sourceGanzOderTeilweiseLeerstehend), sourceGanzOderTeilweiseLeerstehend, (this.ganzOderTeilweiseLeerstehend!= null)));
                    copy.setGanzOderTeilweiseLeerstehend(copyGanzOderTeilweiseLeerstehend);
                } else {
                    if (ganzOderTeilweiseLeerstehendShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ganzOderTeilweiseLeerstehend = null;
                    }
                }
            }
            {
                Boolean anMehrerenStellenOffenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anMehrerenStellenOffen!= null));
                if (anMehrerenStellenOffenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAnMehrerenStellenOffen;
                    sourceAnMehrerenStellenOffen = this.isAnMehrerenStellenOffen();
                    Boolean copyAnMehrerenStellenOffen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "anMehrerenStellenOffen", sourceAnMehrerenStellenOffen), sourceAnMehrerenStellenOffen, (this.anMehrerenStellenOffen!= null)));
                    copy.setAnMehrerenStellenOffen(copyAnMehrerenStellenOffen);
                } else {
                    if (anMehrerenStellenOffenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anMehrerenStellenOffen = null;
                    }
                }
            }
            {
                Boolean beheiztShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beheizt!= null));
                if (beheiztShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBeheizt;
                    sourceBeheizt = this.isBeheizt();
                    Boolean copyBeheizt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "beheizt", sourceBeheizt), sourceBeheizt, (this.beheizt!= null)));
                    copy.setBeheizt(copyBeheizt);
                } else {
                    if (beheiztShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beheizt = null;
                    }
                }
            }
            {
                Boolean zeitwertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeitwert!= null));
                if (zeitwertShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitwert sourceZeitwert;
                    sourceZeitwert = this.getZeitwert();
                    CTZeitwert copyZeitwert = ((CTZeitwert) strategy.copy(LocatorUtils.property(locator, "zeitwert", sourceZeitwert), sourceZeitwert, (this.zeitwert!= null)));
                    copy.setZeitwert(copyZeitwert);
                } else {
                    if (zeitwertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeitwert = null;
                    }
                }
            }
            {
                Boolean mangelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mangel!= null)&&(!this.mangel.isEmpty())));
                if (mangelShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTMangel> sourceMangel;
                    sourceMangel = (((this.mangel!= null)&&(!this.mangel.isEmpty()))?this.getMangel():null);
                    @SuppressWarnings("unchecked")
                    List<CTMangel> copyMangel = ((List<CTMangel> ) strategy.copy(LocatorUtils.property(locator, "mangel", sourceMangel), sourceMangel, ((this.mangel!= null)&&(!this.mangel.isEmpty()))));
                    copy.mangel = null;
                    if (copyMangel!= null) {
                        List<CTMangel> uniqueMangell = copy.getMangel();
                        uniqueMangell.addAll(copyMangel);
                    }
                } else {
                    if (mangelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mangel = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGebaeudezustand();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withZumAbbruchBestimmt(Boolean value) {
        setZumAbbruchBestimmt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withGanzOderTeilweiseLeerstehend(Boolean value) {
        setGanzOderTeilweiseLeerstehend(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withAnMehrerenStellenOffen(Boolean value) {
        setAnMehrerenStellenOffen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withBeheizt(Boolean value) {
        setBeheizt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withZeitwert(CTZeitwert value) {
        setZeitwert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withMangel(CTMangel... values) {
        if (values!= null) {
            for (CTMangel value: values) {
                getMangel().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withMangel(Collection<CTMangel> values) {
        if (values!= null) {
            getMangel().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGebaeudezustand withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
