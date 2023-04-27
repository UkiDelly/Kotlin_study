fun main() {
	
	// 타입추론도 지원
	val box: Box<Int> = Box(10)
	val box2 = Box("dfdf")
	
	println(box.value)
	println(box2.value)
}


// 제너릭 사용법
class Box<T>(val value: T)