package com.example.animals;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionConstructorNegativeTest {
    @Test(expected = Exception.class)
    public void constructorThrowsExceptionOnUnsupportedSex() throws Exception {
        new Lion("Нечто", new Feline());
    }
}
