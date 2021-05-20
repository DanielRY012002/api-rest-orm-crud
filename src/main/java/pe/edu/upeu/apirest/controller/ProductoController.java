package pe.edu.upeu.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.apirest.entity.Producto;
import pe.edu.upeu.apirest.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	ProductoService productoService;
	@GetMapping("/producto")
	public String mensaje() {
		return "Producto Controller";
	}
	@GetMapping("/prod")
	public List<Producto>readAll(){
		return productoService.readAll();
	}
	@GetMapping("/prod/{id}")
	public Producto read(@PathVariable Long id){
		return productoService.read(id);
	}
	@DeleteMapping("prod/delete/{id}")
	public String delete(@PathVariable Long id) {
		productoService.delete(id);
		return "Eliminado";
	}
	@PostMapping("/prod/create")
	public Producto create(@RequestBody Producto prod) {
		return productoService.create(prod);
	}
	@PutMapping("/user/update/{id}")
	public Producto update(@PathVariable Long id,@RequestBody Producto producto) {
		Producto p=productoService.read(id);
		p.setNombre(producto.getNombre());
		p.setPrecio(producto.getPrecio());
		p.setStock(producto.getStock());
		return productoService.update(p);
	}
}
