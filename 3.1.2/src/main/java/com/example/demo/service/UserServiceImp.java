package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImp implements UserService {

        private UserDAO userDAO;

        public UserServiceImp(UserDAO userDAO) {
                this.userDAO = userDAO;
        }


        @Override
        @Transactional
        public List<User> getUsersList() {
                return userDAO.getUsersList();
        }

        @Override
        @Transactional
        public void addUser(User user) {
                userDAO.addUser(user);
        }

        @Override
        @Transactional
        public User getUserById(int id) {
                return userDAO.getUserById(id);
        }

        @Override
        @Transactional
        public void updateUser(int id, User updateUser) {
                userDAO.updateUser(id, updateUser);
        }

        @Override
        @Transactional
        public void deleteUser(int id) {
                 userDAO.deleteUser(id);
        }
}
