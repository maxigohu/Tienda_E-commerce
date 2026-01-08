package com.tiendabenito.cl.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


@Service
public class ProductoService {

private final ProductoRepository repo;

public ProductoService(ProductoRepository repo) {
    this.repo = repo;

public List<Object> obtenerProductos() {
    return repo.findAll();

public Object crearProducto(Object producto) {
    return repo.save(producto);

public Object actualizarProducto(Long id, Object producto) {
    producto.setId(id);
    return repo.save(producto);

public void eliminarProducto(Long id) {
    repo.deleteById(id);
    
}
