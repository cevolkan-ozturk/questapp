package com.project.questapp.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="comment")
@Data


public class Comment {

    @Id
    Long id;
    Long postId;
    Long userId;

    //Hibernatin Mysqlde String'i text olarak algılanması için yapıldı yoksa varchar(255) olarak alıyor.
    @Lob
    @Column(columnDefinition = "text")
    String text;

}
