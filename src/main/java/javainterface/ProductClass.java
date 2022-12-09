package javainterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductClass {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();
        list.add(new Product("heater","Electric",102,100));
        list.add(new Product("story","Books",100,400));
        list.add(new Product("cooker","Electric",142,10000));
        list.add(new Product("laptop","Electric",645,45000));
        Stream<Product> productStream=list.stream();
     //  double sum= productStream.filter(a->a.getCategory().equalsIgnoreCase("electric")).map(a->a.getPrice()).reduce(0,(m,n)->m+n);
       //System.out.println(sum);
        productStream.filter(a->a.getPrice()<500 && a.getCategory()=="Electric").
                forEach(x->System.out.println(x.getProductName()));
       // System.out.println(price);

    }
}
