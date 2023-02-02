package com.example.aliancego.entity;

import java.util.ArrayList;
import java.util.List;

public class ActionBuilder {
    public List<Action> listWorkout1() {
        List<Action> actions = new ArrayList<>();

        Action jumpHand = new Action("Прыжки с разведением рук", 45);
        actions.add(jumpHand);

        Action runPlace = new Action("Бег на месте, высоко подниая колено", 45);
        actions.add(runPlace);

        Action lyingJump = new Action("Выпрыгивание с упора лежа", 45);
        actions.add(lyingJump);

        return actions;
    }


    public List<Action> listWorkout2() {
        List<Action> actions2 = new ArrayList<>();

        Action raiseLegsLyingDown = new Action("Поднятие ног лежа", 45);
        actions2.add(raiseLegsLyingDown);

        Action bicycle = new Action("Велосипед", 45);
        actions2.add(bicycle);

        Action plankRunning = new Action("Бег в планке", 45);
        actions2.add(plankRunning);

        Action russianWiggle = new Action("Русские покачивания", 45);
        actions2.add(russianWiggle);

        Action pelvicSwing = new Action("Раскачка таза", 45);
        actions2.add(pelvicSwing);

        Action bicycleSlow = new Action("Велосипед (очень медленно)", 45);
        actions2.add(bicycleSlow);

        Action twisting = new Action("Скручивание (пресс)", 45);
        actions2.add(twisting);

        Action liftingBody = new Action("Поднятие тело (лежа)", 45);
        actions2.add(liftingBody);

        Action LyingLegSwing = new Action("Махи ногами лежа", 45);
        actions2.add(LyingLegSwing);

        Action handsLegs = new Action("Руки ноги", 45);
        actions2.add(handsLegs);

        Action frog = new Action("Лягушка", 45);
        actions2.add(frog);


        return actions2;
    }


    public List<Action> listWorkout3() {
        List<Action> actions3 = new ArrayList<>();

        Action pushUp = new Action("Отжимания", 45);
        actions3.add(pushUp);

        Action pushUpWide = new Action("Отжимания широким жимом", 45);
        actions3.add(pushUpWide);

        Action pushUpLegsHigh = new Action("Отжимания, ноги выше  плечь", 45);
        actions3.add(pushUpLegsHigh);

        Action pushUpNarrowly = new Action("Отжимания узким жимом", 45);
        actions3.add(pushUpNarrowly);

        Action wideNarrowPushUp = new Action("Отжимания узко широко", 45);
        actions3.add(wideNarrowPushUp);

        Action pushUpFrom = new Action("Отжимания упрощонные (от обьекта)", 45);
        actions3.add(pushUpFrom);

        Action pushUpLeftRight = new Action("Отжимания лево право", 45);
        actions3.add(pushUpLeftRight);


        return actions3;
    }


    public List<Action> listWorkout4() {
        List<Action> actions4 = new ArrayList<>();

        Action superman = new Action("Супермен", 45);
        actions4.add(superman);

        Action pullUpLyingDown = new Action("Подтягивание полотенце лежа", 45);
        actions4.add(pullUpLyingDown);

        Action spreadingHands = new Action("Амплетудное разведение рук", 45);
        actions4.add(spreadingHands);

        Action swingInSuperman = new Action("Качели из позиции супермен", 45);
        actions4.add(swingInSuperman);

        Action Squats = new Action("Приседания", 45);
        actions4.add(Squats);

        Action explosiveJumps = new Action("Взрывные выпрыгиване с задержкой", 45);
        actions4.add(explosiveJumps);

        Action SquatsSocks = new Action("Отжимания лево право", 45);
        actions4.add(SquatsSocks);

        Action slowSquats = new Action("Медленные приседания", 45);
        actions4.add(slowSquats);


        return actions4;
    }


    public List<Action> listWorkout5() {
        List<Action> actions5 = new ArrayList<>();

        Action quickRunInPlace = new Action("Быстрый бег на месте", 45);
        actions5.add(quickRunInPlace);

        Action plank = new Action("Планка", 45);
        actions5.add(plank);

        return actions5;
    }


}
