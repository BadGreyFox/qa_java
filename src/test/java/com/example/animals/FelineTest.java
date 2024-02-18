package com.example.animals;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;
    @Mock
    private Feline felineMock;

    @Test
    public void checkGetFamilyForFeline(){
        Mockito.when(felineMock.getFamily()).thenReturn("Кошачьи");
        assertEquals("Feline - это семейство кошачьих", felineMock.getFamily(), feline.getFamily());
    }
    @Test
    public void checkFoodForFeline() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(
                List.of("Животные", "Птицы", "Рыба")
        );
        assertEquals("Кошачьи должны есть мясо", felineMock.eatMeat(), feline.eatMeat());
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
        Mockito.when(felineMock.getKittens()).thenReturn(randomNumberOfKittens);
        assertEquals("Количество котят не совпадает с ожидаемым", felineMock.getKittens(), feline.getKittens(randomNumberOfKittens));
    }
}
