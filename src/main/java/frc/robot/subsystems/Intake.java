package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  private final CANSparkMax mMotor = new CANSparkMax(Constants.INTAKE, MotorType.kBrushless);

  public Intake() {
    mMotor.restoreFactoryDefaults();
    mMotor.setInverted(false);
    mMotor.setIdleMode(IdleMode.kBrake);
    mMotor.setSmartCurrentLimit(40);

    mMotor.burnFlash();
  }

  @Override
  public void periodic() {
  }

  public void setPercentOutput(double percentOutput) {
    mMotor.set(percentOutput);
  }
}
