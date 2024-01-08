package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import frc.robot.tools.COTSTalonFXSwerveConstants;


public final class Constants {
  public static final int CLIMBER_LEFT = 10,
                          CLIMBER_RIGHT = 11,
                          INTAKE = 12,
                          SHOOTER_TOP = 13,
                          SHOOTER_BOTTOM = 14,
                          WRIST = 15;

  public static final int ARM_FORWARD_LIMIT = 0, // DIO
                          ARM_REAR_LIMIT = 1;

  public static final int WRIST_FORWARD = 0, // PH
                          WRIST_REVERSE = 1,
                          FLIPPER_FORWARD = 2,
                          FLIPPER_REVERSE = 3;

  public static final int CANDLE = 20;

  public static final double EPSILON = 0.0001;

  public static final class DrivetrainConstants {
    public static final int FRONT_LEFT_DRIVE = 1, // DRIVETRAIN MOTORS
                          REAR_LEFT_DRIVE = 2,
                          FRONT_RIGHT_DRIVE = 3,
                          REAR_RIGHT_DRIVE = 4,

                          FRONT_LEFT_STEER = 5,
                          REAR_LEFT_STEER = 6,
                          FRONT_RIGHT_STEER = 7,
                          REAR_RIGHT_STEER = 8;

    public static final int FRONT_LEFT_ENCODER = 15, // CANCODERS
                            REAR_LEFT_ENCODER = 16,
                            FRONT_RIGHT_ENCODER = 17,
                            REAR_RIGHT_ENCODER = 18,
                            PIGEON = 19;

    public static final String CANIVORE = "77B239C1394C485320202050132018FF";

    public static final COTSTalonFXSwerveConstants MODULE_TYPE = COTSTalonFXSwerveConstants.SDS.MK4i.Falcon500(COTSTalonFXSwerveConstants.SDS.MK4i.driveRatios.L3);
    public static final double TRACK_WIDTH_METERS = 0.58; // The left-to-right distance between the wheels. Should be measured from center to center
    public static final double WHEELBASE_METERS = 0.5775; // The front-to-back distance between the wheels. Should be measured from center to center

    public static final SwerveDriveKinematics DRIVE_KINEMATICS = new SwerveDriveKinematics(
        new Translation2d(WHEELBASE_METERS / 2, -TRACK_WIDTH_METERS / 2),
        new Translation2d(WHEELBASE_METERS / 2, TRACK_WIDTH_METERS / 2),
        new Translation2d(-WHEELBASE_METERS / 2, -TRACK_WIDTH_METERS / 2),
        new Translation2d(-WHEELBASE_METERS / 2, TRACK_WIDTH_METERS / 2));

    public static double PHYSICAL_MAX_METERS_PER_SECOND = 5.0;

    public static final double FRONT_LEFT_ENCODER_OFFSET = -Math.toRadians(0.0); // Measure and set front left steer offset
    public static final double FRONT_RIGHT_ENCODER_OFFSET = -Math.toRadians(0.0); // Measure and set back left steer offset
    public static final double REAR_LEFT_ENCODER_OFFSET = -Math.toRadians(0.0); // Measure and set front right steer offset
    public static final double REAR_RIGHT_ENCODER_OFFSET = -Math.toRadians(0.0); // Measure and set back right steer offset

    public static final double WHEEL_DIAMETER = 0.1; // In Meters
    public static final double DRIVE_MOTOR_GEAR_RATIO = 1 / 6.12;
    public static final double STEER_MOTOR_GEAR_RATIO = 1 / 21.42857142857143;
    public static final double DRIVE_ENCODER_ROT_TO_METERS = DRIVE_MOTOR_GEAR_RATIO * Math.PI * WHEEL_DIAMETER;
    public static final double STEER_ENCODER_ROT_TO_RADS = STEER_MOTOR_GEAR_RATIO * 2 * Math.PI;
    public static final double DRIVE_ENCODER_RPM_TO_METERS_PER_SEC = DRIVE_ENCODER_ROT_TO_METERS / 60;
    public static final double STEER_ENCODER_RPM_TO_RADS_PER_SEC = STEER_ENCODER_ROT_TO_RADS / 60;
  }
}