
package net.bipro.namespace.datentypen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Waehrungsschluessel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Waehrungsschluessel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADF"/&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AON"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="ATS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BEF"/&gt;
 *     &lt;enumeration value="BGL"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CSK"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="ECS"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FIM"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="FRF"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GHC"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GRD"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="IEP"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="ITL"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LUF"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MGF"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXP"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZM"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NLG"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PLZ"/&gt;
 *     &lt;enumeration value="PTE"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SRG"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UGS"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="UYP"/&gt;
 *     &lt;enumeration value="VEB"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="XAG"/&gt;
 *     &lt;enumeration value="XAU"/&gt;
 *     &lt;enumeration value="XEU"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="XPD"/&gt;
 *     &lt;enumeration value="XPT"/&gt;
 *     &lt;enumeration value="YUN"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZWD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ST_Waehrungsschluessel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public enum STWaehrungsschluessel {


    /**
     * Andorran Franc
     * 
     */
    @XmlEnumValue("ADF")
    ANDORRAN_FRANC("ADF"),

    /**
     * Andorran Peseta
     * 
     */
    @XmlEnumValue("ADP")
    ANDORRAN_PESTA("ADP"),

    /**
     * Utd. Arab Emir. Dirham
     * 
     */
    @XmlEnumValue("AED")
    UTD_ARAB_EMIR_DIRHAM("AED"),

    /**
     * Afghanistan Afghani
     * 
     */
    @XmlEnumValue("AFA")
    AFGAHNISTAN_AFGHANI("AFA"),

    /**
     * Albanischer Lek
     * 
     */
    @XmlEnumValue("ALL")
    ALBANISCHER_LEK("ALL"),

    /**
     * NL Antillian Guilder
     * 
     */
    @XmlEnumValue("ANG")
    NL_ANTILLIAN_GUILDER("ANG"),

    /**
     * Angolanischer New Kwanza
     * 
     */
    @XmlEnumValue("AON")
    ANGOLANISCHER_NEW_KWANZA("AON"),

    /**
     * Argentinischer Peso
     * 
     */
    @XmlEnumValue("ARS")
    ARGENTINISCHER_PESO("ARS"),

    /**
     * Oesterreichischer Schilling
     * 
     */
    @XmlEnumValue("ATS")
    OESTERREICHISCHER_SCHILLING("ATS"),

    /**
     * Australischer Dollar
     * 
     */
    @XmlEnumValue("AUD")
    AUSTRALISCHER_DOLLAR("AUD"),

    /**
     * Aruban Florin
     * 
     */
    @XmlEnumValue("AWG")
    ARUBAN_FLORIN("AWG"),

    /**
     * Barbados Dollar
     * 
     */
    @XmlEnumValue("BBD")
    BARBADOS_DOLLAR("BBD"),

    /**
     * Bangladeshi Taka
     * 
     */
    @XmlEnumValue("BDT")
    BANGALADESHI_TAKA("BDT"),

    /**
     * Belgischer Franc
     * 
     */
    @XmlEnumValue("BEF")
    BULGARISCHER_LEV("BEF"),

    /**
     * Bulgarischer Lev
     * 
     */
    BGL("BGL"),

    /**
     * Bahraini Dinar
     * 
     */
    @XmlEnumValue("BHD")
    BAHRAINI_DINAR("BHD"),

    /**
     * Burundi Franc
     * 
     */
    @XmlEnumValue("BIF")
    BURUNDI_FRANC("BIF"),

    /**
     * Bermudian Dollar
     * 
     */
    @XmlEnumValue("BMD")
    BERMUDIAN_DOLLAR("BMD"),

    /**
     * Brunei Dollar
     * 
     */
    @XmlEnumValue("BND")
    BRUNEI_DOLLAR("BND"),

    /**
     * Bolivianischer Boliviano
     * 
     */
    BOB("BOB"),

    /**
     * Brasilianischer Real
     * 
     */
    @XmlEnumValue("BRL")
    BRASILISANISCHER_REAL("BRL"),

    /**
     * Bahamian Dollar
     * 
     */
    @XmlEnumValue("BSD")
    BAHAMIAN_DOLLAR("BSD"),

    /**
     * Bhutan Ngultrum
     * 
     */
    @XmlEnumValue("BTN")
    BHUTAN_NGULTRUM("BTN"),

    /**
     * Botswana Pula
     * 
     */
    @XmlEnumValue("BWP")
    BOTSWANA_PULA("BWP"),

    /**
     * Belize Dollar
     * 
     */
    @XmlEnumValue("BZD")
    NELIZE_DOLLAR("BZD"),

    /**
     * Kanadischer Dollar
     * 
     */
    @XmlEnumValue("CAD")
    KANADISCHER_DOLLAR("CAD"),

    /**
     * Schweizer Franken
     * 
     */
    @XmlEnumValue("CHF")
    SCHWEIZER_FRANKEN("CHF"),

    /**
     * Chilean Peso
     * 
     */
    @XmlEnumValue("CLP")
    CHILEAN_PESO("CLP"),

    /**
     * Chinese Yuan Renminbi
     * 
     */
    @XmlEnumValue("CNY")
    CHINESE_YUAN_RENMINBI("CNY"),

    /**
     * Colombian Peso
     * 
     */
    @XmlEnumValue("COP")
    COLOMBIAN_PESO("COP"),

    /**
     * Costa Rican Colon
     * 
     */
    @XmlEnumValue("CRC")
    COSTA_RICAN_COLON("CRC"),

    /**
     * Tchchischer Koruna
     * 
     */
    @XmlEnumValue("CSK")
    TSCHECHISCHE_KORUNA("CSK"),

    /**
     * Kubanischer Peso
     * 
     */
    @XmlEnumValue("CUP")
    KUBANISCHER_PESO("CUP"),

    /**
     * Cape Verde Escudo
     * 
     */
    @XmlEnumValue("CVE")
    CAPE_VERDE_ESCUDO("CVE"),

    /**
     * Zyprisches Pfund
     * 
     */
    @XmlEnumValue("CYP")
    ZYPRISCHES_PFUND("CYP"),

    /**
     * Deutsche Mark
     * 
     */
    @XmlEnumValue("DEM")
    DEUTSCHE_MARK("DEM"),

    /**
     * Djibouti Franc
     * 
     */
    @XmlEnumValue("DJF")
    DJIBOUTI_FRANC("DJF"),

    /**
     * Daenische Krone
     * 
     */
    @XmlEnumValue("DKK")
    DAENISCHE_KRONE("DKK"),

    /**
     * Dominican Peso
     * 
     */
    @XmlEnumValue("DOP")
    DOMINICAN_PESO("DOP"),

    /**
     * Algerian Dinar
     * 
     */
    @XmlEnumValue("DZD")
    ALGERIAN_DINAR("DZD"),

    /**
     * Ecuador Sucre
     * 
     */
    @XmlEnumValue("ECS")
    ECUADOR_SURCE("ECS"),

    /**
     * Estonian Kroon
     * 
     */
    @XmlEnumValue("EEK")
    ESTONIAN_KRONE("EEK"),

    /**
     * Egyptian Pound
     * 
     */
    @XmlEnumValue("EGP")
    EGYPTIAN_POUND("EGP"),

    /**
     * Spanische Peseta
     * 
     */
    @XmlEnumValue("ESP")
    SPANISCHE_PESETA("ESP"),

    /**
     * Ethiopian Birr
     * 
     */
    @XmlEnumValue("ETB")
    ETHIOPIAN_BIRR("ETB"),

    /**
     * Euro
     * 
     */
    @XmlEnumValue("EUR")
    EURO("EUR"),

    /**
     * Finnish Markka
     * 
     */
    @XmlEnumValue("FIM")
    FINNISH_MARKKA("FIM"),

    /**
     * Fiji Dollar
     * 
     */
    @XmlEnumValue("FJD")
    FIJI_DOLLAR("FJD"),

    /**
     * Falkland Islands Pound
     * 
     */
    @XmlEnumValue("FKP")
    FALKKLAND_ISLAND_POUND("FKP"),

    /**
     * Franzoesische Franc
     * 
     */
    @XmlEnumValue("FRF")
    FRANZOESISCH_FRANC("FRF"),

    /**
     * Britisches Pfund
     * 
     */
    @XmlEnumValue("GBP")
    BRITISCHES_PFUND("GBP"),

    /**
     * Ghanaian Cedi
     * 
     */
    @XmlEnumValue("GHC")
    GHANAIAN_CEDI("GHC"),

    /**
     * Gibraltar Pound
     * 
     */
    @XmlEnumValue("GIP")
    GIBRALTAR_POUND("GIP"),

    /**
     * Gambian Dalasi
     * 
     */
    @XmlEnumValue("GMD")
    GAMBIAN_DALASI("GMD"),

    /**
     * Guinea Franc
     * 
     */
    @XmlEnumValue("GNF")
    GUINEA_FRANC("GNF"),

    /**
     * Griechische Drachmen
     * 
     */
    @XmlEnumValue("GRD")
    GRIECHISCHE_DRACHMEN("GRD"),

    /**
     * Guatemalan Quetzal
     * 
     */
    @XmlEnumValue("GTQ")
    GUATEMALAN_QUETZAL("GTQ"),

    /**
     * Guyanan Dollar
     * 
     */
    @XmlEnumValue("GYD")
    GUYANAN_DOLLAR("GYD"),

    /**
     * Hong Kong Dollar
     * 
     */
    @XmlEnumValue("HKD")
    HONG_KONG_DOLLAR("HKD"),

    /**
     * Honduran Lempira
     * 
     */
    @XmlEnumValue("HNL")
    HONDURAN_LEMPIRA("HNL"),

    /**
     * Kroatische Kuna
     * 
     */
    @XmlEnumValue("HRK")
    KROATISCHE_LUNA("HRK"),

    /**
     * Haitian Gourde
     * 
     */
    @XmlEnumValue("HTG")
    HAITIAN_GOURDE("HTG"),

    /**
     * Ungarischer Forint
     * 
     */
    @XmlEnumValue("HUF")
    UNGARISCHER_FORINT("HUF"),

    /**
     * Indonesian Rupiah
     * 
     */
    @XmlEnumValue("IDR")
    INDONESIAN_RUPIAH("IDR"),

    /**
     * Irisches Punt
     * 
     */
    @XmlEnumValue("IEP")
    IRISCHES_PUNT("IEP"),

    /**
     * Israelisches Neuer Shekel
     * 
     */
    @XmlEnumValue("ILS")
    ISRAELISCHES_NEUER_SHEKEL("ILS"),

    /**
     * Indian Rupee
     * 
     */
    @XmlEnumValue("INR")
    INDIAN_RUPEE("INR"),

    /**
     * Irakischer Dinar
     * 
     */
    @XmlEnumValue("IQD")
    IRAKISCHER_DINAR("IQD"),

    /**
     * Iranischer Rial
     * 
     */
    @XmlEnumValue("IRR")
    IRANISCHER_RIAL("IRR"),

    /**
     * Iceland Krona
     * 
     */
    @XmlEnumValue("ISK")
    ICELAND_KRONA("ISK"),

    /**
     * Italienische Lira
     * 
     */
    @XmlEnumValue("ITL")
    ITALIENISCHE_LIRA("ITL"),

    /**
     * Jamaican Dollar
     * 
     */
    @XmlEnumValue("JMD")
    JAMAICIAN_DOLLAR("JMD"),

    /**
     * Jordanian Dinar
     * 
     */
    @XmlEnumValue("JOD")
    JORDANIAN_DINAR("JOD"),

    /**
     * Japanischer Yen
     * 
     */
    @XmlEnumValue("JPY")
    JAPANISCHER_YEN("JPY"),

    /**
     * Kenyan Shilling
     * 
     */
    @XmlEnumValue("KES")
    KENYAN_SHILLING("KES"),

    /**
     * Cambodian Riel
     * 
     */
    @XmlEnumValue("KHR")
    CAMBODIAN_RIEL("KHR"),

    /**
     * Comoros Franc
     * 
     */
    @XmlEnumValue("KMF")
    COMOROS_FRANC("KMF"),

    /**
     * Nord- Koreanischer Won
     * 
     */
    @XmlEnumValue("KPW")
    NORD_KOREANISCHER_WON("KPW"),

    /**
     * Koreanischer Won
     * 
     */
    @XmlEnumValue("KRW")
    KOREANISCHER_WON("KRW"),

    /**
     * Kuwaiischeri Dinar
     * 
     */
    @XmlEnumValue("KWD")
    KUWAIISCHERI_DINAR("KWD"),

    /**
     * Cayman Islands Dollar
     * 
     */
    @XmlEnumValue("KYD")
    CAYMAN_ISLANDS_DOLLAR("KYD"),

    /**
     * Kazakhstan Tenge
     * 
     */
    @XmlEnumValue("KZT")
    KAZAKSTAN_TENGE("KZT"),

    /**
     * Lao Kip
     * 
     */
    @XmlEnumValue("LAK")
    LAO_KIP("LAK"),

    /**
     * Lebanese Pound
     * 
     */
    @XmlEnumValue("LBP")
    LEBANESE_POUND("LBP"),

    /**
     * Sri Lanka Rupee
     * 
     */
    @XmlEnumValue("LKR")
    SRI_LANKA_RUPEE("LKR"),

    /**
     * Liberian Dollar
     * 
     */
    @XmlEnumValue("LRD")
    LIBERIAN_DOLLAR("LRD"),

    /**
     * Lesotho Loti
     * 
     */
    @XmlEnumValue("LSL")
    LESOTHO_LOTI("LSL"),

    /**
     * Lithuanian Litas
     * 
     */
    @XmlEnumValue("LTL")
    LITHUANIAN_LITAS("LTL"),

    /**
     * Luxemburger Franc
     * 
     */
    @XmlEnumValue("LUF")
    LUXEMBURGER_FRANC("LUF"),

    /**
     * Latvian Lats
     * 
     */
    @XmlEnumValue("LVL")
    LATAVIAN_LATS("LVL"),

    /**
     * Libyscher Dinar
     * 
     */
    @XmlEnumValue("LYD")
    LIBYSCHER_DINAR("LYD"),

    /**
     * Moroccan Dirham
     * 
     */
    @XmlEnumValue("MAD")
    MOROCCAN_DIRHAM("MAD"),

    /**
     * Malagasy Franc
     * 
     */
    @XmlEnumValue("MGF")
    MALAGASY_FRANC("MGF"),

    /**
     * Myanmar Kyat
     * 
     */
    @XmlEnumValue("MMK")
    MYANMAR_KYAT("MMK"),

    /**
     * Mongolian Tugrik
     * 
     */
    @XmlEnumValue("MNT")
    MONGOLIAN_TUGRIK("MNT"),

    /**
     * Macau Pataca
     * 
     */
    @XmlEnumValue("MOP")
    MACAU_PATACA("MOP"),

    /**
     * Mauritanian Ouguiya
     * 
     */
    @XmlEnumValue("MRO")
    MAURITANIAN_OUGUIYA("MRO"),

    /**
     * Maltese Lira
     * 
     */
    @XmlEnumValue("MTL")
    MALTESE_LIRA("MTL"),

    /**
     * Mauritius Rupee
     * 
     */
    @XmlEnumValue("MUR")
    MAURITIUS_RUPEE("MUR"),

    /**
     * Maldive Rufiyaa
     * 
     */
    @XmlEnumValue("MVR")
    MALDIVE_RUFIYAA("MVR"),

    /**
     * Malawi Kwacha
     * 
     */
    @XmlEnumValue("MWK")
    MALAWI_KWACHA("MWK"),

    /**
     * Mexikanischer Peso
     * 
     */
    @XmlEnumValue("MXP")
    MEXIKANISCHER_PESO("MXP"),

    /**
     * Malaysian Ringgit
     * 
     */
    @XmlEnumValue("MYR")
    MALAYSIAN_RINGGIT("MYR"),

    /**
     * Mozambique Metical
     * 
     */
    @XmlEnumValue("MZM")
    MOZAMBIQUE_METICAL("MZM"),

    /**
     * Namibia Dollar
     * 
     */
    @XmlEnumValue("NAD")
    NAMIBIA_DOLLAR("NAD"),

    /**
     * Nigerian Naira
     * 
     */
    @XmlEnumValue("NGN")
    NIGERIAN_NAIRA("NGN"),

    /**
     * Nicaraguan Cordoba Oro
     * 
     */
    @XmlEnumValue("NIO")
    NICARAGUAN_CORDOBA_ORO("NIO"),

    /**
     * Niederlaendischer Guilder
     * 
     */
    @XmlEnumValue("NLG")
    NIEDERLAENDISCHER_GUILDER("NLG"),

    /**
     * Norwegische Krone
     * 
     */
    @XmlEnumValue("NOK")
    NORWEGISCHE_KRONE("NOK"),

    /**
     * Nepalese Rupee
     * 
     */
    @XmlEnumValue("NPR")
    NEPALESE_RUPEE("NPR"),

    /**
     * Neu Sealaendischer Dollar
     * 
     */
    @XmlEnumValue("NZD")
    NEUSEELAENDISCHER_DOLLAR("NZD"),

    /**
     * Omani Rial
     * 
     */
    @XmlEnumValue("OMR")
    OMANI_RIAL("OMR"),

    /**
     * Panamanian Balboa
     * 
     */
    @XmlEnumValue("PAB")
    PANAMANIAN_BALBOA("PAB"),

    /**
     * Peruvian Nuevo Sol
     * 
     */
    @XmlEnumValue("PEN")
    PERUVIAN_NUEVO_SOL("PEN"),

    /**
     * Papua New Guinea Kina
     * 
     */
    @XmlEnumValue("PGK")
    PAPUA_NEU_GUINEA_KINA("PGK"),

    /**
     * Philippinischer Peso
     * 
     */
    @XmlEnumValue("PHP")
    PHILIPPINISCHER_PESO("PHP"),

    /**
     * Pakistan Rupee
     * 
     */
    @XmlEnumValue("PKR")
    PAKISTIAN_RUPEE("PKR"),

    /**
     * Polnischer Zloty
     * 
     */
    @XmlEnumValue("PLZ")
    POLNISCHER_ZLOTY("PLZ"),

    /**
     * Portugisiescher Escudo
     * 
     */
    @XmlEnumValue("PTE")
    PORTUGISISCHER_ESCRUDO("PTE"),

    /**
     * Paraguay Guarani
     * 
     */
    @XmlEnumValue("PYG")
    PARAGUAY_GUARANI("PYG"),

    /**
     * Qatari Rial
     * 
     */
    @XmlEnumValue("QAR")
    QATARI_RIAL("QAR"),

    /**
     * Rumaenischer Leu
     * 
     */
    @XmlEnumValue("ROL")
    RUMAENISCHER_LEU("ROL"),

    /**
     * Russischer Rubel
     * 
     */
    @XmlEnumValue("RUB")
    RUSSISCHER_RUBEL("RUB"),

    /**
     * Saudi Riyal
     * 
     */
    @XmlEnumValue("SAR")
    SAUDI_RIAL("SAR"),

    /**
     * Solomon Islands Dollar
     * 
     */
    @XmlEnumValue("SBD")
    SOLOMON_ISLANDS_DOLLAR("SBD"),

    /**
     * Seychelles Rupee
     * 
     */
    @XmlEnumValue("SCR")
    SEYCHELLES_RUPEE("SCR"),

    /**
     * Sudanese Dinar
     * 
     */
    @XmlEnumValue("SDD")
    SUDANESE_DINAR("SDD"),

    /**
     * Sudanese Pound
     * 
     */
    @XmlEnumValue("SDP")
    SUDANESE_POUND("SDP"),

    /**
     * Schwedische Krone
     * 
     */
    @XmlEnumValue("SEK")
    SCHWEDISCHE_KRONE("SEK"),

    /**
     * Singapore Dollar
     * 
     */
    @XmlEnumValue("SGD")
    SINGAPORE_DOLLAR("SGD"),

    /**
     * St. Helena Pound
     * 
     */
    @XmlEnumValue("SHP")
    ST_HELENA_POUND("SHP"),

    /**
     * Sloveniischer Tolar
     * 
     */
    @XmlEnumValue("SIT")
    SLOVENISCHER_TOLAR("SIT"),

    /**
     * Slovak Koruna
     * 
     */
    @XmlEnumValue("SKK")
    SLOVAK_KORUNA("SKK"),

    /**
     * Sierra Leone Leone
     * 
     */
    @XmlEnumValue("SLL")
    SIERRA_LEONE_LEONE("SLL"),

    /**
     * Somali Shilling
     * 
     */
    @XmlEnumValue("SOS")
    SOMALI_SHILLING("SOS"),

    /**
     * Suriname Guilder
     * 
     */
    @XmlEnumValue("SRG")
    SURINAME_GUILDER("SRG"),

    /**
     * Sao Tome/Principe Dobra
     * 
     */
    @XmlEnumValue("STD")
    SAO_TOME_PRINCIPE_DOBRA("STD"),

    /**
     * El Salvador Colon
     * 
     */
    @XmlEnumValue("SVC")
    EL_SALVADOR_COLON("SVC"),

    /**
     * Syrian Pound
     * 
     */
    @XmlEnumValue("SYP")
    SYRIAN_POUND("SYP"),

    /**
     * Swaziland Lilangeni
     * 
     */
    @XmlEnumValue("SZL")
    SWAZILAND_LILANGENI("SZL"),

    /**
     * Thai Baht
     * 
     */
    @XmlEnumValue("THB")
    THAI_BAHT("THB"),

    /**
     * Tunisian Dinar
     * 
     */
    @XmlEnumValue("TND")
    TUNESIAN_DINAR("TND"),

    /**
     * Tongan Pa"anga
     * 
     */
    @XmlEnumValue("TOP")
    TONGAN_PAANGA("TOP"),

    /**
     * Tuerkische Lira
     * 
     */
    @XmlEnumValue("TRL")
    TUERKISCHE_LIRA("TRL"),

    /**
     * Trinidad/Tobago Dollar
     * 
     */
    @XmlEnumValue("TTD")
    TRINIDAD_TOBAGO_DOLLAR("TTD"),

    /**
     * Taiwan Dollar
     * 
     */
    @XmlEnumValue("TWD")
    TAIWAN_DOLLAR("TWD"),

    /**
     * Tanzanian Shilling
     * 
     */
    @XmlEnumValue("TZS")
    TANZANIAN_SHILLING("TZS"),

    /**
     * Ukraine Hryvnia
     * 
     */
    @XmlEnumValue("UAH")
    UKRAINE_HRYVNIA("UAH"),

    /**
     * Uganda Shilling
     * 
     */
    @XmlEnumValue("UGS")
    UGANDA_SHILLING("UGS"),

    /**
     * US Dollar
     * 
     */
    @XmlEnumValue("USD")
    US_DOLLAR("USD"),

    /**
     * Uruguayan Peso
     * 
     */
    @XmlEnumValue("UYP")
    URUGUAYAN_PESO("UYP"),

    /**
     * Venezuelan Bolivar
     * 
     */
    @XmlEnumValue("VEB")
    VENEZUELAN_BOLIVAR("VEB"),

    /**
     * Vietnamese Dong
     * 
     */
    @XmlEnumValue("VND")
    VIETNAMESE_DONG("VND"),

    /**
     * Vanuatu Vatu
     * 
     */
    @XmlEnumValue("VUV")
    VANUATU_VATU("VUV"),

    /**
     * Samoan Tala
     * 
     */
    @XmlEnumValue("WST")
    SAMOAN_TALA("WST"),

    /**
     * CFA Franc BEAC
     * 
     */
    @XmlEnumValue("XAF")
    CFA_FRANC_BEAC("XAF"),

    /**
     * Silver (oz.)
     * 
     */
    @XmlEnumValue("XAG")
    SILVER_OZ("XAG"),

    /**
     * Gold (oz.)
     * 
     */
    @XmlEnumValue("XAU")
    GOLD_OZ("XAU"),

    /**
     * ECU
     * 
     */
    @XmlEnumValue("XEU")
    ECU("XEU"),

    /**
     * CFA Franc BCEAO
     * 
     */
    @XmlEnumValue("XOF")
    CFA_FRANC_BCEAO("XOF"),

    /**
     * Palladium (oz.)
     * 
     */
    @XmlEnumValue("XPD")
    PALLADIUM_OZ("XPD"),

    /**
     * Platinum (oz.)
     * 
     */
    @XmlEnumValue("XPT")
    PLATINUM_OZ("XPT"),

    /**
     * Yugoslav Dinar
     * 
     */
    @XmlEnumValue("YUN")
    YUGOSLAV_DINAR("YUN"),

    /**
     * South African Rand
     * 
     */
    @XmlEnumValue("ZAR")
    SOUTH_AFRICAN_RAND("ZAR"),

    /**
     * Zambian Kwacha
     * 
     */
    @XmlEnumValue("ZMK")
    ZAMBIAN_KWACHA("ZMK"),

    /**
     * Zimbabwe Dollar
     * 
     */
    @XmlEnumValue("ZWD")
    ZIMBABWE_DOLLAR("ZWD");
    private final String value;

    STWaehrungsschluessel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STWaehrungsschluessel fromValue(String v) {
        for (STWaehrungsschluessel c: STWaehrungsschluessel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
