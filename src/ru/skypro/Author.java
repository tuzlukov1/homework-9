package ru.skypro;

import java.util.Objects;

public class Author {

    private String name;
    private String subname;

    public Author(String name, String subname) {
        this.name = name;
        this.subname = subname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", subname='" + subname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && subname.equals(author.subname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subname);
    }
}
