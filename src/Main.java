public class Main {
    public static void main(String[] args) {
        Product product =new Product();
        product.setId(1);
        product.name= "PC";
        product.price = 1500;
        product.description = "Lenovo 3200";
        product.stockAmount = 15;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        product.getKod();
        System.out.println(product.getKod());
    }
}