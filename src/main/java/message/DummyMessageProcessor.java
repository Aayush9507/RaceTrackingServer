package message;

import raceServer.TrackingServer;

import java.net.InetAddress;

public class DummyMessageProcessor implements IMessageProcessor {

    private String name;
    private int receiveCount;
    private TrackingServer trackingServer;

    public DummyMessageProcessor(String name, TrackingServer trackingServer) {
        this.name = name;
        this.trackingServer = trackingServer;
    }
    @Override
    public void process(String message, InetAddress address, int port) {
        if (message==null) {
            System.out.println("Null string");
            return;
        }

        if (address==null) {
            System.out.println("Null address");
            return;
        }

        System.out.println(String.format("%s received: %s from %s:%d", name, message, address.toString(), port));


        String initaddress = address.toString();
        initaddress = initaddress.substring(1);
        Message message1 = Message.createObj(message+","+initaddress+","+String.valueOf(port));

        if(message1!=null)
        {
            message1.execute(trackingServer,initaddress);
            receiveCount++;
        }
    }

    public int ReceiveCount() { return receiveCount; }
}





