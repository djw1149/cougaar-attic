/* -*- JAVA -*- $Id: DestinationLinkRemoteSSLDelegate_client.java,v 1.3 2001-11-02 20:39:26 psharma Exp $ */

// ****** Code generated by the QuO codegenerator version 3.0.7 ******
// QuO and the QuO codegenerator have been developed by 
// BBN Technologies.

// Information about QuO is available at:
// http://www.dist-systems.bbn.com/tech/QuO


package org.cougaar.lib.quo ;

import java.rmi.*;
import com.bbn.quo.rmi.*;
import com.bbn.quo.*;

public class DestinationLinkRemoteSSLDelegate_client implements org.cougaar.core.mts.DestinationLink {

  //These are instance variables declared in ASL.
  protected org.cougaar.core.mts.DestinationLink remote;
  protected org.cougaar.lib.quo.RemoteSSLDelegateQosket qk;

  void set_remote(org.cougaar.core.mts.DestinationLink arg1){
    remote = arg1;
  }
  void set_qk(org.cougaar.lib.quo.RemoteSSLDelegateQosket arg1){
    qk = arg1;
  }
  void set_remoteObj(org.cougaar.core.mts.DestinationLink arg1){
    remote = arg1;
  }
  org.cougaar.core.mts.DestinationLink  get_remoteObj(){
    return(remote);
  }
  protected com.bbn.quo.rmi.Contract quo_RemoteSSL;
  void set_contract_RemoteSSL(com.bbn.quo.rmi.Contract arg1){
    quo_RemoteSSL = arg1;
  }
  com.bbn.quo.rmi.Contract get_contract_RemoteSSL() {
    return quo_RemoteSSL;
  }

  void set_qosket(org.cougaar.lib.quo.RemoteSSLDelegateQosket qs){
    qk = qs;
  }
  final static int REMOTESSL__SSL = 0;
  final static int REMOTESSL__NORMAL = 1;

  public void forwardMessage(org.cougaar.core.society.Message message)  throws org.cougaar.core.mts.UnregisteredNameException, org.cougaar.core.mts.NameLookupException, org.cougaar.core.mts.CommFailureException, org.cougaar.core.mts.MisdeliveredMessageException {
    remote.forwardMessage(message);
  }
  public int cost(org.cougaar.core.society.Message message) {
    // Default declarations and setup of quo introduced variables local to method:
    int[] quo_curRegs_RemoteSSL = null;
    int cost;
    com.bbn.quo.corba.Association[] signal =
        new com.bbn.quo.corba.Association[0];
    com.bbn.quo.corba.SignalEvent quo_sig1;
    com.bbn.quo.corba.SignalEvent quo_sig2;

    quo_sig1 = 	new com.bbn.quo.corba.SignalEvent("premethod", signal);
    try { 
quo_curRegs_RemoteSSL = quo_RemoteSSL.signalAndEvalAndGetCurrentRegion(quo_sig1);
     } catch (java.rmi.RemoteException pre_meth_ceval_ex) {} 
      // Adaptive code for inplaceof methodcall
      switch (quo_curRegs_RemoteSSL[0]) {
      case REMOTESSL__SSL:
        cost = qk.computeCost(message);
        break;
      default:
      cost =   remote.cost(message);
        break;
      };
      return(cost);
    }
    public java.lang.Class getProtocolClass() {
    return(remote.getProtocolClass());
  }
    public boolean retryFailedMessage(org.cougaar.core.society.Message message, int retryCount) {
    return(remote.retryFailedMessage(message, retryCount));
  }
    public org.cougaar.core.society.MessageAddress getDestination() {
    return(remote.getDestination());
  }
};

