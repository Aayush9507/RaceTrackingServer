package message;
import raceData.Client;
import raceData.Athlete;
import raceServer.TrackingServer;


public class Hello extends Message
{
    private String clientAddress;
    private int clientPort;

public Hello(String clientAddress,int clientPort)
        {
            this.clientAddress=clientAddress;
            this.clientPort=clientPort;
        }

public void execute(TrackingServer trackingServer, String initAddress)
        {
            Client c = new Client(clientAddress,clientPort);
            trackingServer.addClient(c);
        }
}