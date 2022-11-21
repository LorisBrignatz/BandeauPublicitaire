package exemple;

import bandeau.Bandeau;

public class Defile implements Effet {

    public Defile(String ce_texte_défile) {
    }

    public void jouer(Bandeau bandeau) {

        char tmp;
        StringBuilder ajouts;

        for(int i = 0 ; i < bandeau.getMessage().length() ; i++){
            ajouts = new StringBuilder(bandeau.getMessage());
            tmp = ajouts.charAt(ajouts.length()-1);

            for(int k = ajouts.length()-1  ; k > 0 ; k--){
                ajouts.setCharAt(k,ajouts.charAt(k-1));
            }

            ajouts.setCharAt(0,tmp);
            bandeau.sleep(500);
            bandeau.setMessage(ajouts.toString());
        }
    }

}