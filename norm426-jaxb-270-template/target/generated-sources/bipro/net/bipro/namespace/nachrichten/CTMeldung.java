
package net.bipro.namespace.nachrichten;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STMeldungsart;
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
 * Ermoeglicht die Erweiterung einer Statusmeldung um zusaetzliche Informationen (z.B. Fehlermeldungen oder Hinweise).
 * 
 * <p>Java class for CT_Meldung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Meldung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Meldungsart"/&gt;
 *         &lt;element name="MeldungID" type="{http://www.bipro.net/namespace/datentypen}ST_Meldung"/&gt;
 *         &lt;element name="Text" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="Quelle" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="Identifikationsnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text030" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Meldung", propOrder = {
    "artID",
    "meldungID",
    "text",
    "quelle",
    "identifikationsnummer"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTMeldung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STMeldungsart artID;
    @XmlElement(name = "MeldungID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String meldungID;
    @XmlElement(name = "Text")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String text;
    @XmlElement(name = "Quelle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String quelle;
    @XmlElement(name = "Identifikationsnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String identifikationsnummer;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STMeldungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STMeldungsart getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMeldungsart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STMeldungsart value) {
        this.artID = value;
    }

    /**
     * Gets the value of the meldungID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getMeldungID() {
        return meldungID;
    }

    /**
     * Sets the value of the meldungID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setMeldungID(String value) {
        this.meldungID = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the quelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getQuelle() {
        return quelle;
    }

    /**
     * Sets the value of the quelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setQuelle(String value) {
        this.quelle = value;
    }

    /**
     * Gets the value of the identifikationsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getIdentifikationsnummer() {
        return identifikationsnummer;
    }

    /**
     * Sets the value of the identifikationsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setIdentifikationsnummer(String value) {
        this.identifikationsnummer = value;
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
        final CTMeldung that = ((CTMeldung) object);
        {
            STMeldungsart lhsArtID;
            lhsArtID = this.getArtID();
            STMeldungsart rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            String lhsMeldungID;
            lhsMeldungID = this.getMeldungID();
            String rhsMeldungID;
            rhsMeldungID = that.getMeldungID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meldungID", lhsMeldungID), LocatorUtils.property(thatLocator, "meldungID", rhsMeldungID), lhsMeldungID, rhsMeldungID, (this.meldungID!= null), (that.meldungID!= null))) {
                return false;
            }
        }
        {
            String lhsText;
            lhsText = this.getText();
            String rhsText;
            rhsText = that.getText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText, (this.text!= null), (that.text!= null))) {
                return false;
            }
        }
        {
            String lhsQuelle;
            lhsQuelle = this.getQuelle();
            String rhsQuelle;
            rhsQuelle = that.getQuelle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quelle", lhsQuelle), LocatorUtils.property(thatLocator, "quelle", rhsQuelle), lhsQuelle, rhsQuelle, (this.quelle!= null), (that.quelle!= null))) {
                return false;
            }
        }
        {
            String lhsIdentifikationsnummer;
            lhsIdentifikationsnummer = this.getIdentifikationsnummer();
            String rhsIdentifikationsnummer;
            rhsIdentifikationsnummer = that.getIdentifikationsnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifikationsnummer", lhsIdentifikationsnummer), LocatorUtils.property(thatLocator, "identifikationsnummer", rhsIdentifikationsnummer), lhsIdentifikationsnummer, rhsIdentifikationsnummer, (this.identifikationsnummer!= null), (that.identifikationsnummer!= null))) {
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
            STMeldungsart theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            String theMeldungID;
            theMeldungID = this.getMeldungID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meldungID", theMeldungID), currentHashCode, theMeldungID, (this.meldungID!= null));
        }
        {
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText, (this.text!= null));
        }
        {
            String theQuelle;
            theQuelle = this.getQuelle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quelle", theQuelle), currentHashCode, theQuelle, (this.quelle!= null));
        }
        {
            String theIdentifikationsnummer;
            theIdentifikationsnummer = this.getIdentifikationsnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifikationsnummer", theIdentifikationsnummer), currentHashCode, theIdentifikationsnummer, (this.identifikationsnummer!= null));
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
        if (draftCopy instanceof CTMeldung) {
            final CTMeldung copy = ((CTMeldung) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STMeldungsart sourceArtID;
                    sourceArtID = this.getArtID();
                    STMeldungsart copyArtID = ((STMeldungsart) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean meldungIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.meldungID!= null));
                if (meldungIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMeldungID;
                    sourceMeldungID = this.getMeldungID();
                    String copyMeldungID = ((String) strategy.copy(LocatorUtils.property(locator, "meldungID", sourceMeldungID), sourceMeldungID, (this.meldungID!= null)));
                    copy.setMeldungID(copyMeldungID);
                } else {
                    if (meldungIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.meldungID = null;
                    }
                }
            }
            {
                Boolean textShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.text!= null));
                if (textShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceText;
                    sourceText = this.getText();
                    String copyText = ((String) strategy.copy(LocatorUtils.property(locator, "text", sourceText), sourceText, (this.text!= null)));
                    copy.setText(copyText);
                } else {
                    if (textShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.text = null;
                    }
                }
            }
            {
                Boolean quelleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.quelle!= null));
                if (quelleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceQuelle;
                    sourceQuelle = this.getQuelle();
                    String copyQuelle = ((String) strategy.copy(LocatorUtils.property(locator, "quelle", sourceQuelle), sourceQuelle, (this.quelle!= null)));
                    copy.setQuelle(copyQuelle);
                } else {
                    if (quelleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.quelle = null;
                    }
                }
            }
            {
                Boolean identifikationsnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identifikationsnummer!= null));
                if (identifikationsnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIdentifikationsnummer;
                    sourceIdentifikationsnummer = this.getIdentifikationsnummer();
                    String copyIdentifikationsnummer = ((String) strategy.copy(LocatorUtils.property(locator, "identifikationsnummer", sourceIdentifikationsnummer), sourceIdentifikationsnummer, (this.identifikationsnummer!= null)));
                    copy.setIdentifikationsnummer(copyIdentifikationsnummer);
                } else {
                    if (identifikationsnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identifikationsnummer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTMeldung();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMeldung withArtID(STMeldungsart value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMeldung withMeldungID(String value) {
        setMeldungID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMeldung withText(String value) {
        setText(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMeldung withQuelle(String value) {
        setQuelle(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMeldung withIdentifikationsnummer(String value) {
        setIdentifikationsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMeldung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTMeldung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
