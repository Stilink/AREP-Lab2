package edu.arep;

/**
 * Node
 */
public class Node {

    private Node next;
    private double data;
    /**
     * Crea un nuevo nodo.
     * @param data  Información a guardar dentro del nodo.
     * @param next  Referencia al siguiente dentro de la lista.
     */
    public Node(double data, Node next) {
        this.setData(data);
        this.setNext(next);
    }

    public double getData() {
        return data;
    }

    private void setData(double data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}