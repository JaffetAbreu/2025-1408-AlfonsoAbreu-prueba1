public class Tarea {
    private String descripcion;
    private String fechaLimite;
    private String prioridad;
    private String categoria;
    private boolean completada;

    public Tarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.categoria = categoria;
        this.completada = false; // por defecto no está completada
    }

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isCompletada() {
        return completada;
    }

    // Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Descripción: " + descripcion +
                "\nFecha límite: " + fechaLimite +
                "\nPrioridad: " + prioridad +
                "\nCategoría: " + categoria +
                "\nCompletada: " + (completada ? "Sí" : "No");
    }

    public void mostrarInfo(int i) {
    }

    public void marcarComoCompletada() {
    }

    public void editarTarea(String descripcion, String fechaLimite, String prioridad, String categoria) {
    }
}
