/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.openhmis.inventory.api;

import org.openmrs.module.openhmis.commons.api.entity.IMetadataDataService;
import org.openmrs.module.openhmis.inventory.api.model.StockHLB;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Alex
 */
@Transactional
public interface IStockHLBDataService extends IMetadataDataService<StockHLB>{
    
}
