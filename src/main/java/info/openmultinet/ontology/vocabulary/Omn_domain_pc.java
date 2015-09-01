/* CVS $Id: $ */
package info.openmultinet.ontology.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/robynloughnane/git/omnnew/playground-rspecs-ontology/omnlib/ontologies/omn-domain-pc.ttl 
 * @author Auto-generated by schemagen on 01 Sep 2015 12:45 
 */
public class Omn_domain_pc {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://open-multinet.info/ontology/omn-domain-pc#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "2015-04-27";
    
    /** <p>has avalable</p> */
    public static final ObjectProperty hasAvailable = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasAvailable" );
    
    /** <p>has disk image</p> */
    public static final ObjectProperty hasDiskImage = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDiskImage" );
    
    /** <p>has hardware type</p> */
    public static final ObjectProperty hasHardwareType = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasHardwareType" );
    
    /** <p>is disk image of</p> */
    public static final ObjectProperty isDiskImageOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-domain-pc#isDiskImageOf" );
    
    /** <p>is hardware type of</p> */
    public static final ObjectProperty isHardwareTypeOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-domain-pc#isHardwareTypeOf" );
    
    /** <p>disk image default (GENI RSpec v3 disk_image &gt; default)</p> */
    public static final DatatypeProperty diskimageDefault = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#diskimageDefault" );
    
    /** <p>is emulab FD violatable</p> */
    public static final DatatypeProperty emulabFdViolatable = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#emulabFdViolatable" );
    
    /** <p>is emulab node type static</p> */
    public static final DatatypeProperty emulabNodeTypeStatic = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#emulabNodeTypeStatic" );
    
    /** <p>Gives the number of CPUs available.</p> */
    public static final DatatypeProperty hasCPU = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasCPU" );
    
    /** <p>has link property capacity (GENI Request &gt; LinkPropertyContents &gt; capacity)</p> */
    public static final DatatypeProperty hasCapacity = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasCapacity" );
    
    /** <p>has Openflow Controller type</p> */
    public static final DatatypeProperty hasControllerType = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasControllerType" );
    
    /** <p>has Openflow Controller URL</p> */
    public static final DatatypeProperty hasControllerUrl = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasControllerUrl" );
    
    /** <p>has disk image description</p> */
    public static final DatatypeProperty hasDiskimageDescription = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDiskimageDescription" );
    
    /** <p>has disk image label</p> */
    public static final DatatypeProperty hasDiskimageLabel = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDiskimageLabel" );
    
    /** <p>has disk image OS</p> */
    public static final DatatypeProperty hasDiskimageOS = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDiskimageOS" );
    
    /** <p>has disk image URI.</p> */
    public static final DatatypeProperty hasDiskimageURI = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDiskimageURI" );
    
    /** <p>has disk image version</p> */
    public static final DatatypeProperty hasDiskimageVersion = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDiskimageVersion" );
    
    /** <p>has Openflow Packet DL Type</p> */
    public static final DatatypeProperty hasDlType = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDlType" );
    
    /** <p>has Openflow Packet DL Vlan</p> */
    public static final DatatypeProperty hasDlVlan = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasDlVlan" );
    
    /** <p>has emulab FD global operator</p> */
    public static final DatatypeProperty hasEmulabFdGlobalOperator = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasEmulabFdGlobalOperator" );
    
    /** <p>has emulab FD local operator</p> */
    public static final DatatypeProperty hasEmulabFdLocalOperator = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasEmulabFdLocalOperator" );
    
    /** <p>has emulab FD name</p> */
    public static final DatatypeProperty hasEmulabFdName = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasEmulabFdName" );
    
    /** <p>has emulab FD weight</p> */
    public static final DatatypeProperty hasEmulabFdWeight = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasEmulabFdWeight" );
    
    /** <p>has emulab node type slots</p> */
    public static final DatatypeProperty hasEmulabNodeTypeSlots = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasEmulabNodeTypeSlots" );
    
    public static final DatatypeProperty hasHopType = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasHopType" );
    
    /** <p>has link property latency (GENI Request &gt; LinkPropertyContents &gt; latency)</p> */
    public static final DatatypeProperty hasLatency = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasLatency" );
    
    public static final DatatypeProperty hasNextHop = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasNextHop" );
    
    /** <p>has Openflow Packet Nw Dst</p> */
    public static final DatatypeProperty hasNwDst = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasNwDst" );
    
    /** <p>has Openflow Packet Nw Src</p> */
    public static final DatatypeProperty hasNwSrc = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasNwSrc" );
    
    /** <p>has link property packet loss (GENI Request &gt; LinkPropertyContents &gt; 
     *  packet_loss)</p>
     */
    public static final DatatypeProperty hasPacketLoss = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasPacketLoss" );
    
    /** <p>has UUID</p> */
    public static final DatatypeProperty hasUUID = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasUUID" );
    
    /** <p>has Openflow Use-Group name</p> */
    public static final DatatypeProperty hasUseGroupName = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasUseGroupName" );
    
    /** <p>Unique identifier set by the management system of a virtual machine.</p> */
    public static final DatatypeProperty hasVMID = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#hasVMID" );
    
    public static final DatatypeProperty lastUpdateTime = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#lastUpdateTime" );
    
    /** <p>restricted</p> */
    public static final DatatypeProperty restricted = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#restricted" );
    
    /** <p>Indicates that the user requires a routable IP on the control interface.</p> */
    public static final DatatypeProperty routableControlIp = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#routableControlIp" );
    
    /** <p>has VLAN tag</p> */
    public static final DatatypeProperty vlanTag = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-domain-pc#vlanTag" );
    
    /** <p>Available</p> */
    public static final OntClass Available = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#Available" );
    
    /** <p>Openflow Controller</p> */
    public static final OntClass Controller = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#Controller" );
    
    /** <p>Openflow Datapath</p> */
    public static final OntClass Datapath = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#Datapath" );
    
    /** <p>Disk Image</p> */
    public static final OntClass DiskImage = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#DiskImage" );
    
    /** <p>Emulab Feature Description</p> */
    public static final OntClass FeatureDescription = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#FeatureDescription" );
    
    /** <p>Hardware Type, see rspec v3 hardware_type</p> */
    public static final OntClass HardwareType = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#HardwareType" );
    
    /** <p>Open Stack</p> */
    public static final OntClass OpenStack = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#OpenStack" );
    
    /** <p>personal computer</p> */
    public static final OntClass PC = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#PC" );
    
    /** <p>Openflow Packet</p> */
    public static final OntClass Packet = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#Packet" );
    
    /** <p>SharedVlan</p> */
    public static final OntClass SharedVlan = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#SharedVlan" );
    
    /** <p>Virtual Machine</p> */
    public static final OntClass VM = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#VM" );
    
    /** <p>Virtual Machine Server</p> */
    public static final OntClass VMServer = m_model.createClass( "http://open-multinet.info/ontology/omn-domain-pc#VMServer" );
    
}
