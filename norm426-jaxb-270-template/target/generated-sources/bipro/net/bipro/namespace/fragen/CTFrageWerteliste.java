
package net.bipro.namespace.fragen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * Frage, die mit der Auswahl EINES Wertes aus einer Werteliste beantwortet wird (Single-Selection-Listbox
 * 
 * <p>Java class for CT_FrageWerteliste complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_FrageWerteliste"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_EinfacheFrage"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MoeglicherWert" type="{http://www.bipro.net/namespace/datentypen}ST_Text" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MehrfachAntwortErlaubt" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="AntwortWerteliste" type="{http://www.bipro.net/namespace/fragen}CT_AntwortWerteliste" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_FrageWerteliste", propOrder = {
    "moeglicherWert",
    "mehrfachAntwortErlaubt",
    "antwortWerteliste"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTFrageWerteliste
    extends CTEinfacheFrage
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "MoeglicherWert", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<String> moeglicherWert;
    @XmlElement(name = "MehrfachAntwortErlaubt")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected Boolean mehrfachAntwortErlaubt;
    @XmlElement(name = "AntwortWerteliste")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected CTAntwortWerteliste antwortWerteliste;

    /**
     * Gets the value of the moeglicherWert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moeglicherWert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoeglicherWert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<String> getMoeglicherWert() {
        if (moeglicherWert == null) {
            moeglicherWert = new ArrayList<String>();
        }
        return this.moeglicherWert;
    }

    /**
     * Gets the value of the mehrfachAntwortErlaubt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Boolean isMehrfachAntwortErlaubt() {
        return mehrfachAntwortErlaubt;
    }

    /**
     * Sets the value of the mehrfachAntwortErlaubt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setMehrfachAntwortErlaubt(Boolean value) {
        this.mehrfachAntwortErlaubt = value;
    }

    /**
     * Gets the value of the antwortWerteliste property.
     * 
     * @return
     *     possible object is
     *     {@link CTAntwortWerteliste }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortWerteliste getAntwortWerteliste() {
        return antwortWerteliste;
    }

    /**
     * Sets the value of the antwortWerteliste property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAntwortWerteliste }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public void setAntwortWerteliste(CTAntwortWerteliste value) {
        this.antwortWerteliste = value;
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
        final CTFrageWerteliste that = ((CTFrageWerteliste) object);
        {
            List<String> lhsMoeglicherWert;
            lhsMoeglicherWert = (((this.moeglicherWert!= null)&&(!this.moeglicherWert.isEmpty()))?this.getMoeglicherWert():null);
            List<String> rhsMoeglicherWert;
            rhsMoeglicherWert = (((that.moeglicherWert!= null)&&(!that.moeglicherWert.isEmpty()))?that.getMoeglicherWert():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moeglicherWert", lhsMoeglicherWert), LocatorUtils.property(thatLocator, "moeglicherWert", rhsMoeglicherWert), lhsMoeglicherWert, rhsMoeglicherWert, ((this.moeglicherWert!= null)&&(!this.moeglicherWert.isEmpty())), ((that.moeglicherWert!= null)&&(!that.moeglicherWert.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsMehrfachAntwortErlaubt;
            lhsMehrfachAntwortErlaubt = this.isMehrfachAntwortErlaubt();
            Boolean rhsMehrfachAntwortErlaubt;
            rhsMehrfachAntwortErlaubt = that.isMehrfachAntwortErlaubt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mehrfachAntwortErlaubt", lhsMehrfachAntwortErlaubt), LocatorUtils.property(thatLocator, "mehrfachAntwortErlaubt", rhsMehrfachAntwortErlaubt), lhsMehrfachAntwortErlaubt, rhsMehrfachAntwortErlaubt, (this.mehrfachAntwortErlaubt!= null), (that.mehrfachAntwortErlaubt!= null))) {
                return false;
            }
        }
        {
            CTAntwortWerteliste lhsAntwortWerteliste;
            lhsAntwortWerteliste = this.getAntwortWerteliste();
            CTAntwortWerteliste rhsAntwortWerteliste;
            rhsAntwortWerteliste = that.getAntwortWerteliste();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "antwortWerteliste", lhsAntwortWerteliste), LocatorUtils.property(thatLocator, "antwortWerteliste", rhsAntwortWerteliste), lhsAntwortWerteliste, rhsAntwortWerteliste, (this.antwortWerteliste!= null), (that.antwortWerteliste!= null))) {
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
            List<String> theMoeglicherWert;
            theMoeglicherWert = (((this.moeglicherWert!= null)&&(!this.moeglicherWert.isEmpty()))?this.getMoeglicherWert():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "moeglicherWert", theMoeglicherWert), currentHashCode, theMoeglicherWert, ((this.moeglicherWert!= null)&&(!this.moeglicherWert.isEmpty())));
        }
        {
            Boolean theMehrfachAntwortErlaubt;
            theMehrfachAntwortErlaubt = this.isMehrfachAntwortErlaubt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mehrfachAntwortErlaubt", theMehrfachAntwortErlaubt), currentHashCode, theMehrfachAntwortErlaubt, (this.mehrfachAntwortErlaubt!= null));
        }
        {
            CTAntwortWerteliste theAntwortWerteliste;
            theAntwortWerteliste = this.getAntwortWerteliste();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "antwortWerteliste", theAntwortWerteliste), currentHashCode, theAntwortWerteliste, (this.antwortWerteliste!= null));
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
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof CTFrageWerteliste) {
            final CTFrageWerteliste copy = ((CTFrageWerteliste) draftCopy);
            {
                Boolean moeglicherWertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.moeglicherWert!= null)&&(!this.moeglicherWert.isEmpty())));
                if (moeglicherWertShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceMoeglicherWert;
                    sourceMoeglicherWert = (((this.moeglicherWert!= null)&&(!this.moeglicherWert.isEmpty()))?this.getMoeglicherWert():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyMoeglicherWert = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "moeglicherWert", sourceMoeglicherWert), sourceMoeglicherWert, ((this.moeglicherWert!= null)&&(!this.moeglicherWert.isEmpty()))));
                    copy.moeglicherWert = null;
                    if (copyMoeglicherWert!= null) {
                        List<String> uniqueMoeglicherWertl = copy.getMoeglicherWert();
                        uniqueMoeglicherWertl.addAll(copyMoeglicherWert);
                    }
                } else {
                    if (moeglicherWertShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.moeglicherWert = null;
                    }
                }
            }
            {
                Boolean mehrfachAntwortErlaubtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mehrfachAntwortErlaubt!= null));
                if (mehrfachAntwortErlaubtShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceMehrfachAntwortErlaubt;
                    sourceMehrfachAntwortErlaubt = this.isMehrfachAntwortErlaubt();
                    Boolean copyMehrfachAntwortErlaubt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "mehrfachAntwortErlaubt", sourceMehrfachAntwortErlaubt), sourceMehrfachAntwortErlaubt, (this.mehrfachAntwortErlaubt!= null)));
                    copy.setMehrfachAntwortErlaubt(copyMehrfachAntwortErlaubt);
                } else {
                    if (mehrfachAntwortErlaubtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mehrfachAntwortErlaubt = null;
                    }
                }
            }
            {
                Boolean antwortWertelisteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.antwortWerteliste!= null));
                if (antwortWertelisteShouldBeCopiedAndSet == Boolean.TRUE) {
                    CTAntwortWerteliste sourceAntwortWerteliste;
                    sourceAntwortWerteliste = this.getAntwortWerteliste();
                    CTAntwortWerteliste copyAntwortWerteliste = ((CTAntwortWerteliste) strategy.copy(LocatorUtils.property(locator, "antwortWerteliste", sourceAntwortWerteliste), sourceAntwortWerteliste, (this.antwortWerteliste!= null)));
                    copy.setAntwortWerteliste(copyAntwortWerteliste);
                } else {
                    if (antwortWertelisteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.antwortWerteliste = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTFrageWerteliste();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withMoeglicherWert(String... values) {
        if (values!= null) {
            for (String value: values) {
                getMoeglicherWert().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withMoeglicherWert(Collection<String> values) {
        if (values!= null) {
            getMoeglicherWert().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withMehrfachAntwortErlaubt(Boolean value) {
        setMehrfachAntwortErlaubt(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withAntwortWerteliste(CTAntwortWerteliste value) {
        setAntwortWerteliste(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withFachlicheID(String value) {
        setFachlicheID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withTechnischeID(String value) {
        setTechnischeID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withText(String value) {
        setText(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withFreitextErlaubt(Boolean value) {
        setFreitextErlaubt(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withErlaeuterung(String value) {
        setErlaeuterung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withOptional(Boolean value) {
        setOptional(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withBedingung(CTBedingung value) {
        setBedingung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withWiederholbar(Boolean value) {
        setWiederholbar(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withMaxAntworten(Integer value) {
        setMaxAntworten(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withOrdnungsnummer(Integer value) {
        setOrdnungsnummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withAnzeigenummer(String value) {
        setAnzeigenummer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTFrageWerteliste withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
