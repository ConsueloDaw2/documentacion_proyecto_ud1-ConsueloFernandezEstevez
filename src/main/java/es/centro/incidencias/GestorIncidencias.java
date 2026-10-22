package es.centro.incidencias;

import java.util.List;

/**
 * Gestión de las incidencias
 * Ofrece una lista de operaciones.
 *
 * Las incidencias ya están establecidas.
 */

public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Ya hay incidencias establecidas.
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Devuelve todas las incidencias, tanto abiertas como cerradas.
     * @return lista no modificable de todas las incidencias.
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Devulve solo las incidencias abiertas.
     * @return lista las incidencia abiertas si existieran.
     * @see Incidencia#isAbierta()
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca las incidencias que coincidan con el texto que se indican.
     * @param texto texto que se desea buscar.
     * @return una lista con las incidencia que coinciden, y vacía si no hay.
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia por su identificador, sin distinguir entre mayúsculas y minúsculas.
     *
     * @param id identificador de la incidencia.
     * @return devuelve la incidencia con ese identificador.
     * @throws IncidenciaNoEncontradaException si no existe ninguna incidencia con el identificador que se indica.
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Se obtiene una incidencia por su identificador, devolviendo {@code null} si no existe.
     *
     * @param id identificador de la incidencia.
     * @return la incidencia encontrada o {@code null} si no existe
     * @deprecated devuelve la alternativa desde la version 1.0.0
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
