package com.example.studyblog.domain;

import com.example.studyblog.repository.HeartRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Post extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id", nullable = false)
    protected Member member;

    @Builder
    public Post(Long id, String title, String content, Member member){
        this.id = id;
        this.title = title;
        this.content = content;
        this.member = member;
    }

}
