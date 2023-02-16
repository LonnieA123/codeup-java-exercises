public class Product {

    private String name;
    private float priceInCents;


    //setters
        public void setName(String name){
            this.name = name;
        }

        public void setPrice(float price){
            this.priceInCents = price;
        }

    //getters
        public String getName(){
            return this.name;
        }

        public float getPrice(){
            return this.priceInCents;
        }

    public Product(String name, float price){
        this.name = name;
        this.priceInCents = price;
    }

    static Product[] items = {
      new Product("cheese", 5.00F),
      new Product("bread", 4.00F),
      new Product("butter", 2.00F)
    };

    public static int findAveragePrice(Product[] items){
        int sum = 0;

        for (Product item : items){
            sum += item.priceInCents;
        }
        return sum / items.length;
    }

    public static void main(String[] args) {
        System.out.println(findAveragePrice(items));
    }


}
