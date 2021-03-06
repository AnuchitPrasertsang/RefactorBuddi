/*
 * Created on Aug 6, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.items;

import ca.digitalcave.moss.swing.MossFrame;
import ca.digitalcave.moss.swing.MossMenuItem;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.model.prefs.PrefsModel;
import org.homeunix.thecave.buddi.view.TransactionFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class EditClearAndAdvanceTransaction extends MossMenuItem {
	public static final long serialVersionUID = 0;

	public EditClearAndAdvanceTransaction(MossFrame frame) {
		super(frame, PrefsModel.getInstance().getTranslator().get(MenuKeys.MENU_EDIT_CLEAR_AND_ADVANCE),
				KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() + KeyEvent.SHIFT_MASK));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		((TransactionFrame) getFrame()).doClickClearAndAdvance();
	}
}
