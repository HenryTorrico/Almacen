public interface Producto {
    boolean estaDisponible(int cant);
    int calcularTarifa(int cant);  
    int getCant();
    int getPrecio();
    String getNombre();
}