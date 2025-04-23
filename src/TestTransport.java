import java.time.*;
import java.util.Scanner;

// Squelette de la méthode main
public class TestTransport {

    public static void main(String[] args) {

        TitreTransport ticket, cartePersoUsager,cartePersoEmploye;
        Personne usager, employe,usagerRExcept;

        System.out.println(" ----------------------- Tests sur les tickets----------------------");

        ticket = new Ticket();
        // 1.Test de ticket invalide
        try {
            System.out.println("Ticket créé le : " + ticket.getDateAchat ());
            System.out.println("Numéro du ticket  :  " + ticket.getId () );
            System.out.println("Prix du ticket : " + ticket.getPrix() + " DA");
            System.out.println("Test de validité le "+ LocalDate.of(2025,4,22)+ ": " + ticket.estValide(LocalDate.of(2025,4,22)) );
            System.out.println("Test de validité le "+ LocalDate.of(2025,4,30)) ;
            System.out.println(ticket.estValide(LocalDate.of(2025,4,30))) ;

        } catch (TitreNonValideException e) {System.out.println("Erreur: " + e.getMessage());}

        System.out.println(" \n\n\n----------------------- Tests sur les cartes personnelles----------------------");

        //2. Test des cartes personnelles
        usager = new Usager("Ali", "BenMohamed", LocalDate.of(2010, 5, 12), false);
        employe = new Employe("Ahmed", "Tahar", LocalDate.of(1980, 3, 25), false, "A123", TypeFonction.AGENT);
        usagerRExcept = new Usager("Amina", "Hamidi", LocalDate.of(1980, 5, 12), false);

        //2.1. carte usager reduction possible: test de type et test de validité
        try{
            cartePersoUsager = new CartePersonnelle(usager);
            System.out.println("Carte personnelle créée le " + cartePersoUsager.getDateAchat());
            System.out.println("Numéro de la carté: "+ cartePersoUsager.getId());
            System.out.println("Proprietaire de la carte : "+ usager.getNom()+ " " + usager.getPrenom());
            System.out.println("Type de la carte " + ((CartePersonnelle)cartePersoUsager).getType() );
            System.out.println("Prix de la carte : " + cartePersoUsager.getPrix() + " DA");
            System.out.println("Test de validité le "+ LocalDate.of(2025,5,22) + " : " + cartePersoUsager.estValide((LocalDate.of(2025,5,22))));
            System.out.println("Test de validité le "+ LocalDate.of(2026,5,22)) ;
            cartePersoUsager.estValide((LocalDate.of(2026,5,22)));

        }
        catch (TitreNonValideException e) {
            System.out.println("Erreur: " + e.getMessage()); }
        catch (ReductionImpossibleException e) {
            System.out.println("Erreur: " + e.getMessage()); }


        //2.2. Ceation de carte personnelle impossible (la personne n'a droit à aucune réduction)
        try{
            cartePersoUsager = new CartePersonnelle(usagerRExcept);
        }

        catch (ReductionImpossibleException e) {
            System.out.println("\nCréation de carte personnelle refusée pour "+ usagerRExcept.getNom()+ " " + usagerRExcept.getPrenom()+ e.getMessage());
        }




    }
}


