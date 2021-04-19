
package net.bipro.namespace.basis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTAdresse;
import net.bipro.namespace.allgemein.CTAktivitaet;
import net.bipro.namespace.allgemein.CTAktivitaetsrolle;
import net.bipro.namespace.allgemein.CTBerechnungsgrundlage;
import net.bipro.namespace.allgemein.CTDatei;
import net.bipro.namespace.allgemein.CTDevisenkurs;
import net.bipro.namespace.allgemein.CTDienstleister;
import net.bipro.namespace.allgemein.CTFreitext;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTGegenstandsrolle;
import net.bipro.namespace.allgemein.CTGeldwert;
import net.bipro.namespace.allgemein.CTGeoposition;
import net.bipro.namespace.allgemein.CTGroesse;
import net.bipro.namespace.allgemein.CTPartnernummer;
import net.bipro.namespace.allgemein.CTPruefsumme;
import net.bipro.namespace.allgemein.CTQuelle;
import net.bipro.namespace.allgemein.CTSchadennummer;
import net.bipro.namespace.allgemein.CTSteuer;
import net.bipro.namespace.allgemein.CTUnternehmen;
import net.bipro.namespace.allgemein.CTUnterschrift;
import net.bipro.namespace.allgemein.CTVermittler;
import net.bipro.namespace.allgemein.CTVermittlerrolle;
import net.bipro.namespace.allgemein.CTVertragsnummer;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.allgemein.CTZeitraum2;
import net.bipro.namespace.allgemein.CTZusaetzlicheGegenstandsdaten;
import net.bipro.namespace.fragen.CTAntwort;
import net.bipro.namespace.fragen.CTBedingung;
import net.bipro.namespace.fragen.CTElement;
import net.bipro.namespace.fragen.CTFragenkomplex;
import net.bipro.namespace.gevo.CTDokumentanforderung;
import net.bipro.namespace.gevo.CTDokumentinformation;
import net.bipro.namespace.gevo.CTDokumentversand;
import net.bipro.namespace.gevo.CTGeschaeftsvorgang;
import net.bipro.namespace.kapitalanlage.basis.CTInvestment;
import net.bipro.namespace.kapitalanlage.basis.CTKapitalanlage;
import net.bipro.namespace.kapitalanlage.basis.CTVereinbarung;
import net.bipro.namespace.kapitalanlage.basis.CTZusaetzlicheInvestmentDaten;
import net.bipro.namespace.nachrichten.CTMeldung;
import net.bipro.namespace.nachrichten.CTProzessAnfrage;
import net.bipro.namespace.nachrichten.CTProzessAntwort;
import net.bipro.namespace.nachrichten.CTProzessFehler;
import net.bipro.namespace.nachrichten.CTStatus;
import net.bipro.namespace.partner.CTAnzahlBeschaeftigte;
import net.bipro.namespace.partner.CTAusbildung;
import net.bipro.namespace.partner.CTAusweis;
import net.bipro.namespace.partner.CTBankverbindungBasis;
import net.bipro.namespace.partner.CTBerufstaetigkeit;
import net.bipro.namespace.partner.CTBesteuerung;
import net.bipro.namespace.partner.CTEinkommensart;
import net.bipro.namespace.partner.CTEinkommenssteuer;
import net.bipro.namespace.partner.CTFuehrerschein;
import net.bipro.namespace.partner.CTGesetzlicheKrankenversicherung;
import net.bipro.namespace.partner.CTGesundheitsdaten;
import net.bipro.namespace.partner.CTGruppenvertragspartner;
import net.bipro.namespace.partner.CTHaushalt;
import net.bipro.namespace.partner.CTKirchensteuer;
import net.bipro.namespace.partner.CTKommunikationsverbindung;
import net.bipro.namespace.partner.CTKreditkarte;
import net.bipro.namespace.partner.CTPartner;
import net.bipro.namespace.partner.CTPartnerrolle;
import net.bipro.namespace.partner.CTPersonengruppe;
import net.bipro.namespace.partner.CTPersonengruppenrolle;
import net.bipro.namespace.partner.CTSteuerbefreiung;
import net.bipro.namespace.partner.CTTeilzeit;
import net.bipro.namespace.partner.CTVermoegenswirksameLeistung;
import net.bipro.namespace.partner.CTWerbeerlaubnis;
import net.bipro.namespace.partner.CTZusaetzlichePartnerdaten;
import net.bipro.namespace.produktmodell.CTBeitrag;
import net.bipro.namespace.produktmodell.CTBeitragsfoerderung;
import net.bipro.namespace.produktmodell.CTDynamik;
import net.bipro.namespace.produktmodell.CTKondition;
import net.bipro.namespace.produktmodell.CTProduktbaustein;
import net.bipro.namespace.produktmodell.CTTeilbeitrag;
import net.bipro.namespace.produktmodell.CTZertifizierungsdaten;
import net.bipro.namespace.produktmodell.CTZusaetzlicheProduktbausteinDaten;
import net.bipro.namespace.sachen.CTGebaeudeSonderausstattung;
import net.bipro.namespace.sachen.CTKonstruktion;
import net.bipro.namespace.sachen.CTSanierung;
import net.bipro.namespace.sepa.CTNotifikation;
import net.bipro.namespace.versicherung.haftpflicht.CTBauherren;
import net.bipro.namespace.versicherung.haftpflicht.CTBetriebshaftpflicht;
import net.bipro.namespace.versicherung.haftpflicht.CTGewaesserschaden;
import net.bipro.namespace.versicherung.haftpflicht.CTHausUndGrundbesitzer;
import net.bipro.namespace.versicherung.haftpflicht.CTJagd;
import net.bipro.namespace.versicherung.haftpflicht.CTPrivat;
import net.bipro.namespace.versicherung.haftpflicht.CTTierhalter;
import net.bipro.namespace.versicherung.haftpflicht.CTUmweltbasis;
import net.bipro.namespace.versicherung.haftpflicht.CTUmweltschaden;
import net.bipro.namespace.versicherung.haftpflicht.CTVermoegensschaden;
import net.bipro.namespace.versicherung.haftpflicht.CTWassersport;
import net.bipro.namespace.versicherung.produktmodell.CTBezugsrecht;
import net.bipro.namespace.versicherung.produktmodell.CTFondsPortfolio;
import net.bipro.namespace.versicherung.produktmodell.CTKlausel;
import net.bipro.namespace.versicherung.produktmodell.CTLeistungsausschluss;
import net.bipro.namespace.versicherung.produktmodell.CTSelbstbeteiligung;
import net.bipro.namespace.versicherung.produktmodell.CTVersicherungsbestaetigung;
import net.bipro.namespace.versicherung.produktmodell.CTVersicherungssummeOderLeistung;
import net.bipro.namespace.versicherung.produktmodell.CTVorschaden;
import net.bipro.namespace.versicherung.produktmodell.komposit.CTGefahr;
import net.bipro.namespace.versicherung.produktmodell.komposit.CTGefahrenzone;
import net.bipro.namespace.versicherung.produktmodell.komposit.CTUnfallversicherungJe;
import net.bipro.namespace.versicherung.sach.CTAufbewahrungsart;
import net.bipro.namespace.versicherung.sach.CTMangel;
import net.bipro.namespace.versicherung.sach.CTSicherung;
import net.bipro.namespace.versicherung.tarifierung.CTZusaetzlicheAntragsdaten;
import net.bipro.namespace.vertrag.CTVertrag;
import net.bipro.namespace.vertrag.CTZusaetzlicheVertragsdaten;
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
 * Master-Objekt. Von diesem Datentypen werden alle anderen komplexen Datentypen der BiPRO direkt oder indirekt abgeleitet.
 * 
 * <p>Java class for CT_Objekt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Objekt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Erweiterung" type="{http://www.bipro.net/namespace/basis}CT_Erweiterung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Objekt", propOrder = {
    "erweiterung"
})
@XmlSeeAlso({
    CTStatus.class,
    CTMeldung.class,
    CTNotifikation.class,
    CTBeitragsfoerderung.class,
    CTDynamik.class,
    CTBeitrag.class,
    CTTeilbeitrag.class,
    CTZertifizierungsdaten.class,
    CTZusaetzlicheProduktbausteinDaten.class,
    CTBezugsrecht.class,
    CTFondsPortfolio.class,
    CTKlausel.class,
    CTLeistungsausschluss.class,
    CTSelbstbeteiligung.class,
    CTVersicherungsbestaetigung.class,
    CTVersicherungssummeOderLeistung.class,
    CTVorschaden.class,
    CTBauherren.class,
    CTBetriebshaftpflicht.class,
    CTGewaesserschaden.class,
    CTHausUndGrundbesitzer.class,
    CTJagd.class,
    CTPrivat.class,
    CTTierhalter.class,
    CTUmweltbasis.class,
    CTUmweltschaden.class,
    CTVermoegensschaden.class,
    CTWassersport.class,
    CTGefahr.class,
    CTGefahrenzone.class,
    CTKondition.class,
    CTProduktbaustein.class,
    CTUnfallversicherungJe.class,
    CTGebaeudeSonderausstattung.class,
    CTKonstruktion.class,
    CTSanierung.class,
    CTAntwort.class,
    CTFragenkomplex.class,
    CTElement.class,
    CTBedingung.class,
    CTDokumentanforderung.class,
    CTDokumentinformation.class,
    CTDokumentversand.class,
    CTAktivitaet.class,
    CTAktivitaetsrolle.class,
    CTBerechnungsgrundlage.class,
    CTDatei.class,
    CTDevisenkurs.class,
    CTDienstleister.class,
    CTFreitext.class,
    CTGegenstand.class,
    CTGegenstandsrolle.class,
    CTGeoposition.class,
    CTGroesse.class,
    CTPartnernummer.class,
    CTPruefsumme.class,
    CTQuelle.class,
    CTSchadennummer.class,
    CTSteuer.class,
    CTUnternehmen.class,
    CTUnterschrift.class,
    CTVermittler.class,
    CTVermittlerrolle.class,
    CTVertragsnummer.class,
    CTZeitraum.class,
    CTZeitraum2 .class,
    CTAnzahlBeschaeftigte.class,
    CTAusbildung.class,
    CTAusweis.class,
    CTBerufstaetigkeit.class,
    CTBesteuerung.class,
    CTEinkommensart.class,
    CTEinkommenssteuer.class,
    CTFuehrerschein.class,
    CTGesetzlicheKrankenversicherung.class,
    CTGesundheitsdaten.class,
    CTGruppenvertragspartner.class,
    CTHaushalt.class,
    CTBankverbindungBasis.class,
    CTKirchensteuer.class,
    CTKommunikationsverbindung.class,
    CTKreditkarte.class,
    CTAdresse.class,
    CTPartner.class,
    CTPersonengruppe.class,
    CTPersonengruppenrolle.class,
    CTSteuerbefreiung.class,
    CTTeilzeit.class,
    CTVermoegenswirksameLeistung.class,
    CTWerbeerlaubnis.class,
    CTZusaetzlichePartnerdaten.class,
    CTAufbewahrungsart.class,
    CTZusaetzlicheGegenstandsdaten.class,
    CTMangel.class,
    CTSicherung.class,
    CTVertrag.class,
    CTZusaetzlicheVertragsdaten.class,
    CTPartnerrolle.class,
    CTInvestment.class,
    CTKapitalanlage.class,
    CTVereinbarung.class,
    CTGeldwert.class,
    CTZusaetzlicheInvestmentDaten.class,
    CTProzessAnfrage.class,
    CTProzessAntwort.class,
    CTGeschaeftsvorgang.class,
    CTZusaetzlicheAntragsdaten.class,
    CTProzessFehler.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTObjekt implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Erweiterung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTErweiterung> erweiterung;

    /**
     * Gets the value of the erweiterung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erweiterung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErweiterung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTErweiterung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTErweiterung> getErweiterung() {
        if (erweiterung == null) {
            erweiterung = new ArrayList<CTErweiterung>();
        }
        return this.erweiterung;
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
        final CTObjekt that = ((CTObjekt) object);
        {
            List<CTErweiterung> lhsErweiterung;
            lhsErweiterung = (((this.erweiterung!= null)&&(!this.erweiterung.isEmpty()))?this.getErweiterung():null);
            List<CTErweiterung> rhsErweiterung;
            rhsErweiterung = (((that.erweiterung!= null)&&(!that.erweiterung.isEmpty()))?that.getErweiterung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "erweiterung", lhsErweiterung), LocatorUtils.property(thatLocator, "erweiterung", rhsErweiterung), lhsErweiterung, rhsErweiterung, ((this.erweiterung!= null)&&(!this.erweiterung.isEmpty())), ((that.erweiterung!= null)&&(!that.erweiterung.isEmpty())))) {
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
        int currentHashCode = 1;
        {
            List<CTErweiterung> theErweiterung;
            theErweiterung = (((this.erweiterung!= null)&&(!this.erweiterung.isEmpty()))?this.getErweiterung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "erweiterung", theErweiterung), currentHashCode, theErweiterung, ((this.erweiterung!= null)&&(!this.erweiterung.isEmpty())));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof CTObjekt) {
            final CTObjekt copy = ((CTObjekt) target);
            {
                Boolean erweiterungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.erweiterung!= null)&&(!this.erweiterung.isEmpty())));
                if (erweiterungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTErweiterung> sourceErweiterung;
                    sourceErweiterung = (((this.erweiterung!= null)&&(!this.erweiterung.isEmpty()))?this.getErweiterung():null);
                    @SuppressWarnings("unchecked")
                    List<CTErweiterung> copyErweiterung = ((List<CTErweiterung> ) strategy.copy(LocatorUtils.property(locator, "erweiterung", sourceErweiterung), sourceErweiterung, ((this.erweiterung!= null)&&(!this.erweiterung.isEmpty()))));
                    copy.erweiterung = null;
                    if (copyErweiterung!= null) {
                        List<CTErweiterung> uniqueErweiterungl = copy.getErweiterung();
                        uniqueErweiterungl.addAll(copyErweiterung);
                    }
                } else {
                    if (erweiterungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.erweiterung = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTObjekt withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTObjekt withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
