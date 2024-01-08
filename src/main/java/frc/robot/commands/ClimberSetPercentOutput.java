package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Climber;

public class ClimberSetPercentOutput extends Command {
  private final Climber mClimber;
  private final double mPercentOutput;

  public ClimberSetPercentOutput(Climber climber, double percentOutput) {
    mClimber = climber;
    mPercentOutput = percentOutput;

    addRequirements(mClimber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mClimber.setPercentOutput(mPercentOutput);
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