package com.samdownton;

/**
 * Created by samuel.downton on 15/04/2016.
 */
import org.springframework.stereotype.Component;

@Component
public class EvenFountain  implements Fountain{
    private int next = 0;
    @Override
    public int nextInt() {
        next += 2;
        return next;
    }

    @Override
    public String toString() {
        return String.format("EvenFountain next=%d", next);
    }
}
