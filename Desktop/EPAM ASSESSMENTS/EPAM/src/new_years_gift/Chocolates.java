package new_years_gift;

import java.util.ArrayList;

public class Chocolates implements Choco {

	public int sizeOfChoco=0;
	public String priceOfChoco = "";
	public int quantity=0;
	public String nameOfChoco = "";
	public String typeOfChoco = "";
	public int weight;
	
	
	public Chocolates(String nameOfChoco,String typeOfChoco,String priceOfChoco, int sizeOfChoco, int quantity ) {
		/* call all the properties using this keyword
		 * and make it as instance variables
		 * based on the objects
		 */
		this.nameOfChoco=nameOfChoco;
		System.out.println("name of Choco is: " + this.nameOfChoco);
		this.typeOfChoco=typeOfChoco;
		this.priceOfChoco = priceOfChoco;
		System.out.println("Price of a Choco is: " + this.priceOfChoco);
		this.sizeOfChoco=sizeOfChoco;
		System.out.println("sizeofthe Choco is: " + this.sizeOfChoco);
		this.quantity=quantity;
		System.out.println("quantity of the Choco is: " + this.quantity);
		weight=quantity*sizeOfChoco;
	}
	ArrayList<Chocolates> arrayList=new ArrayList<Chocolates>();
	public Object ChocolatesForGiftPack() {
		
		arrayList.add(new  Chocolates("dairymilk","darkchoco","rs.10",50,1));
		arrayList.add(new  Chocolates("5star","milkchoco","rs.10",40,5));
		arrayList.add(new  Chocolates("bournville","darkchoco","rs.10",50,5));
		arrayList.add(new  Chocolates("munch","darkchoco","rs.10",50,1));
	
		return null;
		
	}
		public ArrayList<Chocolates> getList()
		{
		return arrayList;
		}
	
	public Object weightOfChocolates() {
		
		 ArrayList<Chocolates> arrayList= getList(); 
		 return weight;
		}//it may quantity of the chocolates
	}



