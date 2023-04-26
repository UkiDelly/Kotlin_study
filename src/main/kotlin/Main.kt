fun main() {
    println("Hello World!")

    // 변수 선언
    // var는 일반적으로 통용되는 변수로
    // 언제든지 읽기/쓰기가 가능
    //
    // val는 선언할때만 초기화 가능하고 값 변경 X (Dart의 final이라 비슷 한듯)
    val a: Int = 123
    println(a)

    // 꼭 선언시에 초기화 할필요 없음
    val b: Int
    b = 456
    println(b)

    // null을 허용하는 변수
    val c: Int? = null
    println(c)

    //  Int 자료형
    var intValue: Int = 123
    println(intValue)
    //  Long 자료형, 숫자 뒤에 L을 붙여야함
    var longValue: Long = 1234L
    println(longValue)
    //  Hex 16진수, 0x로 시작
    var hexValue: Int = 0x12F
    println(hexValue)
    //  2진수 앞에 0b를 붙임
    var binaryValue: Int = 0b1000
    println(binaryValue)

    //  실수(double)
    var doubleValue: Double = 123.5
    println(doubleValue)
    //  필요시 지수표기법 포함
    var doubleValieWithExp: Double = 123.5e10
    println(doubleValieWithExp)
    //  float, 숫자 뒤에 f를 붙임
    var floatValue: Float = 123.5f
    println(floatValue)

    //  문자열

    //  char 자료형, '' 작은 따옴표로 감싸야함 (C랑 자바랑 동일하게)
    var charValue: Char = 'a'
    println(charValue)
    /*
     *   ₩t : 탭
     *   ₩b : 백스페이스
     *   ₩n : 개행
     *   ₩' : 작은 따옴표
     *   ₩" : 큰 따옴표
     *   ₩₩ : 역슬래시
     *   ₩$ : 문자
     *   ₩u : 유니코드
     */

    //  문자열, "" 큰 따옴표로 감싸야함, String이라고 명시적으로 선언하지 않아도 됨
    var stringValue: String = "Hello World!"
    println(stringValue)
    //  여러줄로 된 문자열
    var multiLineStringValue: String =
            """
        Hello World!
        Hello World!
        Hello World!
    """
    println(multiLineStringValue)

    // Boolean 자료형
    var booleanValue: Boolean = true
    println(booleanValue)
}
