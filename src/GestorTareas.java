import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea t) {
        listaTareas.add(t);
        System.out.println("✅ Tarea agregada con éxito.");
    }

    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("📭 No hay tareas registradas.");
        } else {
            for (int i = 0; i < listaTareas.size(); i++) {
                listaTareas.get(i).mostrarInfo(i + 1);
            }
        }
    }

    public void listarTareasPorEstado(boolean completadas) {
        boolean encontrado = false;
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).isCompletada() == completadas) {
                listaTareas.get(i).mostrarInfo(i + 1);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("⚠ No hay tareas con ese estado.");
        }
    }

    public void marcarTareaComoCompletada(int numeroTarea) {
        int indice = numeroTarea - 1;
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).marcarComoCompletada();
            System.out.println("✅ Tarea marcada como completada.");
        } else {
            System.out.println("❌ Número de tarea inválido.");
        }
    }

    public void editarTarea(int numeroTarea, String descripcion, String fechaLimite, String prioridad, String categoria) {
        int indice = numeroTarea - 1;
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.get(indice).editarTarea(descripcion, fechaLimite, prioridad, categoria);
            System.out.println("✏ Tarea editada con éxito.");
        } else {
            System.out.println("❌ Número de tarea inválido.");
        }
    }

    public void eliminarTarea(int numeroTarea) {
        int indice = numeroTarea - 1;
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
            System.out.println("🗑 Tarea eliminada con éxito.");
        } else {
            System.out.println("❌ Número de tarea inválido.");
        }
    }
}
