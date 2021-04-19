
package net.bipro.namespace.versicherung.haftpflicht;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STArtDesVorhabens;
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
 * <p>Java class for CT_Bauherren complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Bauherren"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fertigstellung" type="{http://www.bipro.net/namespace/datentypen}ST_Datum" minOccurs="0"/&gt;
 *         &lt;element name="ArtEigenleistung" type="{http://www.bipro.net/namespace/datentypen}ST_Text080" minOccurs="0"/&gt;
 *         &lt;element name="Wagnisanschrift" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_Wagnisanschrift" minOccurs="0"/&gt;
 *         &lt;element name="ArtBauvorhaben" type="{http://www.bipro.net/namespace/datentypen}ST_ArtDesVorhabens" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Bauherren", propOrder = {
    "fertigstellung",
    "artEigenleistung",
    "wagnisanschrift",
    "artBauvorhaben"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTBauherren
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Fertigstellung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String fertigstellung;
    @XmlElement(name = "ArtEigenleistung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String artEigenleistung;
    @XmlElement(name = "Wagnisanschrift")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected CTWagnisanschrift wagnisanschrift;
    @XmlElement(name = "ArtBauvorhaben")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STArtDesVorhabens artBauvorhaben;

    /**
     * Gets the value of the fertigstellung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFertigstellung() {
        return fertigstellung;
    }

    /**
     * Sets the value of the fertigstellung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFertigstellung(String value) {
        this.fertigstellung = value;
    }

    /**
     * Gets the value of the artEigenleistung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getArtEigenleistung() {
        return artEigenleistung;
    }

    /**
     * Sets the value of the artEigenleistung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtEigenleistung(String value) {
        this.artEigenleistung = value;
    }

    /**
     * Gets the value of the wagnisanschrift property.
     * 
     * @return
     *     possible object is
     *     {@link CTWagnisanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTWagnisanschrift getWagnisanschrift() {
        return wagnisanschrift;
    }

    /**
     * Sets the value of the wagnisanschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTWagnisanschrift }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWagnisanschrift(CTWagnisanschrift value) {
        this.wagnisanschrift = value;
    }

    /**
     * Gets the value of the artBauvorhaben property.
     * 
     * @return
     *     possible object is
     *     {@link STArtDesVorhabens }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STArtDesVorhabens getArtBauvorhaben() {
        return artBauvorhaben;
    }

    /**
     * Sets the value of the artBauvorhaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link STArtDesVorhabens }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtBauvorhaben(STArtDesVorhabens value) {
        this.artBauvorhaben = value;
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
        final CTBauherren that = ((CTBauherren) object);
        {
            String lhsFertigstellung;
            lhsFertigstellung = this.getFertigstellung();
            String rhsFertigstellung;
            rhsFertigstellung = that.getFertigstellung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fertigstellung", lhsFertigstellung), LocatorUtils.property(thatLocator, "fertigstellung", rhsFertigstellung), lhsFertigstellung, rhsFertigstellung, (this.fertigstellung!= null), (that.fertigstellung!= null))) {
                return false;
            }
        }
        {
            String lhsArtEigenleistung;
            lhsArtEigenleistung = this.getArtEigenleistung();
            String rhsArtEigenleistung;
            rhsArtEigenleistung = that.getArtEigenleistung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artEigenleistung", lhsArtEigenleistung), LocatorUtils.property(thatLocator, "artEigenleistung", rhsArtEigenleistung), lhsArtEigenleistung, rhsArtEigenleistung, (this.artEigenleistung!= null), (that.artEigenleistung!= null))) {
                return false;
            }
        }
        {
            CTWagnisanschrift lhsWagnisanschrift;
            lhsWagnisanschrift = this.getWagnisanschrift();
            CTWagnisanschrift rhsWagnisanschrift;
            rhsWagnisanschrift = that.getWagnisanschrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wagnisanschrift", lhsWagnisanschrift), LocatorUtils.property(thatLocator, "wagnisanschrift", rhsWagnisanschrift), lhsWagnisanschrift, rhsWagnisanschrift, (this.wagnisanschrift!= null), (that.wagnisanschrift!= null))) {
                return false;
            }
        }
        {
            STArtDesVorhabens lhsArtBauvorhaben;
            lhsArtBauvorhaben = this.getArtBauvorhaben();
            STArtDesVorhabens rhsArtBauvorhaben;
            rhsArtBauvorhaben = that.getArtBauvorhaben();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artBauvorhaben", lhsArtBauvorhaben), LocatorUtils.property(thatLocator, "artBauvorhaben", rhsArtBauvorhaben), lhsArtBauvorhaben, rhsArtBauvorhaben, (this.artBauvorhaben!= null), (that.artBauvorhaben!= null))) {
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
            String theFertigstellung;
            theFertigstellung = this.getFertigstellung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fertigstellung", theFertigstellung), currentHashCode, theFertigstellung, (this.fertigstellung!= null));
        }
        {
            String theArtEigenleistung;
            theArtEigenleistung = this.getArtEigenleistung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artEigenleistung", theArtEigenleistung), currentHashCode, theArtEigenleistung, (this.artEigenleistung!= null));
        }
        {
            CTWagnisanschrift theWagnisanschrift;
            theWagnisanschrift = this.getWagnisanschrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wagnisanschrift", theWagnisanschrift), currentHashCode, theWagnisanschrift, (this.wagnisanschrift!= null));
        }
        {
            STArtDesVorhabens theArtBauvorhaben;
            theArtBauvorhaben = this.getArtBauvorhaben();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artBauvorhaben", theArtBauvorhaben), currentHashCode, theArtBauvorhaben, (this.artBauvorhaben!= null));
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
        if (draftCopy instanceof CTBauherren) {
            final CTBauherren copy = ((CTBauherren) draftCopy);
            {
                Boolean fertigstellungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fertigstellung!= null));
                if (fertigstellungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFertigstellung;
                    sourceFertigstellung = this.getFertigstellung();
                    String copyFertigstellung = ((String) strategy.copy(LocatorUtils.property(locator, "fertigstellung", sourceFertigstellung), sourceFertigstellung, (this.fertigstellung!= null)));
                    copy.setFertigstellung(copyFertigstellung);
                } else {
                    if (fertigstellungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fertigstellung = null;
                    }
                }
            }
            {
                Boolean artEigenleistungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artEigenleistung!= null));
                if (artEigenleistungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceArtEigenleistung;
                    sourceArtEigenleistung = this.getArtEigenleistung();
                    String copyArtEigenleistung = ((String) strategy.copy(LocatorUtils.property(locator, "artEigenleistung", sourceArtEigenleistung), sourceArtEigenleistung, (this.artEigenleistung!= null)));
                    copy.setArtEigenleistung(copyArtEigenleistung);
                } else {
                    if (artEigenleistungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artEigenleistung = null;
                    }
                }
            }
            {
                Boolean wagnisanschriftShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wagnisanschrift!= null));
                if (wagnisanschriftShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTWagnisanschrift sourceWagnisanschrift;
                    sourceWagnisanschrift = this.getWagnisanschrift();
                    CTWagnisanschrift copyWagnisanschrift = ((CTWagnisanschrift) strategy.copy(LocatorUtils.property(locator, "wagnisanschrift", sourceWagnisanschrift), sourceWagnisanschrift, (this.wagnisanschrift!= null)));
                    copy.setWagnisanschrift(copyWagnisanschrift);
                } else {
                    if (wagnisanschriftShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wagnisanschrift = null;
                    }
                }
            }
            {
                Boolean artBauvorhabenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artBauvorhaben!= null));
                if (artBauvorhabenShouldBeCopiedAndSet == Boolean.TRUE) {
                    STArtDesVorhabens sourceArtBauvorhaben;
                    sourceArtBauvorhaben = this.getArtBauvorhaben();
                    STArtDesVorhabens copyArtBauvorhaben = ((STArtDesVorhabens) strategy.copy(LocatorUtils.property(locator, "artBauvorhaben", sourceArtBauvorhaben), sourceArtBauvorhaben, (this.artBauvorhaben!= null)));
                    copy.setArtBauvorhaben(copyArtBauvorhaben);
                } else {
                    if (artBauvorhabenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artBauvorhaben = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBauherren();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBauherren withFertigstellung(String value) {
        setFertigstellung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBauherren withArtEigenleistung(String value) {
        setArtEigenleistung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBauherren withWagnisanschrift(CTWagnisanschrift value) {
        setWagnisanschrift(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBauherren withArtBauvorhaben(STArtDesVorhabens value) {
        setArtBauvorhaben(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBauherren withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBauherren withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
