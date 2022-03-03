import java.util.Arrays;

public class Bibliotheque {
    private Document tDocument[] = new Document[4];
    private int nbDocuments = 0;
    private String nom;

//      Constructor
    public Bibliotheque(String nom){
        this.nom = nom;
    }

//      Getters
    public Document[] listerDocument() {
        return tDocument;
    }
    public int getNbDocuments() {
        return nbDocuments;
    }
    public String getNom() {
        return nom;
    }

//      Adders
    public void ajouterDocument(Document document) {
        this.tDocument[nbDocuments] = document;
        this.nbDocuments += 1;
    }

//      Methods
    public String toString() {
        return "Bibliotheque { " +
                "tDocument= \n" + tDocument[0] + "\n" +
                tDocument[1] + "\n" +
                tDocument[2] + "\n" +
                tDocument[3] + "\n" +
                ", nbDocuments=" + nbDocuments +
                "\n, nom ='" + nom + '\'' +
                " }";
    }
}
