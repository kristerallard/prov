
import java.util.*;

public class prov {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		Scanner in = new Scanner (System.in);
		
		System.out.println("Hur m�nga siffror vill ni l�gga in?");
		int j = in.nextInt();
		int ray[]=new int[j]; // antal arrayer valt.
		
				
		System.out.println("Skriv heltalen �tskilt av enter");
			
		for(int i=0; i<ray.length; i++)		
			ray[i]=in.nextInt();
		in.close();
		
			
		prove p = new prove();
		System.out.println(p.highestNumber(ray));
		System.out.println(p.highestNumber(ray));
	}
		
	
}

	
	


	
	

