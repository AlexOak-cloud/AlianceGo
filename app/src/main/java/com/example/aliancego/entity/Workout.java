package com.example.aliancego.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Workout {

    private int id;
    private String name;
    private int time;
    private LocalDateTime date;
    private List<Action> actions;

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", date=" + date +
                ", actions=" + actions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return id == workout.id && time == workout.time && Objects.equals(name, workout.name) && Objects.equals(date, workout.date) && Objects.equals(actions, workout.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, date, actions);
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Workout() {
    }

    public Workout(int id, String name, int time, LocalDateTime date, List<Action> actions) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.date = date;
        this.actions = actions;
    }

}
