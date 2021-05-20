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

import pe.edu.upeu.apirest.entity.Usuario;
import pe.edu.upeu.apirest.service.UsuarioService;

@RestController
public class UsuarioController {
	@Autowired
	UsuarioService usuarioservice;
	@GetMapping("/usuario")
	public String mensaje() {
		return "Usuario Controller";
	}
	@GetMapping("/user")
	public List<Usuario> readAll(){
		return usuarioservice.readAll();
	}
	@GetMapping("/user/{id}")
	public Usuario read(@PathVariable Long id) {
		return usuarioservice.read(id);
	}
	@DeleteMapping("/user/delete/{id}")
	public String delete(@PathVariable Long id) {
		usuarioservice.delete(id);
		return "Eliminado";
	}
	@PostMapping("/user")
	public Usuario save(@RequestBody Usuario user) {
		return usuarioservice.create(user);
	}
	@PutMapping("/user/update/{id}")
	public Usuario update(@PathVariable Long id,@RequestBody Usuario user) {
		Usuario u =usuarioservice.read(id);
		u.setPassword(user.getPassword());
		u.setUsername(user.getUsername());
		return usuarioservice.update(u);
	}
}
