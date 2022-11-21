package exemple;

import bandeau.Bandeau;

public class Ajout implements Effet{
    private String nom;

    public Ajout(String nom){
        this.nom = nom;
    }

    public void start(Bandeau bandeau){
        bandeau.setMessage("SansSerif 15");
        String msg = "Ajout de lettre";
        String tmp = "200";

        for(int i = 0; i < msg.length(); i++){
            tmp += "100";
        }

        StringBuilder ajouts = new StringBuilder(tmp);
        System.out.println(tmp);

        for(int i = 0; i < msg.length(); i++){
            System.out.println(ajouts.toString());
            bandeau.setMessage(ajouts.toString());
            bandeau.sleep(500);
        }
    }

    @Override
    public void jouer(Bandeau bandeau) {

    }
}