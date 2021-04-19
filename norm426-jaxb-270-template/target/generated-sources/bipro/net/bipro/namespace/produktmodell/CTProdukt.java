
package net.bipro.namespace.produktmodell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * Mittlere Ebene der Produkthierarchie gemaess VAA-Modell. Spartenspezifisch abzuleiten.
 * 
 * <p>Java class for CT_Produkt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Produkt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/produktmodell}CT_Produktbaustein"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sparte" type="{http://www.bipro.net/namespace/datentypen}ST_Sparte" minOccurs="0"/&gt;
 *         &lt;element name="Paket" type="{http://www.bipro.net/namespace/datentypen}STE_Paket" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Kennung" type="{http://www.bipro.net/namespace/datentypen}ST_ProduktKennung" minOccurs="0"/&gt;
 *         &lt;element name="Elementarprodukt" type="{http://www.bipro.net/namespace/produktmodell}CT_Elementarprodukt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dynamik" type="{http://www.bipro.net/namespace/produktmodell}CT_Dynamik" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Kuendigungsklausel" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="BesondererVerwendungszweck" type="{http://www.bipro.net/namespace/datentypen}ST_BesondererVerwendungszweck" minOccurs="0"/&gt;
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
    "sparte",
    "paket",
    "kennung",
    "elementarprodukt",
    "dynamik",
    "kuendigungsklausel",
    "besondererVerwendungszweck"
})
@XmlSeeAlso({
    net.bipro.namespace.versicherung.produktmodell.CTProdukt.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTProdukt
    extends CTProduktbaustein
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Sparte")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STSparte sparte;
    @XmlElement(name = "Paket")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<STEPaket> paket;
    @XmlElement(name = "Kennung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kennung;
    @XmlElement(name = "Elementarprodukt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTElementarprodukt> elementarprodukt;
    @XmlElement(name = "Dynamik")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTDynamik> dynamik;
    @XmlElement(name = "Kuendigungsklausel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean kuendigungsklausel;
    @XmlElement(name = "BesondererVerwendungszweck")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STBesondererVerwendungszweck besondererVerwendungszweck;

    /**
     * Gets the value of the sparte property.
     * 
     * @return
     *     possible object is
     *     {@link STSparte }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STSparte getSparte() {
        return sparte;
    }

    /**
     * Sets the value of the sparte property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSparte }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setSparte(STSparte value) {
        this.sparte = value;
    }

    /**
     * Gets the value of the paket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STEPaket }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<STEPaket> getPaket() {
        if (paket == null) {
            paket = new ArrayList<STEPaket>();
        }
        return this.paket;
    }

    /**
     * Gets the value of the kennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKennung() {
        return kennung;
    }

    /**
     * Sets the value of the kennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKennung(String value) {
        this.kennung = value;
    }

    /**
     * Gets the value of the elementarprodukt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementarprodukt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementarprodukt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTElementarprodukt }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTElementarprodukt> getElementarprodukt() {
        if (elementarprodukt == null) {
            elementarprodukt = new ArrayList<CTElementarprodukt>();
        }
        return this.elementarprodukt;
    }

    /**
     * Gets the value of the dynamik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTDynamik }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTDynamik> getDynamik() {
        if (dynamik == null) {
            dynamik = new ArrayList<CTDynamik>();
        }
        return this.dynamik;
    }

    /**
     * Gets the value of the kuendigungsklausel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isKuendigungsklausel() {
        return kuendigungsklausel;
    }

    /**
     * Sets the value of the kuendigungsklausel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKuendigungsklausel(Boolean value) {
        this.kuendigungsklausel = value;
    }

    /**
     * Gets the value of the besondererVerwendungszweck property.
     * 
     * @return
     *     possible object is
     *     {@link STBesondererVerwendungszweck }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STBesondererVerwendungszweck getBesondererVerwendungszweck() {
        return besondererVerwendungszweck;
    }

    /**
     * Sets the value of the besondererVerwendungszweck property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBesondererVerwendungszweck }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBesondererVerwendungszweck(STBesondererVerwendungszweck value) {
        this.besondererVerwendungszweck = value;
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
        final CTProdukt that = ((CTProdukt) object);
        {
            STSparte lhsSparte;
            lhsSparte = this.getSparte();
            STSparte rhsSparte;
            rhsSparte = that.getSparte();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sparte", lhsSparte), LocatorUtils.property(thatLocator, "sparte", rhsSparte), lhsSparte, rhsSparte, (this.sparte!= null), (that.sparte!= null))) {
                return false;
            }
        }
        {
            List<STEPaket> lhsPaket;
            lhsPaket = (((this.paket!= null)&&(!this.paket.isEmpty()))?this.getPaket():null);
            List<STEPaket> rhsPaket;
            rhsPaket = (((that.paket!= null)&&(!that.paket.isEmpty()))?that.getPaket():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paket", lhsPaket), LocatorUtils.property(thatLocator, "paket", rhsPaket), lhsPaket, rhsPaket, ((this.paket!= null)&&(!this.paket.isEmpty())), ((that.paket!= null)&&(!that.paket.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsKennung;
            lhsKennung = this.getKennung();
            String rhsKennung;
            rhsKennung = that.getKennung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kennung", lhsKennung), LocatorUtils.property(thatLocator, "kennung", rhsKennung), lhsKennung, rhsKennung, (this.kennung!= null), (that.kennung!= null))) {
                return false;
            }
        }
        {
            List<CTElementarprodukt> lhsElementarprodukt;
            lhsElementarprodukt = (((this.elementarprodukt!= null)&&(!this.elementarprodukt.isEmpty()))?this.getElementarprodukt():null);
            List<CTElementarprodukt> rhsElementarprodukt;
            rhsElementarprodukt = (((that.elementarprodukt!= null)&&(!that.elementarprodukt.isEmpty()))?that.getElementarprodukt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elementarprodukt", lhsElementarprodukt), LocatorUtils.property(thatLocator, "elementarprodukt", rhsElementarprodukt), lhsElementarprodukt, rhsElementarprodukt, ((this.elementarprodukt!= null)&&(!this.elementarprodukt.isEmpty())), ((that.elementarprodukt!= null)&&(!that.elementarprodukt.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTDynamik> lhsDynamik;
            lhsDynamik = (((this.dynamik!= null)&&(!this.dynamik.isEmpty()))?this.getDynamik():null);
            List<CTDynamik> rhsDynamik;
            rhsDynamik = (((that.dynamik!= null)&&(!that.dynamik.isEmpty()))?that.getDynamik():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dynamik", lhsDynamik), LocatorUtils.property(thatLocator, "dynamik", rhsDynamik), lhsDynamik, rhsDynamik, ((this.dynamik!= null)&&(!this.dynamik.isEmpty())), ((that.dynamik!= null)&&(!that.dynamik.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsKuendigungsklausel;
            lhsKuendigungsklausel = this.isKuendigungsklausel();
            Boolean rhsKuendigungsklausel;
            rhsKuendigungsklausel = that.isKuendigungsklausel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kuendigungsklausel", lhsKuendigungsklausel), LocatorUtils.property(thatLocator, "kuendigungsklausel", rhsKuendigungsklausel), lhsKuendigungsklausel, rhsKuendigungsklausel, (this.kuendigungsklausel!= null), (that.kuendigungsklausel!= null))) {
                return false;
            }
        }
        {
            STBesondererVerwendungszweck lhsBesondererVerwendungszweck;
            lhsBesondererVerwendungszweck = this.getBesondererVerwendungszweck();
            STBesondererVerwendungszweck rhsBesondererVerwendungszweck;
            rhsBesondererVerwendungszweck = that.getBesondererVerwendungszweck();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "besondererVerwendungszweck", lhsBesondererVerwendungszweck), LocatorUtils.property(thatLocator, "besondererVerwendungszweck", rhsBesondererVerwendungszweck), lhsBesondererVerwendungszweck, rhsBesondererVerwendungszweck, (this.besondererVerwendungszweck!= null), (that.besondererVerwendungszweck!= null))) {
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
            STSparte theSparte;
            theSparte = this.getSparte();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sparte", theSparte), currentHashCode, theSparte, (this.sparte!= null));
        }
        {
            List<STEPaket> thePaket;
            thePaket = (((this.paket!= null)&&(!this.paket.isEmpty()))?this.getPaket():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paket", thePaket), currentHashCode, thePaket, ((this.paket!= null)&&(!this.paket.isEmpty())));
        }
        {
            String theKennung;
            theKennung = this.getKennung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kennung", theKennung), currentHashCode, theKennung, (this.kennung!= null));
        }
        {
            List<CTElementarprodukt> theElementarprodukt;
            theElementarprodukt = (((this.elementarprodukt!= null)&&(!this.elementarprodukt.isEmpty()))?this.getElementarprodukt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "elementarprodukt", theElementarprodukt), currentHashCode, theElementarprodukt, ((this.elementarprodukt!= null)&&(!this.elementarprodukt.isEmpty())));
        }
        {
            List<CTDynamik> theDynamik;
            theDynamik = (((this.dynamik!= null)&&(!this.dynamik.isEmpty()))?this.getDynamik():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dynamik", theDynamik), currentHashCode, theDynamik, ((this.dynamik!= null)&&(!this.dynamik.isEmpty())));
        }
        {
            Boolean theKuendigungsklausel;
            theKuendigungsklausel = this.isKuendigungsklausel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kuendigungsklausel", theKuendigungsklausel), currentHashCode, theKuendigungsklausel, (this.kuendigungsklausel!= null));
        }
        {
            STBesondererVerwendungszweck theBesondererVerwendungszweck;
            theBesondererVerwendungszweck = this.getBesondererVerwendungszweck();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "besondererVerwendungszweck", theBesondererVerwendungszweck), currentHashCode, theBesondererVerwendungszweck, (this.besondererVerwendungszweck!= null));
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
        if (draftCopy instanceof CTProdukt) {
            final CTProdukt copy = ((CTProdukt) draftCopy);
            {
                Boolean sparteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sparte!= null));
                if (sparteShouldBeCopiedAndSet == Boolean.TRUE) {
                    STSparte sourceSparte;
                    sourceSparte = this.getSparte();
                    STSparte copySparte = ((STSparte) strategy.copy(LocatorUtils.property(locator, "sparte", sourceSparte), sourceSparte, (this.sparte!= null)));
                    copy.setSparte(copySparte);
                } else {
                    if (sparteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sparte = null;
                    }
                }
            }
            {
                Boolean paketShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.paket!= null)&&(!this.paket.isEmpty())));
                if (paketShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<STEPaket> sourcePaket;
                    sourcePaket = (((this.paket!= null)&&(!this.paket.isEmpty()))?this.getPaket():null);
                    @SuppressWarnings("unchecked")
                    List<STEPaket> copyPaket = ((List<STEPaket> ) strategy.copy(LocatorUtils.property(locator, "paket", sourcePaket), sourcePaket, ((this.paket!= null)&&(!this.paket.isEmpty()))));
                    copy.paket = null;
                    if (copyPaket!= null) {
                        List<STEPaket> uniquePaketl = copy.getPaket();
                        uniquePaketl.addAll(copyPaket);
                    }
                } else {
                    if (paketShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paket = null;
                    }
                }
            }
            {
                Boolean kennungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kennung!= null));
                if (kennungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKennung;
                    sourceKennung = this.getKennung();
                    String copyKennung = ((String) strategy.copy(LocatorUtils.property(locator, "kennung", sourceKennung), sourceKennung, (this.kennung!= null)));
                    copy.setKennung(copyKennung);
                } else {
                    if (kennungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kennung = null;
                    }
                }
            }
            {
                Boolean elementarproduktShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.elementarprodukt!= null)&&(!this.elementarprodukt.isEmpty())));
                if (elementarproduktShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTElementarprodukt> sourceElementarprodukt;
                    sourceElementarprodukt = (((this.elementarprodukt!= null)&&(!this.elementarprodukt.isEmpty()))?this.getElementarprodukt():null);
                    @SuppressWarnings("unchecked")
                    List<CTElementarprodukt> copyElementarprodukt = ((List<CTElementarprodukt> ) strategy.copy(LocatorUtils.property(locator, "elementarprodukt", sourceElementarprodukt), sourceElementarprodukt, ((this.elementarprodukt!= null)&&(!this.elementarprodukt.isEmpty()))));
                    copy.elementarprodukt = null;
                    if (copyElementarprodukt!= null) {
                        List<CTElementarprodukt> uniqueElementarproduktl = copy.getElementarprodukt();
                        uniqueElementarproduktl.addAll(copyElementarprodukt);
                    }
                } else {
                    if (elementarproduktShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.elementarprodukt = null;
                    }
                }
            }
            {
                Boolean dynamikShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.dynamik!= null)&&(!this.dynamik.isEmpty())));
                if (dynamikShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTDynamik> sourceDynamik;
                    sourceDynamik = (((this.dynamik!= null)&&(!this.dynamik.isEmpty()))?this.getDynamik():null);
                    @SuppressWarnings("unchecked")
                    List<CTDynamik> copyDynamik = ((List<CTDynamik> ) strategy.copy(LocatorUtils.property(locator, "dynamik", sourceDynamik), sourceDynamik, ((this.dynamik!= null)&&(!this.dynamik.isEmpty()))));
                    copy.dynamik = null;
                    if (copyDynamik!= null) {
                        List<CTDynamik> uniqueDynamikl = copy.getDynamik();
                        uniqueDynamikl.addAll(copyDynamik);
                    }
                } else {
                    if (dynamikShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dynamik = null;
                    }
                }
            }
            {
                Boolean kuendigungsklauselShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kuendigungsklausel!= null));
                if (kuendigungsklauselShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceKuendigungsklausel;
                    sourceKuendigungsklausel = this.isKuendigungsklausel();
                    Boolean copyKuendigungsklausel = ((Boolean) strategy.copy(LocatorUtils.property(locator, "kuendigungsklausel", sourceKuendigungsklausel), sourceKuendigungsklausel, (this.kuendigungsklausel!= null)));
                    copy.setKuendigungsklausel(copyKuendigungsklausel);
                } else {
                    if (kuendigungsklauselShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kuendigungsklausel = null;
                    }
                }
            }
            {
                Boolean besondererVerwendungszweckShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.besondererVerwendungszweck!= null));
                if (besondererVerwendungszweckShouldBeCopiedAndSet == Boolean.TRUE) {
                    STBesondererVerwendungszweck sourceBesondererVerwendungszweck;
                    sourceBesondererVerwendungszweck = this.getBesondererVerwendungszweck();
                    STBesondererVerwendungszweck copyBesondererVerwendungszweck = ((STBesondererVerwendungszweck) strategy.copy(LocatorUtils.property(locator, "besondererVerwendungszweck", sourceBesondererVerwendungszweck), sourceBesondererVerwendungszweck, (this.besondererVerwendungszweck!= null)));
                    copy.setBesondererVerwendungszweck(copyBesondererVerwendungszweck);
                } else {
                    if (besondererVerwendungszweckShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.besondererVerwendungszweck = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTProdukt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withSparte(STSparte value) {
        setSparte(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withPaket(STEPaket... values) {
        if (values!= null) {
            for (STEPaket value: values) {
                getPaket().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withPaket(Collection<STEPaket> values) {
        if (values!= null) {
            getPaket().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKennung(String value) {
        setKennung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withElementarprodukt(CTElementarprodukt... values) {
        if (values!= null) {
            for (CTElementarprodukt value: values) {
                getElementarprodukt().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withElementarprodukt(Collection<CTElementarprodukt> values) {
        if (values!= null) {
            getElementarprodukt().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withDynamik(CTDynamik... values) {
        if (values!= null) {
            for (CTDynamik value: values) {
                getDynamik().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withDynamik(Collection<CTDynamik> values) {
        if (values!= null) {
            getDynamik().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKuendigungsklausel(Boolean value) {
        setKuendigungsklausel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBesondererVerwendungszweck(STBesondererVerwendungszweck value) {
        setBesondererVerwendungszweck(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTProdukt withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
