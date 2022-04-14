package om;

import java.util.Enumeration;
import java.util.Vector;

public class Bibliotheque {

    // on change le tableau statique
    // private Document tDocument[] = new Document[4];
    // en tableau dynamique
    private Vector tDocument = new Vector();
    private Enumeration<Document> enu;
    private Vector list = new Vector();
    private int nbDocuments = 0;
    private String nom;

    // ---------- Constructor ----------  ----------
    public Bibliotheque(String nom){
        this.nom = nom;
    }

    // ---------- Getters ----------  ----------
    public void document() {
        this.enu = tDocument.elements();
        while(enu.hasMoreElements())
        {
            System.out.println(enu.nextElement()+"\n");
        }
    }
    public int getNbDocuments() {
        return nbDocuments;
    }
    public String getNom() {
        return nom;
    }

    // ---------- Adders ----------  ----------
    public void ajouterDocument(Document document) {
        this.tDocument.add(document);
        this.nbDocuments += 1;
    }

    // ---------- Methods ----------  ----------
    public String toString()
    {
        this.document();
        return "Bibliotheque { " +
                ", nbDocuments=" + nbDocuments +
                "\n, nom ='" + nom + '\'' +
                " }";
    }

    public Vector search(String type)
    {
        for (int i = 0; i < tDocument.size(); i++)
        {
            if (tDocument.contains(type))
            {
                list.addElement(tDocument.get(i));
            }
        }
        return list;
    }
}
