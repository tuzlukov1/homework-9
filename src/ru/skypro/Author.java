package ru.skypro;

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
}
