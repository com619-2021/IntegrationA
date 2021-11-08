package uk.ca.solent.devops.stevedore.controller.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ca.solent.devops.stevedore.model.TestModel;
import uk.ca.solent.devops.stevedore.service.TestService;

import java.util.List;

public class DummyRestController {

    private final TestService testService;

    public DummyRestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    List<TestModel> getHome() {
        return testService.getAllTest();
    }

    //output to localhost:8080/test
    @RequestMapping("/test")
    public String testOutput(){
        return "Hello World";
    }
}
