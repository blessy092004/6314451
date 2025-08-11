import java.util.Arrays;
public class EcommerceSearchExample{
    static class Product implements Comparable<Product>{
        int productId;
        String productName;
        String category;
        public Product(int productId,String productName,String category){
            this.productId=productId;
            this.productName=productName;
            this.category=category;
        }
        public String toString(){
            return "ProductID: "+productId + ", Name: " + productName + ", Category: " + category;
        }
        @Override
        public int compareTo(Product other){
            return this.productId-other.productId;        
}
    }
    static Product linearSearch(Product[] products,int targetId){
        for (Product product : products){
            if (product.productId==targetId){
                return product;
            }
        }
        return null;
    }
    static Product binarySearch(Product[] products,int targetId){
        int left = 0,right=products.length-1;
        while (left<= right) {
            int mid=left+(right-left)/2;
            if(products[mid].productId==targetId){
                return products[mid];
            } else if(products[mid].productId<targetId){
                left=mid + 1;
            } else {
                right=mid - 1;
            }
        }

        return null;
    }
    static void explainAsymptoticNotation(){
        System.out.println("Asymptotic Notation");
        System.out.println("Big O notation describes the upper bound of time complexity.");
        System.out.println("Linear Search: O(n) – Worst case, every item is checked.");
        System.out.println("Binary Search: O(log n) – Efficient on sorted data.\n");
        System.out.println("Best Case: First item is match.");
        System.out.println("Average Case: Item is in the middle.");
        System.out.println("Worst Case: Item is at the end or not present.\n");
    }
    public static void main(String[] args){
        explainAsymptoticNotation();

        Product[] products ={
            new Product(203, "Shoes", "Foot"),
            new Product(201, "Laptop", "Electronics"),
            new Product(204, "T-Shirt", "Cloth"),
            new Product(202, "Mobile", "Electronics")
        };
        System.out.println("Linear Search");
        Product foundLinear=linearSearch(products,203);
        System.out.println(foundLinear!=null ? foundLinear : "Product not found.");
        System.out.println("\nBinary Search");
        Arrays.sort(products); 
        Product foundBinary=binarySearch(products,203);
        System.out.println(foundBinary != null ? foundBinary : "Product not found.");
        System.out.println("\nAnalysis");
        System.out.println("Linear Search: O(n), simple but slow on large data.");
        System.out.println("Binary Search: O(log n), much faster but needs sorted data.");
        System.out.println("Conclusion: Use Binary Search for better performance in large, sorted datasets.");
    }
}
