package nl.munitielexicon.munitielexicon;

public class History {

    private String mun_afkorting;
    private String mun_definitie;


    public History(String mun_afkorting,String mun_definitie) {
        this.mun_afkorting = mun_afkorting;
        this.mun_definitie = mun_definitie;
    }

    public String get_mun_afkorting() {
        return mun_afkorting;
    }
    public String get_mun_definitie() {
        return mun_definitie;
    }
}

