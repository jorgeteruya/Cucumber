import org.junit.Assert;

import io.cucumber.java.pt.*;

public class AprenderCucumber {
	
	@Dado("que eu crie o arquivo corretamente")
	public void que_eu_crie_o_arquivo_corretamente() {
	    System.out.println("\ndeu certo\n");
	}

	@Quando("executá-lo")
	public void executá_lo() {
	   
	}

	@Então("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {

	}
	
	
//------------------Aula 10----------------------
	
	private int contador = 0;
	
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(int arg1) {
	    contador = arg1;
	}

	@Quando("eu incrementar em {int}")
	public void euIncrementarEm(int arg1) {
	    contador = contador + arg1;
	}

	@Então("o valor do contador será {int}")
	public void oValorDoContadorSerá(int arg1) {
		System.out.println("int1: " + arg1);
		System.out.println("Contador: " + arg1);
		System.out.println(arg1 == contador);
		//valida se é true
		//Assert.assertTrue(arg1 == contador);
		
		//sendo que arg1 é o valor esperado e contador é o valor obtido
		System.out.println("\nAssert.assertEquals");
		Assert.assertEquals(arg1, contador);
	}



}
