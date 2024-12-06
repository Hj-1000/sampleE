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
public class JhBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;            //거래처 코드 앞에서 와 같이 할것

    private String content;

    private String name;

    private LocalDateTime datetime;
}
