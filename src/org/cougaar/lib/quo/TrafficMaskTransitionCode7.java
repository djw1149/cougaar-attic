/* -*- JAVA -*- */

// ****** Code generated by the QuO codegenerator 3.0.9 ******
// QuO and the QuO codegenerator have been developed by 
// BBN Technologies.

// Information about QuO is available at:
// http://www.dist-systems.bbn.com/tech/QuO


package org.cougaar.lib.quo;

import com.bbn.quo.rmi.*;
import com.bbn.quo.*;

// Transition code for transition Wan->any
public class TrafficMaskTransitionCode7 extends TransitionCode
{
  public void perform() {
    syncwork();
  }

  public void syncwork() {
    try {
((org.cougaar.lib.mquo.TrafficMaskControl) ((com.bbn.quo.rmi.impl.ContractImpl) contract).callback_objs[0]).turnOff();
}  catch (java.rmi.RemoteException remote_ex) {
      remote_ex.printStackTrace();
}
  }

  public void asyncwork() {
  }
}
