package com.wipro.DsQueue;

import java.util.Comparator;

public class ProdPriceComparator implements Comparator<Product> {

//	public int compare(Product pd1, Product pd2) {
//		
//		return Double.compare(pd2.getProdPrice(), pd1.getProdPrice());
//	}
	
	@Override
    public int compare(Product pd1, Product pd2) {
        
        return Integer.compare(pd1.getProdId(), pd2.getProdId());
    }
}
