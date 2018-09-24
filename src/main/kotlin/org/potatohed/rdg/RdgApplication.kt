package org.potatohed.rdg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RdgApplication

fun main(args: Array<String>) {
    runApplication<RdgApplication>(*args)
}
