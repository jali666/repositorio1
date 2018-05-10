package main.webapp;

public class operaciones {
	public static double calcula(String numeros, String tipoOperacion) throws Exception {
		char letra = ' ';
		double numero=0;
		double resultado=0;
		String letraStr="";
		String letraStr2="";
		for (int i = 0; i < numeros.length(); i++) {
			letra=numeros.charAt(i);
			if ((letra != '/') && (letra != ' ')){
				
			    letraStr=String.valueOf(letra);
			    letraStr2=letraStr2+letraStr;
			}else{
				numero = Integer.parseInt(letraStr2);
				if (tipoOperacion=="add"){
					resultado = resultado + numero;	
				}
				if (tipoOperacion=="subs"){
					if(resultado==0){
						resultado = numero;
					}else{
						resultado = resultado - numero;	
					}
						
				}
				if (tipoOperacion=="mult"){
					if(resultado==0){
						resultado = numero;
					}else{
						resultado = resultado * numero;	
					}
				}
				if (tipoOperacion=="div"){
					if(resultado==0){
						resultado = numero;
					}else{
						resultado = resultado / numero;	
					}
				}
				letraStr="";
				letraStr2="";
			}
		}
		numero = Integer.parseInt(letraStr2);
		if (tipoOperacion=="add"){
			resultado = resultado + numero;	
		}
		if (tipoOperacion=="subs"){
			resultado = resultado - numero;	
		}
		if (tipoOperacion=="mult"){
			resultado = resultado * numero;	
		}
		if (tipoOperacion=="div"){
			resultado = resultado / numero;	
		}
		return resultado;		
	}
}
