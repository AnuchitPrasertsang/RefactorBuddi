/*
 * Created on Aug 26, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.model.impl;

import ca.digitalcave.moss.common.DateUtil;
import org.homeunix.thecave.buddi.i18n.keys.BudgetCategoryTypes;
import org.homeunix.thecave.buddi.model.BudgetCategoryType;

import java.util.Date;

/**
 * Definition of a Quarterly BudgetCategoryType
 * @author wyatt
 *
 */
public class BudgetCategoryTypeQuarterly extends BudgetCategoryType {
	
	public Date getStartOfBudgetPeriod(Date date) {
		return DateUtil.getStartOfQuarter(date);
	}
	
	public Date getEndOfBudgetPeriod(Date date) {
		return DateUtil.getEndOfQuarter(date);
	}
	
	public Date getBudgetPeriodOffset(Date date, int offset) {
		return getStartOfBudgetPeriod(DateUtil.addQuarters(date, offset));
	}
	
	public long getDaysInPeriod(Date date) {
		return DateUtil.getDaysBetween(getStartOfBudgetPeriod(date), getEndOfBudgetPeriod(date), true);
	}
	
	public String getDateFormat() {
		return "MMM yyyy";
	}
			
	public String getName() {
		return BudgetCategoryTypes.BUDGET_CATEGORY_TYPE_QUARTER.toString();
	}
	@Override
	public String getKey() {
		return "QUARTER";
	}
}