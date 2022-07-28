package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;
    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"К Я", true}, //Корректная строка, 3 символа
                {"Котани Фудзимоторио", true}, //Корректная строка, 19 символов
                {"Ко", false}, //Некорректная строка, 3 символа
                {"Котани Фудзимоторико", false}, //Некорректная строка, 20 символов
                {"КотаниЯмада", false}, //Некорректная строка без пробела
                {"Котани Яма да", false}, //Некорректная строка с двумя пробелами
                {" Котани Ямада", false}, //Некорректная строка с пробелом в начале
                {"Котани Ямада ", false}, //Некорректная строка с пробелом в конце
                {null, false} //null вместо строки
        };
    }

    @Test
    public void testCheckNameToEmboss() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}