package br.com.hugomos.usuarios.main;

import br.com.hugomos.usuarios.domain.User;
import br.com.hugomos.usuarios.infra.inputFactory;
import br.com.hugomos.usuarios.application.useCases.CreateUserController;
import br.com.hugomos.usuarios.application.useCases.CreateUserUseCase;
import br.com.hugomos.usuarios.domain.useCases.ICreateUserController;
import br.com.hugomos.usuarios.domain.useCases.ICreateUserUseCase;

public class App {
  public static void main(String[] args) {
    ICreateUserUseCase createUserUseCase = new CreateUserUseCase(inputFactory.getUserRepository());
    ICreateUserController createUserController = new CreateUserController(createUserUseCase);

    User data = new User("hugomos", "hugomos@fake.com");

    createUserController.handle(data);
  }
}
