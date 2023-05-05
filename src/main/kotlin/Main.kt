fun main() {
	
	UsingGeneric(A()).doShouting()
	
	doShouting(B())
	
}

open class A {
	open fun shout() {
		println("A 가 소리칩니다")
	}
}

class B : A() {
	override fun shout() {
		println("B 가 소리칩니다")
	}
}

class C : A() {
	override fun shout() {
		println("C 가 소리칩니다")
	}
}


/**
 *
 * [T:A] 는 T는 A와 A의 자식 클래스만 가능하다는 뜻
 */
class UsingGeneric<T : A>(val t: T) {
	fun doShouting() {
		t.shout()
	}
}

fun <T : A> doShouting(t: T) {
	t.shout()
}