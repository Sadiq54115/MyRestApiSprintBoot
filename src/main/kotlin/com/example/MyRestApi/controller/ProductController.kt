package com.example.MyRestApi.controller

import com.example.MyRestApi.model.Product
import com.example.MyRestApi.service.productService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class ProductController(@Autowired val productService: productService) {

    // localhost:8080/api/v1/product/hello
    @GetMapping
    fun testPer(){
        print("Working ")
    }

    @GetMapping
    fun getAllProduct():ResponseEntity<List<Product>> = ResponseEntity.ok(productService.getAllProduct())

    @GetMapping("/{id}")
    fun getProductById(@PathVariable id: String) : ResponseEntity<Product>
            = ResponseEntity.ok(productService.getProductByid(id))

    @PatchMapping("/{id}")
    fun updateProduct(@PathVariable product: Product):ResponseEntity<String>{
        productService.update(product)
        return ResponseEntity(HttpStatus.CREATED)
    }

    @PostMapping
    fun addProduct(@RequestBody product: Product) : ResponseEntity<String>{
    //    expenseService.addExpense(expense)
        productService.addProduct(product)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

    @DeleteMapping("/{id}")
    fun delectProcduct(@PathVariable id:String):ResponseEntity<String> {
        productService.delectProcduct(id)
        return  ResponseEntity(HttpStatus.NO_CONTENT)
    }


}