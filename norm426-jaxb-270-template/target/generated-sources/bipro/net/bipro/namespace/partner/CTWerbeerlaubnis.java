
package net.bipro.namespace.partner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STBasisDerWerbeerlaubnis;
import net.bipro.namespace.datentypen.STJaNeinKeineAntwort;
import net.bipro.namespace.datentypen.STSparte;
import net.bipro.namespace.datentypen.STVersandart;
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
 * Die Klasse spezifiziert Werbeerlaubnisse und Werbeverbote generell oder in Abhängigkeit von Kommunikationsverbindungen und Sparten, eventuell auch für bestimmte Zeiträume.
 * 
 * <p>Java class for CT_Werbeerlaubnis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Werbeerlaubnis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Erlaubnis" type="{http://www.bipro.net/namespace/datentypen}ST_JaNeinKeineAntwort"/&gt;
 *         &lt;element name="Sparte" type="{http://www.bipro.net/namespace/datentypen}ST_Sparte" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Basis" type="{http://www.bipro.net/namespace/datentypen}ST_BasisDerWerbeerlaubnis" minOccurs="0"/&gt;
 *         &lt;element name="Bestaetigungsart" type="{http://www.bipro.net/namespace/datentypen}ST_Versandart" minOccurs="0"/&gt;
 *         &lt;element name="Bestaetigungsdatum" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Gueltigkeit" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="Kommunikationsverbindung" type="{http://www.bipro.net/namespace/partner}CT_Kommunikationsverbindung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EinwilligungserklaerungErlaeutert" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Werbeerlaubnis", propOrder = {
    "erlaubnis",
    "sparte",
    "basis",
    "bestaetigungsart",
    "bestaetigungsdatum",
    "gueltigkeit",
    "kommunikationsverbindung",
    "einwilligungserklaerungErlaeutert"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTWerbeerlaubnis
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Erlaubnis", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STJaNeinKeineAntwort erlaubnis;
    @XmlElement(name = "Sparte")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<STSparte> sparte;
    @XmlElement(name = "Basis")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STBasisDerWerbeerlaubnis basis;
    @XmlElement(name = "Bestaetigungsart")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVersandart bestaetigungsart;
    @XmlElement(name = "Bestaetigungsdatum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bestaetigungsdatum;
    @XmlElement(name = "Gueltigkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum gueltigkeit;
    @XmlElement(name = "Kommunikationsverbindung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTKommunikationsverbindung> kommunikationsverbindung;
    @XmlElement(name = "EinwilligungserklaerungErlaeutert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean einwilligungserklaerungErlaeutert;

    /**
     * Gets the value of the erlaubnis property.
     * 
     * @return
     *     possible object is
     *     {@link STJaNeinKeineAntwort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STJaNeinKeineAntwort getErlaubnis() {
        return erlaubnis;
    }

    /**
     * Sets the value of the erlaubnis property.
     * 
     * @param value
     *     allowed object is
     *     {@link STJaNeinKeineAntwort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setErlaubnis(STJaNeinKeineAntwort value) {
        this.erlaubnis = value;
    }

    /**
     * Gets the value of the sparte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sparte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSparte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STSparte }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<STSparte> getSparte() {
        if (sparte == null) {
            sparte = new ArrayList<STSparte>();
        }
        return this.sparte;
    }

    /**
     * Gets the value of the basis property.
     * 
     * @return
     *     possible object is
     *     {@link STBasisDerWerbeerlaubnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STBasisDerWerbeerlaubnis getBasis() {
        return basis;
    }

    /**
     * Sets the value of the basis property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBasisDerWerbeerlaubnis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBasis(STBasisDerWerbeerlaubnis value) {
        this.basis = value;
    }

    /**
     * Gets the value of the bestaetigungsart property.
     * 
     * @return
     *     possible object is
     *     {@link STVersandart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVersandart getBestaetigungsart() {
        return bestaetigungsart;
    }

    /**
     * Sets the value of the bestaetigungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVersandart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBestaetigungsart(STVersandart value) {
        this.bestaetigungsart = value;
    }

    /**
     * Gets the value of the bestaetigungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBestaetigungsdatum() {
        return bestaetigungsdatum;
    }

    /**
     * Sets the value of the bestaetigungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBestaetigungsdatum(String value) {
        this.bestaetigungsdatum = value;
    }

    /**
     * Gets the value of the gueltigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    /**
     * Sets the value of the gueltigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGueltigkeit(CTZeitraum value) {
        this.gueltigkeit = value;
    }

    /**
     * Gets the value of the kommunikationsverbindung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kommunikationsverbindung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommunikationsverbindung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKommunikationsverbindung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTKommunikationsverbindung> getKommunikationsverbindung() {
        if (kommunikationsverbindung == null) {
            kommunikationsverbindung = new ArrayList<CTKommunikationsverbindung>();
        }
        return this.kommunikationsverbindung;
    }

    /**
     * Gets the value of the einwilligungserklaerungErlaeutert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isEinwilligungserklaerungErlaeutert() {
        return einwilligungserklaerungErlaeutert;
    }

    /**
     * Sets the value of the einwilligungserklaerungErlaeutert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinwilligungserklaerungErlaeutert(Boolean value) {
        this.einwilligungserklaerungErlaeutert = value;
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
        final CTWerbeerlaubnis that = ((CTWerbeerlaubnis) object);
        {
            STJaNeinKeineAntwort lhsErlaubnis;
            lhsErlaubnis = this.getErlaubnis();
            STJaNeinKeineAntwort rhsErlaubnis;
            rhsErlaubnis = that.getErlaubnis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erlaubnis", lhsErlaubnis), LocatorUtils.property(thatLocator, "erlaubnis", rhsErlaubnis), lhsErlaubnis, rhsErlaubnis, (this.erlaubnis!= null), (that.erlaubnis!= null))) {
                return false;
            }
        }
        {
            List<STSparte> lhsSparte;
            lhsSparte = (((this.sparte!= null)&&(!this.sparte.isEmpty()))?this.getSparte():null);
            List<STSparte> rhsSparte;
            rhsSparte = (((that.sparte!= null)&&(!that.sparte.isEmpty()))?that.getSparte():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sparte", lhsSparte), LocatorUtils.property(thatLocator, "sparte", rhsSparte), lhsSparte, rhsSparte, ((this.sparte!= null)&&(!this.sparte.isEmpty())), ((that.sparte!= null)&&(!that.sparte.isEmpty())))) {
                return false;
            }
        }
        {
            STBasisDerWerbeerlaubnis lhsBasis;
            lhsBasis = this.getBasis();
            STBasisDerWerbeerlaubnis rhsBasis;
            rhsBasis = that.getBasis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "basis", lhsBasis), LocatorUtils.property(thatLocator, "basis", rhsBasis), lhsBasis, rhsBasis, (this.basis!= null), (that.basis!= null))) {
                return false;
            }
        }
        {
            STVersandart lhsBestaetigungsart;
            lhsBestaetigungsart = this.getBestaetigungsart();
            STVersandart rhsBestaetigungsart;
            rhsBestaetigungsart = that.getBestaetigungsart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestaetigungsart", lhsBestaetigungsart), LocatorUtils.property(thatLocator, "bestaetigungsart", rhsBestaetigungsart), lhsBestaetigungsart, rhsBestaetigungsart, (this.bestaetigungsart!= null), (that.bestaetigungsart!= null))) {
                return false;
            }
        }
        {
            String lhsBestaetigungsdatum;
            lhsBestaetigungsdatum = this.getBestaetigungsdatum();
            String rhsBestaetigungsdatum;
            rhsBestaetigungsdatum = that.getBestaetigungsdatum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestaetigungsdatum", lhsBestaetigungsdatum), LocatorUtils.property(thatLocator, "bestaetigungsdatum", rhsBestaetigungsdatum), lhsBestaetigungsdatum, rhsBestaetigungsdatum, (this.bestaetigungsdatum!= null), (that.bestaetigungsdatum!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsGueltigkeit;
            lhsGueltigkeit = this.getGueltigkeit();
            CTZeitraum rhsGueltigkeit;
            rhsGueltigkeit = that.getGueltigkeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigkeit", lhsGueltigkeit), LocatorUtils.property(thatLocator, "gueltigkeit", rhsGueltigkeit), lhsGueltigkeit, rhsGueltigkeit, (this.gueltigkeit!= null), (that.gueltigkeit!= null))) {
                return false;
            }
        }
        {
            List<CTKommunikationsverbindung> lhsKommunikationsverbindung;
            lhsKommunikationsverbindung = (((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))?this.getKommunikationsverbindung():null);
            List<CTKommunikationsverbindung> rhsKommunikationsverbindung;
            rhsKommunikationsverbindung = (((that.kommunikationsverbindung!= null)&&(!that.kommunikationsverbindung.isEmpty()))?that.getKommunikationsverbindung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kommunikationsverbindung", lhsKommunikationsverbindung), LocatorUtils.property(thatLocator, "kommunikationsverbindung", rhsKommunikationsverbindung), lhsKommunikationsverbindung, rhsKommunikationsverbindung, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty())), ((that.kommunikationsverbindung!= null)&&(!that.kommunikationsverbindung.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsEinwilligungserklaerungErlaeutert;
            lhsEinwilligungserklaerungErlaeutert = this.isEinwilligungserklaerungErlaeutert();
            Boolean rhsEinwilligungserklaerungErlaeutert;
            rhsEinwilligungserklaerungErlaeutert = that.isEinwilligungserklaerungErlaeutert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einwilligungserklaerungErlaeutert", lhsEinwilligungserklaerungErlaeutert), LocatorUtils.property(thatLocator, "einwilligungserklaerungErlaeutert", rhsEinwilligungserklaerungErlaeutert), lhsEinwilligungserklaerungErlaeutert, rhsEinwilligungserklaerungErlaeutert, (this.einwilligungserklaerungErlaeutert!= null), (that.einwilligungserklaerungErlaeutert!= null))) {
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
            STJaNeinKeineAntwort theErlaubnis;
            theErlaubnis = this.getErlaubnis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erlaubnis", theErlaubnis), currentHashCode, theErlaubnis, (this.erlaubnis!= null));
        }
        {
            List<STSparte> theSparte;
            theSparte = (((this.sparte!= null)&&(!this.sparte.isEmpty()))?this.getSparte():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sparte", theSparte), currentHashCode, theSparte, ((this.sparte!= null)&&(!this.sparte.isEmpty())));
        }
        {
            STBasisDerWerbeerlaubnis theBasis;
            theBasis = this.getBasis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "basis", theBasis), currentHashCode, theBasis, (this.basis!= null));
        }
        {
            STVersandart theBestaetigungsart;
            theBestaetigungsart = this.getBestaetigungsart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestaetigungsart", theBestaetigungsart), currentHashCode, theBestaetigungsart, (this.bestaetigungsart!= null));
        }
        {
            String theBestaetigungsdatum;
            theBestaetigungsdatum = this.getBestaetigungsdatum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestaetigungsdatum", theBestaetigungsdatum), currentHashCode, theBestaetigungsdatum, (this.bestaetigungsdatum!= null));
        }
        {
            CTZeitraum theGueltigkeit;
            theGueltigkeit = this.getGueltigkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigkeit", theGueltigkeit), currentHashCode, theGueltigkeit, (this.gueltigkeit!= null));
        }
        {
            List<CTKommunikationsverbindung> theKommunikationsverbindung;
            theKommunikationsverbindung = (((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))?this.getKommunikationsverbindung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kommunikationsverbindung", theKommunikationsverbindung), currentHashCode, theKommunikationsverbindung, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty())));
        }
        {
            Boolean theEinwilligungserklaerungErlaeutert;
            theEinwilligungserklaerungErlaeutert = this.isEinwilligungserklaerungErlaeutert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einwilligungserklaerungErlaeutert", theEinwilligungserklaerungErlaeutert), currentHashCode, theEinwilligungserklaerungErlaeutert, (this.einwilligungserklaerungErlaeutert!= null));
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
        if (draftCopy instanceof CTWerbeerlaubnis) {
            final CTWerbeerlaubnis copy = ((CTWerbeerlaubnis) draftCopy);
            {
                Boolean erlaubnisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.erlaubnis!= null));
                if (erlaubnisShouldBeCopiedAndSet == Boolean.TRUE) {
                    STJaNeinKeineAntwort sourceErlaubnis;
                    sourceErlaubnis = this.getErlaubnis();
                    STJaNeinKeineAntwort copyErlaubnis = ((STJaNeinKeineAntwort) strategy.copy(LocatorUtils.property(locator, "erlaubnis", sourceErlaubnis), sourceErlaubnis, (this.erlaubnis!= null)));
                    copy.setErlaubnis(copyErlaubnis);
                } else {
                    if (erlaubnisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erlaubnis = null;
                    }
                }
            }
            {
                Boolean sparteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.sparte!= null)&&(!this.sparte.isEmpty())));
                if (sparteShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STSparte> sourceSparte;
                    sourceSparte = (((this.sparte!= null)&&(!this.sparte.isEmpty()))?this.getSparte():null);
                    @SuppressWarnings("unchecked")
                    List<STSparte> copySparte = ((List<STSparte> ) strategy.copy(LocatorUtils.property(locator, "sparte", sourceSparte), sourceSparte, ((this.sparte!= null)&&(!this.sparte.isEmpty()))));
                    copy.sparte = null;
                    if (copySparte!= null) {
                        List<STSparte> uniqueSpartel = copy.getSparte();
                        uniqueSpartel.addAll(copySparte);
                    }
                } else {
                    if (sparteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sparte = null;
                    }
                }
            }
            {
                Boolean basisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.basis!= null));
                if (basisShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBasisDerWerbeerlaubnis sourceBasis;
                    sourceBasis = this.getBasis();
                    STBasisDerWerbeerlaubnis copyBasis = ((STBasisDerWerbeerlaubnis) strategy.copy(LocatorUtils.property(locator, "basis", sourceBasis), sourceBasis, (this.basis!= null)));
                    copy.setBasis(copyBasis);
                } else {
                    if (basisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.basis = null;
                    }
                }
            }
            {
                Boolean bestaetigungsartShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestaetigungsart!= null));
                if (bestaetigungsartShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVersandart sourceBestaetigungsart;
                    sourceBestaetigungsart = this.getBestaetigungsart();
                    STVersandart copyBestaetigungsart = ((STVersandart) strategy.copy(LocatorUtils.property(locator, "bestaetigungsart", sourceBestaetigungsart), sourceBestaetigungsart, (this.bestaetigungsart!= null)));
                    copy.setBestaetigungsart(copyBestaetigungsart);
                } else {
                    if (bestaetigungsartShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestaetigungsart = null;
                    }
                }
            }
            {
                Boolean bestaetigungsdatumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bestaetigungsdatum!= null));
                if (bestaetigungsdatumShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBestaetigungsdatum;
                    sourceBestaetigungsdatum = this.getBestaetigungsdatum();
                    String copyBestaetigungsdatum = ((String) strategy.copy(LocatorUtils.property(locator, "bestaetigungsdatum", sourceBestaetigungsdatum), sourceBestaetigungsdatum, (this.bestaetigungsdatum!= null)));
                    copy.setBestaetigungsdatum(copyBestaetigungsdatum);
                } else {
                    if (bestaetigungsdatumShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bestaetigungsdatum = null;
                    }
                }
            }
            {
                Boolean gueltigkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigkeit!= null));
                if (gueltigkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceGueltigkeit;
                    sourceGueltigkeit = this.getGueltigkeit();
                    CTZeitraum copyGueltigkeit = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "gueltigkeit", sourceGueltigkeit), sourceGueltigkeit, (this.gueltigkeit!= null)));
                    copy.setGueltigkeit(copyGueltigkeit);
                } else {
                    if (gueltigkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigkeit = null;
                    }
                }
            }
            {
                Boolean kommunikationsverbindungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty())));
                if (kommunikationsverbindungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTKommunikationsverbindung> sourceKommunikationsverbindung;
                    sourceKommunikationsverbindung = (((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))?this.getKommunikationsverbindung():null);
                    @SuppressWarnings("unchecked")
                    List<CTKommunikationsverbindung> copyKommunikationsverbindung = ((List<CTKommunikationsverbindung> ) strategy.copy(LocatorUtils.property(locator, "kommunikationsverbindung", sourceKommunikationsverbindung), sourceKommunikationsverbindung, ((this.kommunikationsverbindung!= null)&&(!this.kommunikationsverbindung.isEmpty()))));
                    copy.kommunikationsverbindung = null;
                    if (copyKommunikationsverbindung!= null) {
                        List<CTKommunikationsverbindung> uniqueKommunikationsverbindungl = copy.getKommunikationsverbindung();
                        uniqueKommunikationsverbindungl.addAll(copyKommunikationsverbindung);
                    }
                } else {
                    if (kommunikationsverbindungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kommunikationsverbindung = null;
                    }
                }
            }
            {
                Boolean einwilligungserklaerungErlaeutertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einwilligungserklaerungErlaeutert!= null));
                if (einwilligungserklaerungErlaeutertShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEinwilligungserklaerungErlaeutert;
                    sourceEinwilligungserklaerungErlaeutert = this.isEinwilligungserklaerungErlaeutert();
                    Boolean copyEinwilligungserklaerungErlaeutert = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einwilligungserklaerungErlaeutert", sourceEinwilligungserklaerungErlaeutert), sourceEinwilligungserklaerungErlaeutert, (this.einwilligungserklaerungErlaeutert!= null)));
                    copy.setEinwilligungserklaerungErlaeutert(copyEinwilligungserklaerungErlaeutert);
                } else {
                    if (einwilligungserklaerungErlaeutertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einwilligungserklaerungErlaeutert = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTWerbeerlaubnis();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withErlaubnis(STJaNeinKeineAntwort value) {
        setErlaubnis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withSparte(STSparte... values) {
        if (values!= null) {
            for (STSparte value: values) {
                getSparte().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withSparte(Collection<STSparte> values) {
        if (values!= null) {
            getSparte().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withBasis(STBasisDerWerbeerlaubnis value) {
        setBasis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withBestaetigungsart(STVersandart value) {
        setBestaetigungsart(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withBestaetigungsdatum(String value) {
        setBestaetigungsdatum(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withGueltigkeit(CTZeitraum value) {
        setGueltigkeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withKommunikationsverbindung(CTKommunikationsverbindung... values) {
        if (values!= null) {
            for (CTKommunikationsverbindung value: values) {
                getKommunikationsverbindung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withKommunikationsverbindung(Collection<CTKommunikationsverbindung> values) {
        if (values!= null) {
            getKommunikationsverbindung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withEinwilligungserklaerungErlaeutert(Boolean value) {
        setEinwilligungserklaerungErlaeutert(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWerbeerlaubnis withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
