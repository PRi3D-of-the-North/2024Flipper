package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Wrist extends SubsystemBase {
  private DoubleSolenoid pistons = new DoubleSolenoid(PneumaticsModuleType.REVPH, Constants.WRIST_FORWARD, Constants.WRIST_REVERSE);

  public Wrist() {
  }

  @Override
  public void periodic() {
  }

  public void setPistonsState(boolean up) {
    if (up) {
      pistons.set(Value.kReverse);
    } else {
      pistons.set(Value.kForward);
    }
  }
}
