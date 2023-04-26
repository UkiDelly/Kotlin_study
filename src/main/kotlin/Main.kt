fun main() {

    // (명시적) 형변환
    val a: Int = 54321
    var b: Long = a.toLong()

    // 배열 (선언과 동시에 전체 크기가 정해져 있음)
    val intArr = arrayOf(1, 2, 3, 4, 5)

    // 비어 있는 (null로 채워진) 크기가 정해진 배열
    val nullArr = arrayOfNulls<Int>(5)


    // 값 사용
    println(intArr[2])
    println(nullArr[2])


}
