package com.universidad.gestionestudiantes.controller;

import com.universidad.gestionestudiantes.model.Estudiante;
import com.universidad.gestionestudiantes.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return estudianteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Estudiante> obtenerEstudiante(@PathVariable Long id) {
        return estudianteService.obtenerPorId(id);
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @DeleteMapping("/{id}")
    public String eliminarEstudiante(@PathVariable Long id) {
        estudianteService.eliminar(id);
        return "Estudiante eliminado";
    }
}
