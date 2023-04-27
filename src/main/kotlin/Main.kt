fun main() {
	
	// 콜백 함수를 넣을때는 {}를 사용
	myFunc({ println("함수 호출") })
	
	// 	인자가 함수인경우, 밖으로 빼서 사용 가능
	//  인자가 함수 하나인 경우 ()도 생략 가능
	myFunc { println("함수 호출") }
	
	// 인자가 여러개인 경우, ()를 생략할 수 없다.
	myFunc2(10) { println("함수 호출") }
	
	
	// 정지 함수는 코루틴에서만 사용 가능
	myFunc3()
}


// 콜백 함수 받는 법
// 코틀린에는 void가 없고 대신 Unit이라는 특수한 타입이 있다.
fun myFunc(callBack: () -> Unit) {
	println("myFunc 호출")
	callBack()
	println("myFunc 끝")
}

fun myFunc2(a: Int, callBack: () -> Unit) {
	println("myFunc2 호출")
	println(a)
	callBack()
	println("myFunc2 끝")
}

// 정지 함수. suspend 키워드를 붙여준다.
suspend fun myFunc3() {
	println("myFunc3 호출")
}
