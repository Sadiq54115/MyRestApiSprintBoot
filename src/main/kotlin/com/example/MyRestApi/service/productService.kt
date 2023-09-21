package com.example.MyRestApi.service

import com.example.MyRestApi.model.Product
import com.example.MyRestApi.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service


@Service
class productService(@Autowired val productRepository: ProductRepository) {

    fun addProduct(product: Product): Product = productRepository.insert(product)

    fun delectProcduct(id: String) = productRepository.deleteById(id)

    fun getAllProduct(): MutableList<Product> = productRepository.findAll()

    fun update(product: Product) {
        val savedProduct: Product =
            productRepository.findById(product.productTitle)
                .orElseThrow { throw RuntimeException("Cannot find Expense by ID") }
        savedProduct.productId = product.productId
        savedProduct.productTitle = product.productTitle
        savedProduct.productPrice = product.productPrice
        savedProduct.description = product.description
        savedProduct.productImage = product.productImage
        savedProduct.createdDate = product.createdDate
        savedProduct.modifiedDate = product.modifiedDate
        productRepository.save(savedProduct)
    }

    fun getProductByid(id: String) = productRepository.findById(id).get()




}


