public abstract class Beverage {
    private String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
