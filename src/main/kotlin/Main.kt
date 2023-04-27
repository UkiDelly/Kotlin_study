fun main() {
	println(sum(10, 20))
	println(sum2(10, 20))
	
	// 	named 변수처럼 쓸수도 있다
	println(sum2(b = 10, a = 20))
}


// 일반적인 함수 (전역)
fun sum(a: Int, b: Int): Int {
	return a + b
}

// 간략버전
// 타입 추론이 가능하기 때문에 리턴값 명시를 생략해도 된다
fun sum2(a: Int, b: Int) = a + b

