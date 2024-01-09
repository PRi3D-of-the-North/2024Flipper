package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;

public class DrivetrainSwerveDrive extends Command {
  private Drivetrain mDrivetrain;
  private CommandXboxController mXbox;

  public DrivetrainSwerveDrive(Drivetrain drivetrain, CommandXboxController xbox) {
    mDrivetrain = drivetrain;
    mXbox = xbox;

    addRequirements(mDrivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /* Get Values, Deadband */
    double translationVal = MathUtil.applyDeadband(mXbox.getLeftY(), 0.15);
    double strafeVal = MathUtil.applyDeadband(mXbox.getLeftX(), 0.15);
    double rotationVal = MathUtil.applyDeadband(mXbox.getRightY(), 0.15);

    /* Drive */
    mDrivetrain.drive(
        new Translation2d(translationVal, strafeVal).times(Constants.Drivetrain.maxSpeed),
        rotationVal * Constants.Drivetrain.maxAngularVelocity,
        !mXbox.leftBumper().getAsBoolean(),
        true);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}