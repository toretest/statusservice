package net.toregard.statusservice.endpoints.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Statusesource {

      @GetMapping("/modelversion")
    fun getModellVersion(): Response{
        return Response(listOf("1","2"))
    }
}
