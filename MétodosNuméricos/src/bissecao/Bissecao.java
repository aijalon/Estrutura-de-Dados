package bissecao;

public class Bissecao {

	public void bissecao(int a, double xl, double xu) {
		double x = xl;
		double xold;
		double fxl = funcao(xl, a);
		double fxu = funcao(xu, a);
		double fx = 0;
		boolean errosatisfatorio = true;
		int interacao = 0;
		double erroAbsoluto = 100;
		
		while(erroAbsoluto>0.001) {
			xold = x;
			x = (xl+xu)/2;
			fx = funcao(x, a);
			interacao++;
			if(x!=0) {
				erroAbsoluto = ((x-xold)/x)*100;
			}
			if(fxl*fx<0) {
				xu=x;
			}else {
				xl = x;
				fxl =fx;
			}
			
			
			
		}
		System.out.println(x+"   "+fx);
		
	}
	
	public double funcao(double x, int a){
		return x/a - Math.tan(a*x);
	}
	
	public void imprimir(double fx) {
		System.out.println(fx);
	}
}
