
package net.bipro.namespace.vertrag;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTAktivitaet;
import net.bipro.namespace.allgemein.CTGegenstand;
import net.bipro.namespace.allgemein.CTVermittler;
import net.bipro.namespace.allgemein.CTVertragsnummer;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STAbgangsgrund;
import net.bipro.namespace.datentypen.STAntragsstatus;
import net.bipro.namespace.datentypen.STArtDerBeratung;
import net.bipro.namespace.datentypen.STFremdversicherungsart;
import net.bipro.namespace.datentypen.STInkassoart;
import net.bipro.namespace.datentypen.STVertragsentstehung;
import net.bipro.namespace.datentypen.STVertragsstatus;
import net.bipro.namespace.datentypen.STZahlungsart;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTBeitragszahler;
import net.bipro.namespace.partner.CTPartner;
import net.bipro.namespace.partner.CTPersonengruppe;
import net.bipro.namespace.partner.CTVertragspartner;
import net.bipro.namespace.produktmodell.CTVerkaufsprodukt;
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
 * Angaben zu bestehenden oder beendeten Vor- bzw. Nebenverträgen.
 * 
 * <p>Java class for CT_VorNebenVertrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_VorNebenVertrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/vertrag}CT_Vertrag"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Fremdversicherungsart" minOccurs="0"/&gt;
 *         &lt;element name="Ablehnungsgrund" type="{http://www.bipro.net/namespace/datentypen}ST_Text1000" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_VorNebenVertrag", propOrder = {
    "artID",
    "ablehnungsgrund"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTVorNebenVertrag
    extends CTVertrag
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STFremdversicherungsart artID;
    @XmlElement(name = "Ablehnungsgrund")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String ablehnungsgrund;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STFremdversicherungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STFremdversicherungsart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STFremdversicherungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STFremdversicherungsart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the ablehnungsgrund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getAblehnungsgrund() {
        return ablehnungsgrund;
    }

    /**
     * Sets the value of the ablehnungsgrund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAblehnungsgrund(String value) {
        this.ablehnungsgrund = value;
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
        final CTVorNebenVertrag that = ((CTVorNebenVertrag) object);
        {
            STFremdversicherungsart lhsArtID;
            lhsArtID = this.getArtID();
            STFremdversicherungsart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsAblehnungsgrund;
            lhsAblehnungsgrund = this.getAblehnungsgrund();
            String rhsAblehnungsgrund;
            rhsAblehnungsgrund = that.getAblehnungsgrund();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ablehnungsgrund", lhsAblehnungsgrund), LocatorUtils.property(thatLocator, "ablehnungsgrund", rhsAblehnungsgrund), lhsAblehnungsgrund, rhsAblehnungsgrund, (this.ablehnungsgrund!= null), (that.ablehnungsgrund!= null))) {
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
            STFremdversicherungsart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theAblehnungsgrund;
            theAblehnungsgrund = this.getAblehnungsgrund();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ablehnungsgrund", theAblehnungsgrund), currentHashCode, theAblehnungsgrund, (this.ablehnungsgrund!= null));
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
        if (draftCopy instanceof CTVorNebenVertrag) {
            final CTVorNebenVertrag copy = ((CTVorNebenVertrag) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STFremdversicherungsart sourceArtID;
                    sourceArtID = this.getArtID();
                    STFremdversicherungsart copyArtID = ((STFremdversicherungsart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean ablehnungsgrundShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ablehnungsgrund!= null));
                if (ablehnungsgrundShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAblehnungsgrund;
                    sourceAblehnungsgrund = this.getAblehnungsgrund();
                    String copyAblehnungsgrund = ((String) strategy.copy(LocatorUtils.property(locator, "ablehnungsgrund", sourceAblehnungsgrund), sourceAblehnungsgrund, (this.ablehnungsgrund!= null)));
                    copy.setAblehnungsgrund(copyAblehnungsgrund);
                } else {
                    if (ablehnungsgrundShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ablehnungsgrund = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTVorNebenVertrag();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withArtID(STFremdversicherungsart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAblehnungsgrund(String value) {
        setAblehnungsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAbgangsdatum(String value) {
        setAbgangsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAbgangsgrund(STAbgangsgrund value) {
        setAbgangsgrund(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAktenzeichenVM(String value) {
        setAktenzeichenVM(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAntragsdatum(String value) {
        setAntragsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAntragsstatus(STAntragsstatus value) {
        setAntragsstatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withGueltigAbDatum(String value) {
        setGueltigAbDatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withGueltigBisDatum(String value) {
        setGueltigBisDatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withHauptfaelligkeit(String value) {
        setHauptfaelligkeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withInkassoart(STInkassoart value) {
        setInkassoart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withKuendigungsklausel(Boolean value) {
        setKuendigungsklausel(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragsbeginn(String value) {
        setVertragsbeginn(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragsstatus(STVertragsstatus value) {
        setVertragsstatus(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withZahlungsart(STZahlungsart value) {
        setZahlungsart(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withZahlungsweise(STZahlungsweise value) {
        setZahlungsweise(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVerkaufsprodukt(CTVerkaufsprodukt... values) {
        if (values!= null) {
            for (CTVerkaufsprodukt value: values) {
                getVerkaufsprodukt().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVerkaufsprodukt(Collection<CTVerkaufsprodukt> values) {
        if (values!= null) {
            getVerkaufsprodukt().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVermittler(CTVermittler... values) {
        if (values!= null) {
            for (CTVermittler value: values) {
                getVermittler().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVermittler(Collection<CTVermittler> values) {
        if (values!= null) {
            getVermittler().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withPartner(CTPartner... values) {
        if (values!= null) {
            for (CTPartner value: values) {
                getPartner().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withPartner(Collection<CTPartner> values) {
        if (values!= null) {
            getPartner().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withGegenstand(CTGegenstand... values) {
        if (values!= null) {
            for (CTGegenstand value: values) {
                getGegenstand().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withGegenstand(Collection<CTGegenstand> values) {
        if (values!= null) {
            getGegenstand().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withBeitragszahler(CTBeitragszahler value) {
        setBeitragszahler(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragsnummer(CTVertragsnummer value) {
        setVertragsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAktivitaet(CTAktivitaet... values) {
        if (values!= null) {
            for (CTAktivitaet value: values) {
                getAktivitaet().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAktivitaet(Collection<CTAktivitaet> values) {
        if (values!= null) {
            getAktivitaet().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAktenzeichenVertragspartner(String value) {
        setAktenzeichenVertragspartner(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAenderungsdatum(String value) {
        setAenderungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAenderungsgrund(String... values) {
        if (values!= null) {
            for (String value: values) {
                getAenderungsgrund().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAenderungsgrund(Collection<String> values) {
        if (values!= null) {
            getAenderungsgrund().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAntragsnummerVM(String value) {
        setAntragsnummerVM(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAntragseingangsdatum(String value) {
        setAntragseingangsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withPolicierungsdatum(String value) {
        setPolicierungsdatum(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragsentstehung(STVertragsentstehung value) {
        setVertragsentstehung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withArtDerBeratung(STArtDerBeratung value) {
        setArtDerBeratung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAntragsnummer(String value) {
        setAntragsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withAlteVertragsnummer(CTVertragsnummer value) {
        setAlteVertragsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withPersonengruppe(CTPersonengruppe... values) {
        if (values!= null) {
            for (CTPersonengruppe value: values) {
                getPersonengruppe().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withPersonengruppe(Collection<CTPersonengruppe> values) {
        if (values!= null) {
            getPersonengruppe().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withBearbeitendeStelle(CTBearbeitendeStelle value) {
        setBearbeitendeStelle(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragsnummerVM(CTVertragsnummer value) {
        setVertragsnummerVM(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragsverbindungsnummer(CTVertragsnummer... values) {
        if (values!= null) {
            for (CTVertragsnummer value: values) {
                getVertragsverbindungsnummer().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragsverbindungsnummer(Collection<CTVertragsnummer> values) {
        if (values!= null) {
            getVertragsverbindungsnummer().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withVertragspartner(CTVertragspartner value) {
        setVertragspartner(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withLeistungsstoerung(Boolean value) {
        setLeistungsstoerung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withZahltermin(String value) {
        setZahltermin(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withZusaetzlicheVertragsdaten(CTZusaetzlicheVertragsdaten... values) {
        if (values!= null) {
            for (CTZusaetzlicheVertragsdaten value: values) {
                getZusaetzlicheVertragsdaten().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withZusaetzlicheVertragsdaten(Collection<CTZusaetzlicheVertragsdaten> values) {
        if (values!= null) {
            getZusaetzlicheVertragsdaten().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTVorNebenVertrag withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
