class Caaa{
	public int num1;
	public int num2;
}
class Cbbb extends Caaa{
	void set_sum(int a, int b){
		this.num1=a;
		this.num2=b;
	}
	void show() {
		System.out.println(num1);
		System.out.println(num2);
	}
}
public class JAVA1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cbbb bb = new Cbbb();
		bb.set_sum(5,10);
		bb.show();
	}

}
