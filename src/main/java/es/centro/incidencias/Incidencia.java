package es.centro.incidencias;

import java.util.Locale;

/**
 * Esto es la incidencia del centro
 *
 * <p> Cada incidencia tiene un código único(id) un título descriptivo, una prioridad y un estado (abierta o cerrada)</p>
 * <p> Los datos de la clase no pueden modificarse</p>
 *
 * @see GestorIncidencias
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una incidencia con los datos que se han indicado más arriba
     * @param id es un identificador único
     * @param titulo es una descripción de la misma
     * @param prioridad establece la prioridad de la incidencia, {@code "alta"}, {@code "media"}, {@code "baja"}
     * @param abierta {@code "true"} si la incidencia sigue abierta, {@code "false"} si la incidencia está cerrada.
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Devuelve el identificador de la incidencia.
     * @return devuelve el identificador único de la incidencia.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene la descripción de la incidencia.
     * @return el título descriptivo de la incidencia.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Indica la prioridad de la incidencia.
     * @return la prioridad de la incidencia.
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Indica si la incidencia sigue abierta.
     * @return {@code "true"} si la incidencia sigue abierta, {@code "false"} si la incidencia está cerrada.
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprobará si el texto indicado aparece, coincide con el texto que se indica.
     * Mirará en el identificador o en el titulo (o descripción), bastando que coincida en alguno de ellos.
     * El criterio no distingue mayúsculas de minúsculas.
     * @param texto es el texto que se desea buscar
     * @return {@code "true"} si el identificador o el título lo contienen, {@code "false"} en caso contrario.
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
