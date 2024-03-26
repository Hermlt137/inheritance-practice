public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent(null, null, null, null, 0, 0, 0, 0, 0);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent.toString());

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("E002", "AlMusicConcert", "Paris", "Peng Tian", 20, 3, 50);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent.toString());

        
    }
}