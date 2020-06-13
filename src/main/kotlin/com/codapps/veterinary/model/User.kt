package com.codapps.veterinary.model

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Int,

        @Column(name = "name")
        val name: String,

        @Column(name = "phone")
        val phone: String
)