import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Object, Long> {
    Optional<Object> findById(Long id);
}
