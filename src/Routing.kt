package com.drugapp

import io.ktor.application.call
import io.ktor.client.request.get
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route
import java.net.http.HttpClient
import java.util.*

fun Routing.search(client: io.ktor.client.HttpClient) {
    route("api") {
        get("search") {
            val get = client.get<String>("https://en.wikipedia.org/wiki/Main_Page")
            call.respond(get)
        }

        get("test") {
            call.respond("Test")
        }

        get("a") {
            call.respond("ak")
        }
    }

}