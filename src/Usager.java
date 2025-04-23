import java.time.*;


class Usager extends Personne {
    static int nbUsers;
    private int userId;
    public Usager(String nom, String prenom, LocalDate dateNaissance,boolean isHandicape) throws {
        super(nom, prenom, dateNaissance, isHandicape);
        this.userId = nbUsers ;
        nbUsers++;

    }

}
