class Attendees {
    //We define a separate class Attendees to refer the contents later on in the class "Meeting"
    private String name; //Name of all the Participants.
    private AcademicTitle academicTitle; //Academic titles of the Participants.
    private String identityNumber; //Unique identity number of each of the Participant.
    private CompulsorypParticipants compulsorypParticipants;

    public enum AcademicTitle { //enum is used to define a defined range of academic titles.
        Doctoral_Student,
        Professor,
        Post_Doctoral_Student

    }
    public enum CompulsorypParticipants { //enum here is used to define a range of participants who must attend the event.
        chairperson,
        secretary
    }
}
