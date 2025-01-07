package com.example.vanekweb.entity;

import com.example.vanekweb.enums.Roles;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admins")
public class AdminEntity extends AbstractUserClass {

}
