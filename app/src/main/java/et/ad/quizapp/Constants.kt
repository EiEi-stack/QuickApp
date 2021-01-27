package et.ad.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to? ",
            R.drawable.bg_main,
            "Argentina",
            "Australia",
            "America",
            "Austria",1
        )
        val que2 = Question(
            1,
            "What actor is the most rich? ",
            R.drawable.bg_main,
            "Sai Sai Kham Leng",
            "Aung Ye Lin",
            "Lu Min",
            "Pyay Ti OO",3
        )
        val que3 = Question(
            1,
            "What Language is the most difficult ",
            R.drawable.bg_main,
            "Java",
            "Android",
            "Kotlin",
            "PHP",2
        )
        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        return questionList
    }
}