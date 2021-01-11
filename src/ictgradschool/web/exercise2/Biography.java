package ictgradschool.web.exercise2;

import java.io.Serializable;

public class Biography implements Serializable {

    private String name, biography;
    private Integer age;

    public Biography() {

    }

    public Biography(String name, String biography, Integer age) {
        this.name = name;
        this.biography = biography;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBiography() {
        return biography;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
