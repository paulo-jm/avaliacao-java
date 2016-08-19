package br.com.avaliacao.checkout.model;

import org.junit.Assert;
import org.junit.Test;

public class CartTest {
	
	@Test
	public void addItemTest(){
		
		Produto p = new Produto();
        p.setCodigo("111");
        p.setNome("nome_1");
        p.setMarca("marca_1");
        p.setPreco(Double.valueOf("2.5"));

        CartItem item = new CartItem();
        item.setProduto(p);
        item.setQuantity(Integer.valueOf(1));
                
        Cart cart = new Cart();
        cart.setCartId("1");
        cart.addItem(item);
        
        Assert.assertFalse(cart.getItems().isEmpty());
        Assert.assertTrue(cart.getItems().size() == 1);
        Assert.assertTrue(cart.getItems().get(0).getQuantity().equals(Integer.valueOf(1)));
        
        item = new CartItem();
        item.setProduto(p);
        item.setQuantity(Integer.valueOf(2));
        
        cart.addItem(item);
        
        Assert.assertFalse(cart.getItems().isEmpty());
        Assert.assertTrue(cart.getItems().size() == 1);
        Assert.assertTrue(cart.getItems().get(0).getQuantity().equals(Integer.valueOf(3)));
		
        
        Produto p2 = new Produto();
        p2.setCodigo("2222");
        p2.setNome("nome_2");
        p2.setMarca("marca_2");
        p2.setPreco(Double.valueOf("2.5"));

        CartItem item2 = new CartItem();
        item2.setProduto(p2);
        item2.setQuantity(Integer.valueOf(1));
        
        cart.addItem(item2);
        
        Assert.assertTrue(cart.getItems().size() == 2);
	}
	
}
