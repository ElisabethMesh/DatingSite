package com.meshalkina.datingsite.model;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "description")
    private String description;

    @Column(name = "height")
    private int height;

    @Column(name = "weight")
    private int weight;

    @Column(name = "expectations")
    private String expectations;

    public Profile() {
    }

    public Profile(Long id, int age, Gender gender, String description, int height, int weight, String expectations) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.height = height;
        this.weight = weight;
        this.expectations = expectations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getExpectations() {
        return expectations;
    }

    public void setExpectations(String expectations) {
        this.expectations = expectations;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", description='" + description + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", expectations='" + expectations + '\'' +
                '}';
    }
}
