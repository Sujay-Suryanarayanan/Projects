package com.designPatterns.mvc.view;

import javax.swing.JFrame;

import com.designPatterns.mvc.model.Model;

public class View extends JFrame {
	private Model model;

	public View(Model model) {
		super("MVC Demo");
		this.model = model;
	}
}
