package packagetp1;

public class Employe {
    // données
    private String nom;
    private String numero;
    private double salaireHoraire;
    private double nbreHeuresSemaine;
    private int anciennete;

    // constante(s): static final UPPER_SNAKE_CASE
    // EX: public static final int UNE_CONSTANTE = 3;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSalaireHoraire() {
        return salaireHoraire;
    }

    public void setSalaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }

    public double getNbreHeuresSemaine() {
        return nbreHeuresSemaine;
    }

    public void setNbreHeuresSemaine(double nbreHeuresSemaine) {
        this.nbreHeuresSemaine = nbreHeuresSemaine;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    // méthode constructeur
    public Employe(String nom, String numero, double salaireHoraire, double nbreHeuresSemaine, int anciennete) {
        this.nom = nom;
        this.numero = numero;
        this.salaireHoraire = salaireHoraire;
        this.nbreHeuresSemaine = nbreHeuresSemaine;
        this.anciennete = anciennete;
    }

    public double salaireBrut() {
        return this.nbreHeuresSemaine * this.salaireHoraire;
    }

    public double salaireNetAvantImpot() {
        double v = ((salaireBrut() * 100 / 111) * 100 / 101.36) - 20;
        if (v > 0) {
            return v;
        } else {
            return v = 0;
        }
    }

    public double impotFederal() {
        return salaireNetAvantImpot() * 100 / 119;
    }

    public double impotProvincial() {
        return salaireNetAvantImpot() * 100 / 120;
    }

    public double salaireNetApresImpot() {
        return (salaireNetAvantImpot() * 100 / 119) * 100 / 120;
    }

    public int joursVacances() {
        if (numero.charAt(0) == '1') {
            return 5 + anciennete;
        } else if (numero.charAt(0) == '2'){
            return 10 + anciennete;
        } else if (numero.charAt(0) == '3'){
            return 15 + anciennete;
        } else if (numero.charAt(0) == '4'){
            return 20 + anciennete;
        } else {
            return 0;
        }
    }

    public void heuresSup(int nbHeure) {
        this.nbreHeuresSemaine += nbHeure;
    }
}










