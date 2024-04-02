public class ShooterObject {
  /*** The current angle of the shooter will be stored */
  public double angle;
  /*** The gravity factor, the units are in m/s^2 */ 
  public final double gravity = 9.8;

  // This where the inital velocitys will be stored over the x and y axis
  public double v0;
  public double v0x;
  public double v0y;

  /*** Time distance for horizonatal */
  public double td;

  /*** Time distance for max height */
  public double th;

  /*** Checks the total distance the object can go */
  public double totalDistance;

  /*** Checks the max height the object will reach */
  public double maxHeight;

  /*** Checks where we will vertically reach the max height */
  public double xPositionAtMaxHeight;

  /*** Creates a new ShooterObject. */
  public ShooterObject(double angle, double v0) {
    //THis is the angle calculations
    this.angle = angle;
    td = (2.0 * v0 * Math.sin(angle/180.0*Math.PI))/Math.abs(gravity);
    th = (v0 * Math.sin(angle/180.0*Math.PI))/Math.abs(gravity);
    maxHeight = v0y * th * - (0.5 * gravity * Math.pow(gravity, 2));
    //This is the velocity calculations
    this.v0 = v0;
    v0x = v0 * Math.cos(angle/180.0*Math.PI);
    v0y = v0 * Math.sin(angle/180.0*Math.PI);
  }
  /***
   * This will return the hortizonal distance that the game object will travel
   * @return the total hortizonal distance the game object will go
   */
  public double distancehorizontal(){
    totalDistance = v0x * td;
    return totalDistance;
  }
  /***
   * This will return the maximum height that the object will reach
   * @return the max height the object will reach
   */
  public double maxHeight() {
    maxHeight = v0y * th - (0.5 * Math.abs(gravity) * (Math.pow(th,2)));
    return maxHeight;
  }
  /***
   * This will return the vertical distance it takes to reach the max height
   * @return vertical distance it takes to reach the max height
   */
  public double xPositionAtMaxHeight() {
    xPositionAtMaxHeight = v0x * th;
    return xPositionAtMaxHeight;
  }
}
