public class Cassette extends Document{
    private String auteur;
    private int duree;

//      Constructor
    public Cassette(String titre, String auteur, int duree){
        super(titre);
        this.auteur = auteur;
        this.duree = duree;
    }

//      Methods
    public String toString() {
        return "Cassette {" +
                "titre=" + getTitre() +
                ", date=" + getcreationDate() +
                ", auteur=" + auteur +
                ", durée='" + duree + '\'' +
                " }";
    }
}
