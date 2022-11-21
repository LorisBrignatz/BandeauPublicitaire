package exemple;
import java.util.HashMap;
import java.util.Map;
import bandeau.Bandeau;

public class Scenario {
    private HashMap<Effet, Integer> lesEffets;
    private Bandeau bandeau;

    public Scenario() {
        this.lesEffets = new HashMap<Effet, Integer>();
    }

    public void ajouterEffet(Effet e, int nbEffet) {
        lesEffets.put(e, nbEffet);
    }

    public void debuterScenario() {
        for (Map.Entry<Effet, Integer> scenarios : lesEffets.entrySet()) {
            for (int i = 0; i < scenarios.getValue(); i++) {
                scenarios.getKey().jouer(bandeau);
            }
        }
    }
}
