/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.webservices.rest.search;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openmrs.api.context.Context;
import org.openmrs.module.openhmis.commons.api.PagingInfo;
import org.openmrs.module.openhmis.inventory.api.IStockHLBDataService;
import org.openmrs.module.openhmis.inventory.api.model.StockHLB;
import org.openmrs.module.openhmis.inventory.web.ModuleRestConstants;
import org.openmrs.module.webservices.rest.resource.AlreadyPagedWithLength;
import org.openmrs.module.webservices.rest.resource.PagingUtil;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.resource.api.PageableResult;
import org.openmrs.module.webservices.rest.web.resource.api.SearchConfig;
import org.openmrs.module.webservices.rest.web.resource.api.SearchHandler;
import org.openmrs.module.webservices.rest.web.resource.api.SearchQuery;
import org.openmrs.module.webservices.rest.web.response.ResponseException;
import org.springframework.stereotype.Component;
/**
 *
 * @author Alex
 */
@Component
public class StockHLBSearchHandler implements SearchHandler {
    
    private final SearchConfig searchConfig = new SearchConfig("default", ModuleRestConstants.STOCK_HLB_RESOURCE,
	        Arrays.asList("*"),
	        Arrays.asList(
	                new SearchQuery.Builder("Find a stock hlb by its name")
	                        .withRequiredParameters("q")
	                        .build()
	                )
	        );
    
    @Override
    public SearchConfig getSearchConfig() {
        return searchConfig;
    }

    @Override
    public PageableResult search(RequestContext context) throws ResponseException {
        String query = context.getParameter("q");
		IStockHLBDataService service = Context.getService(IStockHLBDataService.class);
		PagingInfo pagingInfo = PagingUtil.getPagingInfoFromContext(context);

		List<StockHLB> stockshlb;
		if (StringUtils.isBlank(query)) {
			stockshlb = service.getAll(context.getIncludeAll(), pagingInfo);
		} else {
			stockshlb = service.getByNameFragment(query, context.getIncludeAll(), pagingInfo);
		}

		AlreadyPagedWithLength<StockHLB> results =
		        new AlreadyPagedWithLength<StockHLB>(context, stockshlb, pagingInfo.hasMoreResults(),
		                pagingInfo.getTotalRecordCount());
		return results;
    }
    
}
