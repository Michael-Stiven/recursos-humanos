public class EmpleadoBad {
    private String nombre;
    private double tarifaHora;
    private int horasTrabajadas;
    private String email;

    public EmpleadoBad(String nombre, double tarifaHora, int horasTrabajadas, String email) {
        this.nombre = nombre;
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
        this.email = email;
    }

    public double calcularSalario() {
        return tarifaHora * horasTrabajadas;
    }

    public String generarReporte() {
        return "Empleado: " + nombre + "\nHoras: " + horasTrabajadas + "\nSalario: " + calcularSalario();
    }

    public void enviarCorreoReporte() {
        System.out.println("Enviando correo a " + email + " con el reporte:\n" + generarReporte());
    }
}
