package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Intake;

public class IntakeSetPercentOutput extends Command {
  private final Intake mIntake;
  private final double mPercentOutput;

  public IntakeSetPercentOutput(Intake intake, double percentOutput) {
    mIntake = intake;
    mPercentOutput = percentOutput;

    addRequirements(mIntake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mIntake.setPercentOutput(mPercentOutput);
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