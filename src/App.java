import java.util.*;  
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter a number:");
        int input=sc.nextInt();
        if (quadrat.isNatural(input)==true) {
            System.out.println("Area: "+quadrat.area(input));
            System.out.println("Volume: "+quadrat.volume(input));
        } else {
            System.out.println("No es un numero natural");
            
        }
        sc.close();
    }
}
