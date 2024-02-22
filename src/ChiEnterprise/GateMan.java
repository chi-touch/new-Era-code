package ChiEnterprise;

public class GateMan {
    private int number = 104;
    private String message;

    private final Receptionist receptionist = new Receptionist("ChiChi");


    public String getMessage() {
        return message;
    }

    public void setMessage(String message, String name) {

        this.message = "this visitor called " + name + " ask me to relay this message that " + message;
        callReceptionist();
        //this is a method call(callReceptionist)and making the method private is used only for that call
    }

    public int getNumber(){
        return number;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    private void callReceptionist(){
        receptionist.receiveCallFromGateMan(this.message);
    }




}
