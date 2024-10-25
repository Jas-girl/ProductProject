package Project;

import java.util.Arrays;
import java.util.Scanner;

public class productMethod {
	product p;
	public productMethod() {
	}
	Scanner sc=new Scanner(System.in);
	
	
	
//	//add method
//    void add(product arr[]) {
//    	
//	
//    }
    
    //find the product by productName
    void productName(product arr[],String name) {
    	boolean found=false;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i].getProductName().equalsIgnoreCase(name)) {
				System.out.println(arr[i].toString());
				found=true;
			}
			
		}
    	if(!found) {
    		System.out.println("no product found");
    	}
    }
    
    //filter the price less than 500
    void filterPrice(product arr[],float price) {
    	boolean found=true;
    	System.out.println("filter the price less than "+price);
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i].getProductPrice()<price) {
				System.out.println(arr[i]);
				found=true;
			}
			else {
				found=false;
			}
		}
    	if(!found) {
    		System.out.println("no product found");
    	}
    }
    
  //filter the price less than 1000
    void filterPrice1(product arr[],float price) {
    	System.out.println("filter the price more than "+price);
    	boolean found=true;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i].getProductPrice()>price) {
				System.out.println(arr[i]);
				found=true;
			}
			else {
				found=false;
			}
		}
    	if(!found) {
    		System.out.println("no product found");
    	}
    }
    
    //find the product by productName
    void productType(product arr[],String type) {
    	System.out.println("find the product by product type");
    	boolean found=true;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i].getProductType().equalsIgnoreCase(type)) {
				System.out.println(arr[i].toString());
				found=true;
			}
			else {
				found=false;
			}
			
		}
    	if(!found) {
    		System.out.println("no product found");
    	}
    }
    //find the product by productId
    void productId(product arr[],int id) {
    	System.out.println("find the product by product id");
    	boolean found=true;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i].getProductId()==id) {
				System.out.println(arr[i].toString());
				found=true;
			}
			else {
				found=false;
			}
			
		}
    	if(!found) {
    		System.out.println("no product found");
    	}
    }
  //filter the qty less than 2
    void filterQty(product arr[],int qty) {
    	System.out.println("filter the product less than qty 2");
    	boolean found=true;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i].getProductQty()<qty) {
				System.out.println(arr[i]);
				found=true;
			}
			else {
				found=false;
			}
			
		}
    	if(!found) {
    		System.out.println("no product found");
    	}
    }
    
}
