package com.cafeShopManagment.in;

import java.util.Scanner;



public class CafeShop {
	int choice = 0, b=1, s,d,t,c,i;
	int s1=0, d1=0, t1=0, c1=0, i1=0, totalBill=0; 
			double discount = 0; // add a discount variable;
	
		public void menu() {
		  System.out.println("--------- Welcome to cafe Hasghtag # -------");
		  System.out.println(" Menu List ");
		  System.out.println("1.Samosa - 20/");
		  System.out.println("2.Dosa  - 35/-");
		  System.out.println("3.tea - 10/-");
		  System.out.println("4.coffee - 50/-");
		  System.out.println("5.ice creem  - 30/-");
		  System.out.println("0.exit\n");
		}
	
	public void quantity(int choice) {
			switch (choice) {
			case 1: System.out.println("Plates = ");
					break;
					
			case 2: System.out.println("Plates = ");
					break;
			
			case 3: System.out.println("cups = ");
					break;
			
			case 4: System.out.println("cups = ");
					break;
			
			case 5: System.out.println("cups = ");
					break;
			
				}
		}
	
	public void billings(int currentBill) {
		totalBill = totalBill + currentBill;
	}
	
	//public void applyDiscount() {
       // if (totalBill > 50) {
           // discount = (totalBill * 10) / 100;
           // totalBill -= discount;
        //}
    //}
  
	
	public void printBill() {
		System.out.println(" Total Amount= "+totalBill);
	}
	
	
	
		public void order() {
			while(b == 1) {
				
				menu();
				
				System.out.println("Enter the choice : ");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				
					switch(choice) {
					
					case 1:
						System.out.println("You have orderd samosa ");
						System.out.println("How Many ? ");
						quantity(choice);
						s = sc.nextInt();
						s1 = s1+s;
						System.out.println("okk!!! Anything Else ?");
						billings(s*20);
						break;
						
					case 2:
						System.out.println("You have orderd Dosa ");
						System.out.println("How Many ? ");
						quantity(choice);
						d = sc.nextInt();
						d1 = d1+d;
						System.out.println("okk!!! Anything Else ?");
						billings(d*35);
						break;
						
					case 3:
						System.out.println("You have orderd  ");
						System.out.println("How Many ? ");
						quantity(choice);
						t = sc.nextInt();
						t1 = t1+t;
						System.out.println("okk!!! Anything Else ?");
						billings(t*10);
						break;
						
					case 4:
						System.out.println("You have orderd coffee ");
						System.out.println("How Many ? ");
						quantity(choice);
						c = sc.nextInt();
						c1 = c1+c;
						System.out.println("okk!!! Anything Else ?");
						billings(c*50);
						break;
						
					case 5:
						System.out.println("You have orderd ice creem ");
						System.out.println("How Many ? ");
						quantity(choice);
						i = sc.nextInt();
						i1 = i1+i;
						System.out.println("okk!!! Anything Else ?");
						billings(i*30);
						break;
						
					case 0:
						 System.out.println("Exit");
						 b = 0;
						 break;
					
					}
						
			  }
		}
		
		public void table() {
			
			if(s1 > 0) {
				System.out.printf("samosa                %d  |  20  | %d\n ", s1, s1 * 20);
			}
			
			if(d1 > 0) {
				System.out.printf("Dosa                 | %d | 35 | %d\n ", d1, d1 * 35);
			}
			
			if(t1 > 0) {
				System.out.printf("Tea                  |  %d  |  10  | %d\n ", t1, t1 * 10);
			}
			
			if(c1 > 0) {
				System.out.printf("Coffee               |  %d  |  50  | %d\n ", c1, c1 * 50);
			}
			
			if(i1 > 0) {
				System.out.printf("ice creem            |  %d  |  30 | %d\n ", i1, i1 * 30);
			}
		}
		
		
		public void money() {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter your cash: ");
			int cash = sc.nextInt();
			int returnCash = cash - totalBill;
			System.out.print("Return cash = "+returnCash);
		}

			

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
			System.out.println("Welcome Customer");
			
			CafeShop  cs = new CafeShop();
			cs.order();
			System.out.println("Item                    |   Qty   |  Rate  |  Total  ");
			System.out.println("----------------------------------------------------");
			cs.table();
			System.out.println("-----------------------------------------------------");
		//	cs.applyDiscount() ;
		        
			System.out.println("----------------------------------------------------");
			cs.printBill();
			System.out.println("----------------------------------------------------");
			cs.money();
		  		}

	
		 

}
