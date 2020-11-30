import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import org.junit.Assert;

import io.cucumber.java.pt.*;
import io.cucumber.core.cli.Main;

public class AprenderCucumber {
	
	@Dado("que eu crie o arquivo corretamente")
	public void que_eu_crie_o_arquivo_corretamente() {
	    //System.out.println("\ndeu certo\n");
	}

	@Quando("executá-lo")
	public void executá_lo() {
	   
	}

	@Então("a especificação deve finalizar com sucesso")
	public void a_especificação_deve_finalizar_com_sucesso() {

	}
	
	
//------------------Aula 10-11----------------------
	
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
		System.out.println("arg1s: " + arg1);
		System.out.println("Contador: " + arg1);
		
		//valida se é true
		//Assert.assertTrue(arg1 == contador);
		
		//sendo que arg1 é o valor esperado e contador é o valor obtido
		
		
		if(arg1 == contador) {
			System.out.println("Passou no teste");
		}else {
			System.out.println("Reprovado");
			System.out.println("\nAssert.assertEquals");
			Assert.assertEquals(arg1, contador);
		}
	}

//------------------Aula 12----------------------
	
	Date entrega = new Date();
	Calendar cal = Calendar.getInstance();
	//@Dado("que o prazo é dia {int}\\/{int}\\/{int}")
	@Dado("que o prazo é dia (d{2}/d{2}/d{4})$")
	public void queOPrazoÉDia(int dia, int mes, int ano) {
	    
	    cal.set(Calendar.DAY_OF_MONTH, dia);
	    //no java janeiro é 0
	    cal.set(Calendar.MONTH, mes - 1);
	    cal.set(Calendar.YEAR, ano);
	    
	    entrega = cal.getTime();
	}

	//@Quando("a entrega atrasa em {int} dias")
	@Quando("a entrega atrasa em (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasaEmDias(int dias, String tempo) {
		cal.setTime(entrega);	    
		if(tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, dias);
		}else if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, dias);
		}
		
	    entrega = cal.getTime();
	}

	//exemplo da aula (\\d{2}\\/\\d{2}\\/\\d{4})
	//@Então("a entrega será efetuada e {int}\\/{int}\\/{int}")
	@Então("a entrega será efetuada e (\\d{2}/d{2}/d{4})$")
	public void aEntregaSeráEfetuadaE(String data) {
	    DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatada = formatoData.format(entrega);
	    Assert.assertEquals(data, formatoData);
	    
	}



}
