
package net.bipro.namespace.partner;

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
 * Gruppe von natürlichen und/oder juristischen Personen. Die Mitglieder der Personengruppe können individuell über die Klasse PersonengruppenMitglied identifiziert werden. Alternativ kann mit dem Attribut Bezeichnung eine Gruppe nicht namentlich genannter Personen beschrieben werden.
 * 
 * <p>Java class for CT_Personengruppe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Personengruppe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bezeichnung" type="{http://www.bipro.net/namespace/datentypen}ST_Text100" minOccurs="0"/&gt;
 *         &lt;element name="AnzahlPersonen" type="{http://www.bipro.net/namespace/datentypen}ST_Ganzzahl" minOccurs="0"/&gt;
 *         &lt;element name="NamentlicheNennung" type="{http://www.bipro.net/namespace/datentypen}ST_JaNein" minOccurs="0"/&gt;
 *         &lt;element name="PersonengruppenID" type="{http://www.bipro.net/namespace/datentypen}ST_ID" minOccurs="0"/&gt;
 *         &lt;element name="Mitglied" type="{http://www.bipro.net/namespace/partner}CT_PersonengruppenMitglied" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Personengruppe", propOrder = {
    "bezeichnung",
    "anzahlPersonen",
    "namentlicheNennung",
    "personengruppenID",
    "mitglied"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
public class CTPersonengruppe
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{

    @XmlElement(name = "Bezeichnung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String bezeichnung;
    @XmlElement(name = "AnzahlPersonen")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Integer anzahlPersonen;
    @XmlElement(name = "NamentlicheNennung")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected Boolean namentlicheNennung;
    @XmlElement(name = "PersonengruppenID")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected String personengruppenID;
    @XmlElement(name = "Mitglied")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    protected List<CTPersonengruppenMitglied> mitglied;

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the anzahlPersonen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Integer getAnzahlPersonen() {
        return anzahlPersonen;
    }

    /**
     * Sets the value of the anzahlPersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setAnzahlPersonen(Integer value) {
        this.anzahlPersonen = value;
    }

    /**
     * Gets the value of the namentlicheNennung property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Boolean isNamentlicheNennung() {
        return namentlicheNennung;
    }

    /**
     * Sets the value of the namentlicheNennung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setNamentlicheNennung(Boolean value) {
        this.namentlicheNennung = value;
    }

    /**
     * Gets the value of the personengruppenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public String getPersonengruppenID() {
        return personengruppenID;
    }

    /**
     * Sets the value of the personengruppenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public void setPersonengruppenID(String value) {
        this.personengruppenID = value;
    }

    /**
     * Gets the value of the mitglied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitglied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMitglied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTPersonengruppenMitglied }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public List<CTPersonengruppenMitglied> getMitglied() {
        if (mitglied == null) {
            mitglied = new ArrayList<CTPersonengruppenMitglied>();
        }
        return this.mitglied;
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
        final CTPersonengruppe that = ((CTPersonengruppe) object);
        {
            String lhsBezeichnung;
            lhsBezeichnung = this.getBezeichnung();
            String rhsBezeichnung;
            rhsBezeichnung = that.getBezeichnung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bezeichnung", lhsBezeichnung), LocatorUtils.property(thatLocator, "bezeichnung", rhsBezeichnung), lhsBezeichnung, rhsBezeichnung, (this.bezeichnung!= null), (that.bezeichnung!= null))) {
                return false;
            }
        }
        {
            Integer lhsAnzahlPersonen;
            lhsAnzahlPersonen = this.getAnzahlPersonen();
            Integer rhsAnzahlPersonen;
            rhsAnzahlPersonen = that.getAnzahlPersonen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anzahlPersonen", lhsAnzahlPersonen), LocatorUtils.property(thatLocator, "anzahlPersonen", rhsAnzahlPersonen), lhsAnzahlPersonen, rhsAnzahlPersonen, (this.anzahlPersonen!= null), (that.anzahlPersonen!= null))) {
                return false;
            }
        }
        {
            Boolean lhsNamentlicheNennung;
            lhsNamentlicheNennung = this.isNamentlicheNennung();
            Boolean rhsNamentlicheNennung;
            rhsNamentlicheNennung = that.isNamentlicheNennung();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namentlicheNennung", lhsNamentlicheNennung), LocatorUtils.property(thatLocator, "namentlicheNennung", rhsNamentlicheNennung), lhsNamentlicheNennung, rhsNamentlicheNennung, (this.namentlicheNennung!= null), (that.namentlicheNennung!= null))) {
                return false;
            }
        }
        {
            String lhsPersonengruppenID;
            lhsPersonengruppenID = this.getPersonengruppenID();
            String rhsPersonengruppenID;
            rhsPersonengruppenID = that.getPersonengruppenID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personengruppenID", lhsPersonengruppenID), LocatorUtils.property(thatLocator, "personengruppenID", rhsPersonengruppenID), lhsPersonengruppenID, rhsPersonengruppenID, (this.personengruppenID!= null), (that.personengruppenID!= null))) {
                return false;
            }
        }
        {
            List<CTPersonengruppenMitglied> lhsMitglied;
            lhsMitglied = (((this.mitglied!= null)&&(!this.mitglied.isEmpty()))?this.getMitglied():null);
            List<CTPersonengruppenMitglied> rhsMitglied;
            rhsMitglied = (((that.mitglied!= null)&&(!that.mitglied.isEmpty()))?that.getMitglied():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mitglied", lhsMitglied), LocatorUtils.property(thatLocator, "mitglied", rhsMitglied), lhsMitglied, rhsMitglied, ((this.mitglied!= null)&&(!this.mitglied.isEmpty())), ((that.mitglied!= null)&&(!that.mitglied.isEmpty())))) {
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
            String theBezeichnung;
            theBezeichnung = this.getBezeichnung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bezeichnung", theBezeichnung), currentHashCode, theBezeichnung, (this.bezeichnung!= null));
        }
        {
            Integer theAnzahlPersonen;
            theAnzahlPersonen = this.getAnzahlPersonen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anzahlPersonen", theAnzahlPersonen), currentHashCode, theAnzahlPersonen, (this.anzahlPersonen!= null));
        }
        {
            Boolean theNamentlicheNennung;
            theNamentlicheNennung = this.isNamentlicheNennung();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namentlicheNennung", theNamentlicheNennung), currentHashCode, theNamentlicheNennung, (this.namentlicheNennung!= null));
        }
        {
            String thePersonengruppenID;
            thePersonengruppenID = this.getPersonengruppenID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personengruppenID", thePersonengruppenID), currentHashCode, thePersonengruppenID, (this.personengruppenID!= null));
        }
        {
            List<CTPersonengruppenMitglied> theMitglied;
            theMitglied = (((this.mitglied!= null)&&(!this.mitglied.isEmpty()))?this.getMitglied():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mitglied", theMitglied), currentHashCode, theMitglied, ((this.mitglied!= null)&&(!this.mitglied.isEmpty())));
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
        if (draftCopy instanceof CTPersonengruppe) {
            final CTPersonengruppe copy = ((CTPersonengruppe) draftCopy);
            {
                Boolean bezeichnungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bezeichnung!= null));
                if (bezeichnungShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBezeichnung;
                    sourceBezeichnung = this.getBezeichnung();
                    String copyBezeichnung = ((String) strategy.copy(LocatorUtils.property(locator, "bezeichnung", sourceBezeichnung), sourceBezeichnung, (this.bezeichnung!= null)));
                    copy.setBezeichnung(copyBezeichnung);
                } else {
                    if (bezeichnungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bezeichnung = null;
                    }
                }
            }
            {
                Boolean anzahlPersonenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.anzahlPersonen!= null));
                if (anzahlPersonenShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceAnzahlPersonen;
                    sourceAnzahlPersonen = this.getAnzahlPersonen();
                    Integer copyAnzahlPersonen = ((Integer) strategy.copy(LocatorUtils.property(locator, "anzahlPersonen", sourceAnzahlPersonen), sourceAnzahlPersonen, (this.anzahlPersonen!= null)));
                    copy.setAnzahlPersonen(copyAnzahlPersonen);
                } else {
                    if (anzahlPersonenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anzahlPersonen = null;
                    }
                }
            }
            {
                Boolean namentlicheNennungShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.namentlicheNennung!= null));
                if (namentlicheNennungShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceNamentlicheNennung;
                    sourceNamentlicheNennung = this.isNamentlicheNennung();
                    Boolean copyNamentlicheNennung = ((Boolean) strategy.copy(LocatorUtils.property(locator, "namentlicheNennung", sourceNamentlicheNennung), sourceNamentlicheNennung, (this.namentlicheNennung!= null)));
                    copy.setNamentlicheNennung(copyNamentlicheNennung);
                } else {
                    if (namentlicheNennungShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.namentlicheNennung = null;
                    }
                }
            }
            {
                Boolean personengruppenIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.personengruppenID!= null));
                if (personengruppenIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePersonengruppenID;
                    sourcePersonengruppenID = this.getPersonengruppenID();
                    String copyPersonengruppenID = ((String) strategy.copy(LocatorUtils.property(locator, "personengruppenID", sourcePersonengruppenID), sourcePersonengruppenID, (this.personengruppenID!= null)));
                    copy.setPersonengruppenID(copyPersonengruppenID);
                } else {
                    if (personengruppenIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.personengruppenID = null;
                    }
                }
            }
            {
                Boolean mitgliedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.mitglied!= null)&&(!this.mitglied.isEmpty())));
                if (mitgliedShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CTPersonengruppenMitglied> sourceMitglied;
                    sourceMitglied = (((this.mitglied!= null)&&(!this.mitglied.isEmpty()))?this.getMitglied():null);
                    @SuppressWarnings("unchecked")
                    List<CTPersonengruppenMitglied> copyMitglied = ((List<CTPersonengruppenMitglied> ) strategy.copy(LocatorUtils.property(locator, "mitglied", sourceMitglied), sourceMitglied, ((this.mitglied!= null)&&(!this.mitglied.isEmpty()))));
                    copy.mitglied = null;
                    if (copyMitglied!= null) {
                        List<CTPersonengruppenMitglied> uniqueMitgliedl = copy.getMitglied();
                        uniqueMitgliedl.addAll(copyMitglied);
                    }
                } else {
                    if (mitgliedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.mitglied = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public Object createNewInstance() {
        return new CTPersonengruppe();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withBezeichnung(String value) {
        setBezeichnung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withAnzahlPersonen(Integer value) {
        setAnzahlPersonen(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withNamentlicheNennung(Boolean value) {
        setNamentlicheNennung(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withPersonengruppenID(String value) {
        setPersonengruppenID(value);
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withMitglied(CTPersonengruppenMitglied... values) {
        if (values!= null) {
            for (CTPersonengruppenMitglied value: values) {
                getMitglied().add(value);
            }
        }
        return this;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withMitglied(Collection<CTPersonengruppenMitglied> values) {
        if (values!= null) {
            getMitglied().addAll(values);
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-03-19T04:27:26+01:00", comments = "JAXB RI v2.3.2")
    public CTPersonengruppe withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
