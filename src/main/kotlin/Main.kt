fun main() {
	read(7)
	read("감사합니다")
	
	deliveryItem("짬뽕")
	deliveryItem("책", 3)
	deliveryItem("노트북", 30, "학교")
	deliveryItem("선물", destination = "친구집")
	
	
	// vararg를 사용할때 vararg를 제일 마지막에 써야함
	sum(1, 2, 3, 4)
	
	
	// 	infix 함수 사용
	// Dart와는 달리 .을 사용하지 않고 사용가능한것으로 보임
	println(6 multiply 4)
	// 	그냥 일반적일 infix 사용법
	println(6.multiply(4))
}

// 함수 오버라이딩
fun read(x: Int) {
	println("Int: $x")
}

fun read(x: String) {
	println("String: $x")
}

// default argunments
fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
	println("$name, $count 개를 ${destination}에 배달하였습니다.")
}


// vairable number of arguments
// 갯수 상관없이 같은 자료형의 인자를 받고 싶을때 varargs 사용
fun sum(vararg numbers: Int) {
	var sum = 0
	
	for (n in numbers) {
		sum += n
	}
	
	println(sum)
}

// infix
// Int의 infix 함수 생성
// Dart의 extension과 비슷한 기능인듯
infix fun Int.multiply(x: Int): Int = this * x