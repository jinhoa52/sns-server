package me.koobin.snsserver.service;

import me.koobin.snsserver.exception.InValidValueException;
import me.koobin.snsserver.model.User;
import me.koobin.snsserver.model.UserPasswordUpdateParam;
import me.koobin.snsserver.model.UserSignUpParam;
import me.koobin.snsserver.model.UserUpdateParam;
import me.koobin.snsserver.model.UsernameAndPw;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

  boolean signUp(UserSignUpParam userSignUpParam);

  boolean isUsernameDupe(String username);

  User getLoginUser(UsernameAndPw usernameAndPw);

  void updateUser(User currentUser, UserUpdateParam userUpdateParam, MultipartFile profile);

  void updateUserPassword(User currentUser, UserPasswordUpdateParam userPasswordUpdateParam)throws InValidValueException;

  void deleteUser(User currentUser, String currentPassword) throws InValidValueException;
}
