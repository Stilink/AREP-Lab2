package edu.arep;

/**
 * LinkedList
 */
public class LinkedList {
    /**
     * Head representa el "elemento original" de la lista.
     */
    Node head;
    /**
     * Current es una variable de control, encargada de señalar la posición "actual" dentro de un recorrido.
     */
    Node current;
    /**
     * Constructor
     */
    public LinkedList() {
        this.head = new Node(0, null);
        this.current = this.head;
    }

    /**
     * Encargado de añadir un nuevo item a la lista.
     * 
     * @param data Dato que se guardará dentro del nuevo nodo.
     */
    public void add(double data) {
        Node newCurrent = new Node(data, null);
        this.current.setNext(newCurrent);
        this.current = newCurrent;
    }

    /**
     * Encargado de solicitar la información del nodo "siguiente" y retornarla.
     * 
     * @return información guardada dentro del nodo "siguiente".
     */
    public double next() {
        double data = this.current.getData();
        this.current = this.current.getNext();
        return data;
    }

    /**
     * Encargado de determinar si "existen mas items" dentro de la lista.
     * 
     * @return Valor booleano que representa la existencia o no, de mas items dentro
     *         de la lista.
     */
    public boolean hasMoreItems() {
        try {
            current.getNext();
        } catch (Exception e) {
            // System.out.println("Salí por la excepción");
            return false;
        }
        return true;
    }

    /**
     * Metodo de control para el recorrido de la lista.
     */
    public void restart() {
        this.current = this.head;
    }
}