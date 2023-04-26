fun main() {

     // 타입 추론
    val a = "Hello World!"
    println(a)

    // 함수 사용
    println(add(1, 2, 3))
}


// 함수 생성

/**
 *  @param a Int
 *  @param b Int
 *  @param c Int
 *  @return Int
 */
fun add(a: Int, b: Int, c:Int): Int {

    return a + b + c
}

// 단일 표현식 함수, 반환형도 추론이 가능해서 생략 가능
fun add2(a: Int, b: Int, c:Int) = a + b + c