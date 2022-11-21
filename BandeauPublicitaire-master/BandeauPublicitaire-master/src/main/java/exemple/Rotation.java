package exemple;

import java.awt.*;
import bandeau.Bandeau;
public class Rotation implements Effet{
    private String rot;

    public Rotation(String rot) {
        super();
        this.rot = rot;
    }
        public void jouer(Bandeau bandeau){
            bandeau.setMessage(rot);

            for (int i = 1; i < 10; i += 1) {
                bandeau.setFont(new Font("Message", Font.BOLD, 5 + i));
                bandeau.setRotation(i * Math.PI / 2.0f);
                bandeau.sleep(200);

                bandeau.setRotation((i + 1) * Math.PI / 2.0f);
                bandeau.setRotation(0.0f);
                bandeau.sleep(200);
            }

            bandeau.sleep(200);
            bandeau.setFont(new Font("Monospaced", Font.PLAIN, 15));

        }
    }

