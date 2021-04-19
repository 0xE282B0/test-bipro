
package net.bipro.namespace.fragen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
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
 * Eine einfache Frage ist eine direkt zu beantwortende Frage. Es gibt mehrere Arten von einfachen Fragen, daher ist diese Klasse abstrakt modelliert. Die tatsächlich möglichen Arten von einfachen Fragen ergeben sich aus den abgeleiteten Klassen. Erläuterung siehe dort.
 * Wichtig: Jede Art von Fragen erfordert eine eigene Implementierung im Client. Daher darf das Objekt Frage NICHT providerspezifisch erweitert werden. Erweiterungen sind nur im Rahmen eines Spartenspezifischen Datenmodells als Bestandteil der Norm zulässig!
 * Fragen können auch bereits in der getQuestions-Response mit Antwortobjekten ausgeliefert werden. Dadurch kann der Provider Vorbelegungswerte für die Antworten mitliefern, die der Consumer verwenden darf aber nicht muss.
 * 
 * <p>Java class for CT_EinfacheFrage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_EinfacheFrage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_Frage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FachlicheID" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="TechnischeID" type="{http://www.bipro.net/namespace/datentypen}ST_ID"/&gt;
 *         &lt;element name="Text" type="{http://www.bipro.net/namespace/datentypen}ST_Text" minOccurs="0"/&gt;
 *         &lt;element name="FreitextErlaubt" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_EinfacheFrage", propOrder = {
    "fachlicheID",
    "technischeID",
    "text",
    "freitextErlaubt"
})
@XmlSeeAlso({
    CTFrageDatum.class,
    CTFrageJaNein.class,
    CTFragePartner.class,
    CTFrageText.class,
    CTFrageWerteliste.class,
    CTFrageZahl.class,
    CTFrageZeitraum.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public abstract class CTEinfacheFrage
    extends CTFrage
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "FachlicheID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String fachlicheID;
    @XmlElement(name = "TechnischeID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String technischeID;
    @XmlElement(name = "Text")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String text;
    @XmlElement(name = "FreitextErlaubt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean freitextErlaubt;

    /**
     * Gets the value of the fachlicheID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getFachlicheID() {
        return fachlicheID;
    }

    /**
     * Sets the value of the fachlicheID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFachlicheID(String value) {
        this.fachlicheID = value;
    }

    /**
     * Gets the value of the technischeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getTechnischeID() {
        return technischeID;
    }

    /**
     * Sets the value of the technischeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setTechnischeID(String value) {
        this.technischeID = value;
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
     * Gets the value of the freitextErlaubt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isFreitextErlaubt() {
        return freitextErlaubt;
    }

    /**
     * Sets the value of the freitextErlaubt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setFreitextErlaubt(Boolean value) {
        this.freitextErlaubt = value;
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
        final CTEinfacheFrage that = ((CTEinfacheFrage) object);
        {
            String lhsFachlicheID;
            lhsFachlicheID = this.getFachlicheID();
            String rhsFachlicheID;
            rhsFachlicheID = that.getFachlicheID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fachlicheID", lhsFachlicheID), LocatorUtils.property(thatLocator, "fachlicheID", rhsFachlicheID), lhsFachlicheID, rhsFachlicheID, (this.fachlicheID!= null), (that.fachlicheID!= null))) {
                return false;
            }
        }
        {
            String lhsTechnischeID;
            lhsTechnischeID = this.getTechnischeID();
            String rhsTechnischeID;
            rhsTechnischeID = that.getTechnischeID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technischeID", lhsTechnischeID), LocatorUtils.property(thatLocator, "technischeID", rhsTechnischeID), lhsTechnischeID, rhsTechnischeID, (this.technischeID!= null), (that.technischeID!= null))) {
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
            Boolean lhsFreitextErlaubt;
            lhsFreitextErlaubt = this.isFreitextErlaubt();
            Boolean rhsFreitextErlaubt;
            rhsFreitextErlaubt = that.isFreitextErlaubt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freitextErlaubt", lhsFreitextErlaubt), LocatorUtils.property(thatLocator, "freitextErlaubt", rhsFreitextErlaubt), lhsFreitextErlaubt, rhsFreitextErlaubt, (this.freitextErlaubt!= null), (that.freitextErlaubt!= null))) {
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
            String theFachlicheID;
            theFachlicheID = this.getFachlicheID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fachlicheID", theFachlicheID), currentHashCode, theFachlicheID, (this.fachlicheID!= null));
        }
        {
            String theTechnischeID;
            theTechnischeID = this.getTechnischeID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "technischeID", theTechnischeID), currentHashCode, theTechnischeID, (this.technischeID!= null));
        }
        {
            String theText;
            theText = this.getText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText, (this.text!= null));
        }
        {
            Boolean theFreitextErlaubt;
            theFreitextErlaubt = this.isFreitextErlaubt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freitextErlaubt", theFreitextErlaubt), currentHashCode, theFreitextErlaubt, (this.freitextErlaubt!= null));
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
        if (target instanceof CTEinfacheFrage) {
            final CTEinfacheFrage copy = ((CTEinfacheFrage) target);
            {
                Boolean fachlicheIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fachlicheID!= null));
                if (fachlicheIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFachlicheID;
                    sourceFachlicheID = this.getFachlicheID();
                    String copyFachlicheID = ((String) strategy.copy(LocatorUtils.property(locator, "fachlicheID", sourceFachlicheID), sourceFachlicheID, (this.fachlicheID!= null)));
                    copy.setFachlicheID(copyFachlicheID);
                } else {
                    if (fachlicheIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fachlicheID = null;
                    }
                }
            }
            {
                Boolean technischeIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.technischeID!= null));
                if (technischeIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTechnischeID;
                    sourceTechnischeID = this.getTechnischeID();
                    String copyTechnischeID = ((String) strategy.copy(LocatorUtils.property(locator, "technischeID", sourceTechnischeID), sourceTechnischeID, (this.technischeID!= null)));
                    copy.setTechnischeID(copyTechnischeID);
                } else {
                    if (technischeIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.technischeID = null;
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
                Boolean freitextErlaubtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freitextErlaubt!= null));
                if (freitextErlaubtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFreitextErlaubt;
                    sourceFreitextErlaubt = this.isFreitextErlaubt();
                    Boolean copyFreitextErlaubt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "freitextErlaubt", sourceFreitextErlaubt), sourceFreitextErlaubt, (this.freitextErlaubt!= null)));
                    copy.setFreitextErlaubt(copyFreitextErlaubt);
                } else {
                    if (freitextErlaubtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freitextErlaubt = null;
                    }
                }
            }
        }
        return target;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withFachlicheID(String value) {
        setFachlicheID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withTechnischeID(String value) {
        setTechnischeID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withText(String value) {
        setText(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withFreitextErlaubt(Boolean value) {
        setFreitextErlaubt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withErlaeuterung(String value) {
        setErlaeuterung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withOptional(Boolean value) {
        setOptional(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withBedingung(CTBedingung value) {
        setBedingung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withWiederholbar(Boolean value) {
        setWiederholbar(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withMaxAntworten(Integer value) {
        setMaxAntworten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withOrdnungsnummer(Integer value) {
        setOrdnungsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withAnzeigenummer(String value) {
        setAnzeigenummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTEinfacheFrage withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
