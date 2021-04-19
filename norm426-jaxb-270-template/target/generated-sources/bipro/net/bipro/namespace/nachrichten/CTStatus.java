
package net.bipro.namespace.nachrichten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.bipro.namespace.basis.CTErweiterung;
import net.bipro.namespace.basis.CTObjekt;
import net.bipro.namespace.datentypen.STStatus;
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
 * Dient der Abfrage oder Uebermittlung des Status eines laufenden oder abgeschlossenen Prozesses.
 * 
 * <p>Java class for CT_Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Status"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProzessID" type="{http://www.bipro.net/namespace/datentypen}ST_ProzessID"/&gt;
 *         &lt;element name="Zeitstempel" type="{http://www.bipro.net/namespace/datentypen}ST_Zeitstempel"/&gt;
 *         &lt;element name="StatusID" type="{http://www.bipro.net/namespace/datentypen}ST_Status"/&gt;
 *         &lt;element name="Gueltigkeitsende" type="{http://www.bipro.net/namespace/datentypen}ST_Zeitstempel" minOccurs="0"/&gt;
 *         &lt;element name="Schwebe" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein"/&gt;
 *         &lt;element name="Meldung" type="{http://www.bipro.net/namespace/nachrichten}CT_Meldung" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Status", propOrder = {
    "prozessID",
    "zeitstempel",
    "statusID",
    "gueltigkeitsende",
    "schwebe",
    "meldung"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTStatus
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "ProzessID", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String prozessID;
    @XmlElement(name = "Zeitstempel", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String zeitstempel;
    @XmlElement(name = "StatusID", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected STStatus statusID;
    @XmlElement(name = "Gueltigkeitsende")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String gueltigkeitsende;
    @XmlElement(name = "Schwebe")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected boolean schwebe;
    @XmlElement(name = "Meldung", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTMeldung> meldung;

    /**
     * Gets the value of the prozessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getProzessID() {
        return prozessID;
    }

    /**
     * Sets the value of the prozessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setProzessID(String value) {
        this.prozessID = value;
    }

    /**
     * Gets the value of the zeitstempel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getZeitstempel() {
        return zeitstempel;
    }

    /**
     * Sets the value of the zeitstempel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setZeitstempel(String value) {
        this.zeitstempel = value;
    }

    /**
     * Gets the value of the statusID property.
     * 
     * @return
     *     possible object is
     *     {@link STStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public STStatus getStatusID() {
        return statusID;
    }

    /**
     * Sets the value of the statusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link STStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setStatusID(STStatus value) {
        this.statusID = value;
    }

    /**
     * Gets the value of the gueltigkeitsende property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getGueltigkeitsende() {
        return gueltigkeitsende;
    }

    /**
     * Sets the value of the gueltigkeitsende property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setGueltigkeitsende(String value) {
        this.gueltigkeitsende = value;
    }

    /**
     * Gets the value of the schwebe property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public boolean isSchwebe() {
        return schwebe;
    }

    /**
     * Sets the value of the schwebe property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setSchwebe(boolean value) {
        this.schwebe = value;
    }

    /**
     * Gets the value of the meldung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meldung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeldung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTMeldung }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTMeldung> getMeldung() {
        if (meldung == null) {
            meldung = new ArrayList<CTMeldung>();
        }
        return this.meldung;
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
        final CTStatus that = ((CTStatus) object);
        {
            String lhsProzessID;
            lhsProzessID = this.getProzessID();
            String rhsProzessID;
            rhsProzessID = that.getProzessID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prozessID", lhsProzessID), LocatorUtils.property(thatLocator, "prozessID", rhsProzessID), lhsProzessID, rhsProzessID, (this.prozessID!= null), (that.prozessID!= null))) {
                return false;
            }
        }
        {
            String lhsZeitstempel;
            lhsZeitstempel = this.getZeitstempel();
            String rhsZeitstempel;
            rhsZeitstempel = that.getZeitstempel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeitstempel", lhsZeitstempel), LocatorUtils.property(thatLocator, "zeitstempel", rhsZeitstempel), lhsZeitstempel, rhsZeitstempel, (this.zeitstempel!= null), (that.zeitstempel!= null))) {
                return false;
            }
        }
        {
            STStatus lhsStatusID;
            lhsStatusID = this.getStatusID();
            STStatus rhsStatusID;
            rhsStatusID = that.getStatusID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusID", lhsStatusID), LocatorUtils.property(thatLocator, "statusID", rhsStatusID), lhsStatusID, rhsStatusID, (this.statusID!= null), (that.statusID!= null))) {
                return false;
            }
        }
        {
            String lhsGueltigkeitsende;
            lhsGueltigkeitsende = this.getGueltigkeitsende();
            String rhsGueltigkeitsende;
            rhsGueltigkeitsende = that.getGueltigkeitsende();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gueltigkeitsende", lhsGueltigkeitsende), LocatorUtils.property(thatLocator, "gueltigkeitsende", rhsGueltigkeitsende), lhsGueltigkeitsende, rhsGueltigkeitsende, (this.gueltigkeitsende!= null), (that.gueltigkeitsende!= null))) {
                return false;
            }
        }
        {
            boolean lhsSchwebe;
            lhsSchwebe = this.isSchwebe();
            boolean rhsSchwebe;
            rhsSchwebe = that.isSchwebe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schwebe", lhsSchwebe), LocatorUtils.property(thatLocator, "schwebe", rhsSchwebe), lhsSchwebe, rhsSchwebe, true, true)) {
                return false;
            }
        }
        {
            List<CTMeldung> lhsMeldung;
            lhsMeldung = (((this.meldung!= null)&&(!this.meldung.isEmpty()))?this.getMeldung():null);
            List<CTMeldung> rhsMeldung;
            rhsMeldung = (((that.meldung!= null)&&(!that.meldung.isEmpty()))?that.getMeldung():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meldung", lhsMeldung), LocatorUtils.property(thatLocator, "meldung", rhsMeldung), lhsMeldung, rhsMeldung, ((this.meldung!= null)&&(!this.meldung.isEmpty())), ((that.meldung!= null)&&(!that.meldung.isEmpty())))) {
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
            String theProzessID;
            theProzessID = this.getProzessID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prozessID", theProzessID), currentHashCode, theProzessID, (this.prozessID!= null));
        }
        {
            String theZeitstempel;
            theZeitstempel = this.getZeitstempel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeitstempel", theZeitstempel), currentHashCode, theZeitstempel, (this.zeitstempel!= null));
        }
        {
            STStatus theStatusID;
            theStatusID = this.getStatusID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusID", theStatusID), currentHashCode, theStatusID, (this.statusID!= null));
        }
        {
            String theGueltigkeitsende;
            theGueltigkeitsende = this.getGueltigkeitsende();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gueltigkeitsende", theGueltigkeitsende), currentHashCode, theGueltigkeitsende, (this.gueltigkeitsende!= null));
        }
        {
            boolean theSchwebe;
            theSchwebe = this.isSchwebe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schwebe", theSchwebe), currentHashCode, theSchwebe, true);
        }
        {
            List<CTMeldung> theMeldung;
            theMeldung = (((this.meldung!= null)&&(!this.meldung.isEmpty()))?this.getMeldung():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meldung", theMeldung), currentHashCode, theMeldung, ((this.meldung!= null)&&(!this.meldung.isEmpty())));
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
        if (draftCopy instanceof CTStatus) {
            final CTStatus copy = ((CTStatus) draftCopy);
            {
                Boolean prozessIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.prozessID!= null));
                if (prozessIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProzessID;
                    sourceProzessID = this.getProzessID();
                    String copyProzessID = ((String) strategy.copy(LocatorUtils.property(locator, "prozessID", sourceProzessID), sourceProzessID, (this.prozessID!= null)));
                    copy.setProzessID(copyProzessID);
                } else {
                    if (prozessIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.prozessID = null;
                    }
                }
            }
            {
                Boolean zeitstempelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.zeitstempel!= null));
                if (zeitstempelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceZeitstempel;
                    sourceZeitstempel = this.getZeitstempel();
                    String copyZeitstempel = ((String) strategy.copy(LocatorUtils.property(locator, "zeitstempel", sourceZeitstempel), sourceZeitstempel, (this.zeitstempel!= null)));
                    copy.setZeitstempel(copyZeitstempel);
                } else {
                    if (zeitstempelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.zeitstempel = null;
                    }
                }
            }
            {
                Boolean statusIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.statusID!= null));
                if (statusIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    STStatus sourceStatusID;
                    sourceStatusID = this.getStatusID();
                    STStatus copyStatusID = ((STStatus) strategy.copy(LocatorUtils.property(locator, "statusID", sourceStatusID), sourceStatusID, (this.statusID!= null)));
                    copy.setStatusID(copyStatusID);
                } else {
                    if (statusIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.statusID = null;
                    }
                }
            }
            {
                Boolean gueltigkeitsendeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gueltigkeitsende!= null));
                if (gueltigkeitsendeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGueltigkeitsende;
                    sourceGueltigkeitsende = this.getGueltigkeitsende();
                    String copyGueltigkeitsende = ((String) strategy.copy(LocatorUtils.property(locator, "gueltigkeitsende", sourceGueltigkeitsende), sourceGueltigkeitsende, (this.gueltigkeitsende!= null)));
                    copy.setGueltigkeitsende(copyGueltigkeitsende);
                } else {
                    if (gueltigkeitsendeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gueltigkeitsende = null;
                    }
                }
            }
            {
                Boolean schwebeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (schwebeShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceSchwebe;
                    sourceSchwebe = this.isSchwebe();
                    boolean copySchwebe = strategy.copy(LocatorUtils.property(locator, "schwebe", sourceSchwebe), sourceSchwebe, true);
                    copy.setSchwebe(copySchwebe);
                } else {
                    if (schwebeShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean meldungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.meldung!= null)&&(!this.meldung.isEmpty())));
                if (meldungShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTMeldung> sourceMeldung;
                    sourceMeldung = (((this.meldung!= null)&&(!this.meldung.isEmpty()))?this.getMeldung():null);
                    @SuppressWarnings("unchecked")
                    List<CTMeldung> copyMeldung = ((List<CTMeldung> ) strategy.copy(LocatorUtils.property(locator, "meldung", sourceMeldung), sourceMeldung, ((this.meldung!= null)&&(!this.meldung.isEmpty()))));
                    copy.meldung = null;
                    if (copyMeldung!= null) {
                        List<CTMeldung> uniqueMeldungl = copy.getMeldung();
                        uniqueMeldungl.addAll(copyMeldung);
                    }
                } else {
                    if (meldungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.meldung = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTStatus();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withProzessID(String value) {
        setProzessID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withZeitstempel(String value) {
        setZeitstempel(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withStatusID(STStatus value) {
        setStatusID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withGueltigkeitsende(String value) {
        setGueltigkeitsende(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withSchwebe(boolean value) {
        setSchwebe(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withMeldung(CTMeldung... values) {
        if (values!= null) {
            for (CTMeldung value: values) {
                getMeldung().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withMeldung(Collection<CTMeldung> values) {
        if (values!= null) {
            getMeldung().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTStatus withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
