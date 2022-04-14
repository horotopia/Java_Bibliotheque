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
    public Enumeration document() {
        return this.enu = tDocument.elements();
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
        Enumeration enu = document();
        while(enu.hasMoreElements())
        {
            System.out.println(enu.nextElement()+"\n");
        }
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
