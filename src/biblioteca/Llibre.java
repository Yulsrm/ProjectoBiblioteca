package biblioteca;

public class Llibre {
    private String titol;
    private String autor;
    private int exemplars;
    private float preu;

    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    public void prestarLlibre(int quantitat) throws Exception {
        if (getExemplars() >= quantitat) {
            setExemplars(getExemplars() - quantitat);
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    public void retornarLlibre(int quantitat) {
        setExemplars(getExemplars() + quantitat);
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    public void mostrarDades() {
        System.out.println("Títol: " + getTitol());
        System.out.println("Autor: " + getAutor());
        System.out.println("Exemplars: " + getExemplars());
        System.out.println("Preu: " + getPreu() + " €");
    }

    /**
     * @return the titol
     */
    public String getTitol() {
        return titol;
    }

    /**
     * @param titol the titol to set
     */
    public void setTitol(String titol) {
        this.titol = titol;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the exemplars
     */
    public int getExemplars() {
        return exemplars;
    }

    /**
     * @param exemplars the exemplars to set
     */
    public void setExemplars(int exemplars) {
        this.exemplars = exemplars;
    }

    /**
     * @return the preu
     */
    public float getPreu() {
        return preu;
    }

    /**
     * @param preu the preu to set
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }
}
