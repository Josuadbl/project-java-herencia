package models;

public class componenteVehicular {
     String codigo;
     String fabricante;

    public componenteVehicular(String codigo, String fabricante) {
        this.codigo = codigo;
        this.fabricante = fabricante;
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Fabricante: " + fabricante);
    }

}
