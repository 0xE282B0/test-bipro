
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_DokumentartID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_DokumentartID"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A-Bescheinigung"/&gt;
 *     &lt;enumeration value="Ablehnungsschreiben"/&gt;
 *     &lt;enumeration value="Abnahmebestaetigung"/&gt;
 *     &lt;enumeration value="Abrechnung"/&gt;
 *     &lt;enumeration value="Abtretungserklaerung"/&gt;
 *     &lt;enumeration value="Aenderungsantrag"/&gt;
 *     &lt;enumeration value="Angebot"/&gt;
 *     &lt;enumeration value="Angebotsanforderung"/&gt;
 *     &lt;enumeration value="Annahmebestaetigung"/&gt;
 *     &lt;enumeration value="Anschaffungsbeleg"/&gt;
 *     &lt;enumeration value="Anschreiben"/&gt;
 *     &lt;enumeration value="Anschuldigungsschrift"/&gt;
 *     &lt;enumeration value="Antrag"/&gt;
 *     &lt;enumeration value="AntragAufZahlungAVWL"/&gt;
 *     &lt;enumeration value="AntragFondswechsel"/&gt;
 *     &lt;enumeration value="AntragVVG"/&gt;
 *     &lt;enumeration value="AntragZuzahlung"/&gt;
 *     &lt;enumeration value="Arbeitsnachweis"/&gt;
 *     &lt;enumeration value="Arztbericht"/&gt;
 *     &lt;enumeration value="Attest"/&gt;
 *     &lt;enumeration value="Auftrag"/&gt;
 *     &lt;enumeration value="AussergerichtlicheKorrespondenz"/&gt;
 *     &lt;enumeration value="AVB"/&gt;
 *     &lt;enumeration value="AZV-Belehrung"/&gt;
 *     &lt;enumeration value="B-Bescheinigung"/&gt;
 *     &lt;enumeration value="bAVUebertrag"/&gt;
 *     &lt;enumeration value="BeitragsbescheinigungFuerFinanzamt"/&gt;
 *     &lt;enumeration value="Beratungsprotokoll"/&gt;
 *     &lt;enumeration value="Berufung"/&gt;
 *     &lt;enumeration value="BescheinigungAblaufleistung"/&gt;
 *     &lt;enumeration value="BescheinigungBeitraegeBisRueckkauf"/&gt;
 *     &lt;enumeration value="BescheinigungFuerArbeitsagentur"/&gt;
 *     &lt;enumeration value="BescheinigungFuerBAfoeGAmt"/&gt;
 *     &lt;enumeration value="BescheinigungFuerSozialamt"/&gt;
 *     &lt;enumeration value="BescheinigungRueckkaufswert"/&gt;
 *     &lt;enumeration value="BescheinigungSteuerschaedlicheVerwendungRiester"/&gt;
 *     &lt;enumeration value="BesondereBedingungen"/&gt;
 *     &lt;enumeration value="Beweisbeschluss"/&gt;
 *     &lt;enumeration value="Datenschutzerklaerung"/&gt;
 *     &lt;enumeration value="Deckungsnote"/&gt;
 *     &lt;enumeration value="EigenerSchriftsatz"/&gt;
 *     &lt;enumeration value="Eingangsbestaetigung"/&gt;
 *     &lt;enumeration value="EinwilligungZurUebermittlungBeiBeamten"/&gt;
 *     &lt;enumeration value="EmpfangsbestaetigungVVGDokumente"/&gt;
 *     &lt;enumeration value="EntnahmeAntrag"/&gt;
 *     &lt;enumeration value="Erinnerung"/&gt;
 *     &lt;enumeration value="Ermittlungsakte"/&gt;
 *     &lt;enumeration value="Ersatzpolice"/&gt;
 *     &lt;enumeration value="Ersatzsteuerbescheinigung"/&gt;
 *     &lt;enumeration value="EWSEE"/&gt;
 *     &lt;enumeration value="Fahrzeugbewertung"/&gt;
 *     &lt;enumeration value="FATCA"/&gt;
 *     &lt;enumeration value="FestsetzungsantragZulagen"/&gt;
 *     &lt;enumeration value="Fondsuebersicht"/&gt;
 *     &lt;enumeration value="Forderungsschreiben"/&gt;
 *     &lt;enumeration value="Foto"/&gt;
 *     &lt;enumeration value="Fragebogen"/&gt;
 *     &lt;enumeration value="Freistellungsauftrag"/&gt;
 *     &lt;enumeration value="Freistellungsbescheinigung"/&gt;
 *     &lt;enumeration value="Fuehrerscheinkopie"/&gt;
 *     &lt;enumeration value="GerichtlicheVerfuegung"/&gt;
 *     &lt;enumeration value="Gutachten"/&gt;
 *     &lt;enumeration value="Handlungsanweisung"/&gt;
 *     &lt;enumeration value="Identifikation"/&gt;
 *     &lt;enumeration value="InfoMeldungAnZfA"/&gt;
 *     &lt;enumeration value="InternesDokumentFuerVermittler"/&gt;
 *     &lt;enumeration value="Jahressteuerbescheinigung"/&gt;
 *     &lt;enumeration value="JahresbescheinigungBasisRente"/&gt;
 *     &lt;enumeration value="JahresbescheinigungRiester"/&gt;
 *     &lt;enumeration value="Jahresinformation"/&gt;
 *     &lt;enumeration value="Klage"/&gt;
 *     &lt;enumeration value="Klauseln"/&gt;
 *     &lt;enumeration value="Kompaktvorschlag"/&gt;
 *     &lt;enumeration value="Kostenuebernahmeerklaerung"/&gt;
 *     &lt;enumeration value="Kostenvoranschlag"/&gt;
 *     &lt;enumeration value="Messprotokoll"/&gt;
 *     &lt;enumeration value="Nachtrag"/&gt;
 *     &lt;enumeration value="Nachversichererbescheinigung"/&gt;
 *     &lt;enumeration value="PiB"/&gt;
 *     &lt;enumeration value="PiBVI"/&gt;
 *     &lt;enumeration value="Police"/&gt;
 *     &lt;enumeration value="Prospekt"/&gt;
 *     &lt;enumeration value="Protokoll"/&gt;
 *     &lt;enumeration value="Pruefbericht"/&gt;
 *     &lt;enumeration value="PruefungGWG"/&gt;
 *     &lt;enumeration value="Rechnung"/&gt;
 *     &lt;enumeration value="Reparaturbestaetigung"/&gt;
 *     &lt;enumeration value="RiesterwechselFormular"/&gt;
 *     &lt;enumeration value="Risikoanalyse"/&gt;
 *     &lt;enumeration value="Risikofragebogen"/&gt;
 *     &lt;enumeration value="RuecknahmeAenderung"/&gt;
 *     &lt;enumeration value="Schadenerledigung"/&gt;
 *     &lt;enumeration value="Schadenmeldung"/&gt;
 *     &lt;enumeration value="SchriftsatzDerGegenseite"/&gt;
 *     &lt;enumeration value="SEPAMandatAntrag"/&gt;
 *     &lt;enumeration value="SEPAMandatKopie"/&gt;
 *     &lt;enumeration value="SEPANotifikation"/&gt;
 *     &lt;enumeration value="Sicherungsschein"/&gt;
 *     &lt;enumeration value="SFR-Uebertragungsformular"/&gt;
 *     &lt;enumeration value="SonstigesDokument"/&gt;
 *     &lt;enumeration value="Stehlgutliste"/&gt;
 *     &lt;enumeration value="UnterlagenZurSchadenhoehe"/&gt;
 *     &lt;enumeration value="Unterschriftenblatt"/&gt;
 *     &lt;enumeration value="Urteil"/&gt;
 *     &lt;enumeration value="Vergleich"/&gt;
 *     &lt;enumeration value="Verlustbescheinigung"/&gt;
 *     &lt;enumeration value="Verlusterklaerung"/&gt;
 *     &lt;enumeration value="Versicherungsbestaetigung"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungEinfachHaftpflicht"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungEinfachSach"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungEinfachTransport"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungEinfachTV"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungErweitertHaftpflicht"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungErweitertTransport"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungIndividuellHaftpflicht"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungIndividuellSach"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungIndividuellTransport"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungPflichtversicherungHaftpflicht"/&gt;
 *     &lt;enumeration value="VersicherungsbestaetigungPflichtversicherungTransport"/&gt;
 *     &lt;enumeration value="VersorgungsausgleichInformation"/&gt;
 *     &lt;enumeration value="Vertrag"/&gt;
 *     &lt;enumeration value="Verwertungsausschluss"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="Video"/&gt;
 *     &lt;enumeration value="Vollmacht"/&gt;
 *     &lt;enumeration value="VollstreckbarerTitel"/&gt;
 *     &lt;enumeration value="Vorladung"/&gt;
 *     &lt;enumeration value="VorlaeufigeDeckung"/&gt;
 *     &lt;enumeration value="Vorschlag"/&gt;
 *     &lt;enumeration value="VorschlagVVG"/&gt;
 *     &lt;enumeration value="VZR-Bescheinigung"/&gt;
 *     &lt;enumeration value="WechselVertragspartner"/&gt;
 *     &lt;enumeration value="Widerrufsbelehrung"/&gt;
 *     &lt;enumeration value="Zahlungsbestaetigung"/&gt;
 *     &lt;enumeration value="Zeugenbericht"/&gt;
 *     &lt;enumeration value="Zulagenantrag"/&gt;
 *     &lt;enumeration value="Zulassungsbescheinigung"/&gt;
 *     &lt;enumeration value="Zweitschrift"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_DokumentartID")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public enum STDokumentartID {


    /**
     * Agrarier-Bescheinigung
     * 
     */
    @XmlEnumValue("A-Bescheinigung")
    A_BESCHEINIGUNG("A-Bescheinigung"),
    @XmlEnumValue("Ablehnungsschreiben")
    ABLEHNUNGSSCHREIBEN("Ablehnungsschreiben"),
    @XmlEnumValue("Abnahmebestaetigung")
    ABNAHMEBESTAETIGUNG("Abnahmebestaetigung"),

    /**
     * Kennzeichnet Abrechnungsdokumente
     * 
     */
    @XmlEnumValue("Abrechnung")
    ABRECHNUNG("Abrechnung"),
    @XmlEnumValue("Abtretungserklaerung")
    ABTRETUNGSERKLAERUNG("Abtretungserklaerung"),

    /**
     * Antrag eines Service Consumers zur ??nderung von Informationen (z.B. zu einem Partner oder Vertrag) beim Service Provider.
     * 
     */
    @XmlEnumValue("Aenderungsantrag")
    AENDERUNGSANTRAG("Aenderungsantrag"),
    @XmlEnumValue("Angebot")
    ANGEBOT("Angebot"),

    /**
     * Angebotsanforderung=Formular f??r die Aufforderung zur Abgabe eines verbindlichen Angebotes im Sinne des Invitatiomodells
     * 
     */
    @XmlEnumValue("Angebotsanforderung")
    ANGEBOTSANFORDERUNG("Angebotsanforderung"),
    @XmlEnumValue("Annahmebestaetigung")
    ANNAHMEBESTAETIGUNG("Annahmebestaetigung"),
    @XmlEnumValue("Anschaffungsbeleg")
    ANSCHAFFUNGSBELEG("Anschaffungsbeleg"),
    @XmlEnumValue("Anschreiben")
    ANSCHREIBEN("Anschreiben"),
    @XmlEnumValue("Anschuldigungsschrift")
    ANSCHULDIGUNGSSCHRIFT("Anschuldigungsschrift"),

    /**
     * Versicherungsantrag ohne der nach VVG und VVG-Infoverordnung relevanten Informationen sowie ohne den Allgemeinen und Besonderen Bedingungen und Klauseln
     * 
     */
    @XmlEnumValue("Antrag")
    ANTRAG("Antrag"),

    /**
     * Antrag auf Zahlung AVWL
     * 
     */
    @XmlEnumValue("AntragAufZahlungAVWL")
    ANTRAG_AUF_ZAHLUNG_AVWL("AntragAufZahlungAVWL"),

    /**
     * Antragsformular f??r einen Fondswechsel.
     * 
     */
    @XmlEnumValue("AntragFondswechsel")
    ANTRAG_FONDSWECHSEL("AntragFondswechsel"),

    /**
     * VVG-konformer Versicherungsantrag inkl. der nach VVG und VVG-Infoverordnung relevanten Informationen sowie den Allgemeinen und Besonderen edingungen inkl. Klauseln
     * 
     */
    @XmlEnumValue("AntragVVG")
    ANTRAG_VVG("AntragVVG"),

    /**
     * Formular f??r die Zuzahlung zu einem bestehenden Vertrag
     * 
     */
    @XmlEnumValue("AntragZuzahlung")
    ANTRAG_ZUZAHLUNG("AntragZuzahlung"),
    @XmlEnumValue("Arbeitsnachweis")
    ARBEITSNACHWEIS("Arbeitsnachweis"),
    @XmlEnumValue("Arztbericht")
    ARZTBERICHT("Arztbericht"),
    @XmlEnumValue("Attest")
    ATTEST("Attest"),
    @XmlEnumValue("Auftrag")
    AUFTRAG("Auftrag"),

    /**
     * AussergerichtlicheKorrespondenz
     * 
     */
    @XmlEnumValue("AussergerichtlicheKorrespondenz")
    AUSSERGERICHTLICHE_KORRESPONDENZ("AussergerichtlicheKorrespondenz"),
    AVB("AVB"),

    /**
     * Anzeigepflichtverletzung-Belehrung
     * 
     */
    @XmlEnumValue("AZV-Belehrung")
    AZV_BELEHRUNG("AZV-Belehrung"),

    /**
     * Beamten-Bescheinigung
     * 
     */
    @XmlEnumValue("B-Bescheinigung")
    B_BESCHEINIGUNG("B-Bescheinigung"),

    /**
     * Formular f??r die ??bertragung einer bAV im Rahmen des ??bertragungsabkommens (bAV)
     * 
     */
    @XmlEnumValue("bAVUebertrag")
    B_AV_UEBERTRAG("bAVUebertrag"),

    /**
     * Beitragsbescheinigung nach Norm ??? Vorschrift Finanzamt
     * 
     */
    @XmlEnumValue("BeitragsbescheinigungFuerFinanzamt")
    BEITRAGSBESCHEINIGUNG_FUER_FINANZAMT("BeitragsbescheinigungFuerFinanzamt"),

    /**
     * Dokument, dass die Beratung protokolliert.
     * 
     */
    @XmlEnumValue("Beratungsprotokoll")
    BERATUNGSPROTOKOLL("Beratungsprotokoll"),
    @XmlEnumValue("Berufung")
    BERUFUNG("Berufung"),

    /**
     * Bescheinigung ??ber die Ablaufleistung des Vertrags. M??gliche Inhalte: garantierte Werte (Kapital oder Rente), Werte inklusive angenommener ??berschussbeteiligung, Werte zu Beginn der Abrufphase (Tarife mit Abrufoption), Hochrechnung mit gleichm????iger Wertsteigerung (Investment), Hochrechnung inklusive ??bersch??sse (Riester).
     * 
     */
    @XmlEnumValue("BescheinigungAblaufleistung")
    BESCHEINIGUNG_ABLAUFLEISTUNG("BescheinigungAblaufleistung"),

    /**
     * Bescheinigung ??ber die bis zum R??ckkauf eingezahlten Beitr??ge gem???? ?? 20 Abs. 2 Nr. 6 EStG
     * 
     */
    @XmlEnumValue("BescheinigungBeitraegeBisRueckkauf")
    BESCHEINIGUNG_BEITRAEGE_BIS_RUECKKAUF("BescheinigungBeitraegeBisRueckkauf"),

    /**
     * Information f??r die Agentur f??r Arbeit (Jobcenter) ??ber Vertragswert (R??ckkaufswert), eingezahlte Beitr??ge, Beginn und Ablauf/ Rentenbeginn, Ablauf Beitragszahlung, aktueller Beitrag, beitragsfreie Summe gem???? ?? 60 SGB II.
     * 
     */
    @XmlEnumValue("BescheinigungFuerArbeitsagentur")
    BESCHEINIGUNG_FUER_ARBEITSAGENTUR("BescheinigungFuerArbeitsagentur"),

    /**
     * Bescheinigung zur Vorlage beim Amt f??r Ausbildungsf??rderung. M??gliche Inhalte: Altersvorsorgebeitrag, R??ckkaufswert, Rentenleistungen und Art und Umfang der Krankenversicherung.
     * 
     */
    @XmlEnumValue("BescheinigungFuerBAfoeGAmt")
    BESCHEINIGUNG_FUER_B_AFOE_G_AMT("BescheinigungFuerBAfoeGAmt"),

    /**
     * Bescheinigung zur Vorlage beim Sozialamt: M??gliche Inhalte: Altersvorsorgebeitrag, R??ckkaufswert und Rentenleistungen.
     * 
     */
    @XmlEnumValue("BescheinigungFuerSozialamt")
    BESCHEINIGUNG_FUER_SOZIALAMT("BescheinigungFuerSozialamt"),

    /**
     * Bescheinigung ??ber den R??ckkaufswert des Vertrags zum angegebenen Stichtag. M??gliche Inhalte: garantierter R??ckkaufswert, ??bersch??sse, Mindestbeteiligung an den Bewertungsreserven, Kapitalertragssteuer (inkl. Soli).
     * 
     */
    @XmlEnumValue("BescheinigungRueckkaufswert")
    BESCHEINIGUNG_RUECKKAUFSWERT("BescheinigungRueckkaufswert"),

    /**
     * Bescheinigung ??ber die einbehaltenen und abgef??hrten Betr??ge im Rahmen einer steuersch??dlichen Verwendung von Riester gem???? ?? 94 Abs. 1 Satz 4 und ?? 95 Abs. 1 EStG.
     * 
     */
    @XmlEnumValue("BescheinigungSteuerschaedlicheVerwendungRiester")
    BESCHEINIGUNG_STEUERSCHAEDLICHE_VERWENDUNG_RIESTER("BescheinigungSteuerschaedlicheVerwendungRiester"),

    /**
     * Kontextspezifische Bedingungen, die ??ber die allgemeinen Vertragsbedingungen hinaus gehen.
     * 
     */
    @XmlEnumValue("BesondereBedingungen")
    BESONDERE_BEDINGUNGEN("BesondereBedingungen"),
    @XmlEnumValue("Beweisbeschluss")
    BEWEISBESCHLUSS("Beweisbeschluss"),

    /**
     * Bestimmungen zur Speicherung und Verarbeitung sowie der Weitergabe von Daten gem gesetzlichen Datenschutzgesetz
     * 
     */
    @XmlEnumValue("Datenschutzerklaerung")
    DATENSCHUTZERKLAERUNG("Datenschutzerklaerung"),
    @XmlEnumValue("Deckungsnote")
    DECKUNGSNOTE("Deckungsnote"),
    @XmlEnumValue("EigenerSchriftsatz")
    EIGENER_SCHRIFTSATZ("EigenerSchriftsatz"),

    /**
     * Best??tigung durch den Service Provider, dass der Request von Service Consumer fehlerfrei empfangen wurde.
     * 
     */
    @XmlEnumValue("Eingangsbestaetigung")
    EINGANGSBESTAETIGUNG("Eingangsbestaetigung"),

    /**
     * Einwilligung zur ??bermittlung bei Beamten.
     * 
     */
    @XmlEnumValue("EinwilligungZurUebermittlungBeiBeamten")
    EINWILLIGUNG_ZUR_UEBERMITTLUNG_BEI_BEAMTEN("EinwilligungZurUebermittlungBeiBeamten"),
    @XmlEnumValue("EmpfangsbestaetigungVVGDokumente")
    EMPFANGSBESTAETIGUNG_VVG_DOKUMENTE("EmpfangsbestaetigungVVGDokumente"),

    /**
     * Antrag ??ber die Entnahme von Fonds aus dem Vertrag, die zu einem bestimmten Stichtag verkauft werden.
     * 
     */
    @XmlEnumValue("EntnahmeAntrag")
    ENTNAHME_ANTRAG("EntnahmeAntrag"),
    @XmlEnumValue("Erinnerung")
    ERINNERUNG("Erinnerung"),
    @XmlEnumValue("Ermittlungsakte")
    ERMITTLUNGSAKTE("Ermittlungsakte"),

    /**
     * Neue Police, d.h. neue Inhaberurkunde
     * 
     */
    @XmlEnumValue("Ersatzpolice")
    ERSATZPOLICE("Ersatzpolice"),

    /**
     * Ersatzbescheinigung ??ber die Kapitalertr??ge und die daf??r bereits abgef??hrten Steuern eines Kalenderjahres gem???? ?? 45a Abs. 5 EStG
     * 
     */
    @XmlEnumValue("Ersatzsteuerbescheinigung")
    ERSATZSTEUERBESCHEINIGUNG("Ersatzsteuerbescheinigung"),

    /**
     * Einwilligungs- / Schweigepflichtentbindungserkl??rung
     * 
     */
    EWSEE("EWSEE"),
    @XmlEnumValue("Fahrzeugbewertung")
    FAHRZEUGBEWERTUNG("Fahrzeugbewertung"),

    /**
     * FATCA-Fragebogen f??r nat??rliche oder juristische Personen 
     * 
     */
    FATCA("FATCA"),

    /**
     * Antragsformular f??r die Korrektur bzw. Festsetzung der Zulage gem???? ?? 90 Abs. 4 EStG
     * 
     */
    @XmlEnumValue("FestsetzungsantragZulagen")
    FESTSETZUNGSANTRAG_ZULAGEN("FestsetzungsantragZulagen"),

    /**
     * Aktuelle ??bersicht der Fonds, in die investiert werden kann
     * 
     */
    @XmlEnumValue("Fondsuebersicht")
    FONDSUEBERSICHT("Fondsuebersicht"),
    @XmlEnumValue("Forderungsschreiben")
    FORDERUNGSSCHREIBEN("Forderungsschreiben"),
    @XmlEnumValue("Foto")
    FOTO("Foto"),
    @XmlEnumValue("Fragebogen")
    FRAGEBOGEN("Fragebogen"),

    /**
     * Freistellungsauftrag f??r Kapitalertr??ge und Antrag auf ehegatten??bergreifende/lebenspartner??bergreifende Verlustverrechnung
     * 
     */
    @XmlEnumValue("Freistellungsauftrag")
    FREISTELLUNGSAUFTRAG("Freistellungsauftrag"),
    @XmlEnumValue("Freistellungsbescheinigung")
    FREISTELLUNGSBESCHEINIGUNG("Freistellungsbescheinigung"),

    /**
     * Elektronische Kopie eines F??hrerscheins
     * 
     */
    @XmlEnumValue("Fuehrerscheinkopie")
    FUEHRERSCHEINKOPIE("Fuehrerscheinkopie"),
    @XmlEnumValue("GerichtlicheVerfuegung")
    GERICHTLICHE_VERFUEGUNG("GerichtlicheVerfuegung"),
    @XmlEnumValue("Gutachten")
    GUTACHTEN("Gutachten"),
    @XmlEnumValue("Handlungsanweisung")
    HANDLUNGSANWEISUNG("Handlungsanweisung"),

    /**
     * Formular zur Unterschriftenprobe/Identifikation (getDocument) bzw. Kopie des Ausweises (Request setChange)
     * 
     */
    @XmlEnumValue("Identifikation")
    IDENTIFIKATION("Identifikation"),

    /**
     * Information ??ber die ??bermittlung von Daten an die ZfA (z.B. Rentenbez??ge, geleistete Beitr??ge) gem???? ?? 22a EStG
     * 
     */
    @XmlEnumValue("InfoMeldungAnZfA")
    INFO_MELDUNG_AN_ZF_A("InfoMeldungAnZfA"),
    @XmlEnumValue("InternesDokumentFuerVermittler")
    INTERNES_DOKUMENT_FUER_VERMITTLER("InternesDokumentFuerVermittler"),

    /**
     * Bescheinigung ??ber die Kapitalertr??ge und die daf??r bereits abgef??hrten Steuern eines Kalenderjahres gem???? ?? 45a Abs. 2 und 3 EStG
     * 
     */
    @XmlEnumValue("Jahressteuerbescheinigung")
    JAHRESSTEUERBESCHEINIGUNG("Jahressteuerbescheinigung"),

    /**
     * Bescheinigung ??ber die H??he der geleisteten Beitr??ge f??r das jeweilige Kalenderjahr gem???? ?? 10 Abs. 2 Buchstabe a EStG
     * 
     */
    @XmlEnumValue("JahresbescheinigungBasisRente")
    JAHRESBESCHEINIGUNG_BASIS_RENTE("JahresbescheinigungBasisRente"),

    /**
     * Bescheinigung ??ber Altersvorsorgebeitr??ge, Zulagen, Stand des Altersvorsorgeverm??gens und Stand des Wohnf??rderkontos gem???? ?? 92 EStG
     * 
     */
    @XmlEnumValue("JahresbescheinigungRiester")
    JAHRESBESCHEINIGUNG_RIESTER("JahresbescheinigungRiester"),

    /**
     * Information des Versicherers an den Versicherungsnehmer gem???? ?? 155 VVG ??ber den Wertstand des Vertrags mit Werten zum vorgegebenen Stichtag. Dies kann auch die Kopie der Jahresinformation des letzten Jahres sein.
     * 
     */
    @XmlEnumValue("Jahresinformation")
    JAHRESINFORMATION("Jahresinformation"),
    @XmlEnumValue("Klage")
    KLAGE("Klage"),

    /**
     * Vertraglich vereinbarte Klausen, die die Bedingungen ab??ndern oder erg??nzen.
     * 
     */
    @XmlEnumValue("Klauseln")
    KLAUSELN("Klauseln"),

    /**
     * Werbliche ??bersicht ??ber ein Produkt, die versicherten Leistungen und die entsprechenden Beitr??ge in Kurzform. H??ufig auch Datenblatt genannt.
     * 
     */
    @XmlEnumValue("Kompaktvorschlag")
    KOMPAKTVORSCHLAG("Kompaktvorschlag"),
    @XmlEnumValue("Kostenuebernahmeerklaerung")
    KOSTENUEBERNAHMEERKLAERUNG("Kostenuebernahmeerklaerung"),
    @XmlEnumValue("Kostenvoranschlag")
    KOSTENVORANSCHLAG("Kostenvoranschlag"),
    @XmlEnumValue("Messprotokoll")
    MESSPROTOKOLL("Messprotokoll"),

    /**
     * Dokumentierung einer ??nderung zu einem Vertrag
     * 
     */
    @XmlEnumValue("Nachtrag")
    NACHTRAG("Nachtrag"),

    /**
     * Nachversichererbescheinigung zur Vorlage beim Vorversicherer.
     * 
     */
    @XmlEnumValue("Nachversichererbescheinigung")
    NACHVERSICHERERBESCHEINIGUNG("Nachversichererbescheinigung"),

    /**
     * Produktinformationsblatt
     * 
     */
    @XmlEnumValue("PiB")
    PI_B("PiB"),

    /**
     * Produktinformationsblatt inkl. Vertragsinformationen
     * 
     */
    @XmlEnumValue("PiBVI")
    PI_BVI("PiBVI"),
    @XmlEnumValue("Police")
    POLICE("Police"),

    /**
     * Werblich aufbereitete Erl??uterung zum Produkt.
     * 
     */
    @XmlEnumValue("Prospekt")
    PROSPEKT("Prospekt"),
    @XmlEnumValue("Protokoll")
    PROTOKOLL("Protokoll"),
    @XmlEnumValue("Pruefbericht")
    PRUEFBERICHT("Pruefbericht"),

    /**
     * Formulare zur GwG ??berpr??fung des Kunden (juristische oder nat??rliche Person)
     * 
     */
    @XmlEnumValue("PruefungGWG")
    PRUEFUNG_GWG("PruefungGWG"),
    @XmlEnumValue("Rechnung")
    RECHNUNG("Rechnung"),
    @XmlEnumValue("Reparaturbestaetigung")
    REPARATURBESTAETIGUNG("Reparaturbestaetigung"),

    /**
     * Riesterwechsel-Formular
     * 
     */
    @XmlEnumValue("RiesterwechselFormular")
    RIESTERWECHSEL_FORMULAR("RiesterwechselFormular"),

    /**
     *  Fragebogen zur Analyse der zu versichernden Risiken je Sparten
     * 
     */
    @XmlEnumValue("Risikoanalyse")
    RISIKOANALYSE("Risikoanalyse"),

    /**
     * Fragebogen zur Erfassung von risikorelevanten Informationen ??ber juristisch eindeutig und im Klartext formulierte Fragen.
     * 
     */
    @XmlEnumValue("Risikofragebogen")
    RISIKOFRAGEBOGEN("Risikofragebogen"),

    /**
     * Formular zur R??cknahme einer ??nderung, z.B. Beitragsreduzierung, K??ndigung, Beitragsfreistellung
     * 
     */
    @XmlEnumValue("RuecknahmeAenderung")
    RUECKNAHME_AENDERUNG("RuecknahmeAenderung"),
    @XmlEnumValue("Schadenerledigung")
    SCHADENERLEDIGUNG("Schadenerledigung"),
    @XmlEnumValue("Schadenmeldung")
    SCHADENMELDUNG("Schadenmeldung"),
    @XmlEnumValue("SchriftsatzDerGegenseite")
    SCHRIFTSATZ_DER_GEGENSEITE("SchriftsatzDerGegenseite"),

    /**
     * Formular zur Beantragung eines SEPA-Mandats
     * 
     */
    @XmlEnumValue("SEPAMandatAntrag")
    SEPA_MANDAT_ANTRAG("SEPAMandatAntrag"),

    /**
     * Kopie eines (unterschriebenen) SEPA-Mandats
     * 
     */
    @XmlEnumValue("SEPAMandatKopie")
    SEPA_MANDAT_KOPIE("SEPAMandatKopie"),

    /**
     * SEPA-PreNotifikationsschreiben
     * 
     */
    @XmlEnumValue("SEPANotifikation")
    SEPA_NOTIFIKATION("SEPANotifikation"),

    /**
     * Sicherungsschein an den Gl??ubiger.
     * 
     */
    @XmlEnumValue("Sicherungsschein")
    SICHERUNGSSCHEIN("Sicherungsschein"),

    /**
     * Formular zur ??bertragung des Schadenfreiheitsrabatts
     * 
     */
    @XmlEnumValue("SFR-Uebertragungsformular")
    SFR_UEBERTRAGUNGSFORMULAR("SFR-Uebertragungsformular"),
    @XmlEnumValue("SonstigesDokument")
    SONSTIGES_DOKUMENT("SonstigesDokument"),

    /**
     *  Liste gestohlener Gegenst??nde bzw. G??ter.
     * 
     */
    @XmlEnumValue("Stehlgutliste")
    STEHLGUTLISTE("Stehlgutliste"),
    @XmlEnumValue("UnterlagenZurSchadenhoehe")
    UNTERLAGEN_ZUR_SCHADENHOEHE("UnterlagenZurSchadenhoehe"),

    /**
     * Ein standardisiertes  Dokument zur Abgabe einer Willenserkl??rung per Unterschrift
     * 
     */
    @XmlEnumValue("Unterschriftenblatt")
    UNTERSCHRIFTENBLATT("Unterschriftenblatt"),
    @XmlEnumValue("Urteil")
    URTEIL("Urteil"),
    @XmlEnumValue("Vergleich")
    VERGLEICH("Vergleich"),

    /**
     * Bescheinigung ??ber die H??he der nicht ausgeglichenen Verluste gem???? ?? 43a Abs. 3 Satz 4 EStG
     * 
     */
    @XmlEnumValue("Verlustbescheinigung")
    VERLUSTBESCHEINIGUNG("Verlustbescheinigung"),

    /**
     * Bei K??ndigung oder bei Nichtauffinden des original Versicherungsscheines wird eine Verlusterkl??rung an den VN gesendet.
     * 
     */
    @XmlEnumValue("Verlusterklaerung")
    VERLUSTERKLAERUNG("Verlusterklaerung"),

    /**
     * Best??tigung ??ber Art und Umfang einer bestehenden Versicherung. DARF NICHT f??r Industrie- und Gewerbeversicherungen genutzt werden, da es daf??r granulare Auspr??gungen (einfache, erweiterte, individuelle Versicherungsbest??tigungen) gibt.
     * 
     */
    @XmlEnumValue("Versicherungsbestaetigung")
    VERSICHERUNGSBESTAETIGUNG("Versicherungsbestaetigung"),

    /**
     * Bei einer einfachen Haftpflicht-Versicherungsbest??tigung wird das Vorhandensein einer Haftpflichtversicherung mit Deckungssummen best??tigt.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungEinfachHaftpflicht")
    VERSICHERUNGSBESTAETIGUNG_EINFACH_HAFTPFLICHT("VersicherungsbestaetigungEinfachHaftpflicht"),

    /**
     * Bei einer einfachen Sach-Versicherungsbest??tigung wird das Vorhandensein einer Sachversicherung mit einer eingeschlossenen Versicherungssumme best??tigt.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungEinfachSach")
    VERSICHERUNGSBESTAETIGUNG_EINFACH_SACH("VersicherungsbestaetigungEinfachSach"),

    /**
     * Bei einer einfachen Transport-Versicherungsbest??tigung wird das Vorhandensein einer Transportversicherung mit einer eingeschlossenen Versicherungssumme best??tigt.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungEinfachTransport")
    VERSICHERUNGSBESTAETIGUNG_EINFACH_TRANSPORT("VersicherungsbestaetigungEinfachTransport"),

    /**
     * Bei der einfachen Versicherungsbest??tigung f??r eine technische Versicherung wird das Vorhandensein mit der eingeschlossenen Versicherungssumme best??tigt.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungEinfachTV")
    VERSICHERUNGSBESTAETIGUNG_EINFACH_TV("VersicherungsbestaetigungEinfachTV"),

    /**
     * Bei einer erweiterten Haftpflicht-Versicherungsbest??tigung werden ??ber die einfache Versicherungsbest??tigung hinaus die erweiterte Produkthaftpflicht und die versicherten Deckungsbausteine best??tigt.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungErweitertHaftpflicht")
    VERSICHERUNGSBESTAETIGUNG_ERWEITERT_HAFTPFLICHT("VersicherungsbestaetigungErweitertHaftpflicht"),

    /**
     * Bei einer erweiterten Transport-Versicherungsbest??tigung werden ??ber das Vorhandensein einer Transportversicherung mit der eingeschlossenen Versicherungssumme hinaus die versicherten Deckungsbausteine best??tigt.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungErweitertTransport")
    VERSICHERUNGSBESTAETIGUNG_ERWEITERT_TRANSPORT("VersicherungsbestaetigungErweitertTransport"),

    /**
     * Eine individuelle Versicherungsbest??tigung f??r eine gewerbliche Haftpflichtversicherung. Bei der Dokumentanforderung MUSS im Attribut Freitext des Gesch??ftsvorgangs die gew??nschte Art und der gew??nschte Umfang der Best??tigung beschrieben werden.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungIndividuellHaftpflicht")
    VERSICHERUNGSBESTAETIGUNG_INDIVIDUELL_HAFTPFLICHT("VersicherungsbestaetigungIndividuellHaftpflicht"),

    /**
     * Eine individuelle Versicherungsbest??tigung f??r eine Sachversicherung. Bei der Dokumentanforderung MUSS im Attribut Freitext des Gesch??ftsvorgangs die gew??nschte Art und der gew??nschte Umfang der Best??tigung beschrieben werden.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungIndividuellSach")
    VERSICHERUNGSBESTAETIGUNG_INDIVIDUELL_SACH("VersicherungsbestaetigungIndividuellSach"),

    /**
     * Eine individuelle Versicherungsbest??tigung f??r eine Transportversicherung. Bei der Dokumentanforderung MUSS im Attribut Freitext des Gesch??ftsvorgangs die gew??nschte Art und der gew??nschte Umfang der Best??tigung beschrieben werden.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungIndividuellTransport")
    VERSICHERUNGSBESTAETIGUNG_INDIVIDUELL_TRANSPORT("VersicherungsbestaetigungIndividuellTransport"),

    /**
     * Eine Versicherungsbest??tigung zu einer Pflichtversicherung. Diese dient zur Vorlage bei Beh??rden oder Kammern.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungPflichtversicherungHaftpflicht")
    VERSICHERUNGSBESTAETIGUNG_PFLICHTVERSICHERUNG_HAFTPFLICHT("VersicherungsbestaetigungPflichtversicherungHaftpflicht"),

    /**
     * Die Pflichtversicherung wird nach ??7a G??KG (G??terkraftverkehrsgesetz) best??tigt.
     * 
     */
    @XmlEnumValue("VersicherungsbestaetigungPflichtversicherungTransport")
    VERSICHERUNGSBESTAETIGUNG_PFLICHTVERSICHERUNG_TRANSPORT("VersicherungsbestaetigungPflichtversicherungTransport"),

    /**
     * Information f??r das Familiengericht ??ber Ehezeit, Ehezeitanteil und Ausgleichswert gem???? ?? 5 VersAusglG
     * 
     */
    @XmlEnumValue("VersorgungsausgleichInformation")
    VERSORGUNGSAUSGLEICH_INFORMATION("VersorgungsausgleichInformation"),
    @XmlEnumValue("Vertrag")
    VERTRAG("Vertrag"),

    /**
     * Formular zum Schutz vor Pf??ndung bzw. Insolvenz
     * 
     */
    @XmlEnumValue("Verwertungsausschluss")
    VERWERTUNGSAUSSCHLUSS("Verwertungsausschluss"),

    /**
     * Vertragsinformationen
     * 
     */
    VI("VI"),
    @XmlEnumValue("Video")
    VIDEO("Video"),

    /**
     * Dokument zur Erteilung einer Vollmacht
     * 
     */
    @XmlEnumValue("Vollmacht")
    VOLLMACHT("Vollmacht"),
    @XmlEnumValue("VollstreckbarerTitel")
    VOLLSTRECKBARER_TITEL("VollstreckbarerTitel"),
    @XmlEnumValue("Vorladung")
    VORLADUNG("Vorladung"),
    @XmlEnumValue("VorlaeufigeDeckung")
    VORLAEUFIGE_DECKUNG("VorlaeufigeDeckung"),

    /**
     * Versicherungsvorschlag ohne der nach VVG und VVG-Infoverordnung relevanten Informationen sowie ohne den Allgemeinen und Besonderen Bedingungen und Klauseln
     * 
     */
    @XmlEnumValue("Vorschlag")
    VORSCHLAG("Vorschlag"),

    /**
     * VVG-konformer Versicherungsvorschlag inkl. der nach VVG und VVG-Infoverordnung relevanten Informationen sowie den Allgemeinen und Besonderen Bedingungen inkl. Klauseln
     * 
     */
    @XmlEnumValue("VorschlagVVG")
    VORSCHLAG_VVG("VorschlagVVG"),

    /**
     * Bescheinigung des Verkehrszentralregisters
     * 
     */
    @XmlEnumValue("VZR-Bescheinigung")
    VZR_BESCHEINIGUNG("VZR-Bescheinigung"),

    /**
     * Formular f??r die ??nderung von Vertragspartnern
     * 
     */
    @XmlEnumValue("WechselVertragspartner")
    WECHSEL_VERTRAGSPARTNER("WechselVertragspartner"),
    @XmlEnumValue("Widerrufsbelehrung")
    WIDERRUFSBELEHRUNG("Widerrufsbelehrung"),
    @XmlEnumValue("Zahlungsbestaetigung")
    ZAHLUNGSBESTAETIGUNG("Zahlungsbestaetigung"),
    @XmlEnumValue("Zeugenbericht")
    ZEUGENBERICHT("Zeugenbericht"),

    /**
     * Formular zur Beantragung von Zulagen gem???? ?? 89 Abs. 1 EStG
     * 
     */
    @XmlEnumValue("Zulagenantrag")
    ZULAGENANTRAG("Zulagenantrag"),

    /**
     * Elektronische Kopie des Fahrzeugscheins oder -briefs
     * 
     */
    @XmlEnumValue("Zulassungsbescheinigung")
    ZULASSUNGSBESCHEINIGUNG("Zulassungsbescheinigung"),

    /**
     * Beglaubigte Kopie eines Originaldokuments
     * 
     */
    @XmlEnumValue("Zweitschrift")
    ZWEITSCHRIFT("Zweitschrift");
    private final String value;

    STDokumentartID(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STDokumentartID fromValue(String v) {
        for (STDokumentartID c: STDokumentartID.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
