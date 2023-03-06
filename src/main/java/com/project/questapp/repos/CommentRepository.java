package com.project.questapp.repos;

import com.project.questapp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository <Comment,Long> {

}
