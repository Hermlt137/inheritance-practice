import com.sun.java.accessibility.util.EventID;

public class ConferenceEvent{
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private CalculateEventCostClass calculateEventCostObject=new CalculateEventCostClass();


    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays,double breakfastCost, double lunchCost) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOfContact = eventPointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }

    public ConferenceEvent(String eventID2, String eventName2, String eventLocation2, String eventPointOfContact2,
            int eventCost2, int totalParticipants2, int totalEventDays2, int breakfastCost2, int lunchCost2) {
        //TODO Auto-generated constructor stub
    }

    public double calculateEventCost(){
         return  eventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);
    }
    public String toString() {
        return "Conference Event details:"+'\n'+
                "Event ID: "+ eventID +'\n'+
                "Event Name: "+eventName+'\n'+
                "Event Location: "+eventLocation+'\n'+
                "Total Participants: "+totalParticipants+'\n'+
                "Total Event Cost:"+eventCost+'\n';
    }
}

