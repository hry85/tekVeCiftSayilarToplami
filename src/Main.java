import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i , total = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz : ");
            i=sc.nextInt();
            if (i%2==1){
                total+=i;
            }

        }while (i>0);

        System.out.println("Toplam : " +total);

        System.out.println("-------------------------------------------");
        //tek bir sayi girilene kadar giris yapilan ve 4 un katlarinin toplami
         int j = 0,tot = 0;
        while (j % 2 == 0) {
            System.out.print("Rakam giriniz : ");
            j = sc.nextInt();
            if (j % 4 == 0) {
                tot = j + tot;
            }
        }
        System.out.println("Girilen rakamlardan 4'un katlari toplami: " + tot);
    }
}
