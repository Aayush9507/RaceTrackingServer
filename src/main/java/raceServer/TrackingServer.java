package raceServer;
import message.DummyMessageProcessor;
import message.Message;
import raceData.Athlete;
import raceData.Client;


import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;

public class TrackingServer implements Runnable {

    private ArrayList<Client> clientslist = new ArrayList<Client>();
    private ArrayList<Athlete> athleteList = new ArrayList<Athlete>();

    private Communicator communicator=null;
    private DummyMessageProcessor dummymsgprocessor=null;

    public TrackingServer(int localport) throws SocketException, Exception
    {
        communicator = new Communicator(localport);
        dummymsgprocessor = new DummyMessageProcessor("raceServer.TrackingServer", this);
        communicator.setProcessor(dummymsgprocessor);
    }

    @Override
    public void run() {
        communicator.start();

    }
    public void addClient(Client client)
    {
        clientslist.add(client);
    }

    public void sentToAllClients(Message message)
    {
        for(Client c : clientslist)
        {
            try
            {
                communicator.send(message.toString(), InetAddress.getByName(c.getAddress()),c.getPort());
            }
            catch(Exception e)
            {

            }
        }
    }

    public void addAthlete(Athlete athlete)
    {
        athleteList.add(athlete);
    }

    public Athlete getAthleteByBibNumber(int bibNumber)
    {

        for(int i =0; i<athleteList.size(); i++)
        {
            if(athleteList.get(i).getBib_number() == bibNumber)
            {
                return athleteList.get(i);
            }
        }
        return null;

    }
    public ArrayList<Client> getClientslist()
    {
        return clientslist;
    }
    public ArrayList<Athlete> getAthleteList()
    {
        return athleteList;
    }
}
