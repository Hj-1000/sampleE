package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class HKBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;            //거래처 코드 앞에서 와 같이 할것

    private String title;
    private String content;
    private String writer;
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regTime;

}
