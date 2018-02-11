package com.rslakra.swing.modeldialog;

import javax.swing.JRadioButtonMenuItem;

/**
 * Help class for definition of Look and Feel menu items. Simply holds a look
 * and feel class name against the item.
 * 
 * @author Rohtash Lakra (rohtash.lakra@devamatre.com)
 * @author Rohtash Singh Lakra (rohtash.singh@gmail.com)
 * @created 2018-02-10 04:22:45 PM
 * @version 1.0.0
 * @since 1.0.0
 */
public class LAFMenuItem extends JRadioButtonMenuItem {

	private String lafClassName;

	private LAFMenuItem() {

	}

	/**
	 * Constructor
	 *
	 * @param name
	 * @param lafClassName
	 */
	public LAFMenuItem(String name, String lafClassName) {
		super(name);
		this.lafClassName = lafClassName;
	}

	public String getLAFClassName() {
		return lafClassName;
	}

}
