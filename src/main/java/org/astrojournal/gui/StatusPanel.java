/*
 * This file is part of AstroJournal.
 * AstroJournal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * AstroJournal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with AstroJournal. If not, see <http://www.gnu.org/licenses/>.
 */
package org.astrojournal.gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * The Class StatusPanel shows the interactive bar at the bottom
 * of the main application screen.
 */
public class StatusPanel extends JPanel {

	private static final long serialVersionUID = -7979299860162515406L;
	/** The textLabel. */
	private JLabel textLabel = new JLabel(" ",JLabel.LEFT);
	
	/**
	 * Instantiates a new status panel.
	 */
	public StatusPanel() {
		setLayout(new BorderLayout());
		add(textLabel,BorderLayout.WEST);
		setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
	}
	
	/**
	 * Sets the file name.
	 * 
	 * @param text the new file name
	 */
	public void setText(String text) {
		textLabel.setText(text);
	}
	
}