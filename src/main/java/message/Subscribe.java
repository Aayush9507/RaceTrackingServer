package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;

public class Subscribe extends Message
{
    private int bibnumber;
    private Athlete athlete;

    public Subscribe(int bibnumber)
    {
        this.bibnumber=bibnumber;
    }
    public void execute(TrackingServer trackingServer, String initAddress)
    {
       this.athlete=trackingServer.getAthleteByBibNumber(bibnumber);
       for(int i=0;i<trackingServer.getClientslist().size();i++)
        {
            if (trackingServer.getClientslist().get(i).getAddress().equals(initAddress))
            {
                for (int a = 0; a < trackingServer.getAthleteList().size(); a++)
                {
                    if (trackingServer.getAthleteList().get(a).getBib_number() == bibnumber)
                    {
                        athlete.addClient(trackingServer.getClientslist().get(i));
                    }
                }
            }
        }
    }

//    public  String toString()
//    {
//     return "Status,"+String.valueOf(bibnumber)+","+this.athlete.getStatus()+","+String.valueOf(this.athlete.getStarttime())+","+String.valueOf(this.athlete.getDistancecovered())+","+String.valueOf(this.athlete.getLast_updated_time())+","+String.valueOf(this.athlete.getFinish_time());
//
//    }
}

