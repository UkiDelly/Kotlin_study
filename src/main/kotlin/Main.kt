fun main() {
	// 	null 처리
	/**
	 *  [?.] : null safe operator, null인지 확인하고 null이면 뒤에 구문을 실행하지 않음
	 *  [?:] : elvis operator, null이 아니라면 그대로 사용하지만, null이면 오른쪽으로 대체 ?? 이랑 같은 문법인듯
	 *  [!!] : non-null assertion operator, null이 아님을 단정하고 null이면 NPE 발생
	 */
	
	val a: String = "Kotlin Exam"
	
	// // null safe operator
	// println(a?.uppercase())
	// // elvis operator
	// println(a ?: "default".uppercase())
	// // non-null assertion operator
	// println(a !!.uppercase())
	
	
	// 	scope 함수 사용
	a.run {
		println(uppercase())
		println(lowercase())
	}
}