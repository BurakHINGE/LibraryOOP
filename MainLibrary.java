import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library();

        while (true) {
        
            System.out.println("Kütüphaneye Hoş Geldiniz!");
            System.out.println("1-Giriş Yap\n2-Kayıt Ol\n3-Çıkış Yap");
            int secenek = input.nextInt();
            input.nextLine();

            while (secenek < 1 || secenek > 3) {
                System.out.println("Lütfen geçerli bir işlem giriniz!");
                System.out.println("1-Giriş Yap\n2-Kayıt Ol\n3-Çıkış Yap");
                secenek = input.nextInt();
                input.nextLine();

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
                String sifre = input.nextLine();

                System.out.println("Aynı şifreyi tekrar giriniz: ");
                String testSifre = input.nextLine();

                while (!sifre.equals(testSifre)) {
                    System.out.println("Farklı şifreler girdiniz, lütfen tekrar deneyin.");
                    System.out.println("Şifre Belirleyiniz: ");
                    sifre = input.nextLine();

                    System.out.println("Aynı şifreyi tekrar giriniz: ");
                    testSifre = input.nextLine();
                }

                boolean isCorrect = library.register(kullaniciAdi, sifre);

                while (!isCorrect) {
                    System.out.println("Bu isimde başka bir kullanıcı adı bulunuyor lütfen farklı bir kullanıcı adı seçiniz.");

                    System.out.println("-----Kayıt Ol-----");
                    System.out.println("Kullanıcı Adı Seçiniz: ");
                    kullaniciAdi = input.nextLine();
                    
                    System.out.println("Şifre Belirleyiniz: ");
                    sifre = input.nextLine();

                    System.out.println("Aynı şifreyi tekrar giriniz: ");
                    testSifre = input.nextLine();

                    while (!sifre.equals(testSifre)) {
                        System.out.println("Farklı şifreler girdiniz, lütfen tekrar deneyin.");
                        System.out.println("Şifre Belirleyiniz: ");
                        sifre = input.nextLine();

                        System.out.println("Aynı şifreyi tekrar giriniz: ");
                        testSifre = input.nextLine();
                    }

                    isCorrect = library.register(kullaniciAdi, sifre);

                }

                System.out.println("Hesabınız oluşturuldu!");
                System.out.println("Artık istediğiniz kitapları ve yazarlarını kitaplığınıza ekleyebilirsiniz.");
                System.out.println("Tekrardan giriş yapmalısınız:");
                break;

            }
            else if(secenek == 1) {

                System.out.println("Giriş yapmak için kullanıcı adınızı giriniz: ");
                String kullaniciAdi = input.nextLine();

                System.out.println("Şifrenizi giriniz: ");
                String sifre = input.nextLine();

                User loggedInUser = library.login(kullaniciAdi, sifre);


                while (true) {
                    System.out.println("Kitaplığına hoş geldin " + loggedInUser.getUsername());
                    System.out.println("-----İşlem Seçiniz-----");
                    System.out.println("1-Kitap Ekle\n2-Kitaplığını Gör");
                    int secim = input.nextInt();
                    input.nextLine();

                    while (secim < 1 || secim > 3) {
                        System.out.println("Lütfen geçerli bir işlem giriniz: ");
                        System.out.println("1-Kitap Ekle\n2-Kitaplığını Gör\n3-Çıkış Yap");
                        secim = input.nextInt();
                        input.nextLine();
                    }

                    if (secim == 3) {
                        System.out.println("Kütüphaneden çıkış yapılıyor...");
                        return;
                    }
                    else if (secim == 2) {

                        boolean empty = loggedInUser.getBooks().isEmpty();

                        if (empty) {
                            System.out.println("Kitaplığınıza henüz kitap eklemediniz.");
                        }
                        else {
                            loggedInUser.listBooks();
                        }
                    
                    }
                    else if (secim == 1) {

                        System.out.println("Eklemek istediğiniz kitabın adını giriniz: ");
                        String kitapAdi = input.nextLine();

                        System.out.println("Kitabınızın yazarının adını giriniz: ");
                        String yazarAdi = input.nextLine();

                        

                        String book = loggedInUser.addBooks(kitapAdi, yazarAdi);




                    }

                }

            }

        }
        

    }
}

