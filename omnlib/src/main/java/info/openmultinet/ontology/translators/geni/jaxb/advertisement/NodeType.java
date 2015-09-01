//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.01 at 01:55:15 PM CEST 
//


package info.openmultinet.ontology.translators.geni.jaxb.advertisement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type_slots" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="static">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="true"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "node_type", namespace = "http://www.protogeni.net/resources/rspec/ext/emulab/1")
public class NodeType {

    @XmlAttribute(name = "type_slots", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String typeSlots;
    @XmlAttribute(name = "static")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _static;

    /**
     * Gets the value of the typeSlots property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSlots() {
        return typeSlots;
    }

    /**
     * Sets the value of the typeSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSlots(String value) {
        this.typeSlots = value;
    }

    /**
     * Gets the value of the static property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatic() {
        return _static;
    }

    /**
     * Sets the value of the static property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatic(String value) {
        this._static = value;
    }

}
