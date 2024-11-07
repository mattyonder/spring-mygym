package br.com.mygym.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "tb_admin")
public class AdminModel {

    @Id
    @Column(name = "admin_cpf")
    private String cpf;

    @Column(name = "admin_name")
    private String name;

    @Column(name = "admin_gender")
    private String gender;

    @Column(name = "admin_birth_date")
    private LocalDate birthDate;
}
