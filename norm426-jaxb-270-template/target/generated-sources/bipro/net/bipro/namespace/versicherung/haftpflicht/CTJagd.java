
package net.bipro.namespace.versicherung.haftpflicht;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 * <p>Java class for CT_Jagd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Jagd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Jagdscheinnummer" type="{http://www.bipro.net/namespace/datentypen}ST_Text017" minOccurs="0"/&gt;
 *         &lt;element name="VersichertesTier" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_VersichertesTier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UntereJagdbehoerde" type="{http://www.bipro.net/namespace/versicherung/haftpflicht}CT_UntereJagdbehoerde" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Jagd", propOrder = {
    "jagdscheinnummer",
    "versichertesTier",
    "untereJagdbehoerde"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTJagd
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Jagdscheinnummer")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String jagdscheinnummer;
    @XmlElement(name = "VersichertesTier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTVersichertesTier> versichertesTier;
    @XmlElement(name = "UntereJagdbehoerde")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTUntereJagdbehoerde> untereJagdbehoerde;

    /**
     * Gets the value of the jagdscheinnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getJagdscheinnummer() {
        return jagdscheinnummer;
    }

    /**
     * Sets the value of the jagdscheinnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setJagdscheinnummer(String value) {
        this.jagdscheinnummer = value;
    }

    /**
     * Gets the value of the versichertesTier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versichertesTier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersichertesTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVersichertesTier }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTVersichertesTier> getVersichertesTier() {
        if (versichertesTier == null) {
            versichertesTier = new ArrayList<CTVersichertesTier>();
        }
        return this.versichertesTier;
    }

    /**
     * Gets the value of the untereJagdbehoerde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the untereJagdbehoerde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUntereJagdbehoerde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTUntereJagdbehoerde }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTUntereJagdbehoerde> getUntereJagdbehoerde() {
        if (untereJagdbehoerde == null) {
            untereJagdbehoerde = new ArrayList<CTUntereJagdbehoerde>();
        }
        return this.untereJagdbehoerde;
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
        final CTJagd that = ((CTJagd) object);
        {
            String lhsJagdscheinnummer;
            lhsJagdscheinnummer = this.getJagdscheinnummer();
            String rhsJagdscheinnummer;
            rhsJagdscheinnummer = that.getJagdscheinnummer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jagdscheinnummer", lhsJagdscheinnummer), LocatorUtils.property(thatLocator, "jagdscheinnummer", rhsJagdscheinnummer), lhsJagdscheinnummer, rhsJagdscheinnummer, (this.jagdscheinnummer!= null), (that.jagdscheinnummer!= null))) {
                return false;
            }
        }
        {
            List<CTVersichertesTier> lhsVersichertesTier;
            lhsVersichertesTier = (((this.versichertesTier!= null)&&(!this.versichertesTier.isEmpty()))?this.getVersichertesTier():null);
            List<CTVersichertesTier> rhsVersichertesTier;
            rhsVersichertesTier = (((that.versichertesTier!= null)&&(!that.versichertesTier.isEmpty()))?that.getVersichertesTier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versichertesTier", lhsVersichertesTier), LocatorUtils.property(thatLocator, "versichertesTier", rhsVersichertesTier), lhsVersichertesTier, rhsVersichertesTier, ((this.versichertesTier!= null)&&(!this.versichertesTier.isEmpty())), ((that.versichertesTier!= null)&&(!that.versichertesTier.isEmpty())))) {
                return false;
            }
        }
        {
            List<CTUntereJagdbehoerde> lhsUntereJagdbehoerde;
            lhsUntereJagdbehoerde = (((this.untereJagdbehoerde!= null)&&(!this.untereJagdbehoerde.isEmpty()))?this.getUntereJagdbehoerde():null);
            List<CTUntereJagdbehoerde> rhsUntereJagdbehoerde;
            rhsUntereJagdbehoerde = (((that.untereJagdbehoerde!= null)&&(!that.untereJagdbehoerde.isEmpty()))?that.getUntereJagdbehoerde():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "untereJagdbehoerde", lhsUntereJagdbehoerde), LocatorUtils.property(thatLocator, "untereJagdbehoerde", rhsUntereJagdbehoerde), lhsUntereJagdbehoerde, rhsUntereJagdbehoerde, ((this.untereJagdbehoerde!= null)&&(!this.untereJagdbehoerde.isEmpty())), ((that.untereJagdbehoerde!= null)&&(!that.untereJagdbehoerde.isEmpty())))) {
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
            String theJagdscheinnummer;
            theJagdscheinnummer = this.getJagdscheinnummer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jagdscheinnummer", theJagdscheinnummer), currentHashCode, theJagdscheinnummer, (this.jagdscheinnummer!= null));
        }
        {
            List<CTVersichertesTier> theVersichertesTier;
            theVersichertesTier = (((this.versichertesTier!= null)&&(!this.versichertesTier.isEmpty()))?this.getVersichertesTier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versichertesTier", theVersichertesTier), currentHashCode, theVersichertesTier, ((this.versichertesTier!= null)&&(!this.versichertesTier.isEmpty())));
        }
        {
            List<CTUntereJagdbehoerde> theUntereJagdbehoerde;
            theUntereJagdbehoerde = (((this.untereJagdbehoerde!= null)&&(!this.untereJagdbehoerde.isEmpty()))?this.getUntereJagdbehoerde():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "untereJagdbehoerde", theUntereJagdbehoerde), currentHashCode, theUntereJagdbehoerde, ((this.untereJagdbehoerde!= null)&&(!this.untereJagdbehoerde.isEmpty())));
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
        if (draftCopy instanceof CTJagd) {
            final CTJagd copy = ((CTJagd) draftCopy);
            {
                Boolean jagdscheinnummerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.jagdscheinnummer!= null));
                if (jagdscheinnummerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceJagdscheinnummer;
                    sourceJagdscheinnummer = this.getJagdscheinnummer();
                    String copyJagdscheinnummer = ((String) strategy.copy(LocatorUtils.property(locator, "jagdscheinnummer", sourceJagdscheinnummer), sourceJagdscheinnummer, (this.jagdscheinnummer!= null)));
                    copy.setJagdscheinnummer(copyJagdscheinnummer);
                } else {
                    if (jagdscheinnummerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.jagdscheinnummer = null;
                    }
                }
            }
            {
                Boolean versichertesTierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.versichertesTier!= null)&&(!this.versichertesTier.isEmpty())));
                if (versichertesTierShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTVersichertesTier> sourceVersichertesTier;
                    sourceVersichertesTier = (((this.versichertesTier!= null)&&(!this.versichertesTier.isEmpty()))?this.getVersichertesTier():null);
                    @SuppressWarnings("unchecked")
                    List<CTVersichertesTier> copyVersichertesTier = ((List<CTVersichertesTier> ) strategy.copy(LocatorUtils.property(locator, "versichertesTier", sourceVersichertesTier), sourceVersichertesTier, ((this.versichertesTier!= null)&&(!this.versichertesTier.isEmpty()))));
                    copy.versichertesTier = null;
                    if (copyVersichertesTier!= null) {
                        List<CTVersichertesTier> uniqueVersichertesTierl = copy.getVersichertesTier();
                        uniqueVersichertesTierl.addAll(copyVersichertesTier);
                    }
                } else {
                    if (versichertesTierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.versichertesTier = null;
                    }
                }
            }
            {
                Boolean untereJagdbehoerdeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.untereJagdbehoerde!= null)&&(!this.untereJagdbehoerde.isEmpty())));
                if (untereJagdbehoerdeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTUntereJagdbehoerde> sourceUntereJagdbehoerde;
                    sourceUntereJagdbehoerde = (((this.untereJagdbehoerde!= null)&&(!this.untereJagdbehoerde.isEmpty()))?this.getUntereJagdbehoerde():null);
                    @SuppressWarnings("unchecked")
                    List<CTUntereJagdbehoerde> copyUntereJagdbehoerde = ((List<CTUntereJagdbehoerde> ) strategy.copy(LocatorUtils.property(locator, "untereJagdbehoerde", sourceUntereJagdbehoerde), sourceUntereJagdbehoerde, ((this.untereJagdbehoerde!= null)&&(!this.untereJagdbehoerde.isEmpty()))));
                    copy.untereJagdbehoerde = null;
                    if (copyUntereJagdbehoerde!= null) {
                        List<CTUntereJagdbehoerde> uniqueUntereJagdbehoerdel = copy.getUntereJagdbehoerde();
                        uniqueUntereJagdbehoerdel.addAll(copyUntereJagdbehoerde);
                    }
                } else {
                    if (untereJagdbehoerdeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.untereJagdbehoerde = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTJagd();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJagd withJagdscheinnummer(String value) {
        setJagdscheinnummer(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJagd withVersichertesTier(CTVersichertesTier... values) {
        if (values!= null) {
            for (CTVersichertesTier value: values) {
                getVersichertesTier().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJagd withVersichertesTier(Collection<CTVersichertesTier> values) {
        if (values!= null) {
            getVersichertesTier().addAll(values);
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJagd withUntereJagdbehoerde(CTUntereJagdbehoerde... values) {
        if (values!= null) {
            for (CTUntereJagdbehoerde value: values) {
                getUntereJagdbehoerde().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJagd withUntereJagdbehoerde(Collection<CTUntereJagdbehoerde> values) {
        if (values!= null) {
            getUntereJagdbehoerde().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJagd withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTJagd withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
