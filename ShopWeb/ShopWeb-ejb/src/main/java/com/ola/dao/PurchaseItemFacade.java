/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.dao;

import com.ola.shopwebapi.model.PurchaseItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Olaa
 */
@Stateless
public class PurchaseItemFacade extends AbstractFacade<PurchaseItem> implements com.ola.dao.PurchaseItemFacadeRemote {
    @PersistenceContext(unitName = "com.ola_ShopWeb-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseItemFacade() {
        super(PurchaseItem.class);
    }
    
}
