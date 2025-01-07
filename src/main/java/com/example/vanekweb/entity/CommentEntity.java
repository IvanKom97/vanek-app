package com.example.vanekweb.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "comments")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @ManyToOne()
    @JoinColumn(name = "order_id")
    private OrderEntity order;
}
