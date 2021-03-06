/*
 * Created on Aug 7, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.swing;

import org.homeunix.thecave.buddi.model.ScheduledTransaction;

import javax.swing.*;
import java.awt.*;

public class ScheduledTransactionListCellRenderer extends DefaultListCellRenderer {
	public static final long serialVersionUID = 0;

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

		if (value instanceof ScheduledTransaction)
			this.setText(((ScheduledTransaction) value).getScheduleName());
		else
			this.setText("");
		
		return this;
	}
}
