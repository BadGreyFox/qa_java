package com.example.animals;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    private final Feline feline = mock(Feline.class);
    private final LionAlex lionAlex = new LionAlex(feline);

    public LionAlexTest() throws Exception {
    }

    @Test
    public void getKittens() {
        assertEquals("У Алекса нет котят", 0, lionAlex.getKittens());
    }

    @Test
    public void getFriends() {
        assertEquals("У Алекса есть друзья: Марти, Глория и Мелман",
                List.of("Марти", "Глория", "Мелман"),
                lionAlex.getFriends());
    }
    @Test
    public void getPlaceOfLiving() {
        assertEquals("Алекс живет в Нью-Йоркском зоопарке", "Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}