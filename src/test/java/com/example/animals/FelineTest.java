package com.example.animals;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void checkGetFamilyForFeline(){
        assertEquals("Feline - это семейство кошачьих", "Кошачьи", feline.getFamily());
    }
    @Test
    public void checkFoodForFeline() throws Exception {
        assertEquals("Кошачьи должны есть мясо", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
    @Test
    public void checkGetKittensWithoutParams (){
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
    @Test
    public void checkGetKittensWithParams (){
        //420 котят - рекордное число котят на данный момент, которых смогла родить одна кошка
        int randomNumberOfKittens = 1 + (int) (Math.random() * (420));
        assertEquals("Количество котят не совпадает с ожидаемым", randomNumberOfKittens, feline.getKittens(randomNumberOfKittens));
    }
}
