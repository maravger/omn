//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 12:23:28 AM CET 
//


package info.openmultinet.ontology.translators.geni.jaxb.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RspecTypeContents.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RspecTypeContents">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="request"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RspecTypeContents")
@XmlEnum
public enum RspecTypeContents {

    @XmlEnumValue("request")
    REQUEST("request");
    private final String value;

    RspecTypeContents(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RspecTypeContents fromValue(String v) {
        for (RspecTypeContents c: RspecTypeContents.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
