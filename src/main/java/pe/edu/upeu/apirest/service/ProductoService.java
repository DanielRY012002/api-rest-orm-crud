package pe.edu.upeu.apirest.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.apirest.entity.Producto;
import pe.edu.upeu.apirest.repository.ProductoRepository;
@Service
public class ProductoService {
	@Autowired
	ProductoRepository productoRepository;
	public Producto create(Producto producto) {
		return productoRepository.save(producto);
	}
	public Producto read(Long id){
		return productoRepository.findById(id).get();
	}
	public Producto update(Producto producto) {
		return productoRepository.save(producto);
	}
	public void delete(Long id) {
		productoRepository.deleteById(id);
	}
	public List<Producto>readAll(){
		List<Producto>lista=new ArrayList<>();
		productoRepository.findAll().forEach(lista::add);
		return lista;
	}
}