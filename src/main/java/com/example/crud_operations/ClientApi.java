package com.example.crud_operations;

/**
 * Interfaz para interactuar con los servicios de gestión de clientes.
 * Esta interfaz define un método para crear un nuevo cliente.
 */
public interface ClientApi {

    /**
     * Crea un nuevo cliente en el sistema.
     *
     * Este método es responsable de tomar los datos proporcionados en la solicitud
     * y crear un cliente en el sistema, devolviendo un valor booleano que indica si
     * la creación fue exitosa o si el cliente ya existe.
     *
     * @param clientRequestDto Objeto que contiene los datos del cliente a crear.
     * @return true si el cliente fue creado exitosamente, false si el cliente ya existe.
     */
    boolean createClient(RequestClient clientRequestDto);
}

