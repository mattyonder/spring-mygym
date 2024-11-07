package br.com.mygym.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_plan")
public class PlanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private short id;

    @Column(name = "plan_name")
    private String name;

    @Column(name = "plan_description")
    private String description;

    @Column(name = "plan_price")
    private Double price;

    @OneToMany(mappedBy =  "chosenPlan", cascade = CascadeType.MERGE)
    @Column(name = "plan_users_in_plan")
    private List<UserModel> usersInPlane;


}
