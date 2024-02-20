package com.example.animals;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionConstructorPositiveTest {
    private final boolean expectedDoesHaveMane;
    private final Lion lion;
    public LionConstructorPositiveTest(String lionSex, boolean doesHaveMane) throws Exception {
        this.expectedDoesHaveMane = doesHaveMane;
        this.lion = new Lion(lionSex, new Feline());
    }
    @Parameterized.Parameters(name = "Тестовые данные: пол: {0}; есть ли грива: {1}")
    public static Object[] getNamesForLionTest (){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void checkDoesHaveMane() {
        assertEquals("У самцов есть грива, у самок - нет", this.expectedDoesHaveMane, lion.doesHaveMane());
    }
}
