package chapter_5_exercises;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;


public class UserServiceImplTest {

    UserDAO userDAO = mock(UserDAO.class);
    SecurityService securityService = mock(SecurityService.class);
    UserServiceImpl userService = new UserServiceImpl(userDAO,securityService);

}