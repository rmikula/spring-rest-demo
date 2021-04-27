package cz.scorpionsoft.restdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestdemoApplication

fun main(args: Array<String>) {
	runApplication<RestdemoApplication>(*args)
}
