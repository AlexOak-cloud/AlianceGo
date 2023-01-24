package com.example.aliancego.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Action {

    private int id;
    private String name;
    private String description;
    private int time;

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return id == action.id && time == action.time && Objects.equals(name, action.name) && Objects.equals(description, action.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, time);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Action() {
    }

    public Action(int id, String name, String description, int time) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public List<Action> listWorkout1(){
        List<Action> actions = new ArrayList<>();

        Action jumpHand = new Action(11,"jumpHand","Прыжки с разведением рук", 45);
        actions.add(jumpHand);

        Action runPlace = new Action(12,"runPlace","Бег на месте, высоко подниая колено", 45);
        actions.add(runPlace);

        Action lyingJump = new Action(13,"lyingJump","Выпрыгивание с упора лежа", 45);
        actions.add(lyingJump);

        return actions;
    }





        public List<Action> listWorkout2() {
            List<Action> actions2 = new ArrayList<>();

            Action raiseLegsLyingDown = new Action(211, "raiseLegsLyingDown", "Поднятие ног лежа", 45);
            actions2.add(raiseLegsLyingDown);

            Action bicycle = new Action(212, "bicycle", "Велосипед", 45);
            actions2.add(bicycle);

            Action plankRunning = new Action(213, "plankRunning", "Бег в планке", 45);
            actions2.add(plankRunning);

            Action russianWiggle = new Action(214, "russianWiggle", "Русские покачивания", 45);
            actions2.add(russianWiggle);

            Action pelvicSwing = new Action(215, "pelvicSwing", "Раскачка таза", 45);
            actions2.add(pelvicSwing);

            Action bicycleSlow = new Action(216, "bicycleSlow", "Велосипед (очень медленно)", 45);
            actions2.add(bicycleSlow);

            Action twisting = new Action(217, "twisting", "Скручивание (пресс)", 45);
            actions2.add(twisting);

            Action liftingBody = new Action(218, "liftingBody", "Поднятие тело (лежа)", 45);
            actions2.add(liftingBody);

            Action LyingLegSwing = new Action(219, "LyingLegSwing", "Махи ногами лежа", 45);
            actions2.add(LyingLegSwing);

            Action handsLegs = new Action(220, "handsLegs", "Руки ноги", 45);
            actions2.add(handsLegs);

            Action frog = new Action(221, "frog", "Лягушка", 45);
            actions2.add(frog);


            return actions2;
        }



}
