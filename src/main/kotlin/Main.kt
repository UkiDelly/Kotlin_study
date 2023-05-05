fun main() {
	
	// also/let 비교를 위한 변수
	val price = 5000
	
	/**
	 * [apply] - 인스턴스 생성한후 변수에 담기 전에 '초기화 과정'을 수행할 때 사용
	 */
	val book = Book("대현의 코틀린", 10000).apply {
		
		// 인스턴스를 만들자마자 name을 "[초특가] 대현의 코틀린'으로 변경
		name = "[초특가]" + name
		discount()
	}
	
	/**
	 * [run] - 인스턴스가 이미 만들어진 후에 인스턴의 함수나 속성을 별도의 scope내에서 사용해야 할때 사용
	 *         처리가 끝나면 최종값을 반
	 *
	 */
	book.run {
		println("상품명: ${name}, 가격: ${price}원")
	}
	
	/**
	 * [with] - run과 동일한 기능을 가지지만 단지 인스턴스를 참조연산자 대신 파라미터로 받는다는 차이점이 있다.
	 */
	with(book) {
		println("상품명: ${name}, 가격: ${price}원")
	}
	
	/**
	 * [let] - main scope과 인스턴스 내에 중복된 변수가 있을 때 인스턴스 내의 변수를 사용해야 할 때 사용
	 *       - run 과 비슷하지만, run은 main scope의 변수를 우선시로 사용함
	 *       - it 키워드를 사용하여 인스턴스 내의 변수를 사용할 수 있다.
	 *       - parameter로 받은 인스턴스를 return
	 */
	book.let {
		// it 키워드를 사용하여 인스턴스 내의 변수를 사용할 수 있다.
		println("상품명: ${it.name}, 가격: ${it.price}원")
	}
	
	/**
	 *  [also] - apply과 비슷하지만, let과 같은 이유로 사용됨
	 *  		   - it 키워드를 사용하여 인스턴스 내의 변수를 사용할 수 있다.
	 *  		   - parameter로 받은 인스턴스를 return
	 */
	var book2 = Book("코틀린의 신", 20000).also {
		// it 키워드를 사용하여 인스턴스 내의 변수를 사용할 수 있다.
		println("상품명: ${it.name}, 가격: ${it.price}원")
	}
	
	
}

class Book(var name: String, var price: Int) {
	
	fun discount() {
		price -= 2000
	}
}