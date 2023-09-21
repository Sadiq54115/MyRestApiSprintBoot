package com.example.MyRestApi.service

import com.example.MyRestApi.model.User
import com.example.MyRestApi.repository.UserRepo
import org.bson.types.ObjectId
import org.springframework.stereotype.Service


@Service
class UserService(val userRepo: UserRepo) {


    fun getAllUser() :List<User> = userRepo.findAll()

    fun addtUser(user: User):User {

       return userRepo.insert(user)
    }
}