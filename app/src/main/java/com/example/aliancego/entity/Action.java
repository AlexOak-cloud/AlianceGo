package com.example.aliancego.entity;

import java.io.File;
import java.util.Objects;

public class Action {

    private int id;
    private String name;
    private String description;
    private String path;
    private int time;
    private File gif;


    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", path='" + path + '\'' +
                ", time=" + time +
                ", gif=" + gif +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action entity = (Action) o;
        return id == entity.id && time == entity.time && Objects.equals(name, entity.name) && Objects.equals(description, entity.description) && Objects.equals(path, entity.path) && Objects.equals(gif, entity.gif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, path, time, gif);
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public File getGif() {
        return gif;
    }

    public void setGif(File gif) {
        this.gif = gif;
    }



    public Action() {
    }

    public Action(int id, String name, String description, String path, int time, File gif) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.path = path;
        this.time = time;
        this.gif = gif;
    }


    public static void main(String[] args) {
        Action action = new Action(1,"Анжумания","Нада анжуматься","C://User/asd",15,new File("asdasd"));


    }



}
