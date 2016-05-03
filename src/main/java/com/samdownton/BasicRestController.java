package com.samdownton;

/**
 * Created by samuel.downton on 15/04/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicRestController {
    @RequestMapping("/start")
    String start() {
        return "REST service started";
    }
    @RequestMapping("/upper/{value}")
    String upper(@PathVariable String value) {
        return value.toUpperCase();
    }
    @RequestMapping("/random")
    int random(){
        Random r = new Random();
        return r.nextInt(1000);
    }
    @RequestMapping("/hello")
    String hello(@RequestParam(value="name", defaultValue= "world") String name){
        return "Hello " + name;
    }
    @RequestMapping("/randomword")
    String randomWord() throws Exception{
        return RandomWord.importWords();
    }
}
