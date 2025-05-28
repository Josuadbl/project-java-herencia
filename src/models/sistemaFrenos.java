package models;

public class sistemaFrenos extends componenteVehicular{
    boolean tieneABS;
    String tipoDiscos;

    public sistemaFrenos(String codigo, String fabricante, boolean tieneABS, String tipoDiscos) {
        super(codigo, fabricante);
        this.tieneABS = tieneABS;
        this.tipoDiscos = tipoDiscos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sistema ABS: " + (tieneABS ? "Sí" : "No"));
        System.out.println("Tipo de discos: " + tipoDiscos);
    }

    public void verificarABS() {
        if (tieneABS) {
            System.out.println("Sistema ABS operativo.");
        } else {
            System.out.println("Este vehículo no tiene ABS.");
        }
    }

}
