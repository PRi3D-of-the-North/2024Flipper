package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  private final CANSparkMax mTopMotor = new CANSparkMax(Constants.SHOOTER_TOP, MotorType.kBrushed);
  private final CANSparkMax mBottomMotor = new CANSparkMax(Constants.SHOOTER_BOTTOM, MotorType.kBrushed);

  public Shooter() {
    mTopMotor.restoreFactoryDefaults();
    mBottomMotor.restoreFactoryDefaults();

    mTopMotor.setInverted(true);
    mBottomMotor.setInverted(true);
    mTopMotor.setIdleMode(IdleMode.kBrake);
    mBottomMotor.setIdleMode(IdleMode.kBrake);
    mTopMotor.setSmartCurrentLimit(40);
    mBottomMotor.setSmartCurrentLimit(40);
  }

  @Override
  public void periodic() {
  }

  public void setPercentOutput(double topPercentOutput, double bottomPercentOutput) {
    mTopMotor.set(topPercentOutput);
    mBottomMotor.set(bottomPercentOutput);
  }
}