import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sayi Giriniz : ");
        number = input.nextInt();
        for(int i=0;i<number;i++) {
            if (Math.pow(4,i) < number) {
                System.out.println(Math.pow(4,i));
            }
            if (Math.pow(5,i) < number) {
                System.out.println(Math.pow(5,i));
            }

        }
    }
}
