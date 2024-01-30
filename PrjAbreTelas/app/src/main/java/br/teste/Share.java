package br.teste;

public class Share {
    private static String nome;//isso é uma propriedade/atributo

    public void setNome(String v/*parametro*/)
    {//A MainActivity vai passar valor pra cá
        nome = v;//set é ajustar, seta um valor
    }
    public String getNome(){
        return nome;//get retorna o valor para voce não perder o valor, ele pega o valor setado
    }
}
