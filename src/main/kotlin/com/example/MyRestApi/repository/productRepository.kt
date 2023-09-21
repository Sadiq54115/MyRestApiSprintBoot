package com.example.MyRestApi.repository

import com.example.MyRestApi.model.Product
import com.example.MyRestApi.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepository : MongoRepository<Product,String> {
}