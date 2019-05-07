package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;


public class Started extends Message
{
    private int bibnumber;
    private int time;
    private Athlete athlete;


    public Started(int bibnumber,int time)
    {
        this.bibnumber=bibnumber;
        this.time=time;
    }
    public void execute(TrackingServer trackingServer, String initAddress)
    {

        trackingServer.sentToAllClients(this);
        this.athlete = trackingServer.getAthleteByBibNumber(bibnumber);
        athlete.setStatus("Started");
        trackingServer.sentToAllClients(this);



    }
    public String toString()
    {
        return "Status,"+String.valueOf(bibnumber)+","+this.athlete.getStatus()+","+String.valueOf(this.athlete.getStarttime())+","+String.valueOf(this.athlete.getDistance_covered())+","+String.valueOf(this.athlete.getLast_updated_time())+","+String.valueOf(this.athlete.getFinish_time());
    }
}