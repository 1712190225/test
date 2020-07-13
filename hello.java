public class hello{

	private int age;
	private String hello;

	public void setAge(int age){
		this.age=age;
	}

	public int getAge(){
		return this.age;

	}
	public void setHello(String hello){

		this.hello=hello;
	} 

	public static void main(String args[]){

	hello hello1=new hello();
	hello1.setAge(5);
	System.out.println("nihao,cmz");
	System.out.println(hello1.getAge());


	}
}