import java.util.Scanner;

public class Exercicios {

		Scanner scan;
		
		public static void main(String[] args){
				Exercicios ex = new Exercicios();
				System.out.println("Exercício 1");
				ex.ex1();
				System.out.println("Exercício 2");
				ex.ex2();
				System.out.println("Exercício 3");
				ex.ex3();
				System.out.println("Exercício 4");
				ex.ex4();
				System.out.println("Exercício 5");
				ex.ex5();
				System.out.println("Exercício 6");
				ex.ex6();
		}
		public Exercicios() {
			this.scan = new Scanner(System.in);
		}
		
		public void ex1() {
			System.out.println("Informe dois valores "+
			"separados por uma quebra de linha:");
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			int res = v1+v2;
			System.out.printf("A soma é %d \r\n",res);
		}
		public void ex2() {
			System.out.println("Informe quatro valores "+
			"separados por uma quebra de linha:");
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			int v3 = scan.nextInt();
			int v4 = scan.nextInt();
			int res = (v1+v2+v3+v4)/4;
			System.out.printf("A média é %d \r\n",res);
		}
		public void ex3() {
			System.out.println("Informe três valores "+
			"separados por uma quebra de linha:");
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			int v3 = scan.nextInt();
			int res = v1*v2*v3;
			System.out.printf("O produto é %d \r\n",res);
		}
		public void ex4() {
			System.out.println("Informe o peso: "+
			"");
			float peso = scan.nextFloat();
			System.out.println("Informe a altura: "+
			"");
			float altura = scan.nextFloat();
			float imc = peso / (altura*altura);
			System.out.printf("O IMC é %f \r\n",imc);
		}
		public void ex5() {
			System.out.println("Informe quatro valores "+
			"separados por uma quebra de linha:");
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			int v3 = scan.nextInt();
			int v4 = scan.nextInt();
			int res = (v1+v2+v3+v4)/4;
			System.out.println("Informe o corte "+
			":");
			int corte = scan.nextInt();
			if (res >= corte)
				System.out.println("Aprovado");
			else
				System.out.println("Reprovado");
		}
		public void ex6() {
			System.out.println("Informe um valor "+
			":");
			float v1 = scan.nextFloat();
			float res = v1 % 2;
			if (res==0.00F) 
			System.out.printf("%f é par \r\n",v1);
			else
			System.out.printf("%f é impar \r\n",v1);
		}
		
	
}