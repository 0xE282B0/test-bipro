
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
import net.bipro.namespace.datentypen.STEGebaeudeteil;
import net.bipro.namespace.datentypen.STEGlasart;
import net.bipro.namespace.datentypen.STEGlasverwendung;
import net.bipro.namespace.datentypen.STEOberflaechenbearbeitungGlas;
import net.bipro.namespace.datentypen.STEVerglasungsart;
import net.bipro.namespace.datentypen.STGlasrisiko;
import net.bipro.namespace.datentypen.STMaterial;
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
 * Eigenständiges Glasrisiko unabhängig von Gebäude und Hausrat.
 * 
 * <p>Java class for CT_Glas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Glas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Glasrisiko" minOccurs="0"/&gt;
 *         &lt;element name="Wert" type="{http://www.bipro.net/namespace/datentypen}ST_Dezimalzahl" minOccurs="0"/&gt;
 *         &lt;element name="Werteinheit" type="{http://www.bipro.net/namespace/datentypen}ST_Werteinheit" minOccurs="0"/&gt;
 *         &lt;element name="Objektanschrift" type="{http://www.bipro.net/namespace/sachen}CT_Objektanschrift" minOccurs="0"/&gt;
 *         &lt;element name="Glasart" type="{http://www.bipro.net/namespace/datentypen}STE_Glasart" minOccurs="0"/&gt;
 *         &lt;element name="Verglasungsart" type="{http://www.bipro.net/namespace/datentypen}STE_Verglasungsart" minOccurs="0"/&gt;
 *         &lt;element name="Glasverwendung" type="{http://www.bipro.net/namespace/datentypen}STE_Glasverwendung" minOccurs="0"/&gt;
 *         &lt;element name="Lage" type="{http://www.bipro.net/namespace/datentypen}STE_Gebaeudeteil" minOccurs="0"/&gt;
 *         &lt;element name="Material" type="{http://www.bipro.net/namespace/datentypen}ST_Material" minOccurs="0"/&gt;
 *         &lt;element name="Oberflaechenbearbeitung" type="{http://www.bipro.net/namespace/datentypen}STE_OberflaechenbearbeitungGlas" minOccurs="0"/&gt;
 *         &lt;element name="Rahmen" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Fabrikat" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *         &lt;element name="Typenbezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text050" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Glas", propOrder = {
    "artID",
    "wert",
    "werteinheit",
    "objektanschrift",
    "glasart",
    "verglasungsart",
    "glasverwendung",
    "lage",
    "material",
    "oberflaechenbearbeitung",
    "rahmen",
    "fabrikat",
    "typenbezeichnung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGlas
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STGlasrisiko artID;
    @XmlElement(name = "Wert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal wert;
    @XmlElement(name = "Werteinheit")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STWerteinheit werteinheit;
    @XmlElement(name = "Objektanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTObjektanschrift objektanschrift;
    @XmlElement(name = "Glasart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEGlasart glasart;
    @XmlElement(name = "Verglasungsart")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEVerglasungsart verglasungsart;
    @XmlElement(name = "Glasverwendung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEGlasverwendung glasverwendung;
    @XmlElement(name = "Lage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEGebaeudeteil lage;
    @XmlElement(name = "Material")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STMaterial material;
    @XmlElement(name = "Oberflaechenbearbeitung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEOberflaechenbearbeitungGlas oberflaechenbearbeitung;
    @XmlElement(name = "Rahmen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean rahmen;
    @XmlElement(name = "Fabrikat")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String fabrikat;
    @XmlElement(name = "Typenbezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String typenbezeichnung;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STGlasrisiko }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STGlasrisiko getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGlasrisiko }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STGlasrisiko value) {
        this.artID = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWert(BigDecimal value) {
        this.wert = value;
    }

    /**
     * Gets the value of the werteinheit property.
     * 
     * @return
     *     possible object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STWerteinheit getWerteinheit() {
        return werteinheit;
    }

    /**
     * Sets the value of the werteinheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link STWerteinheit }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWerteinheit(STWerteinheit value) {
        this.werteinheit = value;
    }

    /**
     * Gets the value of the objektanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link CTObjektanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTObjektanschrift getObjektanschrift() {
        return objektanschrift;
    }

    /**
     * Sets the value of the objektanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTObjektanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setObjektanschrift(CTObjektanschrift value) {
        this.objektanschrift = value;
    }

    /**
     * Gets the value of the glasart property.
     * 
     * @return
     *     possible object is
     *     {@link STEGlasart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEGlasart getGlasart() {
        return glasart;
    }

    /**
     * Sets the value of the glasart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGlasart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGlasart(STEGlasart value) {
        this.glasart = value;
    }

    /**
     * Gets the value of the verglasungsart property.
     * 
     * @return
     *     possible object is
     *     {@link STEVerglasungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEVerglasungsart getVerglasungsart() {
        return verglasungsart;
    }

    /**
     * Sets the value of the verglasungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEVerglasungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVerglasungsart(STEVerglasungsart value) {
        this.verglasungsart = value;
    }

    /**
     * Gets the value of the glasverwendung property.
     * 
     * @return
     *     possible object is
     *     {@link STEGlasverwendung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEGlasverwendung getGlasverwendung() {
        return glasverwendung;
    }

    /**
     * Sets the value of the glasverwendung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGlasverwendung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGlasverwendung(STEGlasverwendung value) {
        this.glasverwendung = value;
    }

    /**
     * Gets the value of the lage property.
     * 
     * @return
     *     possible object is
     *     {@link STEGebaeudeteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEGebaeudeteil getLage() {
        return lage;
    }

    /**
     * Sets the value of the lage property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEGebaeudeteil }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setLage(STEGebaeudeteil value) {
        this.lage = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link STMaterial }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMaterial(STMaterial value) {
        this.material = value;
    }

    /**
     * Gets the value of the oberflaechenbearbeitung property.
     * 
     * @return
     *     possible object is
     *     {@link STEOberflaechenbearbeitungGlas }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEOberflaechenbearbeitungGlas getOberflaechenbearbeitung() {
        return oberflaechenbearbeitung;
    }

    /**
     * Sets the value of the oberflaechenbearbeitung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEOberflaechenbearbeitungGlas }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setOberflaechenbearbeitung(STEOberflaechenbearbeitungGlas value) {
        this.oberflaechenbearbeitung = value;
    }

    /**
     * Gets the value of the rahmen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isRahmen() {
        return rahmen;
    }

    /**
     * Sets the value of the rahmen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setRahmen(Boolean value) {
        this.rahmen = value;
    }

    /**
     * Gets the value of the fabrikat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFabrikat() {
        return fabrikat;
    }

    /**
     * Sets the value of the fabrikat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFabrikat(String value) {
        this.fabrikat = value;
    }

    /**
     * Gets the value of the typenbezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getTypenbezeichnung() {
        return typenbezeichnung;
    }

    /**
     * Sets the value of the typenbezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setTypenbezeichnung(String value) {
        this.typenbezeichnung = value;
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
        final CTGlas that = ((CTGlas) object);
        {
            STGlasrisiko lhsArtID;
            lhsArtID = this.getArtID();
            STGlasrisiko rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWert;
            lhsWert = this.getWert();
            BigDecimal rhsWert;
            rhsWert = that.getWert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wert", lhsWert), LocatorUtils.property(thatLocator, "wert", rhsWert), lhsWert, rhsWert, (this.wert!= null), (that.wert!= null))) {
                return false;
            }
        }
        {
            STWerteinheit lhsWerteinheit;
            lhsWerteinheit = this.getWerteinheit();
            STWerteinheit rhsWerteinheit;
            rhsWerteinheit = that.getWerteinheit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "werteinheit", lhsWerteinheit), LocatorUtils.property(thatLocator, "werteinheit", rhsWerteinheit), lhsWerteinheit, rhsWerteinheit, (this.werteinheit!= null), (that.werteinheit!= null))) {
                return false;
            }
        }
        {
            CTObjektanschrift lhsObjektanschrift;
            lhsObjektanschrift = this.getObjektanschrift();
            CTObjektanschrift rhsObjektanschrift;
            rhsObjektanschrift = that.getObjektanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objektanschrift", lhsObjektanschrift), LocatorUtils.property(thatLocator, "objektanschrift", rhsObjektanschrift), lhsObjektanschrift, rhsObjektanschrift, (this.objektanschrift!= null), (that.objektanschrift!= null))) {
                return false;
            }
        }
        {
            STEGlasart lhsGlasart;
            lhsGlasart = this.getGlasart();
            STEGlasart rhsGlasart;
            rhsGlasart = that.getGlasart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "glasart", lhsGlasart), LocatorUtils.property(thatLocator, "glasart", rhsGlasart), lhsGlasart, rhsGlasart, (this.glasart!= null), (that.glasart!= null))) {
                return false;
            }
        }
        {
            STEVerglasungsart lhsVerglasungsart;
            lhsVerglasungsart = this.getVerglasungsart();
            STEVerglasungsart rhsVerglasungsart;
            rhsVerglasungsart = that.getVerglasungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verglasungsart", lhsVerglasungsart), LocatorUtils.property(thatLocator, "verglasungsart", rhsVerglasungsart), lhsVerglasungsart, rhsVerglasungsart, (this.verglasungsart!= null), (that.verglasungsart!= null))) {
                return false;
            }
        }
        {
            STEGlasverwendung lhsGlasverwendung;
            lhsGlasverwendung = this.getGlasverwendung();
            STEGlasverwendung rhsGlasverwendung;
            rhsGlasverwendung = that.getGlasverwendung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "glasverwendung", lhsGlasverwendung), LocatorUtils.property(thatLocator, "glasverwendung", rhsGlasverwendung), lhsGlasverwendung, rhsGlasverwendung, (this.glasverwendung!= null), (that.glasverwendung!= null))) {
                return false;
            }
        }
        {
            STEGebaeudeteil lhsLage;
            lhsLage = this.getLage();
            STEGebaeudeteil rhsLage;
            rhsLage = that.getLage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lage", lhsLage), LocatorUtils.property(thatLocator, "lage", rhsLage), lhsLage, rhsLage, (this.lage!= null), (that.lage!= null))) {
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
            STEOberflaechenbearbeitungGlas lhsOberflaechenbearbeitung;
            lhsOberflaechenbearbeitung = this.getOberflaechenbearbeitung();
            STEOberflaechenbearbeitungGlas rhsOberflaechenbearbeitung;
            rhsOberflaechenbearbeitung = that.getOberflaechenbearbeitung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oberflaechenbearbeitung", lhsOberflaechenbearbeitung), LocatorUtils.property(thatLocator, "oberflaechenbearbeitung", rhsOberflaechenbearbeitung), lhsOberflaechenbearbeitung, rhsOberflaechenbearbeitung, (this.oberflaechenbearbeitung!= null), (that.oberflaechenbearbeitung!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRahmen;
            lhsRahmen = this.isRahmen();
            Boolean rhsRahmen;
            rhsRahmen = that.isRahmen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rahmen", lhsRahmen), LocatorUtils.property(thatLocator, "rahmen", rhsRahmen), lhsRahmen, rhsRahmen, (this.rahmen!= null), (that.rahmen!= null))) {
                return false;
            }
        }
        {
            String lhsFabrikat;
            lhsFabrikat = this.getFabrikat();
            String rhsFabrikat;
            rhsFabrikat = that.getFabrikat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fabrikat", lhsFabrikat), LocatorUtils.property(thatLocator, "fabrikat", rhsFabrikat), lhsFabrikat, rhsFabrikat, (this.fabrikat!= null), (that.fabrikat!= null))) {
                return false;
            }
        }
        {
            String lhsTypenbezeichnung;
            lhsTypenbezeichnung = this.getTypenbezeichnung();
            String rhsTypenbezeichnung;
            rhsTypenbezeichnung = that.getTypenbezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typenbezeichnung", lhsTypenbezeichnung), LocatorUtils.property(thatLocator, "typenbezeichnung", rhsTypenbezeichnung), lhsTypenbezeichnung, rhsTypenbezeichnung, (this.typenbezeichnung!= null), (that.typenbezeichnung!= null))) {
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
            STGlasrisiko theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            BigDecimal theWert;
            theWert = this.getWert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wert", theWert), currentHashCode, theWert, (this.wert!= null));
        }
        {
            STWerteinheit theWerteinheit;
            theWerteinheit = this.getWerteinheit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "werteinheit", theWerteinheit), currentHashCode, theWerteinheit, (this.werteinheit!= null));
        }
        {
            CTObjektanschrift theObjektanschrift;
            theObjektanschrift = this.getObjektanschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objektanschrift", theObjektanschrift), currentHashCode, theObjektanschrift, (this.objektanschrift!= null));
        }
        {
            STEGlasart theGlasart;
            theGlasart = this.getGlasart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "glasart", theGlasart), currentHashCode, theGlasart, (this.glasart!= null));
        }
        {
            STEVerglasungsart theVerglasungsart;
            theVerglasungsart = this.getVerglasungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verglasungsart", theVerglasungsart), currentHashCode, theVerglasungsart, (this.verglasungsart!= null));
        }
        {
            STEGlasverwendung theGlasverwendung;
            theGlasverwendung = this.getGlasverwendung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "glasverwendung", theGlasverwendung), currentHashCode, theGlasverwendung, (this.glasverwendung!= null));
        }
        {
            STEGebaeudeteil theLage;
            theLage = this.getLage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lage", theLage), currentHashCode, theLage, (this.lage!= null));
        }
        {
            STMaterial theMaterial;
            theMaterial = this.getMaterial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "material", theMaterial), currentHashCode, theMaterial, (this.material!= null));
        }
        {
            STEOberflaechenbearbeitungGlas theOberflaechenbearbeitung;
            theOberflaechenbearbeitung = this.getOberflaechenbearbeitung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oberflaechenbearbeitung", theOberflaechenbearbeitung), currentHashCode, theOberflaechenbearbeitung, (this.oberflaechenbearbeitung!= null));
        }
        {
            Boolean theRahmen;
            theRahmen = this.isRahmen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rahmen", theRahmen), currentHashCode, theRahmen, (this.rahmen!= null));
        }
        {
            String theFabrikat;
            theFabrikat = this.getFabrikat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fabrikat", theFabrikat), currentHashCode, theFabrikat, (this.fabrikat!= null));
        }
        {
            String theTypenbezeichnung;
            theTypenbezeichnung = this.getTypenbezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typenbezeichnung", theTypenbezeichnung), currentHashCode, theTypenbezeichnung, (this.typenbezeichnung!= null));
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
        if (draftCopy instanceof CTGlas) {
            final CTGlas copy = ((CTGlas) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGlasrisiko sourceArtID;
                    sourceArtID = this.getArtID();
                    STGlasrisiko copyArtID = ((STGlasrisiko) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean wertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wert!= null));
                if (wertShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWert;
                    sourceWert = this.getWert();
                    BigDecimal copyWert = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "wert", sourceWert), sourceWert, (this.wert!= null)));
                    copy.setWert(copyWert);
                } else {
                    if (wertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wert = null;
                    }
                }
            }
            {
                Boolean werteinheitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.werteinheit!= null));
                if (werteinheitShouldBeCopiedAndSet == Boolean.TRUE) {
                    STWerteinheit sourceWerteinheit;
                    sourceWerteinheit = this.getWerteinheit();
                    STWerteinheit copyWerteinheit = ((STWerteinheit) strategy.copy(LocatorUtils.property(locator, "werteinheit", sourceWerteinheit), sourceWerteinheit, (this.werteinheit!= null)));
                    copy.setWerteinheit(copyWerteinheit);
                } else {
                    if (werteinheitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.werteinheit = null;
                    }
                }
            }
            {
                Boolean objektanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.objektanschrift!= null));
                if (objektanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTObjektanschrift sourceObjektanschrift;
                    sourceObjektanschrift = this.getObjektanschrift();
                    CTObjektanschrift copyObjektanschrift = ((CTObjektanschrift) strategy.copy(LocatorUtils.property(locator, "objektanschrift", sourceObjektanschrift), sourceObjektanschrift, (this.objektanschrift!= null)));
                    copy.setObjektanschrift(copyObjektanschrift);
                } else {
                    if (objektanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.objektanschrift = null;
                    }
                }
            }
            {
                Boolean glasartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.glasart!= null));
                if (glasartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGlasart sourceGlasart;
                    sourceGlasart = this.getGlasart();
                    STEGlasart copyGlasart = ((STEGlasart) strategy.copy(LocatorUtils.property(locator, "glasart", sourceGlasart), sourceGlasart, (this.glasart!= null)));
                    copy.setGlasart(copyGlasart);
                } else {
                    if (glasartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.glasart = null;
                    }
                }
            }
            {
                Boolean verglasungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.verglasungsart!= null));
                if (verglasungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEVerglasungsart sourceVerglasungsart;
                    sourceVerglasungsart = this.getVerglasungsart();
                    STEVerglasungsart copyVerglasungsart = ((STEVerglasungsart) strategy.copy(LocatorUtils.property(locator, "verglasungsart", sourceVerglasungsart), sourceVerglasungsart, (this.verglasungsart!= null)));
                    copy.setVerglasungsart(copyVerglasungsart);
                } else {
                    if (verglasungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.verglasungsart = null;
                    }
                }
            }
            {
                Boolean glasverwendungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.glasverwendung!= null));
                if (glasverwendungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGlasverwendung sourceGlasverwendung;
                    sourceGlasverwendung = this.getGlasverwendung();
                    STEGlasverwendung copyGlasverwendung = ((STEGlasverwendung) strategy.copy(LocatorUtils.property(locator, "glasverwendung", sourceGlasverwendung), sourceGlasverwendung, (this.glasverwendung!= null)));
                    copy.setGlasverwendung(copyGlasverwendung);
                } else {
                    if (glasverwendungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.glasverwendung = null;
                    }
                }
            }
            {
                Boolean lageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lage!= null));
                if (lageShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEGebaeudeteil sourceLage;
                    sourceLage = this.getLage();
                    STEGebaeudeteil copyLage = ((STEGebaeudeteil) strategy.copy(LocatorUtils.property(locator, "lage", sourceLage), sourceLage, (this.lage!= null)));
                    copy.setLage(copyLage);
                } else {
                    if (lageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lage = null;
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
                Boolean oberflaechenbearbeitungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.oberflaechenbearbeitung!= null));
                if (oberflaechenbearbeitungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEOberflaechenbearbeitungGlas sourceOberflaechenbearbeitung;
                    sourceOberflaechenbearbeitung = this.getOberflaechenbearbeitung();
                    STEOberflaechenbearbeitungGlas copyOberflaechenbearbeitung = ((STEOberflaechenbearbeitungGlas) strategy.copy(LocatorUtils.property(locator, "oberflaechenbearbeitung", sourceOberflaechenbearbeitung), sourceOberflaechenbearbeitung, (this.oberflaechenbearbeitung!= null)));
                    copy.setOberflaechenbearbeitung(copyOberflaechenbearbeitung);
                } else {
                    if (oberflaechenbearbeitungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.oberflaechenbearbeitung = null;
                    }
                }
            }
            {
                Boolean rahmenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rahmen!= null));
                if (rahmenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRahmen;
                    sourceRahmen = this.isRahmen();
                    Boolean copyRahmen = ((Boolean) strategy.copy(LocatorUtils.property(locator, "rahmen", sourceRahmen), sourceRahmen, (this.rahmen!= null)));
                    copy.setRahmen(copyRahmen);
                } else {
                    if (rahmenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rahmen = null;
                    }
                }
            }
            {
                Boolean fabrikatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fabrikat!= null));
                if (fabrikatShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFabrikat;
                    sourceFabrikat = this.getFabrikat();
                    String copyFabrikat = ((String) strategy.copy(LocatorUtils.property(locator, "fabrikat", sourceFabrikat), sourceFabrikat, (this.fabrikat!= null)));
                    copy.setFabrikat(copyFabrikat);
                } else {
                    if (fabrikatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fabrikat = null;
                    }
                }
            }
            {
                Boolean typenbezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.typenbezeichnung!= null));
                if (typenbezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTypenbezeichnung;
                    sourceTypenbezeichnung = this.getTypenbezeichnung();
                    String copyTypenbezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "typenbezeichnung", sourceTypenbezeichnung), sourceTypenbezeichnung, (this.typenbezeichnung!= null)));
                    copy.setTypenbezeichnung(copyTypenbezeichnung);
                } else {
                    if (typenbezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.typenbezeichnung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGlas();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withArtID(STGlasrisiko value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withWert(BigDecimal value) {
        setWert(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withWerteinheit(STWerteinheit value) {
        setWerteinheit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withObjektanschrift(CTObjektanschrift value) {
        setObjektanschrift(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withGlasart(STEGlasart value) {
        setGlasart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withVerglasungsart(STEVerglasungsart value) {
        setVerglasungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withGlasverwendung(STEGlasverwendung value) {
        setGlasverwendung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withLage(STEGebaeudeteil value) {
        setLage(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withMaterial(STMaterial value) {
        setMaterial(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withOberflaechenbearbeitung(STEOberflaechenbearbeitungGlas value) {
        setOberflaechenbearbeitung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withRahmen(Boolean value) {
        setRahmen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withFabrikat(String value) {
        setFabrikat(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withTypenbezeichnung(String value) {
        setTypenbezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGlas withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
