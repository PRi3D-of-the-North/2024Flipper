package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.ClimberSetPercentOutput;
import frc.robot.commands.DrivetrainSwerveDrive;
import frc.robot.commands.FlipperSetState;
import frc.robot.commands.IntakeSetPercentOutput;
import frc.robot.commands.ShooterSetPercentOutput;
import frc.robot.commands.WristSetState;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Flipper;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Wrist;

public class RobotContainer {
  private final CommandXboxController mXbox = new CommandXboxController(0);
  
  private final Climber mClimber = new Climber();
  private final Drivetrain mDrivetrain = new Drivetrain();
  private final Flipper mFlipper = new Flipper();
  private final Intake mIntake = new Intake();
  private final Shooter mShooter = new Shooter();
  private final Wrist mWrist = new Wrist();

  public RobotContainer() {
    mClimber.setDefaultCommand(new ClimberSetPercentOutput(mClimber, 0.0));
    mDrivetrain.setDefaultCommand(new DrivetrainSwerveDrive(mDrivetrain, mXbox)); // Uses both sticks and left bumper
    mFlipper.setDefaultCommand(new FlipperSetState(mFlipper, true));
    mIntake.setDefaultCommand(new IntakeSetPercentOutput(mIntake, 0.0));
    mShooter.setDefaultCommand(new ShooterSetPercentOutput(mShooter, 0.0));
    mWrist.setDefaultCommand(new WristSetState(mWrist, true));

    configureButtonBindings();

    UsbCamera cam0 = CameraServer.startAutomaticCapture(0);
		cam0.setResolution(320, 240);
    cam0.setFPS(10);
  }

  private void configureButtonBindings() {
    mXbox.b().whileTrue(new ShooterSetPercentOutput(mShooter, 1.0));
    mXbox.x().whileTrue(new ShooterSetPercentOutput(mShooter, -1.0));

    mXbox.start().onTrue(new InstantCommand(() -> mDrivetrain.zeroHeading()));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}