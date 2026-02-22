import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library();

        while (true) { //menu
        
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

            if (secenek == 3) { //exit program
                System.out.println("Kütüphaneden çıkış yapılıyor...");
                return;
            }
            else if (secenek == 2) { //register

                System.out.println("-----Kayıt Ol-----");
                System.out.println("Kullanıcı Adı Seçiniz: ");
                String kullaniciAdi = input.nextLine();
                
                System.out.println("Şifre Belirleyiniz: ");
                String sifre = input.nextLine();

                int isCorrectPassword = library.isAllowedPassword(sifre);

                while (!(isCorrectPassword == 8)) {

                    switch (isCorrectPassword) {
                    
                        case 0: {
                            System.out.println("Şifreniz çok kısa lütfen en az 8 karakterli şifre oluşturun!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }
                        case 1: {
                            System.out.println("Şifrenizde en az birer adet küçük, büyük ve özel karakter bulunmalıdır!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }
                        case 2: {
                            System.out.println("Şifrenizde en az birer adet büyük ve küçük harf bulunmalıdır!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }
                        case 3: {
                            System.out.println("Şifrenizde en az birer adet büyük ve özel karakter bulunmalıdır!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }
                        case 4: {
                            System.out.println("Şifrenizde en az birer adet küçük ve özel karakter bulunmalıdır!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }
                        case 5: {
                            System.out.println("Şifrenizde en az bir adet özel karakter bulunmalıdır!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }
                        case 6: {
                            System.out.println("Şifrenizde en az bir adet küçük harf bulunmalıdır!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }
                        case 7: {
                            System.out.println("Şifrenizde en az bir adet büyük harf bulunmalıdır!");
                            System.out.println("Şifrenizi giriniz: ");
                            sifre = input.nextLine();
                            break;
                        }

                    }

                    isCorrectPassword = library.isAllowedPassword(sifre);
                }

                System.out.println("Aynı şifreyi tekrar giriniz: ");
                String tekrarSifre = input.nextLine();

                sifre = testSifre(sifre, tekrarSifre, input);

                boolean isCorrect = library.register(kullaniciAdi, sifre);

                while (!isCorrect) {
                    System.out.println("Bu isimde başka bir kullanıcı adı bulunuyor lütfen farklı bir kullanıcı adı seçiniz.");

                    System.out.println("-----Kayıt Ol-----");
                    System.out.println("Kullanıcı Adı Seçiniz: ");
                    kullaniciAdi = input.nextLine();
                    
                    System.out.println("Şifre Belirleyiniz: ");
                    sifre = input.nextLine();

                    System.out.println("Aynı şifreyi tekrar giriniz: ");
                    tekrarSifre = input.nextLine();

                    sifre = testSifre(sifre, tekrarSifre, input);

                    isCorrect = library.register(kullaniciAdi, sifre);

                }

                System.out.println("Hesabınız oluşturuldu!");
                System.out.println("Artık istediğiniz kitapları ve yazarlarını kitaplığınıza ekleyebilirsiniz.");
                System.out.println("Tekrardan giriş yapmalısınız:");
                continue;

            }
            else if(secenek == 1) { //login

                System.out.println("Giriş yapmak için kullanıcı adınızı giriniz: ");
                String kullaniciAdi = input.nextLine();

                System.out.println("Şifrenizi giriniz: ");
                String sifre = input.nextLine();

                User loggedInUser = library.login(kullaniciAdi, sifre);

                if (loggedInUser == null) {
                    System.out.println("Hatalı kullanıcı adı veya şifre!");
                    continue;
                }


                while (true) {
                    System.out.println("Kitaplığına hoş geldin " + loggedInUser.getUsername());
                    System.out.println("-----İşlem Seçiniz-----");
                    System.out.println("1-Kitap Ekle\n2-Kitaplığını Gör\n3-Çıkış");
                    int secim = input.nextInt();
                    input.nextLine();

                    while (secim < 1 || secim > 3) {
                        System.out.println("Lütfen geçerli bir işlem giriniz: ");
                        System.out.println("1-Kitap Ekle\n2-Kitaplığını Gör\n3-Çıkış Yap");
                        secim = input.nextInt();
                        input.nextLine();
                    }

                    if (secim == 3) { //exit bookshelf
                        System.out.println("Kitaplıktan çıkış yapılıyor...");
                        break;
                    }
                    else if (secim == 2) { //list books

                        boolean empty = loggedInUser.getBooks().isEmpty();

                        if (empty) {
                            System.out.println("Kitaplığınıza henüz kitap eklemediniz.");
                        }
                        else {
                            loggedInUser.listBooks();
                        }
                    
                    }
                    else if (secim == 1) { //add book

                        boolean added = false;

                        while(!added) {
                            System.out.println("Eklemek istediğiniz kitabın adını giriniz: ");
                            String kitapAdi = input.nextLine();

                            System.out.println("Kitabınızın yazarının adını giriniz: ");
                            String yazarAdi = input.nextLine();

                            added = loggedInUser.addBooks(kitapAdi, yazarAdi);
                            JsonManager.saveUsers(library.getUsers());

                            if (!added) {
                                System.out.println("Bu kitap zaten kitaplığında bulunuyor.");
                            }
                            else {
                                System.out.println("Kitabınız kitaplığınıza başarıyla eklendi.");
                            } 
                            
                        }

                    }

                }

            }

        }
        
    }

    public static String testSifre(String pass, String testPass, Scanner input) {

        while (!pass.equals(testPass)) {
            System.out.println("Farklı şifreler girdiniz, lütfen tekrar deneyin.");
            System.out.println("Şifrenizi giriniz: ");
            pass = input.nextLine();
            System.out.println("Aynı şifreyi tekrar giriniz: ");
            testPass = input.nextLine();
        }

        return pass;

    }

}

