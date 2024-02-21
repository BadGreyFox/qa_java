package com.example.animals;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = mock(Feline.class);
    Cat cat = new Cat(feline);
    @Test
    public void checkGetSoundCat(){
        assertEquals("Кошка должна мяукать", "Мяу", cat.getSound());
    }
    @Test
    public void checkGetFoodCat() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Ожидается лист с:\n Животные, Птицы, Рыба",
                List.of("Животные", "Птицы", "Рыба"),
                cat.getFood());
    }
}
