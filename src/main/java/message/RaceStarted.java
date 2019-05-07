package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;


public class RaceStarted extends Message
{
    private String raceName;
    private int courseLength;

    public RaceStarted(String raceName,int courseLength)
    {
        this.raceName=raceName;
        this.courseLength=courseLength;
    }

    public void execute(TrackingServer trackingServer, String initAddress)
    {

        trackingServer.sentToAllClients(this);

    }
    public String toString()
    {
        return "Race,"+raceName+","+String.valueOf(courseLength);

    }

}

