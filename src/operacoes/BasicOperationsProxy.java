package operacoes;

public class BasicOperationsProxy implements operacoes.BasicOperations {
  private String _endpoint = null;
  private operacoes.BasicOperations basicOperations = null;
  
  public BasicOperationsProxy() {
    _initBasicOperationsProxy();
  }
  
  public BasicOperationsProxy(String endpoint) {
    _endpoint = endpoint;
    _initBasicOperationsProxy();
  }
  
  private void _initBasicOperationsProxy() {
    try {
      basicOperations = (new operacoes.BasicOperationsServiceLocator()).getBasicOperations();
      if (basicOperations != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)basicOperations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)basicOperations)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (basicOperations != null)
      ((javax.xml.rpc.Stub)basicOperations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public operacoes.BasicOperations getBasicOperations() {
    if (basicOperations == null)
      _initBasicOperationsProxy();
    return basicOperations;
  }
  
  public int mult(int a, int b) throws java.rmi.RemoteException{
    if (basicOperations == null)
      _initBasicOperationsProxy();
    return basicOperations.mult(a, b);
  }
  
  public int soma(int a, int b) throws java.rmi.RemoteException{
    if (basicOperations == null)
      _initBasicOperationsProxy();
    return basicOperations.soma(a, b);
  }
  
  public int subtrai(int a, int b) throws java.rmi.RemoteException{
    if (basicOperations == null)
      _initBasicOperationsProxy();
    return basicOperations.subtrai(a, b);
  }
  
  public int div(int a, int b) throws java.rmi.RemoteException{
    if (basicOperations == null)
      _initBasicOperationsProxy();
    return basicOperations.div(a, b);
  }
  
  
}