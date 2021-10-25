package it.unibo.oop.lab05.ex3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

    Collection<Product> warehouse = new LinkedHashSet<>();

    public void addProduct(Product p) {
	warehouse.add(p);
    }

    public Set<String> allNames() {
	Set<String> names=new LinkedHashSet<String>();
	for(Product elem: warehouse) {
	    names.add((elem.getName()));
	}
	return names;
    }

    public Set<Product> allProducts() {
	return new LinkedHashSet<Product>(warehouse);
    }

    public boolean containsProduct(Product p) {
	return warehouse.contains(p);
    }

    public double getQuantity(String name) {
	var product = new ProductImpl(name, -1);
	if (warehouse.contains(product)) {
	    for (Product elem : warehouse) {
		if (elem.equals(product)) {
		    return elem.getQuantity();
		}
	    }
	}
	return product.getQuantity();
    }
    
    public String toString() {
	return "Warehouse";
    }

}
