package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Wrist;

public class WristSetState extends Command {
  private final Wrist mWrist;
  private final boolean mIsUp;

  public WristSetState(Wrist wrist, boolean isUp) {
    mWrist = wrist;
    mIsUp = isUp;

    addRequirements(mWrist);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    mWrist.setPistonsState(mIsUp);
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
