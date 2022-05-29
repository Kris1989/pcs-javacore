package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodosTests {

    @Test
    public void addTaskTest() {

        String task = "Погулять с детьми";
        String task2 = "Проверить почту";

        Todos todos = new Todos();
        todos.addTask(task);
        todos.addTask(task2);

        List<String> result = todos.getTasks();

        List<String> expected = new ArrayList<>();
        expected.add(task);
        expected.add(task2);

        assertEquals(result, expected);
    }

    @Test
    public void removeTaskTest() {

        String task = "Купить продукты";
        String task2 = "Разобрать игрушки";
        String task3 = "Погулять в парке";

        Todos todos = new Todos();
        todos.addTask(task);
        todos.addTask(task2);
        todos.addTask(task3);
        todos.removeTask(task2);

        List<String> result = todos.getTasks();

        List<String> expected = new ArrayList<>();
        expected.add(task);
        expected.add(task3);

        assertEquals(result, expected);
    }

    @Test
    public void getAllTasksTest() {
        String task = "Погулять с детьми";
        String task2 = "Проверить почту";
        String task3 = "Постирать белье";

        Todos todos = new Todos();
        todos.addTask(task);
        todos.addTask(task2);
        todos.addTask(task3);

        List<String> resultList = todos.getTasks();

        String expected = "[Погулять с детьми, Постирать белье, Проверить почту] ";

        Collections.sort(resultList);
        StringBuilder builder = new StringBuilder();
        builder.append(resultList).append(" ");
        String result = builder.toString();

        Assertions.assertEquals(expected, result);
    }
}

