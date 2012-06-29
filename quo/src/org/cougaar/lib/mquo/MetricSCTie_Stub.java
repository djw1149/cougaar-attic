/*
 * <copyright>
 *  
 *  Copyright 2004 BBNT Solutions, LLC
 *  under sponsorship of the Defense Advanced Research Projects
 *  Agency (DARPA).
 * 
 *  You can redistribute this software and/or modify it under the
 *  terms of the Cougaar Open Source License as published on the
 *  Cougaar Open Source Website (www.cougaar.org).
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 *  A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 *  OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 *  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 *  LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 *  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  
 * </copyright>
 */
// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package org.cougaar.lib.mquo;

public final class MetricSCTie_Stub
    extends java.rmi.server.RemoteStub
    implements org.cougaar.lib.mquo.MetricSC, com.bbn.quo.rmi.ReadOnlyValueSC, com.bbn.quo.rmi.SysCond, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_booleanValue_0;
    private static java.lang.reflect.Method $method_charValue_1;
    private static java.lang.reflect.Method $method_doubleValue_2;
    private static java.lang.reflect.Method $method_floatValue_3;
    private static java.lang.reflect.Method $method_getName_4;
    private static java.lang.reflect.Method $method_init_5;
    private static java.lang.reflect.Method $method_isReady_6;
    private static java.lang.reflect.Method $method_longValue_7;
    private static java.lang.reflect.Method $method_longlongValue_8;
    private static java.lang.reflect.Method $method_newPath_9;
    private static java.lang.reflect.Method $method_octetValue_10;
    private static java.lang.reflect.Method $method_shortValue_11;
    private static java.lang.reflect.Method $method_stringValue_12;
    
    static {
	try {
	    $method_booleanValue_0 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("booleanValue", new java.lang.Class[] {});
	    $method_charValue_1 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("charValue", new java.lang.Class[] {});
	    $method_doubleValue_2 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("doubleValue", new java.lang.Class[] {});
	    $method_floatValue_3 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("floatValue", new java.lang.Class[] {});
	    $method_getName_4 = com.bbn.quo.rmi.SysCondOperations.class.getMethod("getName", new java.lang.Class[] {});
	    $method_init_5 = org.cougaar.lib.mquo.MetricSCOperations.class.getMethod("init", new java.lang.Class[] {org.cougaar.core.qos.metrics.MetricsService.class});
	    $method_isReady_6 = com.bbn.quo.rmi.SysCondOperations.class.getMethod("isReady", new java.lang.Class[] {});
	    $method_longValue_7 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("longValue", new java.lang.Class[] {});
	    $method_longlongValue_8 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("longlongValue", new java.lang.Class[] {});
	    $method_newPath_9 = org.cougaar.lib.mquo.MetricSCOperations.class.getMethod("newPath", new java.lang.Class[] {java.lang.String.class});
	    $method_octetValue_10 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("octetValue", new java.lang.Class[] {});
	    $method_shortValue_11 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("shortValue", new java.lang.Class[] {});
	    $method_stringValue_12 = com.bbn.quo.rmi.ReadOnlyValueSCOperations.class.getMethod("stringValue", new java.lang.Class[] {});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public MetricSCTie_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of booleanValue()
    public boolean booleanValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_booleanValue_0, null, 321797395366213756L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of charValue()
    public char charValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_charValue_1, null, -4288014995842806239L);
	    return ((java.lang.Character) $result).charValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of doubleValue()
    public double doubleValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_doubleValue_2, null, -2735701587009932691L);
	    return ((java.lang.Double) $result).doubleValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of floatValue()
    public float floatValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_floatValue_3, null, 7335563984231238833L);
	    return ((java.lang.Float) $result).floatValue();
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
	    Object $result = ref.invoke(this, $method_getName_4, null, 6317137956467216454L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of init(MetricsService)
    public void init(org.cougaar.core.qos.metrics.MetricsService $param_MetricsService_1)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_init_5, new java.lang.Object[] {$param_MetricsService_1}, 3202323540986498357L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of isReady()
    public boolean isReady()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_isReady_6, null, 5601281247722995301L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of longValue()
    public int longValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_longValue_7, null, -2681803097244643466L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of longlongValue()
    public long longlongValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_longlongValue_8, null, -4309978758569769243L);
	    return ((java.lang.Long) $result).longValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of newPath(String)
    public void newPath(java.lang.String $param_String_1)
	throws java.rmi.RemoteException
    {
	try {
	    ref.invoke(this, $method_newPath_9, new java.lang.Object[] {$param_String_1}, -2942907285579791263L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of octetValue()
    public byte octetValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_octetValue_10, null, 7314518805575796051L);
	    return ((java.lang.Byte) $result).byteValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of shortValue()
    public short shortValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_shortValue_11, null, -797248613395323126L);
	    return ((java.lang.Short) $result).shortValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of stringValue()
    public java.lang.String stringValue()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_stringValue_12, null, 1588607059140066992L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}