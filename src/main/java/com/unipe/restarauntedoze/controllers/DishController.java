package com.unipe.restarauntedoze.controllers;

import com.unipe.restarauntedoze.models.requests.TestRequest;
import com.unipe.restarauntedoze.models.responses.TestResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class DishController {

    @RequestMapping(value = "/dishes", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)

    private TestResponse getDishes() {
        TestResponse teste = new TestResponse();
        teste.setMessage("Todos os pratos carregados!");
        return teste;
    }

    @RequestMapping(value = "/dishes", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    private TestResponse createDish(@RequestBody TestRequest request) {
        TestResponse teste = new TestResponse();
        teste.setMessage("Prato criado! " + request.getMessage());
        return teste;
    }

    @RequestMapping(value = "/dishes/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    private TestResponse editDish(@PathVariable("id") int id) {
        TestResponse teste = new TestResponse();
        teste.setMessage("Prato editado! " + id);
        return teste;
    }

    @RequestMapping(value = "/dishes/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
    private TestResponse deleteDish(@PathVariable("id") int id) {
        TestResponse teste = new TestResponse();
        teste.setMessage("Prato deletado! " + id);
        return teste;
    }



}
