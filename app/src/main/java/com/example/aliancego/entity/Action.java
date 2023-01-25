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

        Action jumpHand = new Action(101,"jumpHand","Прыжки с разведением рук", 45);
        actions.add(jumpHand);

        Action runPlace = new Action(102,"runPlace","Бег на месте, высоко подниая колено", 45);
        actions.add(runPlace);

        Action lyingJump = new Action(103,"lyingJump","Выпрыгивание с упора лежа", 45);
        actions.add(lyingJump);

        return actions;
    }





        public List<Action> listWorkout2() {
            List<Action> actions2 = new ArrayList<>();

            Action raiseLegsLyingDown = new Action(201, "raiseLegsLyingDown", "Поднятие ног лежа", 45);
            actions2.add(raiseLegsLyingDown);

            Action bicycle = new Action(202, "bicycle", "Велосипед", 45);
            actions2.add(bicycle);

            Action plankRunning = new Action(203, "plankRunning", "Бег в планке", 45);
            actions2.add(plankRunning);

            Action russianWiggle = new Action(204, "russianWiggle", "Русские покачивания", 45);
            actions2.add(russianWiggle);

            Action pelvicSwing = new Action(205, "pelvicSwing", "Раскачка таза", 45);
            actions2.add(pelvicSwing);

            Action bicycleSlow = new Action(206, "bicycleSlow", "Велосипед (очень медленно)", 45);
            actions2.add(bicycleSlow);

            Action twisting = new Action(207, "twisting", "Скручивание (пресс)", 45);
            actions2.add(twisting);

            Action liftingBody = new Action(208, "liftingBody", "Поднятие тело (лежа)", 45);
            actions2.add(liftingBody);

            Action LyingLegSwing = new Action(209, "LyingLegSwing", "Махи ногами лежа", 45);
            actions2.add(LyingLegSwing);

            Action handsLegs = new Action(210, "handsLegs", "Руки ноги", 45);
            actions2.add(handsLegs);

            Action frog = new Action(211, "frog", "Лягушка", 45);
            actions2.add(frog);


            return actions2;
        }




    public List<Action> listWorkout3() {
        List<Action> actions3 = new ArrayList<>();

        Action pushUp = new Action(301, "pushUp", "Отжимания", 45);
        actions3.add(pushUp);

        Action pushUpWide = new Action(302, "pushUpWide", "Отжимания широким жимом", 45);
        actions3.add(pushUpWide);

        Action pushUpLegsHigh = new Action(303, "pushUpLegsHigh", "Отжимания, ноги выше  плечь", 45);
        actions3.add(pushUpLegsHigh);

        Action pushUpNarrowly = new Action(304, "pushUpNarrowly", "Отжимания узким жимом", 45);
        actions3.add(pushUpNarrowly);

        Action wideNarrowPushUp = new Action(305, "wideNarrowPushUp", "Отжимания узко широко", 45);
        actions3.add(wideNarrowPushUp);

        Action pushUpFrom = new Action(306, "pushUpFrom", "Отжимания упрощонные (от обьекта)", 45);
        actions3.add(pushUpFrom);

        Action pushUpLeftRight = new Action(307, "pushUpLeftRight", "Отжимания лево право", 45);
        actions3.add(pushUpLeftRight);


        return actions3;
    }




    public List<Action> listWorkout4() {
        List<Action> actions4 = new ArrayList<>();

        Action superman = new Action(401, "superman", "Супермен", 45);
        actions4.add(superman);

        Action pullUpLyingDown = new Action(402, "pullUpLyingDown", "Подтягивание полотенце лежа", 45);
        actions4.add(pullUpLyingDown);

        Action spreadingHands = new Action(403, "spreadingHands", "Амплетудное разведение рук", 45);
        actions4.add(spreadingHands);

        Action swingInSuperman = new Action(404, "swingInSuperman", "Качели из позиции супермен", 45);
        actions4.add(swingInSuperman);

        Action Squats = new Action(405, "Squats", "Приседания", 45);
        actions4.add(Squats);

        Action explosiveJumps = new Action(406, "explosiveJumps", "Взрывные выпрыгиване с задержкой", 45);
        actions4.add(explosiveJumps);

        Action SquatsSocks = new Action(407, "SquatsSocks", "Отжимания лево право", 45);
        actions4.add(SquatsSocks);

        Action slowSquats = new Action(408, "slowSquats", "Медленные приседания", 45);
        actions4.add(slowSquats);


        return actions4;
    }




    public List<Action> listWorkout5() {
        List<Action> actions5 = new ArrayList<>();

        Action quickRunInPlace = new Action(501, "quickRunInPlace", "Быстрый бег на месте", 45);
        actions5.add(quickRunInPlace);

        Action plank = new Action(502, "plank", "Планка", 45);
        actions5.add(plank);




        return actions5;
    }
}
