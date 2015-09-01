//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.01 at 01:55:15 PM CEST 
//


package info.openmultinet.ontology.translators.geni.jaxb.request;

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
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="penalty" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;minInclusive value="0.0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="violatable">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="true"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="global_operator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="OnceOnly"/>
 *             &lt;enumeration value="FirstFree"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="local_operator">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="+"/>
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
@XmlRootElement(name = "property", namespace = "http://www.protogeni.net/resources/rspec/ext/emulab/1")
public class Property {

    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String value;
    @XmlAttribute(name = "penalty", required = true)
    protected float penalty;
    @XmlAttribute(name = "violatable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String violatable;
    @XmlAttribute(name = "global_operator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String globalOperator;
    @XmlAttribute(name = "local_operator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String localOperator;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     */
    public float getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     */
    public void setPenalty(float value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the violatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolatable() {
        return violatable;
    }

    /**
     * Sets the value of the violatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolatable(String value) {
        this.violatable = value;
    }

    /**
     * Gets the value of the globalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalOperator() {
        return globalOperator;
    }

    /**
     * Sets the value of the globalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalOperator(String value) {
        this.globalOperator = value;
    }

    /**
     * Gets the value of the localOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalOperator() {
        return localOperator;
    }

    /**
     * Sets the value of the localOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalOperator(String value) {
        this.localOperator = value;
    }

}
