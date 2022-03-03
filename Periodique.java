public class Periodique extends Document{
    private String frequence;
    private int page;

//      Constructor

    public Periodique(String titre, String frequence, int page){
        super(titre);
        this.frequence = frequence;
        this.page = page;
    }

//      Methods
    public String toString() {
        return "Périodique { " +
                "titre=" + getTitre() +
                ", date=" + getcreationDate() +
                ", frequence=" + frequence +
                ", page='" + page + '\'' +
                " }";
    }
}
