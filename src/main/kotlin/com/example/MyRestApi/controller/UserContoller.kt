package com.example.MyRestApi.controller

import com.example.MyRestApi.model.User
import com.example.MyRestApi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/product")
class UserContoller(val userService: UserService) {


    @GetMapping("/user")
    fun getAlluser(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getAllUser())
    }


    @PostMapping
    fun addUser(@RequestBody user: User): ResponseEntity<String> {
        userService.addtUser(user)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

}