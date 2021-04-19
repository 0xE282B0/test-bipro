
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.kapitalanlage.basis.CTAbtretungsglaeubiger;
import net.bipro.namespace.produktmodell.CTBeitragsschuldner;
import net.bipro.namespace.sachen.CTAbsender;
import net.bipro.namespace.sachen.CTEigentuemer;
import net.bipro.namespace.sachen.CTEmpfaenger;
import net.bipro.namespace.sachen.CTMieter;
import net.bipro.namespace.sachen.CTVermieter;
import net.bipro.namespace.sepa.CTAbweichenderSchuldner;
import net.bipro.namespace.sepa.CTMandatgeber;
import net.bipro.namespace.versicherung.haftpflicht.CTDiensthaftpflichtGiltFuer;
import net.bipro.namespace.versicherung.haftpflicht.CTMitversicherteNichtehelicheLebensgemeinschaft;
import net.bipro.namespace.versicherung.haftpflicht.CTMitversichertePerson;
import net.bipro.namespace.versicherung.haftpflicht.CTMitversicherterAngehoeriger;
import net.bipro.namespace.versicherung.haftpflicht.CTUntereJagdbehoerde;
import net.bipro.namespace.versicherung.produktmodell.CTBestaetigungsempfaenger;
import net.bipro.namespace.versicherung.produktmodell.CTBezugsberechtigter;
import net.bipro.namespace.versicherung.produktmodell.komposit.CTVersichertePerson;
import net.bipro.namespace.vertrag.CTBearbeitendeStelle;
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
 * Die Rolle des Partners innerhalb eines konkreten Kontexts innerhalb der Nachricht. Alle Partner werden innerhalb einer Liste unterhalb des Wurzelelements der Nachricht (i.d.R. abgeleitet von Geschaeftsvorgang) uebertragen und aus dem jeweiligen Kontext, aus dem sie benoetigt werden, mit Hilfe einer von diesem Datentypen abgeleiteten Rolle referenziert.
 * 
 * Hierfuer enthaelt Partnerrolle ein Attribut von Typ ST_PartnerID, dessen Wert mit dem Wert des Attributs PartnerID (ebenfalls vom Typ ST_PartnerID) eines in der oben angesprochenen Liste enthaltenen Partners uebereinstimmen muss.
 * 
 * Wenn der Partner nicht übertragen werden kann bzw. darf, MUSS im referenzierten Partner-Objekt nur die PartnerID übertragen werden.
 * 
 * <p>Java class for CT_Partnerrolle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Partnerrolle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerID" type="{http://www.bipro.net/namespace/datentypen}ST_ID"/&gt;
 *         &lt;element name="Gueltigkeit" type="{http://www.bipro.net/namespace/allgemein}CT_Zeitraum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Partnerrolle", propOrder = {
    "partnerID",
    "gueltigkeit"
})
@XmlSeeAlso({
    CTAbweichenderSchuldner.class,
    CTMandatgeber.class,
    CTBeitragsschuldner.class,
    CTBestaetigungsempfaenger.class,
    CTBezugsberechtigter.class,
    CTDiensthaftpflichtGiltFuer.class,
    CTMitversicherteNichtehelicheLebensgemeinschaft.class,
    CTMitversichertePerson.class,
    CTMitversicherterAngehoeriger.class,
    CTUntereJagdbehoerde.class,
    CTVersichertePerson.class,
    CTAbsender.class,
    CTEigentuemer.class,
    CTEmpfaenger.class,
    CTMieter.class,
    CTVermieter.class,
    CTArbeitgeber.class,
    CTArzt.class,
    CTBeitragszahler.class,
    CTBerufsgenossenschaft.class,
    CTHandeltAufRechnungVon.class,
    CTKommunikationspartner.class,
    CTKrankenhaus.class,
    CTKrankenkasse.class,
    CTPartnerbeziehung.class,
    CTPersonengruppenMitglied.class,
    CTSicherungsglaeubiger.class,
    CTVertragspartner.class,
    CTVertrauensperson.class,
    CTVertretungsberechtigter.class,
    CTVollmachtgeber.class,
    CTBearbeitendeStelle.class,
    CTAbtretungsglaeubiger.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTPartnerrolle
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "PartnerID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String partnerID;
    @XmlElement(name = "Gueltigkeit")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTZeitraum gueltigkeit;

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the gueltigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    /**
     * Sets the value of the gueltigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTZeitraum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGueltigkeit(CTZeitraum value) {
        this.gueltigkeit = value;
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
        final CTPartnerrolle that = ((CTPartnerrolle) object);
        {
            String lhsPartnerID;
            lhsPartnerID = this.getPartnerID();
            String rhsPartnerID;
            rhsPartnerID = that.getPartnerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerID", lhsPartnerID), LocatorUtils.property(thatLocator, "partnerID", rhsPartnerID), lhsPartnerID, rhsPartnerID, (this.partnerID!= null), (that.partnerID!= null))) {
                return false;
            }
        }
        {
            CTZeitraum lhsGueltigkeit;
            lhsGueltigkeit = this.getGueltigkeit();
            CTZeitraum rhsGueltigkeit;
            rhsGueltigkeit = that.getGueltigkeit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigkeit", lhsGueltigkeit), LocatorUtils.property(thatLocator, "gueltigkeit", rhsGueltigkeit), lhsGueltigkeit, rhsGueltigkeit, (this.gueltigkeit!= null), (that.gueltigkeit!= null))) {
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
            String thePartnerID;
            thePartnerID = this.getPartnerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerID", thePartnerID), currentHashCode, thePartnerID, (this.partnerID!= null));
        }
        {
            CTZeitraum theGueltigkeit;
            theGueltigkeit = this.getGueltigkeit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigkeit", theGueltigkeit), currentHashCode, theGueltigkeit, (this.gueltigkeit!= null));
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
        if (target instanceof CTPartnerrolle) {
            final CTPartnerrolle copy = ((CTPartnerrolle) target);
            {
                Boolean partnerIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.partnerID!= null));
                if (partnerIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePartnerID;
                    sourcePartnerID = this.getPartnerID();
                    String copyPartnerID = ((String) strategy.copy(LocatorUtils.property(locator, "partnerID", sourcePartnerID), sourcePartnerID, (this.partnerID!= null)));
                    copy.setPartnerID(copyPartnerID);
                } else {
                    if (partnerIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.partnerID = null;
                    }
                }
            }
            {
                Boolean gueltigkeitShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigkeit!= null));
                if (gueltigkeitShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTZeitraum sourceGueltigkeit;
                    sourceGueltigkeit = this.getGueltigkeit();
                    CTZeitraum copyGueltigkeit = ((CTZeitraum) strategy.copy(LocatorUtils.property(locator, "gueltigkeit", sourceGueltigkeit), sourceGueltigkeit, (this.gueltigkeit!= null)));
                    copy.setGueltigkeit(copyGueltigkeit);
                } else {
                    if (gueltigkeitShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigkeit = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnerrolle withPartnerID(String value) {
        setPartnerID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnerrolle withGueltigkeit(CTZeitraum value) {
        setGueltigkeit(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnerrolle withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPartnerrolle withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
