package com.EmployeeProject.DemoProject.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_Employee")
public class Employee {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
//    @JsonProperty("full_name")
    @Column(name = "name")
    private String name;

//    @JsonIgnore // - Hide Any Sensitive Response

    @Column( name = "age")
    private int age;

    @Column( name = "email")
    private String email;


}
