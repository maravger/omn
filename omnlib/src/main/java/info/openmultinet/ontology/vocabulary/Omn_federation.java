/* CVS $Id: $ */
package info.openmultinet.ontology.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/robynloughnane/git/omnnew/playground-rspecs-ontology/omnlib/ontologies/omn-federation.ttl 
 * @author Auto-generated by schemagen on 01 Sep 2015 13:57 
 */
public class Omn_federation {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://open-multinet.info/ontology/omn-federation#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "2015-04-27";
    
    /** <p>an organization (e.g. a federation member) administers its own infrastructure</p> */
    public static final ObjectProperty administers = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-federation#administers" );
    
    /** <p>a federation can have an organization as a member</p> */
    public static final ObjectProperty hasFederationMember = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-federation#hasFederationMember" );
    
    /** <p>an infrastructure can be administered by an organization (e.g. a federation 
     *  member)</p>
     */
    public static final ObjectProperty isAdministeredBy = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-federation#isAdministeredBy" );
    
    /** <p>an organization can be part of a federation</p> */
    public static final ObjectProperty partOfFederation = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-federation#partOfFederation" );
    
    /** <p>a federation of infrastructures</p> */
    public static final OntClass Federation = m_model.createClass( "http://open-multinet.info/ontology/omn-federation#Federation" );
    
    /** <p>member of a federation</p> */
    public static final OntClass FederationMember = m_model.createClass( "http://open-multinet.info/ontology/omn-federation#FederationMember" );
    
    /** <p>Example: FUESCO Playgroundan infrastructure such as a testbed or cloud facility</p> */
    public static final OntClass Infrastructure = m_model.createClass( "http://open-multinet.info/ontology/omn-federation#Infrastructure" );
    
}