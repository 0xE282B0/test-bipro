
package net.bipro.namespace.produktmodell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Oberste Ebene der Produkthierarchie gemaess VAA-Modell. Buendelt Produkte und Verkaufsprodukte zu einer verkaufbaren Einheit. Darf nicht spartenspezifisch abgeleitet werden, da ansonsten die spartenuebergreifende Buendelung von Produkten innerhalb des Verkaufsproduktes nicht funktionieren kann.
 * 
 * <p>Java class for CT_Verkaufsprodukt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Verkaufsprodukt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/produktmodell}CT_Produktbaustein"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kennung" type="{http://www.bipro.net/namespace/datentypen}ST_VerkaufsproduktKennung" minOccurs="0"/&gt;
 *         &lt;element name="Produkt" type="{http://www.bipro.net/namespace/produktmodell}CT_Produkt" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Verkaufsprodukt", propOrder = {
    "kennung",
    "produkt"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVerkaufsprodukt
    extends CTProduktbaustein
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Kennung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String kennung;
    @XmlElement(name = "Produkt", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTProdukt> produkt;

    /**
     * Gets the value of the kennung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKennung(String value) {
        this.kennung = value;
    }

    /**
     * Gets the value of the produkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdukt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTProdukt }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTProdukt> getProdukt() {
        if (produkt == null) {
            produkt = new ArrayList<CTProdukt>();
        }
        return this.produkt;
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
        final CTVerkaufsprodukt that = ((CTVerkaufsprodukt) object);
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
            List<CTProdukt> lhsProdukt;
            lhsProdukt = (((this.produkt!= null)&&(!this.produkt.isEmpty()))?this.getProdukt():null);
            List<CTProdukt> rhsProdukt;
            rhsProdukt = (((that.produkt!= null)&&(!that.produkt.isEmpty()))?that.getProdukt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "produkt", lhsProdukt), LocatorUtils.property(thatLocator, "produkt", rhsProdukt), lhsProdukt, rhsProdukt, ((this.produkt!= null)&&(!this.produkt.isEmpty())), ((that.produkt!= null)&&(!that.produkt.isEmpty())))) {
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
            String theKennung;
            theKennung = this.getKennung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kennung", theKennung), currentHashCode, theKennung, (this.kennung!= null));
        }
        {
            List<CTProdukt> theProdukt;
            theProdukt = (((this.produkt!= null)&&(!this.produkt.isEmpty()))?this.getProdukt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "produkt", theProdukt), currentHashCode, theProdukt, ((this.produkt!= null)&&(!this.produkt.isEmpty())));
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
        if (draftCopy instanceof CTVerkaufsprodukt) {
            final CTVerkaufsprodukt copy = ((CTVerkaufsprodukt) draftCopy);
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
                Boolean produktShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.produkt!= null)&&(!this.produkt.isEmpty())));
                if (produktShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTProdukt> sourceProdukt;
                    sourceProdukt = (((this.produkt!= null)&&(!this.produkt.isEmpty()))?this.getProdukt():null);
                    @SuppressWarnings("unchecked")
                    List<CTProdukt> copyProdukt = ((List<CTProdukt> ) strategy.copy(LocatorUtils.property(locator, "produkt", sourceProdukt), sourceProdukt, ((this.produkt!= null)&&(!this.produkt.isEmpty()))));
                    copy.produkt = null;
                    if (copyProdukt!= null) {
                        List<CTProdukt> uniqueProduktl = copy.getProdukt();
                        uniqueProduktl.addAll(copyProdukt);
                    }
                } else {
                    if (produktShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.produkt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVerkaufsprodukt();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withKennung(String value) {
        setKennung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withProdukt(CTProdukt... values) {
        if (values!= null) {
            for (CTProdukt value: values) {
                getProdukt().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withProdukt(Collection<CTProdukt> values) {
        if (values!= null) {
            getProdukt().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVerkaufsprodukt withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
