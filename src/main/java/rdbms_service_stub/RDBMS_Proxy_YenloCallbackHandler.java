
/**
 * RDBMS_Proxy_YenloCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package rdbms_service_stub;

    /**
     *  RDBMS_Proxy_YenloCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RDBMS_Proxy_YenloCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RDBMS_Proxy_YenloCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RDBMS_Proxy_YenloCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for products method
            * override this method for handling normal response from products operation
            */
           public void receiveResultproducts(
                    rdbms_service_stub.Product[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from products operation
           */
            public void receiveErrorproducts(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateProductStock method
            * override this method for handling normal response from updateProductStock operation
            */
           public void receiveResultupdateProductStock(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateProductStock operation
           */
            public void receiveErrorupdateProductStock(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for begin_boxcar method
            * override this method for handling normal response from begin_boxcar operation
            */
           public void receiveResultbegin_boxcar(
                    org.apache.axiom.om.OMElement result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from begin_boxcar operation
           */
            public void receiveErrorbegin_boxcar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for productsByName method
            * override this method for handling normal response from productsByName operation
            */
           public void receiveResultproductsByName(
                    rdbms_service_stub.Product[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from productsByName operation
           */
            public void receiveErrorproductsByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for end_boxcar method
            * override this method for handling normal response from end_boxcar operation
            */
           public void receiveResultend_boxcar(
                    org.apache.axiom.om.OMElement result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from end_boxcar operation
           */
            public void receiveErrorend_boxcar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertProduct method
            * override this method for handling normal response from insertProduct operation
            */
           public void receiveResultinsertProduct(
                    java.lang.String result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertProduct operation
           */
            public void receiveErrorinsertProduct(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    