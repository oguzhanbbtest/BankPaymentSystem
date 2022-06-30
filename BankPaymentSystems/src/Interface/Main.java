package Interface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tutar Giriniz : ");
        double price = sc.nextDouble();

        System.out.print("Kart no giriniz : ");
        String cardNumber = sc.next();

        System.out.print("Son kullanma tarihi giriniz : ");
        String date = sc.next();

        System.out.print("Guvenlik kodu tarihi giriniz : ");
        String CVC = sc.next();

        System.out.println("1. A BANKASI");
        System.out.println("2. B BANKASI");
        System.out.println("3. C BANKASI");

        System.out.println("Banka Seciniz");
        int selectBank = sc.nextInt();


        switch (selectBank){

            case 1 :
                Abank aPos = new Abank("A Bankasi", "45454545","123212321");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,date,CVC);
                break;
            case 2 :
                Bbank bPos = new Bbank("B Bankasi","7878454545","454655465");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNumber,date,CVC);
                break;
            default:
                System.out.println("Geçerli Banka Giriniz");

        }
    }

}
