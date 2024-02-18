package com.example.animals;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    private LionAlex alexMock;
    private final LionAlex lionAlex;

    {
        try {
            lionAlex = new LionAlex(new Feline());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void getKittens() {
        Mockito.when(alexMock.getKittens()).thenReturn(0);
        assertEquals("У Алекса нет котят", alexMock.getKittens(), lionAlex.getKittens());
    }

    @Test
    public void getFriends() {
        Mockito.when(alexMock.getFriends()).thenReturn(
                List.of(
                        "Марти",
                        "Глория",
                        "Мелман"
                )
        );
        assertEquals("У Алекса есть друзья: Марти, Глория и Мелман", alexMock.getFriends(), lionAlex.getFriends());
    }
    @Test
    public void getPlaceOfLiving() {
        Mockito.when(alexMock.getPlaceOfLiving()).thenReturn("Нью-Йоркский зоопарк");
        assertEquals("Алекс живет в Нью-Йоркском зоопарке", alexMock.getPlaceOfLiving(), lionAlex.getPlaceOfLiving());
    }
}