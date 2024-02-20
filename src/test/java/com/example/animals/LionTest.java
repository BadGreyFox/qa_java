package com.example.animals;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    private final Lion lion;

    public LionTest() throws Exception {
            this.lion = new Lion("Самец", new Feline());
    }
    @Test
    public void checkGetKittens() {
        assertEquals("позже",1, lion.getKittens());
    }
    @Test
    public void checkGetFood() throws Exception {
        assertEquals("Кошачьи едят: Животные, Птицы, Рыба",
                List.of("Животные", "Птицы", "Рыба"),
                lion.getFood());
    }
}
