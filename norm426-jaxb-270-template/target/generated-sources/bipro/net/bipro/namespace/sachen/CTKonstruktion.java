
package net.bipro.namespace.sachen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STBefestigung;
import net.bipro.namespace.datentypen.STKonstruktionsteil;
import net.bipro.namespace.datentypen.STMaterial;
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
 * Die Konstruktion eines Objekts und das verwendete Material.
 * 
 * <p>Java class for CT_Konstruktion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Konstruktion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Konstruktionsteil"/&gt;
 *         &lt;element name="Material" type="{http://www.bipro.net/namespace/datentypen}ST_Material"/&gt;
 *         &lt;element name="Materialbeschreibung" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="Befestigung" type="{http://www.bipro.net/namespace/datentypen}ST_Befestigung" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Konstruktion", propOrder = {
    "artID",
    "material",
    "materialbeschreibung",
    "befestigung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTKonstruktion
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STKonstruktionsteil artID;
    @XmlElement(name = "Material", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STMaterial material;
    @XmlElement(name = "Materialbeschreibung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String materialbeschreibung;
    @XmlElement(name = "Befestigung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBefestigung befestigung;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STKonstruktionsteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STKonstruktionsteil getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STKonstruktionsteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STKonstruktionsteil value) {
        this.artID = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link STMaterial }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STMaterial getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMaterial }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMaterial(STMaterial value) {
        this.material = value;
    }

    /**
     * Gets the value of the materialbeschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getMaterialbeschreibung() {
        return materialbeschreibung;
    }

    /**
     * Sets the value of the materialbeschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMaterialbeschreibung(String value) {
        this.materialbeschreibung = value;
    }

    /**
     * Gets the value of the befestigung property.
     * 
     * @return
     *     possible object is
     *     {@link STBefestigung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBefestigung getBefestigung() {
        return befestigung;
    }

    /**
     * Sets the value of the befestigung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBefestigung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBefestigung(STBefestigung value) {
        this.befestigung = value;
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
        final CTKonstruktion that = ((CTKonstruktion) object);
        {
            STKonstruktionsteil lhsArtID;
            lhsArtID = this.getArtID();
            STKonstruktionsteil rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            STMaterial lhsMaterial;
            lhsMaterial = this.getMaterial();
            STMaterial rhsMaterial;
            rhsMaterial = that.getMaterial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "material", lhsMaterial), LocatorUtils.property(thatLocator, "material", rhsMaterial), lhsMaterial, rhsMaterial, (this.material!= null), (that.material!= null))) {
                return false;
            }
        }
        {
            String lhsMaterialbeschreibung;
            lhsMaterialbeschreibung = this.getMaterialbeschreibung();
            String rhsMaterialbeschreibung;
            rhsMaterialbeschreibung = that.getMaterialbeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "materialbeschreibung", lhsMaterialbeschreibung), LocatorUtils.property(thatLocator, "materialbeschreibung", rhsMaterialbeschreibung), lhsMaterialbeschreibung, rhsMaterialbeschreibung, (this.materialbeschreibung!= null), (that.materialbeschreibung!= null))) {
                return false;
            }
        }
        {
            STBefestigung lhsBefestigung;
            lhsBefestigung = this.getBefestigung();
            STBefestigung rhsBefestigung;
            rhsBefestigung = that.getBefestigung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "befestigung", lhsBefestigung), LocatorUtils.property(thatLocator, "befestigung", rhsBefestigung), lhsBefestigung, rhsBefestigung, (this.befestigung!= null), (that.befestigung!= null))) {
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
            STKonstruktionsteil theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            STMaterial theMaterial;
            theMaterial = this.getMaterial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "material", theMaterial), currentHashCode, theMaterial, (this.material!= null));
        }
        {
            String theMaterialbeschreibung;
            theMaterialbeschreibung = this.getMaterialbeschreibung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "materialbeschreibung", theMaterialbeschreibung), currentHashCode, theMaterialbeschreibung, (this.materialbeschreibung!= null));
        }
        {
            STBefestigung theBefestigung;
            theBefestigung = this.getBefestigung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "befestigung", theBefestigung), currentHashCode, theBefestigung, (this.befestigung!= null));
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
        if (draftCopy instanceof CTKonstruktion) {
            final CTKonstruktion copy = ((CTKonstruktion) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STKonstruktionsteil sourceArtID;
                    sourceArtID = this.getArtID();
                    STKonstruktionsteil copyArtID = ((STKonstruktionsteil) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean materialShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.material!= null));
                if (materialShouldBeCopiedAndSet == Boolean.TRUE) {
                    STMaterial sourceMaterial;
                    sourceMaterial = this.getMaterial();
                    STMaterial copyMaterial = ((STMaterial) strategy.copy(LocatorUtils.property(locator, "material", sourceMaterial), sourceMaterial, (this.material!= null)));
                    copy.setMaterial(copyMaterial);
                } else {
                    if (materialShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.material = null;
                    }
                }
            }
            {
                Boolean materialbeschreibungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.materialbeschreibung!= null));
                if (materialbeschreibungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMaterialbeschreibung;
                    sourceMaterialbeschreibung = this.getMaterialbeschreibung();
                    String copyMaterialbeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "materialbeschreibung", sourceMaterialbeschreibung), sourceMaterialbeschreibung, (this.materialbeschreibung!= null)));
                    copy.setMaterialbeschreibung(copyMaterialbeschreibung);
                } else {
                    if (materialbeschreibungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.materialbeschreibung = null;
                    }
                }
            }
            {
                Boolean befestigungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.befestigung!= null));
                if (befestigungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBefestigung sourceBefestigung;
                    sourceBefestigung = this.getBefestigung();
                    STBefestigung copyBefestigung = ((STBefestigung) strategy.copy(LocatorUtils.property(locator, "befestigung", sourceBefestigung), sourceBefestigung, (this.befestigung!= null)));
                    copy.setBefestigung(copyBefestigung);
                } else {
                    if (befestigungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.befestigung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKonstruktion();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKonstruktion withArtID(STKonstruktionsteil value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKonstruktion withMaterial(STMaterial value) {
        setMaterial(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKonstruktion withMaterialbeschreibung(String value) {
        setMaterialbeschreibung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKonstruktion withBefestigung(STBefestigung value) {
        setBefestigung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKonstruktion withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKonstruktion withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
