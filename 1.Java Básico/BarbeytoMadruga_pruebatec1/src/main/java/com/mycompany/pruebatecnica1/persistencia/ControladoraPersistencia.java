package com.mycompany.pruebatecnica1.persistencia;

import com.mycompany.pruebatecnica1.logica.Empleado;
import com.mycompany.pruebatecnica1.persistencia.exceptions.NonexistentEntityException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    EmpleadoJpaController empleJpa = new EmpleadoJpaController();
        Scanner scanner = new Scanner(System.in);
        
    public void crearEmpleado() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Fecha de Inicio (DD-MM-YYYY): ");
            String fechaInicio = scanner.nextLine();

            if (salario < 0) {
                throw new IllegalArgumentException("Error: El salario no puede ser negativo.");
            }

            Empleado emple = new Empleado(nombre, apellido, cargo, salario, fechaInicio);

            empleJpa.create(emple);

            System.out.println("\nEmpleado agregado correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un valor numérico para el salario.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido: " + e.getMessage());
        }
    }

    public List<Empleado> traerEmpleados() {
        return empleJpa.findEmpleadoEntities();
    }

    public void eliminarEmpleado(int idEliminar) {
        try {
            empleJpa.destroy(idEliminar);
            System.out.println("\nEmpleado con ID " + idEliminar + " eliminado con éxito.");
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.OFF, null, ex);
        }
    }

    public Empleado buscarEmpleado(int idEditar) {
        return empleJpa.findEmpleado(idEditar);
    }

    public void editarEmpleado(Empleado empleEdit) {
        try {
            System.out.println("\nIngrese la nueva información del empleado:\n");

            System.out.print("Nuevo Nombre: ");
            String nuevoNombre = scanner.nextLine();

            System.out.print("Nuevo Apellido: ");
            String nuevoApellido = scanner.nextLine();

            System.out.print("Nuevo Cargo: ");
            String nuevoCargo = scanner.nextLine();

            System.out.print("Nuevo Salario: ");
            double nuevoSalario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nueva Fecha de Inicio (DD-MM-YYYY): ");
            String nuevaFechaInicio = scanner.nextLine();

            empleEdit.setNombre(nuevoNombre);
            empleEdit.setApellido(nuevoApellido);
            empleEdit.setCargo(nuevoCargo);
            empleEdit.setSalario(nuevoSalario);
            empleEdit.setFechaInicio(nuevaFechaInicio);

            System.out.println("Información del empleado actualizada correctamente.");

            empleJpa.edit(empleEdit);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un valor válido para el salario.");
            scanner.nextLine();
        } catch (Exception ex) {
            System.out.println("Error al editar el empleado. Por favor, inténtelo de nuevo.");
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Empleado> buscarEmpleadoCargo(String cargo) {
        return empleJpa.findEmpleadoByCargo(cargo);
    }

}
