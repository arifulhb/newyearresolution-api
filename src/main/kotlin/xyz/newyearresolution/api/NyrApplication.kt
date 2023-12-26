package xyz.newyearresolution.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NyrApplication

fun main(args: Array<String>) {
	runApplication<NyrApplication>(*args)
}
