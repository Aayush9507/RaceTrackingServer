package message;

import raceServer.TrackingServer;

public abstract class Message
{
 public abstract void execute(TrackingServer trackingServer, String initaddress);

 public static Message createObj(String message)
 {
     String [] parameter = message.split(",");
     String msgName = parameter[0];
     Message result = null;
      if(msgName.equals("Hello"))
      {
          return new Hello(parameter[1],Integer.parseInt(parameter[2]));
      }
      if (msgName.equals("Subscribe"))
      {
          return new Subscribe(Integer.parseInt(parameter[1]));
      }
     if (msgName.equals("Unsubscribe"))
     {
         return new Unsubscribe(Integer.parseInt(parameter[1]));
     }
     if (msgName.equals("Race"))
     {
         return new RaceStarted(parameter[1],Integer.parseInt(parameter[2]));
     }
     if (msgName.equals("Started"))
     {
         return new Started(Integer.parseInt(parameter[1]),Integer.parseInt(parameter[2]));
     }
     if (msgName.equals("Registered"))
     {
         return new RegisteredMessage(Integer.parseInt(parameter[1]), Integer.parseInt(parameter[2]), parameter[3], parameter[4], Integer.parseInt(parameter[6]), parameter[5]);
     }

     if (msgName.equals("Finished"))
     {
         return new FinishUpdate(Integer.parseInt(parameter[1]),Integer.parseInt(parameter[2]));
     }
     if (msgName.equals("OnCourse"))
     {
         return new OnCourse(Integer.parseInt(parameter[1]),Integer.parseInt(parameter[2]),Double.parseDouble(parameter[3]));
     }

      return result;
 }
}
