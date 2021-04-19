
package net.bipro.namespace.versicherung.produktmodell;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STEPortfoliobezeichnung;
import net.bipro.namespace.datentypen.STEPortfoliomanagement;
import net.bipro.namespace.datentypen.STPhase;
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
 * Das Fonds-Portfolio einer fondsgebundenen Versicherung
 * 
 * <p>Java class for CT_FondsPortfolio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_FondsPortfolio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Portfoliobezeichnung" type="{http://www.bipro.net/namespace/datentypen}STE_Portfoliobezeichnung" minOccurs="0"/&gt;
 *         &lt;element name="Portfoliomanagement" type="{http://www.bipro.net/namespace/datentypen}STE_Portfoliomanagement" minOccurs="0"/&gt;
 *         &lt;element name="Beitragsgarantie" type="{http://www.bipro.net/namespace/datentypen}ST_Faktor" minOccurs="0"/&gt;
 *         &lt;element name="Phase" type="{http://www.bipro.net/namespace/datentypen}ST_Phase" minOccurs="0"/&gt;
 *         &lt;element name="Hoechststandsicherung" type="{http://www.bipro.net/namespace/datentypen}ST_Prozent" minOccurs="0"/&gt;
 *         &lt;element name="FondsAnteil" type="{http://www.bipro.net/namespace/versicherung/produktmodell}CT_FondsAnteil" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_FondsPortfolio", propOrder = {
    "portfoliobezeichnung",
    "portfoliomanagement",
    "beitragsgarantie",
    "phase",
    "hoechststandsicherung",
    "fondsAnteil"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTFondsPortfolio
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Portfoliobezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEPortfoliobezeichnung portfoliobezeichnung;
    @XmlElement(name = "Portfoliomanagement")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STEPortfoliomanagement portfoliomanagement;
    @XmlElement(name = "Beitragsgarantie")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal beitragsgarantie;
    @XmlElement(name = "Phase")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STPhase phase;
    @XmlElement(name = "Hoechststandsicherung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected BigDecimal hoechststandsicherung;
    @XmlElement(name = "FondsAnteil")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTFondsAnteil> fondsAnteil;

    /**
     * Gets the value of the portfoliobezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link STEPortfoliobezeichnung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEPortfoliobezeichnung getPortfoliobezeichnung() {
        return portfoliobezeichnung;
    }

    /**
     * Sets the value of the portfoliobezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEPortfoliobezeichnung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPortfoliobezeichnung(STEPortfoliobezeichnung value) {
        this.portfoliobezeichnung = value;
    }

    /**
     * Gets the value of the portfoliomanagement property.
     * 
     * @return
     *     possible object is
     *     {@link STEPortfoliomanagement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STEPortfoliomanagement getPortfoliomanagement() {
        return portfoliomanagement;
    }

    /**
     * Sets the value of the portfoliomanagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link STEPortfoliomanagement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPortfoliomanagement(STEPortfoliomanagement value) {
        this.portfoliomanagement = value;
    }

    /**
     * Gets the value of the beitragsgarantie property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getBeitragsgarantie() {
        return beitragsgarantie;
    }

    /**
     * Sets the value of the beitragsgarantie property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBeitragsgarantie(BigDecimal value) {
        this.beitragsgarantie = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link STPhase }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STPhase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link STPhase }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPhase(STPhase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the hoechststandsicherung property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public BigDecimal getHoechststandsicherung() {
        return hoechststandsicherung;
    }

    /**
     * Sets the value of the hoechststandsicherung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setHoechststandsicherung(BigDecimal value) {
        this.hoechststandsicherung = value;
    }

    /**
     * Gets the value of the fondsAnteil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fondsAnteil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFondsAnteil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTFondsAnteil }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTFondsAnteil> getFondsAnteil() {
        if (fondsAnteil == null) {
            fondsAnteil = new ArrayList<CTFondsAnteil>();
        }
        return this.fondsAnteil;
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
        final CTFondsPortfolio that = ((CTFondsPortfolio) object);
        {
            STEPortfoliobezeichnung lhsPortfoliobezeichnung;
            lhsPortfoliobezeichnung = this.getPortfoliobezeichnung();
            STEPortfoliobezeichnung rhsPortfoliobezeichnung;
            rhsPortfoliobezeichnung = that.getPortfoliobezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portfoliobezeichnung", lhsPortfoliobezeichnung), LocatorUtils.property(thatLocator, "portfoliobezeichnung", rhsPortfoliobezeichnung), lhsPortfoliobezeichnung, rhsPortfoliobezeichnung, (this.portfoliobezeichnung!= null), (that.portfoliobezeichnung!= null))) {
                return false;
            }
        }
        {
            STEPortfoliomanagement lhsPortfoliomanagement;
            lhsPortfoliomanagement = this.getPortfoliomanagement();
            STEPortfoliomanagement rhsPortfoliomanagement;
            rhsPortfoliomanagement = that.getPortfoliomanagement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portfoliomanagement", lhsPortfoliomanagement), LocatorUtils.property(thatLocator, "portfoliomanagement", rhsPortfoliomanagement), lhsPortfoliomanagement, rhsPortfoliomanagement, (this.portfoliomanagement!= null), (that.portfoliomanagement!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBeitragsgarantie;
            lhsBeitragsgarantie = this.getBeitragsgarantie();
            BigDecimal rhsBeitragsgarantie;
            rhsBeitragsgarantie = that.getBeitragsgarantie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beitragsgarantie", lhsBeitragsgarantie), LocatorUtils.property(thatLocator, "beitragsgarantie", rhsBeitragsgarantie), lhsBeitragsgarantie, rhsBeitragsgarantie, (this.beitragsgarantie!= null), (that.beitragsgarantie!= null))) {
                return false;
            }
        }
        {
            STPhase lhsPhase;
            lhsPhase = this.getPhase();
            STPhase rhsPhase;
            rhsPhase = that.getPhase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phase", lhsPhase), LocatorUtils.property(thatLocator, "phase", rhsPhase), lhsPhase, rhsPhase, (this.phase!= null), (that.phase!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHoechststandsicherung;
            lhsHoechststandsicherung = this.getHoechststandsicherung();
            BigDecimal rhsHoechststandsicherung;
            rhsHoechststandsicherung = that.getHoechststandsicherung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hoechststandsicherung", lhsHoechststandsicherung), LocatorUtils.property(thatLocator, "hoechststandsicherung", rhsHoechststandsicherung), lhsHoechststandsicherung, rhsHoechststandsicherung, (this.hoechststandsicherung!= null), (that.hoechststandsicherung!= null))) {
                return false;
            }
        }
        {
            List<CTFondsAnteil> lhsFondsAnteil;
            lhsFondsAnteil = (((this.fondsAnteil!= null)&&(!this.fondsAnteil.isEmpty()))?this.getFondsAnteil():null);
            List<CTFondsAnteil> rhsFondsAnteil;
            rhsFondsAnteil = (((that.fondsAnteil!= null)&&(!that.fondsAnteil.isEmpty()))?that.getFondsAnteil():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fondsAnteil", lhsFondsAnteil), LocatorUtils.property(thatLocator, "fondsAnteil", rhsFondsAnteil), lhsFondsAnteil, rhsFondsAnteil, ((this.fondsAnteil!= null)&&(!this.fondsAnteil.isEmpty())), ((that.fondsAnteil!= null)&&(!that.fondsAnteil.isEmpty())))) {
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
            STEPortfoliobezeichnung thePortfoliobezeichnung;
            thePortfoliobezeichnung = this.getPortfoliobezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portfoliobezeichnung", thePortfoliobezeichnung), currentHashCode, thePortfoliobezeichnung, (this.portfoliobezeichnung!= null));
        }
        {
            STEPortfoliomanagement thePortfoliomanagement;
            thePortfoliomanagement = this.getPortfoliomanagement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portfoliomanagement", thePortfoliomanagement), currentHashCode, thePortfoliomanagement, (this.portfoliomanagement!= null));
        }
        {
            BigDecimal theBeitragsgarantie;
            theBeitragsgarantie = this.getBeitragsgarantie();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beitragsgarantie", theBeitragsgarantie), currentHashCode, theBeitragsgarantie, (this.beitragsgarantie!= null));
        }
        {
            STPhase thePhase;
            thePhase = this.getPhase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phase", thePhase), currentHashCode, thePhase, (this.phase!= null));
        }
        {
            BigDecimal theHoechststandsicherung;
            theHoechststandsicherung = this.getHoechststandsicherung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hoechststandsicherung", theHoechststandsicherung), currentHashCode, theHoechststandsicherung, (this.hoechststandsicherung!= null));
        }
        {
            List<CTFondsAnteil> theFondsAnteil;
            theFondsAnteil = (((this.fondsAnteil!= null)&&(!this.fondsAnteil.isEmpty()))?this.getFondsAnteil():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fondsAnteil", theFondsAnteil), currentHashCode, theFondsAnteil, ((this.fondsAnteil!= null)&&(!this.fondsAnteil.isEmpty())));
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
        if (draftCopy instanceof CTFondsPortfolio) {
            final CTFondsPortfolio copy = ((CTFondsPortfolio) draftCopy);
            {
                Boolean portfoliobezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.portfoliobezeichnung!= null));
                if (portfoliobezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEPortfoliobezeichnung sourcePortfoliobezeichnung;
                    sourcePortfoliobezeichnung = this.getPortfoliobezeichnung();
                    STEPortfoliobezeichnung copyPortfoliobezeichnung = ((STEPortfoliobezeichnung) strategy.copy(LocatorUtils.property(locator, "portfoliobezeichnung", sourcePortfoliobezeichnung), sourcePortfoliobezeichnung, (this.portfoliobezeichnung!= null)));
                    copy.setPortfoliobezeichnung(copyPortfoliobezeichnung);
                } else {
                    if (portfoliobezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.portfoliobezeichnung = null;
                    }
                }
            }
            {
                Boolean portfoliomanagementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.portfoliomanagement!= null));
                if (portfoliomanagementShouldBeCopiedAndSet == Boolean.TRUE) {
                    STEPortfoliomanagement sourcePortfoliomanagement;
                    sourcePortfoliomanagement = this.getPortfoliomanagement();
                    STEPortfoliomanagement copyPortfoliomanagement = ((STEPortfoliomanagement) strategy.copy(LocatorUtils.property(locator, "portfoliomanagement", sourcePortfoliomanagement), sourcePortfoliomanagement, (this.portfoliomanagement!= null)));
                    copy.setPortfoliomanagement(copyPortfoliomanagement);
                } else {
                    if (portfoliomanagementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.portfoliomanagement = null;
                    }
                }
            }
            {
                Boolean beitragsgarantieShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beitragsgarantie!= null));
                if (beitragsgarantieShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBeitragsgarantie;
                    sourceBeitragsgarantie = this.getBeitragsgarantie();
                    BigDecimal copyBeitragsgarantie = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "beitragsgarantie", sourceBeitragsgarantie), sourceBeitragsgarantie, (this.beitragsgarantie!= null)));
                    copy.setBeitragsgarantie(copyBeitragsgarantie);
                } else {
                    if (beitragsgarantieShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beitragsgarantie = null;
                    }
                }
            }
            {
                Boolean phaseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phase!= null));
                if (phaseShouldBeCopiedAndSet == Boolean.TRUE) {
                    STPhase sourcePhase;
                    sourcePhase = this.getPhase();
                    STPhase copyPhase = ((STPhase) strategy.copy(LocatorUtils.property(locator, "phase", sourcePhase), sourcePhase, (this.phase!= null)));
                    copy.setPhase(copyPhase);
                } else {
                    if (phaseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phase = null;
                    }
                }
            }
            {
                Boolean hoechststandsicherungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hoechststandsicherung!= null));
                if (hoechststandsicherungShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHoechststandsicherung;
                    sourceHoechststandsicherung = this.getHoechststandsicherung();
                    BigDecimal copyHoechststandsicherung = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "hoechststandsicherung", sourceHoechststandsicherung), sourceHoechststandsicherung, (this.hoechststandsicherung!= null)));
                    copy.setHoechststandsicherung(copyHoechststandsicherung);
                } else {
                    if (hoechststandsicherungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hoechststandsicherung = null;
                    }
                }
            }
            {
                Boolean fondsAnteilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.fondsAnteil!= null)&&(!this.fondsAnteil.isEmpty())));
                if (fondsAnteilShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTFondsAnteil> sourceFondsAnteil;
                    sourceFondsAnteil = (((this.fondsAnteil!= null)&&(!this.fondsAnteil.isEmpty()))?this.getFondsAnteil():null);
                    @SuppressWarnings("unchecked")
                    List<CTFondsAnteil> copyFondsAnteil = ((List<CTFondsAnteil> ) strategy.copy(LocatorUtils.property(locator, "fondsAnteil", sourceFondsAnteil), sourceFondsAnteil, ((this.fondsAnteil!= null)&&(!this.fondsAnteil.isEmpty()))));
                    copy.fondsAnteil = null;
                    if (copyFondsAnteil!= null) {
                        List<CTFondsAnteil> uniqueFondsAnteill = copy.getFondsAnteil();
                        uniqueFondsAnteill.addAll(copyFondsAnteil);
                    }
                } else {
                    if (fondsAnteilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fondsAnteil = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFondsPortfolio();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withPortfoliobezeichnung(STEPortfoliobezeichnung value) {
        setPortfoliobezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withPortfoliomanagement(STEPortfoliomanagement value) {
        setPortfoliomanagement(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withBeitragsgarantie(BigDecimal value) {
        setBeitragsgarantie(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withPhase(STPhase value) {
        setPhase(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withHoechststandsicherung(BigDecimal value) {
        setHoechststandsicherung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withFondsAnteil(CTFondsAnteil... values) {
        if (values!= null) {
            for (CTFondsAnteil value: values) {
                getFondsAnteil().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withFondsAnteil(Collection<CTFondsAnteil> values) {
        if (values!= null) {
            getFondsAnteil().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTFondsPortfolio withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
