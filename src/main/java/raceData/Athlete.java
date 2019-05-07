package raceData;

import java.util.ArrayList;
import java.util.Observable;

public class Athlete extends Observable
{

    private int bib_number;
    private String first_name;
    private String last_name;
    private String gender;
    private int age;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDistance_covered(double distance_covered) {
        this.distance_covered = distance_covered;
    }

    public int getStart_time() {
        return start_time;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void setBib_number(int bib_number) {
        this.bib_number = bib_number;
    }

    private String status;
    private double distance_covered;
    private int course_length;
    private int start_time;
    private int last_updated_time;
    private int finish_time;
    private ArrayList<Client> clients = new ArrayList<Client>();

    public int getLast_updated_time() {
        return last_updated_time;
    }

    public void setLast_updated_time(int last_updated_time)
    {
        this.last_updated_time = last_updated_time;
    }

    public int getFinish_time()
    {
        return finish_time;
    }

    public void setFinish_time(int finish_time) {
        this.finish_time = finish_time;
    }

    public Athlete(int bib_number, String first_name, String last_name, String gender, int age, String status)
    {
        this.bib_number=bib_number;
        this.first_name=first_name;
        this.last_name=last_name;
        this.gender=gender;
        this.status=status;
        this.age=age;
    }
    /*getter methods */
    public int getBib_number()
    {
        return bib_number;
    }
    public String getStatus()
    {
        return status;
    }
    public double getDistance_covered()
    {
        return distance_covered;
    }
    public int getCourse_length()
    {
        return course_length;
    }
    public void setCourse_length(int course_length)
    {
        this.course_length=course_length;
    }
    public int getStarttime()
    {
        return start_time;
    }
    public ArrayList<Client> getClientList()
    {
        return clients;
    }
    /*setter methods*/

    public void setStatus(String status)
    {
        this.status=status;
    }
    public void setDistance_covered(Double distance_covered)
    {
        this.distance_covered=distance_covered;
    }
    public void setStart_time(int start_time)
    {
        this.start_time=start_time;
    }
    public void addClient(Client subscriber)
    {
        clients.add(subscriber);
    }
    public void removeClient(Client subscriber)
    {
        clients.remove(subscriber);
    }
}
