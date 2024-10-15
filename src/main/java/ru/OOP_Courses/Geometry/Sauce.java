package ru.OOP_Courses.Geometry;

public class Sauce {
    private String name;
    private SpiceLevel spicelevel;

    public enum SpiceLevel {
        TOPSPICE("Очень острый"),
        SPICE("Острый"),
        NOTSPICE("Не острый");

        private final String description;
        SpiceLevel(String description) {
            this.description = description;
        }
        @Override
        public String toString() {
            return description;
        }
    }
    public Sauce(String name, SpiceLevel spiceLevel) {
        this.name = name;
        this.spicelevel = spiceLevel;
    }
    public String getDescription() {
        return "Соус " + name + ": " + spicelevel.toString();
    }
    public static void main(String[] args) {
        Sauce sauce = new Sauce("Табаско", SpiceLevel.TOPSPICE);
        System.out.println(sauce.getDescription());
    }
}
