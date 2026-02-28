package co.edu.uniquindio.GestionDeFincaCafetera.repositories;

import co.edu.uniquindio.GestionDeFincaCafetera.entities.VariedadCafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariedadCafeRepository extends JpaRepository<VariedadCafe, Long> {
}
