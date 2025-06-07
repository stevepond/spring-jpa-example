package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long>
