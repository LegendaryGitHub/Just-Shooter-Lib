public class ShooterObject {
  /** Stores important information for the max and min of the RPM and Angle of the shooter */
  private class ShooterInfo {
    public double maxRPM;
    public double minRPM; 
    public double maxAngle;
    public double minAngle;
    public double wheelRadius;
  }
  /** This is where the velocity is stored for the Note, inital velocity for now (temp) */
  private class ObjectInfo {
    public double objectVelocity;
    public double fudging;
    public double drag;
  }
  /*** */
  private class TargetInfo {
    public double hortizonalDistance;
    public double height;
    public double approach; 
    //above or below the target
    public double aboveOrBelow;
  }
  //temp
  public double angle = 22.0;
  // This where the inital velocitys will be stored over the x and y axis
  public double v0 = 1000.0;
  public double v0x = v0 * Math.cos(angle/180.0*Math.PI);
  public double v0y = v0 * Math.sin(angle/180.0*Math.PI);

  // Gravity 
  public final double gravity = 9.8; //Units in m/s^2

  //Time distance for horizonatal
  public double td = (2.0 * v0 * Math.sin(angle/180.0*Math.PI))/Math.abs(gravity);

  //Time distance for max height
  public double th = (v0 * Math.sin(angle/180.0*Math.PI))/Math.abs(gravity);

  // Checks the total distance the object can go
  public double totalDistance;

  // Checks the max height the object will reach
  public double maxHeight = v0y * th * - (0.5 * gravity * Math.pow(gravity, 2));

  // Checks where we will vertically reach the max height
  public double xPositionAtMaxHeight;

  //This will be a future value supplied by LL for the dx distance
//   private double visionDistanceTester = 0;

  /** Creates a new ShooterObject. */
  public ShooterObject() {

  }
  /**
   * This will return the hortizonal distance that the game object will travel
   * @param currentAngle
   * @return the total hortizonal distance the game object will go
   */
  public double distancehorizontal(){
    totalDistance = v0x * td;
    return totalDistance;
  }
  /**
   * This will return the maximum height that the object will reach
   * @param currentAngle
   * @return the max height the object will reach
   */
  public double maxHeight() {
    maxHeight = v0y * th - (0.5 * Math.abs(gravity) * (Math.pow(th,2)));
    return maxHeight;
  }
  /***
   * This will return the vertical distance it takes to reach the max height
   * Note: For future use this will take in the current angle be needed to be done earlier
   * @param currentAngle
   * @return
   */
  public double xPositionAtMaxHeight() {
    xPositionAtMaxHeight = v0x * th;
    return xPositionAtMaxHeight;
  }
  // This will return if we can make the shot or not
//   public boolean willItMakeIt() {
//     if (verticalDistanceMaxHeight )
//   }
  

  // public double
    //one rpm is one circufurance of the object spin
    //radius by 2pi 
    //figure out the intial velocity and distance from object, factor in the height to if it will make it
    //By finding the max height on the curve then adding in the height of the shooter


    //TODO:
    //Take some time and learn some physics 
    //How to anazylisis and solve this problem, maybe look at some formula to this but this will cause some learn term problems
    //Review to vectors!
}
