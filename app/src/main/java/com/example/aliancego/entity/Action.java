package com.example.aliancego.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Action {

    private String name;
    private int time;

    @Override
    public String toString() {
        return "Action{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return time == action.time && Objects.equals(name, action.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Action() {
    }

    public Action(String name, int time) {
        this.name = name;
        this.time = time;
    }
}
