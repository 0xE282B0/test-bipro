
package net.bipro.namespace.gevo;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STDokumentartID;
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
 * Klasse, über die Informationen zu bereitgestellten und mittels TP42007 (N420) abrufbaren Dokumenten.
 * 
 * <p>Java class for CT_Dokumentinformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Dokumentinformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DokumentartID" type="{http://www.bipro.net/namespace/datentypen}ST_DokumentartID"/&gt;
 *         &lt;element name="DateiID" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Erlaeuterung" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="BereitstellungBis" type="{http://www.bipro.net/namespace/datentypen}ST_Zeitstempel"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Dokumentinformation", propOrder = {
    "dokumentartID",
    "dateiID",
    "bezeichnung",
    "erlaeuterung",
    "bereitstellungBis"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTDokumentinformation
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "DokumentartID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STDokumentartID dokumentartID;
    @XmlElement(name = "DateiID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String dateiID;
    @XmlElement(name = "Bezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "Erlaeuterung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String erlaeuterung;
    @XmlElement(name = "BereitstellungBis", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String bereitstellungBis;

    /**
     * Gets the value of the dokumentartID property.
     * 
     * @return
     *     possible object is
     *     {@link STDokumentartID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STDokumentartID getDokumentartID() {
        return dokumentartID;
    }

    /**
     * Sets the value of the dokumentartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STDokumentartID }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDokumentartID(STDokumentartID value) {
        this.dokumentartID = value;
    }

    /**
     * Gets the value of the dateiID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getDateiID() {
        return dateiID;
    }

    /**
     * Sets the value of the dateiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setDateiID(String value) {
        this.dateiID = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the erlaeuterung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getErlaeuterung() {
        return erlaeuterung;
    }

    /**
     * Sets the value of the erlaeuterung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setErlaeuterung(String value) {
        this.erlaeuterung = value;
    }

    /**
     * Gets the value of the bereitstellungBis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBereitstellungBis() {
        return bereitstellungBis;
    }

    /**
     * Sets the value of the bereitstellungBis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBereitstellungBis(String value) {
        this.bereitstellungBis = value;
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
        final CTDokumentinformation that = ((CTDokumentinformation) object);
        {
            STDokumentartID lhsDokumentartID;
            lhsDokumentartID = this.getDokumentartID();
            STDokumentartID rhsDokumentartID;
            rhsDokumentartID = that.getDokumentartID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dokumentartID", lhsDokumentartID), LocatorUtils.property(thatLocator, "dokumentartID", rhsDokumentartID), lhsDokumentartID, rhsDokumentartID, (this.dokumentartID!= null), (that.dokumentartID!= null))) {
                return false;
            }
        }
        {
            String lhsDateiID;
            lhsDateiID = this.getDateiID();
            String rhsDateiID;
            rhsDateiID = that.getDateiID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateiID", lhsDateiID), LocatorUtils.property(thatLocator, "dateiID", rhsDateiID), lhsDateiID, rhsDateiID, (this.dateiID!= null), (that.dateiID!= null))) {
                return false;
            }
        }
        {
            String lhsBezeichnung;
            lhsBezeichnung = this.getBezeichnung();
            String rhsBezeichnung;
            rhsBezeichnung = that.getBezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezeichnung", lhsBezeichnung), LocatorUtils.property(thatLocator, "bezeichnung", rhsBezeichnung), lhsBezeichnung, rhsBezeichnung, (this.bezeichnung!= null), (that.bezeichnung!= null))) {
                return false;
            }
        }
        {
            String lhsErlaeuterung;
            lhsErlaeuterung = this.getErlaeuterung();
            String rhsErlaeuterung;
            rhsErlaeuterung = that.getErlaeuterung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erlaeuterung", lhsErlaeuterung), LocatorUtils.property(thatLocator, "erlaeuterung", rhsErlaeuterung), lhsErlaeuterung, rhsErlaeuterung, (this.erlaeuterung!= null), (that.erlaeuterung!= null))) {
                return false;
            }
        }
        {
            String lhsBereitstellungBis;
            lhsBereitstellungBis = this.getBereitstellungBis();
            String rhsBereitstellungBis;
            rhsBereitstellungBis = that.getBereitstellungBis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bereitstellungBis", lhsBereitstellungBis), LocatorUtils.property(thatLocator, "bereitstellungBis", rhsBereitstellungBis), lhsBereitstellungBis, rhsBereitstellungBis, (this.bereitstellungBis!= null), (that.bereitstellungBis!= null))) {
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
            STDokumentartID theDokumentartID;
            theDokumentartID = this.getDokumentartID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dokumentartID", theDokumentartID), currentHashCode, theDokumentartID, (this.dokumentartID!= null));
        }
        {
            String theDateiID;
            theDateiID = this.getDateiID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateiID", theDateiID), currentHashCode, theDateiID, (this.dateiID!= null));
        }
        {
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            String theErlaeuterung;
            theErlaeuterung = this.getErlaeuterung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erlaeuterung", theErlaeuterung), currentHashCode, theErlaeuterung, (this.erlaeuterung!= null));
        }
        {
            String theBereitstellungBis;
            theBereitstellungBis = this.getBereitstellungBis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bereitstellungBis", theBereitstellungBis), currentHashCode, theBereitstellungBis, (this.bereitstellungBis!= null));
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
        if (draftCopy instanceof CTDokumentinformation) {
            final CTDokumentinformation copy = ((CTDokumentinformation) draftCopy);
            {
                Boolean dokumentartIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dokumentartID!= null));
                if (dokumentartIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STDokumentartID sourceDokumentartID;
                    sourceDokumentartID = this.getDokumentartID();
                    STDokumentartID copyDokumentartID = ((STDokumentartID) strategy.copy(LocatorUtils.property(locator, "dokumentartID", sourceDokumentartID), sourceDokumentartID, (this.dokumentartID!= null)));
                    copy.setDokumentartID(copyDokumentartID);
                } else {
                    if (dokumentartIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dokumentartID = null;
                    }
                }
            }
            {
                Boolean dateiIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateiID!= null));
                if (dateiIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDateiID;
                    sourceDateiID = this.getDateiID();
                    String copyDateiID = ((String) strategy.copy(LocatorUtils.property(locator, "dateiID", sourceDateiID), sourceDateiID, (this.dateiID!= null)));
                    copy.setDateiID(copyDateiID);
                } else {
                    if (dateiIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateiID = null;
                    }
                }
            }
            {
                Boolean bezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bezeichnung!= null));
                if (bezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBezeichnung;
                    sourceBezeichnung = this.getBezeichnung();
                    String copyBezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "bezeichnung", sourceBezeichnung), sourceBezeichnung, (this.bezeichnung!= null)));
                    copy.setBezeichnung(copyBezeichnung);
                } else {
                    if (bezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezeichnung = null;
                    }
                }
            }
            {
                Boolean erlaeuterungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erlaeuterung!= null));
                if (erlaeuterungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceErlaeuterung;
                    sourceErlaeuterung = this.getErlaeuterung();
                    String copyErlaeuterung = ((String) strategy.copy(LocatorUtils.property(locator, "erlaeuterung", sourceErlaeuterung), sourceErlaeuterung, (this.erlaeuterung!= null)));
                    copy.setErlaeuterung(copyErlaeuterung);
                } else {
                    if (erlaeuterungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erlaeuterung = null;
                    }
                }
            }
            {
                Boolean bereitstellungBisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bereitstellungBis!= null));
                if (bereitstellungBisShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBereitstellungBis;
                    sourceBereitstellungBis = this.getBereitstellungBis();
                    String copyBereitstellungBis = ((String) strategy.copy(LocatorUtils.property(locator, "bereitstellungBis", sourceBereitstellungBis), sourceBereitstellungBis, (this.bereitstellungBis!= null)));
                    copy.setBereitstellungBis(copyBereitstellungBis);
                } else {
                    if (bereitstellungBisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bereitstellungBis = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTDokumentinformation();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentinformation withDokumentartID(STDokumentartID value) {
        setDokumentartID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentinformation withDateiID(String value) {
        setDateiID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentinformation withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentinformation withErlaeuterung(String value) {
        setErlaeuterung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentinformation withBereitstellungBis(String value) {
        setBereitstellungBis(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentinformation withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTDokumentinformation withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
