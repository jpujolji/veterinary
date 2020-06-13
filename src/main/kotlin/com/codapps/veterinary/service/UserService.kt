package com.codapps.veterinary.service

import com.codapps.veterinary.model.User
import com.codapps.veterinary.repository.UserRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class UserService(private val userRepository: UserRepository) {

    fun findAll(): MutableList<User> {
        return userRepository.findAll()
    }

}