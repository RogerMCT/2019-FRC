/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Vision_SubSystem.LEDState;

public class c_driveTrain_TeleOpMode extends Command {
  
  public c_driveTrain_TeleOpMode() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
    Robot.vision.setLED(LEDState.Off);
  }

  @Override
  protected void execute() {
    Robot.driveTrain.mecanumDrive();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
    end();
  }
}
