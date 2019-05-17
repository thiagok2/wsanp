
package test.client.stubs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FileTransfererImplService", targetNamespace = "http://server.test/", wsdlLocation = "http://localhost:9898/anpws/fs?wsdl")
public class FileTransfererImplService
    extends Service
{

    private final static URL FILETRANSFERERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException FILETRANSFERERIMPLSERVICE_EXCEPTION;
    private final static QName FILETRANSFERERIMPLSERVICE_QNAME = new QName("http://server.test/", "FileTransfererImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9898/anpws/fs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FILETRANSFERERIMPLSERVICE_WSDL_LOCATION = url;
        FILETRANSFERERIMPLSERVICE_EXCEPTION = e;
    }

    public FileTransfererImplService() {
        super(__getWsdlLocation(), FILETRANSFERERIMPLSERVICE_QNAME);
    }

    public FileTransfererImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FILETRANSFERERIMPLSERVICE_QNAME, features);
    }

    public FileTransfererImplService(URL wsdlLocation) {
        super(wsdlLocation, FILETRANSFERERIMPLSERVICE_QNAME);
    }

    public FileTransfererImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FILETRANSFERERIMPLSERVICE_QNAME, features);
    }

    public FileTransfererImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FileTransfererImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FileTransfererImpl
     */
    @WebEndpoint(name = "FileTransfererImplPort")
    public FileTransfererImpl getFileTransfererImplPort() {
        return super.getPort(new QName("http://server.test/", "FileTransfererImplPort"), FileTransfererImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FileTransfererImpl
     */
    @WebEndpoint(name = "FileTransfererImplPort")
    public FileTransfererImpl getFileTransfererImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.test/", "FileTransfererImplPort"), FileTransfererImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FILETRANSFERERIMPLSERVICE_EXCEPTION!= null) {
            throw FILETRANSFERERIMPLSERVICE_EXCEPTION;
        }
        return FILETRANSFERERIMPLSERVICE_WSDL_LOCATION;
    }

}
