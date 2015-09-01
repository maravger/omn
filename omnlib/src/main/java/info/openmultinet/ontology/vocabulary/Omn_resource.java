/* CVS $Id: $ */
package info.openmultinet.ontology.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/robynloughnane/git/omnnew/playground-rspecs-ontology/omnlib/ontologies/omn-resource.ttl 
 * @author Auto-generated by schemagen on 01 Sep 2015 13:57 
 */
public class Omn_resource {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://open-multinet.info/ontology/omn-resource#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "2015-04-27";
    
    /** <p>has IP address</p> */
    public static final ObjectProperty hasIPAddress = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#hasIPAddress" );
    
    /** <p>has interface</p> */
    public static final ObjectProperty hasInterface = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#hasInterface" );
    
    /** <p>has link property</p> */
    public static final ObjectProperty hasProperty = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#hasProperty" );
    
    /** <p>has sink</p> */
    public static final ObjectProperty hasSink = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#hasSink" );
    
    /** <p>has sliver type</p> */
    public static final ObjectProperty hasSliverType = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#hasSliverType" );
    
    /** <p>has source</p> */
    public static final ObjectProperty hasSource = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#hasSource" );
    
    /** <p>is IP address of</p> */
    public static final ObjectProperty isIPAddressOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#isIPAddressOf" );
    
    /** <p>is interface of</p> */
    public static final ObjectProperty isInterfaceOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#isInterfaceOf" );
    
    /** <p>is link property of</p> */
    public static final ObjectProperty isPropertyOf = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#isPropertyOf" );
    
    /** <p>is sink</p> */
    public static final ObjectProperty isSink = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#isSink" );
    
    /** <p>is source</p> */
    public static final ObjectProperty isSource = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#isSource" );
    
    /** <p>is required by an ICT object</p> */
    public static final ObjectProperty requiredBy = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#requiredBy" );
    
    /** <p>requires an ICT object</p> */
    public static final ObjectProperty requires = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-resource#requires" );
    
    /** <p>IP address</p> */
    public static final DatatypeProperty address = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#address" );
    
    /** <p>client ID</p> */
    public static final DatatypeProperty clientId = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#clientId" );
    
    /** <p>country where the resource is located</p> */
    public static final DatatypeProperty country = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#country" );
    
    /** <p>is available</p> */
    public static final DatatypeProperty isAvailable = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#isAvailable" );
    
    /** <p>is exclusive</p> */
    public static final DatatypeProperty isExclusive = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#isExclusive" );
    
    /** <p>MAC address</p> */
    public static final DatatypeProperty macAddress = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#macAddress" );
    
    /** <p>IP netmask</p> */
    public static final DatatypeProperty netmask = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#netmask" );
    
    /** <p>IP type</p> */
    public static final DatatypeProperty type = m_model.createDatatypeProperty( "http://open-multinet.info/ontology/omn-resource#type" );
    
    public static final OntClass Cloud = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Cloud" );
    
    public static final OntClass Hop = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Hop" );
    
    /** <p>IP Address</p> */
    public static final OntClass IPAddress = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#IPAddress" );
    
    /** <p>todo: omn-resource:NetworkObject or omn:Component??</p> */
    public static final OntClass Interface = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Interface" );
    
    /** <p>todo: still to decide if also at this level there is an equivalence to nml 
     *  concepts with the same name</p>
     */
    public static final OntClass Link = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Link" );
    
    public static final OntClass LinkProperty = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#LinkProperty" );
    
    /** <p>example: ports, paths, links, node, physical machine,machine, VM</p> */
    public static final OntClass NetworkObject = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#NetworkObject" );
    
    /** <p>todo: still to decide if also at this level there is an equivalence to nml 
     *  concepts with the same name</p>
     */
    public static final OntClass Node = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Node" );
    
    public static final OntClass Openflow = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Openflow" );
    
    public static final OntClass Path = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Path" );
    
    public static final OntClass SliverType = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#SliverType" );
    
    public static final OntClass Stitching = m_model.createClass( "http://open-multinet.info/ontology/omn-resource#Stitching" );
    
}
