package POO3;

import java.util.Scanner;

public class TestAnimal {
 public static void main (String args[])
 {    Scanner ler = new Scanner (System.in);
	 Cachorro cachorro = new Cachorro();
	 Cavalo cavalo = new Cavalo ();
	 Preguiça preguiça =  new Preguiça ();
	 Animal animal = null;
			 
			 System.out.println("Insira um número de 1 a 3");
	         int n = ler.nextInt();
			 switch(n)
			 {
			 case 1:
				animal= cachorro;
				System.out.println(cachorro.getCachorro());
				 break;
			 
			 case 2:
				 animal= cavalo;
				 System.out.println(cavalo.getCavalo());
				 
			  break;
			 
			 case 3:
				 animal= preguiça;
				 System.out.println(preguiça.getPreguiça());
				 break;
			 }
			 
	    
 }
}
