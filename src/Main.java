import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("4 Basamaklı bir sayı girin: ");
        int sayi=scanner.nextInt();
        int sonikibm=sayi%100;
        int ilkikibm=sayi/100;
        int toplam=(ilkikibm+sonikibm)*(ilkikibm+sonikibm);
        if(toplam==sayi){
            System.out.println("Sayı Orijinal Sayıdır!!");
        }
        else {
            System.out.println("Sayı Orijinal Sayi Değildir!!");
        }
	// write your code here
    }
}
