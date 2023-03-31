import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int basamak= input.nextInt();
        int temp= basamak;

        for (int i = 0; i <basamak ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(temp*2)-1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
            temp--;
        }
    }
}