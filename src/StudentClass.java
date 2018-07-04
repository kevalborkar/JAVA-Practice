public class StudentClass {
	int id;
	String name;
	double marks;
	
	public StudentClass(int id,String name,double marks) {
		 this.id=id;
		 this.name=name;
		 this.marks=marks;
	}
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Id : "+this.id	+", Name: "+this.name+", Marks : "+this.marks;
	}
	
	@Override
	public boolean equals(Object obj) {
		StudentClass Id = (StudentClass) obj;
		if(this.id == Id.id ) {
			return true;
		}else {
			return false;
		} 
		
	}
	
}
