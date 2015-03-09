import processing.core.PVector;

/**
 * Created by Gøran on 09.03.2015.
 * Supposed to generate several vectors, moving in a circle
 * while contracting and expanding - and leaving a trail of color.
 */

public class Spiral {

    private int elements;
    private int radius;
    private float topspeed;

    /**
     * Constructor for class Spiral.
     *
     * @param elements     - Number of particles/movers in the spiral.
     * @param radius       - The maximum radius the spiral can extend.
     * @param topspeed     - The top speed at which the vectors can travel.
     */
    public Spiral(int elements, int radius, float topspeed) {
        this.elements = elements;
        this.radius = radius;
        this.topspeed = topspeed;
    }

    public void generateSpiral(){

    }

    /**
     * For making the shape(s) that will be moving
     * in said circle.
     */
    class Element {
        PVector location;
        PVector velocity;
        PVector acceleration;

        Element() {
            location = new PVector(100, 100);
            velocity = new PVector(100, 100);

        }

    }

    public int getElements() {
        return elements;
    }

    public void setElements(int elements) {
        this.elements = elements;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(float topspeed) {
        this.topspeed = topspeed;
    }
}
