import java.util.Date;

public abstract class Document {
    private String titre;
    private Date creationDate;

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

//      Setters
    public void setTitre(String titre){
        this.titre = titre;
    }

//      Methods
    public String toString() {
        return "Document { Titre= "+getTitre()+
                ", Date de création= "+ getcreationDate()+
                " }";
    }
}
