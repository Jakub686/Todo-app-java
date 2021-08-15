package com.in28minutes.rest.webservoces.restfulwebservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello World"
    @GetMapping(path ="/hello-world")
    public String helloWorld(){
        return "Hello world";
    }
}


    //hello-world-bean
    @GetMapping(path ="/hello-world-bean")
    public String helloWorldBean(){
        return new HelloWorldBean("Hello world");
    }
}
