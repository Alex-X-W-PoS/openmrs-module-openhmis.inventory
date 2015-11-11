/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and
 * limitations under the License.
 *
 * Copyright (C) OpenHMIS.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.resource;

import org.openmrs.module.openhmis.commons.api.entity.IMetadataDataService;
import org.openmrs.module.openhmis.inventory.api.IStockOperationAttributeTypeDataService;
import org.openmrs.module.openhmis.inventory.api.model.StockOperationAttributeType;
import org.openmrs.module.openhmis.inventory.web.ModuleRestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;

/**
 * REST resource representing a {@link StockOperationAttributeType}.
 */
@Resource(name = ModuleRestConstants.OPERATION_ATTRIBUTE_TYPE_RESOURCE, supportedClass = StockOperationAttributeType.class,
        supportedOpenmrsVersions = { "1.9.*", "1.10.*", "1.11.*", "1.12.*" })
public class StockOperationAttributeTypeResource
        extends BaseRestAttributeTypeResource<StockOperationAttributeType> {
	@Override
	public StockOperationAttributeType newDelegate() {
		return new StockOperationAttributeType();
	}

	@Override
	public Class<? extends IMetadataDataService<StockOperationAttributeType>> getServiceClass() {
		return IStockOperationAttributeTypeDataService.class;
	}
}