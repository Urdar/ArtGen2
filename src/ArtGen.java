/**
 * Created by jens on 03.03.15.
 */

import processing.core.*;

import java.util.List;
import java.util.ArrayList;


public class ArtGen extends PApplet {

    public static void main(String args[]) {
        PApplet.main(new String[]{"--present", "ArtGen"});
    }


    private static int step = 0;
    private static int stage;

    private static int particleAmount = 2000;

    boolean pause = false;

    // List of animals in the field.


    public void setup() {

        size(displayWidth, displayHeight);    // Fullskjerm
//        size(500, 500);
        smooth();
        background(255);
        noStroke();
        fill(0, 255, 0);

    }


    public void draw() {

        textAlign(CENTER);
        textSize(32);
        fill(255, 0, 0);
        text("Trykk ESQ for å avslutte", (displayWidth / 2), (displayHeight / 2));

        }


    }
