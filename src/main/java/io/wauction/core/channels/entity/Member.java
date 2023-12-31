package io.wauction.core.channels.entity;

import jakarta.persistence.*;

@Entity
public class Member extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(columnDefinition = "TINYINT(1)")
    private char deleted;
}
