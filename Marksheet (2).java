package ExerciseinputOutput;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Marksheet implements Externalizable{

	private String name;
    private int code;
    transient int temp = 0;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}
	
	
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(code);
		out.writeInt(temp);
	}
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		code = (int)in.readInt();
		temp = in.readInt();
	}

	
	
}
