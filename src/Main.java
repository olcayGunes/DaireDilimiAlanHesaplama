import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dilimAlan, yaricap, aciOlcusu, pi=3.14;

        System.out.print("Yarıçapı Giriniz: ");
        yaricap = input.nextDouble();

        System.out.print("Merkez Açının Ölçüsünü Giriniz: ");
        aciOlcusu = input.nextDouble();

        dilimAlan = (pi*Math.pow(yaricap,2)*aciOlcusu)/360;

        System.out.println("Yarıçapı "+yaricap+", açısı "+aciOlcusu+" olan daire diliminin alanı "+dilimAlan);
    }
}
