
/**
 * DataServiceFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

package gspread_service_stub.auxiliar;

public class DataServiceFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1421263357049L;
    
    private gspread_service_stub.auxiliar.DataServiceFault faultMessage;

    
        public DataServiceFaultException() {
            super("DataServiceFaultException");
        }

        public DataServiceFaultException(java.lang.String s) {
           super(s);
        }

        public DataServiceFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DataServiceFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(gspread_service_stub.auxiliar.DataServiceFault msg){
       faultMessage = msg;
    }
    
    public gspread_service_stub.auxiliar.DataServiceFault getFaultMessage(){
       return faultMessage;
    }
}
    