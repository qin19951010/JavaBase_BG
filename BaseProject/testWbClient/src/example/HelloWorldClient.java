package example;

import com.HelloWorldServiceLocator;

import java.rmi.activation.Activator;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
          Activator service = locator.get();
          // If authorization is required
          //((HelloWorldSoapBindingStub)service).setUsername("user3");
          //((HelloWorldSoapBindingStub)service).setPassword("pass3");
          // invoke business method
          service.businessMethod();
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
