public class Main {
   public static void main(String[] args) {
       System.out.println("Esse é o Screen Match");
       System.out.println("Filme: Top Gun");

       int anoDeLancamento = 2022;
       System.out.println("Ano de lançamento: " + anoDeLancamento);

       boolean incluidoNoPlano = true;  // Corrigido para boolean
       double notaDeFilme = 8.1;        // Corrigido para double

       // Corrigido o cálculo da média
       double media = (9.8 + 6.3 + 8.0) / 3;
       System.out.println("Média: " + media);

       // Corrigido o nome da variável
       String sinopse = """
               Filme Top Gun
               Filme de aventura com galã dos anos 80
               Muito bom!
               Ano de lançamento: 
               """ + anoDeLancamento;   // Correção do nome da variável
       System.out.println(sinopse);

       int classificacao = (int) (media / 2);  // Correção do cálculo da classificação
       System.out.println("Classificação: " + classificacao);
   }
}
