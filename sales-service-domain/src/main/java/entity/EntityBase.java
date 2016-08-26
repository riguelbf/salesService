package entity;

import java.io.Serializable;

public abstract class EntityBase implements Serializable {

	private static final long serialVersionUID = 1874453683507954256L;
	
	protected String id;

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}
}
