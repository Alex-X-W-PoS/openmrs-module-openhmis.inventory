/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.webservices.rest.resource;

import org.openmrs.annotation.Handler;
import org.openmrs.module.openhmis.commons.api.entity.IMetadataDataService;
import org.openmrs.module.openhmis.inventory.api.IStockHLBDataService;
import org.openmrs.module.openhmis.inventory.api.model.StockHLB;
import org.openmrs.module.openhmis.inventory.web.ModuleRestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
/**
 *
 * @author Alex
 */
@Resource(name = ModuleRestConstants.STOCK_HLB_RESOURCE, supportedClass = StockHLB.class,
        supportedOpenmrsVersions = { "1.9.*", "1.10.*", "1.11.*", "1.12.*", "2.*" })
@Handler(supports = { StockHLB.class }, order = 0)
public class StockHLBResource extends BaseRestMetadataResource<StockHLB>{
    @Override
	public DelegatingResourceDescription getRepresentationDescription(Representation rep) {
		DelegatingResourceDescription description = super.getRepresentationDescription(rep);
		description.addProperty("medicina");
                description.addProperty("cantidad");
                description.addProperty("unidad");
                description.addProperty("proveedor");
                description.addProperty("lote");
                description.addProperty("factura");
                description.addProperty("costo");
                description.addProperty("fecha_exp");
                
		return description;
	}
        
        @Override
	public StockHLB newDelegate() {
		return new StockHLB();
	}

	@Override
	public Class<? extends IMetadataDataService<StockHLB>> getServiceClass() {
		return IStockHLBDataService.class;
	}
}
