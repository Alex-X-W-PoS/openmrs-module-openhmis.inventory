/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.openhmis.inventory.api.impl;

import org.openmrs.module.openhmis.commons.api.entity.impl.BaseMetadataDataServiceImpl;
import org.openmrs.module.openhmis.commons.api.entity.security.IMetadataAuthorizationPrivileges;
import org.openmrs.module.openhmis.inventory.api.IStockHLBDataService;
import org.openmrs.module.openhmis.inventory.api.model.StockHLB;
import org.openmrs.module.openhmis.inventory.api.security.BasicMetadataAuthorizationPrivileges;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Alex
 */
@Transactional
public class StockHLBDataServiceImpl extends BaseMetadataDataServiceImpl<StockHLB> implements IStockHLBDataService {

    @Override
    protected IMetadataAuthorizationPrivileges getPrivileges() {
        return new BasicMetadataAuthorizationPrivileges();
    }

    @Override
    protected void validate(StockHLB e) {
        return;
    }
    
}
