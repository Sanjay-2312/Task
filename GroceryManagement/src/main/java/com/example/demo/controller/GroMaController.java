package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.GroMa;
import com.example.demo.repository.GroMaRepo;
@RestController
public class GroMaController {
	@Autowired
	private GroMaRepo repo;
	@PostMapping("/addproduct")
	public GroMa addproduct(@RequestBody GroMa product) {
		try {
			repo.save(product);
			return product;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@GetMapping("/getproduct")
	public List<GroMa> getproduct(){
		try {
			return repo.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PutMapping("/updateproduct")
	public GroMa updateproduct(@RequestBody GroMa product) {
		try {
			repo.save(product);
			return product;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@DeleteMapping("/deleteproduct/{Id}")
	public GroMa deleteproduct(@PathVariable int Id) {
		try {
			GroMa product = repo.getOne(Id);
			repo.delete(product);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}