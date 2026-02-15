/**
 * Representa un libro del sistema de gestion de biblioteca, conteniendo información
 * sobre el titulo, autor, número de ejemplares y su precio.
 */

package biblioteca;

public class Llibre {
    private String titol;
    private String autor;
    private int exemplars;
    private float preu;

    /**
     * Constructor de la clase Llibre.
     * @param titol - Titulo del libro.
     * @param autor - Autor del libro.
     * @param exemplars - Número de ejemplares disponibles.
     * @param preu - Precio del libro.
     */
    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    /**
     * Método que presta una cantidad de ejemplares si hay disponibilidad.
     * @param quantitat - Número de ejemplares a prestar.
     * @throws Exception - Controla si no hay ejemplares disponibles.
     */
    public void prestarLlibre(int quantitat) throws Exception {
        if (getExemplars() >= quantitat) {
            setExemplars(getExemplars() - quantitat);
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    /**
     * Método que devuelve una cantidad de ejemplares al sistema.
     * @param quantitat - Número de ejemplares a devolver.
     */
    public void retornarLlibre(int quantitat) {
        setExemplars(getExemplars() + quantitat);
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    /**
     * Método que muestra los datos por pantalla.
     */
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
