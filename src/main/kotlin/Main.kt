fun main() {
	val a = Product("콜라", 1000)
	val b = Product("콜라", 1000)
	
	var c = a
	
	var d = Product("사이다", 1000)
	
	println(a == b)
	println(a === b)
	println(a == c)
	println(a === c)
	println(a == d)
	println(a === d)
	
}

class Product(val name: String, val price: Int) {
	override fun equals(other: Any?): Boolean {
		// return super.equals(other)
		return if (other is Product) {
			other.name == name && other.price == price
		} else {
			false
		}
	}
}