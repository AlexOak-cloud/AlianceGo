package com.example.aliancego.entity;

import java.util.Objects;

public class Action {

    private String name;
    private int duration;

    @Override
    public String toString() {
        return "Action{" +
                "name='" + name + '\'' +
                ", time=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return duration == action.duration && Objects.equals(name, action.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Action() {
    }

    public Action(String name, int time) {
        this.name = name;
        this.duration = time;
    }
}
