package pe.edu.upeu.apirest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.apirest.entity.Producto;
import pe.edu.upeu.apirest.service.ProductoService;
import pe.edu.upeu.apirest.service.UsuarioService;

@SpringBootTest
class ApiRestG2ApplicationTests {
	@Autowired
	UsuarioService user;
	@Autowired
	ProductoService product;
	@Test
	void contextLoads() {
		System.out.println(user.readAll().get(0).getUsername());
		System.out.println(product.readAll().get(0).getNombre());
	}

}
