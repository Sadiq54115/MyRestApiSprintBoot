package com.example.MyRestApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication
class MyRestApiApplication


fun main(args: Array<String>) {
	runApplication<MyRestApiApplication>(*args)
}
