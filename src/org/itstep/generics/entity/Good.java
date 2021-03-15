package org.itstep.generics.entity;

public class Good {

    private Integer id;
    private String description;

    public Good() {
    }

    public Good(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
