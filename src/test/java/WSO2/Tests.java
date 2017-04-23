package WSO2;

import junit.framework.Assert;

import org.junit.Test;

import rdbms_service_stub.RDBMS_Proxy_Yenlo;
import rdbms_service_stub.RDBMS_Proxy_YenloStub;

public class Tests {
	
	@Test
	public void testPrintHelloWorldGenericTest1() {
		Assert.assertEquals("Hello World", "Hello World");
	}
	
	@Test
	public void testPrintHelloWorldGenericTest2() {
		Assert.assertNotSame("Hello World", "Hello World");
	}
	
	@Test
	public void testDeleteAll() {
		RDBMS_Proxy_Yenlo stub;
		try {
			stub = new RDBMS_Proxy_YenloStub();
    		System.out.println("\n\n");
    		System.out.println("Delete all Product(s):-");
    		stub.deleteAllProducts();

			rdbms_service_stub.Product[] products = stub.products();
			Assert.assertNull(products);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testInsert() {
		RDBMS_Proxy_Yenlo stub;
		try {
			stub = new RDBMS_Proxy_YenloStub();
    		System.out.println("\n\n");
    		System.out.println("Delete all Product(s):-");
    		stub.deleteAllProducts();

    		System.out.println("\n\n");
    		System.out.println("Insert new Product: Name: TestName, Description: TestDescription, Stock: 999");
    		stub.insertProduct("\tTestName", "TestDesctiption", 999);
    		
			rdbms_service_stub.Product[] products = stub.products();
			
			Assert.assertEquals(products.length, 1);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testProductsByName() {
		RDBMS_Proxy_Yenlo stub;
		try {
			stub = new RDBMS_Proxy_YenloStub();
    		System.out.println("\n\n");
    		System.out.println("Delete all Product(s):-");
    		stub.deleteAllProducts();
    		
			rdbms_service_stub.Product[] products = stub.products();
			
			Assert.assertNull(products);

    		System.out.println("\n\n");
    		System.out.println("Insert new Product: Name: IPAD, Description: IPAD Mini, Stock: 100");
    		stub.insertProduct("IPAD", "IPAD Mini", 100);
    		System.out.println("Insert new Product: Name: IPAD, Description: IPAD Air, Stock: 200");
    		stub.insertProduct("IPAD", "IPAD Air", 200);
    		System.out.println("Insert new Product: Name: IPAD, Description: IPAD Air 2, Stock: 300");
    		stub.insertProduct("IPAD", "IPAD Air 2", 300);
    		
			products = stub.productsByName("IPAD");
			
			Assert.assertEquals(products.length, 3);
    		
			products = stub.productsByName("XXX");
			
			Assert.assertNull(products);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
