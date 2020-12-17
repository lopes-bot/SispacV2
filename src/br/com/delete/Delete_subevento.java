package br.com.delete;

public class Delete_subevento extends Delete {
    public Delete_subevento(int id) {
	super(id);
	setIdTable("id_subevento");
	setTable("subevento");
	delete();
    }
}
