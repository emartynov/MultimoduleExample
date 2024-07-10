package cz.skywall.multimoduleexample.database

object UserDBKotlinFixtures {
    val defaultUser = UserDB("Test Name")

    // This show error in Android Studio but compiles fine
    fun calculateSome(): Int {
        val cl = InternalClass()
        return cl.compute()
    }

    fun useInternal(): Int {
        return TEST_CONST
    }
}