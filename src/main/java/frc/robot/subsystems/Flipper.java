package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Flipper extends SubsystemBase {
  private DoubleSolenoid piston = new DoubleSolenoid(PneumaticsModuleType.REVPH, Constants.FLIPPER_FORWARD, Constants.FLIPPER_REVERSE);

  public Flipper() {
  }

  @Override
  public void periodic() {
  }

  public void setPistonState(boolean up) {
    if (up) {
      piston.set(Value.kForward);
    } else {
      piston.set(Value.kReverse);
    }
  }
}
