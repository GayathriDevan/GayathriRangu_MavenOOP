package new_years_gift;

import java.util.ArrayList;

public class Candies implements Candy {
	public int sizeOfCandy=0;
	public String priceOfCandy = "";
	public int quantity=0;
	public String nameOfCandy = "";
	public String typeOfCandy = "";
	public int weight;
	
	
	public Candies(String nameOfCandy,String typeOfCandy,String priceOfCandy, int sizeOfCandy, int quantity ) {
		
		this.nameOfCandy=nameOfCandy;
		System.out.println("name of Candy is: " + this.nameOfCandy);
		this.typeOfCandy=typeOfCandy;
		this.priceOfCandy = priceOfCandy;
		System.out.println("Price of a Candy is: " + this.priceOfCandy);
		this.sizeOfCandy=sizeOfCandy;
		System.out.println("sizeofthe Candy is: " + this.sizeOfCandy);
		this.quantity=quantity;
		System.out.println("quantity of the Candy is: " + this.quantity);
		weight=quantity*sizeOfCandy;
	}
	ArrayList<Candies> arrayList=new ArrayList<Candies>();
	public Object CandiesForGiftPack() {
		
		arrayList.add(new  Candies("Kwarito","gelly","rs.10",50,1));
		arrayList.add(new  Candies("Poppins","hard candy","rs.15",40,5));
		arrayList.add(new  Candies("coffee bite","soft candy","rs. 5",50,5));
		arrayList.add(new  Candies("center fruit","chewing gum","rs.5",50,1));
	
		return null;
		
	}
		public ArrayList<Candies> getList()
		{
		return arrayList;
		}
	
	public Object weightOfCandy() {
		
		 ArrayList<Candies> arrayList= getList(); 
		 return weight;
		}

}
