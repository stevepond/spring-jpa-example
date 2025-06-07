package com.example.demo

import jakarta.persistence.*

@Entity
class Author(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String
) {
    @OneToMany(mappedBy = "author", cascade = [CascadeType.ALL], orphanRemoval = true)
    val books: MutableList<Book> = mutableListOf()
}
