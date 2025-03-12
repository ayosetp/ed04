package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Una clase que representa una Agenda con un atributo list que hace referencia a un objeto de tipo Contacto.
 * Permite añadir, borrar y modificar contactos.
 */
public class Agenda implements IAgenda {
    /**
     * Lista de contactos almacenados en la agenda.
     */
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Crea una nueva instancia de Agenda e inicializa la lista de contactos.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Se añade un nuevo contacto.
     * Si el contacto existiera se añade el nuevo número al listado existente.
     * @param name el nombre del contacto.
     * @param phone el número de teléfono a agregar.
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina de la agenda el contacto cuyo nombre coincide (no se tiene en cuenta
     * mayúsculas).
     * @param name el nombre del contacto a eliminar.
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica un número de teléfono de un contacto existente.
     * Busca el contacto por nombre y si encuentra el número antiguo lo remplaza
     * por el nuevo.
     *
     * @param name el nombre del contacto.
     * @param oldPhone el número de teléfono que queremos remplazar.
     * @param newPhone el nuevo número de teléfono.
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Devuelve la lista de contactos registrados en la agenda.
     *
     * @return una lista de objetos {@link Persona}.
     */
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}