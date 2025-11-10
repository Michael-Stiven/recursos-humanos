public class ServicioReporteEmpleado {

    public String generarReporte(Empleado empleado) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Reporte de Empleado ===\n");
        sb.append("Nombre: ").append(empleado.getNombre()).append("\n");
        sb.append("Horas trabajadas: ").append(empleado.getHorasTrabajadas()).append("\n");
        sb.append("Tarifa por hora: ").append(empleado.getTarifaHora()).append("\n");
        sb.append("Salario total: ").append(empleado.calcularSalario()).append("\n");
        sb.append("===========================\n");
        return sb.toString();
    }

    public ServicioReporteEmpleado() {

    }
}
