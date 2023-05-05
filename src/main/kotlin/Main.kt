fun main() {
	// 문자열 다루기
	val test1 = "Test.Kotlin.String"
	
	println(test1.length)
	println(test1.lowercase())
	println(test1.uppercase())
	
	// split
	var test2 = test1.split(".")
	
	// join
	println(test2.joinToString())
	println(test2.joinToString("-"))
	
	// 	 substring
	println(test1.substring(5..10))
	
	
	//
	val nullString: String? = null
	val emptyString = ""
	val blankString = " "
	val normalString = "a"
	
	//  null of empty
	println(nullString.isNullOrEmpty())
	println(emptyString.isNullOrEmpty())
	println(blankString.isNullOrEmpty())
	println(normalString.isNullOrEmpty())
	
	println()
	
	// null or blank
	println(nullString.isNullOrBlank())
	println(emptyString.isNullOrBlank())
	println(blankString.isNullOrBlank())
	println(normalString.isNullOrBlank())
	
	println()
	
	// 특정 문자열로 시작하거나 끝나는지 확인
	val test3 = "kotlin.kt"
	val test4 = "java.java"
	
	println(test3.startsWith("java"))
	println(test4.startsWith("java"))
	
	println(test3.endsWith(".kt"))
	println(test4.endsWith(".kt"))
	
	println(test3.contains("lin"))
	println(test4.contains("lin"))
	
	println()
	
	
}