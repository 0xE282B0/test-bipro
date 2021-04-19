
package net.bipro.namespace.versicherung.produktmodell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTStichtagsbetrag;
import net.bipro.namespace.allgemein.CTUnternehmen;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAbgangsgrund;
import net.bipro.namespace.datentypen.STEBedingungen;
import net.bipro.namespace.datentypen.STVertragsform;
import net.bipro.namespace.datentypen.STVertragsstatus;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTBeitragszahler;
import net.bipro.namespace.produktmodell.CTBeitrag;
import net.bipro.namespace.produktmodell.CTDynamik;
import net.bipro.namespace.produktmodell.CTKondition;
import net.bipro.namespace.produktmodell.CTZertifizierungsdaten;
import net.bipro.namespace.produktmodell.CTZusaetzlicheProduktbausteinDaten;
import net.bipro.namespace.versicherung.produktmodell.komposit.CTDeckung;
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
 * <p>Java class for CT_Elementarprodukt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Elementarprodukt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/produktmodell}CT_Elementarprodukt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersicherungssummeOderLeistung" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_VersicherungssummeOderLeistung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Selbstbeteiligung" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Selbstbeteiligung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Klausel" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Klausel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Bezugsrecht" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Bezugsrecht" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Leistungsausschluss" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Leistungsausschluss" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FondsPortfolio" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_FondsPortfolio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Elementarprodukt", propOrder = {
    "versicherungssummeOderLeistung",
    "selbstbeteiligung",
    "klausel",
    "bezugsrecht",
    "leistungsausschluss",
    "fondsPortfolio"
})
@XmlSeeAlso({
    CTDeckung.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTElementarprodukt
    extends net.bipro.namespace.produktmodell.CTElementarprodukt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "VersicherungssummeOderLeistung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTVersicherungssummeOderLeistung> versicherungssummeOderLeistung;
    @XmlElement(name = "Selbstbeteiligung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTSelbstbeteiligung> selbstbeteiligung;
    @XmlElement(name = "Klausel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTKlausel> klausel;
    @XmlElement(name = "Bezugsrecht")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTBezugsrecht> bezugsrecht;
    @XmlElement(name = "Leistungsausschluss")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTLeistungsausschluss> leistungsausschluss;
    @XmlElement(name = "FondsPortfolio")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTFondsPortfolio> fondsPortfolio;

    /**
     * Gets the value of the versicherungssummeOderLeistung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versicherungssummeOderLeistung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersicherungssummeOderLeistung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVersicherungssummeOderLeistung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTVersicherungssummeOderLeistung> getVersicherungssummeOderLeistung() {
        if (versicherungssummeOderLeistung == null) {
            versicherungssummeOderLeistung = new ArrayList<CTVersicherungssummeOderLeistung>();
        }
        return this.versicherungssummeOderLeistung;
    }

    /**
     * Gets the value of the selbstbeteiligung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selbstbeteiligung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelbstbeteiligung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSelbstbeteiligung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTSelbstbeteiligung> getSelbstbeteiligung() {
        if (selbstbeteiligung == null) {
            selbstbeteiligung = new ArrayList<CTSelbstbeteiligung>();
        }
        return this.selbstbeteiligung;
    }

    /**
     * Gets the value of the klausel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the klausel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKlausel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKlausel }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTKlausel> getKlausel() {
        if (klausel == null) {
            klausel = new ArrayList<CTKlausel>();
        }
        return this.klausel;
    }

    /**
     * Gets the value of the bezugsrecht property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bezugsrecht property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBezugsrecht().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTBezugsrecht }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTBezugsrecht> getBezugsrecht() {
        if (bezugsrecht == null) {
            bezugsrecht = new ArrayList<CTBezugsrecht>();
        }
        return this.bezugsrecht;
    }

    /**
     * Gets the value of the leistungsausschluss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leistungsausschluss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeistungsausschluss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTLeistungsausschluss }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTLeistungsausschluss> getLeistungsausschluss() {
        if (leistungsausschluss == null) {
            leistungsausschluss = new ArrayList<CTLeistungsausschluss>();
        }
        return this.leistungsausschluss;
    }

    /**
     * Gets the value of the fondsPortfolio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fondsPortfolio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFondsPortfolio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTFondsPortfolio }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTFondsPortfolio> getFondsPortfolio() {
        if (fondsPortfolio == null) {
            fondsPortfolio = new ArrayList<CTFondsPortfolio>();
        }
        return this.fondsPortfolio;
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
        final CTElementarprodukt that = ((CTElementarprodukt) object);
        {
            List<CTVersicherungssummeOderLeistung> lhsVersicherungssummeOderLeistung;
            lhsVersicherungssummeOderLeistung = (((this.versicherungssummeOderLeistung!= null)&&(!this.versicherungssummeOderLeistung.isEmpty()))?this.getVersicherungssummeOderLeistung():null);
            List<CTVersicherungssummeOderLeistung> rhsVersicherungssummeOderLeistung;
            rhsVersicherungssummeOderLeistung = (((that.versicherungssummeOderLeistung!= null)&&(!that.versicherungssummeOderLeistung.isEmpty()))?that.getVersicherungssummeOderLeistung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versicherungssummeOderLeistung", lhsVersicherungssummeOderLeistung), LocatorUtils.property(thatLocator, "versicherungssummeOderLeistung", rhsVersicherungssummeOderLeistung), lhsVersicherungssummeOderLeistung, rhsVersicherungssummeOderLeistung, ((this.versicherungssummeOderLeistung!= null)&&(!this.versicherungssummeOderLeistung.isEmpty())), ((that.versicherungssummeOderLeistung!= null)&&(!that.versicherungssummeOderLeistung.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTSelbstbeteiligung> lhsSelbstbeteiligung;
            lhsSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
            List<CTSelbstbeteiligung> rhsSelbstbeteiligung;
            rhsSelbstbeteiligung = (((that.selbstbeteiligung!= null)&&(!that.selbstbeteiligung.isEmpty()))?that.getSelbstbeteiligung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selbstbeteiligung", lhsSelbstbeteiligung), LocatorUtils.property(thatLocator, "selbstbeteiligung", rhsSelbstbeteiligung), lhsSelbstbeteiligung, rhsSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())), ((that.selbstbeteiligung!= null)&&(!that.selbstbeteiligung.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTKlausel> lhsKlausel;
            lhsKlausel = (((this.klausel!= null)&&(!this.klausel.isEmpty()))?this.getKlausel():null);
            List<CTKlausel> rhsKlausel;
            rhsKlausel = (((that.klausel!= null)&&(!that.klausel.isEmpty()))?that.getKlausel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klausel", lhsKlausel), LocatorUtils.property(thatLocator, "klausel", rhsKlausel), lhsKlausel, rhsKlausel, ((this.klausel!= null)&&(!this.klausel.isEmpty())), ((that.klausel!= null)&&(!that.klausel.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTBezugsrecht> lhsBezugsrecht;
            lhsBezugsrecht = (((this.bezugsrecht!= null)&&(!this.bezugsrecht.isEmpty()))?this.getBezugsrecht():null);
            List<CTBezugsrecht> rhsBezugsrecht;
            rhsBezugsrecht = (((that.bezugsrecht!= null)&&(!that.bezugsrecht.isEmpty()))?that.getBezugsrecht():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezugsrecht", lhsBezugsrecht), LocatorUtils.property(thatLocator, "bezugsrecht", rhsBezugsrecht), lhsBezugsrecht, rhsBezugsrecht, ((this.bezugsrecht!= null)&&(!this.bezugsrecht.isEmpty())), ((that.bezugsrecht!= null)&&(!that.bezugsrecht.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTLeistungsausschluss> lhsLeistungsausschluss;
            lhsLeistungsausschluss = (((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty()))?this.getLeistungsausschluss():null);
            List<CTLeistungsausschluss> rhsLeistungsausschluss;
            rhsLeistungsausschluss = (((that.leistungsausschluss!= null)&&(!that.leistungsausschluss.isEmpty()))?that.getLeistungsausschluss():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leistungsausschluss", lhsLeistungsausschluss), LocatorUtils.property(thatLocator, "leistungsausschluss", rhsLeistungsausschluss), lhsLeistungsausschluss, rhsLeistungsausschluss, ((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty())), ((that.leistungsausschluss!= null)&&(!that.leistungsausschluss.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTFondsPortfolio> lhsFondsPortfolio;
            lhsFondsPortfolio = (((this.fondsPortfolio!= null)&&(!this.fondsPortfolio.isEmpty()))?this.getFondsPortfolio():null);
            List<CTFondsPortfolio> rhsFondsPortfolio;
            rhsFondsPortfolio = (((that.fondsPortfolio!= null)&&(!that.fondsPortfolio.isEmpty()))?that.getFondsPortfolio():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fondsPortfolio", lhsFondsPortfolio), LocatorUtils.property(thatLocator, "fondsPortfolio", rhsFondsPortfolio), lhsFondsPortfolio, rhsFondsPortfolio, ((this.fondsPortfolio!= null)&&(!this.fondsPortfolio.isEmpty())), ((that.fondsPortfolio!= null)&&(!that.fondsPortfolio.isEmpty())))) {
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
            List<CTVersicherungssummeOderLeistung> theVersicherungssummeOderLeistung;
            theVersicherungssummeOderLeistung = (((this.versicherungssummeOderLeistung!= null)&&(!this.versicherungssummeOderLeistung.isEmpty()))?this.getVersicherungssummeOderLeistung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versicherungssummeOderLeistung", theVersicherungssummeOderLeistung), currentHashCode, theVersicherungssummeOderLeistung, ((this.versicherungssummeOderLeistung!= null)&&(!this.versicherungssummeOderLeistung.isEmpty())));
        }
        {
            List<CTSelbstbeteiligung> theSelbstbeteiligung;
            theSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selbstbeteiligung", theSelbstbeteiligung), currentHashCode, theSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())));
        }
        {
            List<CTKlausel> theKlausel;
            theKlausel = (((this.klausel!= null)&&(!this.klausel.isEmpty()))?this.getKlausel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "klausel", theKlausel), currentHashCode, theKlausel, ((this.klausel!= null)&&(!this.klausel.isEmpty())));
        }
        {
            List<CTBezugsrecht> theBezugsrecht;
            theBezugsrecht = (((this.bezugsrecht!= null)&&(!this.bezugsrecht.isEmpty()))?this.getBezugsrecht():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezugsrecht", theBezugsrecht), currentHashCode, theBezugsrecht, ((this.bezugsrecht!= null)&&(!this.bezugsrecht.isEmpty())));
        }
        {
            List<CTLeistungsausschluss> theLeistungsausschluss;
            theLeistungsausschluss = (((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty()))?this.getLeistungsausschluss():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leistungsausschluss", theLeistungsausschluss), currentHashCode, theLeistungsausschluss, ((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty())));
        }
        {
            List<CTFondsPortfolio> theFondsPortfolio;
            theFondsPortfolio = (((this.fondsPortfolio!= null)&&(!this.fondsPortfolio.isEmpty()))?this.getFondsPortfolio():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fondsPortfolio", theFondsPortfolio), currentHashCode, theFondsPortfolio, ((this.fondsPortfolio!= null)&&(!this.fondsPortfolio.isEmpty())));
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
        if (target instanceof CTElementarprodukt) {
            final CTElementarprodukt copy = ((CTElementarprodukt) target);
            {
                Boolean versicherungssummeOderLeistungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.versicherungssummeOderLeistung!= null)&&(!this.versicherungssummeOderLeistung.isEmpty())));
                if (versicherungssummeOderLeistungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVersicherungssummeOderLeistung> sourceVersicherungssummeOderLeistung;
                    sourceVersicherungssummeOderLeistung = (((this.versicherungssummeOderLeistung!= null)&&(!this.versicherungssummeOderLeistung.isEmpty()))?this.getVersicherungssummeOderLeistung():null);
                    @SuppressWarnings("unchecked")
                    List<CTVersicherungssummeOderLeistung> copyVersicherungssummeOderLeistung = ((List<CTVersicherungssummeOderLeistung> ) strategy.copy(LocatorUtils.property(locator, "versicherungssummeOderLeistung", sourceVersicherungssummeOderLeistung), sourceVersicherungssummeOderLeistung, ((this.versicherungssummeOderLeistung!= null)&&(!this.versicherungssummeOderLeistung.isEmpty()))));
                    copy.versicherungssummeOderLeistung = null;
                    if (copyVersicherungssummeOderLeistung!= null) {
                        List<CTVersicherungssummeOderLeistung> uniqueVersicherungssummeOderLeistungl = copy.getVersicherungssummeOderLeistung();
                        uniqueVersicherungssummeOderLeistungl.addAll(copyVersicherungssummeOderLeistung);
                    }
                } else {
                    if (versicherungssummeOderLeistungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versicherungssummeOderLeistung = null;
                    }
                }
            }
            {
                Boolean selbstbeteiligungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty())));
                if (selbstbeteiligungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTSelbstbeteiligung> sourceSelbstbeteiligung;
                    sourceSelbstbeteiligung = (((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))?this.getSelbstbeteiligung():null);
                    @SuppressWarnings("unchecked")
                    List<CTSelbstbeteiligung> copySelbstbeteiligung = ((List<CTSelbstbeteiligung> ) strategy.copy(LocatorUtils.property(locator, "selbstbeteiligung", sourceSelbstbeteiligung), sourceSelbstbeteiligung, ((this.selbstbeteiligung!= null)&&(!this.selbstbeteiligung.isEmpty()))));
                    copy.selbstbeteiligung = null;
                    if (copySelbstbeteiligung!= null) {
                        List<CTSelbstbeteiligung> uniqueSelbstbeteiligungl = copy.getSelbstbeteiligung();
                        uniqueSelbstbeteiligungl.addAll(copySelbstbeteiligung);
                    }
                } else {
                    if (selbstbeteiligungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.selbstbeteiligung = null;
                    }
                }
            }
            {
                Boolean klauselShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.klausel!= null)&&(!this.klausel.isEmpty())));
                if (klauselShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTKlausel> sourceKlausel;
                    sourceKlausel = (((this.klausel!= null)&&(!this.klausel.isEmpty()))?this.getKlausel():null);
                    @SuppressWarnings("unchecked")
                    List<CTKlausel> copyKlausel = ((List<CTKlausel> ) strategy.copy(LocatorUtils.property(locator, "klausel", sourceKlausel), sourceKlausel, ((this.klausel!= null)&&(!this.klausel.isEmpty()))));
                    copy.klausel = null;
                    if (copyKlausel!= null) {
                        List<CTKlausel> uniqueKlausell = copy.getKlausel();
                        uniqueKlausell.addAll(copyKlausel);
                    }
                } else {
                    if (klauselShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.klausel = null;
                    }
                }
            }
            {
                Boolean bezugsrechtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bezugsrecht!= null)&&(!this.bezugsrecht.isEmpty())));
                if (bezugsrechtShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTBezugsrecht> sourceBezugsrecht;
                    sourceBezugsrecht = (((this.bezugsrecht!= null)&&(!this.bezugsrecht.isEmpty()))?this.getBezugsrecht():null);
                    @SuppressWarnings("unchecked")
                    List<CTBezugsrecht> copyBezugsrecht = ((List<CTBezugsrecht> ) strategy.copy(LocatorUtils.property(locator, "bezugsrecht", sourceBezugsrecht), sourceBezugsrecht, ((this.bezugsrecht!= null)&&(!this.bezugsrecht.isEmpty()))));
                    copy.bezugsrecht = null;
                    if (copyBezugsrecht!= null) {
                        List<CTBezugsrecht> uniqueBezugsrechtl = copy.getBezugsrecht();
                        uniqueBezugsrechtl.addAll(copyBezugsrecht);
                    }
                } else {
                    if (bezugsrechtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezugsrecht = null;
                    }
                }
            }
            {
                Boolean leistungsausschlussShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty())));
                if (leistungsausschlussShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTLeistungsausschluss> sourceLeistungsausschluss;
                    sourceLeistungsausschluss = (((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty()))?this.getLeistungsausschluss():null);
                    @SuppressWarnings("unchecked")
                    List<CTLeistungsausschluss> copyLeistungsausschluss = ((List<CTLeistungsausschluss> ) strategy.copy(LocatorUtils.property(locator, "leistungsausschluss", sourceLeistungsausschluss), sourceLeistungsausschluss, ((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty()))));
                    copy.leistungsausschluss = null;
                    if (copyLeistungsausschluss!= null) {
                        List<CTLeistungsausschluss> uniqueLeistungsausschlussl = copy.getLeistungsausschluss();
                        uniqueLeistungsausschlussl.addAll(copyLeistungsausschluss);
                    }
                } else {
                    if (leistungsausschlussShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leistungsausschluss = null;
                    }
                }
            }
            {
                Boolean fondsPortfolioShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fondsPortfolio!= null)&&(!this.fondsPortfolio.isEmpty())));
                if (fondsPortfolioShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTFondsPortfolio> sourceFondsPortfolio;
                    sourceFondsPortfolio = (((this.fondsPortfolio!= null)&&(!this.fondsPortfolio.isEmpty()))?this.getFondsPortfolio():null);
                    @SuppressWarnings("unchecked")
                    List<CTFondsPortfolio> copyFondsPortfolio = ((List<CTFondsPortfolio> ) strategy.copy(LocatorUtils.property(locator, "fondsPortfolio", sourceFondsPortfolio), sourceFondsPortfolio, ((this.fondsPortfolio!= null)&&(!this.fondsPortfolio.isEmpty()))));
                    copy.fondsPortfolio = null;
                    if (copyFondsPortfolio!= null) {
                        List<CTFondsPortfolio> uniqueFondsPortfoliol = copy.getFondsPortfolio();
                        uniqueFondsPortfoliol.addAll(copyFondsPortfolio);
                    }
                } else {
                    if (fondsPortfolioShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fondsPortfolio = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVersicherungssummeOderLeistung(CTVersicherungssummeOderLeistung... values) {
        if (values!= null) {
            for (CTVersicherungssummeOderLeistung value: values) {
                getVersicherungssummeOderLeistung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVersicherungssummeOderLeistung(Collection<CTVersicherungssummeOderLeistung> values) {
        if (values!= null) {
            getVersicherungssummeOderLeistung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withSelbstbeteiligung(CTSelbstbeteiligung... values) {
        if (values!= null) {
            for (CTSelbstbeteiligung value: values) {
                getSelbstbeteiligung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withSelbstbeteiligung(Collection<CTSelbstbeteiligung> values) {
        if (values!= null) {
            getSelbstbeteiligung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKlausel(CTKlausel... values) {
        if (values!= null) {
            for (CTKlausel value: values) {
                getKlausel().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKlausel(Collection<CTKlausel> values) {
        if (values!= null) {
            getKlausel().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBezugsrecht(CTBezugsrecht... values) {
        if (values!= null) {
            for (CTBezugsrecht value: values) {
                getBezugsrecht().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBezugsrecht(Collection<CTBezugsrecht> values) {
        if (values!= null) {
            getBezugsrecht().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withLeistungsausschluss(CTLeistungsausschluss... values) {
        if (values!= null) {
            for (CTLeistungsausschluss value: values) {
                getLeistungsausschluss().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withLeistungsausschluss(Collection<CTLeistungsausschluss> values) {
        if (values!= null) {
            getLeistungsausschluss().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withFondsPortfolio(CTFondsPortfolio... values) {
        if (values!= null) {
            for (CTFondsPortfolio value: values) {
                getFondsPortfolio().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withFondsPortfolio(Collection<CTFondsPortfolio> values) {
        if (values!= null) {
            getFondsPortfolio().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKennung(String value) {
        setKennung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withDynamik(CTDynamik... values) {
        if (values!= null) {
            for (CTDynamik value: values) {
                getDynamik().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withDynamik(Collection<CTDynamik> values) {
        if (values!= null) {
            getDynamik().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
