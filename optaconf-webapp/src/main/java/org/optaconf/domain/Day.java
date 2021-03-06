package org.optaconf.domain;

public class Day extends AbstractPersistable implements Comparable<Day> {

    private String name;
    private String date;

    public Day() {
    }

    public Day(String id, String name, String date) {
        super(id);
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(Day other) {
        return date.compareTo(other.date);
    }

}
