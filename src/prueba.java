import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE GESTIÓN DE TAREAS =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Editar tarea");
            System.out.println("5. Listar tareas pendientes");
            System.out.println("6. Listar tareas completadas");
            System.out.println("7. Eliminar tarea");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String desc = sc.nextLine();
                    System.out.print("Fecha límite: ");
                    String fecha = sc.nextLine();
                    System.out.print("Prioridad (Alta, Media, Baja): ");
                    String prioridad = sc.nextLine();
                    System.out.print("Categoría (Trabajo, Estudio, Personal, Otro): ");
                    String categoria = sc.nextLine();
                    gestor.agregarTarea(new Tarea(desc, fecha, prioridad, categoria));
                    break;

                case 2:
                    gestor.listarTareas();
                    break;

                case 3:
                    System.out.print("Ingrese el número de tarea a completar: ");
                    int numCompletar = sc.nextInt();
                    gestor.marcarTareaComoCompletada(numCompletar);
                    break;

                case 4:
                    System.out.print("Ingrese el número de tarea a editar: ");
                    int numEditar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = sc.nextLine();
                    System.out.print("Nueva fecha límite: ");
                    String nuevaFecha = sc.nextLine();
                    System.out.print("Nueva prioridad: ");
                    String nuevaPrioridad = sc.nextLine();
                    System.out.print("Nueva categoría: ");
                    String nuevaCategoria = sc.nextLine();
                    gestor.editarTarea(numEditar, nuevaDesc, nuevaFecha, nuevaPrioridad, nuevaCategoria);
                    break;

                case 5:
                    gestor.listarTareasPorEstado(false);
                    break;

                case 6:
                    gestor.listarTareasPorEstado(true);
                    break;

                case 7:
                    System.out.print("Ingrese el número de tarea a eliminar: ");
                    int numEliminar = sc.nextInt();
                    gestor.eliminarTarea(numEliminar);
                    break;

                case 8:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 8);
    }
}
