package com.godo.spring.boardproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter // user 필드값의 getter를 자동으로 생성합니다.
@NoArgsConstructor // 인자없는 생성자를 자동으로 생성합니다.
@AllArgsConstructor // 인자를 모두 갖춘 생성자를 자동으로 생성
@Entity
@Table(name = "Board")
public class Board {
    @Id // primaryKey
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO) //  pk생성전략을 DB에 위임한다는 의미입니다. mysql의 경우 pk 필드를 auto_increment로 설정
    private int id;
    @Column(nullable = false, unique = true, length = 255) // 필수이고 유니크한 필드이며 길이는 255
    private String boardName;
    @CreationTimestamp
    @Column(nullable = false) // name column을 명시합니다. 필수이고 길이는 100입니다.
    private LocalDateTime createdDate;
    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedDate;
}