class Main {
    public static void main(String args[]){
        System.out.println("Hello Java");

        Document tonton = new Livre("tonton", 10, "Léo", "Tartampion");
        tonton.setTitre("tata");
        System.out.println("changement de titre : "+tonton.getTitre());
        System.out.println(tonton.toString()+"\n");

        Document k7 = new Cassette("toxicity","System of a download", 45);
        System.out.println(k7.toString()+"\n");
        Document k8 = new Cassette("toxicity","System of a download", 45);
        System.out.println(k8.toString()+"\n");

        Document interview8 = new Periodique("on en a gros !", "quotidien", 25);
        System.out.println(interview8.toString()+"\n");

        Bibliotheque horotopia = new Bibliotheque("Horotopia");
        horotopia.ajouterDocument(tonton);
        horotopia.ajouterDocument(k7);
        horotopia.ajouterDocument(k8);
        horotopia.ajouterDocument(interview8);

        System.out.println(horotopia.toString()+"\n");
    }
}