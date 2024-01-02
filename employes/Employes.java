package employes;

public class Employes {
    private String nom;
    private String matricule;
    private float indiceSalarial;
    private float multiplicateurSalaire; // le meme pour tout le monde (ne pas le mettre comme param dans le
                                         // constructeur)

    // constructeur nom, matricule, indiceSalarial

    /* le constructeur doit avoir le meme nom que la class */
    public Employes(String nom, String matricule, float indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
        this.multiplicateurSalaire = 50;
    }

    /* Setter */
    public void setNom(String nom) throws Exception {

        if (nom.length() < 3) {
            throw new Exception("Un nom doit contenir au moins 3 lettres");
        }

        for (int i = 0; i < nom.length(); i++) {
            if (nom.charAt(i) >= '0' && nom.charAt(i) <= '9') {
                throw new Exception("Un nom ne doit pas contenir de chiffre");
            }
        }

    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setIndiceSalarial(float indiceSalarial) throws Exception {
        if (indiceSalarial <= 0) {
            throw new Exception("L'indice doit être supperieur a 0");
        }
        this.indiceSalarial = indiceSalarial;

    }

    public void setMultiplicateurSalaire(float multiplicateurSalaire) throws Exception {
        if (multiplicateurSalaire <= 0) {
            throw new Exception("Le multiplicateur doit être supperieur ou egal a 0");
        }

        this.multiplicateurSalaire = multiplicateurSalaire;
    }

    /* getter */
    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public float getIndiceSalarial() {
        return indiceSalarial;
    }

    public float getMultiplicateurSalaire() {
        return multiplicateurSalaire;
    }

    /* Methodes */
    public float salaire() {
        return this.indiceSalarial * this.multiplicateurSalaire;
    }

}
