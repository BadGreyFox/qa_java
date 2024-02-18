package com.example.animals;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Cat catMock;
    private final Cat cat = new Cat(new Feline());
    @Test
    public void checkGetSoundCat(){
        Mockito.when(catMock.getSound()).thenReturn("Мяу");
        assertEquals("Кошка должна мяукать", catMock.getSound() , cat.getSound());
    }
    @Test
    public void checkGetFoodCat() throws Exception {
        Mockito.when(catMock.getFood()).thenReturn(
                List.of("Животные", "Птицы", "Рыба")
        );
        assertEquals("Ожидается лист с:\n Животные, Птицы, Рыба", catMock.getFood() , cat.getFood());
    }
}
