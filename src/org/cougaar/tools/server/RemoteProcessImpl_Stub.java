// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package org.cougaar.tools.server;

public final class RemoteProcessImpl_Stub
    extends java.rmi.server.RemoteStub
    implements org.cougaar.tools.server.RemoteProcess, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_destroy_0;
    private static java.lang.reflect.Method $method_exitValue_1;
    private static java.lang.reflect.Method $method_getCommand_2;
    private static java.lang.reflect.Method $method_getName_3;
    private static java.lang.reflect.Method $method_isAlive_4;
    private static java.lang.reflect.Method $method_waitFor_5;
    
    static {
	try {
	    $method_destroy_0 = org.cougaar.tools.server.RemoteProcess.class.getMethod("destroy", new java.lang.Class[] {});
	    $method_exitValue_1 = org.cougaar.tools.server.RemoteProcess.class.getMethod("exitValue", new java.lang.Class[] {});
	    $method_getCommand_2 = org.cougaar.tools.server.RemoteProcess.class.getMethod("getCommand", new java.lang.Class[] {});
	    $method_getName_3 = org.cougaar.tools.server.RemoteProcess.class.getMethod("getName", new java.lang.Class[] {});
	    $method_isAlive_4 = org.cougaar.tools.server.RemoteProcess.class.getMethod("isAlive", new java.lang.Class[] {});
	    $method_waitFor_5 = org.cougaar.tools.server.RemoteProcess.class.getMethod("waitFor", new java.lang.Class[] {});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public RemoteProcessImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of destroy()
    public void destroy()
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_destroy_0, null, 6818594404755407126L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of exitValue()
    public int exitValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_exitValue_1, null, -3935870581653384007L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getCommand()
    public java.lang.String[] getCommand()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getCommand_2, null, 4646401821665848397L);
	    return ((java.lang.String[]) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getName()
    public java.lang.String getName()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getName_3, null, 6317137956467216454L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of isAlive()
    public boolean isAlive()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_isAlive_4, null, -7806089699036536482L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of waitFor()
    public int waitFor()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_waitFor_5, null, -8338822390347708385L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
