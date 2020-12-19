package ru.miit.lab_5;

public class Wagon {
    String esr;
    Double conventionalLength;
    Integer conventionalWagons;

    public Wagon() {
        esr = "";
        conventionalLength = 0.0;
        conventionalWagons = 0;
    }

    public String getEsr() {
        return esr;
    }

    public Double getConventionalLength() {
        return conventionalLength;
    }

    public Integer getConventionalWagons() {
        return conventionalWagons;
    }

    public void setEsr(String esr) {
        this.esr = esr;
    }

    public void setConventionalLength(Double conventionalLength) {
        this.conventionalLength = conventionalLength;
    }

    public void setConventionalWagons(Integer conventionalWagons) {
        this.conventionalWagons = conventionalWagons;
    }
}
