public class Idman {
    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squatSayisi;

    public Idman(int burpeeSayisi, int squatSayisi, int situpSayisi, int pushupSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.squatSayisi = squatSayisi;
        this.situpSayisi = situpSayisi;
        this.pushupSayisi = pushupSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void HareketYap(String HareketTuru , int sayi){

        if (HareketTuru.equals("Burpee")){
            burpeeYap(sayi);
        }

        else if (HareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        }

        else if (HareketTuru.equals("Situp")) {
            situpYap(sayi);
        }

        else if (HareketTuru.equals("Squat")) {
            squatYap(sayi);
        }

        else System.out.println("Geçersiz hareket!");
    }

    public void burpeeYap (int sayi){
        if (burpeeSayisi == 0){
            System.out.println("Yapacak burpee kalmadı...");
        }

        if (burpeeSayisi - sayi < 0){
            System.out.println("Hedeflediğin burpee sayısını geçtin. Tebrikler!");
            burpeeSayisi = 0;
            System.out.println("Kalan burpee sayısı: " + burpeeSayisi);
        }

        else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan burpee sayısı: " + burpeeSayisi);
        }
    }

    public void pushupYap (int sayi){
        if (pushupSayisi == 0){
            System.out.println("Yapacak pushup kalmadı...");
        }

        if (pushupSayisi - sayi < 0){
            System.out.println("Hedeflediğin pushup sayısını geçtin. Tebrikler!");
            pushupSayisi = 0;
            System.out.println("Kalan pushup sayısı: " + pushupSayisi);
        }

        else {
            pushupSayisi -= sayi;
            System.out.println("Kalan pushup sayısı: " + pushupSayisi);
        }
    }

    public void situpYap (int sayi){
        if (situpSayisi== 0){
            System.out.println("Yapacak situp kalmadı...");
        }

        if (situpSayisi - sayi < 0){
            System.out.println("Hedeflediğin situp sayısını geçtin. Tebrikler!");
            situpSayisi = 0;
            System.out.println("Kalan situp sayısı: " + situpSayisi);
        }

        else {
            situpSayisi -= sayi;
            System.out.println("Kalan situp sayısı: " + situpSayisi);
        }
    }

    public void squatYap (int sayi){
        if (squatSayisi == 0){
            System.out.println("Yapacak squat kalmadı...");
        }

        if (squatSayisi - sayi < 0){
            System.out.println("Hedeflediğin squat sayısını geçtin. Tebrikler!");
            squatSayisi = 0;
            System.out.println("Kalan squat sayısı: " + squatSayisi);
        }

        else {
            squatSayisi -= sayi;
            System.out.println("Kalan squat sayısı: " + squatSayisi);
        }
    }

    public boolean idmanKontrol(){
        return(burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0);
    }












}
