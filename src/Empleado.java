public class Empleado {
    private String nombre;
    private double tarifaHora;
    private int horasTrabajadas;
    private String email;

    public Empleado(String nombre, double tarifaHora, int horasTrabajadas, String email) {
        this.nombre = nombre;
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public double getTarifaHora() { return tarifaHora; }
    public int getHorasTrabajadas() { return horasTrabajadas; }
    public String getEmail() { return email; }

    public double calcularSalario() {
        return tarifaHora * horasTrabajadas;
    }
}
