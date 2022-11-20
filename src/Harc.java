import java.util.Random;
import java.util.Scanner;

public class Harc {

    public static void main(String[] args) {
    int harcos = 100;
    int szorny = 100;
    Random rnd = new Random();
    int dobas = 0;
    int dobasOsszertekKor = 0;
    int folytatas = 0;

    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("== Harcos sebzése == A kezdéshez üss entert!");
        sc.nextLine();
        dobasOsszertekKor = 0;
        while(true) {
            dobas = rnd.nextInt(6) + 1;
            if (dobas == 1) {
                System.out.println("Elestél, nincs sebzés. A folytatáshoz üss entert!");
                sc.nextLine();
                break;
            }
            System.out.println("");
            System.out.println("Dobásod értéke: " + dobas);
            dobasOsszertekKor += dobas;
            System.out.println("Eddigi sebzésed: " + dobasOsszertekKor);
            do {
                System.out.print("Újabb dobás? (1: igen / 0: nem): ");
                folytatas = sc.nextInt();
                sc.nextLine();
                if (folytatas == 0) {
                    szorny -= dobasOsszertekKor;
                    System.out.println("Sebzésed: " + dobasOsszertekKor +", A szörny élete: " + szorny );
                    break;
                } else if (folytatas == 1) {
                    continue;
                }
            } while (folytatas != 1);
            if (folytatas == 0){
                break;
            }
        }
        System.out.println("== Szörny sebzése ==");
        System.out.println("A kezdéshez üss entert!");
        sc.nextLine();
        dobasOsszertekKor = 0;
        for (int i = 0; i<3;i++){
           dobasOsszertekKor+= (rnd.nextInt(6)+1);
        }
        harcos -= dobasOsszertekKor;
        System.out.println("A szörny sebzése: "+ dobasOsszertekKor + ", Életed: " + harcos);
    } while (harcos > 0 && szorny >0);
        System.out.println("A folytatáshoz üss entert!");
        sc.nextLine();
        if (szorny <= 0){
            System.out.println("Győztél, legyőzted a szörnyet!");
        }
        if (harcos <= 0){
            System.out.println("A szörny győzött!");
        }
    }

}
