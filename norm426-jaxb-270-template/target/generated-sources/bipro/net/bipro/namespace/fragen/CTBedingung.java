
package net.bipro.namespace.fragen;

import java.util.Collection;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
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


/**
 * Es kann sein, dass eine Frage A nur unter bestimmten Bedingungen &ndash; abhängig von der Beantwortung anderer Fragen B &ndash; zu stellen ist. Diese Bedingungen werden mithilfe der Klasse Bedingung abgebildet. Dabei ist die Bedingung in der Frage A enthalten. Die Fragen B werden über die spezielle Bedingung &bdquo;Abhaengigkeit&ldquo; referenziert. Es gibt mehrere Arten von Bedingungen, daher ist diese Klasse abstrakt modelliert. Die tatsächlich möglichen Arten von einfachen Fragen ergeben sich aus den abgeleiteten Klassen. Erläuterung siehe dort. Mit Hilfe der Subklassen von Bedingung lassen sich Entscheidungsbäume modellieren, deren Blätter stets Bedingungen vom Typ &bdquo;Abhängigkeit&ldquo; sind. Die inneren Knoten dienen der Verknüpfung der Abhängigkeiten zu logisch auswertbaren Bedingungen.
 * 
 * Beispiel:
 * Einfaches Beispiel: Frage 0815 muss beantwortet werden, falls die Antwort auf Frage 4711 &bdquo;true&ldquo; lautet:
 * <Element xsi:type=&ldquo;FrageText&ldquo;>
 * 	[...]
 * 	<TechnischeID>0815</TechnischeID>
 * 	<Bedingung xsi:type=&ldquo;Abhaengigkeit&ldquo;>
 * 		<LinkerOperand>4711</LinkerOperand> Referenziert eine FrageJaNein
 * 		<Operator>gleich</Operator>
 * 		<RechterOperand xsi:type=&ldquo;AntwortJaNein&ldquo;>
 * 			<Entscheidung>true</Entscheidung>
 * 		</RechterOperand>
 * 	</Bedingung>
 * </Element>
 * 
 * Komplexes Beispiel: Frage A muss beantwortet werden, wenn die Bedingung in Bezug auf Frage B nicht zutrifft oder aber wenn sowohl die Bedingung in Bezug auf Frage C als auch die Bedingung in Bezug auf Frage D zutreffen:
 * <Element xsi:type=&ldquo;FrageDatum&ldquo;>
 * 	<TechnischeID>A</TechnischeID>
 * 	<Bedingung xsi:type=&ldquo;Oder&ldquo;>
 * 		<Bedingung xsi:type=&ldquo;Nicht&ldquo;>
 * 			<Bedingung xsi:type=&ldquo;Abhaengigkeit&ldquo;>
 * 				<LinkerOperand>B</LinkerOperand>
 * [...]
 * 			</Bedingung>
 * 		</Bedingung>
 * 		<Bedingung xsi:type=&ldquo;Und&ldquo;>
 * 			<Bedingung xsi:type=&ldquo;Abhaengigkeit&ldquo;>
 * 				<LinkerOperand>C</LinkerOperand>
 * [...]
 * 			</Bedingung>
 * <Bedingung xsi:type=&ldquo;Abhaengigkeit&ldquo;>
 * 				<LinkerOperand>D</LinkerOperand>
 * [...]
 * 			</Bedingung>
 * 		</Bedingung>
 * 	</Bedingung>
 * </Element>
 * 
 * <p>Java class for CT_Bedingung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Bedingung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bipro.net/namespace/basis}CT_Objekt"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Bedingung")
@XmlSeeAlso({
    CTAbhaengigkeit.class,
    CTNicht.class,
    CTOder.class,
    CTUnd.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
public abstract class CTBedingung
    extends CTObjekt
    implements Cloneable, CopyTo2, Equals2, HashCode2
{


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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        return target;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBedingung withErweiterung(CTErweiterung... values) {
        if (values!= null) {
            for (CTErweiterung value: values) {
                getErweiterung().add(value);
            }
        }
        return this;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-04-19T05:38:04+02:00", comments = "JAXB RI v2.3.2")
    public CTBedingung withErweiterung(Collection<CTErweiterung> values) {
        if (values!= null) {
            getErweiterung().addAll(values);
        }
        return this;
    }

}
