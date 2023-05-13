fun main() {
	val a = LateInitSample()
	
	println(a.getLateInitText())
	
	a.text = "새로 할당한 값"
	
	println(a.getLateInitText())
	
	
	// 	============================
	
	
	// 	lazy
	// 	초기화를 늦게 진행하는 속성
	// 	by lazy { 초기화 내용 }으로 구성되며 마지막으로 실행한 구문을 반환
	// 	생성시 초기화가 아닌 해당 속성을 처음 사용했을때 초기화해줌
	val number: Int by lazy {
		println("초기화를 합니다")
		7
	}
	
	println("코드를 시작합니다")
	// 이때 해당 변수/속성을 처음 사용하므로 이때 초기화를 진행
	println(number)
	// 이미 초기화 했기 때문에 초기화 구문을 실행하지 않음
	println(number)
	
}

// 	늦은 초기화, Dart의 late이랑 같은 키워드
//  초기화하기 전까지는 변수 사용이 불가능
//  기본 자료형에는 사용할수 없음
//  lateinit 변수의 초기화 여부를 확인 하는 방법은 ::{변수}.isInitialized

class LateInitSample {
	lateinit var text: String
	
	fun getLateInitText(): String {
		if (::text.isInitialized) {
			return text
		} else {
			return "기본값"
		}
	}
}