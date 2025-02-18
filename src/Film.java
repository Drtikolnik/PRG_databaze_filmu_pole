public class Film {


    private String nazev;
    private int rokVydani;
    private int hodnoceni;
    private Herec[] herci;


    public Film(String nazev, int rokVydani, int hodnoceni, Herec[] herci) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.hodnoceni = hodnoceni;
        this.herci = herci;
    }

    public void vypisHodnoceniNad80(){
        if(hodnoceni > 80){
            System.out.print(nazev+ " s ve kterém hrálo " +herci.length+ ". herců");
        }
    }

    public void vypisHodnoceniNejlepsi(){

    }











public String getNazev() {return nazev;}

public int getRokVydani() {return rokVydani;}


public void sethodnoceni(int hodnoceni) {this.hodnoceni = hodnoceni;}

public void setRokVydani(int rokVydani) {this.rokVydani = rokVydani;}


























}
