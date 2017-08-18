package IntroToHashMaps;

import java.util.HashMap;
import java.util.Iterator;

public class IntroToHashMaps {

	public static void main(String[] args) {
		HashMap<Integer, Double> roots = new HashMap<Integer, Double>();
		for (int i = 0; i < 500; i++) {
			roots.put(i, Math.sqrt(i));
		}
		for (Integer i : roots.keySet()){
			System.out.println("The square Root of "+i+" is "+roots.get(i));
			
		}
	}
}
