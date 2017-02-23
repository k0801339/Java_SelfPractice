package ex05;
class Person{
	int weight, height;
	Person(){
		weight = 65;
		height = 165;
	}
}
public class CallByRef {

	public static void main(String[] args) {
		Person Jack = new Person();
		System.out.println("Before Ref call\tJack's weight = "+Jack.weight
				+ "\tJack's height = "+Jack.height);
		byRef(Jack);
		System.out.println("After Ref call\tJack's weight = "+Jack.weight
				+ "\tJack's height = "+Jack.height);

	}
	static void byRef(Person p){
		p.weight += 3;
		p.height += 2;
		System.out.println("In Ref call\tJack's weight = "+p.weight
				+ "\tJack's height = "+p.height);
	}

}
