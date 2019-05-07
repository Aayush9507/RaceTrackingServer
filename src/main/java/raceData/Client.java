package raceData;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer{
    private String address;
    private int port;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Client (String address, int port){
        this.address=address;
        this.port=port;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}

