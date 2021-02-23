import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    public static final int y4 = HEIGHT * 4 / 5;
    public static final int y3 = HEIGHT * 3 / 5;
    public static final int y2 = HEIGHT * 2 / 5;
    public static final int y1 = HEIGHT / 5;
    public static final int DIAMETER = 10;
    private int x1 = 0;
    private int x2 = 0;
    private int x3 = 0;
    private int x4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {

        //circle(x1,HEIGHT/5,DIAMETER);
        ellipse(x1, y1, DIAMETER,DIAMETER);
        ellipse(x2, y2, DIAMETER,DIAMETER);
        ellipse(x3, y3, DIAMETER,DIAMETER);
        ellipse(x4, y4, DIAMETER,DIAMETER);

        x1 +=1;
        x2 +=2;
        x3 +=3;
        x4 +=4;
    }

}
