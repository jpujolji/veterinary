package com.codapps.veterinary.repository

import com.codapps.veterinary.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
    
}