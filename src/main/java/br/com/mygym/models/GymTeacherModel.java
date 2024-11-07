package br.com.mygym.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "tb_gym_teacher")
public class GymTeacherModel {

    @Id
    @Column(name = "gym_teacher_cpf")
    private String cpf;

    @Column(name = "gym_teacher_name")
    private String name;

    @Column(name = "gym_teacher_gender")
    private String gender;

    @Column(name = "gym_teacher_birth_date")
    private LocalDate birthDate;

    private List<TrainingSheetModel>

}
