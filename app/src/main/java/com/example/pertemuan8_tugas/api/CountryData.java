package com.example.pertemuan8_tugas.api;

import com.google.gson.annotations.SerializedName;

public class CountryData {

    @SerializedName("updated")
    private String  updated;
    private String  country;
    private String  cases;
    private String  todayCases;
    private String  deaths;
    private String  todayDeaths;
    private String  recovered;
    private String  todayrecovered;
    private String  active;
    private String  tests;

    public CountryData(String updated, String country, String cases, String todayCases, String deaths, String todayDeaths, String recovered, String todayrecovered, String active, String tests) {
        this.updated = updated;
        this.country = country;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.recovered = recovered;
        this.todayrecovered = todayrecovered;
        this.active = active;
        this.tests = tests;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getTodayrecovered() {
        return todayrecovered;
    }

    public void setTodayrecovered(String todayrecovered) {
        this.todayrecovered = todayrecovered;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getTests() {
        return tests;
    }

    public void setTests(String tests) {
        this.tests = tests;
    }
}
