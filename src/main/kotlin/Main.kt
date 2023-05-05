fun main() {
	//  as , is
	val a = Drink()
	a.drink()
	
	// b는 Cola 타입이지만 Drink 타입으로 선언되었기 때문에
	// Cola의 washDishes() 메서드를 사용할 수 없다.
	val b: Drink = Cola()
	b.drink()
	
	
	if (b is Cola) {
		b.washDishes()
	}
	
	val c = b as Cola
	c.washDishes()
	b.washDishes()
	
}

open class Drink {
	val name = "음료"
	
	open fun drink() {
		println("${name}를 마십니다.")
	}
}

class Cola : Drink() {
	val type = "콜라"
	
	override fun drink() {
		println("${name}중에 ${type}를 마십니다.")
	}
	
	fun washDishes() {
		println("${type}로 설거지를 합니다.")
	}
}