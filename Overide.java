package collectionFrameworkExrecise;

public class Overide {
	private int id;
    private String name;

    public Overide(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean equals(Object obj) {
        if (obj == null) 
        	return false;
        if (!(obj instanceof Overide))
            return false;
        if (obj == this)
            return true;
        return this.getId() == ((Overide) obj).getId();
    }
}
