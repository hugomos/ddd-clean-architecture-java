package br.com.hugomos.usuarios.domain.repositories;

import java.util.List;

import br.com.hugomos.usuarios.domain.User;

public interface IUserRepository {

  public abstract List<User> findMany();

  public abstract User findByUsername(String username);

  public abstract void save(User data);

  public abstract void remove(String username);
}
