package br.com.hugomos.usuarios.application.useCases;

import br.com.hugomos.usuarios.domain.User;
import br.com.hugomos.usuarios.domain.repositories.IUserRepository;
import br.com.hugomos.usuarios.domain.useCases.ICreateUserUseCase;

public class CreateUserUseCase implements ICreateUserUseCase {

  private IUserRepository userRepository;

  public CreateUserUseCase(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void execute(User data) {
    User userAlreadyExists = userRepository.findByUsername(data.getUsername());

    if (userAlreadyExists != null) {
      throw new RuntimeException("User already exists");
    }

    this.userRepository.save(data);
    System.out.println("User created");
  }

}
