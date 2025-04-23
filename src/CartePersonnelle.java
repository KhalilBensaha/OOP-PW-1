import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

class ReductionImpossibleException extends Exception{

}


public class CartePersonnelle extends TitreTransport{
    private Personne person;
    private CartType type;
    public CartePersonnelle(LocalDateTime dateAchat, double prix, int id) throws TitreNonValideException {
        super(dateAchat, prix, id);
        LocalDate local = LocalDate.of(dateAchat.getYear(), dateAchat.getMonth(), dateAchat.getDayOfMonth());
        try{
            if (estValide(local)) throw new TitreNonValideException();

        }catch (TitreNonValideException e){
            System.out.println("Titre not valid");
        }
    }


    public boolean estValide(LocalDate now){
        LocalDate local = LocalDate.of(dateAchat.getYear(), dateAchat.getMonth(), dateAchat.getDayOfMonth());
        int diff = Period.between(local , now).getYears();
        return diff > 1;
    }

    public Personne getPerson() {
        return person;
    }

    public void setPerson(Personne person) {
        this.person = person;
    }



    public CartType getType() {
        return type;
    }

    public void setType(CartType type) {
        this.type = type;
    }



}
