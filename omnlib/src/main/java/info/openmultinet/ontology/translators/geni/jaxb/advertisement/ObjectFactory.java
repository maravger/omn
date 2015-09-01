//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.01 at 01:55:15 PM CEST 
//


package info.openmultinet.ontology.translators.geni.jaxb.advertisement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the info.openmultinet.ontology.translators.geni.jaxb.advertisement package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Stitching_QNAME = new QName("http://www.geni.net/resources/rspec/ext/stitch/2/", "stitching");
    private final static QName _Interface_QNAME = new QName("http://www.geni.net/resources/rspec/3", "interface");
    private final static QName _Login_QNAME = new QName("http://www.geni.net/resources/rspec/3", "login");
    private final static QName _Relation_QNAME = new QName("http://www.geni.net/resources/rspec/3", "relation");
    private final static QName _Path_QNAME = new QName("http://www.geni.net/resources/rspec/ext/stitch/2/", "path");
    private final static QName _Link_QNAME = new QName("http://www.geni.net/resources/rspec/3", "link");
    private final static QName _Available_QNAME = new QName("http://www.geni.net/resources/rspec/3", "available");
    private final static QName _InterfaceRef_QNAME = new QName("http://www.geni.net/resources/rspec/3", "interface_ref");
    private final static QName _TypeRelation_QNAME = new QName("http://www.geni.net/resources/rspec/3", "type_relation");
    private final static QName _Rspec_QNAME = new QName("http://www.geni.net/resources/rspec/3", "rspec");
    private final static QName _Aggregate_QNAME = new QName("http://www.geni.net/resources/rspec/ext/stitch/2/", "aggregate");
    private final static QName _Property_QNAME = new QName("http://www.geni.net/resources/rspec/3", "property");
    private final static QName _Ip_QNAME = new QName("http://www.geni.net/resources/rspec/3", "ip");
    private final static QName _Execute_QNAME = new QName("http://www.geni.net/resources/rspec/3", "execute");
    private final static QName _Action_QNAME = new QName("http://www.geni.net/resources/rspec/ext/opstate/1", "action");
    private final static QName _Monitoring_QNAME = new QName("http://www.geni.net/resources/rspec/3", "monitoring");
    private final static QName _State_QNAME = new QName("http://www.geni.net/resources/rspec/ext/opstate/1", "state");
    private final static QName _Services_QNAME = new QName("http://www.geni.net/resources/rspec/3", "services");
    private final static QName _Port_QNAME = new QName("http://www.geni.net/resources/rspec/ext/stitch/2/", "port");
    private final static QName _Install_QNAME = new QName("http://www.geni.net/resources/rspec/3", "install");
    private final static QName _HardwareType_QNAME = new QName("http://www.geni.net/resources/rspec/3", "hardware_type");
    private final static QName _ExternalRef_QNAME = new QName("http://www.geni.net/resources/rspec/3", "external_ref");
    private final static QName _Wait_QNAME = new QName("http://www.geni.net/resources/rspec/ext/opstate/1", "wait");
    private final static QName _Node_QNAME = new QName("http://www.geni.net/resources/rspec/3", "node");
    private final static QName _Description_QNAME = new QName("http://www.geni.net/resources/rspec/ext/opstate/1", "description");
    private final static QName _Location_QNAME = new QName("http://www.geni.net/resources/rspec/3", "location");
    private final static QName _TypeRelationContentsSliverType_QNAME = new QName("http://www.geni.net/resources/rspec/3", "sliver_type");
    private final static QName _TypeRelationContentsDiskImage_QNAME = new QName("http://www.geni.net/resources/rspec/3", "disk_image");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: info.openmultinet.ontology.translators.geni.jaxb.advertisement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeRelationContents }
     * 
     */
    public TypeRelationContents createTypeRelationContents() {
        return new TypeRelationContents();
    }

    /**
     * Create an instance of {@link NodeContents }
     * 
     */
    public NodeContents createNodeContents() {
        return new NodeContents();
    }

    /**
     * Create an instance of {@link NodeContents.SliverType }
     * 
     */
    public NodeContents.SliverType createNodeContentsSliverType() {
        return new NodeContents.SliverType();
    }

    /**
     * Create an instance of {@link ComponentManager }
     * 
     */
    public ComponentManager createComponentManager() {
        return new ComponentManager();
    }

    /**
     * Create an instance of {@link IpContents }
     * 
     */
    public IpContents createIpContents() {
        return new IpContents();
    }

    /**
     * Create an instance of {@link LinkContents }
     * 
     */
    public LinkContents createLinkContents() {
        return new LinkContents();
    }

    /**
     * Create an instance of {@link AvailableContents }
     * 
     */
    public AvailableContents createAvailableContents() {
        return new AvailableContents();
    }

    /**
     * Create an instance of {@link InterfaceRefContents }
     * 
     */
    public InterfaceRefContents createInterfaceRefContents() {
        return new InterfaceRefContents();
    }

    /**
     * Create an instance of {@link ServiceContents }
     * 
     */
    public ServiceContents createServiceContents() {
        return new ServiceContents();
    }

    /**
     * Create an instance of {@link InterfaceContents }
     * 
     */
    public InterfaceContents createInterfaceContents() {
        return new InterfaceContents();
    }

    /**
     * Create an instance of {@link LoginServiceContents }
     * 
     */
    public LoginServiceContents createLoginServiceContents() {
        return new LoginServiceContents();
    }

    /**
     * Create an instance of {@link MonitoringContents }
     * 
     */
    public MonitoringContents createMonitoringContents() {
        return new MonitoringContents();
    }

    /**
     * Create an instance of {@link ExecuteServiceContents }
     * 
     */
    public ExecuteServiceContents createExecuteServiceContents() {
        return new ExecuteServiceContents();
    }

    /**
     * Create an instance of {@link RelationContents }
     * 
     */
    public RelationContents createRelationContents() {
        return new RelationContents();
    }

    /**
     * Create an instance of {@link Cloud }
     * 
     */
    public Cloud createCloud() {
        return new Cloud();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link RSpecContents }
     * 
     */
    public RSpecContents createRSpecContents() {
        return new RSpecContents();
    }

    /**
     * Create an instance of {@link InstallServiceContents }
     * 
     */
    public InstallServiceContents createInstallServiceContents() {
        return new InstallServiceContents();
    }

    /**
     * Create an instance of {@link HardwareTypeContents }
     * 
     */
    public HardwareTypeContents createHardwareTypeContents() {
        return new HardwareTypeContents();
    }

    /**
     * Create an instance of {@link ExternalReferenceContents }
     * 
     */
    public ExternalReferenceContents createExternalReferenceContents() {
        return new ExternalReferenceContents();
    }

    /**
     * Create an instance of {@link LinkPropertyContents }
     * 
     */
    public LinkPropertyContents createLinkPropertyContents() {
        return new LinkPropertyContents();
    }

    /**
     * Create an instance of {@link LinkClass }
     * 
     */
    public LinkClass createLinkClass() {
        return new LinkClass();
    }

    /**
     * Create an instance of {@link LocationContents }
     * 
     */
    public LocationContents createLocationContents() {
        return new LocationContents();
    }

    /**
     * Create an instance of {@link DiskImageContents }
     * 
     */
    public DiskImageContents createDiskImageContents() {
        return new DiskImageContents();
    }

    /**
     * Create an instance of {@link WaitSpec }
     * 
     */
    public WaitSpec createWaitSpec() {
        return new WaitSpec();
    }

    /**
     * Create an instance of {@link info.openmultinet.ontology.translators.geni.jaxb.advertisement.SliverType }
     * 
     */
    public info.openmultinet.ontology.translators.geni.jaxb.advertisement.SliverType createSliverType() {
        return new info.openmultinet.ontology.translators.geni.jaxb.advertisement.SliverType();
    }

    /**
     * Create an instance of {@link ActionSpec }
     * 
     */
    public ActionSpec createActionSpec() {
        return new ActionSpec();
    }

    /**
     * Create an instance of {@link StateSpec }
     * 
     */
    public StateSpec createStateSpec() {
        return new StateSpec();
    }

    /**
     * Create an instance of {@link RspecOpstate }
     * 
     */
    public RspecOpstate createRspecOpstate() {
        return new RspecOpstate();
    }

    /**
     * Create an instance of {@link Available }
     * 
     */
    public Available createAvailable() {
        return new Available();
    }

    /**
     * Create an instance of {@link RspecSharedVlan }
     * 
     */
    public RspecSharedVlan createRspecSharedVlan() {
        return new RspecSharedVlan();
    }

    /**
     * Create an instance of {@link Monitoring }
     * 
     */
    public Monitoring createMonitoring() {
        return new Monitoring();
    }

    /**
     * Create an instance of {@link RspecOmspMonitoring }
     * 
     */
    public RspecOmspMonitoring createRspecOmspMonitoring() {
        return new RspecOmspMonitoring();
    }

    /**
     * Create an instance of {@link Pc }
     * 
     */
    public Pc createPc() {
        return new Pc();
    }

    /**
     * Create an instance of {@link RspecPc }
     * 
     */
    public RspecPc createRspecPc() {
        return new RspecPc();
    }

    /**
     * Create an instance of {@link PathContent }
     * 
     */
    public PathContent createPathContent() {
        return new PathContent();
    }

    /**
     * Create an instance of {@link PortContent }
     * 
     */
    public PortContent createPortContent() {
        return new PortContent();
    }

    /**
     * Create an instance of {@link StitchContent }
     * 
     */
    public StitchContent createStitchContent() {
        return new StitchContent();
    }

    /**
     * Create an instance of {@link AggregateContent }
     * 
     */
    public AggregateContent createAggregateContent() {
        return new AggregateContent();
    }

    /**
     * Create an instance of {@link SwitchingCapabilitySpecificInfoL2Sc }
     * 
     */
    public SwitchingCapabilitySpecificInfoL2Sc createSwitchingCapabilitySpecificInfoL2Sc() {
        return new SwitchingCapabilitySpecificInfoL2Sc();
    }

    /**
     * Create an instance of {@link SwitchingCapabilitySpecificInfoLsc }
     * 
     */
    public SwitchingCapabilitySpecificInfoLsc createSwitchingCapabilitySpecificInfoLsc() {
        return new SwitchingCapabilitySpecificInfoLsc();
    }

    /**
     * Create an instance of {@link CapabilitiesContent }
     * 
     */
    public CapabilitiesContent createCapabilitiesContent() {
        return new CapabilitiesContent();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link AddressContent }
     * 
     */
    public AddressContent createAddressContent() {
        return new AddressContent();
    }

    /**
     * Create an instance of {@link SwitchingCapabilitySpecificInfo }
     * 
     */
    public SwitchingCapabilitySpecificInfo createSwitchingCapabilitySpecificInfo() {
        return new SwitchingCapabilitySpecificInfo();
    }

    /**
     * Create an instance of {@link NextHopContent }
     * 
     */
    public NextHopContent createNextHopContent() {
        return new NextHopContent();
    }

    /**
     * Create an instance of {@link AdministrativeGroup }
     * 
     */
    public AdministrativeGroup createAdministrativeGroup() {
        return new AdministrativeGroup();
    }

    /**
     * Create an instance of {@link Lifetime }
     * 
     */
    public Lifetime createLifetime() {
        return new Lifetime();
    }

    /**
     * Create an instance of {@link SwitchingCapabilityDescriptor }
     * 
     */
    public SwitchingCapabilityDescriptor createSwitchingCapabilityDescriptor() {
        return new SwitchingCapabilityDescriptor();
    }

    /**
     * Create an instance of {@link HopContent }
     * 
     */
    public HopContent createHopContent() {
        return new HopContent();
    }

    /**
     * Create an instance of {@link SwitchingCapabilitySpecificInfoOpenflowL2Sc }
     * 
     */
    public SwitchingCapabilitySpecificInfoOpenflowL2Sc createSwitchingCapabilitySpecificInfoOpenflowL2Sc() {
        return new SwitchingCapabilitySpecificInfoOpenflowL2Sc();
    }

    /**
     * Create an instance of {@link AggregateSignatureContent }
     * 
     */
    public AggregateSignatureContent createAggregateSignatureContent() {
        return new AggregateSignatureContent();
    }

    /**
     * Create an instance of {@link TimeContent }
     * 
     */
    public TimeContent createTimeContent() {
        return new TimeContent();
    }

    /**
     * Create an instance of {@link Xen }
     * 
     */
    public Xen createXen() {
        return new Xen();
    }

    /**
     * Create an instance of {@link TrivialOk }
     * 
     */
    public TrivialOk createTrivialOk() {
        return new TrivialOk();
    }

    /**
     * Create an instance of {@link Vclass }
     * 
     */
    public Vclass createVclass() {
        return new Vclass();
    }

    /**
     * Create an instance of {@link PhysicalType }
     * 
     */
    public PhysicalType createPhysicalType() {
        return new PhysicalType();
    }

    /**
     * Create an instance of {@link UntaggedVlan }
     * 
     */
    public UntaggedVlan createUntaggedVlan() {
        return new UntaggedVlan();
    }

    /**
     * Create an instance of {@link Fixedinterface }
     * 
     */
    public Fixedinterface createFixedinterface() {
        return new Fixedinterface();
    }

    /**
     * Create an instance of {@link HintTo }
     * 
     */
    public HintTo createHintTo() {
        return new HintTo();
    }

    /**
     * Create an instance of {@link Nodelay }
     * 
     */
    public Nodelay createNodelay() {
        return new Nodelay();
    }

    /**
     * Create an instance of {@link Vnode }
     * 
     */
    public Vnode createVnode() {
        return new Vnode();
    }

    /**
     * Create an instance of {@link RoutableControlIp }
     * 
     */
    public RoutableControlIp createRoutableControlIp() {
        return new RoutableControlIp();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link MultiplexOk }
     * 
     */
    public MultiplexOk createMultiplexOk() {
        return new MultiplexOk();
    }

    /**
     * Create an instance of {@link Fd }
     * 
     */
    public Fd createFd() {
        return new Fd();
    }

    /**
     * Create an instance of {@link DisallowTrivialMix }
     * 
     */
    public DisallowTrivialMix createDisallowTrivialMix() {
        return new DisallowTrivialMix();
    }

    /**
     * Create an instance of {@link TypeRelationContents.SliverType }
     * 
     */
    public TypeRelationContents.SliverType createTypeRelationContentsSliverType() {
        return new TypeRelationContents.SliverType();
    }

    /**
     * Create an instance of {@link NodeContents.SliverType.DiskImage }
     * 
     */
    public NodeContents.SliverType.DiskImage createNodeContentsSliverTypeDiskImage() {
        return new NodeContents.SliverType.DiskImage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StitchContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/stitch/2/", name = "stitching")
    public JAXBElement<StitchContent> createStitching(StitchContent value) {
        return new JAXBElement<StitchContent>(_Stitching_QNAME, StitchContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "interface")
    public JAXBElement<InterfaceContents> createInterface(InterfaceContents value) {
        return new JAXBElement<InterfaceContents>(_Interface_QNAME, InterfaceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "login")
    public JAXBElement<LoginServiceContents> createLogin(LoginServiceContents value) {
        return new JAXBElement<LoginServiceContents>(_Login_QNAME, LoginServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "relation")
    public JAXBElement<RelationContents> createRelation(RelationContents value) {
        return new JAXBElement<RelationContents>(_Relation_QNAME, RelationContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/stitch/2/", name = "path")
    public JAXBElement<PathContent> createPath(PathContent value) {
        return new JAXBElement<PathContent>(_Path_QNAME, PathContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "link")
    public JAXBElement<LinkContents> createLink(LinkContents value) {
        return new JAXBElement<LinkContents>(_Link_QNAME, LinkContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "available")
    public JAXBElement<AvailableContents> createAvailable(AvailableContents value) {
        return new JAXBElement<AvailableContents>(_Available_QNAME, AvailableContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceRefContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "interface_ref")
    public JAXBElement<InterfaceRefContents> createInterfaceRef(InterfaceRefContents value) {
        return new JAXBElement<InterfaceRefContents>(_InterfaceRef_QNAME, InterfaceRefContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeRelationContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "type_relation")
    public JAXBElement<TypeRelationContents> createTypeRelation(TypeRelationContents value) {
        return new JAXBElement<TypeRelationContents>(_TypeRelation_QNAME, TypeRelationContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSpecContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "rspec")
    public JAXBElement<RSpecContents> createRspec(RSpecContents value) {
        return new JAXBElement<RSpecContents>(_Rspec_QNAME, RSpecContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregateContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/stitch/2/", name = "aggregate")
    public JAXBElement<AggregateContent> createAggregate(AggregateContent value) {
        return new JAXBElement<AggregateContent>(_Aggregate_QNAME, AggregateContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkPropertyContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "property")
    public JAXBElement<LinkPropertyContents> createProperty(LinkPropertyContents value) {
        return new JAXBElement<LinkPropertyContents>(_Property_QNAME, LinkPropertyContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "ip")
    public JAXBElement<IpContents> createIp(IpContents value) {
        return new JAXBElement<IpContents>(_Ip_QNAME, IpContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "execute")
    public JAXBElement<ExecuteServiceContents> createExecute(ExecuteServiceContents value) {
        return new JAXBElement<ExecuteServiceContents>(_Execute_QNAME, ExecuteServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/opstate/1", name = "action")
    public JAXBElement<ActionSpec> createAction(ActionSpec value) {
        return new JAXBElement<ActionSpec>(_Action_QNAME, ActionSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoringContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "monitoring")
    public JAXBElement<MonitoringContents> createMonitoring(MonitoringContents value) {
        return new JAXBElement<MonitoringContents>(_Monitoring_QNAME, MonitoringContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/opstate/1", name = "state")
    public JAXBElement<StateSpec> createState(StateSpec value) {
        return new JAXBElement<StateSpec>(_State_QNAME, StateSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "services")
    public JAXBElement<ServiceContents> createServices(ServiceContents value) {
        return new JAXBElement<ServiceContents>(_Services_QNAME, ServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/stitch/2/", name = "port")
    public JAXBElement<PortContent> createPort(PortContent value) {
        return new JAXBElement<PortContent>(_Port_QNAME, PortContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallServiceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "install")
    public JAXBElement<InstallServiceContents> createInstall(InstallServiceContents value) {
        return new JAXBElement<InstallServiceContents>(_Install_QNAME, InstallServiceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HardwareTypeContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "hardware_type")
    public JAXBElement<HardwareTypeContents> createHardwareType(HardwareTypeContents value) {
        return new JAXBElement<HardwareTypeContents>(_HardwareType_QNAME, HardwareTypeContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReferenceContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "external_ref")
    public JAXBElement<ExternalReferenceContents> createExternalRef(ExternalReferenceContents value) {
        return new JAXBElement<ExternalReferenceContents>(_ExternalRef_QNAME, ExternalReferenceContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaitSpec }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/opstate/1", name = "wait")
    public JAXBElement<WaitSpec> createWait(WaitSpec value) {
        return new JAXBElement<WaitSpec>(_Wait_QNAME, WaitSpec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "node")
    public JAXBElement<NodeContents> createNode(NodeContents value) {
        return new JAXBElement<NodeContents>(_Node_QNAME, NodeContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/ext/opstate/1", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "location")
    public JAXBElement<LocationContents> createLocation(LocationContents value) {
        return new JAXBElement<LocationContents>(_Location_QNAME, LocationContents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeRelationContents.SliverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "sliver_type", scope = TypeRelationContents.class)
    public JAXBElement<TypeRelationContents.SliverType> createTypeRelationContentsSliverType(TypeRelationContents.SliverType value) {
        return new JAXBElement<TypeRelationContents.SliverType>(_TypeRelationContentsSliverType_QNAME, TypeRelationContents.SliverType.class, TypeRelationContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiskImageContents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "disk_image", scope = TypeRelationContents.class)
    public JAXBElement<DiskImageContents> createTypeRelationContentsDiskImage(DiskImageContents value) {
        return new JAXBElement<DiskImageContents>(_TypeRelationContentsDiskImage_QNAME, DiskImageContents.class, TypeRelationContents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeContents.SliverType.DiskImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "disk_image", scope = NodeContents.SliverType.class)
    public JAXBElement<NodeContents.SliverType.DiskImage> createNodeContentsSliverTypeDiskImage(NodeContents.SliverType.DiskImage value) {
        return new JAXBElement<NodeContents.SliverType.DiskImage>(_TypeRelationContentsDiskImage_QNAME, NodeContents.SliverType.DiskImage.class, NodeContents.SliverType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeContents.SliverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.geni.net/resources/rspec/3", name = "sliver_type", scope = NodeContents.class)
    public JAXBElement<NodeContents.SliverType> createNodeContentsSliverType(NodeContents.SliverType value) {
        return new JAXBElement<NodeContents.SliverType>(_TypeRelationContentsSliverType_QNAME, NodeContents.SliverType.class, NodeContents.class, value);
    }

}
