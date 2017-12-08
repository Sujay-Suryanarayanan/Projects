package com.designPatterns.mvc.controller;

import com.designPatterns.mvc.model.Model;
import com.designPatterns.mvc.view.View;

public class Controller {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

}
