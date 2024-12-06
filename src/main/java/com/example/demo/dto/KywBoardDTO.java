package com.example.demo.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class KywBoardDTO {

    private Long num;  // pk

    private String title;  // 글제목

    private String content; // 글내용

    private String writer;  // 작성자

    private LocalDateTime localDateTime; // 작성날짜

}
