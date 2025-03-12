package org.example;

import java.util.List;
/**
 * Interfaz que define los métodos para gestionar una agenda de contactos.
 */
public interface IAgenda {
    /**
     * Añade un contacto con el nombre y teléfono proporcionados.
     * @param name el nombre del contacto.
     * @param phone el número de teléfono del contacto.
     */
    void addContact(String name, String phone);

    /**
     * Elimina un contacto basado en su nombre.
     * @param name el nombre del contacto a eliminar.
     */
    void removeContact(String name);

    /**
     * Modifica un número de teléfono existente de un contacto.
     * @param name el nombre del contacto.
     * @param oldPhone el número de teléfono a modificar.
     * @param newPhone el nuevo número de teléfono.
     */
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    /**
     * Obtiene la lista de contactos almacenados en la agenda.
     * @return una lista de objetos {@link Persona}.
     */
    List<Persona> getContacts();
}
