fun main() {
	
	val john = Person("John", 32)
	
	// john.name = "David" // 에러, name은 val(상수) 타입이기 때문
	println(john.name)
	
	john.age = 20 // 에러 X, age는 var(변수) 타입이기 때문
	println(john.age)
	
	val david = Person(name = "David", age = 12)
	
	val john2 = Person("John", 20)
	println(john)
	println(john2)
	println(john == john2) // false
	
	
}


// class
// 클래스 이름이랑 생성자를 동시에 만들 수 있다.
// class 앞에 data 키워드를 붙이면 equals, hashCode, toString, copy 등의 메소드를 자동으로 생성해준다.
data class Person(
	val name: String,
	var age: Int,
	// private 키워드를 사용하면 해당 클래스 내부에서만 사용할 수 있다.
	private val gender: String = "male"
) {
	// init 키워드를 사용하면 클래스가 생성될 때 실행할 코드를 작성할 수 있다.
	init {
		println("init")
	}
	
	
	// 클래스내에 변수 선언
	// 기본적으로 public이다.
	// 그래서 class 외부에서 접근하여 값을 변경할수 있다
	// private 키워드를 사용하면 해당 클래스 내부에서만 값을 변경할수 있고, 외부에서는 읽기만 가능하다.
	var hobby = "축구"
		// setter를 private으로 설정하면 외부에서 값을 변경할 수 없다.
		private set
		// getter 설정, field는 hobby 변수를 의미한다.
		get() = "취미 : $field"
	
	fun some() {
		hobby = "농구"
	}
}
