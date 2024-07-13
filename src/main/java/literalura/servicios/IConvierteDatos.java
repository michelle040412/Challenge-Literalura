package literalura.servicios;

public interface IConvierteDatos {

    <T> T obtenerDatos (String json, Class<T> clase);
}
