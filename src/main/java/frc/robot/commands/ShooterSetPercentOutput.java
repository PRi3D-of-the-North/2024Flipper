package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShooterSetPercentOutput extends Command {
  private final Shooter mShooter;
  private final double mTopPercentOutput;
  private final double mBottomPercentOutput;

  public ShooterSetPercentOutput(Shooter shooter, double topPercentOutput, double bottomPercentOutput) {
    mShooter = shooter;
    mTopPercentOutput = topPercentOutput;
    mBottomPercentOutput = bottomPercentOutput;

    addRequirements(mShooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mShooter.setPercentOutput(mTopPercentOutput, mBottomPercentOutput);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}