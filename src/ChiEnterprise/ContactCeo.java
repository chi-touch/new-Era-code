package ChiEnterprise;

public class ContactCeo {
    public static void main(String[] args) {
        GateMan gateMan = new GateMan();
        Visitor visitor = new Visitor("Mesach", "I want to see Jack the CEO");
        String visitorMessage = visitor.getMessage();
        gateMan.setMessage(visitorMessage, visitor.getName());

       // System.out.println(gateMan.getMessage());





        GateMan joshua = new GateMan();
        joshua.setMessage("A message from Pauline", "Obibia");

        GateMan chichi = new GateMan();
        chichi.setMessage("A message from Ibrahim", "Ibrahim");

        GateMan jack = new GateMan();
        jack.setMessage("A message from Mesach", " Mesach");


        final String name = "Jack";
        System.out.println(name);
        //System.out.println(joshua.getReceptionist().getName());
        //System.out.println(jack.getReceptionist().getName());
        //System.out.println(chichi.getReceptionist().getMessage());



    }





}
