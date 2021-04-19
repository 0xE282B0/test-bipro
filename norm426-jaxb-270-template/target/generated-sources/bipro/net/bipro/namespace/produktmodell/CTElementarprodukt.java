
package net.bipro.namespace.produktmodell;

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
 * Unterste Ebene der Produkthierarchie gemaess VAA-Modell. Kleinste tariefierbare Einheit. Spartenspezifisch abzuleiten und zu benennen (z.B. Deckung, Tarif, etc.).
 * 
 * <p>Java class for CT_Elementarprodukt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Elementarprodukt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/produktmodell}CT_Produktbaustein"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kennung" type="{http://www.bipro.net/namespace/datentypen}ST_ElementarproduktKennung" minOccurs="0"/&gt;
 *         &lt;element name="Dynamik" type="{http://www.bipro.net/namespace/produktmodell}CT_Dynamik" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "kennung",
    "dynamik"
})
@XmlSeeAlso({
    net.bipro.namespace.versicherung.produktmodell.CTElementarprodukt.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTElementarprodukt
    extends CTProduktbaustein
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Kennung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String kennung;
    @XmlElement(name = "Dynamik")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTDynamik> dynamik;

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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTDynamik> getDynamik() {
        if (dynamik == null) {
            dynamik = new ArrayList<CTDynamik>();
        }
        return this.dynamik;
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
        final CTElementarprodukt that = ((CTElementarprodukt) object);
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
            List<CTDynamik> lhsDynamik;
            lhsDynamik = (((this.dynamik!= null)&&(!this.dynamik.isEmpty()))?this.getDynamik():null);
            List<CTDynamik> rhsDynamik;
            rhsDynamik = (((that.dynamik!= null)&&(!that.dynamik.isEmpty()))?that.getDynamik():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dynamik", lhsDynamik), LocatorUtils.property(thatLocator, "dynamik", rhsDynamik), lhsDynamik, rhsDynamik, ((this.dynamik!= null)&&(!this.dynamik.isEmpty())), ((that.dynamik!= null)&&(!that.dynamik.isEmpty())))) {
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
            List<CTDynamik> theDynamik;
            theDynamik = (((this.dynamik!= null)&&(!this.dynamik.isEmpty()))?this.getDynamik():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dynamik", theDynamik), currentHashCode, theDynamik, ((this.dynamik!= null)&&(!this.dynamik.isEmpty())));
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
        super.copyTo(locator, target, strategy);
        if (target instanceof CTElementarprodukt) {
            final CTElementarprodukt copy = ((CTElementarprodukt) target);
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
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKennung(String value) {
        setKennung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withDynamik(CTDynamik... values) {
        if (values!= null) {
            for (CTDynamik value: values) {
                getDynamik().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withDynamik(Collection<CTDynamik> values) {
        if (values!= null) {
            getDynamik().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withGewuenschteZahlungsweise(STZahlungsweise... values) {
        if (values!= null) {
            for (STZahlungsweise value: values) {
                getGewuenschteZahlungsweise().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withGewuenschteZahlungsweise(Collection<STZahlungsweise> values) {
        if (values!= null) {
            getGewuenschteZahlungsweise().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKurzbeschreibung(String value) {
        setKurzbeschreibung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBedingungen(STEBedingungen... values) {
        if (values!= null) {
            for (STEBedingungen value: values) {
                getBedingungen().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBedingungen(Collection<STEBedingungen> values) {
        if (values!= null) {
            getBedingungen().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withUnternehmen(CTUnternehmen value) {
        setUnternehmen(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKondition(CTKondition... values) {
        if (values!= null) {
            for (CTKondition value: values) {
                getKondition().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withKondition(Collection<CTKondition> values) {
        if (values!= null) {
            getKondition().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBeitrag(CTBeitrag... values) {
        if (values!= null) {
            for (CTBeitrag value: values) {
                getBeitrag().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBeitrag(Collection<CTBeitrag> values) {
        if (values!= null) {
            getBeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withZusaetzlicheProduktbausteinDaten(CTZusaetzlicheProduktbausteinDaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheProduktbausteinDaten value: values) {
                getZusaetzlicheProduktbausteinDaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withZusaetzlicheProduktbausteinDaten(Collection<CTZusaetzlicheProduktbausteinDaten> values) {
        if (values!= null) {
            getZusaetzlicheProduktbausteinDaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVertragsform(STVertragsform value) {
        setVertragsform(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withStatus(STVertragsstatus value) {
        setStatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVertriebsname(String value) {
        setVertriebsname(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withStichtagswert(CTStichtagsbetrag... values) {
        if (values!= null) {
            for (CTStichtagsbetrag value: values) {
                getStichtagswert().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withStichtagswert(Collection<CTStichtagsbetrag> values) {
        if (values!= null) {
            getStichtagswert().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withVersicherungsdauer(CTZeitraum value) {
        setVersicherungsdauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withZertifizierungsdaten(CTZertifizierungsdaten value) {
        setZertifizierungsdaten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTElementarprodukt withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
