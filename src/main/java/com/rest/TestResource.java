package com.rest;

import org.springframework.web.bind.annotation.*;

/**
 * Created by catal on 3/20/2018
 */

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class TestResource {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

}
