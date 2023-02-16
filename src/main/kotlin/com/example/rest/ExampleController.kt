package com.example.rest

import com.example.mapper.ExampleMapper
import com.example.model.Example
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleController {

    @Inject
    private lateinit var exampleMapper: ExampleMapper

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        exampleMapper.insert(Example())
        return "ok"
    }
}