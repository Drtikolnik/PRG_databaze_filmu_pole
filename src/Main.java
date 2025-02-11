import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Kolik filmů chceš zadat?");
        int pocetFilmu = sc.nextInt();
        Film[] poleFilmu = new Film[pocetFilmu];

        for (int i = 0; i < kolikFilmu; i++){
            System.out.println("NÁZEV:");
            String nazev = sc.nextLine();

            System.out.println("ROK VYDÁNÍ:");
            int rokVydani = sc.nextInt();
            sc.nextLine();

            System.out.println("HODNOCENÍ:");
            int hodnoceni = sc.nextInt();
            sc.nextLine();

            System.out.println("Kolik herců chceš zadat?");
            int pocetHercu = sc.nextInt();
            Herec[] poleHercu = new Herec[poceHercu];

        }








        Herec[] poleHercu = new Herec[1];
        poleHercu[0] = new Herec("Daniel Landa", 1924);


        Film[] poleFilmu = new Film[1];
        poleFilmu[0] = new Film("ABRAHAM", 1999, 14 );


























    }
}