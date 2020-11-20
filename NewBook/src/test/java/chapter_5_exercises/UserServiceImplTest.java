package chapter_5_exercises;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import junitparams.Parameters;
import org.junit.Test;


public class UserServiceImplTest {

    String PASSWORD = "abc123";
    String MD5_PASSWORD = "a1b2c3";

    UserDAO userDAO = mock(UserDAO.class);
    SecurityService securityService = mock(SecurityService.class);
    User user = mock(User.class);
    UserServiceImpl userService;

    @Test
    public void userShouldGetNewPassword() throws Exception {
        when(user.getPassword()).thenReturn(PASSWORD);
        when(securityService.md5(user.getPassword())).thenReturn(MD5_PASSWORD);
        userService = new UserServiceImpl(userDAO,securityService);
        userService.assignPassword(user);
        verify(user).setPassword(MD5_PASSWORD);
        verify(userDAO).updateUser(user);
    }
}