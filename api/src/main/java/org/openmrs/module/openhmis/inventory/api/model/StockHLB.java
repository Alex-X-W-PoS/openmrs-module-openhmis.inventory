/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.openhmis.inventory.api.model;

import org.openmrs.module.openhmis.commons.api.entity.model.BaseSerializableOpenmrsMetadata;
import java.util.Date;
/**
 *
 * @author Alex
 */
public class StockHLB extends BaseSerializableOpenmrsMetadata {
    public static final long serialVersionUID = 576L;
    
    private Integer stockHLBId;
    private String medicina;
    private Integer cantidad;
    private String unidad;
    private String proveedor;
    private String lote;
    private String factura;
    private Float costo;
    private Date fechaExp;
    
    public StockHLB() {}
    
    public StockHLB(Integer stockID){
        this.stockHLBId = stockID;
    }

    public Integer getStockHLBId() {
        return stockHLBId;
    }

    public void setStockHLBId(Integer stockHLBId) {
        this.stockHLBId = stockHLBId;
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Date getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(Date fechaExp) {
        this.fechaExp = fechaExp;
    }

    @Override
    public Integer getId() {
        return stockHLBId;
    }

    @Override
    public void setId(Integer id) {
        this.stockHLBId = id;
    }
    
    
    
}
