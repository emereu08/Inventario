package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;

import java.util.List;

public interface ProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);
}
