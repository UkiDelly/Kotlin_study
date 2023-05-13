fun main() {
	
	// 일반적인 class와 data class의 차이점 확인
	val a = General("보영", 212)
	
	println(a == General("보영", 212)) // false
	println(a.hashCode())
	println(a)
	
	
	val b = Data("루다", 306)
	
	println(b == Data("루다", 306)) // true
	println(b.hashCode())
	println(b)
	
	
	println(b.copy())
	println(b.copy("아린"))
	println(b.copy(id = 618))
	
	
	// 	componentX() 함수의 사용
	val list = listOf(
		Data("보영", 212),
		Data("루다", 306),
		Data("아린", 618)
	)
	
	
	// 이렇게 for문을 설정하면 내부적으로 componentX() 함수를 사용한다.
	for ((a, b) in list) {
		println("${a}, ${b}")
	}
	
	// 	enum 활용
	var state = State.SING
	println(state)
	
	
	state = State.SLEEP
	println(state.isSleeping())
	
	state = State.EAT
	println(state.message)
	
}


// Data class
// 데이터를 다룰때 쓰기 좋음
// toString(), equals(), hashCode(), copy(), componentX() 등을 자동으로 생성해줌
// componentX() 함수의 경우, 속성을 순서대로 반환해주는 함수이다.
/**
 *  예) Data("A",7) 이라는 객체가 있을 때
 *  Data.component1() 은 "A" 를 반환
 *  Data.component2() 는 7 을 반환
 */
class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)

// Enum
// 열거형 클래스
// Dart의 Enum이랑 비슷함

enum class State(val message: String) {
	SING("노래를 부릅니다."),
	EAT("밥을 먹습니다."),
	SLEEP("잠을 잡니다.");
	
	
	fun isSleeping() = this == SLEEP
}
