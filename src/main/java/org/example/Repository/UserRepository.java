package org.example.Repository;

import org.example.Model.User;

import java.util.List;

public class UserRepository implements BaseRepository<User> {
    @Override
    public User add(User element) {
        return null;
    }

    @Override
    public User update(User element) {
        return null;
    }

    @Override
    public boolean delete(User element) {
        return false;
    }

    @Override
    public List<User> finAll() {
        return List.of();
    }

    @Override
    public User findById(int id) {
        return null;
    }

    public List<User> findByName(String name) {
        return null;
    }
}
