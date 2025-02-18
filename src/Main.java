import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Kolik filmů chceš zadat?");
        int pocetFilmu = sc.nextInt();
        Film[] poleFilmu = new Film[pocetFilmu];

        //NASTAVENÍ FILMŮ
        for (int i = 0; i < pocetFilmu; i++){
                System.out.println("ZADEJ INFORMACE O " +(i+1)+ ". FILMU:");
            System.out.println("NÁZEV:");
            String nazev = sc.nextLine();

            System.out.println("ROK VYDÁNÍ:");
            int rokVydani = sc.nextInt();
            sc.nextLine();

            System.out.println("HODNOCENÍ:");
            int hodnoceni = sc.nextInt();
            sc.nextLine();

            System.out.println("KOLIK HERCŮ CHCEŠ ZADAT?");
            int pocetHercu = sc.nextInt();
            Herec[] poleHercu = new Herec[pocetHercu];

            for (int j = 0; j < pocetHercu; j++) {
                System.out.println("ZADEJTE INFORMACE O " + (j + 1) + ". HERCI:");
                System.out.print("JMÉNO: ");
                String jmeno = sc.nextLine();

                System.out.print("ROK NAROZENÍ: ");
                int rokNarozeni = sc.nextInt();
                sc.nextLine();

                poleHercu[j] = new Herec(jmeno,rokNarozeni);
            }
            Film film = new Film(nazev,rokVydani,hodnoceni, poleHercu);
        }






























    }
}