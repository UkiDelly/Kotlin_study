fun main() {
	
	val foodCourt = FoodCourt()
	
	foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
	foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
	foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
	
	
}


class FoodCourt {
	fun searchPrice(foodName: String) {
		
		val price = when (foodName) {
			FOOD_CREAM_PASTA -> 13000
			FOOD_STEAK -> 25000
			FOOD_PIZZA -> 15000
			else -> 0
		}
		
		println("${foodName}의 가격은 ${price}원 입니다.")
	}
	
	
	// companion object은 인스턴스에 상관없이 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용한다.
	// 익명으로도 가능하고, 이름을 붙이는 것도 가능하다.
	companion object {
		const val FOOD_CREAM_PASTA = "크림파스타"
		const val FOOD_STEAK = "스테이크"
		const val FOOD_PIZZA = "피자"
	}
}