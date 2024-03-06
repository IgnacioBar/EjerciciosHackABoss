package com.mycompany.pruebatecnica1.logica;

import com.mycompany.pruebatecnica1.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEmpleado(Empleado emple) {
        controlPersis.crearEmpleado();

    }

    public List<Empleado> traerEmpleados() {
        return controlPersis.traerEmpleados();
        
    }

    public void eliminarEmpleado(int idEliminar) {
        controlPersis.eliminarEmpleado(idEliminar);
    }

    public Empleado buscarEmpleado(int idEditar) {
        return controlPersis.buscarEmpleado(idEditar);
    }

    public void editarEmpleado(Empleado empleEdit) {
        controlPersis.editarEmpleado(empleEdit);
    }

    public List<Empleado> buscarEmpleadoCargo(String cargo) {
        return controlPersis.buscarEmpleadoCargo(cargo);
    }

}
