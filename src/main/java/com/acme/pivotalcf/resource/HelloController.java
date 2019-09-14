package com.acme.pivotalcf.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/{name}")
    public String index(@PathVariable("name") String name){
        return "Hello " + name;
    }

}
