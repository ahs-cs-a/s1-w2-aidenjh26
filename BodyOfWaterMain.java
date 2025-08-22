public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake Superior", 1848000, 483, false);
        BodyOfWater b2 = new BodyOfWater("Caspian Sea", 690);
        b.printState();
        b2.printState();
        b2.setName("Fake Sea");
        b2.printState();
    }
}
