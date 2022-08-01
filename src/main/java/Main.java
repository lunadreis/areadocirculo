import java.util.Scanner;

public class Main {
public static void main (String [] args){
    double pi = 3.14;
    double r;
    double area;
    Scanner sc = new Scanner(System.in);
    r = sc.nextDouble();
    area = (pi*r*r);
    System.out.print("A area do circulo: ");
    System.out.println(area);
    sc.close();


}
}

