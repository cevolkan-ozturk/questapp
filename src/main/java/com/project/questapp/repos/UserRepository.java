package com.project.questapp.repos;

import com.project.questapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{

}
