package com.example.animals;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {
    private final String lionSex;
    @Mock
    private Lion lionMock;
    private final Lion lion;

    public LionTest(String lionSex) throws Exception {
            this.lionSex = lionSex;
            this.lion = new Lion(lionSex, new Feline());
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters()
    public static String[] getNamesForLionTest (){
        return new String[]{
                "Самец",
                "Самка"
        };
    }

    @Test
    public void checkGetKittens() {
        Mockito.when(lionMock.getKittens()).thenReturn(1);
        assertEquals("позже",lionMock.getKittens(), lion.getKittens());
    }

    @Test
    public void checkDoesHaveMane() {
        Mockito.when(lionMock.doesHaveMane()).thenReturn(lionSex.equals("Самец"));
        assertEquals("позже", lionMock.doesHaveMane(), lion.doesHaveMane());
    }

    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(lionMock.getFood()).thenReturn(List.of(
                "Животные", "Птицы", "Рыба"
        ));
        assertEquals("позже", lionMock.getFood(), lion.getFood());
    }
    @Test
    public void checkLionException() {
        try {
            new Lion("", new Feline());
        } catch (Exception e){
            assertEquals("Строки ошибок не равны", "Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
