public class Home {
    public static ShooterObject shooterObject = new ShooterObject(23, 1000, 3.0);
    public static void main(String[] args) {
        // System.out.println(shooterObject.v0y);
        // System.out.println(shooterObject.th);
        // System.out.println("Vertical Reach Max Height" + shooterObject.xPositionAtMaxHeight());

        // System.out.println("When the object will reach the max height it's location on the x-axis: " + shooterObject.xPositionAtMaxHeight());

        // System.out.println("The max height the object will reach: " + shooterObject.distancehorizontal());

        // System.out.println("v0x: " + shooterObject.v0x);
        // System.out.println("td: " + shooterObject.td);
        // System.out.println("Check the Horizontal Distance" + shooterObject.distancehorizontal());
        
        System.out.println("targetRPM: " + shooterObject.targetRPM(7.0, 0.5));

    }
}
