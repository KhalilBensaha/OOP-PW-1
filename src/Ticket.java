import java.time.LocalDateTime;

public class Ticket extends TitreTransport{
    public boolean valable;
    public Ticket(LocalDateTime dateAchat, double prix, int id) throws TitreNonValideException {
        super(dateAchat, prix, id);
        try{


        }catch (TitreNonValideException e){
            System.out.println("Titre not valid");
        }
    }
}