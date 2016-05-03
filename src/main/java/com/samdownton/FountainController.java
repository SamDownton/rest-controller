package com.samdownton;

/**
 * Created by samuel.downton on 15/04/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fountain")
public class FountainController {
    @Autowired
    private Fountain fountain;

    @RequestMapping("/list/{n}")
    List<Integer> list(@PathVariable int n) {
        List<Integer> list = new ArrayList<>(n);
        while (list.size() < n) {
            list.add(fountain.nextInt());
        }
        return list;
    }

}
