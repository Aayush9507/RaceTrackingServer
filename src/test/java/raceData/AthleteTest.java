package raceData;

import message.Message;
import org.junit.Test;
import raceServer.TrackingServer;

import static org.junit.Assert.*;

public class AthleteTest {

    // @Test
//    public void setClientArrayList() throws Exception{
//        Client client = new Client("127.0.0.3", 400);
//        TrackingServer trackingServer = new TrackingServer(400);
//        trackingServer.addClient(client);
//        String message = "Registered,1,0,Valentine,Zamora,M,30";
//        String inetAddress = "/127.0.0.3";
//        inetAddress = inetAddress.substring(1);
//        int port = 400;
//        Message message1 = Message.createObject(message+","+inetAddress+","+String.valueOf(port));
//        message1.execute(trackingServer,inetAddress);
//        String message2 = "Subscribe,1";
//        Message message4 = Message.createObject(message2+","+inetAddress+","+String.valueOf(port));
//        message4.execute(trackingServer,inetAddress);
//    }
    @Test
    public void setBibNumber() {
        Athlete a4 = new Athlete(1, "Manu", "vyas", "M", 30, "Registered");
        a4.setBib_number(4);
        int bn = a4.getBib_number();
        assertEquals(a4.getBib_number(), bn);

    }

    @Test
    public void setLast_name() {
        Athlete a6 = new Athlete(1, "Manu", "vyas", "M", 30, "Registered");
        a6.setLast_name("vyas");
        String ln = a6.getLast_name();
        assertEquals(a6.getLast_name(), ln);
    }
}
    @Test
    public void setGender()
    {
        Athlete a7 = new Athlete(1, "Manu", "vyas", "M", 30, "Registered");
        a7.setGender("m");
        String gg = a7.getGender();
        assertEquals(a7.getGender(),gg);
  }
    @Test
    public void setAge()
    {
        Athlete a8 = new Athlete(1, "Manu", "vyas", "M", 30, "Registered");
        a8.setAge(32);
       int ag = a8.getAge();
        assertEquals(a8.getAge(),ag);
    }
    @Test
    public void setFinishTime()
    {
        Athlete a9 = new Athlete(1, "Manu", "vyas", "M", 30, "Registered");
        a9.setFinish_time(16600);
        int ft = a9.getFinish_time();
        assertEquals(a9.getFinish_time(),ft);
    }
}

