import java.time.*;
// Classe Employé

class Employe extends Personne {
    public TypeFonction job ;
    private String id;
    public Employe(String nom, String prenom, LocalDate dateNaissance, boolean isHndicape, String id, TypeFonction job) {
        super(nom, prenom, dateNaissance, isHndicape);
        this.id= id ;
        this.job = job ;
    }
}























/*

class Employe extends Personne {
    private int age;

    public Employe(String nom, String prenom, LocalDate dateNaissance) {
        super(nom, prenom, dateNaissance);
        this.age = Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    public int getAge() {
        return age;
    }

    public void afficherInfos() {
        System.out.println("Nom complet : " + prenom + " " + nom);
        System.out.println("Date de naissance : " + dateNaissance);
        System.out.println("Âge : " + age + " ans");
    }

    Employe emp = new Employe("Walid", "Boukhelifa", LocalDate.of(1998, 3, 25));
}
*/

