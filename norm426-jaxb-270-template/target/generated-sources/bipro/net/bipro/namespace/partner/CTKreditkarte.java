
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
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
 * Hinweis: Die Verarbeitung von Kreditkartendaten erfordert die Einhalltung bestimmter Regularien und Prozesse. Diese sind umfassend, aber ggf. nicht vollständig im PCIDSS: - Payment Card Industry Data Security Standard beschrieben.
 * Unter anderem ist die Speicherung des CVC Codes nicht zulässig. Die Kreditkartennummer darf nur verschlüsselt gespeichert und nicht vollständig angezeigt werden.
 * 
 * <p>Java class for CT_Kreditkarte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Kreditkarte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kreditkartenunternehmen" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="GueltigVon" type="{http://www.bipro.net/namespace/datentypen}ST_MonatJahr" minOccurs="0"/&gt;
 *         &lt;element name="GueltigBis" type="{http://www.bipro.net/namespace/datentypen}ST_MonatJahr" minOccurs="0"/&gt;
 *         &lt;element name="Karteninhaber" type="{http://www.bipro.net/namespace/datentypen}ST_Text080" minOccurs="0"/&gt;
 *         &lt;element name="Kreditkartennummer" type="{http://www.bipro.net/namespace/datentypen}ST_Kreditkartennummer" minOccurs="0"/&gt;
 *         &lt;element name="CVCode" type="{http://www.bipro.net/namespace/datentypen}ST_CVCode" minOccurs="0"/&gt;
 *         &lt;element name="ZurZahlungGenutzt" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Kreditkarte", propOrder = {
    "kreditkartenunternehmen",
    "gueltigVon",
    "gueltigBis",
    "karteninhaber",
    "kreditkartennummer",
    "cvCode",
    "zurZahlungGenutzt"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTKreditkarte
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Kreditkartenunternehmen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kreditkartenunternehmen;
    @XmlElement(name = "GueltigVon")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String gueltigVon;
    @XmlElement(name = "GueltigBis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String gueltigBis;
    @XmlElement(name = "Karteninhaber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String karteninhaber;
    @XmlElement(name = "Kreditkartennummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kreditkartennummer;
    @XmlElement(name = "CVCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String cvCode;
    @XmlElement(name = "ZurZahlungGenutzt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected boolean zurZahlungGenutzt;

    /**
     * Gets the value of the kreditkartenunternehmen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKreditkartenunternehmen() {
        return kreditkartenunternehmen;
    }

    /**
     * Sets the value of the kreditkartenunternehmen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKreditkartenunternehmen(String value) {
        this.kreditkartenunternehmen = value;
    }

    /**
     * Gets the value of the gueltigVon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getGueltigVon() {
        return gueltigVon;
    }

    /**
     * Sets the value of the gueltigVon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGueltigVon(String value) {
        this.gueltigVon = value;
    }

    /**
     * Gets the value of the gueltigBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Sets the value of the gueltigBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGueltigBis(String value) {
        this.gueltigBis = value;
    }

    /**
     * Gets the value of the karteninhaber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKarteninhaber() {
        return karteninhaber;
    }

    /**
     * Sets the value of the karteninhaber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKarteninhaber(String value) {
        this.karteninhaber = value;
    }

    /**
     * Gets the value of the kreditkartennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKreditkartennummer() {
        return kreditkartennummer;
    }

    /**
     * Sets the value of the kreditkartennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKreditkartennummer(String value) {
        this.kreditkartennummer = value;
    }

    /**
     * Gets the value of the cvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getCVCode() {
        return cvCode;
    }

    /**
     * Sets the value of the cvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setCVCode(String value) {
        this.cvCode = value;
    }

    /**
     * Gets the value of the zurZahlungGenutzt property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public boolean isZurZahlungGenutzt() {
        return zurZahlungGenutzt;
    }

    /**
     * Sets the value of the zurZahlungGenutzt property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setZurZahlungGenutzt(boolean value) {
        this.zurZahlungGenutzt = value;
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
        final CTKreditkarte that = ((CTKreditkarte) object);
        {
            String lhsKreditkartenunternehmen;
            lhsKreditkartenunternehmen = this.getKreditkartenunternehmen();
            String rhsKreditkartenunternehmen;
            rhsKreditkartenunternehmen = that.getKreditkartenunternehmen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kreditkartenunternehmen", lhsKreditkartenunternehmen), LocatorUtils.property(thatLocator, "kreditkartenunternehmen", rhsKreditkartenunternehmen), lhsKreditkartenunternehmen, rhsKreditkartenunternehmen, (this.kreditkartenunternehmen!= null), (that.kreditkartenunternehmen!= null))) {
                return false;
            }
        }
        {
            String lhsGueltigVon;
            lhsGueltigVon = this.getGueltigVon();
            String rhsGueltigVon;
            rhsGueltigVon = that.getGueltigVon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigVon", lhsGueltigVon), LocatorUtils.property(thatLocator, "gueltigVon", rhsGueltigVon), lhsGueltigVon, rhsGueltigVon, (this.gueltigVon!= null), (that.gueltigVon!= null))) {
                return false;
            }
        }
        {
            String lhsGueltigBis;
            lhsGueltigBis = this.getGueltigBis();
            String rhsGueltigBis;
            rhsGueltigBis = that.getGueltigBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigBis", lhsGueltigBis), LocatorUtils.property(thatLocator, "gueltigBis", rhsGueltigBis), lhsGueltigBis, rhsGueltigBis, (this.gueltigBis!= null), (that.gueltigBis!= null))) {
                return false;
            }
        }
        {
            String lhsKarteninhaber;
            lhsKarteninhaber = this.getKarteninhaber();
            String rhsKarteninhaber;
            rhsKarteninhaber = that.getKarteninhaber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "karteninhaber", lhsKarteninhaber), LocatorUtils.property(thatLocator, "karteninhaber", rhsKarteninhaber), lhsKarteninhaber, rhsKarteninhaber, (this.karteninhaber!= null), (that.karteninhaber!= null))) {
                return false;
            }
        }
        {
            String lhsKreditkartennummer;
            lhsKreditkartennummer = this.getKreditkartennummer();
            String rhsKreditkartennummer;
            rhsKreditkartennummer = that.getKreditkartennummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kreditkartennummer", lhsKreditkartennummer), LocatorUtils.property(thatLocator, "kreditkartennummer", rhsKreditkartennummer), lhsKreditkartennummer, rhsKreditkartennummer, (this.kreditkartennummer!= null), (that.kreditkartennummer!= null))) {
                return false;
            }
        }
        {
            String lhsCVCode;
            lhsCVCode = this.getCVCode();
            String rhsCVCode;
            rhsCVCode = that.getCVCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cvCode", lhsCVCode), LocatorUtils.property(thatLocator, "cvCode", rhsCVCode), lhsCVCode, rhsCVCode, (this.cvCode!= null), (that.cvCode!= null))) {
                return false;
            }
        }
        {
            boolean lhsZurZahlungGenutzt;
            lhsZurZahlungGenutzt = this.isZurZahlungGenutzt();
            boolean rhsZurZahlungGenutzt;
            rhsZurZahlungGenutzt = that.isZurZahlungGenutzt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zurZahlungGenutzt", lhsZurZahlungGenutzt), LocatorUtils.property(thatLocator, "zurZahlungGenutzt", rhsZurZahlungGenutzt), lhsZurZahlungGenutzt, rhsZurZahlungGenutzt, true, true)) {
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
            String theKreditkartenunternehmen;
            theKreditkartenunternehmen = this.getKreditkartenunternehmen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kreditkartenunternehmen", theKreditkartenunternehmen), currentHashCode, theKreditkartenunternehmen, (this.kreditkartenunternehmen!= null));
        }
        {
            String theGueltigVon;
            theGueltigVon = this.getGueltigVon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigVon", theGueltigVon), currentHashCode, theGueltigVon, (this.gueltigVon!= null));
        }
        {
            String theGueltigBis;
            theGueltigBis = this.getGueltigBis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigBis", theGueltigBis), currentHashCode, theGueltigBis, (this.gueltigBis!= null));
        }
        {
            String theKarteninhaber;
            theKarteninhaber = this.getKarteninhaber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "karteninhaber", theKarteninhaber), currentHashCode, theKarteninhaber, (this.karteninhaber!= null));
        }
        {
            String theKreditkartennummer;
            theKreditkartennummer = this.getKreditkartennummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kreditkartennummer", theKreditkartennummer), currentHashCode, theKreditkartennummer, (this.kreditkartennummer!= null));
        }
        {
            String theCVCode;
            theCVCode = this.getCVCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cvCode", theCVCode), currentHashCode, theCVCode, (this.cvCode!= null));
        }
        {
            boolean theZurZahlungGenutzt;
            theZurZahlungGenutzt = this.isZurZahlungGenutzt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zurZahlungGenutzt", theZurZahlungGenutzt), currentHashCode, theZurZahlungGenutzt, true);
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
        if (draftCopy instanceof CTKreditkarte) {
            final CTKreditkarte copy = ((CTKreditkarte) draftCopy);
            {
                Boolean kreditkartenunternehmenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kreditkartenunternehmen!= null));
                if (kreditkartenunternehmenShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKreditkartenunternehmen;
                    sourceKreditkartenunternehmen = this.getKreditkartenunternehmen();
                    String copyKreditkartenunternehmen = ((String) strategy.copy(LocatorUtils.property(locator, "kreditkartenunternehmen", sourceKreditkartenunternehmen), sourceKreditkartenunternehmen, (this.kreditkartenunternehmen!= null)));
                    copy.setKreditkartenunternehmen(copyKreditkartenunternehmen);
                } else {
                    if (kreditkartenunternehmenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kreditkartenunternehmen = null;
                    }
                }
            }
            {
                Boolean gueltigVonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigVon!= null));
                if (gueltigVonShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGueltigVon;
                    sourceGueltigVon = this.getGueltigVon();
                    String copyGueltigVon = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigVon", sourceGueltigVon), sourceGueltigVon, (this.gueltigVon!= null)));
                    copy.setGueltigVon(copyGueltigVon);
                } else {
                    if (gueltigVonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigVon = null;
                    }
                }
            }
            {
                Boolean gueltigBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigBis!= null));
                if (gueltigBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGueltigBis;
                    sourceGueltigBis = this.getGueltigBis();
                    String copyGueltigBis = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigBis", sourceGueltigBis), sourceGueltigBis, (this.gueltigBis!= null)));
                    copy.setGueltigBis(copyGueltigBis);
                } else {
                    if (gueltigBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigBis = null;
                    }
                }
            }
            {
                Boolean karteninhaberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.karteninhaber!= null));
                if (karteninhaberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKarteninhaber;
                    sourceKarteninhaber = this.getKarteninhaber();
                    String copyKarteninhaber = ((String) strategy.copy(LocatorUtils.property(locator, "karteninhaber", sourceKarteninhaber), sourceKarteninhaber, (this.karteninhaber!= null)));
                    copy.setKarteninhaber(copyKarteninhaber);
                } else {
                    if (karteninhaberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.karteninhaber = null;
                    }
                }
            }
            {
                Boolean kreditkartennummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kreditkartennummer!= null));
                if (kreditkartennummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKreditkartennummer;
                    sourceKreditkartennummer = this.getKreditkartennummer();
                    String copyKreditkartennummer = ((String) strategy.copy(LocatorUtils.property(locator, "kreditkartennummer", sourceKreditkartennummer), sourceKreditkartennummer, (this.kreditkartennummer!= null)));
                    copy.setKreditkartennummer(copyKreditkartennummer);
                } else {
                    if (kreditkartennummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kreditkartennummer = null;
                    }
                }
            }
            {
                Boolean cvCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cvCode!= null));
                if (cvCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCVCode;
                    sourceCVCode = this.getCVCode();
                    String copyCVCode = ((String) strategy.copy(LocatorUtils.property(locator, "cvCode", sourceCVCode), sourceCVCode, (this.cvCode!= null)));
                    copy.setCVCode(copyCVCode);
                } else {
                    if (cvCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cvCode = null;
                    }
                }
            }
            {
                Boolean zurZahlungGenutztShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (zurZahlungGenutztShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceZurZahlungGenutzt;
                    sourceZurZahlungGenutzt = this.isZurZahlungGenutzt();
                    boolean copyZurZahlungGenutzt = strategy.copy(LocatorUtils.property(locator, "zurZahlungGenutzt", sourceZurZahlungGenutzt), sourceZurZahlungGenutzt, true);
                    copy.setZurZahlungGenutzt(copyZurZahlungGenutzt);
                } else {
                    if (zurZahlungGenutztShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTKreditkarte();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withKreditkartenunternehmen(String value) {
        setKreditkartenunternehmen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withGueltigVon(String value) {
        setGueltigVon(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withGueltigBis(String value) {
        setGueltigBis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withKarteninhaber(String value) {
        setKarteninhaber(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withKreditkartennummer(String value) {
        setKreditkartennummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withCVCode(String value) {
        setCVCode(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withZurZahlungGenutzt(boolean value) {
        setZurZahlungGenutzt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTKreditkarte withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
