package com.example.vanekweb.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Employees")
public class EmployeeEntity extends AbstractUserClass {
    @OneToMany(cascade = CascadeType.REMOVE,
            mappedBy = "employee",
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<OrderEntity> orders;

}
