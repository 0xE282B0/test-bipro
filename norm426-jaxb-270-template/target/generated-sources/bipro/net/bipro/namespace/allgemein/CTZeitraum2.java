
package net.bipro.namespace.allgemein;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
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
 * Klasse zur Abbildung von Zeiträumen und Dauern. Die Angaben MÜSSEN einen Zeitraum eindeutig definieren. Es MUSS also mindestens beide Zeitpunkte (Beginn, Ende) oder ein Zeitpunkt und eine Dauer (AnzahlJahre, AnzahlMonate, AnzahlTage) angegeben werden.
 * Wenn aus fachlichen Gründen eine konkrete Angabe nicht möglich ist, DARF auf die Angabe verzichtet werden (z.B. Ende der Rentenzahlung = Tod, Ende der Versicherungsdauer in KV = Tod)
 * WENN in der Dokumentation der Refernzierung der Klasse Zeitraum ein "weicher" Bezugszeitpunkt (z.B. Eintritt des Schadenfalls) angegeben ist, MUSS NUR die Dauer (AnzahlJahre, AnzahlMonate bzw AnzahlTage) des Zeitraums angegeben werden.
 * Bei Anfragen (Requests) im Kontext TAA DARF der Consumer auf die vollständige Angabe konkreter Zeitpunkte oder der Dauer verzichten, da die korrekte Ermittlung der dieser Größen in der Hand des Produktgebers liegt. Der Produktgeber MUSS die fehlenden Größen ermitteln und in der Antwort zurückliefern.
 * Die Angabe einer Dauer MUSS entweder als AnzahlJahre und AnzahlMonate erfolgen oder als AnzahlTage.
 * Ist die Anzahl größer 11, MÜSSEN die vollen Jahre nach AnzahlJahre übertragen werden.
 * Beispiel: Die Darstellung einer Dauer von 15 Monaten erfolgt also als AnzahlJahre=1, AnzahlMonate=3; 12 Monate erfolgt als AnzahlJahre=1, AnzahlMonate=0.
 * 
 * Diese Klasse nutzende Assoziationen MÜSSEN in ihrer Dokumentation die Genauigkeit und Optionalität der Zeitzone in den Attributen Beginn und Ende explizit definieren.
 * 
 * <p>Java class for CT_Zeitraum2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Zeitraum2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Beginn" type="{http://www.bipro.net/namespace/datentypen}ST_Zeitpunkt" minOccurs="0"/&gt;
 *         &lt;element name="Ende" type="{http://www.bipro.net/namespace/datentypen}ST_Zeitpunkt" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlJahre" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlMonate" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlTage" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Zeitraum2", propOrder = {
    "beginn",
    "ende",
    "anzahlJahre",
    "anzahlMonate",
    "anzahlTage"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTZeitraum2
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Beginn")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String beginn;
    @XmlElement(name = "Ende")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String ende;
    @XmlElement(name = "AnzahlJahre")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlJahre;
    @XmlElement(name = "AnzahlMonate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlMonate;
    @XmlElement(name = "AnzahlTage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlTage;

    /**
     * Gets the value of the beginn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBeginn() {
        return beginn;
    }

    /**
     * Sets the value of the beginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBeginn(String value) {
        this.beginn = value;
    }

    /**
     * Gets the value of the ende property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getEnde() {
        return ende;
    }

    /**
     * Sets the value of the ende property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setEnde(String value) {
        this.ende = value;
    }

    /**
     * Gets the value of the anzahlJahre property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlJahre() {
        return anzahlJahre;
    }

    /**
     * Sets the value of the anzahlJahre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlJahre(Integer value) {
        this.anzahlJahre = value;
    }

    /**
     * Gets the value of the anzahlMonate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlMonate() {
        return anzahlMonate;
    }

    /**
     * Sets the value of the anzahlMonate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlMonate(Integer value) {
        this.anzahlMonate = value;
    }

    /**
     * Gets the value of the anzahlTage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlTage() {
        return anzahlTage;
    }

    /**
     * Sets the value of the anzahlTage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlTage(Integer value) {
        this.anzahlTage = value;
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
        final CTZeitraum2 that = ((CTZeitraum2) object);
        {
            String lhsBeginn;
            lhsBeginn = this.getBeginn();
            String rhsBeginn;
            rhsBeginn = that.getBeginn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beginn", lhsBeginn), LocatorUtils.property(thatLocator, "beginn", rhsBeginn), lhsBeginn, rhsBeginn, (this.beginn!= null), (that.beginn!= null))) {
                return false;
            }
        }
        {
            String lhsEnde;
            lhsEnde = this.getEnde();
            String rhsEnde;
            rhsEnde = that.getEnde();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ende", lhsEnde), LocatorUtils.property(thatLocator, "ende", rhsEnde), lhsEnde, rhsEnde, (this.ende!= null), (that.ende!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlJahre;
            lhsAnzahlJahre = this.getAnzahlJahre();
            Integer rhsAnzahlJahre;
            rhsAnzahlJahre = that.getAnzahlJahre();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlJahre", lhsAnzahlJahre), LocatorUtils.property(thatLocator, "anzahlJahre", rhsAnzahlJahre), lhsAnzahlJahre, rhsAnzahlJahre, (this.anzahlJahre!= null), (that.anzahlJahre!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlMonate;
            lhsAnzahlMonate = this.getAnzahlMonate();
            Integer rhsAnzahlMonate;
            rhsAnzahlMonate = that.getAnzahlMonate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlMonate", lhsAnzahlMonate), LocatorUtils.property(thatLocator, "anzahlMonate", rhsAnzahlMonate), lhsAnzahlMonate, rhsAnzahlMonate, (this.anzahlMonate!= null), (that.anzahlMonate!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlTage;
            lhsAnzahlTage = this.getAnzahlTage();
            Integer rhsAnzahlTage;
            rhsAnzahlTage = that.getAnzahlTage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlTage", lhsAnzahlTage), LocatorUtils.property(thatLocator, "anzahlTage", rhsAnzahlTage), lhsAnzahlTage, rhsAnzahlTage, (this.anzahlTage!= null), (that.anzahlTage!= null))) {
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
            String theBeginn;
            theBeginn = this.getBeginn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beginn", theBeginn), currentHashCode, theBeginn, (this.beginn!= null));
        }
        {
            String theEnde;
            theEnde = this.getEnde();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ende", theEnde), currentHashCode, theEnde, (this.ende!= null));
        }
        {
            Integer theAnzahlJahre;
            theAnzahlJahre = this.getAnzahlJahre();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlJahre", theAnzahlJahre), currentHashCode, theAnzahlJahre, (this.anzahlJahre!= null));
        }
        {
            Integer theAnzahlMonate;
            theAnzahlMonate = this.getAnzahlMonate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlMonate", theAnzahlMonate), currentHashCode, theAnzahlMonate, (this.anzahlMonate!= null));
        }
        {
            Integer theAnzahlTage;
            theAnzahlTage = this.getAnzahlTage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlTage", theAnzahlTage), currentHashCode, theAnzahlTage, (this.anzahlTage!= null));
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
        if (draftCopy instanceof CTZeitraum2) {
            final CTZeitraum2 copy = ((CTZeitraum2) draftCopy);
            {
                Boolean beginnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.beginn!= null));
                if (beginnShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBeginn;
                    sourceBeginn = this.getBeginn();
                    String copyBeginn = ((String) strategy.copy(LocatorUtils.property(locator, "beginn", sourceBeginn), sourceBeginn, (this.beginn!= null)));
                    copy.setBeginn(copyBeginn);
                } else {
                    if (beginnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.beginn = null;
                    }
                }
            }
            {
                Boolean endeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ende!= null));
                if (endeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceEnde;
                    sourceEnde = this.getEnde();
                    String copyEnde = ((String) strategy.copy(LocatorUtils.property(locator, "ende", sourceEnde), sourceEnde, (this.ende!= null)));
                    copy.setEnde(copyEnde);
                } else {
                    if (endeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ende = null;
                    }
                }
            }
            {
                Boolean anzahlJahreShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlJahre!= null));
                if (anzahlJahreShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlJahre;
                    sourceAnzahlJahre = this.getAnzahlJahre();
                    Integer copyAnzahlJahre = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlJahre", sourceAnzahlJahre), sourceAnzahlJahre, (this.anzahlJahre!= null)));
                    copy.setAnzahlJahre(copyAnzahlJahre);
                } else {
                    if (anzahlJahreShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlJahre = null;
                    }
                }
            }
            {
                Boolean anzahlMonateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlMonate!= null));
                if (anzahlMonateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlMonate;
                    sourceAnzahlMonate = this.getAnzahlMonate();
                    Integer copyAnzahlMonate = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlMonate", sourceAnzahlMonate), sourceAnzahlMonate, (this.anzahlMonate!= null)));
                    copy.setAnzahlMonate(copyAnzahlMonate);
                } else {
                    if (anzahlMonateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlMonate = null;
                    }
                }
            }
            {
                Boolean anzahlTageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlTage!= null));
                if (anzahlTageShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlTage;
                    sourceAnzahlTage = this.getAnzahlTage();
                    Integer copyAnzahlTage = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlTage", sourceAnzahlTage), sourceAnzahlTage, (this.anzahlTage!= null)));
                    copy.setAnzahlTage(copyAnzahlTage);
                } else {
                    if (anzahlTageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlTage = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTZeitraum2();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 withBeginn(String value) {
        setBeginn(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 withEnde(String value) {
        setEnde(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 withAnzahlJahre(Integer value) {
        setAnzahlJahre(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 withAnzahlMonate(Integer value) {
        setAnzahlMonate(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 withAnzahlTage(Integer value) {
        setAnzahlTage(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTZeitraum2 withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
