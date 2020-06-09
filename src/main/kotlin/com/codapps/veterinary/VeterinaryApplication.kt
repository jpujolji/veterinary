package com.codapps.veterinary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VeterinaryApplication

fun main(args: Array<String>) {
	runApplication<VeterinaryApplication>(*args)
}
