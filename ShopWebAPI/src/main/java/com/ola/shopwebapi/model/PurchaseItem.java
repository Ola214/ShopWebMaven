/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ola.shopwebapi.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Olaa
 */
@Entity
@Table(name = "PURCHASE_ITEM")
@NamedQueries({
    @NamedQuery(name = "PurchaseItem.findAll", query = "SELECT p FROM PurchaseItem p")})
public class PurchaseItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private BigInteger quantity;
    @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID")
    @ManyToOne
    private Product idProduct;
    @OneToMany(mappedBy = "idPurchase")
    private List<PurchaseItem> purchaseItemList;
    @JoinColumn(name = "ID_PURCHASE", referencedColumnName = "ID")
    @ManyToOne
    private PurchaseItem idPurchase;

    public PurchaseItem() {
    }

    public PurchaseItem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public List<PurchaseItem> getPurchaseItemList() {
        return purchaseItemList;
    }

    public void setPurchaseItemList(List<PurchaseItem> purchaseItemList) {
        this.purchaseItemList = purchaseItemList;
    }

    public PurchaseItem getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(PurchaseItem idPurchase) {
        this.idPurchase = idPurchase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseItem)) {
            return false;
        }
        PurchaseItem other = (PurchaseItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ola.shopwebapi.PurchaseItem[ id=" + id + " ]";
    }
    
}
