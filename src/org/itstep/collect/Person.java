package org.itstep.collect;

import java.time.LocalDateTime;
import java.util.Objects;

/*
1. equals and hashCode from ID
НО!!! Если только ID генерирует ваше приложение
2. NaturalID - Казахстан - ИИН
3. Композитный формат
 */
public class Person {

    private int id;
    private String username;
    private String fullName;
    private String iin;
    private LocalDateTime creationDate;

    public Person() {
    }

    public Person(String iin) {
        this.iin = iin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return iin.equals(person.iin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iin);
    }

    @Override
    public String toString() {
        return "Person{" +
                "iin='" + iin + '\'' +
                '}';
    }
}
