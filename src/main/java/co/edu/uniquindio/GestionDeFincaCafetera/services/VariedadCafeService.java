package co.edu.uniquindio.GestionDeFincaCafetera.services;

import co.edu.uniquindio.GestionDeFincaCafetera.entities.VariedadCafe;
import co.edu.uniquindio.GestionDeFincaCafetera.repositories.VariedadCafeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariedadCafeService {

    private final VariedadCafeRepository variedadCafeRepository;

    public VariedadCafeService(VariedadCafeRepository variedadCafeRepository) {
        this.variedadCafeRepository = variedadCafeRepository;
    }

    public VariedadCafe guardarVariedad(VariedadCafe variedad) {
        return variedadCafeRepository.save(variedad);
    }

    public List<VariedadCafe> listarVariedades() {
        return variedadCafeRepository.findAll();
    }
}
