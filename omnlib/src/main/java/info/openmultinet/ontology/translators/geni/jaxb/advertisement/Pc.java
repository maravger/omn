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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="cpus" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="vmid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "pc", namespace = "http://demo.fiteagle.org/pc")
public class Pc {

    @XmlAttribute(name = "cpus")
    protected Integer cpus;
    @XmlAttribute(name = "vmid")
    protected String vmid;

    /**
     * Gets the value of the cpus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCpus() {
        return cpus;
    }

    /**
     * Sets the value of the cpus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCpus(Integer value) {
        this.cpus = value;
    }

    /**
     * Gets the value of the vmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmid() {
        return vmid;
    }

    /**
     * Sets the value of the vmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmid(String value) {
        this.vmid = value;
    }

}
