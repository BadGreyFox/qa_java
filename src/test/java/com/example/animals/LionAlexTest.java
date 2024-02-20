package com.example.animals;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class LionAlexTest {
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