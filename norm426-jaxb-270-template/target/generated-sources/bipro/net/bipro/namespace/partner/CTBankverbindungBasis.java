
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STTypDerBankverbindung;
import net.bipro.namespace.sepa.CTMandat;
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
 * Angaben zur Bankverbindung.
 * 
 * <p>Java class for CT_BankverbindungBasis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_BankverbindungBasis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bankverbindung" type="{http://www.bipro.net/namespace/datentypen}ST_TypDerBankverbindung" minOccurs="0"/&gt;
 *         &lt;element name="BIC" type="{http://www.bipro.net/namespace/datentypen}ST_BIC" minOccurs="0"/&gt;
 *         &lt;element name="IBAN" type="{http://www.bipro.net/namespace/datentypen}ST_IBAN" minOccurs="0"/&gt;
 *         &lt;element name="Institut" type="{http://www.bipro.net/namespace/datentypen}ST_Text060" minOccurs="0"/&gt;
 *         &lt;element name="Kontoinhaber" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *         &lt;element name="Referenz" type="{http://www.bipro.net/namespace/datentypen}ST_Referenz" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_BankverbindungBasis", propOrder = {
    "bankverbindung",
    "bic",
    "iban",
    "institut",
    "kontoinhaber",
    "referenz"
})
@XmlSeeAlso({
    CTBankverbindung.class,
    CTInternationaleBankverbindung.class,
    CTMandat.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTBankverbindungBasis
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Bankverbindung")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected STTypDerBankverbindung bankverbindung;
    @XmlElement(name = "BIC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String bic;
    @XmlElement(name = "IBAN")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String iban;
    @XmlElement(name = "Institut")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String institut;
    @XmlElement(name = "Kontoinhaber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String kontoinhaber;
    @XmlElement(name = "Referenz")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected String referenz;

    /**
     * Gets the value of the bankverbindung property.
     * 
     * @return
     *     possible object is
     *     {@link STTypDerBankverbindung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public STTypDerBankverbindung getBankverbindung() {
        return bankverbindung;
    }

    /**
     * Sets the value of the bankverbindung property.
     * 
     * @param value
     *     allowed object is
     *     {@link STTypDerBankverbindung }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBankverbindung(STTypDerBankverbindung value) {
        this.bankverbindung = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the institut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getInstitut() {
        return institut;
    }

    /**
     * Sets the value of the institut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setInstitut(String value) {
        this.institut = value;
    }

    /**
     * Gets the value of the kontoinhaber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getKontoinhaber() {
        return kontoinhaber;
    }

    /**
     * Sets the value of the kontoinhaber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setKontoinhaber(String value) {
        this.kontoinhaber = value;
    }

    /**
     * Gets the value of the referenz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public String getReferenz() {
        return referenz;
    }

    /**
     * Sets the value of the referenz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setReferenz(String value) {
        this.referenz = value;
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
        final CTBankverbindungBasis that = ((CTBankverbindungBasis) object);
        {
            STTypDerBankverbindung lhsBankverbindung;
            lhsBankverbindung = this.getBankverbindung();
            STTypDerBankverbindung rhsBankverbindung;
            rhsBankverbindung = that.getBankverbindung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankverbindung", lhsBankverbindung), LocatorUtils.property(thatLocator, "bankverbindung", rhsBankverbindung), lhsBankverbindung, rhsBankverbindung, (this.bankverbindung!= null), (that.bankverbindung!= null))) {
                return false;
            }
        }
        {
            String lhsBIC;
            lhsBIC = this.getBIC();
            String rhsBIC;
            rhsBIC = that.getBIC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bic", lhsBIC), LocatorUtils.property(thatLocator, "bic", rhsBIC), lhsBIC, rhsBIC, (this.bic!= null), (that.bic!= null))) {
                return false;
            }
        }
        {
            String lhsIBAN;
            lhsIBAN = this.getIBAN();
            String rhsIBAN;
            rhsIBAN = that.getIBAN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "iban", lhsIBAN), LocatorUtils.property(thatLocator, "iban", rhsIBAN), lhsIBAN, rhsIBAN, (this.iban!= null), (that.iban!= null))) {
                return false;
            }
        }
        {
            String lhsInstitut;
            lhsInstitut = this.getInstitut();
            String rhsInstitut;
            rhsInstitut = that.getInstitut();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "institut", lhsInstitut), LocatorUtils.property(thatLocator, "institut", rhsInstitut), lhsInstitut, rhsInstitut, (this.institut!= null), (that.institut!= null))) {
                return false;
            }
        }
        {
            String lhsKontoinhaber;
            lhsKontoinhaber = this.getKontoinhaber();
            String rhsKontoinhaber;
            rhsKontoinhaber = that.getKontoinhaber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kontoinhaber", lhsKontoinhaber), LocatorUtils.property(thatLocator, "kontoinhaber", rhsKontoinhaber), lhsKontoinhaber, rhsKontoinhaber, (this.kontoinhaber!= null), (that.kontoinhaber!= null))) {
                return false;
            }
        }
        {
            String lhsReferenz;
            lhsReferenz = this.getReferenz();
            String rhsReferenz;
            rhsReferenz = that.getReferenz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenz", lhsReferenz), LocatorUtils.property(thatLocator, "referenz", rhsReferenz), lhsReferenz, rhsReferenz, (this.referenz!= null), (that.referenz!= null))) {
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
            STTypDerBankverbindung theBankverbindung;
            theBankverbindung = this.getBankverbindung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankverbindung", theBankverbindung), currentHashCode, theBankverbindung, (this.bankverbindung!= null));
        }
        {
            String theBIC;
            theBIC = this.getBIC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bic", theBIC), currentHashCode, theBIC, (this.bic!= null));
        }
        {
            String theIBAN;
            theIBAN = this.getIBAN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "iban", theIBAN), currentHashCode, theIBAN, (this.iban!= null));
        }
        {
            String theInstitut;
            theInstitut = this.getInstitut();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "institut", theInstitut), currentHashCode, theInstitut, (this.institut!= null));
        }
        {
            String theKontoinhaber;
            theKontoinhaber = this.getKontoinhaber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kontoinhaber", theKontoinhaber), currentHashCode, theKontoinhaber, (this.kontoinhaber!= null));
        }
        {
            String theReferenz;
            theReferenz = this.getReferenz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenz", theReferenz), currentHashCode, theReferenz, (this.referenz!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof CTBankverbindungBasis) {
            final CTBankverbindungBasis copy = ((CTBankverbindungBasis) target);
            {
                Boolean bankverbindungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bankverbindung!= null));
                if (bankverbindungShouldBeCopiedAndSet == Boolean.TRUE) {
                    STTypDerBankverbindung sourceBankverbindung;
                    sourceBankverbindung = this.getBankverbindung();
                    STTypDerBankverbindung copyBankverbindung = ((STTypDerBankverbindung) strategy.copy(LocatorUtils.property(locator, "bankverbindung", sourceBankverbindung), sourceBankverbindung, (this.bankverbindung!= null)));
                    copy.setBankverbindung(copyBankverbindung);
                } else {
                    if (bankverbindungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bankverbindung = null;
                    }
                }
            }
            {
                Boolean bicShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bic!= null));
                if (bicShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBIC;
                    sourceBIC = this.getBIC();
                    String copyBIC = ((String) strategy.copy(LocatorUtils.property(locator, "bic", sourceBIC), sourceBIC, (this.bic!= null)));
                    copy.setBIC(copyBIC);
                } else {
                    if (bicShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bic = null;
                    }
                }
            }
            {
                Boolean ibanShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.iban!= null));
                if (ibanShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIBAN;
                    sourceIBAN = this.getIBAN();
                    String copyIBAN = ((String) strategy.copy(LocatorUtils.property(locator, "iban", sourceIBAN), sourceIBAN, (this.iban!= null)));
                    copy.setIBAN(copyIBAN);
                } else {
                    if (ibanShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.iban = null;
                    }
                }
            }
            {
                Boolean institutShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.institut!= null));
                if (institutShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInstitut;
                    sourceInstitut = this.getInstitut();
                    String copyInstitut = ((String) strategy.copy(LocatorUtils.property(locator, "institut", sourceInstitut), sourceInstitut, (this.institut!= null)));
                    copy.setInstitut(copyInstitut);
                } else {
                    if (institutShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.institut = null;
                    }
                }
            }
            {
                Boolean kontoinhaberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kontoinhaber!= null));
                if (kontoinhaberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKontoinhaber;
                    sourceKontoinhaber = this.getKontoinhaber();
                    String copyKontoinhaber = ((String) strategy.copy(LocatorUtils.property(locator, "kontoinhaber", sourceKontoinhaber), sourceKontoinhaber, (this.kontoinhaber!= null)));
                    copy.setKontoinhaber(copyKontoinhaber);
                } else {
                    if (kontoinhaberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kontoinhaber = null;
                    }
                }
            }
            {
                Boolean referenzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.referenz!= null));
                if (referenzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceReferenz;
                    sourceReferenz = this.getReferenz();
                    String copyReferenz = ((String) strategy.copy(LocatorUtils.property(locator, "referenz", sourceReferenz), sourceReferenz, (this.referenz!= null)));
                    copy.setReferenz(copyReferenz);
                } else {
                    if (referenzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.referenz = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withBankverbindung(STTypDerBankverbindung value) {
        setBankverbindung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withBIC(String value) {
        setBIC(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withIBAN(String value) {
        setIBAN(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withInstitut(String value) {
        setInstitut(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withKontoinhaber(String value) {
        setKontoinhaber(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindungBasis withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
