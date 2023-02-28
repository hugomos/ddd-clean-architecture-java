package br.com.hugomos.usuarios.infra.database.inMemory;

import java.util.ArrayList;
import java.util.List;

import br.com.hugomos.usuarios.domain.User;
import br.com.hugomos.usuarios.domain.repositories.IUserRepository;

public class InMemoryUserRepository implements IUserRepository {

  private List<User> users = new ArrayList<User>();

  @Override
  public List<User> findMany() {
    List<User> usersCopy = new ArrayList<User>(this.users);
    return usersCopy;
  }

  @Override
  public User findByUsername(String username) {
    for (User user : this.users) {
      if (user.getUsername() == username) {
        return user;
      }
    }

    return null;
  }

  @Override
  public void save(User data) {
    this.users.add(data);
  }

  @Override
  public void remove(String username) {
    for (User user : this.users) {
      if (user.getUsername() == username) {
        this.users.remove(user);
      }
    }
  }

}
