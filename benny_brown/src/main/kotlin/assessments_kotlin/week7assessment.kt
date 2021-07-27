package assessments_kotlin

class week7assessment {
    fun main(){
        println(reverseInteger(789))
    }
    fun reverseInteger(int: Int): ArrayList<Int>{
        val reversedString = int.toString().reversed()
        val result = arrayListOf<Int>()
        for(i in reversedString){
            println(i)
            result.add(i.toString().toInt())
        }
        return result
    }
}