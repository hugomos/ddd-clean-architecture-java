package br.com.hugomos.usuarios.domain.useCases;

import br.com.hugomos.usuarios.domain.User;
import br.com.hugomos.usuarios.domain.repositories.IUserRepository;

public interface ICreateUserUseCase {
  IUserRepository userRepository = null;

  public abstract void execute(User data);
}
