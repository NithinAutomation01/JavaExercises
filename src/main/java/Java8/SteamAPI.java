package Java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;

public class SteamAPI {

	public static void main(String[] args) {
     List<String> values =Arrays.asList("Nithin","Prakash","Krishna","Manoj","Srikanth");
    
     // External iterations
     System.out.println("From enhanced for loop");
     for(String I :values){
    	 System.out.println(I);
     }
     
     
     System.out.println("From the iterator iterations");
     Iterator itr =values.iterator();
     while(itr.hasNext()){
    	 System.out.println(itr.next());
     }
     
     
     // Internal Iterations
     System.out.println("Iterations from ForEach internal Iterations");
     	values.forEach(k->System.out.println(k));

	}

}
