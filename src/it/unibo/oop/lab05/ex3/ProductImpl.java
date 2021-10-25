package it.unibo.oop.lab05.ex3;

import java.util.Objects;

public class ProductImpl implements Product {

    private final String name; 
    private final double quantity;
    
    public ProductImpl(String name, double quantity) {
	this.name=name;
	this.quantity=quantity;
    }
    
    public String getName() {
	return this.name;
    }

    public double getQuantity() {
	return quantity;
    }

    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	ProductImpl other = (ProductImpl) obj;
	return Objects.equals(name, other.name);
    }
    
    public String toString() {
	return "Product: "+this.getName()+", "+this.getQuantity();
    }
    

}
