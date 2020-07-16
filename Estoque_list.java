package POO3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque_list {
 public static void main (String args[])
 {
	 Collection<String> estoque = new ArrayList<String>();
	 estoque.add("Arroz");
	 estoque.add("Ovo");
	 estoque.add("Pão");
	 estoque.add("Queijo");
	 
	 Collection<Integer>quant=new ArrayList<Integer>();
	 quant.add(1);
	 quant.add(2);
	 quant.add(3);
	 quant.add(4);
	 
	 if (estoque.contains("Batata")==true)
	 {
		 estoque.remove("Batata");
		
	 }
	 else {
		 
	estoque.remove("Arroz");
	quant.remove(1);
	
	Collection <String> estoque1 = Arrays.asList ("Paçoca", "Goiabada"); 
	estoque.addAll(estoque1);
	
	Collection <Integer> quant1 = Arrays.asList (7, 8); 
	quant.addAll(quant1);
	 }
	 
	 for (String items:estoque)
	 {
		 System.out.println("Itens do estoque: "+ estoque + quant);
	 }
	
 }
}
