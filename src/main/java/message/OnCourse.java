package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;


public class OnCourse extends Message
{
    private int bibnumber;
    private int time;
    private int lastUpdatedTime;
    private int finishTime;
    private double distanceCovered;
    private Athlete athlete;

    public OnCourse(int bibnumber,int time, double distanceCovered)
    {
    this.bibnumber=bibnumber;
    this.lastUpdatedTime=time;
    this.distanceCovered=distanceCovered;
    }
    public void execute(TrackingServer trackingServer,String initAddress)
    {
        this.athlete=trackingServer.getAthleteByBibNumber(bibnumber);
        athlete.setDistance_covered(distanceCovered);
        athlete.setStatus("OnCourse");
        athlete.setLast_updated_time(lastUpdatedTime);
        trackingServer.sentToAllClients(this);
    }

    @Override
    public String toString()
    {
        return "Status,"+String.valueOf(bibnumber)+","+this.athlete.getStatus()+","+String.valueOf(this.athlete.getStarttime())+","+String.valueOf(this.athlete.getDistance_covered())+","+String.valueOf(this.athlete.getLast_updated_time())+","+String.valueOf(this.athlete.getFinish_time());

    }
}