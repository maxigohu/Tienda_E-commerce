import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import com.edutech.sistema.service.EnriquecimientoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
@Tag(name = "Producto Controller", description = "Operaciones relacionadas con productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Obtener todos los productos
    @Operation(summary = "Obtener lista de productos", description = "Recupera una lista de todos los productos disponibles.")
    @ApiResponse(responseCode = "200", description = "Lista de productos recuperada exitosamente")
    @GetMapping
    public List<Object> obtenerProductos() {
        return productoService.obtenerProductos();
    }


    //Crear Producto
    @Operation(summary = "Crear un nuevo producto", description = "Crea un nuevo producto en el inventario.")
    @ApiResponse(responseCode = "201", description = "Producto creado exitosamente")
    @PostMapping
    public Object crearProducto(@RequestBody Object producto) {
        return productoService.crearProducto(producto);
    }

    //Actualizar Producto
    @Operation(summary = "Actualizar un producto existente", description = "Actualiza los detalles de un producto existente en el inventario.")
    @ApiResponse(responseCode = "200", description = "Producto actualizado exitosamente")
    @PutMapping("/{id}")
    public Object actualizarProducto(@PathVariable Long id, @RequestBody Object producto) {
        return productoService.actualizarProducto(id, producto);
    }

    //Eliminar Producto
    @Operation(summary = "Eliminar un producto", description = "Elimina un producto del inventario.")
    @ApiResponse(responseCode = "204", description = "Producto eliminado exitosamente")
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }


    // Obtener Producto por ID
    @Operation(summary = "Obtener un producto por ID", description = "Recupera un producto específico utilizando su ID.")
    @ApiResponse(responseCode = "200", description = "Producto recuperado exitosamente")
    @GetMapping("/{id}")
    public Object obtenerProductoPorId(@PathVariable Long id) {
        return productoService.obtenerProductoPorId(id);
    }
}
