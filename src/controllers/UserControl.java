package controllers;

import javax.swing.table.DefaultTableModel;

import repository.UserRepositorio;
import repository.UserRepositorio;
import tableModels.UserTableModel;
import views.UserFormDialog;
import views.UserView;

public class UserControl {

	private UserView view;
	private UserRepositorio repo;
	private DefaultTableModel model;
	
	public UserControl(UserView view) {
		this.view = view;
		repo = new UserRepositorio();
		
		view.getBtnAdd().addActionListener(e -> {
			UserFormDialog form = new UserFormDialog(null, null);
			form.setVisible(true);
		});
	}
	
}