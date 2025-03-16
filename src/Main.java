import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);


        System.out.println("Lütfen bir şifre giriniz");
        String sifre = scanner.nextLine();

        if (sifre.length() >= 8 &&
                !sifre.contains(" ") &&
                Character.isUpperCase(sifre.charAt(0)) &&
                sifre.charAt(sifre.length() - 1) == '?') {

            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }


        scanner.close();




    }
}