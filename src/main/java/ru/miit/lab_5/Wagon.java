package ru.miit.lab_5;

import ru.miit.lab_5.annotations.CheckESR;
import ru.miit.lab_5.annotations.DoubleMin;

@DoubleMin
public class Wagon {
    @CheckESR
    String esr;

    Double conventionalLength;

    Integer conventionalWagons;

    public Wagon(String esr, Double conventionalLength, Integer conventionalWagons) {
        this.esr = esr;
        this.conventionalLength = conventionalLength;
        this.conventionalWagons = conventionalWagons;
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

    @Override
    public String toString() {
        return "ESR: " + getEsr() + "\n" +
                "conventionalLength: " + getConventionalLength() + "\n" +
                "conventionalWagons: " + getConventionalWagons() + "\n";
    }
}
