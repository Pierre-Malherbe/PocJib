package com.pmalherbe.demokubernetes.model.dto;

public class FishDto {

    private String name;

    private Integer age;

    public FishDto(String name, int i) {
        this.name = name;
        this.age = i;
    }

    public String getName() {
        return name;
    }

    public FishDto setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public FishDto setAge(Integer age) {
        this.age = age;
        return this;
    }
}
