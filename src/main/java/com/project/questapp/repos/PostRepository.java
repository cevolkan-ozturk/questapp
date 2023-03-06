package com.project.questapp.repos;

import com.project.questapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {

}
