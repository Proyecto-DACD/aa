package org.example;

import java.util.Date;

public class Repository {
    private String name;
    private String owner;
    private String description;
    private Date create_date;
    private Date update_date;
    private Date push_date;
    private Information information;

    public Repository(String name, String owner, String description, Date create_date, Date update_date, Date push_date, Information information) {
        this.create_date = create_date;
        this.description = description;
        this.name = name;
        this.owner = owner;
        this.push_date = push_date;
        this.update_date = update_date;
        this.information = information;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public Date getPush_date() {
        return push_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public Information getInformation() {
        return information;
    }
}
