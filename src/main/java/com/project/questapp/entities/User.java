package com.project.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="user")
@Data

public class User {
    @Id
    Long id;

    String userName;
    String password;


}
