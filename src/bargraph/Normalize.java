package bargraph;

public class Normalize {

    public static double[] normalize(String[] args){

        double doubleArray[] = new double[args.length - 3];

        for (int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = Double.parseDouble(args[i + 3]);
        }

        double largest = doubleArray[0];
        for (int i = 1; i < doubleArray.length; i++){
            if (doubleArray[i] > largest)
               largest = doubleArray[i];
        }
        for (int i = 0; i < doubleArray.length; i++)
            doubleArray[i] /= largest;
        return doubleArray;
    }

}
