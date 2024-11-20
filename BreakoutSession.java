class BreakoutSession {
    //We define a separate class BreakoutSession to refer the contents later on in the class "Meeting"
    private Attendees name; //Name of all the Participants from the class Attendees.
    private String title; //Title of the Session.
    private Attendees sessionLeader; //Name of the Session Leader from the class Attendees.
    private Address sessionVenue; //We refer the Address of the session venue from the class Address.
    private int sessionDuration; //Total duration of the Session.
    private int maximumAttendees; //To keep track of the maximum number of participants present in the Session.
}
