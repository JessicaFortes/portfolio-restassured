package enums;

public enum Endpoints {
    API_PRODUCTS("https://fakestoreapi.com/products");

    private final String resource;

    // Construtor privado
    private Endpoints(String resource) {
        this.resource = resource;
    }

    // Método para obter o recurso
    public String getResource() {
        return this.resource;
    }
}
