
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
 * Bei Verwendung zur Erfassung der Benutzerantwort auf eine bestimmte Frage wird hier ein oder kein Wert aus der Liste der in der zugehörigen Frage angegebenen möglichen Werte erfasst. Die Angabe von mehr als einem Wert ist in diesem Fall unzulässig.
 * Bei Verwendung zur providerseitigen Vorgabe von Prüfwerten in Abhängigkeiten werden hier ein oder mehrere Werte aus der Liste der Antwortmöglichkeiten der in der Abhängigkeit referenzierten Frage angegebenen.
 * 
 * <p>Java class for CT_AntwortWerteliste complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_AntwortWerteliste"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/fragen}CT_Antwort"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Listeneintrag" type="{http://www.bipro.net/namespace/datentypen}ST_Text" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AntwortWerteliste", propOrder = {
    "listeneintrag"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public class CTAntwortWerteliste
    extends CTAntwort
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Listeneintrag", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    protected List<String> listeneintrag;

    /**
     * Gets the value of the listeneintrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeneintrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeneintrag().add(newItem);
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
    public List<String> getListeneintrag() {
        if (listeneintrag == null) {
            listeneintrag = new ArrayList<String>();
        }
        return this.listeneintrag;
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
        final CTAntwortWerteliste that = ((CTAntwortWerteliste) object);
        {
            List<String> lhsListeneintrag;
            lhsListeneintrag = (((this.listeneintrag!= null)&&(!this.listeneintrag.isEmpty()))?this.getListeneintrag():null);
            List<String> rhsListeneintrag;
            rhsListeneintrag = (((that.listeneintrag!= null)&&(!that.listeneintrag.isEmpty()))?that.getListeneintrag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listeneintrag", lhsListeneintrag), LocatorUtils.property(thatLocator, "listeneintrag", rhsListeneintrag), lhsListeneintrag, rhsListeneintrag, ((this.listeneintrag!= null)&&(!this.listeneintrag.isEmpty())), ((that.listeneintrag!= null)&&(!that.listeneintrag.isEmpty())))) {
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
            List<String> theListeneintrag;
            theListeneintrag = (((this.listeneintrag!= null)&&(!this.listeneintrag.isEmpty()))?this.getListeneintrag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listeneintrag", theListeneintrag), currentHashCode, theListeneintrag, ((this.listeneintrag!= null)&&(!this.listeneintrag.isEmpty())));
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
        if (draftCopy instanceof CTAntwortWerteliste) {
            final CTAntwortWerteliste copy = ((CTAntwortWerteliste) draftCopy);
            {
                Boolean listeneintragShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.listeneintrag!= null)&&(!this.listeneintrag.isEmpty())));
                if (listeneintragShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceListeneintrag;
                    sourceListeneintrag = (((this.listeneintrag!= null)&&(!this.listeneintrag.isEmpty()))?this.getListeneintrag():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyListeneintrag = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "listeneintrag", sourceListeneintrag), sourceListeneintrag, ((this.listeneintrag!= null)&&(!this.listeneintrag.isEmpty()))));
                    copy.listeneintrag = null;
                    if (copyListeneintrag!= null) {
                        List<String> uniqueListeneintragl = copy.getListeneintrag();
                        uniqueListeneintragl.addAll(copyListeneintrag);
                    }
                } else {
                    if (listeneintragShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.listeneintrag = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTAntwortWerteliste();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortWerteliste withListeneintrag(String... values) {
        if (values!= null) {
            for (String value: values) {
                getListeneintrag().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortWerteliste withListeneintrag(Collection<String> values) {
        if (values!= null) {
            getListeneintrag().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortWerteliste withFreitext(String value) {
        setFreitext(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortWerteliste withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTAntwortWerteliste withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
