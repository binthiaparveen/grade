import java.util.Scanner
fun main(args: Array<String>) {

        var sc = Scanner(System.`in`)

        var mark:Int = sc.nextInt()


    fun assignGrade(mark: Int): String {
        if (mark >= 90) {
            return "A+"
        } else if (mark >= 80) {
            return "A"
        } else if (mark >= 70) {
            return "B"
        } else if (mark >= 60) {
            return "C"
        } else if (mark >= 50) {
            return "Pass"
        } else {
            return "Fail"
        }
    }
    val grade = assignGrade(mark)

    println("The student's grade is: $grade")


}