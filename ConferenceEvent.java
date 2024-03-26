public class ConferenceEvent extends Event implements CalculateEventCostInterface {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public void ConferenceEvent(String eventID,boolean breakfastRequired, double breakfastCost, boolean lunchRequired, double lunchCost, boolean dinnerRequired, double dinnerCost) {
        super(eventID);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    public void ConferenceEvent(String string, String string2, String string3, String string4, int i, int j, int k, int l,
            int m) {
        //TODO Auto-generated constructor stub
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

@Override
public double calculateEventCost() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calculateEventCost'");
}
