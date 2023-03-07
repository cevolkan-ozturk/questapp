package com.project.questapp.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="post")
@Data
public class Post {

    @Id
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    User user ;


    String title;

    //Hibernatin Mysqlde String'i text olarak algılanması için yapıldı yoksa varchar(255) olarak alıyor.
    @Lob
    @Column(columnDefinition = "text")
    String text;

}
