package com.codapps.veterinary.controller

import com.codapps.veterinary.model.User
import com.codapps.veterinary.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/users"])
class UserController(private val userService: UserService) {

    @GetMapping
    fun findAll(): ResponseEntity<MutableList<User>> {
        val response = userService.findAll()
        return ResponseEntity.ok(response)
    }

}