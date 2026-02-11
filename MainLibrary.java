import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library();
        
        System.out.println("Kütüphaneye Hoş Geldiniz!");
        System.out.println("1-Giriş Yap\n2-Kayıt Ol\n3-Çıkış Yap");
        int secenek = input.nextInt();

        while (secenek < 1 || secenek > 3) {
            System.out.println("Lütfen geçerli bir işlem giriniz!");
            System.out.println("1-Giriş Yap\n2-Kayıt Ol\n3-Çıkış Yap");
            secenek = input.nextInt();

        }

        if (secenek == 3) {
            System.out.println("Kütüphaneden çıkış yapılıyor...");
            return;
        }
        else if (secenek == 2) {

            System.out.println("-----Kayıt Ol-----");
            System.out.println("Kullanıcı Adı Seçiniz: ");
            String kullaniciAdi = input.nextLine();
            
            System.out.println("Şifre Belirleyiniz: ");
            int sifre = input.nextInt();

            System.out.println("Aynı şifreyi tekrar giriniz: ");
            int testSifre = input.nextInt();

            

        }
        else if(secenek == 1) {

        }


        

    }
}
