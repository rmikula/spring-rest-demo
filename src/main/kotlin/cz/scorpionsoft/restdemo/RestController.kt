package cz.scorpionsoft.restdemo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class RestController {

    companion object {
        val logger: Logger = LoggerFactory.getLogger(RestController::class.java)
    }

    val personList = arrayListOf(Person(name = "Roman", age = 30), Person(name = "Monika", age = 30), Person(name = "Tereza", age = 30))

    @GetMapping("/")
    // @RequestMapping("/")
    fun getAppInfo() : AppInfo {
        return AppInfo
    }

    @GetMapping("/persons")
    fun getActualPerson(): List<Person> {
        logger.info("Accessing to get...")
        return personList
    }
}