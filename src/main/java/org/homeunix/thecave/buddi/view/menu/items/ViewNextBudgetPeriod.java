/*
 * Created on Aug 6, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.items;

import ca.digitalcave.moss.swing.MossMenuItem;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.plugin.api.util.TextFormatter;
import org.homeunix.thecave.buddi.view.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ViewNextBudgetPeriod extends MossMenuItem{
	public static final long serialVersionUID = 0;

	public ViewNextBudgetPeriod(MainFrame frame) {
		super(frame, TextFormatter.getTranslation(MenuKeys.MENU_VIEW_NEXT_BUDGET_PERIOD),
				KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() + KeyEvent.SHIFT_DOWN_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((MainFrame) getFrame()).getMyBudgetPanel().setNextPeriod();
	}
}
