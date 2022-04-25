package exerciseoop;

public final class ImmutableClass {
	public static void main(String[] args) {
	}		
	
	private final String name;
	   private final int age;
	   public ImmutableClass(final String name, final int age) {
	      this.name = name;
	      this.age = age;
	   }
	   public int getAge() {
	      return age;
	   }
	   public String getName() {
	      return name;
	   }
}
