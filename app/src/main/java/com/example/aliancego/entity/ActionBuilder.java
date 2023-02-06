package com.example.aliancego.entity;

import java.util.ArrayList;
import java.util.List;

public class ActionBuilder {

    private static final int DURATION = 5;

    public List<Action> listWorkout1() {
        List<Action> actions = new ArrayList<>();

        Action jumpHand = new Action("Прыжки с разведением рук", DURATION);
        actions.add(jumpHand);

        Action runPlace = new Action("Бег на месте, высоко подниая колено", DURATION);
        actions.add(runPlace);

        Action lyingJump = new Action("Выпрыгивание с упора лежа", DURATION);
        actions.add(lyingJump);

        return actions;
    }


    public List<Action> listWorkout2() {
        List<Action> actions2 = new ArrayList<>();

        Action raiseLegsLyingDown = new Action("Поднятие ног лежа", DURATION);
        actions2.add(raiseLegsLyingDown);

        Action bicycle = new Action("Велосипед", DURATION);
        actions2.add(bicycle);

        Action plankRunning = new Action("Бег в планке", DURATION);
        actions2.add(plankRunning);

        Action russianWiggle = new Action("Русские покачивания", DURATION);
        actions2.add(russianWiggle);

        Action pelvicSwing = new Action("Раскачка таза", DURATION);
        actions2.add(pelvicSwing);

        Action bicycleSlow = new Action("Велосипед (очень медленно)", DURATION);
        actions2.add(bicycleSlow);

        Action twisting = new Action("Скручивание (пресс)", DURATION);
        actions2.add(twisting);

        Action liftingBody = new Action("Поднятие тело (лежа)", DURATION);
        actions2.add(liftingBody);

        Action LyingLegSwing = new Action("Махи ногами лежа", DURATION);
        actions2.add(LyingLegSwing);

        Action handsLegs = new Action("Руки ноги", DURATION);
        actions2.add(handsLegs);

        Action frog = new Action("Лягушка", DURATION);
        actions2.add(frog);


        return actions2;
    }


    public List<Action> listWorkout3() {
        List<Action> actions3 = new ArrayList<>();

        Action pushUp = new Action("Отжимания", DURATION);
        actions3.add(pushUp);

        Action pushUpWide = new Action("Отжимания широким жимом", DURATION);
        actions3.add(pushUpWide);

        Action pushUpLegsHigh = new Action("Отжимания, ноги выше  плечь", DURATION);
        actions3.add(pushUpLegsHigh);

        Action pushUpNarrowly = new Action("Отжимания узким жимом", DURATION);
        actions3.add(pushUpNarrowly);

        Action wideNarrowPushUp = new Action("Отжимания узко широко", DURATION);
        actions3.add(wideNarrowPushUp);

        Action pushUpFrom = new Action("Отжимания упрощонные (от обьекта)", DURATION);
        actions3.add(pushUpFrom);

        Action pushUpLeftRight = new Action("Отжимания лево право", DURATION);
        actions3.add(pushUpLeftRight);


        return actions3;
    }


    public List<Action> listWorkout4() {
        List<Action> actions4 = new ArrayList<>();

        Action superman = new Action("Супермен", DURATION);
        actions4.add(superman);

        Action pullUpLyingDown = new Action("Подтягивание полотенце лежа", DURATION);
        actions4.add(pullUpLyingDown);

        Action spreadingHands = new Action("Амплетудное разведение рук", DURATION);
        actions4.add(spreadingHands);

        Action swingInSuperman = new Action("Качели из позиции супермен", DURATION);
        actions4.add(swingInSuperman);

        Action Squats = new Action("Приседания", DURATION);
        actions4.add(Squats);

        Action explosiveJumps = new Action("Взрывные выпрыгиване с задержкой", DURATION);
        actions4.add(explosiveJumps);

        Action SquatsSocks = new Action("Отжимания лево право", DURATION);
        actions4.add(SquatsSocks);

        Action slowSquats = new Action("Медленные приседания", DURATION);
        actions4.add(slowSquats);


        return actions4;
    }


    public List<Action> listWorkout5() {
        List<Action> actions5 = new ArrayList<>();

        Action quickRunInPlace = new Action("Быстрый бег на месте", DURATION);
        actions5.add(quickRunInPlace);

        Action plank = new Action("Планка", DURATION);
        actions5.add(plank);

        return actions5;
    }


}
