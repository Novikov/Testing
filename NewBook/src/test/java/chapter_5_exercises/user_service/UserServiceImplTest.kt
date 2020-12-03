package chapter_5_exercises.user_service

import org.junit.Test
import org.mockito.Mockito

class UserServiceImplTest {
    var PASSWORD = "abc123"
    var MD5_PASSWORD = "a1b2c3"
    var userDAO = Mockito.mock(UserDAO::class.java)
    var securityService = Mockito.mock(SecurityService::class.java)
    var user = Mockito.mock(User::class.java)
    var userService: UserServiceImpl? = null

    @Test
    @Throws(Exception::class)
    fun userShouldGetNewPassword() {
        Mockito.`when`(user.getPassword()).thenReturn(PASSWORD)
        Mockito.`when`(securityService.md5(user.getPassword())).thenReturn(MD5_PASSWORD)
        userService = UserServiceImpl(userDAO, securityService)
        userService!!.assignPassword(user)
        Mockito.verify(user).setPassword(MD5_PASSWORD)
        Mockito.verify(userDAO).updateUser(user)
    }
}