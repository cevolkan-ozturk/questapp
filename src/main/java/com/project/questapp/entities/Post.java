package com.project.questapp.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="post")
@Data
public class Post {

    @Id
    Long id;
    Long userId;
    String title;

    //Hibernatin Mysqlde String'i text olarak algılanması için yapıldı yoksa varchar(255) olarak alıyor.
    @Lob
    @Column(columnDefinition = "text")
    String text;

}
