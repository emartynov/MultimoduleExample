package cz.skywall.multimoduleexample.core.mapper

import org.junit.Test
import cz.skywall.multimoduleexample.database.UserDBJavaFixtures
import cz.skywall.multimoduleexample.database.UserDBKotlinFixtures

class UserMapperKtTest {
    @Test
    fun `Some test`() {
// java test fixture
        val user = UserDBJavaFixtures.defaultUser
// kotlin test fixture
        val kotlinUser = UserDBKotlinFixtures.defaultUser
    }
}