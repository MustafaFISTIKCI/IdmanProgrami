import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz...");
        String idmanlar = "-----Geçerli Hareketler-----\n" +
                "\t\tBurpee\n" +
                "\t\ttPushup\n" +
                "\t\tSitup\n" +
                "\t\tSquat";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun.");

        System.out.print("Burpee sayısı: ");
        int burpee = scanner.nextInt();

        System.out.print("Pushup sayısı: ");
        int pushup = scanner.nextInt();

        System.out.print("Situp sayısı: ");
        int situp = scanner.nextInt();

        System.out.print("Squat sayısı: ");
        int squat = scanner.nextInt();

        scanner.nextLine();

        Idman idman = new Idman(burpee,squat,situp,pushup);
        System.out.println("İdmanınnız başlıyor.");

        while (idman.idmanKontrol() == false){
            System.out.print("Hareket Türü (Burpee, Pushup, Situp, Squat) : ");
            String cesit = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapmak istersiniz? :");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.HareketYap(cesit,sayi);
        }
        System.out.println("Tebrikler bütün programı tamamladın.");
    }
}