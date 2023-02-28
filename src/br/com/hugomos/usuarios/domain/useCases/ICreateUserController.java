package br.com.hugomos.usuarios.domain.useCases;

import br.com.hugomos.usuarios.domain.User;

public interface ICreateUserController {
  public ICreateUserUseCase createUserUseCase = null;

  public abstract void handle(User data);
}
