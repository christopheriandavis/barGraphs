package bargraph;
import processing.core.PApplet;

public class Bar {
    private int height, width, locationX, locationY, colorR, colorG, colorB;
    private PApplet parent;

    public Bar(PApplet papp, int h, int w, int x, int y){
        height = h;
        width = w;
        locationX = x;
        locationY = y;
        parent = papp;
        colorR = (int) (Math.random() * 255);
        colorG = (int) (Math.random() * 255);
        colorB = (int) (Math.random() * 255);
    }

    public void draw(){
        parent.fill(colorR, colorG, colorB);
        parent.rect(locationX, locationY, width, height);
    }
}
