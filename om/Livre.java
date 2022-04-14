package om;

public class Livre extends Document{
    private int page;
    private String auteur;
    private String editeur;

//      Constructor
    public Livre(String titre, int page, String auteur, String editeur){
        super(titre);
        this.page = page;
        this.auteur = auteur;
        this.editeur = editeur;
    }

//      Methods
    public String toString() {
        return "Livre {" +
                "titre=" + getTitre() +
                ", Index= "+ getIndex()+
                ", date=" + getcreationDate() +
                ", page=" + page +
                ", auteur='" + auteur + '\'' +
                ", éditeur='" + editeur + '\'' +
                " }";
    }
}
