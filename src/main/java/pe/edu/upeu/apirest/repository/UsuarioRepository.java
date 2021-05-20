package pe.edu.upeu.apirest.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.apirest.entity.Usuario;
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
}