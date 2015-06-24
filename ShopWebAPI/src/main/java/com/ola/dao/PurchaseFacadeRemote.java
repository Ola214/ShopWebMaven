/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.dao;

import com.ola.shopwebapi.model.Purchase;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Olaa
 */
@Remote
public interface PurchaseFacadeRemote {

    void create(Purchase purchase);

    void edit(Purchase purchase);

    void remove(Purchase purchase);

    Purchase find(Object id);

    List<Purchase> findAll();

    List<Purchase> findRange(int[] range);

    int count();
    
}
