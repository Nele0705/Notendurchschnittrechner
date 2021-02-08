import java.util.Scanner;

public class Notenschnittrechner {
	
  public static double schnitt (double [] noten){
	  double summe = 0;
	  int anzahl = noten.length;
	  
	  for(int i=0; i<noten.length;i++) {
		  summe = summe + noten [i];
	  }
	  
	  double schnitt = summe / anzahl;
			  return schnitt; 	  
  }
  
  public static void main (String [] args) {
 
  Scanner lesen = new Scanner(System.in);
  System.out.println("Wie viele Noten möchtest du eingeben");
  int anzahl = lesen.nextInt();
  
  double [] noten = new double [anzahl];
  System.out.println("Bitte eingeben:");
  for (int i = 0; i<noten.length;i++) {
	  noten [i] = lesen.nextDouble();
  }
  
  System.out.println("Meine Noten sind:" );
  for (int i = 0; i< noten.length;i++) {
	  System.out.println(noten[i] + "");
  }
	  System.out.println("");
	  System.out.println("Mein Schnitt beträgt: " +schnitt(noten));
  }
}
