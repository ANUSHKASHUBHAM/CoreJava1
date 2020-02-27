package sprint;

import java.util.Scanner;

public class AddressConsole {
	public Scanner sc;
	public AddressConsole(){
		this.sc= new Scanner(System.in);
	}
	private int menu(){
	System.out.println("Address Menu");
	System.out.println("0-Exit ");
	System.out.println("1-Add address");
	System.out.println("2-Update Address ");
	System.out.println("3-Delete Address ");
	System.out.println("4-View Address ");
	int choice=sc.nextInt();
	if(choice>=0 && choice <= 4)
		return choice;
	else 
		throw new ArithmeticException("Please Enter a valid Input");
	
	}
	public  void start1(){
		
			AddressManager am=new AddressManager();
			Scanner sc1=new Scanner(System.in);
			am.begin1();
			while(true){
				int choice=menu();
				if(choice == 0) {
					System.out.println("Code Exited");
					System.exit(0);
				}
				else if(choice == 1) {
					System.out.println("Enter housenumber and Area");
					String housenumber = sc1.nextLine();
					System.out.println("Enter city");
					String city=sc1.nextLine();
					System.out.println("Enter state");
					String state=sc1.nextLine();
					System.out.println("Enter country");
					String country=sc1.nextLine();
					am.addAddress(housenumber,city,state,country);
				}
				else if(choice == 2) {
					System.out.println("Enter housenumber to be updated");
					String housenumber3 = sc1.nextLine();
					System.out.println("Enter city to be updated");
					String city3=sc1.nextLine();
					System.out.println("Enter state to be updated");
					String state3=sc1.nextLine();
					System.out.println("Enter country to be updated");
					String country3=sc1.nextLine();
					am.updateAddress(housenumber3,city3,state3,country3);	
				}
				else if(choice == 3) {
					System.out.println("Enter housenumber");
					String housenumber1 = sc1.nextLine();
					System.out.println("Enter city");
					String city1=sc1.nextLine();
					System.out.println("Enter state");
					String state1=sc1.nextLine();
					System.out.println("Enter country");
					String country1=sc1.nextLine();
					am.deleteAddress(housenumber1,city1,state1,country1);	
				}
				else 
					am.viewAddress();
				
			}}
			public boolean validateCity(String city){
				boolean f=true;
				for(int i=0;i<city.length();i++){
					char c=city.charAt(i);
					if(!((c>=65 && c<=90)||(c>=97 && c<=122))){
						
						f=false;
						
						
					}
				}
				return f;
			}
			public boolean validateState(String state){
				boolean flag=true;
				for(int i=0;i<state.length();i++){
					char ch=state.charAt(i);
					if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122))){
						
						flag=false;
						
						
					}
				}
				return flag;
			}
			public boolean validateCountry(String country){
				boolean fm=true;
				for(int i=0;i<country.length();i++){
					char c=country.charAt(i);
					if(!((c>=65 && c<=90)||(c>=97 && c<=122))){
						
						fm=false;
						
						
					}
				}
				return fm;
			}
			
				
	}





			