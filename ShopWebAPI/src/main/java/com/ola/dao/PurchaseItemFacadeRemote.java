/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.dao;

import com.ola.shopwebapi.model.PurchaseItem;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Olaa
 */
@Remote
public interface PurchaseItemFacadeRemote {

    void create(PurchaseItem purchaseItem);

    void edit(PurchaseItem purchaseItem);

    void remove(PurchaseItem purchaseItem);

    PurchaseItem find(Object id);

    List<PurchaseItem> findAll();

    List<PurchaseItem> findRange(int[] range);

    int count();
    
}
