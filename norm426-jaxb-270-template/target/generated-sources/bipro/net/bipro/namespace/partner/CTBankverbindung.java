
package net.bipro.namespace.partner;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STTypDerBankverbindung;
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
 * Bankverbindung, die zum SEPA-Bereich gehört. 
 * 
 * <p>Java class for CT_Bankverbindung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Bankverbindung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/partner}CT_BankverbindungBasis"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kontonummer" type="{http://www.bipro.net/namespace/datentypen}ST_Kontonummer" minOccurs="0"/&gt;
 *         &lt;element name="Bankleitzahl" type="{http://www.bipro.net/namespace/datentypen}ST_Bankleitzahl" minOccurs="0"/&gt;
 *         &lt;element name="Einzugsermaechtigung" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Bankverbindung", propOrder = {
    "kontonummer",
    "bankleitzahl",
    "einzugsermaechtigung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTBankverbindung
    extends CTBankverbindungBasis
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Kontonummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String kontonummer;
    @XmlElement(name = "Bankleitzahl")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bankleitzahl;
    @XmlElement(name = "Einzugsermaechtigung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean einzugsermaechtigung;

    /**
     * Gets the value of the kontonummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getKontonummer() {
        return kontonummer;
    }

    /**
     * Sets the value of the kontonummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setKontonummer(String value) {
        this.kontonummer = value;
    }

    /**
     * Gets the value of the bankleitzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBankleitzahl() {
        return bankleitzahl;
    }

    /**
     * Sets the value of the bankleitzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBankleitzahl(String value) {
        this.bankleitzahl = value;
    }

    /**
     * Gets the value of the einzugsermaechtigung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isEinzugsermaechtigung() {
        return einzugsermaechtigung;
    }

    /**
     * Sets the value of the einzugsermaechtigung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEinzugsermaechtigung(Boolean value) {
        this.einzugsermaechtigung = value;
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
        final CTBankverbindung that = ((CTBankverbindung) object);
        {
            String lhsKontonummer;
            lhsKontonummer = this.getKontonummer();
            String rhsKontonummer;
            rhsKontonummer = that.getKontonummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kontonummer", lhsKontonummer), LocatorUtils.property(thatLocator, "kontonummer", rhsKontonummer), lhsKontonummer, rhsKontonummer, (this.kontonummer!= null), (that.kontonummer!= null))) {
                return false;
            }
        }
        {
            String lhsBankleitzahl;
            lhsBankleitzahl = this.getBankleitzahl();
            String rhsBankleitzahl;
            rhsBankleitzahl = that.getBankleitzahl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankleitzahl", lhsBankleitzahl), LocatorUtils.property(thatLocator, "bankleitzahl", rhsBankleitzahl), lhsBankleitzahl, rhsBankleitzahl, (this.bankleitzahl!= null), (that.bankleitzahl!= null))) {
                return false;
            }
        }
        {
            Boolean lhsEinzugsermaechtigung;
            lhsEinzugsermaechtigung = this.isEinzugsermaechtigung();
            Boolean rhsEinzugsermaechtigung;
            rhsEinzugsermaechtigung = that.isEinzugsermaechtigung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "einzugsermaechtigung", lhsEinzugsermaechtigung), LocatorUtils.property(thatLocator, "einzugsermaechtigung", rhsEinzugsermaechtigung), lhsEinzugsermaechtigung, rhsEinzugsermaechtigung, (this.einzugsermaechtigung!= null), (that.einzugsermaechtigung!= null))) {
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
            String theKontonummer;
            theKontonummer = this.getKontonummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kontonummer", theKontonummer), currentHashCode, theKontonummer, (this.kontonummer!= null));
        }
        {
            String theBankleitzahl;
            theBankleitzahl = this.getBankleitzahl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankleitzahl", theBankleitzahl), currentHashCode, theBankleitzahl, (this.bankleitzahl!= null));
        }
        {
            Boolean theEinzugsermaechtigung;
            theEinzugsermaechtigung = this.isEinzugsermaechtigung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "einzugsermaechtigung", theEinzugsermaechtigung), currentHashCode, theEinzugsermaechtigung, (this.einzugsermaechtigung!= null));
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
        if (draftCopy instanceof CTBankverbindung) {
            final CTBankverbindung copy = ((CTBankverbindung) draftCopy);
            {
                Boolean kontonummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kontonummer!= null));
                if (kontonummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceKontonummer;
                    sourceKontonummer = this.getKontonummer();
                    String copyKontonummer = ((String) strategy.copy(LocatorUtils.property(locator, "kontonummer", sourceKontonummer), sourceKontonummer, (this.kontonummer!= null)));
                    copy.setKontonummer(copyKontonummer);
                } else {
                    if (kontonummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kontonummer = null;
                    }
                }
            }
            {
                Boolean bankleitzahlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bankleitzahl!= null));
                if (bankleitzahlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBankleitzahl;
                    sourceBankleitzahl = this.getBankleitzahl();
                    String copyBankleitzahl = ((String) strategy.copy(LocatorUtils.property(locator, "bankleitzahl", sourceBankleitzahl), sourceBankleitzahl, (this.bankleitzahl!= null)));
                    copy.setBankleitzahl(copyBankleitzahl);
                } else {
                    if (bankleitzahlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bankleitzahl = null;
                    }
                }
            }
            {
                Boolean einzugsermaechtigungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.einzugsermaechtigung!= null));
                if (einzugsermaechtigungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceEinzugsermaechtigung;
                    sourceEinzugsermaechtigung = this.isEinzugsermaechtigung();
                    Boolean copyEinzugsermaechtigung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "einzugsermaechtigung", sourceEinzugsermaechtigung), sourceEinzugsermaechtigung, (this.einzugsermaechtigung!= null)));
                    copy.setEinzugsermaechtigung(copyEinzugsermaechtigung);
                } else {
                    if (einzugsermaechtigungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.einzugsermaechtigung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTBankverbindung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withKontonummer(String value) {
        setKontonummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withBankleitzahl(String value) {
        setBankleitzahl(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withEinzugsermaechtigung(Boolean value) {
        setEinzugsermaechtigung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withBankverbindung(STTypDerBankverbindung value) {
        setBankverbindung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withBIC(String value) {
        setBIC(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withIBAN(String value) {
        setIBAN(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withInstitut(String value) {
        setInstitut(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withKontoinhaber(String value) {
        setKontoinhaber(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withReferenz(String value) {
        setReferenz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTBankverbindung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
