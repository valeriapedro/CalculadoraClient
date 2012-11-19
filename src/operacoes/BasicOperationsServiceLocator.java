/**
 * BasicOperationsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package operacoes;

public class BasicOperationsServiceLocator extends org.apache.axis.client.Service implements operacoes.BasicOperationsService {

    public BasicOperationsServiceLocator() {
    }


    public BasicOperationsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BasicOperationsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicOperations
    private java.lang.String BasicOperations_address = "http://localhost:8080/Calculadora/services/BasicOperations";

    public java.lang.String getBasicOperationsAddress() {
        return BasicOperations_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicOperationsWSDDServiceName = "BasicOperations";

    public java.lang.String getBasicOperationsWSDDServiceName() {
        return BasicOperationsWSDDServiceName;
    }

    public void setBasicOperationsWSDDServiceName(java.lang.String name) {
        BasicOperationsWSDDServiceName = name;
    }

    public operacoes.BasicOperations getBasicOperations() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicOperations_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicOperations(endpoint);
    }

    public operacoes.BasicOperations getBasicOperations(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            operacoes.BasicOperationsSoapBindingStub _stub = new operacoes.BasicOperationsSoapBindingStub(portAddress, this);
            _stub.setPortName(getBasicOperationsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicOperationsEndpointAddress(java.lang.String address) {
        BasicOperations_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (operacoes.BasicOperations.class.isAssignableFrom(serviceEndpointInterface)) {
                operacoes.BasicOperationsSoapBindingStub _stub = new operacoes.BasicOperationsSoapBindingStub(new java.net.URL(BasicOperations_address), this);
                _stub.setPortName(getBasicOperationsWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicOperations".equals(inputPortName)) {
            return getBasicOperations();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://operacoes", "BasicOperationsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://operacoes", "BasicOperations"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicOperations".equals(portName)) {
            setBasicOperationsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
