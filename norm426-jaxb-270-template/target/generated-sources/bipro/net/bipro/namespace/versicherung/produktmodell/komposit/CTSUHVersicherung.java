
package net.bipro.namespace.versicherung.produktmodell.komposit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTStichtagsbetrag;
import net.bipro.namespace.allgemein.CTUnternehmen;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAbgangsgrund;
import net.bipro.namespace.datentypen.STBesondererVerwendungszweck;
import net.bipro.namespace.datentypen.STEBedingungen;
import net.bipro.namespace.datentypen.STEPaket;
import net.bipro.namespace.datentypen.STMeldeturnus;
import net.bipro.namespace.datentypen.STSparte;
import net.bipro.namespace.datentypen.STVersichertenkreis;
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
import net.bipro.namespace.versicherung.produktmodell.CTKlausel;
import net.bipro.namespace.versicherung.produktmodell.CTLeistungsausschluss;
import net.bipro.namespace.versicherung.produktmodell.CTProdukt;
import net.bipro.namespace.versicherung.produktmodell.CTSelbstbeteiligung;
import net.bipro.namespace.versicherung.produktmodell.CTVersicherungssummeOderLeistung;
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
 * <p>Java class for CT_SUHVersicherung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_SUHVersicherung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_Produkt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Versichertenkreis" type="{http://www.bipro.net/namespace/datentypen}ST_Versichertenkreis" minOccurs="0"/&gt;
 *         &lt;element name="Pauschaldeklaration" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Meldeverfahren" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="Meldeturnus" type="{http://www.bipro.net/namespace/datentypen}ST_Meldeturnus" minOccurs="0"/&gt;
 *         &lt;element name="Zeichnungsjahr" type="{http://www.bipro.net/namespace/datentypen}ST_Jahr" minOccurs="0"/&gt;
 *         &lt;element name="UnfallVersicherungJe" type="{http://www.bipro.net/namespace/versicherung/produktmodell/komposit}CT_UnfallversicherungJe" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_SUHVersicherung", propOrder = {
    "versichertenkreis",
    "pauschaldeklaration",
    "meldeverfahren",
    "meldeturnus",
    "zeichnungsjahr",
    "unfallVersicherungJe"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTSUHVersicherung
    extends CTProdukt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Versichertenkreis")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STVersichertenkreis versichertenkreis;
    @XmlElement(name = "Pauschaldeklaration")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean pauschaldeklaration;
    @XmlElement(name = "Meldeverfahren")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean meldeverfahren;
    @XmlElement(name = "Meldeturnus")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STMeldeturnus meldeturnus;
    @XmlElement(name = "Zeichnungsjahr")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer zeichnungsjahr;
    @XmlElement(name = "UnfallVersicherungJe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTUnfallversicherungJe> unfallVersicherungJe;

    /**
     * Gets the value of the versichertenkreis property.
     * 
     * @return
     *     possible object is
     *     {@link STVersichertenkreis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STVersichertenkreis getVersichertenkreis() {
        return versichertenkreis;
    }

    /**
     * Sets the value of the versichertenkreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link STVersichertenkreis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setVersichertenkreis(STVersichertenkreis value) {
        this.versichertenkreis = value;
    }

    /**
     * Gets the value of the pauschaldeklaration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isPauschaldeklaration() {
        return pauschaldeklaration;
    }

    /**
     * Sets the value of the pauschaldeklaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPauschaldeklaration(Boolean value) {
        this.pauschaldeklaration = value;
    }

    /**
     * Gets the value of the meldeverfahren property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isMeldeverfahren() {
        return meldeverfahren;
    }

    /**
     * Sets the value of the meldeverfahren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMeldeverfahren(Boolean value) {
        this.meldeverfahren = value;
    }

    /**
     * Gets the value of the meldeturnus property.
     * 
     * @return
     *     possible object is
     *     {@link STMeldeturnus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STMeldeturnus getMeldeturnus() {
        return meldeturnus;
    }

    /**
     * Sets the value of the meldeturnus property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMeldeturnus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMeldeturnus(STMeldeturnus value) {
        this.meldeturnus = value;
    }

    /**
     * Gets the value of the zeichnungsjahr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getZeichnungsjahr() {
        return zeichnungsjahr;
    }

    /**
     * Sets the value of the zeichnungsjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZeichnungsjahr(Integer value) {
        this.zeichnungsjahr = value;
    }

    /**
     * Gets the value of the unfallVersicherungJe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unfallVersicherungJe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnfallVersicherungJe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTUnfallversicherungJe }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTUnfallversicherungJe> getUnfallVersicherungJe() {
        if (unfallVersicherungJe == null) {
            unfallVersicherungJe = new ArrayList<CTUnfallversicherungJe>();
        }
        return this.unfallVersicherungJe;
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
        final CTSUHVersicherung that = ((CTSUHVersicherung) object);
        {
            STVersichertenkreis lhsVersichertenkreis;
            lhsVersichertenkreis = this.getVersichertenkreis();
            STVersichertenkreis rhsVersichertenkreis;
            rhsVersichertenkreis = that.getVersichertenkreis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertenkreis", lhsVersichertenkreis), LocatorUtils.property(thatLocator, "versichertenkreis", rhsVersichertenkreis), lhsVersichertenkreis, rhsVersichertenkreis, (this.versichertenkreis!= null), (that.versichertenkreis!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPauschaldeklaration;
            lhsPauschaldeklaration = this.isPauschaldeklaration();
            Boolean rhsPauschaldeklaration;
            rhsPauschaldeklaration = that.isPauschaldeklaration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pauschaldeklaration", lhsPauschaldeklaration), LocatorUtils.property(thatLocator, "pauschaldeklaration", rhsPauschaldeklaration), lhsPauschaldeklaration, rhsPauschaldeklaration, (this.pauschaldeklaration!= null), (that.pauschaldeklaration!= null))) {
                return false;
            }
        }
        {
            Boolean lhsMeldeverfahren;
            lhsMeldeverfahren = this.isMeldeverfahren();
            Boolean rhsMeldeverfahren;
            rhsMeldeverfahren = that.isMeldeverfahren();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meldeverfahren", lhsMeldeverfahren), LocatorUtils.property(thatLocator, "meldeverfahren", rhsMeldeverfahren), lhsMeldeverfahren, rhsMeldeverfahren, (this.meldeverfahren!= null), (that.meldeverfahren!= null))) {
                return false;
            }
        }
        {
            STMeldeturnus lhsMeldeturnus;
            lhsMeldeturnus = this.getMeldeturnus();
            STMeldeturnus rhsMeldeturnus;
            rhsMeldeturnus = that.getMeldeturnus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meldeturnus", lhsMeldeturnus), LocatorUtils.property(thatLocator, "meldeturnus", rhsMeldeturnus), lhsMeldeturnus, rhsMeldeturnus, (this.meldeturnus!= null), (that.meldeturnus!= null))) {
                return false;
            }
        }
        {
            Integer lhsZeichnungsjahr;
            lhsZeichnungsjahr = this.getZeichnungsjahr();
            Integer rhsZeichnungsjahr;
            rhsZeichnungsjahr = that.getZeichnungsjahr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeichnungsjahr", lhsZeichnungsjahr), LocatorUtils.property(thatLocator, "zeichnungsjahr", rhsZeichnungsjahr), lhsZeichnungsjahr, rhsZeichnungsjahr, (this.zeichnungsjahr!= null), (that.zeichnungsjahr!= null))) {
                return false;
            }
        }
        {
            List<CTUnfallversicherungJe> lhsUnfallVersicherungJe;
            lhsUnfallVersicherungJe = (((this.unfallVersicherungJe!= null)&&(!this.unfallVersicherungJe.isEmpty()))?this.getUnfallVersicherungJe():null);
            List<CTUnfallversicherungJe> rhsUnfallVersicherungJe;
            rhsUnfallVersicherungJe = (((that.unfallVersicherungJe!= null)&&(!that.unfallVersicherungJe.isEmpty()))?that.getUnfallVersicherungJe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unfallVersicherungJe", lhsUnfallVersicherungJe), LocatorUtils.property(thatLocator, "unfallVersicherungJe", rhsUnfallVersicherungJe), lhsUnfallVersicherungJe, rhsUnfallVersicherungJe, ((this.unfallVersicherungJe!= null)&&(!this.unfallVersicherungJe.isEmpty())), ((that.unfallVersicherungJe!= null)&&(!that.unfallVersicherungJe.isEmpty())))) {
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
            STVersichertenkreis theVersichertenkreis;
            theVersichertenkreis = this.getVersichertenkreis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertenkreis", theVersichertenkreis), currentHashCode, theVersichertenkreis, (this.versichertenkreis!= null));
        }
        {
            Boolean thePauschaldeklaration;
            thePauschaldeklaration = this.isPauschaldeklaration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pauschaldeklaration", thePauschaldeklaration), currentHashCode, thePauschaldeklaration, (this.pauschaldeklaration!= null));
        }
        {
            Boolean theMeldeverfahren;
            theMeldeverfahren = this.isMeldeverfahren();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meldeverfahren", theMeldeverfahren), currentHashCode, theMeldeverfahren, (this.meldeverfahren!= null));
        }
        {
            STMeldeturnus theMeldeturnus;
            theMeldeturnus = this.getMeldeturnus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meldeturnus", theMeldeturnus), currentHashCode, theMeldeturnus, (this.meldeturnus!= null));
        }
        {
            Integer theZeichnungsjahr;
            theZeichnungsjahr = this.getZeichnungsjahr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeichnungsjahr", theZeichnungsjahr), currentHashCode, theZeichnungsjahr, (this.zeichnungsjahr!= null));
        }
        {
            List<CTUnfallversicherungJe> theUnfallVersicherungJe;
            theUnfallVersicherungJe = (((this.unfallVersicherungJe!= null)&&(!this.unfallVersicherungJe.isEmpty()))?this.getUnfallVersicherungJe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unfallVersicherungJe", theUnfallVersicherungJe), currentHashCode, theUnfallVersicherungJe, ((this.unfallVersicherungJe!= null)&&(!this.unfallVersicherungJe.isEmpty())));
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
        if (draftCopy instanceof CTSUHVersicherung) {
            final CTSUHVersicherung copy = ((CTSUHVersicherung) draftCopy);
            {
                Boolean versichertenkreisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.versichertenkreis!= null));
                if (versichertenkreisShouldBeCopiedAndSet == Boolean.TRUE) {
                    STVersichertenkreis sourceVersichertenkreis;
                    sourceVersichertenkreis = this.getVersichertenkreis();
                    STVersichertenkreis copyVersichertenkreis = ((STVersichertenkreis) strategy.copy(LocatorUtils.property(locator, "versichertenkreis", sourceVersichertenkreis), sourceVersichertenkreis, (this.versichertenkreis!= null)));
                    copy.setVersichertenkreis(copyVersichertenkreis);
                } else {
                    if (versichertenkreisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertenkreis = null;
                    }
                }
            }
            {
                Boolean pauschaldeklarationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pauschaldeklaration!= null));
                if (pauschaldeklarationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePauschaldeklaration;
                    sourcePauschaldeklaration = this.isPauschaldeklaration();
                    Boolean copyPauschaldeklaration = ((Boolean) strategy.copy(LocatorUtils.property(locator, "pauschaldeklaration", sourcePauschaldeklaration), sourcePauschaldeklaration, (this.pauschaldeklaration!= null)));
                    copy.setPauschaldeklaration(copyPauschaldeklaration);
                } else {
                    if (pauschaldeklarationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pauschaldeklaration = null;
                    }
                }
            }
            {
                Boolean meldeverfahrenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.meldeverfahren!= null));
                if (meldeverfahrenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMeldeverfahren;
                    sourceMeldeverfahren = this.isMeldeverfahren();
                    Boolean copyMeldeverfahren = ((Boolean) strategy.copy(LocatorUtils.property(locator, "meldeverfahren", sourceMeldeverfahren), sourceMeldeverfahren, (this.meldeverfahren!= null)));
                    copy.setMeldeverfahren(copyMeldeverfahren);
                } else {
                    if (meldeverfahrenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.meldeverfahren = null;
                    }
                }
            }
            {
                Boolean meldeturnusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.meldeturnus!= null));
                if (meldeturnusShouldBeCopiedAndSet == Boolean.TRUE) {
                    STMeldeturnus sourceMeldeturnus;
                    sourceMeldeturnus = this.getMeldeturnus();
                    STMeldeturnus copyMeldeturnus = ((STMeldeturnus) strategy.copy(LocatorUtils.property(locator, "meldeturnus", sourceMeldeturnus), sourceMeldeturnus, (this.meldeturnus!= null)));
                    copy.setMeldeturnus(copyMeldeturnus);
                } else {
                    if (meldeturnusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.meldeturnus = null;
                    }
                }
            }
            {
                Boolean zeichnungsjahrShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeichnungsjahr!= null));
                if (zeichnungsjahrShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceZeichnungsjahr;
                    sourceZeichnungsjahr = this.getZeichnungsjahr();
                    Integer copyZeichnungsjahr = ((Integer) strategy.copy(LocatorUtils.property(locator, "zeichnungsjahr", sourceZeichnungsjahr), sourceZeichnungsjahr, (this.zeichnungsjahr!= null)));
                    copy.setZeichnungsjahr(copyZeichnungsjahr);
                } else {
                    if (zeichnungsjahrShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeichnungsjahr = null;
                    }
                }
            }
            {
                Boolean unfallVersicherungJeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.unfallVersicherungJe!= null)&&(!this.unfallVersicherungJe.isEmpty())));
                if (unfallVersicherungJeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTUnfallversicherungJe> sourceUnfallVersicherungJe;
                    sourceUnfallVersicherungJe = (((this.unfallVersicherungJe!= null)&&(!this.unfallVersicherungJe.isEmpty()))?this.getUnfallVersicherungJe():null);
                    @SuppressWarnings("unchecked")
                    List<CTUnfallversicherungJe> copyUnfallVersicherungJe = ((List<CTUnfallversicherungJe> ) strategy.copy(LocatorUtils.property(locator, "unfallVersicherungJe", sourceUnfallVersicherungJe), sourceUnfallVersicherungJe, ((this.unfallVersicherungJe!= null)&&(!this.unfallVersicherungJe.isEmpty()))));
                    copy.unfallVersicherungJe = null;
                    if (copyUnfallVersicherungJe!= null) {
                        List<CTUnfallversicherungJe> uniqueUnfallVersicherungJel = copy.getUnfallVersicherungJe();
                        uniqueUnfallVersicherungJel.addAll(copyUnfallVersicherungJe);
                    }
                } else {
                    if (unfallVersicherungJeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unfallVersicherungJe = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTSUHVersicherung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withVersichertenkreis(STVersichertenkreis value) {
        setVersichertenkreis(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withPauschaldeklaration(Boolean value) {
        setPauschaldeklaration(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withMeldeverfahren(Boolean value) {
        setMeldeverfahren(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withMeldeturnus(STMeldeturnus value) {
        setMeldeturnus(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withZeichnungsjahr(Integer value) {
        setZeichnungsjahr(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withUnfallVersicherungJe(CTUnfallversicherungJe... values) {
        if (values!= null) {
            for (CTUnfallversicherungJe value: values) {
                getUnfallVersicherungJe().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withUnfallVersicherungJe(Collection<CTUnfallversicherungJe> values) {
        if (values!= null) {
            getUnfallVersicherungJe().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withLeistungsausschluss(CTLeistungsausschluss... values) {
        if (values!= null) {
            for (CTLeistungsausschluss value: values) {
                getLeistungsausschluss().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withLeistungsausschluss(Collection<CTLeistungsausschluss> values) {
        if (values!= null) {
            getLeistungsausschluss().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withVersicherungssummeOderLeistung(CTVersicherungssummeOderLeistung... values) {
        if (values!= null) {
            for (CTVersicherungssummeOderLeistung value: values) {
                getVersicherungssummeOderLeistung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withVersicherungssummeOderLeistung(Collection<CTVersicherungssummeOderLeistung> values) {
        if (values!= null) {
            getVersicherungssummeOderLeistung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withSelbstbeteiligung(CTSelbstbeteiligung... values) {
        if (values!= null) {
            for (CTSelbstbeteiligung value: values) {
                getSelbstbeteiligung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withSelbstbeteiligung(Collection<CTSelbstbeteiligung> values) {
        if (values!= null) {
            getSelbstbeteiligung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withKlausel(CTKlausel... values) {
        if (values!= null) {
            for (CTKlausel value: values) {
                getKlausel().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withKlausel(Collection<CTKlausel> values) {
        if (values!= null) {
            getKlausel().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withSparte(STSparte value) {
        setSparte(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withPaket(STEPaket... values) {
        if (values!= null) {
            for (STEPaket value: values) {
                getPaket().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withPaket(Collection<STEPaket> values) {
        if (values!= null) {
            getPaket().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withKennung(String value) {
        setKennung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withElementarprodukt(CTElementarprodukt... values) {
        if (values!= null) {
            for (CTElementarprodukt value: values) {
                getElementarprodukt().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withElementarprodukt(Collection<CTElementarprodukt> values) {
        if (values!= null) {
            getElementarprodukt().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withDynamik(CTDynamik... values) {
        if (values!= null) {
            for (CTDynamik value: values) {
                getDynamik().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withDynamik(Collection<CTDynamik> values) {
        if (values!= null) {
            getDynamik().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withKuendigungsklausel(Boolean value) {
        setKuendigungsklausel(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withBesondererVerwendungszweck(STBesondererVerwendungszweck value) {
        setBesondererVerwendungszweck(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTSUHVersicherung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
