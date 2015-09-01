/* CVS $Id: $ */
package info.openmultinet.ontology.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/robynloughnane/git/omnnew/playground-rspecs-ontology/omnlib/ontologies/omn-component.ttl 
 * @author Auto-generated by schemagen on 01 Sep 2015 12:45 
 */
public class Omn_component {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://open-multinet.info/ontology/omn-component#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "2015-04-27";
    
    /** <p>central processing unit</p> */
    public static final OntClass CPU = m_model.createClass( "http://open-multinet.info/ontology/omn-component#CPU" );
    
    /** <p>memory component</p> */
    public static final OntClass MemoryComponent = m_model.createClass( "http://open-multinet.info/ontology/omn-component#MemoryComponent" );
    
    /** <p>Processing Component</p> */
    public static final OntClass ProcessingComponent = m_model.createClass( "http://open-multinet.info/ontology/omn-component#ProcessingComponent" );
    
    /** <p>Storage Component</p> */
    public static final OntClass StorageComponent = m_model.createClass( "http://open-multinet.info/ontology/omn-component#StorageComponent" );
    
}
