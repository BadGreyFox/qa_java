package com.example.animals;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final Feline feline = mock(Feline.class);
    private final Lion lion;

    public LionTest() throws Exception {
        this.lion = new Lion("Самец", feline);
    }

    @Test
    public void checkGetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals("Должен быть только один котенок", 1, lion.getKittens());
    }
    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Кошачьи едят: Животные, Птицы, Рыба",
                List.of("Животные", "Птицы", "Рыба"),
                lion.getFood());
    }
}
