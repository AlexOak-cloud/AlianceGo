package com.example.aliancego.workoutBuilder;

import com.example.aliancego.entity.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class WorkoutBuilder {
    public static final Random random = new Random();

    /** Этот метод, случайным образом, собирает тренероаки из принятых им списков */
    public List<Action> workoutBuilder(List<Action> localList, int quantity) {
        List<Action> rtnList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            int nextInt = random.nextInt(localList.size() - 1);
            rtnList.add(localList.get(nextInt - 1));
        }
        return rtnList;
    }
}
