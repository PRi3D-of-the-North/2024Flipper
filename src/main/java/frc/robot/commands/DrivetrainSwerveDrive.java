package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drivetrain;

public class DrivetrainSwerveDrive extends Command {
  Drivetrain mDrivetrain;
  CommandXboxController mXbox;
  
  public DrivetrainSwerveDrive(Drivetrain drivetrain, CommandXboxController xbox) {
    mDrivetrain = drivetrain;
    mXbox = xbox;

    addRequirements(mDrivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

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
