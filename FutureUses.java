//TODO: This is stuff that will be used in the future!
public class FutureUses {
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
}
