package frc.robot.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climber extends SubsystemBase {
  private final TalonFX mClimberLeft = new TalonFX(Constants.CLIMBER_LEFT, "rio");
  private final TalonFX mClimberRight = new TalonFX(Constants.CLIMBER_RIGHT, "rio");

  public Climber() {
    mClimberLeft.getConfigurator().apply(new TalonFXConfiguration());
    mClimberRight.getConfigurator().apply(new TalonFXConfiguration());
    mClimberLeft.setInverted(false);
    mClimberRight.setInverted(false);
    mClimberLeft.setNeutralMode(NeutralModeValue.Brake);
    mClimberRight.setNeutralMode(NeutralModeValue.Brake);
  }

  @Override
  public void periodic() {
  }

  public void setPercentOutput(double percentOutput) {
    mClimberLeft.set(percentOutput);
    mClimberRight.set(percentOutput);
  }
}