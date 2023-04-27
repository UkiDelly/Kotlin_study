fun main() {
	// 조건문
	var i = 5
	if (i > 10) {
		println("10 보다 크다")
	} else if (i > 5) {
		println("5보다 크다")
	} else {
		println("5보다 작거나 같다")
	}
	
	// if는 when으로 치환 가능
	
	when {
		i > 10 -> {
			println("10 보다 크다")
		}
		
		i > 5 -> {
			println("5보다 크다")
		}
		
		else -> {
			println("5보다 작거나 같다")
		}
	}
	
	// if문을 변수에 넣을수도 있다
	var result = if (i is Int) {
		
		// i가 정수 일경우 "Int"문자열을 반환
		"Int"
	} else {
		
		// i가 정수가 아닐경우 "not Int"문자열을 반환
		"not Int"
	}
	
	println(result)
	
	// when문
	var result2 = when (i) {
		1 -> {
			"i == 1"
		}
		
		2 -> {
			"i == 2"
		}
		
		else -> {
			"i is neither 1 nor 2"
		}
	}
	
	println(result2)
	
	
	// 	삼항 연산
	i = 10
	val result3: Boolean = i > 10
	// 	또는
	val result4: Boolean = i > 10
	
	println(result3)
	println(result4)
	
}