import java.time.*;


class TitreNonValideException extends Exception{
}

// Classe abstraite pour les titres de transport
abstract class TitreTransport {
    protected LocalDateTime dateAchat;
    protected double prix;
    protected int id;

    public TitreTransport(LocalDateTime dateAchat, double prix, int id){
        this.id = id;
        this.dateAchat = dateAchat;
        this.prix = prix;
    }


    public boolean estValide(LocalDate now){
        LocalDate local = LocalDate.of(dateAchat.getYear(), dateAchat.getMonth(), dateAchat.getDayOfMonth());
        int diff = Period.between(local , now).getYears();
        return diff > 1;
    }


    public void afficherDateAchat() {
        System.out.println("Date d'achat : " + dateAchat);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public LocalDateTime getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDateTime dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}