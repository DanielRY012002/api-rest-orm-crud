package pe.edu.upeu.apirest.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.apirest.entity.Usuario;
import pe.edu.upeu.apirest.repository.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository userep;
	public Usuario create(Usuario user) {
		return userep.save(user);
	}
	public Usuario read(Long id) {
		return userep.findById(id).get();
	}
	public Usuario update(Usuario user) {
		return userep.save(user);
	}
	public void delete(Long id) {
		userep.deleteById(id);
	}
	public List<Usuario>readAll(){
		List<Usuario>lista=new ArrayList<>();
		userep.findAll().forEach(lista::add);
		return lista;
	}
}