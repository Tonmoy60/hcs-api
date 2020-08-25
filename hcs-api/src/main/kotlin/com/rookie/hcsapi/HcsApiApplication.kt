package com.rookie.hcsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HcsApiApplication

fun main(args: Array<String>) {
	runApplication<HcsApiApplication>(*args)
}
