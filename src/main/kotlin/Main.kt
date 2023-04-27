fun main() {
	// 배열 (크기가 지정된 List이라고 생각하면 될듯), 배열은 잘 사용 안함
	val items: Array<Int> = arrayOf(1, 2, 3)
	
	// 특정 위치에 값 넣기 (List도 같음)
	items[0] = 10
	
	// 특정 위치의 값 가져오기 (List도 같음)
	println(items[0])
}