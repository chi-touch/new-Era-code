package ChiEnterprise;

import java.util.ArrayList;

public class Receptionist {
    private String name;
    private static ArrayList<String> message = new ArrayList<>();

    public Receptionist(String name) {
        this.name = name;
    }

    public static void receiveCallFromGateMan(String gateManMessage){
      message.add(gateManMessage);
  }

    public ArrayList<String> getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
