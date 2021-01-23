package org.upgrad.upstac.auth.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.upgrad.upstac.exception.AppException;
import org.upgrad.upstac.users.User;
import org.upgrad.upstac.users.UserService;
import org.upgrad.upstac.users.models.AccountStatus;
import org.upgrad.upstac.users.roles.UserRole;


@Service
public class RegisterService {

    @Autowired
    private UserService userService;


    private static final Logger log = LoggerFactory.getLogger(RegisterService.class);


    public User addUser(RegisterRequest registerRequest) {


        User user  =  new User();
        user.setRoles(userService.getRoleFor(UserRole.USER));
        user.setStatus(AccountStatus.APPROVED);
        userService.toEncrypted(registerRequest.getPassword());

         if(userService.findByUserName(registerRequest.getUserName()) != null) {
            if (user.getUserName() != null) {
                System.out.println("User Already Exists");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
//userService.findByEmail
        if(userService.findByEmail(registerRequest.getUserName()) != null) {
            if (user.getEmail() != null) {
                System.out.println("Email Already Registered");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }

        //  userService.findByPhoneNumber
        if(userService.findByPhoneNumber(registerRequest.getUserName()) != null) {
            if (user.getPhoneNumber() != null) {
                System.out.println("Phone number Already Registered");
            }
        } else {
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }

        User newUser = new User();
        userService.saveInDatabase(newUser);






/*      User should be validated before registration.
                the username , email and phone number should be unique (i.e should throw AppException if the RegisterRequest has the same username or email or phone number)
                    hint:
                        userService.findByUserName
                        userService.findByEmail
                        userService.findByPhoneNumber

         A new User Object should be created with same details as registerRequest
                password should be encrypted with help of   userService.toEncrypted
                roles should be set with help of  userService.getRoleFor(UserRole.USER)
                status should be set to AccountStatus.APPROVED

        And finally
            Call userService.saveInDatabase to save the new user and return the saved user
*/

      // throw new AppException("Method Not Implemented");
        return newUser;
    }

    public User addDoctor(RegisterRequest registerRequest) {


/*      Doctor should be validated before registration.
                the username , email and phone number should be unique (i.e should throw AppException if the RegisterRequest has the same username or email or phone number)
                    hint:
                        userService.findByUserName
                        userService.findByEmail
                        userService.findByPhoneNumber

         A new User Object should be created with same details as registerRequest
                password should be encrypted with help of   userService.toEncrypted
                roles should be set with help of  userService.getRoleFor(UserRole.DOCTOR)
                status should be set to AccountStatus.INITIATED

        And finally
            Call userService.saveInDatabase to save the newly registered doctor and return the saved value
*/
//        throw new AppException("Method Not Implemented");
        User user  =  new User();
        user.setRoles(userService.getRoleFor(UserRole.DOCTOR));
        user.setStatus(AccountStatus.INITIATED);
        userService.toEncrypted(registerRequest.getPassword());
        if(userService.findByUserName(registerRequest.getUserName()) != null) {
            if (user.getUserName() != null) {
                System.out.println("DOCTOR Already Exists");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
//userService.findByEmail
        if(userService.findByEmail(registerRequest.getUserName()) != null) {
            if (user.getEmail() != null) {
                System.out.println("Email Already Registered");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }

        //  userService.findByPhoneNumber
        if(userService.findByPhoneNumber(registerRequest.getUserName()) != null) {
            if (user.getPhoneNumber() != null) {
                System.out.println("Phone number Already Registered");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }

        User newUser = new User();
        userService.saveInDatabase(newUser);
        return newUser;
    }


    public User addTester(RegisterRequest registerRequest) {


/*      Tester should be validated before registration.
                the username , email and phone number should be unique (i.e should throw AppException if the RegisterRequest has the same username or email or phone number)
                    hint:
                        userService.findByUserName
                        userService.findByEmail
                        userService.findByPhoneNumber

         A new User Object should be created with same details as registerRequest
                password should be encrypted with help of   userService.toEncrypted
                roles should be set with help of  userService.getRoleFor(UserRole.TESTER)
                status should be set to AccountStatus.INITIATED

        And finally
            Call userService.saveInDatabase to save newly registered tester and return the saved value
*/

        User user  =  new User();
        user.setRoles(userService.getRoleFor(UserRole.TESTER));
        user.setStatus(AccountStatus.INITIATED);
        userService.toEncrypted(registerRequest.getPassword());
        if(userService.findByUserName(registerRequest.getUserName()) != null) {
            if (user.getUserName() != null) {
                System.out.println("DOCTOR Already Exists");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }
//userService.findByEmail
        if(userService.findByEmail(registerRequest.getUserName()) != null) {
            if (user.getEmail() != null) {
                System.out.println("Email Already Registered");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }

        //  userService.findByPhoneNumber
        if(userService.findByPhoneNumber(registerRequest.getUserName()) != null) {
            if (user.getPhoneNumber() != null) {
                System.out.println("Phone number Already Registered");
            }
        } else{
            AppException exception = null;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage());
        }

        User newUser = new User();
        userService.saveInDatabase(newUser);
        return newUser;


//        throw new AppException("Method Not Implemented");
    }


}
