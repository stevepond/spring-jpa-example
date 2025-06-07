package com.example.demo

import jakarta.persistence.*

@Entity
class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val title: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    val author: Author
)
