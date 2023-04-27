fun main() {
	// null safety
	var name: String? = null
	
	name = "대현"
	
	// 수식객체 함수
	"종인".also { name = it }
	name = null
	
	
	var name2: String = ""
	
	// null이 아닐때
	name2 = name !!
	
	
	// 	코틀린 내장 널체크
	// name이 널이 아니라면,
	name?.let {
		name2 = name !!
	}
	
}