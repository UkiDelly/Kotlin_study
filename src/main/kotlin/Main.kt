fun main() {
	EventPrinter().start()
}


// Observer
// 이벤트를 수신해서 출력하는 class
// interface를 상속
// class EventPrinter : EventListener {
//
// 	// 오버라이딩
// 	override fun onEvent(count: Int) {
// 		print("${count}-")
// 	}
//
// 	fun start() {
//
// 		// 이벤트를 발생시킬 class, this로 listener를 넘겨준다 넘겨준다.
// 		// this는 EventPrinter를 의미하지만 Counter에서는 EventListener를 받는다고 했기 때문에
// 		// EventLIstener의 구현부분인, 오버라이딩한 onEvent를 넘겨주게 된다.
// 		val counter = Counter(this)
// 		counter.count()
// 	}
// }


// 익명 객체
class EventPrinter {
	fun start() {
		
		// object 키워드를 통해 익명 객체를 생성, EventListener의 타입을 가진다
		// object 생성이랑 같다. 단지 이름이 없는 것 뿐
		Counter(object : EventListener {
			override fun onEvent(count: Int) {
				print("${count}-")
			}
			
			// 	apply(초기화 후 작업 실행) 적용 해봄
		}).apply { count() }
		
		
	}
}

// 이벤트를 발생시킬 class
class Counter(val listener: EventListener) {
	fun count() {
		
		// 1에서 100까지
		for (i in 1..100) {
			
			// 5의 배수일 때만 이벤트를 발생시킨다.
			if (i % 5 == 0) {
				listener.onEvent(i)
			}
		}
	}
}

// 두개를 연결시킬 interface
interface EventListener {
	fun onEvent(count: Int)
}


