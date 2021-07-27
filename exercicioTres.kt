import java.util.Scanner;

fun main(args: Array<String>) {
   //continue o codigo
   val leitor = Scanner(System.`in`);
    //continue o código
    val H: Int = leitor.nextInt();
    val P: Double= leitor.nextDouble();
    
    val media: Double = H / P;
    println(String.format("%.2f", media));
}
