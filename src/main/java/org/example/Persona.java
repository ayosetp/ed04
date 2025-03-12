package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto que tiene los atributos de nombre y número de teléfono.
 */
class Persona {
    /**
     * Atributo que representa el nombre del contacto
     */
    private String name;
    /**
     * Atributo que representa el numero de teléfono del contacto
     */
    private List<String> phones;


    /**
     * Crea un nuevo contacto con el nombre proporcionado y añade el teléfono
     * a su lista.
     *
     * @param name el nombre del contacto.
     * @param phone el primer número de teléfono del contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return el nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de los números de teléfonos del contacto.
     *
     * @return una lista de cadenas de texto con los números de teléfono.
     */
    public List<String> getPhones() {
        return this.phones;
    }
    /**
     * Establece un nuevo nombre para el contacto.
     * @param name el nuevo nombre del contacto.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Establece una nueva lista de números de teléfono para el contacto.
     * @param phones la lista de números de teléfono.
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}