package es.centro.incidencias;

/**
 * Excepción que se da cuando al consultar una incidencia por su identificador no existe ninguna con ese valor.
 *
 *  <p> El mensaje que se lanza de que no existe ninguna incidencia incluye el identificador que se ha buscado</p>
 */
public class IncidenciaNoEncontradaException extends Exception {
    /**
     * Crea la excepcion para el identificador no encontrado.
     *
     * <p> Mensaje con el siguiente formato {@code "No existe ninguna incidencia con el identificador <id>."}</p>
     *
     * @param id identifica a la incidencia que no existe.
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
