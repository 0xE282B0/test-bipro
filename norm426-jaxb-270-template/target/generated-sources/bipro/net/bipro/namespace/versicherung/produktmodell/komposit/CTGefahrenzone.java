
package net.bipro.namespace.versicherung.produktmodell.komposit;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STGefahrenzone;
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
 * <p>Java class for CT_Gefahrenzone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Gefahrenzone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArtID" type="{http://www.bipro.net/namespace/datentypen}ST_Gefahrenzone"/&gt;
 *         &lt;element name="Wert" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Gefahrenzone", propOrder = {
    "artID",
    "wert"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTGefahrenzone
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ArtID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STGefahrenzone artID;
    @XmlElement(name = "Wert")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected int wert;

    /**
     * Gets the value of the artID property.
     * 
     * @return
     *     possible object is
     *     {@link STGefahrenzone }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STGefahrenzone getArtID() {
        return artID;
    }

    /**
     * Sets the value of the artID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGefahrenzone }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setArtID(STGefahrenzone value) {
        this.artID = value;
    }

    /**
     * Gets the value of the wert property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public int getWert() {
        return wert;
    }

    /**
     * Sets the value of the wert property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setWert(int value) {
        this.wert = value;
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
        final CTGefahrenzone that = ((CTGefahrenzone) object);
        {
            STGefahrenzone lhsArtID;
            lhsArtID = this.getArtID();
            STGefahrenzone rhsArtID;
            rhsArtID = that.getArtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "artID", lhsArtID), LocatorUtils.property(thatLocator, "artID", rhsArtID), lhsArtID, rhsArtID, (this.artID!= null), (that.artID!= null))) {
                return false;
            }
        }
        {
            int lhsWert;
            lhsWert = this.getWert();
            int rhsWert;
            rhsWert = that.getWert();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wert", lhsWert), LocatorUtils.property(thatLocator, "wert", rhsWert), lhsWert, rhsWert, true, true)) {
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
            STGefahrenzone theArtID;
            theArtID = this.getArtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "artID", theArtID), currentHashCode, theArtID, (this.artID!= null));
        }
        {
            int theWert;
            theWert = this.getWert();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wert", theWert), currentHashCode, theWert, true);
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
        if (draftCopy instanceof CTGefahrenzone) {
            final CTGefahrenzone copy = ((CTGefahrenzone) draftCopy);
            {
                Boolean artIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.artID!= null));
                if (artIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STGefahrenzone sourceArtID;
                    sourceArtID = this.getArtID();
                    STGefahrenzone copyArtID = ((STGefahrenzone) strategy.copy(LocatorUtils.property(locator, "artID", sourceArtID), sourceArtID, (this.artID!= null)));
                    copy.setArtID(copyArtID);
                } else {
                    if (artIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.artID = null;
                    }
                }
            }
            {
                Boolean wertShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (wertShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceWert;
                    sourceWert = this.getWert();
                    int copyWert = strategy.copy(LocatorUtils.property(locator, "wert", sourceWert), sourceWert, true);
                    copy.setWert(copyWert);
                } else {
                    if (wertShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTGefahrenzone();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahrenzone withArtID(STGefahrenzone value) {
        setArtID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahrenzone withWert(int value) {
        setWert(value);
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahrenzone withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTGefahrenzone withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
