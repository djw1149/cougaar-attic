/* -*- JAVA -*- */

// ****** Code generated by the QuO codegenerator 3.0.8 ******
// QuO and the QuO codegenerator have been developed by 
// BBN Technologies.

// Information about QuO is available at:
// http://www.dist-systems.bbn.com/tech/QuO



package org.cougaar.lib.quo ;

public class DestinationLinkRemoteSSLAdapter
       extends org.cougaar.lib.quo.DestinationLinkRemoteSSLDelegate_client
       implements org.cougaar.lib.quo.RemoteSSLQosket 
{
  private org.cougaar.lib.quo.RemoteSSLQosketImpl qosket;

  // Constructor for BQAdapter
  public DestinationLinkRemoteSSLAdapter() 
  {
     this.qosket  = new org.cougaar.lib.quo.RemoteSSLQosketImpl();
     set_qosket (qosket);
  }

  public void initSysconds (com.bbn.quo.rmi.QuoKernel kernel)
  throws java.rmi.RemoteException 
  {
     qosket.initSysconds(kernel); 
  }

  public void initCallbacks ()
  {
     qosket.initCallbacks(); 
  }

  public void linkContract (com.bbn.quo.rmi.QuoKernel kernel)
  throws java.rmi.RemoteException 
  {
     set_contract_RemoteSSL( qosket.initContract ("RemoteSSL", kernel) );
  }

  public com.bbn.quo.rmi.Contract initContract(String name,
                           String interfaceName,
                           com.bbn.quo.rmi.QuoKernel kernel)
  throws java.rmi.RemoteException 
  {
     return qosket.initContract(name, interfaceName, kernel);
  }

  public void linkRemoteObject( org.cougaar.core.mts.DestinationLink remote_obj)
  {
     set_remoteObj ( remote_obj );
  }

  // Qosket methods from IDL
  // inherited methods and attributes of org.cougaar.lib.quo.RemoteSSLQosket

  // local methods and attributes of org.cougaar.lib.quo.RemoteSSLQosket
  public void setDestinationLink(org.cougaar.core.mts.DestinationLink link)
  {
     qosket.setDestinationLink ( link );
  }

  public void setServices(org.cougaar.core.qos.monitor.ResourceMonitorService rms, com.bbn.quo.rmi.ValueSC trust)
  {
     qosket.setServices ( rms, trust );
  }

}
