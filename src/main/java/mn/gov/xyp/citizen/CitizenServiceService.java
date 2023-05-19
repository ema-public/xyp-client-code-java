
package mn.gov.xyp.citizen;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CitizenServiceService", targetNamespace = "http://citizen.xyp.gov.mn/", wsdlLocation = "https://xyp.gov.mn/citizen-1.5.0/ws?WSDL")
public class CitizenServiceService
    extends Service
{

    private final static URL CITIZENSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CITIZENSERVICESERVICE_EXCEPTION;
    private final static QName CITIZENSERVICESERVICE_QNAME = new QName("http://citizen.xyp.gov.mn/", "CitizenServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://xyp.gov.mn/citizen-1.5.0/ws?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CITIZENSERVICESERVICE_WSDL_LOCATION = url;
        CITIZENSERVICESERVICE_EXCEPTION = e;
    }

    public CitizenServiceService() {
        super(__getWsdlLocation(), CITIZENSERVICESERVICE_QNAME);
    }

    public CitizenServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CITIZENSERVICESERVICE_QNAME, features);
    }

    public CitizenServiceService(URL wsdlLocation) {
        super(wsdlLocation, CITIZENSERVICESERVICE_QNAME);
    }

    public CitizenServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CITIZENSERVICESERVICE_QNAME, features);
    }

    public CitizenServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CitizenServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CitizenService
     */
    @WebEndpoint(name = "CitizenServicePort")
    public CitizenService getCitizenServicePort() {
        return super.getPort(new QName("http://citizen.xyp.gov.mn/", "CitizenServicePort"), CitizenService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CitizenService
     */
    @WebEndpoint(name = "CitizenServicePort")
    public CitizenService getCitizenServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://citizen.xyp.gov.mn/", "CitizenServicePort"), CitizenService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CITIZENSERVICESERVICE_EXCEPTION!= null) {
            throw CITIZENSERVICESERVICE_EXCEPTION;
        }
        return CITIZENSERVICESERVICE_WSDL_LOCATION;
    }

}
