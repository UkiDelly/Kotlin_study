import java.util.Scanner

fun main() {
    
    // 코틀린에서 입력을 받는 방법
    val scanner = Scanner(System.`in`)
    println("정수 받고 출력")
    println(scanner.nextInt() )
    
    
    println("실수 받고 출력" )
    println( scanner.nextDouble() )
    
    println("문자열 받고 출력 " )
    println( scanner.next() )
    
    println("문자열 받고 출력" )
    println( scanner.nextLine() )
    
    println("캐릭터(Char) 받고 출력" )
    println( scanner.next().single() )
    
}