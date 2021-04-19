
package net.bipro.namespace.sachen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBeinhaltet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.allgemein.CTZeitraum2;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STArtDesVorhabens;
import net.bipro.namespace.datentypen.STAuftraggeber;
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
 * Klasse zur Beschreibung eines Bau- oder Montagevorhabens.
 * 
 * <p>Java class for CT_Vorhaben complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Vorhaben"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/allgemein}CT_Gegenstand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_ArtDesVorhabens" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Auftraggeberrisiko" type="{http://www.bipro.net/namespace/datentypen}ST_Auftraggeber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Montagezeit" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="Probebetrieb" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *         &lt;element name="Objektanschrift" type="{http://www.bipro.net/namespace/sachen}CT_Objektanschrift" minOccurs="0"/&gt;
 *         &lt;element name="Fertigstellung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Abnahme" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="TeilweiseBenutzung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="VollstaendigeBenutzung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Inbetriebnahme" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="Garantiezeit" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Vorhaben", propOrder = {
    "artID",
    "auftraggeberrisiko",
    "montagezeit",
    "probebetrieb",
    "objektanschrift",
    "fertigstellung",
    "abnahme",
    "teilweiseBenutzung",
    "vollstaendigeBenutzung",
    "inbetriebnahme",
    "garantiezeit"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVorhaben
    extends CTGegenstand
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<STArtDesVorhabens> artID;
    @XmlElement(name = "Auftraggeberrisiko")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<STAuftraggeber> auftraggeberrisiko;
    @XmlElement(name = "Montagezeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum montagezeit;
    @XmlElement(name = "Probebetrieb")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum probebetrieb;
    @XmlElement(name = "Objektanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTObjektanschrift objektanschrift;
    @XmlElement(name = "Fertigstellung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String fertigstellung;
    @XmlElement(name = "Abnahme")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String abnahme;
    @XmlElement(name = "TeilweiseBenutzung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String teilweiseBenutzung;
    @XmlElement(name = "VollstaendigeBenutzung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String vollstaendigeBenutzung;
    @XmlElement(name = "Inbetriebnahme")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String inbetriebnahme;
    @XmlElement(name = "Garantiezeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum2 garantiezeit;

    /**
     * Gets the value of the artID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STArtDesVorhabens }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<STArtDesVorhabens> getArtID() {
        if (artID == null) {
            artID = new ArrayList<STArtDesVorhabens>();
        }
        return this.artID;
    }

    /**
     * Gets the value of the auftraggeberrisiko property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auftraggeberrisiko property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuftraggeberrisiko().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STAuftraggeber }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<STAuftraggeber> getAuftraggeberrisiko() {
        if (auftraggeberrisiko == null) {
            auftraggeberrisiko = new ArrayList<STAuftraggeber>();
        }
        return this.auftraggeberrisiko;
    }

    /**
     * Gets the value of the montagezeit property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getMontagezeit() {
        return montagezeit;
    }

    /**
     * Sets the value of the montagezeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMontagezeit(CTZeitraum value) {
        this.montagezeit = value;
    }

    /**
     * Gets the value of the probebetrieb property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getProbebetrieb() {
        return probebetrieb;
    }

    /**
     * Sets the value of the probebetrieb property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setProbebetrieb(CTZeitraum value) {
        this.probebetrieb = value;
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
     * Gets the value of the fertigstellung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFertigstellung() {
        return fertigstellung;
    }

    /**
     * Sets the value of the fertigstellung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFertigstellung(String value) {
        this.fertigstellung = value;
    }

    /**
     * Gets the value of the abnahme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAbnahme() {
        return abnahme;
    }

    /**
     * Sets the value of the abnahme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAbnahme(String value) {
        this.abnahme = value;
    }

    /**
     * Gets the value of the teilweiseBenutzung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getTeilweiseBenutzung() {
        return teilweiseBenutzung;
    }

    /**
     * Sets the value of the teilweiseBenutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setTeilweiseBenutzung(String value) {
        this.teilweiseBenutzung = value;
    }

    /**
     * Gets the value of the vollstaendigeBenutzung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getVollstaendigeBenutzung() {
        return vollstaendigeBenutzung;
    }

    /**
     * Sets the value of the vollstaendigeBenutzung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVollstaendigeBenutzung(String value) {
        this.vollstaendigeBenutzung = value;
    }

    /**
     * Gets the value of the inbetriebnahme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getInbetriebnahme() {
        return inbetriebnahme;
    }

    /**
     * Sets the value of the inbetriebnahme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setInbetriebnahme(String value) {
        this.inbetriebnahme = value;
    }

    /**
     * Gets the value of the garantiezeit property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum2 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 getGarantiezeit() {
        return garantiezeit;
    }

    /**
     * Sets the value of the garantiezeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum2 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGarantiezeit(CTZeitraum2 value) {
        this.garantiezeit = value;
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
        final CTVorhaben that = ((CTVorhaben) object);
        {
            List<STArtDesVorhabens> lhsArtID;
            lhsArtID = (((this.artID!= null)&&(!this.artID.isEmpty()))?this.getArtID():null);
            List<STArtDesVorhabens> rhsArtID;
            rhsArtID = (((that.artID!= null)&&(!that.artID.isEmpty()))?that.getArtID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, ((this.artID!= null)&&(!this.artID.isEmpty())), ((that.artID!= null)&&(!that.artID.isEmpty())))) {
                return false;
            }
        }
        {
            List<STAuftraggeber> lhsAuftraggeberrisiko;
            lhsAuftraggeberrisiko = (((this.auftraggeberrisiko!= null)&&(!this.auftraggeberrisiko.isEmpty()))?this.getAuftraggeberrisiko():null);
            List<STAuftraggeber> rhsAuftraggeberrisiko;
            rhsAuftraggeberrisiko = (((that.auftraggeberrisiko!= null)&&(!that.auftraggeberrisiko.isEmpty()))?that.getAuftraggeberrisiko():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auftraggeberrisiko", lhsAuftraggeberrisiko), LocatorUtils.property(thatLocator, "auftraggeberrisiko", rhsAuftraggeberrisiko), lhsAuftraggeberrisiko, rhsAuftraggeberrisiko, ((this.auftraggeberrisiko!= null)&&(!this.auftraggeberrisiko.isEmpty())), ((that.auftraggeberrisiko!= null)&&(!that.auftraggeberrisiko.isEmpty())))) {
                return false;
            }
        }
        {
            CTZeitraum lhsMontagezeit;
            lhsMontagezeit = this.getMontagezeit();
            CTZeitraum rhsMontagezeit;
            rhsMontagezeit = that.getMontagezeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "montagezeit", lhsMontagezeit), LocatorUtils.property(thatLocator, "montagezeit", rhsMontagezeit), lhsMontagezeit, rhsMontagezeit, (this.montagezeit!= null), (that.montagezeit!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsProbebetrieb;
            lhsProbebetrieb = this.getProbebetrieb();
            CTZeitraum rhsProbebetrieb;
            rhsProbebetrieb = that.getProbebetrieb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "probebetrieb", lhsProbebetrieb), LocatorUtils.property(thatLocator, "probebetrieb", rhsProbebetrieb), lhsProbebetrieb, rhsProbebetrieb, (this.probebetrieb!= null), (that.probebetrieb!= null))) {
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
            String lhsFertigstellung;
            lhsFertigstellung = this.getFertigstellung();
            String rhsFertigstellung;
            rhsFertigstellung = that.getFertigstellung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fertigstellung", lhsFertigstellung), LocatorUtils.property(thatLocator, "fertigstellung", rhsFertigstellung), lhsFertigstellung, rhsFertigstellung, (this.fertigstellung!= null), (that.fertigstellung!= null))) {
                return false;
            }
        }
        {
            String lhsAbnahme;
            lhsAbnahme = this.getAbnahme();
            String rhsAbnahme;
            rhsAbnahme = that.getAbnahme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abnahme", lhsAbnahme), LocatorUtils.property(thatLocator, "abnahme", rhsAbnahme), lhsAbnahme, rhsAbnahme, (this.abnahme!= null), (that.abnahme!= null))) {
                return false;
            }
        }
        {
            String lhsTeilweiseBenutzung;
            lhsTeilweiseBenutzung = this.getTeilweiseBenutzung();
            String rhsTeilweiseBenutzung;
            rhsTeilweiseBenutzung = that.getTeilweiseBenutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilweiseBenutzung", lhsTeilweiseBenutzung), LocatorUtils.property(thatLocator, "teilweiseBenutzung", rhsTeilweiseBenutzung), lhsTeilweiseBenutzung, rhsTeilweiseBenutzung, (this.teilweiseBenutzung!= null), (that.teilweiseBenutzung!= null))) {
                return false;
            }
        }
        {
            String lhsVollstaendigeBenutzung;
            lhsVollstaendigeBenutzung = this.getVollstaendigeBenutzung();
            String rhsVollstaendigeBenutzung;
            rhsVollstaendigeBenutzung = that.getVollstaendigeBenutzung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vollstaendigeBenutzung", lhsVollstaendigeBenutzung), LocatorUtils.property(thatLocator, "vollstaendigeBenutzung", rhsVollstaendigeBenutzung), lhsVollstaendigeBenutzung, rhsVollstaendigeBenutzung, (this.vollstaendigeBenutzung!= null), (that.vollstaendigeBenutzung!= null))) {
                return false;
            }
        }
        {
            String lhsInbetriebnahme;
            lhsInbetriebnahme = this.getInbetriebnahme();
            String rhsInbetriebnahme;
            rhsInbetriebnahme = that.getInbetriebnahme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inbetriebnahme", lhsInbetriebnahme), LocatorUtils.property(thatLocator, "inbetriebnahme", rhsInbetriebnahme), lhsInbetriebnahme, rhsInbetriebnahme, (this.inbetriebnahme!= null), (that.inbetriebnahme!= null))) {
                return false;
            }
        }
        {
            CTZeitraum2 lhsGarantiezeit;
            lhsGarantiezeit = this.getGarantiezeit();
            CTZeitraum2 rhsGarantiezeit;
            rhsGarantiezeit = that.getGarantiezeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garantiezeit", lhsGarantiezeit), LocatorUtils.property(thatLocator, "garantiezeit", rhsGarantiezeit), lhsGarantiezeit, rhsGarantiezeit, (this.garantiezeit!= null), (that.garantiezeit!= null))) {
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
            List<STArtDesVorhabens> theArtID;
            theArtID = (((this.artID!= null)&&(!this.artID.isEmpty()))?this.getArtID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, ((this.artID!= null)&&(!this.artID.isEmpty())));
        }
        {
            List<STAuftraggeber> theAuftraggeberrisiko;
            theAuftraggeberrisiko = (((this.auftraggeberrisiko!= null)&&(!this.auftraggeberrisiko.isEmpty()))?this.getAuftraggeberrisiko():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auftraggeberrisiko", theAuftraggeberrisiko), currentHashCode, theAuftraggeberrisiko, ((this.auftraggeberrisiko!= null)&&(!this.auftraggeberrisiko.isEmpty())));
        }
        {
            CTZeitraum theMontagezeit;
            theMontagezeit = this.getMontagezeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "montagezeit", theMontagezeit), currentHashCode, theMontagezeit, (this.montagezeit!= null));
        }
        {
            CTZeitraum theProbebetrieb;
            theProbebetrieb = this.getProbebetrieb();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "probebetrieb", theProbebetrieb), currentHashCode, theProbebetrieb, (this.probebetrieb!= null));
        }
        {
            CTObjektanschrift theObjektanschrift;
            theObjektanschrift = this.getObjektanschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objektanschrift", theObjektanschrift), currentHashCode, theObjektanschrift, (this.objektanschrift!= null));
        }
        {
            String theFertigstellung;
            theFertigstellung = this.getFertigstellung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fertigstellung", theFertigstellung), currentHashCode, theFertigstellung, (this.fertigstellung!= null));
        }
        {
            String theAbnahme;
            theAbnahme = this.getAbnahme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abnahme", theAbnahme), currentHashCode, theAbnahme, (this.abnahme!= null));
        }
        {
            String theTeilweiseBenutzung;
            theTeilweiseBenutzung = this.getTeilweiseBenutzung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "teilweiseBenutzung", theTeilweiseBenutzung), currentHashCode, theTeilweiseBenutzung, (this.teilweiseBenutzung!= null));
        }
        {
            String theVollstaendigeBenutzung;
            theVollstaendigeBenutzung = this.getVollstaendigeBenutzung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vollstaendigeBenutzung", theVollstaendigeBenutzung), currentHashCode, theVollstaendigeBenutzung, (this.vollstaendigeBenutzung!= null));
        }
        {
            String theInbetriebnahme;
            theInbetriebnahme = this.getInbetriebnahme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inbetriebnahme", theInbetriebnahme), currentHashCode, theInbetriebnahme, (this.inbetriebnahme!= null));
        }
        {
            CTZeitraum2 theGarantiezeit;
            theGarantiezeit = this.getGarantiezeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "garantiezeit", theGarantiezeit), currentHashCode, theGarantiezeit, (this.garantiezeit!= null));
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
        if (draftCopy instanceof CTVorhaben) {
            final CTVorhaben copy = ((CTVorhaben) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.artID!= null)&&(!this.artID.isEmpty())));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STArtDesVorhabens> sourceArtID;
                    sourceArtID = (((this.artID!= null)&&(!this.artID.isEmpty()))?this.getArtID():null);
                    @SuppressWarnings("unchecked")
                    List<STArtDesVorhabens> copyArtID = ((List<STArtDesVorhabens> ) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, ((this.artID!= null)&&(!this.artID.isEmpty()))));
                    copy.artID = null;
                    if (copyArtID!= null) {
                        List<STArtDesVorhabens> uniqueArtIDl = copy.getArtID();
                        uniqueArtIDl.addAll(copyArtID);
                    }
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean auftraggeberrisikoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.auftraggeberrisiko!= null)&&(!this.auftraggeberrisiko.isEmpty())));
                if (auftraggeberrisikoShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STAuftraggeber> sourceAuftraggeberrisiko;
                    sourceAuftraggeberrisiko = (((this.auftraggeberrisiko!= null)&&(!this.auftraggeberrisiko.isEmpty()))?this.getAuftraggeberrisiko():null);
                    @SuppressWarnings("unchecked")
                    List<STAuftraggeber> copyAuftraggeberrisiko = ((List<STAuftraggeber> ) strategy.copy(LocatorUtils.property(locator, "auftraggeberrisiko", sourceAuftraggeberrisiko), sourceAuftraggeberrisiko, ((this.auftraggeberrisiko!= null)&&(!this.auftraggeberrisiko.isEmpty()))));
                    copy.auftraggeberrisiko = null;
                    if (copyAuftraggeberrisiko!= null) {
                        List<STAuftraggeber> uniqueAuftraggeberrisikol = copy.getAuftraggeberrisiko();
                        uniqueAuftraggeberrisikol.addAll(copyAuftraggeberrisiko);
                    }
                } else {
                    if (auftraggeberrisikoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auftraggeberrisiko = null;
                    }
                }
            }
            {
                Boolean montagezeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.montagezeit!= null));
                if (montagezeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceMontagezeit;
                    sourceMontagezeit = this.getMontagezeit();
                    CTZeitraum copyMontagezeit = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "montagezeit", sourceMontagezeit), sourceMontagezeit, (this.montagezeit!= null)));
                    copy.setMontagezeit(copyMontagezeit);
                } else {
                    if (montagezeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.montagezeit = null;
                    }
                }
            }
            {
                Boolean probebetriebShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.probebetrieb!= null));
                if (probebetriebShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceProbebetrieb;
                    sourceProbebetrieb = this.getProbebetrieb();
                    CTZeitraum copyProbebetrieb = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "probebetrieb", sourceProbebetrieb), sourceProbebetrieb, (this.probebetrieb!= null)));
                    copy.setProbebetrieb(copyProbebetrieb);
                } else {
                    if (probebetriebShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.probebetrieb = null;
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
                Boolean fertigstellungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fertigstellung!= null));
                if (fertigstellungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFertigstellung;
                    sourceFertigstellung = this.getFertigstellung();
                    String copyFertigstellung = ((String) strategy.copy(LocatorUtils.property(locator, "fertigstellung", sourceFertigstellung), sourceFertigstellung, (this.fertigstellung!= null)));
                    copy.setFertigstellung(copyFertigstellung);
                } else {
                    if (fertigstellungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fertigstellung = null;
                    }
                }
            }
            {
                Boolean abnahmeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.abnahme!= null));
                if (abnahmeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAbnahme;
                    sourceAbnahme = this.getAbnahme();
                    String copyAbnahme = ((String) strategy.copy(LocatorUtils.property(locator, "abnahme", sourceAbnahme), sourceAbnahme, (this.abnahme!= null)));
                    copy.setAbnahme(copyAbnahme);
                } else {
                    if (abnahmeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.abnahme = null;
                    }
                }
            }
            {
                Boolean teilweiseBenutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teilweiseBenutzung!= null));
                if (teilweiseBenutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTeilweiseBenutzung;
                    sourceTeilweiseBenutzung = this.getTeilweiseBenutzung();
                    String copyTeilweiseBenutzung = ((String) strategy.copy(LocatorUtils.property(locator, "teilweiseBenutzung", sourceTeilweiseBenutzung), sourceTeilweiseBenutzung, (this.teilweiseBenutzung!= null)));
                    copy.setTeilweiseBenutzung(copyTeilweiseBenutzung);
                } else {
                    if (teilweiseBenutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilweiseBenutzung = null;
                    }
                }
            }
            {
                Boolean vollstaendigeBenutzungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vollstaendigeBenutzung!= null));
                if (vollstaendigeBenutzungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVollstaendigeBenutzung;
                    sourceVollstaendigeBenutzung = this.getVollstaendigeBenutzung();
                    String copyVollstaendigeBenutzung = ((String) strategy.copy(LocatorUtils.property(locator, "vollstaendigeBenutzung", sourceVollstaendigeBenutzung), sourceVollstaendigeBenutzung, (this.vollstaendigeBenutzung!= null)));
                    copy.setVollstaendigeBenutzung(copyVollstaendigeBenutzung);
                } else {
                    if (vollstaendigeBenutzungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vollstaendigeBenutzung = null;
                    }
                }
            }
            {
                Boolean inbetriebnahmeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inbetriebnahme!= null));
                if (inbetriebnahmeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInbetriebnahme;
                    sourceInbetriebnahme = this.getInbetriebnahme();
                    String copyInbetriebnahme = ((String) strategy.copy(LocatorUtils.property(locator, "inbetriebnahme", sourceInbetriebnahme), sourceInbetriebnahme, (this.inbetriebnahme!= null)));
                    copy.setInbetriebnahme(copyInbetriebnahme);
                } else {
                    if (inbetriebnahmeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inbetriebnahme = null;
                    }
                }
            }
            {
                Boolean garantiezeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garantiezeit!= null));
                if (garantiezeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum2 sourceGarantiezeit;
                    sourceGarantiezeit = this.getGarantiezeit();
                    CTZeitraum2 copyGarantiezeit = ((CTZeitraum2) strategy.copy(LocatorUtils.property(locator, "garantiezeit", sourceGarantiezeit), sourceGarantiezeit, (this.garantiezeit!= null)));
                    copy.setGarantiezeit(copyGarantiezeit);
                } else {
                    if (garantiezeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garantiezeit = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVorhaben();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withArtID(STArtDesVorhabens... values) {
        if (values!= null) {
            for (STArtDesVorhabens value: values) {
                getArtID().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withArtID(Collection<STArtDesVorhabens> values) {
        if (values!= null) {
            getArtID().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withAuftraggeberrisiko(STAuftraggeber... values) {
        if (values!= null) {
            for (STAuftraggeber value: values) {
                getAuftraggeberrisiko().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withAuftraggeberrisiko(Collection<STAuftraggeber> values) {
        if (values!= null) {
            getAuftraggeberrisiko().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withMontagezeit(CTZeitraum value) {
        setMontagezeit(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withProbebetrieb(CTZeitraum value) {
        setProbebetrieb(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withObjektanschrift(CTObjektanschrift value) {
        setObjektanschrift(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withFertigstellung(String value) {
        setFertigstellung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withAbnahme(String value) {
        setAbnahme(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withTeilweiseBenutzung(String value) {
        setTeilweiseBenutzung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withVollstaendigeBenutzung(String value) {
        setVollstaendigeBenutzung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withInbetriebnahme(String value) {
        setInbetriebnahme(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withGarantiezeit(CTZeitraum2 value) {
        setGarantiezeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withGegenstandID(String value) {
        setGegenstandID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withZusaetzlicheGegenstandsdaten(CTZusaetzlicheGegenstandsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheGegenstandsdaten value: values) {
                getZusaetzlicheGegenstandsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withZusaetzlicheGegenstandsdaten(Collection<CTZusaetzlicheGegenstandsdaten> values) {
        if (values!= null) {
            getZusaetzlicheGegenstandsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withBeschreibung(String value) {
        setBeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withGroesse(CTGroesse value) {
        setGroesse(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withBeinhaltet(CTBeinhaltet... values) {
        if (values!= null) {
            for (CTBeinhaltet value: values) {
                getBeinhaltet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withBeinhaltet(Collection<CTBeinhaltet> values) {
        if (values!= null) {
            getBeinhaltet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorhaben withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
