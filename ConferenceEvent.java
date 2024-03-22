public class ConferenceEvent {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public ConferenceEvent(boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    public double calculateEventCost() {
        double totalCost = 0.0;
        if (breakfastRequired) {
            totalCost += breakfastCost;
        }
        if (lunchRequired) {
            totalCost += lunchCost;
        }
        if (dinnerRequired) {
            totalCost += dinnerCost;
        }
        return totalCost;
    }

    public String toString() {
        return "Conference Event Details:\n" +
                "Breakfast Required: " + breakfastRequired + "\n" +
                "Breakfast Cost: $" + breakfastCost + "\n" +
                "Lunch Required: " + lunchRequired + "\n" +
                "Lunch Cost: $" + lunchCost + "\n" +
                "Dinner Required: " + dinnerRequired + "\n" +
                "Dinner Cost: $" + dinnerCost;
    }
}
