package com.designPatterns.mvc;

import javax.swing.SwingUtilities;

import com.designPatterns.mvc.controller.Controller;
import com.designPatterns.mvc.model.Model;
import com.designPatterns.mvc.view.View;

public class MainApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
		});

	}

	public static void runApp() {
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
	}

}
