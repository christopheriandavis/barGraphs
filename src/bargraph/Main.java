package bargraph;
import processing.core.*;

public class Main extends PApplet {
    Bar bar[];
    double nArray[];
    int barWidth;

    @Override
    public void setup(){
        size(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        smooth();
        background(215);
        
        nArray = new double[args.length - 3];
        bar = new Bar[args.length - 3];
        barWidth = (Integer.parseInt(args[1]) - 5 * (args.length - 2)) / (args.length - 3);

        System.arraycopy(Normalize.normalize(args), 0, nArray, 0, nArray.length);
        for (int i = 0; i < nArray.length; i++)
            nArray[i] *= (Integer.parseInt(args[2]) - 20);

        for (int i = 0, xPosition = 5; i < bar.length; i++, xPosition += (barWidth + 5)){
            bar[i] = new Bar(this, (int) nArray[i], barWidth, xPosition, Integer.parseInt(args[2]) - (int) nArray[i]);
        }
    }

    public static void main(String[] args) {
        String tempArgs[] = new String[args.length + 2];

        tempArgs[0] = "--bgcolor=#FFFFFF";
        tempArgs[1] = "bargraph.Main";

        for(int i = 2; i < tempArgs.length; i++){
            tempArgs[i] = args[i-2];
        }
        PApplet.main(tempArgs);
    }

    @Override
    public void draw(){
        for(int i = 0; i < bar.length; i++){
           bar[i].draw();
        }
    }
}
  
