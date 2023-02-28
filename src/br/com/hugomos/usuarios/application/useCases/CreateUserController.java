package br.com.hugomos.usuarios.application.useCases;

import br.com.hugomos.usuarios.domain.User;
import br.com.hugomos.usuarios.domain.useCases.ICreateUserController;
import br.com.hugomos.usuarios.domain.useCases.ICreateUserUseCase;

public class CreateUserController implements ICreateUserController {
  private ICreateUserUseCase createUserUseCase;

  public CreateUserController(ICreateUserUseCase createUserUseCase) {
    this.createUserUseCase = createUserUseCase;
  }

  public void handle(User data) {
    this.createUserUseCase.execute(data);
  }
}
