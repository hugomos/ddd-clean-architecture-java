package br.com.hugomos.usuarios.infra;

import br.com.hugomos.usuarios.domain.repositories.IUserRepository;
import br.com.hugomos.usuarios.infra.database.inMemory.InMemoryUserRepository;

public class inputFactory {
  public static IUserRepository getUserRepository() {
    return new InMemoryUserRepository();
  }
}
