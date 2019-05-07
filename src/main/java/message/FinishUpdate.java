package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;


public class FinishUpdate extends Message
{
    private int bibnumber;
    private int time;
    private int lastUpdatedTime;
    private int finishTime;
    private double distanceCovered;
    private Athlete athlete;

    public FinishUpdate(int bibnumber,int finishTime)
    {
        this.bibnumber=bibnumber;
        this.finishTime=finishTime;

    }
    public void execute(TrackingServer trackingServer, String initAddress)
    {
        this.athlete=trackingServer.getAthleteByBibNumber(bibnumber);
        athlete.setFinish_time(finishTime);
        athlete.setStatus("Finished");
        athlete.setDistance_covered(16090.0);
        trackingServer.sentToAllClients(this);
    }
    public String toString()
    {
        return "Status,"+String.valueOf(bibnumber)+","+this.athlete.getStatus()+","+String.valueOf(this.athlete.getStarttime())+","+String.valueOf(this.athlete.getDistance_covered())+","+String.valueOf(this.athlete.getLast_updated_time())+","+String.valueOf(this.athlete.getFinish_time());

    }
}