package com.efighter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EFighterApplication

fun main(args: Array<String>) {
    runApplication<EFighterApplication>(*args)
}
