
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
import net.bipro.namespace.datentypen.STBesondererVerwendungszweck;
import net.bipro.namespace.datentypen.STEBedingungen;
import net.bipro.namespace.datentypen.STEPaket;
import net.bipro.namespace.datentypen.STSparte;
import net.bipro.namespace.datentypen.STVertragsform;
import net.bipro.namespace.datentypen.STVertragsstatus;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTBeitragszahler;
import net.bipro.namespace.produktmodell.CTBeitrag;
import net.bipro.namespace.produktmodell.CTDynamik;
import net.bipro.namespace.produktmodell.CTElementarprodukt;
import net.bipro.namespace.produktmodell.CTKondition;
import net.bipro.namespace.produktmodell.CTZertifizierungsdaten;
import net.bipro.namespace.produktmodell.CTZusaetzlicheProduktbausteinDaten;
import net.bipro.namespace.versicherung.produktmodell.komposit.CTSUHVersicherung;
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
 * <p>Java class for CT_Produkt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Produkt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/produktmodell}CT_Produkt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Leistungsausschluss" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Leistungsausschluss" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VersicherungssummeOderLeistung" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_VersicherungssummeOderLeistung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Selbstbeteiligung" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Selbstbeteiligung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Klausel" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Klausel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Produkt", propOrder = {
    "leistungsausschluss",
    "versicherungssummeOderLeistung", //SumInsured
    "selbstbeteiligung", //deductible
    "klausel"
})
@XmlSeeAlso({
    CTSUHVersicherung.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTProdukt
    extends net.bipro.namespace.produktmodell.CTProdukt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Leistungsausschluss")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTLeistungsausschluss> leistungsausschluss;
    @XmlElement(name = "VersicherungssummeOderLeistung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVersicherungssummeOderLeistung> versicherungssummeOderLeistung;
    @XmlElement(name = "Selbstbeteiligung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTSelbstbeteiligung> selbstbeteiligung;
    @XmlElement(name = "Klausel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTKlausel> klausel;

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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTLeistungsausschluss> getLeistungsausschluss() {
        if (leistungsausschluss == null) {
            leistungsausschluss = new ArrayList<CTLeistungsausschluss>();
        }
        return this.leistungsausschluss;
    }

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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTKlausel> getKlausel() {
        if (klausel == null) {
            klausel = new ArrayList<CTKlausel>();
        }
        return this.klausel;
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
        final CTProdukt that = ((CTProdukt) object);
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
            List<CTLeistungsausschluss> theLeistungsausschluss;
            theLeistungsausschluss = (((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty()))?this.getLeistungsausschluss():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leistungsausschluss", theLeistungsausschluss), currentHashCode, theLeistungsausschluss, ((this.leistungsausschluss!= null)&&(!this.leistungsausschluss.isEmpty())));
        }
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
        if (draftCopy instanceof CTProdukt) {
            final CTProdukt copy = ((CTProdukt) draftCopy);
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
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTProdukt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withLeistungsausschluss(CTLeistungsausschluss... values) {
        if (values!= null) {
            for (CTLeistungsausschluss value: values) {
                getLeistungsausschluss().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withLeistungsausschluss(Collection<CTLeistungsausschluss> values) {
        if (values!= null) {
            getLeistungsausschluss().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVersicherungssummeOderLeistung(CTVersicherungssummeOderLeistung... values) {
        if (values!= null) {
            for (CTVersicherungssummeOderLeistung value: values) {
                getVersicherungssummeOderLeistung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVersicherungssummeOderLeistung(Collection<CTVersicherungssummeOderLeistung> values) {
        if (values!= null) {
            getVersicherungssummeOderLeistung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withSelbstbeteiligung(CTSelbstbeteiligung... values) {
        if (values!= null) {
            for (CTSelbstbeteiligung value: values) {
                getSelbstbeteiligung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withSelbstbeteiligung(Collection<CTSelbstbeteiligung> values) {
        if (values!= null) {
            getSelbstbeteiligung().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKlausel(CTKlausel... values) {
        if (values!= null) {
            for (CTKlausel value: values) {
                getKlausel().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKlausel(Collection<CTKlausel> values) {
        if (values!= null) {
            getKlausel().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withSparte(STSparte value) {
        setSparte(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withPaket(STEPaket... values) {
        if (values!= null) {
            for (STEPaket value: values) {
                getPaket().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withPaket(Collection<STEPaket> values) {
        if (values!= null) {
            getPaket().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKennung(String value) {
        setKennung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withElementarprodukt(CTElementarprodukt... values) {
        if (values!= null) {
            for (CTElementarprodukt value: values) {
                getElementarprodukt().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withElementarprodukt(Collection<CTElementarprodukt> values) {
        if (values!= null) {
            getElementarprodukt().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withDynamik(CTDynamik... values) {
        if (values!= null) {
            for (CTDynamik value: values) {
                getDynamik().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withDynamik(Collection<CTDynamik> values) {
        if (values!= null) {
            getDynamik().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKuendigungsklausel(Boolean value) {
        setKuendigungsklausel(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBesondererVerwendungszweck(STBesondererVerwendungszweck value) {
        setBesondererVerwendungszweck(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
