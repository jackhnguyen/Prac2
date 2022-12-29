// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.revrobotic.CANSparkMax.LowLevel.MotorType;
import com.revrobotic.CANSparkMax;
import com.revrobotics.RelativeEncoders;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Elevator() {
    public RelativeEncoders m_encoder;
    public CANSparkMax ElevatorMotor = new CANSparkMax(1, MotorType.kBlushless);

    public void InitializeEncoders(){
      m_encoder = ElevatorMotor.getEncoder();
      m_encoder.setPosition(0);
    }
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
