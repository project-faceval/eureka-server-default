package com.chardon.eurekaserverdefault

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class EurekaServerDefaultApplication

fun main(args: Array<String>) {
    runApplication<EurekaServerDefaultApplication>(*args)
}
