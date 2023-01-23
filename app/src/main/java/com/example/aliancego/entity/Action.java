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

    public List<Action> createActions(){
        List<Action> actions = new ArrayList<>();
        Action action = new Action(1,"name","description", 15);


        return actions;
    }





}
