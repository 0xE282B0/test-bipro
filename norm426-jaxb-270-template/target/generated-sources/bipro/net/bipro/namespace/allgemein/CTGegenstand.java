
package net.bipro.namespace.allgemein;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.sachen.CTAnlage;
import net.bipro.namespace.sachen.CTBetrieb;
import net.bipro.namespace.sachen.CTBetriebsstaette;
import net.bipro.namespace.sachen.CTFahrrad;
import net.bipro.namespace.sachen.CTGebaeude;
import net.bipro.namespace.sachen.CTGebaeudeteil;
import net.bipro.namespace.sachen.CTGewaesser;
import net.bipro.namespace.sachen.CTGlas;
import net.bipro.namespace.sachen.CTGrundstueck;
import net.bipro.namespace.sachen.CTLuftfahrzeug;
import net.bipro.namespace.sachen.CTSonstigerGegenstand;
import net.bipro.namespace.sachen.CTSonstigesBauwerk;
import net.bipro.namespace.sachen.CTSportboot;
import net.bipro.namespace.sachen.CTTier;
import net.bipro.namespace.sachen.CTTransport;
import net.bipro.namespace.sachen.CTVorhaben;
import net.bipro.namespace.sachen.CTWasserfahrzeug;
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
 * <p>Java class for CT_Gegenstand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gegenstand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GegenstandID" type="{http://www.bipro.net/namespace/datentypen}ST_ID"/&gt;
 *         &lt;element name="Referenz" type="{http://www.bipro.net/namespace/datentypen}ST_Referenz" minOccurs="0"/&gt;
 *         &lt;element name="ZusaetzlicheGegenstandsdaten" type="{http://www.bipro.net/namespace/allgemein}CT_ZusaetzlicheGegenstandsdaten" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Beschreibung" type="{http://www.bipro.net/namespace/datentypen}ST_Text255" minOccurs="0"/&gt;
 *         &lt;element name="Groesse" type="{http://www.bipro.net/namespace/allgemein}CT_Groesse" minOccurs="0"/&gt;
 *         &lt;element name="Beinhaltet" type="{http://www.bipro.net/namespace/allgemein}CT_Beinhaltet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gegenstand", propOrder = {
    "gegenstandID",
    "referenz",
    "zusaetzlicheGegenstandsdaten",
    "beschreibung",
    "groesse",
    "beinhaltet"
})
@XmlSeeAlso({
    CTAnlage.class,
    CTBetrieb.class,
    CTBetriebsstaette.class,
    CTFahrrad.class,
    CTGebaeude.class,
    CTGebaeudeteil.class,
    CTGewaesser.class,
    CTGlas.class,
    CTGrundstueck.class,
    CTLuftfahrzeug.class,
    CTSonstigerGegenstand.class,
    CTSonstigesBauwerk.class,
    CTSportboot.class,
    CTTier.class,
    CTTransport.class,
    CTVorhaben.class,
    CTWasserfahrzeug.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTGegenstand
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "GegenstandID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String gegenstandID;
    @XmlElement(name = "Referenz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String referenz;
    @XmlElement(name = "ZusaetzlicheGegenstandsdaten")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTZusaetzlicheGegenstandsdaten> zusaetzlicheGegenstandsdaten;
    @XmlElement(name = "Beschreibung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String beschreibung;
    @XmlElement(name = "Groesse")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTGroesse groesse;
    @XmlElement(name = "Beinhaltet")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTBeinhaltet> beinhaltet;

    /**
     * Gets the value of the gegenstandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getGegenstandID() {
        return gegenstandID;
    }

    /**
     * Sets the value of the gegenstandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGegenstandID(String value) {
        this.gegenstandID = value;
    }

    /**
     * Gets the value of the referenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getReferenz() {
        return referenz;
    }

    /**
     * Sets the value of the referenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setReferenz(String value) {
        this.referenz = value;
    }

    /**
     * Gets the value of the zusaetzlicheGegenstandsdaten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zusaetzlicheGegenstandsdaten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZusaetzlicheGegenstandsdaten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTZusaetzlicheGegenstandsdaten }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTZusaetzlicheGegenstandsdaten> getZusaetzlicheGegenstandsdaten() {
        if (zusaetzlicheGegenstandsdaten == null) {
            zusaetzlicheGegenstandsdaten = new ArrayList<CTZusaetzlicheGegenstandsdaten>();
        }
        return this.zusaetzlicheGegenstandsdaten;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the groesse property.
     * 
     * @return
     *     possible object is
     *     {@link CTGroesse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGroesse getGroesse() {
        return groesse;
    }

    /**
     * Sets the value of the groesse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGroesse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setGroesse(CTGroesse value) {
        this.groesse = value;
    }

    /**
     * Gets the value of the beinhaltet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beinhaltet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeinhaltet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTBeinhaltet }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTBeinhaltet> getBeinhaltet() {
        if (beinhaltet == null) {
            beinhaltet = new ArrayList<CTBeinhaltet>();
        }
        return this.beinhaltet;
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
        final CTGegenstand that = ((CTGegenstand) object);
        {
            String lhsGegenstandID;
            lhsGegenstandID = this.getGegenstandID();
            String rhsGegenstandID;
            rhsGegenstandID = that.getGegenstandID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gegenstandID", lhsGegenstandID), LocatorUtils.property(thatLocator, "gegenstandID", rhsGegenstandID), lhsGegenstandID, rhsGegenstandID, (this.gegenstandID!= null), (that.gegenstandID!= null))) {
                return false;
            }
        }
        {
            String lhsReferenz;
            lhsReferenz = this.getReferenz();
            String rhsReferenz;
            rhsReferenz = that.getReferenz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenz", lhsReferenz), LocatorUtils.property(thatLocator, "referenz", rhsReferenz), lhsReferenz, rhsReferenz, (this.referenz!= null), (that.referenz!= null))) {
                return false;
            }
        }
        {
            List<CTZusaetzlicheGegenstandsdaten> lhsZusaetzlicheGegenstandsdaten;
            lhsZusaetzlicheGegenstandsdaten = (((this.zusaetzlicheGegenstandsdaten!= null)&&(!this.zusaetzlicheGegenstandsdaten.isEmpty()))?this.getZusaetzlicheGegenstandsdaten():null);
            List<CTZusaetzlicheGegenstandsdaten> rhsZusaetzlicheGegenstandsdaten;
            rhsZusaetzlicheGegenstandsdaten = (((that.zusaetzlicheGegenstandsdaten!= null)&&(!that.zusaetzlicheGegenstandsdaten.isEmpty()))?that.getZusaetzlicheGegenstandsdaten():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zusaetzlicheGegenstandsdaten", lhsZusaetzlicheGegenstandsdaten), LocatorUtils.property(thatLocator, "zusaetzlicheGegenstandsdaten", rhsZusaetzlicheGegenstandsdaten), lhsZusaetzlicheGegenstandsdaten, rhsZusaetzlicheGegenstandsdaten, ((this.zusaetzlicheGegenstandsdaten!= null)&&(!this.zusaetzlicheGegenstandsdaten.isEmpty())), ((that.zusaetzlicheGegenstandsdaten!= null)&&(!that.zusaetzlicheGegenstandsdaten.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsBeschreibung;
            lhsBeschreibung = this.getBeschreibung();
            String rhsBeschreibung;
            rhsBeschreibung = that.getBeschreibung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beschreibung", lhsBeschreibung), LocatorUtils.property(thatLocator, "beschreibung", rhsBeschreibung), lhsBeschreibung, rhsBeschreibung, (this.beschreibung!= null), (that.beschreibung!= null))) {
                return false;
            }
        }
        {
            CTGroesse lhsGroesse;
            lhsGroesse = this.getGroesse();
            CTGroesse rhsGroesse;
            rhsGroesse = that.getGroesse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groesse", lhsGroesse), LocatorUtils.property(thatLocator, "groesse", rhsGroesse), lhsGroesse, rhsGroesse, (this.groesse!= null), (that.groesse!= null))) {
                return false;
            }
        }
        {
            List<CTBeinhaltet> lhsBeinhaltet;
            lhsBeinhaltet = (((this.beinhaltet!= null)&&(!this.beinhaltet.isEmpty()))?this.getBeinhaltet():null);
            List<CTBeinhaltet> rhsBeinhaltet;
            rhsBeinhaltet = (((that.beinhaltet!= null)&&(!that.beinhaltet.isEmpty()))?that.getBeinhaltet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beinhaltet", lhsBeinhaltet), LocatorUtils.property(thatLocator, "beinhaltet", rhsBeinhaltet), lhsBeinhaltet, rhsBeinhaltet, ((this.beinhaltet!= null)&&(!this.beinhaltet.isEmpty())), ((that.beinhaltet!= null)&&(!that.beinhaltet.isEmpty())))) {
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
            String theGegenstandID;
            theGegenstandID = this.getGegenstandID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gegenstandID", theGegenstandID), currentHashCode, theGegenstandID, (this.gegenstandID!= null));
        }
        {
            String theReferenz;
            theReferenz = this.getReferenz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenz", theReferenz), currentHashCode, theReferenz, (this.referenz!= null));
        }
        {
            List<CTZusaetzlicheGegenstandsdaten> theZusaetzlicheGegenstandsdaten;
            theZusaetzlicheGegenstandsdaten = (((this.zusaetzlicheGegenstandsdaten!= null)&&(!this.zusaetzlicheGegenstandsdaten.isEmpty()))?this.getZusaetzlicheGegenstandsdaten():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zusaetzlicheGegenstandsdaten", theZusaetzlicheGegenstandsdaten), currentHashCode, theZusaetzlicheGegenstandsdaten, ((this.zusaetzlicheGegenstandsdaten!= null)&&(!this.zusaetzlicheGegenstandsdaten.isEmpty())));
        }
        {
            String theBeschreibung;
            theBeschreibung = this.getBeschreibung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beschreibung", theBeschreibung), currentHashCode, theBeschreibung, (this.beschreibung!= null));
        }
        {
            CTGroesse theGroesse;
            theGroesse = this.getGroesse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groesse", theGroesse), currentHashCode, theGroesse, (this.groesse!= null));
        }
        {
            List<CTBeinhaltet> theBeinhaltet;
            theBeinhaltet = (((this.beinhaltet!= null)&&(!this.beinhaltet.isEmpty()))?this.getBeinhaltet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beinhaltet", theBeinhaltet), currentHashCode, theBeinhaltet, ((this.beinhaltet!= null)&&(!this.beinhaltet.isEmpty())));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTGegenstand) {
            final CTGegenstand copy = ((CTGegenstand) target);
            {
                Boolean gegenstandIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gegenstandID!= null));
                if (gegenstandIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGegenstandID;
                    sourceGegenstandID = this.getGegenstandID();
                    String copyGegenstandID = ((String) strategy.copy(LocatorUtils.property(locator, "gegenstandID", sourceGegenstandID), sourceGegenstandID, (this.gegenstandID!= null)));
                    copy.setGegenstandID(copyGegenstandID);
                } else {
                    if (gegenstandIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gegenstandID = null;
                    }
                }
            }
            {
                Boolean referenzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referenz!= null));
                if (referenzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReferenz;
                    sourceReferenz = this.getReferenz();
                    String copyReferenz = ((String) strategy.copy(LocatorUtils.property(locator, "referenz", sourceReferenz), sourceReferenz, (this.referenz!= null)));
                    copy.setReferenz(copyReferenz);
                } else {
                    if (referenzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenz = null;
                    }
                }
            }
            {
                Boolean zusaetzlicheGegenstandsdatenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.zusaetzlicheGegenstandsdaten!= null)&&(!this.zusaetzlicheGegenstandsdaten.isEmpty())));
                if (zusaetzlicheGegenstandsdatenShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTZusaetzlicheGegenstandsdaten> sourceZusaetzlicheGegenstandsdaten;
                    sourceZusaetzlicheGegenstandsdaten = (((this.zusaetzlicheGegenstandsdaten!= null)&&(!this.zusaetzlicheGegenstandsdaten.isEmpty()))?this.getZusaetzlicheGegenstandsdaten():null);
                    @SuppressWarnings("unchecked")
                    List<CTZusaetzlicheGegenstandsdaten> copyZusaetzlicheGegenstandsdaten = ((List<CTZusaetzlicheGegenstandsdaten> ) strategy.copy(LocatorUtils.property(locator, "zusaetzlicheGegenstandsdaten", sourceZusaetzlicheGegenstandsdaten), sourceZusaetzlicheGegenstandsdaten, ((this.zusaetzlicheGegenstandsdaten!= null)&&(!this.zusaetzlicheGegenstandsdaten.isEmpty()))));
                    copy.zusaetzlicheGegenstandsdaten = null;
                    if (copyZusaetzlicheGegenstandsdaten!= null) {
                        List<CTZusaetzlicheGegenstandsdaten> uniqueZusaetzlicheGegenstandsdatenl = copy.getZusaetzlicheGegenstandsdaten();
                        uniqueZusaetzlicheGegenstandsdatenl.addAll(copyZusaetzlicheGegenstandsdaten);
                    }
                } else {
                    if (zusaetzlicheGegenstandsdatenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zusaetzlicheGegenstandsdaten = null;
                    }
                }
            }
            {
                Boolean beschreibungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beschreibung!= null));
                if (beschreibungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBeschreibung;
                    sourceBeschreibung = this.getBeschreibung();
                    String copyBeschreibung = ((String) strategy.copy(LocatorUtils.property(locator, "beschreibung", sourceBeschreibung), sourceBeschreibung, (this.beschreibung!= null)));
                    copy.setBeschreibung(copyBeschreibung);
                } else {
                    if (beschreibungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beschreibung = null;
                    }
                }
            }
            {
                Boolean groesseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.groesse!= null));
                if (groesseShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTGroesse sourceGroesse;
                    sourceGroesse = this.getGroesse();
                    CTGroesse copyGroesse = ((CTGroesse) strategy.copy(LocatorUtils.property(locator, "groesse", sourceGroesse), sourceGroesse, (this.groesse!= null)));
                    copy.setGroesse(copyGroesse);
                } else {
                    if (groesseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.groesse = null;
                    }
                }
            }
            {
                Boolean beinhaltetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.beinhaltet!= null)&&(!this.beinhaltet.isEmpty())));
                if (beinhaltetShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTBeinhaltet> sourceBeinhaltet;
                    sourceBeinhaltet = (((this.beinhaltet!= null)&&(!this.beinhaltet.isEmpty()))?this.getBeinhaltet():null);
                    @SuppressWarnings("unchecked")
                    List<CTBeinhaltet> copyBeinhaltet = ((List<CTBeinhaltet> ) strategy.copy(LocatorUtils.property(locator, "beinhaltet", sourceBeinhaltet), sourceBeinhaltet, ((this.beinhaltet!= null)&&(!this.beinhaltet.isEmpty()))));
                    copy.beinhaltet = null;
                    if (copyBeinhaltet!= null) {
                        List<CTBeinhaltet> uniqueBeinhaltetl = copy.getBeinhaltet();
                        uniqueBeinhaltetl.addAll(copyBeinhaltet);
                    }
                } else {
                    if (beinhaltetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beinhaltet = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGegenstand withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
