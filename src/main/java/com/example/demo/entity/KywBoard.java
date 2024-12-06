package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class KywBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;  // pk

    private String title;  // 글제목

    private String content; // 글내용

    private String writer;  // 작성자

    private LocalDateTime localDateTime; // 작성날짜


}
