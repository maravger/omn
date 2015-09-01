//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.01 at 01:55:15 PM CEST 
//


package info.openmultinet.ontology.translators.geni.jaxb.advertisement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwitchingCapabilitySpecificInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwitchingCapabilitySpecificInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="switchingCapabilitySpecificInfo_L2sc" type="{http://www.geni.net/resources/rspec/ext/stitch/2/}SwitchingCapabilitySpecificInfo_L2sc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="switchingCapabilitySpecificInfo_Lsc" type="{http://www.geni.net/resources/rspec/ext/stitch/2/}SwitchingCapabilitySpecificInfo_Lsc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="switchingCapabilitySpecificInfo_OpenflowL2sc" type="{http://www.geni.net/resources/rspec/ext/stitch/2/}SwitchingCapabilitySpecificInfo_OpenflowL2sc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchingCapabilitySpecificInfo", namespace = "http://www.geni.net/resources/rspec/ext/stitch/2/", propOrder = {
    "switchingCapabilitySpecificInfoL2Sc",
    "switchingCapabilitySpecificInfoLsc",
    "switchingCapabilitySpecificInfoOpenflowL2Sc"
})
public class SwitchingCapabilitySpecificInfo {

    @XmlElement(name = "switchingCapabilitySpecificInfo_L2sc")
    protected List<SwitchingCapabilitySpecificInfoL2Sc> switchingCapabilitySpecificInfoL2Sc;
    @XmlElement(name = "switchingCapabilitySpecificInfo_Lsc")
    protected List<SwitchingCapabilitySpecificInfoLsc> switchingCapabilitySpecificInfoLsc;
    @XmlElement(name = "switchingCapabilitySpecificInfo_OpenflowL2sc")
    protected List<SwitchingCapabilitySpecificInfoOpenflowL2Sc> switchingCapabilitySpecificInfoOpenflowL2Sc;

    /**
     * Gets the value of the switchingCapabilitySpecificInfoL2Sc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingCapabilitySpecificInfoL2Sc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingCapabilitySpecificInfoL2Sc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchingCapabilitySpecificInfoL2Sc }
     * 
     * 
     */
    public List<SwitchingCapabilitySpecificInfoL2Sc> getSwitchingCapabilitySpecificInfoL2Sc() {
        if (switchingCapabilitySpecificInfoL2Sc == null) {
            switchingCapabilitySpecificInfoL2Sc = new ArrayList<SwitchingCapabilitySpecificInfoL2Sc>();
        }
        return this.switchingCapabilitySpecificInfoL2Sc;
    }

    /**
     * Gets the value of the switchingCapabilitySpecificInfoLsc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingCapabilitySpecificInfoLsc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingCapabilitySpecificInfoLsc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchingCapabilitySpecificInfoLsc }
     * 
     * 
     */
    public List<SwitchingCapabilitySpecificInfoLsc> getSwitchingCapabilitySpecificInfoLsc() {
        if (switchingCapabilitySpecificInfoLsc == null) {
            switchingCapabilitySpecificInfoLsc = new ArrayList<SwitchingCapabilitySpecificInfoLsc>();
        }
        return this.switchingCapabilitySpecificInfoLsc;
    }

    /**
     * Gets the value of the switchingCapabilitySpecificInfoOpenflowL2Sc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingCapabilitySpecificInfoOpenflowL2Sc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingCapabilitySpecificInfoOpenflowL2Sc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchingCapabilitySpecificInfoOpenflowL2Sc }
     * 
     * 
     */
    public List<SwitchingCapabilitySpecificInfoOpenflowL2Sc> getSwitchingCapabilitySpecificInfoOpenflowL2Sc() {
        if (switchingCapabilitySpecificInfoOpenflowL2Sc == null) {
            switchingCapabilitySpecificInfoOpenflowL2Sc = new ArrayList<SwitchingCapabilitySpecificInfoOpenflowL2Sc>();
        }
        return this.switchingCapabilitySpecificInfoOpenflowL2Sc;
    }

}
