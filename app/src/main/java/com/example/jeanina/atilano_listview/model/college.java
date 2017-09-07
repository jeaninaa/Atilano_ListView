package com.example.jeanina.atilano_listview.model;

/**
 * Created by Jeanina on 07/09/2017.
 */

public class college {
    private int logo;
    private String name;
    private String year;

    public college(int logo, String name, String year) {
        this.logo = logo;
        this.name = name;
        this.year = year;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
