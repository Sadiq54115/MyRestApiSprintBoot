package com.example.MyRestApi.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Product(
    @Id
    var productId: ObjectId = ObjectId.get(),
    var productTitle: String,
    var productPrice:String,
    var description: String,
    var productImage:String,
    var createdDate: LocalDateTime = LocalDateTime.now(),
    var modifiedDate: LocalDateTime = LocalDateTime.now()
)
