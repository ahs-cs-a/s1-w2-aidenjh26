public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, int d, int p, boolean s){
        name = n;
        largestDiameter = d;
        avgDepth = p;
        isSaltWater = s;
        System.out.println("My name is: " + name);
        System.out.println("The largest diameter is: " + largestDiameter);
        System.out.println("The average Depth is: " + avgDepth);
        if (isSaltWater) {
            System.out.println("The water is salty.");
        } else {
            System.out.println("The water is not salty.");
        }
    }
}