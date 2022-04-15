package org.neosoft.eboutique.metier;

import org.neosoft.eboutique.entities.Categorie;
import org.neosoft.eboutique.entities.Role;
import org.neosoft.eboutique.entities.User;

public interface IAdminCategoriesMetier extends IAdminProduitsMetier {
	public Long ajouterCategorie(Categorie c);
	public void supprimerCategrorie(Long idcat);
	public void modifierCategorie(Categorie c);
	public void ajouterUser(User u);
	public void attribuerRole(Role r,Long userID);
}
