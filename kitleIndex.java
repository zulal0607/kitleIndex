import java.util.Scanner;

public class kitleIndex {
    public static void main(String[] args) {
        double boy, kg;

        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz (metre cinsinden) : ");
        boy = inp.nextDouble();
        System.out.print("kilonuzu giriniz : ");
        kg = inp.nextDouble();

        double index = (kg / (boy * boy));

        System.out.print("vücut kitle indexiniz : " + index);
        
    }

}
