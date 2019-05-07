package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;

public class Unsubscribe extends Message
{
    private int bibnumber;
    private Athlete athlete;

    public Unsubscribe(int bibnumber)
    {
        this.bibnumber = bibnumber;
    }

    public void execute(TrackingServer trackingServer, String initAddress)
    {
        this.athlete = trackingServer.getAthleteByBibNumber(bibnumber);
        for (int i = 0; i < trackingServer.getClientslist().size(); i++)
        {
            if (trackingServer.getClientslist().get(i).getAddress().equals(initAddress))
            {
                for (int a = 0; a < trackingServer.getAthleteList().size(); a++) {
                    if (trackingServer.getAthleteList().get(a).getBib_number() == bibnumber)
                    {
                        athlete.removeClient(trackingServer.getClientslist().get(i));
                    }
                }
            }
        }
    }
}