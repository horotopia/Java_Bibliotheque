package om;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public abstract class Document {
    private String titre;
    private Date creationDate;
    private Vector index = new Vector();

//      constructor
    protected Document(){
        this.titre = null;
        this.creationDate = new Date();
    }
    protected Document(String titre) {
        this.titre = titre;
        this.creationDate = new Date();
    }
//      Getters
    public String getTitre(){
        return titre;
    }
    public String getcreationDate(){
        return ""+creationDate;
    }
    public Vector getIndex() {return index;}

//      Setters
    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setIndex(String type) { this.index.add(type);}

//      Methods
    public String toString() {
        return "Document { Titre= "+getTitre()+
                ", Date de création= "+ getcreationDate()+
                " }";
    }
}
