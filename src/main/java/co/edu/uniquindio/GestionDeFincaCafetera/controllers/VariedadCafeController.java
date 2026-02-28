package co.edu.uniquindio.GestionDeFincaCafetera.controllers;

import co.edu.uniquindio.GestionDeFincaCafetera.entities.VariedadCafe;
import co.edu.uniquindio.GestionDeFincaCafetera.services.VariedadCafeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cafes")
public class VariedadCafeController {

    private final VariedadCafeService variedadCafeService;

    public VariedadCafeController(VariedadCafeService variedadCafeService) {
        this.variedadCafeService = variedadCafeService;
    }

    @PostMapping
    public ResponseEntity<VariedadCafe> registrarVariedad(@RequestBody VariedadCafe variedad) {
        VariedadCafe guardada = variedadCafeService.guardarVariedad(variedad);
        return new ResponseEntity<>(guardada, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<VariedadCafe>> obtenerVariedades() {
        List<VariedadCafe> lista = variedadCafeService.listarVariedades();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
}
