package pck01;
import java.util.Scanner;

/**
 * @author Alexandre Domain
 */

public class SolutionsTrinome {
    
    public static void main(String[] args) {
        System.out.println("Soit ax² + bx + c = 0");
        System.out.println(solTrinome(inputDouble("entrez a :"),inputDouble("entrez b :"),inputDouble("entrez c :"))) ;
    }
    
    public static String solTrinome(double a, double b, double c) {
        double d = b * b - 4 * a * c ;
        if (d>0) {
            return ("Racines réelles : " + (-b-Math.sqrt(d))/(2*a) + " et " + (-b+Math.sqrt(d))/(2*a));
        }
        else if (d==0) {
            return ("Racine double : " + -b/(2*a));
        }
        else {
            return("Racine complexes : " + -b/(2*a) + -Math.sqrt(-d)/(2*a) + "i" + " et " + -b/(2*a) + "+" + +Math.sqrt(-d)/(2*a) + "i");
        }
    }
    
    /* // Pour mémoire ...
    public static String inputString(String demande){
      Scanner sc = new Scanner(System.in);
      System.out.println(demande);
      //On vide la ligne avant d'en lire une autre
      sc.nextLine();
      String str = sc.nextLine();      
      return str;
    }
    */
    
    public static double inputDouble(String demande){
      Scanner sc = new Scanner(System.in);
      System.out.println(demande);
      double nb = sc.nextDouble();    
      return nb;
    }
    
}
