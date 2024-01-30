package br.teste;

public class Share {

    public Share(){

    }//não é obrigatório declarar o método construtor, toda classe tem metodo construtor e pode ter quantos quiser
    //cada metódo não pode ser igual ao outro, então vc muda a assinatura dele (o parametro)
    public Share(String x){
      texto = x;
    }
    public Share(String x, Integer y){

    }

    private static String texto;//propriedade

    public void setTexto(String v){
        texto = v;
    }

    public String getTexto(){
        return texto;
    }

}
