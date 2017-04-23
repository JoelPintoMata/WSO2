/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *   * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package WSO2;

import gspread_service_stub.GSpread_Proxy_Yenlo;
import gspread_service_stub.GSpread_Proxy_YenloStub;

import java.math.BigInteger;

import rdbms_service_stub.RDBMS_Proxy_Yenlo;
import rdbms_service_stub.RDBMS_Proxy_YenloStub;

/**
 * WSO2 suite main class
 */
public class Main {

    public static void main(String[] args) {

		try{
			//GSpread_Proxy_Yenlo stub = new GSpread_Proxy_YenloStub();
			GSpread_Proxy_Yenlo stub = new GSpread_Proxy_YenloStub("http://localhost:8283/services/GSpread_Proxy_Yenlo");
			gspread_service_stub.Product[] products = stub.products();
    		System.out.println("Products present in the Google GSpread database:-");
			for (gspread_service_stub.Product product : products) {
				System.out.println("\t-----------------------------");
    			System.out.println("\tProduct ID: " + product.getID());
    			System.out.println("\tProduct Name: " + product.getNAME());
    			System.out.println("\tProduct Description: " + product.getDESCRIPTION());
    			System.out.println("\tProduct Stock: " + product.getSTOCK());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
    		//RDBMS_Proxy_Yenlo stub = new RDBMS_Proxy_YenloStub();
    		RDBMS_Proxy_Yenlo stub = new RDBMS_Proxy_YenloStub("http://localhost:8283/services/RDBMS_Proxy_Yenlo");
    		rdbms_service_stub.Product[] products;
    		
    		System.out.println("\n\n");
    		System.out.println("Delete all Product(s):-");
    		stub.deleteAllProducts();
    		
    		products = stub.products();
    		System.out.println("Products present in database:-");
    		if(products != null && products.length > 0){
	    		for (rdbms_service_stub.Product product : products) {
	    			System.out.println("\t-----------------------------");
	    			System.out.println("\tProduct ID: " + product.getID());
	    			System.out.println("\tProduct Name: " + product.getNAME());
	    			System.out.println("\tProduct Description: " + product.getDESCRIPTION());
	    			System.out.println("\tProduct Stock: " + product.getSTOCK());
	    		}
    		} else {
    			System.out.println("\t0 Products in the database.");
    		}

    		System.out.println("\n\n");
    		System.out.println("Insert new Product: Name: IPAD, Description: IPAD Mini, Stock: 100");
    		stub.insertProduct("IPAD", "IPAD Mini", 100);
    		System.out.println("Insert new Product: Name: IPAD, Description: IPAD Air, Stock: 200");
    		stub.insertProduct("IPAD", "IPAD Air", 200);
    		System.out.println("Insert new Product: Name: IPAD, Description: IPAD Air 2, Stock: 300");
    		stub.insertProduct("IPAD", "IPAD Air 2", 300);
    		
    		products = stub.productsByName("IPAD");
    		System.out.println("\n\n");
    		System.out.println("Products present in database named IPAD:-");
    		if(products != null && products.length > 0){
	    		for (rdbms_service_stub.Product product : products) {
	    			System.out.println("\t-----------------------------");
	    			System.out.println("\tProduct ID: " + product.getID());
	    			System.out.println("\tProduct Name: " + product.getNAME());
	    			System.out.println("\tProduct Description: " + product.getDESCRIPTION());
	    			System.out.println("\tProduct Stock: " + product.getSTOCK());
	    			
	    		}
    		} else {
    			System.out.println("\t0 Products in the database.");
    		}

    		System.out.println("\n\n");
    		System.out.println("Delete all Product(s):-");
    		stub.deleteAllProducts();
    		
    		products = stub.products();
    		System.out.println("\n\n");
    		System.out.println("Products present in database:-");
    		if(products != null && products.length > 0){
	    		for (rdbms_service_stub.Product product : products) {
	    			System.out.println("\t-----------------------------");
	    			System.out.println("\tProduct ID: " + product.getID());
	    			System.out.println("\tProduct Name: " + product.getNAME());
	    			System.out.println("\tProduct Description: " + product.getDESCRIPTION());
	    			System.out.println("\tProduct Stock: " + product.getSTOCK());
	    			
	    		}
    		} else {
    			System.out.println("\t0 Products in the database.");
    		}

    		System.out.println("\n\n");
    		System.out.println("Insert new Product: Name: TestName, Description: TestDescription, Stock: 999");
    		stub.insertProduct("\tTestName", "TestDesctiption", 999);
    		
    		BigInteger lastKey = null;
    		products = stub.products();
    		System.out.println("\n\n");
    		System.out.println("Products present in database, after the new insertion:-");
    		if(products != null && products.length > 0){
	    		for (rdbms_service_stub.Product product : products) {
	        		lastKey = product.getID();
	    			System.out.println("\t-----------------------------");
	    			System.out.println("\tProduct ID: " + lastKey);
	    			System.out.println("\tProduct Name: " + product.getNAME());
	    			System.out.println("\tProduct Description: " + product.getDESCRIPTION());
	    			System.out.println("\tProduct Stock: " + product.getSTOCK());
	    		}
    		} else {
    			System.out.println("\t0 Products in the database.");
    		}

    		System.out.println("\n\n");
    		System.out.println("Update the newly inserted Product Stock to 0:-");
    		stub.updateProductStock(0, lastKey.intValue());
    		
    		products = stub.products();
    		System.out.println("\n\n");
    		System.out.println("Products present in database, after the update:-");
    		if(products != null && products.length > 0){
	    		for (rdbms_service_stub.Product product : products) {
	    			System.out.println("\t-----------------------------");
	    			System.out.println("\tProduct ID: " + product.getID());
	    			System.out.println("\tProduct Name: " + product.getNAME());
	    			System.out.println("\tProduct Description: " + product.getDESCRIPTION());
	    			System.out.println("\tProduct Stock: " + product.getSTOCK());
	    		}
    		} else {
    			System.out.println("\t0 Products in the database.");
    		}
		}catch(Exception e){
			e.printStackTrace();
		}         
        System.exit(0);
    }
}
