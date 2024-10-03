package ru.mirea.antonov;

public enum Season {
    WINTER(-14.3, 180), SUMMER(25.1, 290), SPRING(16.2, 210), AUTUMN(12.3, 270);
    private final double avgTemp;
    private final int avgPrec;

    Season(double avgTemp, int avgPrec) {
        this.avgTemp = avgTemp;
        this.avgPrec = avgPrec;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
    public int getAvgPrec(){
        return avgPrec;
    }
    public String getDescription() {
        if (this == Season.AUTUMN || this == Season.WINTER) {
            return ("Это холодное время года.");
        }
        else {
            return ("Это тёплое время года.");
        }
    }

    @Override
    public String toString() {
        return "Season{" +
                "avgTemp=" + avgTemp +
                ", avgPrec=" + avgPrec +
                '}';
    }
}
