package br.com.mygym.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_user")
public class UserModel {

    @Id
    @Column(name = "user_cpf")
    private String cpf;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_gender")
    private String gender;

    @Column(name = "user_birth_date")
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "user_plan_chosen_id")
    private PlanModel chosenPlan;

    @Column(name = "user_monthly_fee_paid_status")
    private boolean isPaid;

    @Column(name = "user_activity_status")
    private boolean isActive;

    private TrainingSheetModel trainingSheet;

    private PhysicalAssessmentModel physicalAssessmentModel;

}
