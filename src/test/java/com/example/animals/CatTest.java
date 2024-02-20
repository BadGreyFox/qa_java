package com.example.animals;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    private final Cat cat = new Cat(new Feline());
    @Test
    public void checkGetSoundCat(){
        assertEquals("Кошка должна мяукать", "Мяу" , cat.getSound());
    }
    @Test
    public void checkGetFoodCat() throws Exception {
        assertEquals("Ожидается лист с:\n Животные, Птицы, Рыба",
                List.of("Животные", "Птицы", "Рыба"),
                cat.getFood());
    }
}
