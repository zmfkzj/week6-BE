package com.example.studyblog.domain;

import com.example.studyblog.repository.HeartRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Post extends TimeAndMember{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;

    @Builder
    public Post(Long id, String title, String content, Member member){
        this.id = id;
        this.title = title;
        this.content = content;
        this.member = member;
    }

}
