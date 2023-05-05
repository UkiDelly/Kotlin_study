fun main() {
	// 	class는 객체를 생성하기 위한 틀, 즉 사용하기 위해서는 생성자를 통해 객체를 생성해야 한다.
	// 	하지만 그럴 필요 없이 단 하나의 객채만이 필요할때는 Object를 사용하면 된다.
	// Singleton 패턴을 언어 차원에서 지원해준다.
	println(Counter.count)
	
	Counter.countUp()
	Counter.countUp()
	
	println(Counter.count)
	
	Counter.clear()
	println(Counter.count)
	
	// 	class 안에 object를 추가하는 것이 가능히다 이를 companion object라고 한다.
	//  이런 경우 object는 class의 static 멤버로 동작한다
	
	val jjajang = FoodPoll("짜장")
	val jjambbong = FoodPoll("짬뽕")
	
	
	jjajang.voute()
	jjajang.voute()
	
	jjambbong.voute()
	jjambbong.voute()
	
	println("${jjajang.name} : ${jjajang.count}")
	println("${jjambbong.name} : ${jjambbong.count}")
	println("총계 : ${FoodPoll.total}")
	
}


object Counter {
	var count = 0
	
	fun countUp() {
		count ++
	}
	
	fun clear() {
		count = 0
	}
}


// companion object 예제
class FoodPoll(val name: String) {
	companion object {
		var total = 0
		
	}
	
	var count = 0
	
	fun voute() {
		total ++
		count ++
	}
	
}