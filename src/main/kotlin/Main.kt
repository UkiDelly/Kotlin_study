fun main() {
	
	Outer.Nested().introduce()
	
	val nested = Outer.Nested()
	nested.introduce()
	
	val outer = Outer()
	val innerClass = outer.Inner()
	innerClass.introduceInner()
	innerClass.introduceOuter()
	
	outer.text = "Changed Outer Class"
	innerClass.introduceOuter()
	
}


// 중첩 클래스 / Nested Class , 내부 클래스 / Inner Class
class Outer {
	var text = "Outer Class"
	
	
	/**
	 *  [Nested] - 중첩 클래스로, Outer.Nested()으로 접근이 가능하다.
	 *             특징
	 *                1. Outer 클래스의 멤버에 접근이 가능하다.
	 *                2. Nestes -> Outer 멤버 접근이 가능하지만 Outer -> Nested 멤버 접근이 불가능하다.
	 */
	class Nested {
		fun introduce() {
			println("Nested Class")
		}
	}
	
	
	/**
	 *  [Inner] - 내부 클래스로, Outer().Inner()으로 접근이 가능하다
	 *            특징
	 * 	            1. Outer 클래스의 멤버에 접근이 가능하다.
	 * 	            2. Nestes -> Outer , Outer -> Nested 멤버 접근이 가능하다
	 */
	inner class Inner {
		val text = "Inner Class"
		
		fun introduceInner() {
			println(text)
		}
		
		fun introduceOuter() {
			
			// Outer Class의 멤버에 접근이 가능하다.
			// Outer Class의 멤버와 동일한 이름의 멤버를 가지고 있다면
			// 접근하기 위해서는 this@{Outer 클래스 이름}.{변수 이름}으로 접근이 가능하다.
			println(this@Outer.text)
		}
	}
}

// 내부 클래스