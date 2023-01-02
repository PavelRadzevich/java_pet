package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public abstract class Person {
    private String surName;
    private String giveName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Address address;


    public Person(String surName, String giveName, String patronymic, LocalDate dateOfBirth) {
        this.surName = surName;
        this.giveName = giveName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
