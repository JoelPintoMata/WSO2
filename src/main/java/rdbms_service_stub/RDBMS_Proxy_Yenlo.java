

/**
 * RDBMS_Proxy_Yenlo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package rdbms_service_stub;

    /*
     *  RDBMS_Proxy_Yenlo java interface
     */

    public interface RDBMS_Proxy_Yenlo {
          

        /**
          * Auto generated method signature
          * queries the database for all the products
                    * @param products29
                
             * @throws rdbms_service_stub.DataServiceFault : 
         */

         
                     public rdbms_service_stub.Product[] products(

                        )
                        throws java.rmi.RemoteException
             
          ,rdbms_service_stub.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * queries the database for all the products
                * @param products29
            
          */
        public void startproducts(

            

            final rdbms_service_stub.RDBMS_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Updates the Stock value of the Product with the given ID
                    * @param updateProductStock12
                
             * @throws rdbms_service_stub.DataServiceFault : 
         */

         
                     public java.lang.String updateProductStock(

                        int sTOCK13,int iD14)
                        throws java.rmi.RemoteException
             
          ,rdbms_service_stub.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Updates the Stock value of the Product with the given ID
                * @param updateProductStock12
            
          */
        public void startupdateProductStock(

            int sTOCK13,int iD14,

            final rdbms_service_stub.RDBMS_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * Deletes all database Products
         */
        public void  deleteAllProducts(
         

        ) throws java.rmi.RemoteException
        
        ;

        

        /**
          * Auto generated method signature
          * Control operation for beginning a boxcarring session
                    * @param begin_boxcar18
                
             * @throws rdbms_service_stub.DataServiceFault : 
         */

         
                     public org.apache.axiom.om.OMElement begin_boxcar(

                        )
                        throws java.rmi.RemoteException
             
          ,rdbms_service_stub.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Control operation for beginning a boxcarring session
                * @param begin_boxcar18
            
          */
        public void startbegin_boxcar(

            

            final rdbms_service_stub.RDBMS_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * queries the database for all with a given name
                    * @param productsByName21
                
             * @throws rdbms_service_stub.DataServiceFault : 
         */

         
                     public rdbms_service_stub.Product[] productsByName(

                        java.lang.String nAME22)
                        throws java.rmi.RemoteException
             
          ,rdbms_service_stub.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * queries the database for all with a given name
                * @param productsByName21
            
          */
        public void startproductsByName(

            java.lang.String nAME22,

            final rdbms_service_stub.RDBMS_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Control operation for ending a boxcarring session
                    * @param end_boxcar25
                
             * @throws rdbms_service_stub.DataServiceFault : 
         */

         
                     public org.apache.axiom.om.OMElement end_boxcar(

                        )
                        throws java.rmi.RemoteException
             
          ,rdbms_service_stub.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Control operation for ending a boxcarring session
                * @param end_boxcar25
            
          */
        public void startend_boxcar(

            

            final rdbms_service_stub.RDBMS_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Inserts a new product in the database
                    * @param insertProduct28
                
             * @throws rdbms_service_stub.DataServiceFault : 
         */

         
                     public java.lang.String insertProduct(

                        java.lang.String nAME29,java.lang.String dESCRIPTION30,int sTOCK31)
                        throws java.rmi.RemoteException
             
          ,rdbms_service_stub.DataServiceFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Inserts a new product in the database
                * @param insertProduct28
            
          */
        public void startinsertProduct(

            java.lang.String nAME29,java.lang.String dESCRIPTION30,int sTOCK31,

            final rdbms_service_stub.RDBMS_Proxy_YenloCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * Control operation for aborting a boxcarring session
         */
        public void  abort_boxcar(
         

        ) throws java.rmi.RemoteException
        
        ;

        

        
       //
       }
    