public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos Pérez", 20.0, 40, "carlos@empresa.com");
        EmpleadoBad empleadoBad = new EmpleadoBad("Carlos Pérez", 20.0, 40, "carlos@empresa.com");
        ServicioReporteEmpleado servicioReporte = new ServicioReporteEmpleado();
        ServicioCorreo servicioCorreo = new ServicioCorreo();

        String reporte = servicioReporte.generarReporte(empleado);

        System.out.println("\n----- Con SRP -----\n");

        servicioCorreo.enviarCorreo(empleado.getEmail(), "Reporte semanal de horas", reporte);

        System.out.println("----- Sin SRP -----\n");

        empleadoBad.generarReporte();
        empleadoBad.enviarCorreoReporte();
    }
}
