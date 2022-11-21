package exemple;
import java.awt.*;
import bandeau.Bandeau;

public class Main {

    public void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        Scenario scenario = new Scenario();
        Rotation r1 = new Rotation("Rotation");
        Ajout a1 = new Ajout("Ajout de lettre");
        Defile d1 = new Defile("Ce texte défile");

        scenario.ajouterEffet(r1, 1);
        scenario.ajouterEffet(a1, 2);
        scenario.ajouterEffet(d1, 3);

        scenario.debuterScenario();
    }
}
