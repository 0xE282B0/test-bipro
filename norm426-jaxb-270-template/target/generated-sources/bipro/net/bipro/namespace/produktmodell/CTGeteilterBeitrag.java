
package net.bipro.namespace.produktmodell;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.allgemein.CTBetrag;
import net.bipro.namespace.allgemein.CTSteuer;
import net.bipro.namespace.allgemein.CTZeitraum;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.datentypen.STDauer;
import net.bipro.namespace.datentypen.STEBeitrag;
import net.bipro.namespace.datentypen.STZahlungsweise;
import net.bipro.namespace.partner.CTVermoegenswirksameLeistung;
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
 * Klasse zur Abbildung geteilter Beiträge (z.B. Arbeitgeber- und Arbeitnehmeranteil in der betrieblichen Altersvorsorge).
 * Der von GeteilterBeitrag referenzierte Betrag MUSS der Summe aller Teilbeiträge entsprechen.
 * 
 * <p>Java class for CT_GeteilterBeitrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_GeteilterBeitrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/produktmodell}CT_Beitrag"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Teilbeitrag" type="{http://www.bipro.net/namespace/produktmodell}CT_Teilbeitrag" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_GeteilterBeitrag", propOrder = {
    "teilbeitrag"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTGeteilterBeitrag
    extends CTBeitrag
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Teilbeitrag", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<CTTeilbeitrag> teilbeitrag;

    /**
     * Gets the value of the teilbeitrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teilbeitrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeilbeitrag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTTeilbeitrag }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public List<CTTeilbeitrag> getTeilbeitrag() {
        if (teilbeitrag == null) {
            teilbeitrag = new ArrayList<CTTeilbeitrag>();
        }
        return this.teilbeitrag;
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
        final CTGeteilterBeitrag that = ((CTGeteilterBeitrag) object);
        {
            List<CTTeilbeitrag> lhsTeilbeitrag;
            lhsTeilbeitrag = (((this.teilbeitrag!= null)&&(!this.teilbeitrag.isEmpty()))?this.getTeilbeitrag():null);
            List<CTTeilbeitrag> rhsTeilbeitrag;
            rhsTeilbeitrag = (((that.teilbeitrag!= null)&&(!that.teilbeitrag.isEmpty()))?that.getTeilbeitrag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teilbeitrag", lhsTeilbeitrag), LocatorUtils.property(thatLocator, "teilbeitrag", rhsTeilbeitrag), lhsTeilbeitrag, rhsTeilbeitrag, ((this.teilbeitrag!= null)&&(!this.teilbeitrag.isEmpty())), ((that.teilbeitrag!= null)&&(!that.teilbeitrag.isEmpty())))) {
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
            List<CTTeilbeitrag> theTeilbeitrag;
            theTeilbeitrag = (((this.teilbeitrag!= null)&&(!this.teilbeitrag.isEmpty()))?this.getTeilbeitrag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "teilbeitrag", theTeilbeitrag), currentHashCode, theTeilbeitrag, ((this.teilbeitrag!= null)&&(!this.teilbeitrag.isEmpty())));
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
        if (draftCopy instanceof CTGeteilterBeitrag) {
            final CTGeteilterBeitrag copy = ((CTGeteilterBeitrag) draftCopy);
            {
                Boolean teilbeitragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.teilbeitrag!= null)&&(!this.teilbeitrag.isEmpty())));
                if (teilbeitragShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTTeilbeitrag> sourceTeilbeitrag;
                    sourceTeilbeitrag = (((this.teilbeitrag!= null)&&(!this.teilbeitrag.isEmpty()))?this.getTeilbeitrag():null);
                    @SuppressWarnings("unchecked")
                    List<CTTeilbeitrag> copyTeilbeitrag = ((List<CTTeilbeitrag> ) strategy.copy(LocatorUtils.property(locator, "teilbeitrag", sourceTeilbeitrag), sourceTeilbeitrag, ((this.teilbeitrag!= null)&&(!this.teilbeitrag.isEmpty()))));
                    copy.teilbeitrag = null;
                    if (copyTeilbeitrag!= null) {
                        List<CTTeilbeitrag> uniqueTeilbeitragl = copy.getTeilbeitrag();
                        uniqueTeilbeitragl.addAll(copyTeilbeitrag);
                    }
                } else {
                    if (teilbeitragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teilbeitrag = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGeteilterBeitrag();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withTeilbeitrag(CTTeilbeitrag... values) {
        if (values!= null) {
            for (CTTeilbeitrag value: values) {
                getTeilbeitrag().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withTeilbeitrag(Collection<CTTeilbeitrag> values) {
        if (values!= null) {
            getTeilbeitrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withArtID(STEBeitrag value) {
        setArtID(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withBetrag(CTBetrag value) {
        setBetrag(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withZahlungsweise(STZahlungsweise value) {
        setZahlungsweise(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withProzentsatz(BigDecimal value) {
        setProzentsatz(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withDauer(STDauer value) {
        setDauer(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withErhebung(CTZeitraum value) {
        setErhebung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withVermoegenswirksameLeistung(CTVermoegenswirksameLeistung value) {
        setVermoegenswirksameLeistung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withSteuer(CTSteuer... values) {
        if (values!= null) {
            for (CTSteuer value: values) {
                getSteuer().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withSteuer(Collection<CTSteuer> values) {
        if (values!= null) {
            getSteuer().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withBeitragsfoerderung(CTBeitragsfoerderung value) {
        setBeitragsfoerderung(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withBeitragsschuldner(CTBeitragsschuldner value) {
        setBeitragsschuldner(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withBeitragImRueckstand(Boolean value) {
        setBeitragImRueckstand(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTGeteilterBeitrag withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
