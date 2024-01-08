package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Flipper;

public class FlipperSetState extends Command {
  private final Flipper mFliper;
  private final boolean mIsUp;

  public FlipperSetState(Flipper flipper, boolean isUp) {
    mFliper = flipper;
    mIsUp = isUp;

    addRequirements(mFliper);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    mFliper.setPistonState(mIsUp);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
