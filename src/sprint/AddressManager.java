package sprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import sprint.Address;

public class AddressManager {
	private ArrayList listofcity;
	private ArrayList listofstate;
	 private ArrayList listofcountry;
	private ArrayList<Address> al;
	
	public AddressManager(){
		this.listofcity=new ArrayList();
		this.listofstate=new ArrayList();
		this.listofcountry=new ArrayList();
		this.al=new ArrayList();
	}
	public void begin1(){
		listofcity.add("kanpur");
		listofcity.add("delhi");
		listofcity.add("banglore");
		listofcity.add("pune");
		listofcity.add("mumbai");
		listofcity.add("lucknow");
		listofcity.add("mysore");
		listofcity.add("hyderabad");
		listofcity.add("chennai");
		listofstate.add("uttar pradesh");		
		listofstate.add("tamilnadu");		
		listofstate.add("maharastra");		
		listofstate.add("karnataka");		
		listofstate.add("Himanchal pradesh");		
		listofcountry.add("india");
		listofcountry.add("nepal");
		listofcountry.add("sri Lanka");
		listofcountry.add("bhutan");
		listofcountry.add("pakistan");
		
	}
 
	public void addAddress(String housenumber,String city,String state,String country){
		try{
			if(listofcity.contains(city.toLowerCase()) && listofstate.contains(state.toLowerCase()) && listofcountry.contains(country.toLowerCase()) ){
		
		Address ad=new Address(housenumber,city,state,country);
		al.add(ad);
		System.out.println("Successfully Added");
		}
		else
			//System.out.println("Sorry!!Your given input does'nt match with the stored list of City/State/Country");
			throw new InvalidInputException(); 
		}catch(Exception e){
			System.out.println(e);
		}}
		public void updateAddress(String housenumber,String city,String state,String country)
		{
			
		Scanner sc3=new Scanner(System.in);int c = 0;
		for(int i=0;i<al.size();i++)
		{
			if(((al.get(i)).getHousenumber()).equals(housenumber) && (al.get(i).getCity()).equalsIgnoreCase(city))
			{
				c += 1;
				System.out.println("Enter new housenumber");
				String housenumber3 = sc3.nextLine();
				System.out.println("Enter new city");
				String city3=sc3.nextLine();
				System.out.println("Enter new state");
				String state3=sc3.nextLine();
				System.out.println("Enter new country");
				String country3=sc3.nextLine();
				if(listofcity.contains(city3) && listofstate.contains(state3) && listofcountry.contains(country3) ){
				al.get(i).setHousenumber(housenumber3);
				al.get(i).setCity(city3);
				al.get(i).setState(state3);
				al.get(i).setCountry(country3);
				System.out.println("Record Updated");
				break;
				}
				else 
				{
					System.out.println("Sorry!!Your given input does'nt match with the stored list of City/State/Country");
				}
			}}
			if(c != 1)
				System.out.println("No such address found");
			
			}
		public void deleteAddress(String housenumber,String city,String state,String country){
			int ch = 10;
		for(int i=0;i<al.size();i++){
			System.out.println((al.get(i)).getHousenumber());
			System.out.println(housenumber);
			System.out.println((al.get(i)).getCity());
			System.out.println(city);
		if(((al.get(i)).getHousenumber()).equals(housenumber) && ((al.get(i)).getCity()).equals(city))
		{
			System.out.println("Hi");
		al.remove(al.get(i));
		System.out.println("Record Deleted");
		ch = 0;
		break;
		}
		}
		if(ch==10) {
				System.out.println("No such record found");
		}
		 }
		public void viewAddress() {
				
			if(al.size() == 0) {
				System.out.println("No Records Found");
			}
			else {
		for(int i=0;i<al.size();i++){
		System.out.println(al.get(i).getHousenumber()+", "+al.get(i).getCity()+", "+al.get(i).getState()+", "+al.get(i).getCountry());
		}}
		}}

