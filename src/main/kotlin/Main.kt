fun main() {
	// 	List 타입
	
	// 변경이 안되는 List (읽기만 가능)
	val items = listOf(1, 2, 3, 4, 5)
	
	//! 에러. 읽기만 가능
	items.add(3)
	
	// 	변경이 가능한 List (읽기/쓰기 가능)
	val newItems: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
	
	// 에러 발생 X 읽기,쓰기 가능
	newItems.add(6)
	newItems.remove(3)
	
	
}