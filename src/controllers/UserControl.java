package controllers;

import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import models.User;
import models.UserModelo;
import repository.UserRepositorio;
import tableModels.UserTableModel;
import views.UserFormDialog;
import views.UserView;

public class UserControl {

	private UserView view;
	private UserRepositorio repo;
	private UserTableModel model;
	
	public UserControl(UserView view) {
		this.view = view;
		repo = new UserRepositorio();
		
		this.view.getBtnAdd().addActionListener(e -> {
			openForm(null);
		});
		
		this.view.getBtnEdit().addActionListener(e -> {
			int row = view.getSelectedRow();
			if(row == -1) {
				JOptionPane.showMessageDialog(view, "Selecciona un usuario");
				return;
			}
			
			openForm(model.getUserAt(row));
		});
	}
	
	public void loadUsers() {	
		System.out.println("Carga usuarios");
		try {
			List<User> users = repo.getUsers();
			
			if(model == null) {
				model = new UserTableModel(users);
				view.setTableModel(model);
			}else {
				model.setUsers(users);
			}
			
		}catch (IOException ex) {
			JOptionPane.showMessageDialog(view, ex.getMessage());
		}
	}
	
	private void openForm(User user) {
		
		UserFormDialog dialog = new UserFormDialog(null, user);
		dialog.setVisible(true);
		
		if(dialog.isSaved()) {
			User savedUser = dialog.getUser();
			
			try {
				if(user == null) {
					repo.save(savedUser);
				}else {
					int row = view.getSelectedRow();
					repo.update(row, savedUser);
				}
				
				loadUsers();
			}catch(Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(view, e.getMessage());
			}
			
		}
		
	}
	
}