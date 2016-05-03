package com.samdownton;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by samuel.downton on 18/04/2016.
 */
@Component
public class RandomWord {
    public static String importWords() throws Exception {
        ArrayList<String> output = new ArrayList<>();

        BufferedReader in = new BufferedReader(new FileReader("c:\\temp\\corncob_lowercase.txt"));
        String str;
        Random r = new Random();
        while ((str = in.readLine()) != null) {
            output.add(str);
        }
        int rand = r.nextInt(output.size());
        return output.get(rand);
    }
}
