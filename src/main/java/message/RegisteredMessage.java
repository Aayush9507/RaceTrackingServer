package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;

public class RegisteredMessage extends Message
{
    private int bibnumber;
    private int time;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private Athlete athlete;

    public RegisteredMessage(int bibnumber,int time,String firstName,String lastName,int age, String gender)
    {
        this.bibnumber=bibnumber;
        this.time=time;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
    }

    public void execute(TrackingServer trackingServer, String initAddress)
    {
        this.athlete = new Athlete(bibnumber,firstName,lastName,gender,age,"Registered");

        trackingServer.addAthlete(athlete);
        trackingServer.sentToAllClients(this);

    }
    public  String toString()
    {
        return "Athlete,"+String.valueOf(bibnumber)+","+firstName+","+lastName+","+gender+","+String.valueOf(age);
    }
}
