public class Deskovka {
    private String nazevHry;
    private boolean mamKoupenou;
    private int oblibenost;

    public Deskovka(String nazevHry, boolean mamKoupenou, int oblibenost) {
        this.nazevHry = nazevHry;
        this.mamKoupenou = mamKoupenou;
        this.oblibenost = oblibenost;
    }

    public Deskovka(String nazevHry)
    {
        this(nazevHry,false,2);
    }

    public String getNazevHry() {
        return nazevHry;
    }

    public void setNazevHry(String nazevHry) {
        this.nazevHry = nazevHry;
    }

    public boolean isMamKoupenou() {
        return mamKoupenou;
    }

    public void setMamKoupenou(boolean mamKoupenou) {
        this.mamKoupenou = mamKoupenou;
    }

    public int getOblibenost() {
        return oblibenost;
    }

    public void setOblibenost(int oblibenost) {
        this.oblibenost = oblibenost;
    }


}
