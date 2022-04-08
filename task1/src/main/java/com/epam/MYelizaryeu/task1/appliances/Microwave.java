package com.epam.MYelizaryeu.task1.appliances;

public class Microwave extends MajorAppliance {

    private final Double turntableSize;

    public Microwave(Double turntableSize) {
        this.setAppliance("Microwave");
        this.turntableSize = turntableSize;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", power=" + getPower() +
                ", switchedOn=" + isSwitchedOn() +
                ", type='" + getType() + '\'' +
                ", turntableSize=" + turntableSize +
                ", sourcePower=" + getPowerSource() +
                '}';
    }
}