fun main() {
	
	val dog = Dog()
	val cat = Cat()
	
	// 	타입 체크는 is를 사용함
	//  as로 타입 캐스팅도 가능
	if (dog is Animal) {
		println("dog is Animal")
	}
}


// 추상 클래스
abstract class Animal {
	// open 키워드를 사용해서 override를 허용한다.
	open fun move() {
		println("이동")
	}
}


// 상속을 할때는 클래스이름() <- 소괄호를 넣어야한다.
class Dog : Animal() {
	override fun move() {
		println("터벅")
	}
}

// 인터페이스
interface Drawable {
	fun draw()
}


// 인터페이스를 상속받을때는 , 를 사용해서 여러개를 상속받을 수 있다.
class Cat : Animal(), Drawable {
	override fun move() {
		println("살금")
	}
	
	override fun draw() {
		println("뭔갈 그리다")
	}
}


// 일반 class는 상속이 불가능하다
// 하지만 open 키워드를 사용하면 상속이 가능하다.
open class Person

class SuperMan : Person()