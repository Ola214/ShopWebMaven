/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.dao;

import com.ola.shopwebapi.model.Product;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Olaa
 */
@Remote
public interface ProductFacadeRemote {

    void create(Product product);

    void edit(Product product);

    void remove(Product product);

    Product find(Object id);

    List<Product> findAll();

    List<Product> findRange(int[] range);

    int count();
    
}
