
package new_years_gift;

import java.util.Collections;
import java.util.Comparator;

public class NewYearGift {
	
	public NewYearGift() {
		// Depends on your usage, it may be useful or not
	}

	public static void main(String[] args) {
		
		//Create lot of Instances for Chocolates here to access all
		Chocolates dairyMilk =new Chocolates("dairymilk","milkchoco", "rs10",50,10);
		Chocolates star=new  Chocolates("star","milkchoco","rs.10",40,5);
		Chocolates bournville=new Chocolates("bournville","darkchoco","rs.10",50,5);
		Chocolates munch =new  Chocolates("munch","darkchoco","rs.10",50,1);
		Candies kwarito= new Candies("Kwarito","gelly","rs.10",50,1);
		Candies Poppins=new  Candies("Poppins","hard candy","rs.15",40,5);
		Candies coffeebite=new  Candies("coffeebite","soft candy","rs. 5",50,5);
		Candies centerfruit=new  Candies("centerfruit","chewing gum","rs.5",50,1);
		
		
		//Create lot of Instances for Candies here to access all
	//	Candies gulabJamun = new Candies("Rs. 550");
	Collections.sort(star.arrayList,new Comparator<Chocolates>()
			{
		public int compare(Chocolates c1,Chocolates c2)
		{
			return Integer.valueOf(c1.weight);
		}
			});
	for(int i=0;i<star.arrayList.size();i++)
	{
		System.out.println(star.arrayList);
	}
}
}

	


