package Laboratorio.Practica_5;

public class Node<T> {

    private T info;
    private Node sig;

    /**
     *
     */
    public Node() {
        this.info = null;
        this.sig = null;
    }

    Node(T info, Node sig) {
        this.info = info;
        this.sig = sig;
    }

    T getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(T info) {
        this.info = info;
    }

    Node getSig() {
        return sig;
    }

    void setSig(Node sig) {
        this.sig = sig;
    }
}
