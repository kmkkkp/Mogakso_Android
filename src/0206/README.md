
제너릭

Enum



단일 하드웨어 기기와 상호작용(예: 스피커를 통해 오디오 전송)
원격 데이터 소스(예: Firebase 데이터베이스)에 액세스하는 객체
한 번에 한 사용자만 로그인해야 하는 인증

체를 싱글톤으로 정의하여 객체에는 인스턴스가 하나만 있어야 함을 코드에서 명확하게 전달할 수 있습니다. 싱글톤은 인스턴스를 하나만 가질 수 있는 클래스입니다. Kotlin은 싱글톤 클래스를 만드는 데 사용할 수 있는 객체라는 특수 구조를 제공합니다
🡪생성자 포함X


확장속성추가


확장함수


객체 생성 하기, 객체 생성하지 않고 메서드 호출하기
enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3   
        val progressText: String
            get() = "${answered} of ${total} answered"
        fun printProgressBar() {
            repeat(Quiz.answered) { print("▓") }
            repeat(Quiz.total - Quiz.answered) { print("▒") }
            println()
               println(progressText)
            println()
        }
    }
    fun printQuiz(){
        question1.let {
        println(it.questionText)
        println(it.answer)
        println(it.difficulty)
        println()
        }
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
            println()
        }
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
    }
}


fun main() {
    Quiz.printProgressBar()
    val quiz = Quiz()
    quiz.printQuiz() //변수 생성 후 객체 메서드 호출
    
    Quiz().apply{//apply 활용 변수 생성 하지 않고 객체 메서드 호출 가능
        printQuiz()        
    }
}

Kotlin 컬렉션 정리

## 소감
코틀린으로 여러 컬렉션을 공부해보았고 제너릭, 함수 활용법을 공부하였다. 파이썬으로 코테 공부를 하고있었는데, 코틀린으로도 컬럭션을 활용하여 공부할수 있을것같다.

