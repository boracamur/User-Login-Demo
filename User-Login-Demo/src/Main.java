import java.util.Scanner;

public class Main {

    static boolean aktif = true;
    static int hakSayisi = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (aktif) {

            if (hakSayisi > 0) {

                while (aktif) {

                    System.out.print("Kullanıcı Adınız : ");
                    String username = scanner.nextLine();

                    System.out.print("Şifreniz : ");
                    String password = scanner.nextLine();

                    boolean sonuc = Login(username, password);
                    if (sonuc) {

                        System.out.println("Uygulamaya başarılı bir şekilde giriş yaptınız.");
                        break;

                    } else {

                        if (hakSayisi == 0) {
                            aktif = false;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static boolean Login(String username, String password) {

        if (username.equals("Ali") && password.equals("1234")) {
            return true;
        } else {

            hakSayisi--;
            System.out.println("Kullanıcı adı veya şifreniz hatalı. Kalan hakkınız : " + hakSayisi);

            if (hakSayisi == 0) {

                System.out.println("Hesabınız bloke olmuştur. Lütfen daha sonra tekrar deneyiniz.");
                aktif = false;
            }
            return false;
        }


    }
}